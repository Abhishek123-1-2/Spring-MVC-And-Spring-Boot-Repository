package in.mindcraft;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	private List<Product> pro = new ArrayList<Product>();

	public MyController() {
		pro.add(new Product(101,"marker",80));
		pro.add(new Product(102,"Water Bottle",150));
		pro.add(new Product(103,"Bag",250));
		pro.add(new Product(104,"Pen",60));
	}
	    

	  @RequestMapping(value="products",method=RequestMethod.GET) public
	  List<Product> getProducts(){ System.out.println("Get All Products"); return
	  pro; }
	 
	/*
	 * @RequestMapping(value="products/{id}",method=RequestMethod.GET) public
	 * Product getProduct(@PathVariable int id) { for(Product p:pro) {
	 * if(p.getPid()==id) { return p; }
	 * 
	 * } return null;
	 * 
	 * }
	 */
	    @RequestMapping(value="products/{make}",method=RequestMethod.GET)
	    public Product getProduct(@PathVariable String make) {
			for(Product p:pro) {
				if(p.getMake()==make) {
					return p;
				}
			}
			return null;
	    	
	    }
	    @RequestMapping(value="products",method=RequestMethod.POST) public
	    List<Product> addProducts(@RequestBody Product p){ 
	    	pro.add(p);
	    	return pro;
	    	 }
	    
	    @RequestMapping(value="products/{id}",method=RequestMethod.PUT) 
	    public
	    List<Product> updateProducts(@PathVariable int id,@RequestBody Product p){ 
	    	for(Product a:pro) {
	    		if(a.getPid()==id) {
	    			String make = a.setMake("Pencil");
	    			double cost = a.setCost(80000);
	    		}
	    	}
	    	return pro;
	    	 }
				
				  
	    @RequestMapping(value="products/{id}",method=RequestMethod.DELETE)
	    public
		List<Product> removeProducts(@PathVariable int id){ 
	    	for(int i=0;i<pro.size();i++) {
	    		if(pro.get(i).getPid()==id) {
	    			pro.remove(i);
	    		}
	    		
	    	}
			return pro;
	    			
	    }
}
