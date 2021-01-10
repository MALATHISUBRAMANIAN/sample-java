package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Palindrome;
import Service.PalindromeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/sample")
public class MainController {
	
	@Autowired
	PalindromeService service;
	
	@GetMapping("/getData")
	public List<Palindrome> getList() {
		System.out.println("java side called");
		List<Palindrome> resultList = service.getData();
		System.out.println(resultList);
		return resultList;
	}
	
	@GetMapping("/sample")
	public void show() {
		System.out.println("java");
	}

}
