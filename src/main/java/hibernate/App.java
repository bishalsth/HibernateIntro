package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Configuration con=new Configuration().configure("hbm.cfg.xml").addAnnotatedClass(Product.class);
        Product p = new Product(
        
        	"Mat",
        	"Mata Handicrafts",
        	"Leather cowboy Hat",
        	222,
        	true
        );
		
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       Product p1 = session.find(Product.class,1);
//       session.update(product);
//       session.save(p);
//       session.update(p1);
//       session.delete(p1);
       tx.commit();
       session.close();
       
		System.out.println( p1 );

	}

}
