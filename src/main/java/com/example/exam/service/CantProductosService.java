package com.example.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.example.exam.dao.Operaciones;
import com.example.exam.entity.CantProductos;
import com.example.exam.DaoImpl.CantProductosDaoImpl;

@Service
public class CantProductosService implements Operaciones<CantProductos>{
	
	
	@Autowired
	private CantProductosDaoImpl daoIMpl;

	@Override
	public int create(CantProductos t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(CantProductos t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CantProductos read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll2();
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return daoIMpl.readAll3();
	}
	
	
	
	

}
