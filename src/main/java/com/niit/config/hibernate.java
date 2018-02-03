package com.niit.config;

import com.niit.Model.Category;
import com.niit.Model.Product;
/*import com.niit.Model.Role;*/
import com.niit.Model.User;

import java.util.Properties;
//import java.util.function.Supplier;
import com.niit.Model.*;

import javax.sql.DataSource;

/*import com.niit.Dao.RoleDao;

import com.niit.Dao.UserDao;
import com.niit.DaoImpl.UserDAOImpl;
*/
import com.niit.Dao.SupplierDAO;
import com.niit.Dao.UserDAO;
import com.niit.Dao.BillingaddressDAO;
import com.niit.Dao.CartDAO;
import com.niit.Dao.CartDAOImpl;
import com.niit.Dao.CategoryDAO;
import com.niit.Dao.ProductDAO;
import com.niit.Dao.RoleDAO;
import com.niit.Dao.ShippingaddressDAO;

import com.niit.Dao.WishlistDAO;
import com.niit.DaoImpl.BillingaddressDAOImpl;
import com.niit.DaoImpl.CategoryDAOImpl;
//import com.niit.DaoImpl.RoleDAOImpl;
import com.niit.DaoImpl.SupplierDAOImpl;

import com.niit.DaoImpl.ProductDAOImpl;
import com.niit.DaoImpl.RoleDAOImpl;
import com.niit.DaoImpl.ShippingaddressDAOImpl;
import com.niit.DaoImpl.UserDAOImpl;
import com.niit.DaoImpl.WishlistDAOImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement
public class hibernate {

	@Bean(name = "dataSource")
	public DataSource getH2DataSource() {	

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
			
		dataSource.setUrl("jdbc:h2:tcp://localhost/~/Ecom");

		dataSource.setDriverClassName("org.h2.Driver");

		dataSource.setUsername("sa");
		dataSource.setPassword("");
		System.out.println("h2 initiated");
		
		
		return dataSource;
	}
	
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		properties.put("hibernate.format_sql", "true");
		return properties;
	}
	
	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource) {

		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		sessionBuilder.addProperties(getHibernateProperties());
		
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		sessionBuilder.addAnnotatedClass(Billingaddress.class);
		sessionBuilder.addAnnotatedClass(Shippingaddress.class);
		
		sessionBuilder.addAnnotatedClass(Whishlist.class);
		
		sessionBuilder.addAnnotatedClass(Role.class);
		return sessionBuilder.buildSessionFactory();
	}
	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);

		return transactionManager;
	}
	@Autowired(required = true)
	@Bean(name = "UserDAO")
	public UserDAO getUserDAO(SessionFactory sessionFactory) {
		return new UserDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "ProductDAO")
	public ProductDAO getProductDAO(SessionFactory sessionFactory) {
		return new ProductDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "CategoryDAO")
	public CategoryDAO getCategoryDAO(SessionFactory sessionFactory) {
		return new CategoryDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "RoleDAO")
	public RoleDAO getRoleDAO(SessionFactory sessionFactory) {
		return new RoleDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "CartDAO")
	public CartDAO getCartDAO(SessionFactory sessionFactory) {
		return new CartDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "BillingaddressDAO")
	public BillingaddressDAO getBillingaddresstDAO(SessionFactory sessionFactory) {
		return new BillingaddressDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "ShippingaddressDAO")
	public ShippingaddressDAO getShippingaddressDAO(SessionFactory sessionFactory) {
		return new ShippingaddressDAOImpl(sessionFactory);
	}

	@Autowired(required = true)
	@Bean(name = "SupplierDAO")
	public SupplierDAO getSupplierDAO(SessionFactory sessionFactory) {
		return new SupplierDAOImpl(sessionFactory);
	}
	@Autowired(required = true)
	@Bean(name = "WishlistDAO")
	public WishlistDAO getWishlistDAO(SessionFactory sessionFactory) {
		return new WishlistDAOImpl(sessionFactory);
	}
}