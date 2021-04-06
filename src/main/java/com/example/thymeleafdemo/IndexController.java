package com.example.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

	@GetMapping("/")
	public String showIndex(Model model) {
		User user = new User();
		model.addAttribute("user", user);

		return "index";
	}

	@PostMapping("/send")
	public String submitForm(@ModelAttribute("user") User user) {
		System.out.println(user);
		return "user-display";
	}
}
