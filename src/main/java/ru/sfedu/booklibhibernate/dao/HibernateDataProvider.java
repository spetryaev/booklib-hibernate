/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.dao;

import java.util.List;
import ru.sfedu.booklibhibernate.util.HibernateUtil;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 *
 * @author sergey
 */
public class HibernateDataProvider {
            
            private static final Logger log = Logger.getLogger(HibernateDataProvider.class);
            
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session;
            
            
            
            public String getDatabaseSize() {
                try{
                         session = sessionFactory.openSession();
                         String sqlQuery = "select pg_database_size('db')";
                          List<String> resultSet = session.createSQLQuery(sqlQuery).list();
                          String result = resultSet.get(1);
                         return result;
                        }
                catch(Exception e){
                        return null;
                        }
            }
            
            public String[] getDatabaseTableList (){
                return null;
                
            }
            
            public String[] getDatabaseUserList(){
                return null;
                
            }
            
            public String[] getDatabaseDataTypesList(){
                return null;
                
            }
            
            public String[] getDatabaseFunctionList(){
                return null;
                
            }
            
}
