 package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Employye;
import com.nt.service.IEmployyeMgmtService;

@Controller
public class EmoloyeeOperationsController {
	@Autowired
	private IEmployyeMgmtService empservice;
	
	@GetMapping("/")
	 public String HomePage() {
		 
		 //LVN
		 return "welcome";
	 }
	@GetMapping("/report")
	public String showEmployeeReportData(Map<String,Object>map) {
		System.out.println("EmoloyeeOperationsController.showEmployeeReportData()");
		Iterable<Employye> empsList=empservice.showAllEmployees();
		
		map.put("empData", empsList);
		
		return "show_report";
	}
	
	@GetMapping("/register")// to lanch add employye form
	public String ShowRegisterEmployeeFormPage(@ModelAttribute("emp") Employye emp) {
		System.out.println("EmoloyeeOperationsController.ShowRegisterEmployeeFormPage()");
		return "Employye_register_Form";
	}
	@PostMapping("/register" )
	public String registerEmployye(RedirectAttributes attr,@ModelAttribute("emp")Employye emp) {
		System.out.println("EmoloyeeOperationsController.registerEmployye()");
		String msg=empservice.registerEmployye(emp);
		Iterable<Employye>empsList=empservice.showAllEmployees();
		
		attr.addFlashAttribute("resultmsg",msg);
		
	return "redirect:report";	
	}
	@GetMapping("/edit")
	public String showEditEmployyrFormPage(@RequestParam("no")int no,@ModelAttribute("emp")Employye emp) {
		
		Employye emp1=empservice.getEmployyebyId(no);
		BeanUtils.copyProperties(emp1, emp);
		
		return "Update_employye";
		
	}
	@PostMapping("edit")
	public String editEmployye(RedirectAttributes attr,@ModelAttribute("emp") Employye emp) {
		String msg=empservice.UpdateEmployye(emp);
		
		attr.addFlashAttribute("resultMsg",msg);
		
		return "redirect:report";
	}
	@GetMapping("/delect")
	public String delectEmployye(RedirectAttributes attrs,@RequestParam int no) {
		 
		String msg=empservice.delectEmployyeById(no);
		
		attrs.addFlashAttribute("resultMsg", msg);
		
		return "redirect:report";
	}
}












