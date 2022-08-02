package com.wisely.ch7_7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch77Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch77Application.class, args);
	}

	@RequestMapping(value={"","/index"})
	public String index(Model model){
		model.addAttribute("msg","谢谢阅读");
		return "index";
	}

	@RequestMapping(value="/search",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Person search(String name){
		return new Person(name,32,"hefei");
	}

}
