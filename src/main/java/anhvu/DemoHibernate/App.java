package anhvu.DemoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Alien a = null;
//      a.setId(102);
//      a.setName("Vu");
//      a.setColor("Black");
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		SessionFactory sf = con.buildSessionFactory();
		Session sesstion = sf.openSession();
		sesstion.beginTransaction();
		// sesstion.save(a);

		a = (Alien) sesstion.get(Alien.class, 102);
		System.out.println(a);
		sesstion.getTransaction().commit();
		sesstion.close();

		Session sesstion1 = sf.openSession();
		a = (Alien) sesstion1.get(Alien.class, 102);
		System.out.println(a);
		sesstion1.getTransaction().commit();
		sesstion1.close();
	}
}
