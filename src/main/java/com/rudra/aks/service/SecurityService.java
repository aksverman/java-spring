package com.rudra.aks.service;

import java.util.List;

import com.rudra.aks.bo.UserBO;

public interface SecurityService {
	long	saveUser(UserBO userBO);
	UserBO getUserById(long userId);
	long 	updateUser(UserBO userBO);
	List<UserBO>	listUser(String criteria);
	long saveUserWithTemplate(UserBO user);
}
