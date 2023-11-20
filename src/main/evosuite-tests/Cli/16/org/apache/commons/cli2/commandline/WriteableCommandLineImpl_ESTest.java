/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 21:36:54 GMT 2023
 */

package org.apache.commons.cli2.commandline;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.Command;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.validation.DateValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WriteableCommandLineImpl_ESTest extends WriteableCommandLineImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Command> linkedList0 = new LinkedList<Command>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      String string0 = writeableCommandLineImpl0.getProperty("Passes properties and values to the application");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      Set set0 = writeableCommandLineImpl0.getOptionTriggers();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      Set set0 = writeableCommandLineImpl0.getProperties();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      List list0 = writeableCommandLineImpl0.getOptions();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      List list0 = writeableCommandLineImpl0.getNormalised();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Command> linkedList0 = new LinkedList<Command>();
      PropertyOption propertyOption0 = new PropertyOption();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      boolean boolean0 = writeableCommandLineImpl0.hasOption("-D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
      writeableCommandLineImpl0.addValue(propertyOption0, (Object) null);
      List list0 = writeableCommandLineImpl0.getUndefaultedValues(propertyOption0);
      List list1 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) list0);
      assertFalse(list0.isEmpty());
      assertSame(list1, list0);
      assertEquals(1, list1.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DateValidator dateValidator0 = DateValidator.getTimeInstance();
      LinkedList<Properties> linkedList0 = new LinkedList<Properties>();
      ArgumentImpl argumentImpl0 = new ArgumentImpl((String) null, (String) null, (-2692), (-2692), 'r', 'r', dateValidator0, (String) null, linkedList0, (-2692));
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(argumentImpl0, linkedList0);
      PropertyOption propertyOption0 = new PropertyOption();
      writeableCommandLineImpl0.addValue(argumentImpl0, propertyOption0);
      assertFalse(propertyOption0.isRequired());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
      writeableCommandLineImpl0.addValue(propertyOption0, (Object) null);
      writeableCommandLineImpl0.addValue(propertyOption0, propertyOption0);
      assertEquals("Passes properties and values to the application", propertyOption0.getDescription());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addSwitch(propertyOption0, true);
      // Undeclared exception!
      try { 
        writeableCommandLineImpl0.addSwitch(propertyOption0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Switch already set.
         //
         verifyException("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<Command> linkedList0 = new LinkedList<Command>();
      PropertyOption propertyOption0 = new PropertyOption();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addSwitch(propertyOption0, false);
      boolean boolean0 = writeableCommandLineImpl0.hasOption("-D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
      List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
      List list0 = writeableCommandLineImpl0.getUndefaultedValues(propertyOption0);
      List list1 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) list0);
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.setDefaultValues(propertyOption0, linkedList0);
      List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) linkedList0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      LinkedList linkedList1 = (LinkedList)writeableCommandLineImpl0.getValue((Option) propertyOption0, (Object) linkedList0);
      assertEquals(0, linkedList1.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      LinkedList<String> linkedList1 = new LinkedList<String>(set0);
      List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) linkedList1);
      assertEquals(603, list0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addSwitch(propertyOption0, true);
      Boolean boolean0 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      Boolean boolean0 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addProperty("Passes properties and values to the application", "Passes properties and values to the application");
      writeableCommandLineImpl0.addProperty((Option) propertyOption0, "-D", "Passes properties and values to the application");
      assertEquals("Passes properties and values to the application", propertyOption0.getDescription());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addProperty("Passes properties and values to the application", "Passes properties and values to the application");
      String string0 = writeableCommandLineImpl0.getProperty((Option) propertyOption0, "-D");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addProperty("-D", "Passes properties and values to the application");
      Set set0 = writeableCommandLineImpl0.getProperties();
      assertEquals(1, set0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<Command> linkedList0 = new LinkedList<Command>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("Passes properties and values to the application");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<Command> linkedList0 = new LinkedList<Command>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("-D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      linkedList0.add("-D");
      linkedList0.add("Passes properties and values to the application");
      String string0 = writeableCommandLineImpl0.toString();
      assertEquals("-D \"Passes properties and values to the application\"", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
      writeableCommandLineImpl0.setDefaultValues(propertyOption0, (List) null);
      assertFalse(propertyOption0.isRequired());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      Boolean boolean0 = Boolean.TRUE;
      writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, boolean0);
      assertEquals(68, propertyOption0.getId());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, (Boolean) null);
      assertEquals(68, propertyOption0.getId());
  }
}
