package com.example.exam.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.exam.dao.Operaciones;
import com.example.exam.entity.CantProductos;

@Component
public class CantProductosDaoImpl implements Operaciones<CantProductos>{
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

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
		String SQL = "select c.CategoryName as categoria,count(p.CategoryID) as cantidad from products p \r\n"
				+ "inner join categories c\r\n"
				+ "on  p.CategoryID =c.CategoryID\r\n"
				+ "group by p.CategoryID;";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL = "SELECT o.OrderID, o.ShipCountry FROM orders o JOIN customers c ON o.CustomerID = c.CustomerID limit 7;";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<Map<String, Object>> readAll3() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
