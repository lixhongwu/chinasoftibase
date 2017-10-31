package com.batch.demo.FTF;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * 把读取的文件如何映射为模型 注意("XXXX")是在lineTokenizer里面设置的
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
