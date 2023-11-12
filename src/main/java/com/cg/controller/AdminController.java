package com.cg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Admin;
import com.cg.entity.Customer;
import com.cg.service.IAdminService;

@RestController
public class AdminController {
	
	@Autowired
	IAdminService adminservice;
	
	@PostMapping("/addadmin")
	public  String addAdmin(@Valid @RequestBody Admin admin)
	{
		return adminservice.addAdmin(admin);
	}
	

}
