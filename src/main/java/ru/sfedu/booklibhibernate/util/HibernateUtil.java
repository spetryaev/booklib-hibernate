/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.util;

import java.io.File;
import javax.imageio.spi.ServiceRegistry;

import ru.sfedu.booklibhibernate.model.Book;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import ru.sfedu.booklibhibernate.model.Customer;

/**
 *
 * @author sergey
 */
public class HibernateUtil {
    
        private static final Logger log = Logger.getLogger(HibernateUtil.class);
        
        private static SessionFactory sessionFactory = createSessionFactory();
        
      
        public static SessionFactory createSessionFactory()  {
             
            if (sessionFactory == null) {
                     String hibernateConfigPath = getConfigProperty("hibernate_config_path");
                     File cfgFile = new File(hibernateConfigPath);

                try {
                        
                        Configuration configuration = new Configuration().configure(cfgFile);
                         log.info("Hybernate confuguration loaded");
                         
                         StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                                                                                                            .applySettings(configuration.getProperties())
                                                                                                            .build();
                         log.info("Service Registry builded successfully!");
                         MetadataSources metadataSources = new MetadataSources(serviceRegistry);
                         metadataSources.addAnnotatedClass(Book.class);
                         metadataSources.addAnnotatedClass(Customer.class);
                         
                         SessionFactory newSessionFactory = metadataSources.buildMetadata().buildSessionFactory();
                         log.info("Session Factory builded successfully!");
                      
                        return newSessionFactory;
                      }
                
                catch (HibernateException e){
                        log.error(e);
                        return null;
                }
                
            }   
          
            return null;
          }
        
        public static SessionFactory getSessionFactory(){
                return sessionFactory;
        }
        
        
            private static String getConfigProperty(String key) {
                try {
                            ConfigurationUtil config = new ConfigurationUtil("/config.properties");
                            final String property = config.readConfig(key);
                            log.info("\"get config  property\" => " + key + " = " + property);
                            return property;
                        }
                catch (Exception e) {
                            log.fatal(e);
                            return null;
                        }
            }
            
            
            
   }
        
        
        
        
        
        
        

