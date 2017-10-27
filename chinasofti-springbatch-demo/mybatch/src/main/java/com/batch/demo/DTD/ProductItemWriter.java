package com.batch.demo.DTD;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * 把处理后的数据导入数据库
 * @author chen
 *
 */
@Component("DTD_productWriter")
public class ProductItemWriter implements ItemWriter<Product>{
    //  private static final String GET_PRODUCT = "select * from PRODUCT where id = ?";
	private static final String INSERT_PRODUCT = "insert into PRODUCT (id,name,description,quantity) values (?,?,?,?)";
	// private static final String UPDATE_PRODUCT = "update PRODUCT set name = ?, description = ?,quantity = ? where id = ?";
	//装载的是新库的jdbctemplate
	@Autowired
	private JdbcTemplate newjdbcTemplate;
	@Override
	public void write(List<? extends Product> products) throws Exception {
			for (Product product : products) {
				//  System.out.println("-----欲写的数据---"+product.toString());
				//把处理后的数据插入新库 --重复数据无法插入
				newjdbcTemplate.update(INSERT_PRODUCT,product.getId(),product.getName(),product.getDescription(),product.getQuantity());
			}
	}
	
	
}
