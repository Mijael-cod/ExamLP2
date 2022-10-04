package com.example.exam.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exam.service.CantProductosService;
import com.example.exam.service.PaisService;

@RestController

@RequestMapping("/api/producto")
@CrossOrigin({"*"})
public class CantProductosController {
	
	@Autowired
	private CantProductosService cantproductosService;
	@Autowired
	private PaisService paisService;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){		
		return cantproductosService.readAll();
	}
	
	@GetMapping("/all2")
	public List<Map<String, Object>> readAll2(){		
		return paisService.readAll2();
	}
	

}
