package com.rudra.aks.dao;

import java.util.List;

import com.rudra.aks.bo.UserBO;

public interface SecurityDAO {
	long	saveUser(UserBO userBO);
	UserBO	getUserById(long userId);
	int saveCustomer();
	long 	updateUser(UserBO userBO);
	List<UserBO>	listUser(String criteria);
	long saveUserWithTemplate(UserBO user);

}
