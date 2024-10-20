package com.nt.service;

import com.nt.entity.Employye;


public interface IEmployyeMgmtService {

	
	public Iterable<Employye> showAllEmployees();
	
	public String registerEmployye(Employye emp);
	
	public Employye getEmployyebyId(int eno);
	
	public String UpdateEmployye(Employye emp);
	
	public String delectEmployyeById(int eno);
		
		
	}

