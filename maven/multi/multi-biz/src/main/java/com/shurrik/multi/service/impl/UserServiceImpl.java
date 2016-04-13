
package com.shurrik.multi.service.impl;
import com.shurrik.multi.model.User;
import com.shurrik.multi.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("unchecked")
@Service("UserServiceImpl")

public class UserServiceImpl implements IUserService {
	public List<User> findAll(){
		List<User> list = new ArrayList();
		User user1 = new User();
		user1.setUserName("zhangsan");
		User user2 = new User();
		user2.setUserName("lisi");
		list.add(user1);
		list.add(user2);
		return list;
	}

}
