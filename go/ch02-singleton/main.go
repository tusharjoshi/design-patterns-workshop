package main

import (
	"fmt"
	"singleton/cache"
	"sync"

	"github.com/rs/zerolog/log"
)

func process(index int) {
	cache := cache.GetInstance[string]()
	cache.Set("one", fmt.Sprintf("one:%d", index))
	cache.Set("two", fmt.Sprintf("two:%d", index))

	value, exist := cache.Get("one")
	if exist {
		log.Info().Msg(fmt.Sprintf("Process: %d, Value: %s", index, value))
	}

	value2, exist := cache.Get("two")
	if exist {
		log.Info().Msg(fmt.Sprintf("Process: %d, Value: %s", index, value2))
	}
}

func main() {
	waitGroup := sync.WaitGroup{}
	for i := 0; i < 5; i++ {
		waitGroup.Add(1)
		go func() {
			defer waitGroup.Done()
			process(i)
		}()
	}
	waitGroup.Wait()
}
