/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.sfedu.booklibhibernate.dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergey
 */
public class HibernateDataProviderTest {
    
    public HibernateDataProviderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDatabaseSize method, of class HibernateDataProvider.
     */
    @Test
    public void testGetDatabaseSize() {
        System.out.println("getDatabaseSize");
        HibernateDataProvider instance = new HibernateDataProvider();
        String expResult = "";
        String result = instance.getDatabaseSize();
        System.out.println(result);
    }

    /**
     * Test of getDatabaseTableList method, of class HibernateDataProvider.
     */
    //@Test
    public void testGetDatabaseTableList() {
        System.out.println("getDatabaseTableList");
        HibernateDataProvider instance = new HibernateDataProvider();
        String[] expResult = null;
        String[] result = instance.getDatabaseTableList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatabaseUserList method, of class HibernateDataProvider.
     */
    //@Test
    public void testGetDatabaseUserList() {
        System.out.println("getDatabaseUserList");
        HibernateDataProvider instance = new HibernateDataProvider();
        String[] expResult = null;
        String[] result = instance.getDatabaseUserList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatabaseDataTypesList method, of class HibernateDataProvider.
     */
   // @Test
    public void testGetDatabaseDataTypesList() {
        System.out.println("getDatabaseDataTypesList");
        HibernateDataProvider instance = new HibernateDataProvider();
        String[] expResult = null;
        String[] result = instance.getDatabaseDataTypesList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatabaseFunctionList method, of class HibernateDataProvider.
     */
    //@Test
    public void testGetDatabaseFunctionList() {
        System.out.println("getDatabaseFunctionList");
        HibernateDataProvider instance = new HibernateDataProvider();
        String[] expResult = null;
        String[] result = instance.getDatabaseFunctionList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
