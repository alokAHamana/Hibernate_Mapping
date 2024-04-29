package com.aa.oneTomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		 
		Configuration  cfg = new Configuration();
		cfg.configure("com/aa/oneTomany/hibernate.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		// creating question
		Question q=new Question();
		q.setQuesId(50);
		q.setQuestion("What is java");
		
		//creating answer
		Answer ans= new Answer();
		ans.setAns_Id(51);
		ans.setAns("java is programmin lang");
		ans.setQuestion(q);
		
		//creating answer
				Answer ans1= new Answer();
				ans1.setAns_Id(52);
				ans1.setAns("java is build software ");
				ans1.setQuestion(q);
				
				
				
					List<Answer> list = new ArrayList<Answer>();
					list.add(ans);
					list.add(ans1);
				
					q.setAns(list);
					
		Transaction tx= session.beginTransaction();
		
		session.save(q);
		//session.save(ans);
		//session.save(ans1);
		
		
		tx.commit();
		session.close();
		factory.close();
	}
}
