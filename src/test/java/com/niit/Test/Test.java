package com.niit.Test;


//import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Model.User;
import com.niit.Model.Whishlist;

import com.niit.Dao.WishlistDAO;
import com.niit.Dao.ProductDAO;
import com.niit.Dao.RoleDAO;
import com.niit.Dao.ShippingaddressDAO;
import com.niit.Model.Product;
import com.niit.Model.Role;
import com.niit.Model.Shippingaddress;
import com.niit.Model.Supplier;
import com.niit.Dao.BillingaddressDAO;
import com.niit.Dao.CartDAO;
import com.niit.Dao.CategoryDAO;
import com.niit.Model.Billingaddress;
import com.niit.Model.Cart;
import com.niit.Model.Category;
import com.niit.Dao.SupplierDAO;
/*import com.niit.Dao.RoleDao;



import com.niit.Model.Role;

*/
import com.niit.Dao.UserDAO;


public class Test {

	public static void main (String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		UserDAO userDao = (UserDAO) context.getBean("UserDAO");
		ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
		CartDAO cartDAO = (CartDAO) context.getBean("CartDAO");
		RoleDAO roleDAO = (RoleDAO) context.getBean("RoleDAO");
		BillingaddressDAO billingaddressDAO = (BillingaddressDAO) context.getBean("BillingaddressDAO");
		ShippingaddressDAO shippingaddressDAO = (ShippingaddressDAO) context.getBean("ShippingaddressDAO");
		
		WishlistDAO wishlistDAO = (WishlistDAO) context.getBean("WishlistDAO");
		
		
		
		
		
		
		User user = (User) context.getBean("user");
		Product product = (Product) context.getBean("product");
		Category category = (Category) context.getBean("category");
		Role role = (Role) context.getBean("role");
		Cart cart = (Cart) context.getBean("cart");
		Billingaddress billingaddress = (Billingaddress) context.getBean("billingaddress");
		Shippingaddress shippingaddress = (Shippingaddress) context.getBean("shippingaddress");
		Supplier supplier = (Supplier) context.getBean("supplier");
		Whishlist whishlist = (Whishlist) context.getBean("whishlist");
		
		category.setCategoryName("Laptops");
		
		categoryDAO.saveOrUpdate(category);
		
		cart.setProductName("dfhjj");
		cartDAO.saveOrUpdate(cart);
		
		user.setUserName("skfr");
		user.setUserName("sfdj");
		user.setEmailId("jhvd@gmail.com");
		user.setPassword("jfkd");
		
		user.setContactNumber(98765);
		user.setAddress("s12,sejkajdh");
		user.setZipcode(7542);
		userDao.saveOrUpdate(user);
		
		product.setProductName("fdknmfg");
		productDAO.saveOrUpdate(product);
		
		shippingaddress.setAddress("fdgfs");
		shippingaddress.setUserName("jkfgjd");
		shippingaddressDAO.saveOrUpdate(shippingaddress);
		
		role.setUserName("kjgdffd");
		role.setEmailId("hgfshdghj");
		role.setContactNumber(6567);
		
		user.setRole(role);
		role.setUser(user);
		
		
		
		roleDAO.saveOrUpdate(role);
		
		
		whishlist.setProductName("dhjf");
		whishlist.setPrice(87);
		wishlistDAO.saveOrUpdate(whishlist);
		
		billingaddress.setAddress("hfdjdufuinv");
		billingaddress.setContactNumber(897465);
		billingaddressDAO.saveOrUpdate(billingaddress);
		
		supplier.setSupplierName("hddsjk");
		supplier.setContactNumber(87968764);
		supplierDAO.saveOrUpdate(supplier);
		
		
}
}