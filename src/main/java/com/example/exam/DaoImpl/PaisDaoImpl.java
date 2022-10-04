package com.example.exam.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.exam.dao.Operaciones;
import com.example.exam.entity.Pais;

@Component
public class PaisDaoImpl implements Operaciones<Pais>{
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public int create(Pais t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Pais t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pais read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "SELECT o.OrderID, o.ShipCountry FROM orders o JOIN customers c ON o.CustomerID = c.CustomerID limit 7;";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
