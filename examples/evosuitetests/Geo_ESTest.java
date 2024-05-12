/*
 * This file was automatically generated by EvoSuite
 * Sun May 12 08:54:00 GMT 2024
 */

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.Geo;
import org.example.Point1;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Geo_ESTest extends Geo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Geo geo0 = new Geo();
      Point1 point1_0 = geo0.getPositionById(3);
      assertNotNull(point1_0);
      assertEquals(20, point1_0.getY());
      assertEquals(10, point1_0.getX());
      assertEquals(30, point1_0.getZ());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Geo geo0 = new Geo();
      // Undeclared exception!
      try { 
        geo0.getPositionById((-1532));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1532 out of bounds for length 1000
         //
         verifyException("org.example.Geo", e);
      }
  }
}
