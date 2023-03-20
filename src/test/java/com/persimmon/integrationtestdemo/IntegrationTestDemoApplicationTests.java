package com.persimmon.integrationtestdemo;

import com.persimmon.integrationtestdemo.configure.TestRedisConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

//指定@SpringBootTest的Web Environment为RANDOM_PORT
//此时，将会加载 Application Context，并启动 server，server 侦听在随机端口上。在测试
// 类中通过 @LocalServerPort 获取该端口值。
//@TestPropertySource(value = {"classpath:application-test.properties"})
@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = TestRedisConfiguration.class)
public class IntegrationTestDemoApplicationTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
    }

    @Test
    void listPeoPleTest() {
        List object = this.restTemplate.getForObject("/people/list", List.class);
        System.out.println(object.toString());
    }

}
