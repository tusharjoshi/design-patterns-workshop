package cache

import (
	"fmt"
	"sync"

	"github.com/rs/zerolog/log"
)

type Cache[T any] struct {
	mutex sync.RWMutex
	items map[string]interface{}
}

var (
	instance *Cache[any]
	once     sync.Once
)

func createCacheInstance[T any]() {
	instance = &Cache[any]{
		items: make(map[string]interface{}),
	}
	log.Info().Msg(fmt.Sprintf("Cache instance created for type %T", *new(T)))
}

func GetInstance[T any]() *Cache[any] {
	once.Do(createCacheInstance[T])
	return instance
}

func (c *Cache[T]) Set(key string, value T) {
	c.mutex.Lock()
	defer c.mutex.Unlock()
	c.items[key] = value
}

func (c *Cache[T]) Get(key string) (T, bool) {
	c.mutex.RLock()
	defer c.mutex.RUnlock()
	value, exists := c.items[key]
	return value.(T), exists
}
