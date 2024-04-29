package com.aa.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		 
		Configuration  cfg = new Configuration();
		cfg.configure("com/aa/Mapping/Hibernate.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		// creating question
		Question q1=new Question();
		q1.setQuesId(40);
		q1.setQueString("What is java");
		
		//creating answer
		Answer ans1= new Answer();
		ans1.setAns_Id(411);
		ans1.setAns("Java is Programing language");
		q1.setAns(ans1);
		
		//22222222222222222222222222222222
		// creating question
				Question q2=new Question();
				q2.setQuesId(110);
				q2.setQueString("What is functional Interface");
				
				//creating answer
				Answer ans2= new Answer();
				ans2.setAns_Id(111);
				ans2.setAns("Interface ......is SRS-Service Requirement Specification");
				q2.setAns(ans2);
		
				// 3333333333
				Question q3=new Question();
				q3.setQuesId(112);
				q3.setQueString("What is conceptof   inheritence");
				
				//creating answer
				Answer ans3= new Answer();
				ans3.setAns_Id(113);
				ans3.setAns("extending ....parent properties to child");
				q3.setAns(ans3);
				
		Transaction tx= session.beginTransaction();
		
		session.save(q1);
		//session.save(ans1);
		session.save(q2);
		//session.save(ans2);
		session.save(q3);
		//session.save(ans3);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
