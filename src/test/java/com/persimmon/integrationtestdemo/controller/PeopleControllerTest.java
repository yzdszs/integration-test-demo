package com.persimmon.integrationtestdemo.controller;

import com.persimmon.integrationtestdemo.IntegrationTestDemoApplicationTests;
import com.persimmon.integrationtestdemo.entity.People;
import com.persimmon.integrationtestdemo.service.PeopleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.data.redis.core.RedisTemplate;

class PeopleControllerTest extends IntegrationTestDemoApplicationTests {

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void addTest() {

        People entity = new People();
        entity.setId(19);
        entity.setAge(11);
        entity.setSex(1);
        entity.setName("66");
        this.restTemplate.postForObject("/people/add", entity, Object.class);

        Assertions.assertNotNull(peopleService.getById(19));
        Assertions.assertEquals("testValue", redisTemplate.opsForValue().get("testKey"));
    }
}