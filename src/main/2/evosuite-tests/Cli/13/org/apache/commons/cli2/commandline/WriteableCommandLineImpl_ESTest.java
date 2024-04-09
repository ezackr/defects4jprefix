/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 22:15:04 GMT 2024
 */

package org.apache.commons.cli2.commandline;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.option.Switch;
import org.apache.commons.cli2.validation.DateValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WriteableCommandLineImpl_ESTest extends WriteableCommandLineImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      String string0 = writeableCommandLineImpl0.getProperty("-D", "Passes properties and values to the application");
      assertEquals("Passes properties and values to the application", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      Set set0 = writeableCommandLineImpl0.getOptionTriggers();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addProperty("-D", "-D");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      Set set0 = writeableCommandLineImpl0.getProperties();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      int int0 = writeableCommandLineImpl0.getOptionCount((Option) propertyOption0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      List list0 = writeableCommandLineImpl0.getNormalised();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      Object object0 = writeableCommandLineImpl0.getValue("Passes properties and values to the application");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addOption(propertyOption0);
      boolean boolean0 = writeableCommandLineImpl0.hasOption("-D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
      assertEquals("Passes properties and values to the application", propertyOption0.getDescription());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      DateValidator dateValidator0 = DateValidator.getDateInstance();
      ArgumentImpl argumentImpl0 = new ArgumentImpl("Passes properties and values to the application", "Passes properties and values to the application", 1, 1, '#', '#', dateValidator0, "-D", linkedList0, 1);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(argumentImpl0, linkedList0);
      writeableCommandLineImpl0.addValue(argumentImpl0, argumentImpl0);
      assertEquals(1, argumentImpl0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addSwitch(propertyOption0, false);
      // Undeclared exception!
      try { 
        writeableCommandLineImpl0.addSwitch(propertyOption0, false);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Switch already set.
         //
         verifyException("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      boolean boolean0 = writeableCommandLineImpl0.hasOption("-D");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
      List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) linkedList0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
      List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.addSwitch(propertyOption0, true);
      Boolean boolean0 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0);
      assertNotNull(boolean0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      Boolean boolean0 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("Passes properties and values to the application");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("-D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      linkedList0.add((Object) "-D");
      String string0 = writeableCommandLineImpl0.toString();
      assertEquals("-D", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      linkedList0.add((Object) "Passes properties and values to the application");
      linkedList0.addLast("Passes properties and values to the application");
      String string0 = writeableCommandLineImpl0.toString();
      assertEquals("\"Passes properties and values to the application\" \"Passes properties and values to the application\"", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.setDefaultValues(propertyOption0, linkedList0);
      assertEquals(68, propertyOption0.getId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
      writeableCommandLineImpl0.setDefaultValues(propertyOption0, (List) null);
      assertEquals(68, propertyOption0.getId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      Boolean boolean0 = Boolean.TRUE;
      writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, boolean0);
      assertEquals(68, propertyOption0.getId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, (Boolean) null);
      assertEquals("Passes properties and values to the application", propertyOption0.getDescription());
  }
}
