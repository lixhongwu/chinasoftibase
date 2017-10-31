package com.batch.demo.DTF;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

/**
 * 把读取的数据进行处理
 * @author chen
 *
 */
@Component("DTF_productProcessor")
public class ProductItemProcessor implements ItemProcessor<Product,Product>{

	@Override
	public Product process(Product product) throws Exception {
		product.setId(product.getId() + 1);
		product.setName(product.getName() + "king");
		System.out.println("===处理完成::" + product.toString());
		return product;
	}

}
