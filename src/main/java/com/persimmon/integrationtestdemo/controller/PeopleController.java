package com.persimmon.integrationtestdemo.controller;

import com.persimmon.integrationtestdemo.entity.People;
import com.persimmon.integrationtestdemo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author persimmon
 */
@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    private PeopleService peopleService;

    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/add")
    public boolean addPeople(@RequestBody People req) {
        redisTemplate.opsForValue().set("testKey", "testValue");
        return peopleService.save(req);
    }

    @PostMapping("/update")
    public boolean updatePeople(@RequestBody People req) {
        return peopleService.updateById(req);
    }

    @RequestMapping("/get")
    public People getPeople(@RequestParam int id) {
        return peopleService.getById(id);
    }

    @RequestMapping("/list")
    public List<People> listPeople() {
        return peopleService.list();
    }

    @PostMapping("/delete")
    public boolean deletePeople(@RequestParam int id) {
        return peopleService.removeById(id);
    }
}
