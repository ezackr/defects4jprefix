/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 04:01:56 GMT 2023
 */

package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.time.StopWatch;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StopWatch_ESTest extends StopWatch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.split();
      stopWatch0.suspend();
      stopWatch0.unsplit();
      String string0 = stopWatch0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.split();
      stopWatch0.suspend();
      stopWatch0.unsplit();
      stopWatch0.resume();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.suspend();
      // Undeclared exception!
      try { 
        stopWatch0.start();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch already started. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      System.setCurrentTimeMillis((-503L));
      long long0 = stopWatch0.getTime();
      assertEquals((-1392409281823L), long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.split();
      stopWatch0.suspend();
      stopWatch0.resume();
      long long0 = stopWatch0.getSplitTime();
      assertEquals((-1392409281321L), long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.split();
      long long0 = stopWatch0.getSplitTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.getSplitTime();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be split to get the split time. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      long long0 = stopWatch0.getTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.stop();
      long long0 = stopWatch0.getTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      long long0 = stopWatch0.getTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.suspend();
      long long0 = stopWatch0.getTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.split();
      String string0 = stopWatch0.toSplitString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.resume();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be suspended to resume. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.suspend();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be running to suspend. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.unsplit();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch has not been split. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.split();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch is not running. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.suspend();
      stopWatch0.stop();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.stop();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch is not running. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.start();
      stopWatch0.stop();
      // Undeclared exception!
      try { 
        stopWatch0.start();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be reset before being restarted. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      // Undeclared exception!
      try { 
        stopWatch0.toSplitString();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stopwatch must be split to get the split time. 
         //
         verifyException("org.apache.commons.lang.time.StopWatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StopWatch stopWatch0 = new StopWatch();
      stopWatch0.reset();
  }
}
