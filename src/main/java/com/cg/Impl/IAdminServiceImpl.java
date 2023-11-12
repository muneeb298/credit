package com.cg.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Admin;
import com.cg.repository.IAdminRepository;
import com.cg.service.IAdminService;

@Service
public class IAdminServiceImpl implements IAdminService {

	@Autowired
	IAdminRepository adminrepository;
	
	@Override
	public String addAdmin(Admin admin) {
		
		String p = "^(?=.*[0-9])(?=.*[!@#$%^&*])(?=.*[A-Z])(?=.*[a-z]).{8,}$";
		
		if(admin.getUser().getPassword().matches(p)) {
			
			adminrepository.save(admin);
			
			return "admin added sucessfully";
		}
		else {
			
			return "Password not according to rules";
		}	
		
	}

}
