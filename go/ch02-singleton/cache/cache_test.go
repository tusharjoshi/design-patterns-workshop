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
	value, exist := cache.Get("one")
	if !exist {
		t.Fatal("Value should exist.")
	}
	if value != "one" {
		t.Fatal("Value should be one.")
	}
}

func TestGetNoValue(t *testing.T) {
	cache := GetInstance[string]()
	if _, exist := cache.Get("two"); exist {
		t.Fatal("Value should not exist.")
	}
}
