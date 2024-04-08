package cache

import "testing"

func TestGetInstance(t *testing.T) {
	cache1 := GetInstance[string]()
	cache2 := GetInstance[string]()

	if cache1 != cache2 {
		t.Fatal("Should return same instance.")
	}
}

func TestGetSet(t *testing.T) {
	cache := GetInstance[string]()
	cache.Set("one", "one")
	if _, exist := cache.Get("one"); !exist {
		t.Fatal("Value should exist.")
	}
}
