package cache

import (
	"fmt"
	"sync"

	"github.com/rs/zerolog/log"
)

type Cache[T any] struct {
	mu    sync.RWMutex
	items map[string]interface{}
}

var (
	instance *Cache[any]
	once     sync.Once
)

func GetInstance[T any]() *Cache[any] {
	once.Do(func() {
		instance = &Cache[any]{
			items: make(map[string]interface{}),
		}
		log.Info().Msg(fmt.Sprintf("Cache instance created for type %T\n", *new(T)))
	})
	return instance
}

func (c *Cache[T]) Set(key string, value T) {
	c.mu.Lock()
	defer c.mu.Unlock()
	c.items[key] = value
}

func (c *Cache[T]) Get(key string) (T, bool) {
	c.mu.RLock()
	defer c.mu.RUnlock()
	val, exists := c.items[key]
	return val.(T), exists
}
