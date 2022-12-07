package com.demo.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.demo.beans.JdbcBean;

@Component
public class MapperClass implements RowMapper<JdbcBean> {

	@Override
	public JdbcBean mapRow(ResultSet rs, int rowNum) throws SQLException {

		// select 결과를 JdbcBean 객체에 담을 수 있도록 설정
		JdbcBean bean = new JdbcBean();
		bean.setInt_data(rs.getInt("int_data"));
		bean.setStr_data(rs.getString("str_data"));
		
		return bean;

	}

}
