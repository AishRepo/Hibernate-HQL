package com.sathya.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.StandardServiceInitiators;

public class HibernateUtil {

	
	private static SessionFactory factory;
	public static synchronized SessionFactory getSessionFactory() {
		{
			if(factory== null) {
		
		ServiceRegistry registry =new StandardServiceRegistryBuilder().configure("com/sathya/config/hibernate.cfg.xml").build();
		
		
		Metadata metadata =new MetadataSources(registry).getMetadataBuilder().build();
		
		 factory = metadata.getSessionFactoryBuilder().build();
			}
		return factory;
	
		}
		
		}
	private static void closeSessionFactory() {
		// TODO Auto-generated method stub
		factory.close();
	}
		

}
