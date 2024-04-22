package cache

import (
	"fmt"
	"sync"

	"github.com/rs/zerolog/log"
)

// Cache is reference to a cache instance.
// A Cache is safe for concurrent use by multiple goroutines.
type Cache[T any] interface {
	// Get returns value stored for key and exists=true.
	//
	// When value is not found exists=false is returned.
	Get(key string) (value T, exists bool)

	// Set stores the value for given key
	Set(key string, value T)
}

type cache[T any] struct {
	mutex sync.RWMutex
	items map[string]interface{}
}

var (
	instance Cache[any]
	once     sync.Once
)

func createCacheInstance[T any]() {
	instance = &cache[any]{
		items: make(map[string]interface{}),
	}
	log.Info().Msg(fmt.Sprintf("Cache instance created for type %T", *new(T)))
}

// GetInstance returns singleton instance of Cache
func GetInstance[T any]() Cache[any] {
	once.Do(createCacheInstance[T])
	return instance
}

func (c *cache[T]) Set(key string, value T) {
	c.mutex.Lock()
	defer c.mutex.Unlock()
	c.items[key] = value
}

func (c *cache[T]) Get(key string) (value T, exists bool) {
	c.mutex.RLock()
	defer c.mutex.RUnlock()
	rawValue, exists := c.items[key]
	if exists {
		value = rawValue.(T)
	}
	return value, exists
}
