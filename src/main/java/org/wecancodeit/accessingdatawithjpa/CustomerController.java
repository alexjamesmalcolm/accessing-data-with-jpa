package org.wecancodeit.accessingdatawithjpa;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	@Resource
	CustomerRepository repository;
	
	@RequestMapping("/")
	public String getCustomers(Model model) {
		model.addAttribute("customers", repository.findAll());
		return "index";
	}
}
