/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 02:36:38 GMT 2023
 */

package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.GrayPaintScale;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GrayPaintScale_ESTest extends GrayPaintScale_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 255.0);
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
      assertFalse(boolean0);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertFalse(grayPaintScale0.equals((Object)grayPaintScale1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1479.849912401), (-1062.40207109));
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertFalse(boolean0);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(177.0, 1937.46546);
      // Undeclared exception!
      try { 
        grayPaintScale0.getPaint(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Color parameter outside of expected range: Red Green Blue
         //
         verifyException("java.awt.Color", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1227.8371), 0.0);
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1227.8371), grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1479.849912401), (-1062.40207109));
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals((-1479.849912401), grayPaintScale0.getLowerBound(), 0.01);
      assertEquals((-1062.40207109), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
      assertEquals(2908.0, grayPaintScale0.getUpperBound(), 0.01);
      
      Color color0 = (Color)grayPaintScale0.getPaint(2908.0);
      assertEquals(562.6361001936054, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(255, color0.getBlue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale();
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(0.0, double0, 0.01);
      assertEquals(1.0, grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1479.849912401), (-1062.40207109));
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals((-1479.849912401), double0, 0.01);
      assertEquals((-1062.40207109), grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 255.0);
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertFalse(boolean0);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01);
      assertFalse(grayPaintScale1.equals((Object)grayPaintScale0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
      Object object0 = new Object();
      boolean boolean0 = grayPaintScale0.equals(object0);
      assertFalse(boolean0);
      assertEquals(562.6361001936054, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(2908.0, grayPaintScale0.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale0);
      assertTrue(boolean0);
      assertEquals(2908.0, grayPaintScale0.getUpperBound(), 0.01);
      assertEquals(562.6361001936054, grayPaintScale0.getLowerBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
      GrayPaintScale grayPaintScale1 = new GrayPaintScale();
      boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
      assertEquals(0.0, grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(1.0, grayPaintScale1.getUpperBound(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = null;
      try {
        grayPaintScale0 = new GrayPaintScale(0.0, (-1.0));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires lowerBound < upperBound.
         //
         verifyException("org.jfree.chart.renderer.GrayPaintScale", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
      double double0 = grayPaintScale0.getUpperBound();
      assertEquals(562.6361001936054, grayPaintScale0.getLowerBound(), 0.01);
      assertEquals(2908.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
      GrayPaintScale grayPaintScale1 = (GrayPaintScale)grayPaintScale0.clone();
      boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
      assertTrue(boolean0);
      assertEquals(562.6361001936054, grayPaintScale1.getLowerBound(), 0.01);
      assertEquals(2908.0, grayPaintScale1.getUpperBound(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
      double double0 = grayPaintScale0.getLowerBound();
      assertEquals(562.6361001936054, double0, 0.01);
      assertEquals(2908.0, grayPaintScale0.getUpperBound(), 0.01);
  }
}
