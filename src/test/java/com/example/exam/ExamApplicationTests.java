package com.example.exam;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.exam.service.PaisService;

@SpringBootTest
class ExamApplicationTests {
	@Autowired
	private PaisService paisService;
	@Test
	void contextLoads() {
		System.out.println(paisService.readAll());
	}

}
