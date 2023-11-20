/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 21:42:16 GMT 2023
 */

package org.apache.commons.cli2.option;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.Command;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.option.GroupImpl;
import org.apache.commons.cli2.option.PropertyOption;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OptionImpl_ESTest extends OptionImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashSet<Command> linkedHashSet0 = new LinkedHashSet<Command>();
      LinkedList<Command> linkedList0 = new LinkedList<Command>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "Passes properties and values to the application", 37, 37);
      Command command0 = new Command("-D", "-D", linkedHashSet0, true, (Argument) null, groupImpl0, 37);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      try { 
        command0.validate(writeableCommandLineImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing required option -D
         //
         verifyException("org.apache.commons.cli2.option.Command", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      propertyOption0.defaults((WriteableCommandLine) null);
      assertEquals(68, propertyOption0.getId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      propertyOption0.toString();
      assertEquals(68, propertyOption0.getId());
      assertFalse(propertyOption0.isRequired());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ListIterator<Integer> listIterator0 = linkedList0.listIterator();
      boolean boolean0 = propertyOption0.canProcess((WriteableCommandLine) null, listIterator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(60);
      linkedList0.add(integer0);
      ListIterator<Integer> listIterator0 = linkedList0.listIterator();
      // Undeclared exception!
      try { 
        propertyOption0.canProcess((WriteableCommandLine) null, listIterator0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
         verifyException("org.apache.commons.cli2.option.OptionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      boolean boolean0 = propertyOption0.equals("Passes properties and values to the application");
      assertFalse(propertyOption0.isRequired());
      assertEquals(68, propertyOption0.getId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      PropertyOption propertyOption1 = new PropertyOption("Passes properties and values to the application", "Passes properties and values to the application", 404);
      boolean boolean0 = propertyOption0.equals(propertyOption1);
      assertEquals(404, propertyOption1.getId());
      assertFalse(boolean0);
      assertFalse(propertyOption1.isRequired());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption((String) null, (String) null, 15);
      PropertyOption propertyOption1 = new PropertyOption("-D", (String) null, 15);
      boolean boolean0 = propertyOption1.equals(propertyOption0);
      assertFalse(boolean0);
      assertEquals(15, propertyOption1.getId());
      assertFalse(propertyOption1.isRequired());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      PropertyOption propertyOption1 = new PropertyOption("-D", "-D", 68);
      boolean boolean0 = propertyOption0.equals(propertyOption1);
      assertEquals(68, propertyOption1.getId());
      assertFalse(boolean0);
      assertFalse(propertyOption1.isRequired());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = new PropertyOption("G", "G", 0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "G", "G", 0, 0);
      boolean boolean0 = propertyOption0.equals(groupImpl0);
      assertEquals(0, groupImpl0.getId());
      assertFalse(boolean0);
      assertFalse(propertyOption0.isRequired());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption((String) null, (String) null, 15);
      boolean boolean0 = propertyOption0.equals(propertyOption0);
      assertTrue(boolean0);
      assertEquals(15, propertyOption0.getId());
      assertFalse(propertyOption0.isRequired());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      PropertyOption propertyOption1 = new PropertyOption((String) null, (String) null, 68);
      boolean boolean0 = propertyOption1.equals(propertyOption0);
      assertFalse(boolean0);
      assertEquals(68, propertyOption1.getId());
      assertFalse(propertyOption1.isRequired());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<DefaultOption> linkedList0 = new LinkedList<DefaultOption>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, (String) null, (String) null, 1116, 1116);
      groupImpl0.hashCode();
      assertEquals(0, groupImpl0.getId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      propertyOption0.hashCode();
      assertEquals(68, propertyOption0.getId());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      Option option0 = propertyOption0.findOption("Passes properties and values to the application");
      assertEquals(68, propertyOption0.getId());
      assertFalse(propertyOption0.isRequired());
      assertNull(option0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      Option option0 = propertyOption0.findOption("-D");
      assertNotNull(option0);
      assertEquals(68, option0.getId());
      assertFalse(option0.isRequired());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      // Undeclared exception!
      try { 
        propertyOption0.checkPrefixes(set0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Trigger -D must be prefixed with a value from java.util.HashSet@0000000003
         //
         verifyException("org.apache.commons.cli2.option.OptionImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedHashSet<ArgumentImpl> linkedHashSet0 = new LinkedHashSet<ArgumentImpl>();
      propertyOption0.checkPrefixes(linkedHashSet0);
      assertEquals(68, propertyOption0.getId());
      assertFalse(propertyOption0.isRequired());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      PropertyOption propertyOption0 = new PropertyOption();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("-D");
      propertyOption0.checkPrefixes(linkedHashSet0);
      assertEquals(68, propertyOption0.getId());
      assertFalse(propertyOption0.isRequired());
  }
}
