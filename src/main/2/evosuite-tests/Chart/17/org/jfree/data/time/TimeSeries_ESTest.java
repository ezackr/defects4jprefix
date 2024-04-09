/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 21:27:09 GMT 2024
 */

package org.jfree.data.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Panel;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesDataItem;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TimeSeries_ESTest extends TimeSeries_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.setDomainDescription("");
      assertEquals("", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.update(23, (Number) 0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 23, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.getItems();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.getNextTimePeriod();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (double) 0);
      timeSeries0.getValue((RegularTimePeriod) hour0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.add((RegularTimePeriod) hour0, (double) 0, false);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.clone();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (double) 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are trying to add data where the time period class is org.jfree.data.time.Hour, but the TimeSeries is expecting an instance of org.jfree.data.time.Day.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemCount((-1820));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'maximum' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (double) 0);
      timeSeries0.setMaximumItemCount(0);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.setMaximumItemAge((-9223372036854775808L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative 'periods' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.getDataItem((RegularTimePeriod) hour0);
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 23);
      timeSeries0.getDataItem((RegularTimePeriod) hour0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.getTimePeriods();
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Second second0 = new Second();
      Class<Panel> class0 = Panel.class;
      TimeSeries timeSeries0 = new TimeSeries(second0, "7[U)Cl)>dSzB)W~", "7[U)Cl)>dSzB)W~", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) second0, (double) 0);
      timeSeries0.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.statistics.DefaultStatisticalCategoryDataset");
      Class<String> class0 = String.class;
      TimeSeries timeSeries1 = new TimeSeries(hour0, "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (double) 0);
      timeSeries1.getTimePeriodsUniqueToOtherSeries(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      // Undeclared exception!
      try { 
        timeSeries0.getDataItem((RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.getValue((RegularTimePeriod) hour0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.statistics.DefaultStatisticalCategoryDataset");
      // Undeclared exception!
      try { 
        timeSeries0.add((TimeSeriesDataItem) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'item' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      // Undeclared exception!
      try { 
        timeSeries0.add((RegularTimePeriod) hour0, (Number) 23);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // You are attempting to add an observation for the time period Fri Feb 14 20:21:21 GMT 2014 but the series already contains an observation for that time period. Duplicates are not permitted.  Try using the addOrUpdate() method.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.add(regularTimePeriod0, (Number) 23);
      timeSeries0.setMaximumItemAge(0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      assertEquals(0, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Second second0 = new Second();
      TimeSeries timeSeries0 = new TimeSeries(second0);
      // Undeclared exception!
      try { 
        timeSeries0.update((RegularTimePeriod) second0, (Number) 59);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TimeSeries.update(TimePeriod, Number):  period does not exist.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("?jar!7*iDrM`k%G\"", "?jar!7*iDrM`k%G\"", "?jar!7*iDrM`k%G\"", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.addAndOrUpdate(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.statistics.DefaultStatisticalCategoryDataset");
      TimeSeries timeSeries1 = new TimeSeries("org.jfree.data.statistics.DefaultStatisticalCategoryDataset");
      timeSeries1.addOrUpdate((RegularTimePeriod) hour0, (double) 0);
      timeSeries0.addAndOrUpdate(timeSeries1);
      assertEquals(1, timeSeries1.getItemCount());
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", "org.jfree.data.statistics.DefaultStatisticalCategoryDataset", class0);
      BigInteger bigInteger0 = BigInteger.valueOf((-3374L));
      // Undeclared exception!
      try { 
        timeSeries0.addOrUpdate((RegularTimePeriod) null, (Number) bigInteger0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'period' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("", "", "", class0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      
      timeSeries0.setMaximumItemCount(0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, ">", ">", class0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.setMaximumItemAge(0);
      timeSeries0.add(regularTimePeriod0, (Number) 0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 23);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.removeAgedItems((long) 0, true);
      timeSeries0.removeAgedItems(1L, true);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 23);
      timeSeries0.removeAgedItems((long) 23, true);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      timeSeries0.setMaximumItemAge(0);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.removeAgedItems(2L, false);
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Minute> class0 = Minute.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.setMaximumItemAge(23);
      timeSeries0.removeAgedItems((long) 0, true);
      assertEquals(23L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.clear();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("", "", "", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.clear();
      assertEquals(0, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.delete((RegularTimePeriod) hour0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      timeSeries0.addOrUpdate((RegularTimePeriod) hour0, (Number) 23);
      assertEquals(1, timeSeries0.getItemCount());
      
      timeSeries0.delete((RegularTimePeriod) hour0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.delete(23, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start <= end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((-447), 23);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start >= 0.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = timeSeries0.createCopy(0, 0);
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals("Time", timeSeries1.getDomainDescription());
      assertNotSame(timeSeries1, timeSeries0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("S?joar!7*inrM`k%G\"");
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) null, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'start' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null 'end' argument.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      RegularTimePeriod regularTimePeriod0 = hour0.previous();
      // Undeclared exception!
      try { 
        timeSeries0.createCopy((RegularTimePeriod) hour0, regularTimePeriod0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Requires start on or before end.
         //
         verifyException("org.jfree.data.time.TimeSeries", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("S?joar!7*inrM`k%G\"", "S?joar!7*inrM`k%G\"", "S?joar!7*inrM`k%G\"", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      RegularTimePeriod regularTimePeriod0 = hour0.previous();
      timeSeries0.createCopy(regularTimePeriod0, regularTimePeriod0);
      assertEquals(1, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", class0);
      boolean boolean0 = timeSeries0.equals(timeSeries0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("{?joar!7Ki-rM`k%G\"", timeSeries0.getRangeDescription());
      assertEquals("{?joar!7Ki-rM`k%G\"", timeSeries0.getDomainDescription());
      assertTrue(boolean0);
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, class0);
      boolean boolean0 = timeSeries0.equals(class0);
      assertFalse(boolean0);
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals("Time", timeSeries0.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = timeSeries0.addAndOrUpdate(timeSeries0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals("Value", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertFalse(boolean0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("Time", timeSeries1.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("org.jfree.data.xy.Int-rvalXYDelegate");
      Class<Millisecond> class0 = Millisecond.class;
      TimeSeries timeSeries1 = new TimeSeries("org.jfree.data.xy.Int-rvalXYDelegate", "org.jfree.data.xy.Int-rvalXYDelegate", "org.jfree.data.xy.Int-rvalXYDelegate", class0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(Integer.MAX_VALUE, timeSeries1.getMaximumItemCount());
      assertEquals("org.jfree.data.xy.Int-rvalXYDelegate", timeSeries1.getDomainDescription());
      assertEquals("Value", timeSeries0.getRangeDescription());
      assertFalse(boolean0);
      assertEquals("org.jfree.data.xy.Int-rvalXYDelegate", timeSeries1.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      assertEquals("Time", timeSeries0.getDomainDescription());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
      timeSeries1.setRangeDescription("%e");
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals("%e", timeSeries1.getRangeDescription());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
      assertEquals(9223372036854775807L, timeSeries1.getMaximumItemAge());
      
      timeSeries1.setMaximumItemAge(0);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Hour hour0 = new Hour();
      TimeSeries timeSeries0 = new TimeSeries(hour0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
      timeSeries1.setMaximumItemCount(23);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(23, timeSeries1.getMaximumItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", class0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
      timeSeries1.add((RegularTimePeriod) hour0, (Number) 23);
      boolean boolean0 = timeSeries0.equals(timeSeries1);
      assertEquals(1, timeSeries1.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("Null 'group' argument.", "Null 'group' argument.", "Null 'group' argument.", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("Null 'group' argument.", "Null 'group' argument.", "Null 'group' argument.", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      TimeSeries timeSeries1 = timeSeries0.createCopy((RegularTimePeriod) hour0, (RegularTimePeriod) hour0);
      timeSeries1.update((RegularTimePeriod) hour0, (Number) 23);
      boolean boolean0 = timeSeries1.equals(timeSeries0);
      assertEquals(1, timeSeries0.getItemCount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, (String) null, (String) null, class0);
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      TimeSeries timeSeries0 = new TimeSeries("S?joar!7*inrM`k%G\"", "S?joar!7*inrM`k%G\"", "S?joar!7*inrM`%G\"", (Class) null);
      timeSeries0.hashCode();
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals("S?joar!7*inrM`%G\"", timeSeries0.getRangeDescription());
      assertEquals("S?joar!7*inrM`k%G\"", timeSeries0.getDomainDescription());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries("{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", "{?joar!7Ki-rM`k%G\"", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      timeSeries0.hashCode();
      assertEquals("{?joar!7Ki-rM`k%G\"", timeSeries0.getDomainDescription());
      assertEquals("{?joar!7Ki-rM`k%G\"", timeSeries0.getRangeDescription());
      assertEquals(9223372036854775807L, timeSeries0.getMaximumItemAge());
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, ">", ">", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      timeSeries0.add(regularTimePeriod0, (Number) 0);
      timeSeries0.hashCode();
      assertEquals(2, timeSeries0.getItemCount());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Hour hour0 = new Hour();
      Class<Hour> class0 = Hour.class;
      TimeSeries timeSeries0 = new TimeSeries(hour0, ">", ">", class0);
      timeSeries0.add((RegularTimePeriod) hour0, (Number) 0);
      RegularTimePeriod regularTimePeriod0 = hour0.next();
      RegularTimePeriod regularTimePeriod1 = regularTimePeriod0.next();
      timeSeries0.add(regularTimePeriod1, (Number) 0);
      timeSeries0.add(regularTimePeriod0, (Number) 23);
      timeSeries0.hashCode();
      assertEquals(Integer.MAX_VALUE, timeSeries0.getMaximumItemCount());
      assertEquals(">", timeSeries0.getRangeDescription());
      assertEquals(">", timeSeries0.getDomainDescription());
  }
}
