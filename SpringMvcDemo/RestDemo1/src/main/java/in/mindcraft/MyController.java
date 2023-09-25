package in.mindcraft;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
List<Product> pro = new ArrayList<Product>();
public MyController() {
	pro.add( new Product(101,"Laptop",56000));
	pro.add(new Product(102,"Phone",32000));
	pro.add(new Product(103,"Book",6000));
	pro.add(new Product(104,"Pencil",6));
}

@RequestMapping(value="products",method=RequestMethod.GET) public
List<Product> getProducts(){ System.out.println("Get All Products"); return
pro; }

@RequestMapping(value="products/{id}",method=RequestMethod.GET)
public Product getProducts(@PathVariable int id){
	for(Product p:pro) {
		if(p.getPid()==id) {
			return  p;
		}
		
	}
	return null;
}
@RequestMapping(value="products",method=RequestMethod.POST)
public Product addProduct(@RequestBody Product p) {
	pro.add(p);
	return p;
	
}
@RequestMapping(value="products/{id}",method=RequestMethod.PUT) 
public
List<Product> updateProducts(@PathVariable int id,@RequestBody Product p){ 
	for(Product a:pro) {
		if(a.getPid()==id) {
			String make = a.setMake("ball");
			double cost = a.setCost(80000);
		}
	}
	return pro;
	 }
		
}
