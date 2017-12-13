package test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Actor;
import beans.Movies;

public class Client {
	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure("resources/Hibernate.cfg.xml");
		SessionFactory sf =cfg.buildSessionFactory();
		Session s  =sf.openSession();
		Transaction t = s.beginTransaction();
			
			Actor SRK = new Actor();
			SRK.setAid(2);
			SRK.setActorName("SRK");
		
			Movies m1 = new Movies();
			m1.setMid(3);
			m1.setMovieName("DDLG");
			m1.setActorName(SRK);
			
			Movies m2 = new Movies();
			m2.setMid(4);
			m2.setMovieName("RA.ONE");
			m2.setActorName(SRK);
			
			s.save(m1);
			s.save(m2);
			s.save(SRK);
			t.commit();
			System.out.println("insertion success");
			
	}

}
