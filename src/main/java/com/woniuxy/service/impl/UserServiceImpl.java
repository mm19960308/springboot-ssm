package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.UserMapper;
import com.woniuxy.domain.User;
import com.woniuxy.service.IUserService;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper mapper;
	
	@Override
	public void save(User user) {
		mapper.insertSelective(user);
	}

	@Override
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update(User user) {
		mapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public User find(User user) {
		return mapper.selectByPrimaryKey(user.getId());
	}

	@Override
	public List<User> find() {
		return mapper.selectByExample(null);
	}

}
