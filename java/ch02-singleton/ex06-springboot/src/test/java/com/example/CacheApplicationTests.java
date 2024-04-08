package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class CacheApplicationTests {

	@Autowired
	Cache cache;

	@Autowired
	AcceptList acceptList;

	@Test
	void contextLoads() {
	}

	@Test
	void cache_is_available() {
		assertNotNull(cache);
	}

	@Test
	void check_cache_objects_same() {
		assertEquals(cache, acceptList.getCache());
	}

}
