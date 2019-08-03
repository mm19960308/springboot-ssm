package com.woniuxy.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniuxy.dao.UserMapper;
import com.woniuxy.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
	@Autowired
	private UserMapper mapper;
	
	@Test
	public void test() throws Exception {
		System.out.println(mapper.selectByPrimaryKey(1).getName());
	}
	
}
