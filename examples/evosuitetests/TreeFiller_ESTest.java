/*
 * This file was automatically generated by EvoSuite
 * Sun May 12 08:49:42 GMT 2024
 */

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.example.Tree;
import org.example.TreeFiller;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TreeFiller_ESTest extends TreeFiller_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      TreeFiller.createTree(2257);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tree<Integer> tree0 = TreeFiller.createTree(1);
      assertNotNull(tree0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tree<Integer> tree0 = TreeFiller.createTree((-2494));
      assertNotNull(tree0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TreeFiller treeFiller0 = new TreeFiller();
  }
}
