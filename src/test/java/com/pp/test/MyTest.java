package com.pp.test;

import junit.framework.TestCase;

public class MyTest extends TestCase {
   protected int value1, value2;
   
   // assigning the values
   protected void setUp(){
      value1 = 2;
      value2 = 4;
   }

   // test method to add two values
   public void testAdd(){
      double result = value1 + value2;
      assertTrue(result == 6);
   }
  
   
}
