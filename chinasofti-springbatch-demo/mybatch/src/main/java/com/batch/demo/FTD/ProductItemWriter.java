package com.batch.demo.FTD;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * 把处理后的数据写入数据库
 * @author chen
 *
 */
@Component("FTD_productWriter")
public class ProductItemWriter implements ItemWriter<Product>{
	//  private static final String GET_PRODUCT = "select * from PRODUCT where id = ?";
	private static final String INSERT_PRODUCT = "insert into PRODUCT (id,name,description,quantity) values (?,?,?,?)";
    // private static final String UPDATE_PRODUCT = "update PRODUCT set name = ?, description = ?,quantity = ? where id = ?";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void write(List<? extends Product> products) throws Exception {
		for (Product product : products) {
			jdbcTemplate.update(INSERT_PRODUCT, product.getId(), product.getName(), product.getDescription(), product.getQuantity());
		}
	}
	
}
