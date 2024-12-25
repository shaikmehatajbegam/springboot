 package com.sathya.springmvc.product.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.springmvc.product.entity.ProductEntity;
import com.sathya.springmvc.product.model.ProductModel;
import com.sathya.springmvc.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	
	ProductRepository productRepository;
	public void saveProductDetails(ProductModel productModel) {
		double stockvalue=productModel.getPrice()*productModel.getQuantity();
		double discountprice=productModel.getPrice()*productModel.getDiscountrate()/100;
		double offerprice=productModel.getPrice()-discountprice;
        double taxprice=productModel.getPrice();
        double finalprice=offerprice + taxprice;
       
        ProductEntity productEntity=new ProductEntity();
        productEntity.setName(productModel.getName());
        productEntity.setBrand(productModel.getBrand());
        productEntity.setMadein(productModel.getMadein());
        productEntity.setPrice(productModel.getPrice());
        productEntity.setQuantity(productModel.getQuantity());
        productEntity.setDiscountrate(productModel.getDiscountrate());
        productEntity.setDiscountprice(discountprice);
        productEntity.setStockvalue(stockvalue);
        productEntity.setOfferprice(offerprice);
        productEntity.setTaxprice(taxprice);
        productEntity.setFinalprice(finalprice);
        
        productRepository.save(productEntity);
	}
	public List<ProductEntity>getAllProducts(){
		List<ProductEntity>products=productRepository.findAll();
		return products;
		
	}
	public ProductEntity searchbyid(long id) {
		Optional<ProductEntity>optionalData=productRepository.findById(id);
		if(optionalData.isPresent()) 
		{
			ProductEntity product=optionalData.get();
			return product;
		}
		else {
			return null;
			
		}
	}
	public void deleteproductById(Long id) {
		productRepository.deleteById(id);
		
	}
	
	public ProductModel  editProductById(Long id) {
		Optional<ProductEntity> optionalData= productRepository.findById(id);
		if(optionalData.isPresent())
		{
			ProductEntity product = optionalData.get();
			
			ProductModel productModel = new ProductModel();
			productModel.setName(product.getName());
			productModel.setBrand(product.getBrand());
			productModel.setMadein(product.getMadein());
			productModel.setPrice(product.getPrice());
			productModel.setQuantity(product.getQuantity());
			productModel.setDiscountrate(product.getDiscountrate());
			return productModel;
		}
		else {
			return null;
		}
	}
	
		
	
	public void updateProductById(Long id, ProductModel productModel) {
		Optional<ProductEntity> optionalData= productRepository.findById(id);
		if(optionalData.isPresent())
		{
			ProductEntity entity= new ProductEntity();
			entity.setName(productModel.getName());
			entity.setBrand(productModel.getBrand());
			entity.setMadein(productModel.getMadein());
			entity.setPrice(productModel.getPrice());
			entity.setQuantity(productModel.getQuantity());
			entity.setDiscountrate(productModel.getDiscountrate());
			double stockvalue=productModel.getPrice()*productModel.getQuantity();
			double discountprice=productModel.getPrice()*productModel.getDiscountrate()/100;
			double offerprice=productModel.getPrice()-discountprice;
	        double taxprice=productModel.getPrice();
	        double finalprice=offerprice + taxprice;
	       entity.setDiscountprice(discountprice);
	       entity.setOfferprice(offerprice);
	       entity.setFinalprice(finalprice);
	       entity.setStockvalue(stockvalue);
	       productRepository.save(entity);
		}
		// TODO Auto-generated method stub
		
	}
}
		
		
	
	
	
		


		
	
        
        
     
        
        
        
        
       
