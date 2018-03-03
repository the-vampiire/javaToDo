package com.example.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.text.View;

@SpringBootApplication
@Controller
public class TodoApplication {
	@RequestMapping("/")
	public static void HomeView() { // TODO: what is the return type for a rendered html doc?
		// TODO: server side rendering / passing model into html
	}
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}
}
