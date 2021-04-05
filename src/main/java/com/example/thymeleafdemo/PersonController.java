package com.example.thymeleafdemo;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

	@GetMapping("/test")
	String getPeople(Model model) {
		model.addAttribute("something", "Person");
		model.addAttribute("people",
				Arrays.asList(new Person("Adib", 22), new Person("Nawfal", 21), new Person("Yazid", 23)));
		return "people";
	}

}
