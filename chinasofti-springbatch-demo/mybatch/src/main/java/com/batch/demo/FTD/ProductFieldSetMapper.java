package com.batch.demo.FTD;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * 把读取到文件如何映射成为模型 注意read（"xxx"）是在lineTokenizer里面设置的
 * @author chen
 *
 */
public class ProductFieldSetMapper implements FieldSetMapper<Product>{

	@Override
	public Product mapFieldSet(FieldSet fieldSet) throws BindException {
		Product product = new Product();
		product.setId(fieldSet.readInt("id"));
		product.setName(fieldSet.readString("name"));
		product.setDescription(fieldSet.readString("description"));
		product.setQuantity(fieldSet.readInt("quantity"));
		return product;
	}

	
}
