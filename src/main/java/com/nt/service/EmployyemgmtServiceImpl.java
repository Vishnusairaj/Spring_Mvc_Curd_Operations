package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employye;
import com.nt.repository.IEmployyeRepository;

@Service("empService")
public class EmployyemgmtServiceImpl implements IEmployyeMgmtService {
	@Autowired
	private IEmployyeRepository empRepo;

	@Override   
	public Iterable<Employye> showAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}
	
	
	@Override
	public String registerEmployye(Employye emp) {
		 int idVal=empRepo.save(emp).getEmpno();
		return "Employee is saved with id value ::"+idVal;
	}
	@Override
	public Employye getEmployyebyId(int eno) {
		Employye emp=empRepo.findById(eno).orElseThrow(()->new IllegalArgumentException());
		return emp;
	}
	@Override
	public String UpdateEmployye(Employye emp) {
	
		return "Employye is Updated with having id Value::"+empRepo.save(emp).getEmpno();
	}
	@Override
	public String delectEmployyeById(int eno) {
		 empRepo.deleteById(eno);
		return eno+"Employye id Employye is delected";
	}
}
