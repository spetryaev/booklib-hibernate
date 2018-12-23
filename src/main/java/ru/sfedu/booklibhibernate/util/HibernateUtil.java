/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.util;

import java.io.File;

import ru.sfedu.booklibhibernate.model.Book;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;

/**
 *
 * @author sergey
 */
public class HibernateUtil {
    
        private static final Logger log = Logger.getLogger(HibernateUtil.class);
        
        private static SessionFactory sessionFactory;
        
      
        public static SessionFactory getSessionFactory()  {
             
            if (sessionFactory == null) {
                     String hibernateConfigPath = getConfigProperty("hibernate_config_path");
                     log.info("\"getSessionFactory\" => Hybernate confuguration loaded");

                try {
                        
                        Configuration configuration = new Configuration().configure();
                        configuration.addAnnotatedClass(Book.class);
                    
                        StandardServiceRegistryBuilder builder =  new StandardServiceRegistryBuilder()
                                                                                                                 .applySettings(configuration.getProperties());
                                                                   
                        sessionFactory = configuration.buildSessionFactory(builder.build());
                    
                        return sessionFactory;
                      }
                
                catch (HibernateException e){
                        log.error(e);
                        return null;
                }
                
            }
            
            return null;
                
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
        
        
        
        
        
        
        

