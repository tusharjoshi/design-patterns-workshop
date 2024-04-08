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
	wg := sync.WaitGroup{}
	for i := 0; i < 5; i++ {
		wg.Add(1)
		go func() {
			defer wg.Done()
			process(i)
		}()
	}
	wg.Wait()
}
