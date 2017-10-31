package com.batch.demo.FTF;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 * 把读取的文件进行处理
 * 
 * @author chen
 *
 */
@Component("FTF_productProcessor")
public class ProductItemProcessor implements ItemProcessor<Product, Product> {

	@Override
	public Product process(Product product) throws Exception {
		product.setId(product.getId() + 1);
		System.out.println("=====处理完成::" + product.toString());
		return product;
	}

}
