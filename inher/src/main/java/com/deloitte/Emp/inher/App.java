package com.deloitte.Emp.inher;
import javax.persistence.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        try {
        	SessionFactory sf=new Configuration().
        			configure("hibernate.cfg.xml")
        			.addAnnotatedClass(EmpInheritance.class)
        			.addAnnotatedClass(DC.class)
        			.addAnnotatedClass(SystemEngineer.class)
        			.buildSessionFactory();
        	
        	//SystemEngineer se=new SystemEngineer();
//        	se.setEmpId(101) ;
//        	se.setEname("Harry");
//        	se.setLang("C");
//        	se.setDevProfile("ABC");
//        	
//        	DC dc=new DC();
//        	dc.setEmpId(1);
//        	dc.setEname("Sam");
//        	dc.setTestTech("XYZ");
//        	dc.setTestProfile("des");
//        	
        	Session ssn=sf.openSession();
        	Criteria ctr=ssn.createCriteria(DC.class);
        	System.out.println(ctr.list());
//        	
//        	Query q=ssn.createQuery("byTestTech");
//        	q.setParameter("tech","C");
//        	q.setSingleResult();
//        	SystemEngineer se=(SystemEngineer)q.getSingleResult();
        	
        	ssn.close();
        	
        	System.out.println("Emp Id-"+se.getEmpId());
        	System.out.println("Emp Name-"+se.getEname());
        	System.out.println("Dev Profile-"+se.getDevProfile());
        	System.out.println("Language-"+se.getLang());
        	
        	
			Transaction tx=ssn.beginTransaction();
			ssn.save(se);
			
			//ssn.save(dc);
        	tx.commit();
        	
        }
        catch(Exception e) {
        	System.out.println(e);
        }
    }
}
