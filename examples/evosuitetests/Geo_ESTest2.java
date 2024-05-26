/*
 * This file was automatically generated by EvoSuite
 * Sun May 12 11:04:44 GMT 2024
 */

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.Geo;
import org.example.Point3;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Geo_ESTest extends Geo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Geo geo0 = new Geo();
      Point3 point3_0 = geo0.getPositionById(0);
      assertNotNull(point3_0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Geo geo0 = new Geo();
      // Undeclared exception!
      try { 
        geo0.getPositionById((-1824));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index -1824 out of bounds for length 1000
         //
         verifyException("org.example.Geo", e);
      }
  }
}