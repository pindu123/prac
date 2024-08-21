package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracController {
@GetMapping("/display")
public String Display()
{
	return "Hello Docker";
}
}
