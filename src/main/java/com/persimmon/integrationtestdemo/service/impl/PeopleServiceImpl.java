package com.persimmon.integrationtestdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.persimmon.integrationtestdemo.entity.People;
import com.persimmon.integrationtestdemo.service.PeopleService;
import com.persimmon.integrationtestdemo.mapper.PeopleMapper;
import org.springframework.stereotype.Service;

/**
* @author persimmon
* @description 针对表【people(集成测试表)】的数据库操作Service实现
* @createDate 2023-03-19 23:54:50
*/
@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People>
implements PeopleService {

}
