/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 23:15:54 GMT 2023
 */

package org.apache.commons.cli2.option;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.Command;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.option.GroupImpl;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.option.SourceDestArgument;
import org.apache.commons.cli2.validation.FileValidator;
import org.apache.commons.cli2.validation.NumberValidator;
import org.apache.commons.cli2.validation.UrlValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GroupImpl_ESTest extends GroupImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", "", 60, 60);
      groupImpl0.getAnonymous();
      assertEquals(60, groupImpl0.getMaximum());
      assertEquals(60, groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "6fH~_%MC", "6fH~_%MC", 3, 3);
      int int0 = groupImpl0.getMaximum();
      assertEquals(3, int0);
      assertEquals(3, groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Passes properties and values to the application", "Passes properties and values to the application", 0, 0);
      groupImpl0.findOption("Passes properties and values to the application");
      assertEquals(1, linkedList0.size());
      assertEquals(0, groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      UrlValidator urlValidator0 = new UrlValidator("");
      ArgumentImpl argumentImpl0 = new ArgumentImpl("", "", 217, 217, '~', '~', urlValidator0, (String) null, linkedList0, '~');
      SourceDestArgument sourceDestArgument0 = new SourceDestArgument(argumentImpl0, argumentImpl0);
      linkedList0.add((Object) sourceDestArgument0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "EZfj7W|", "--", 217, '\u0000');
      groupImpl0.toString();
      assertEquals(0, linkedList0.size());
      assertEquals(0, groupImpl0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "org.apache.commons.cli2.option.SourceDestArgument", "org.apache.commons.cli2.option.SourceDestArgument", 0, 0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, (String) null);
      assertEquals(0, groupImpl0.getMinimum());
      assertEquals(0, groupImpl0.getMaximum());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", "-D", (-784), (-784));
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, "-D");
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "w71WR", "w71WR", 0, 0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, "w71WR");
      assertEquals(1, linkedList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = new PropertyOption("", "", 2676);
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", "", (-1968), (-1968));
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, "-D");
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = new PropertyOption();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", (String) null, (-283), (-283));
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, "-D");
      assertEquals((-283), groupImpl0.getMinimum());
      assertFalse(boolean0);
      assertEquals((-283), groupImpl0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<SourceDestArgument> linkedList0 = new LinkedList<SourceDestArgument>();
      FileValidator fileValidator0 = FileValidator.getExistingDirectoryInstance();
      ArgumentImpl argumentImpl0 = new ArgumentImpl("x:zZJ-", "x:zZJ-", 61, 61, '7', '7', fileValidator0, "x:zZJ-", linkedList0, 61);
      LinkedList<DefaultOption> linkedList1 = new LinkedList<DefaultOption>();
      SourceDestArgument sourceDestArgument0 = new SourceDestArgument(argumentImpl0, argumentImpl0, 'j', 'j', "--", linkedList1);
      linkedList0.add(sourceDestArgument0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "\"1ez(U #n_t", "\"1ez(U #n_t", '7', '7');
      LinkedList<GroupImpl> linkedList2 = new LinkedList<GroupImpl>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(sourceDestArgument0, linkedList2);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, "--");
      assertFalse(linkedList0.contains(sourceDestArgument0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "DISPLAY_GRUP_OUT/ER", "DISPLAY_GRUP_OUT/ER", 0, 0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      ListIterator<GroupImpl> listIterator0 = linkedList0.listIterator();
      groupImpl0.process(writeableCommandLineImpl0, listIterator0);
      assertEquals(0, groupImpl0.getMaximum());
      assertEquals(0, groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Passes properties and values to the application", "-D", (-2163), (-2163));
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      LinkedList<String> linkedList1 = new LinkedList<String>(set0);
      ListIterator<String> listIterator0 = linkedList1.listIterator();
      groupImpl0.process(writeableCommandLineImpl0, listIterator0);
      assertEquals("Passes properties and values to the application", groupImpl0.getPreferredName());
      assertEquals((-2163), groupImpl0.getMinimum());
      assertEquals((-2163), groupImpl0.getMaximum());
      assertEquals("-D", groupImpl0.getDescription());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = new PropertyOption("", "", 2676);
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", "-D", 2676, 2676);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      assertEquals(1, linkedList0.size());
      
      ListIterator<String> listIterator0 = (ListIterator<String>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(listIterator0).hasNext();
      doReturn("Passes properties and values to the application", (Object) null, (Object) null).when(listIterator0).next();
      doReturn((Object) null, (Object) null).when(listIterator0).previous();
      groupImpl0.process(writeableCommandLineImpl0, listIterator0);
      assertEquals(2676, groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      linkedList0.add(propertyOption0);
      PropertyOption propertyOption1 = new PropertyOption("", "", 2676);
      linkedList0.add(propertyOption1);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", "-D", 2676, 2676);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      ListIterator<String> listIterator0 = (ListIterator<String>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(listIterator0).hasNext();
      doReturn("Passes properties and values to the application", (Object) null, (Object) null).when(listIterator0).next();
      doReturn("-D", (Object) null).when(listIterator0).previous();
      groupImpl0.process(writeableCommandLineImpl0, listIterator0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Passes properties and values to the application", "Passes properties and values to the application", (-2343), (-2343));
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      LinkedList<String> linkedList1 = new LinkedList<String>();
      linkedList1.add("-D");
      ListIterator<String> listIterator0 = linkedList1.listIterator();
      groupImpl0.process(writeableCommandLineImpl0, listIterator0);
      assertEquals((-2343), groupImpl0.getMaximum());
      assertTrue(listIterator0.hasNext());
      assertEquals((-2343), groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, (String) null, (String) null, 45, 45);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      try { 
        groupImpl0.validate(writeableCommandLineImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing option 
         //
         verifyException("org.apache.commons.cli2.option.GroupImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", "", 60, 60);
      linkedList0.add(groupImpl0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      // Undeclared exception!
      try { 
        groupImpl0.validate(writeableCommandLineImpl0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = new PropertyOption();
      linkedList0.offerLast(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "eAP^/,L}F1laI:", "eAP^/,L}F1laI:", 0, 0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      groupImpl0.validate(writeableCommandLineImpl0);
      assertEquals(0, groupImpl0.getMaximum());
      assertEquals(0, groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "3S-TqUp'", "3S-TqUp'", (-386), (-386));
      linkedList0.add(groupImpl0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      writeableCommandLineImpl0.addOption(groupImpl0);
      GroupImpl groupImpl1 = new GroupImpl(linkedList0, "3S-TqUp'", "3S-TqUp'", 3, 3);
      try { 
        groupImpl1.validate(writeableCommandLineImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected 3S-TqUp' while processing 3S-TqUp'
         //
         verifyException("org.apache.commons.cli2.option.GroupImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<SourceDestArgument> linkedList0 = new LinkedList<SourceDestArgument>();
      NumberValidator numberValidator0 = NumberValidator.getNumberInstance();
      ArgumentImpl argumentImpl0 = new ArgumentImpl("so", "so", (-1), (-1), 'f', 'f', numberValidator0, "cdl/0m\"T4T}e|y)x0", linkedList0, (-1));
      SourceDestArgument sourceDestArgument0 = new SourceDestArgument(argumentImpl0, argumentImpl0);
      linkedList0.add(sourceDestArgument0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "@U", "|", (-1), (-1));
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      // Undeclared exception!
      try { 
        groupImpl0.validate(writeableCommandLineImpl0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Collections$EmptyIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, (String) null, (String) null, 0, 0);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Comparator<Command> comparator0 = (Comparator<Command>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      groupImpl0.appendUsage((StringBuffer) null, (Set) linkedHashSet0, (Comparator) comparator0, (String) null);
      assertEquals(0, groupImpl0.getMaximum());
      assertEquals(0, groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      linkedList0.offerLast(propertyOption0);
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Ix", "Ix", 0, 0);
      String string0 = groupImpl0.toString();
      assertEquals(0, groupImpl0.getMaximum());
      assertEquals("[Ix (-D<property>=<value>|-D<property>=<value>)]", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "org.apache.commons.cli2.option.SourceDestArgument", "org.apache.commons.cli2.option.SourceDestArgument", 0, 0);
      LinkedHashSet<GroupImpl> linkedHashSet0 = new LinkedHashSet<GroupImpl>();
      List list0 = groupImpl0.helpLines(0, linkedHashSet0, (Comparator) null);
      assertEquals(0, groupImpl0.getMaximum());
      assertEquals(0, list0.size());
      assertEquals(0, groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DisplaySetting displaySetting0 = mock(DisplaySetting.class, new ViolatedAssumptionAnswer());
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "DIS9LAY_ARxUMENT_BRACKETED", "DIS9LAY_ARxUMENT_BRACKETED", 2865, 2865);
      List list0 = groupImpl0.helpLines(2865, displaySetting0.ALL, (Comparator) null);
      assertEquals(1, list0.size());
      assertEquals(2865, groupImpl0.getMaximum());
      assertEquals(2865, groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DisplaySetting displaySetting0 = mock(DisplaySetting.class, new ViolatedAssumptionAnswer());
      Comparator<Command> comparator0 = (Comparator<Command>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", "", 1325, 1325);
      List list0 = groupImpl0.helpLines(1325, displaySetting0.ALL, comparator0);
      assertEquals(1325, groupImpl0.getMaximum());
      assertEquals(1325, groupImpl0.getMinimum());
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      DisplaySetting displaySetting0 = mock(DisplaySetting.class, new ViolatedAssumptionAnswer());
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "\"p", "\"p", (-1929), (-1929));
      Integer integer0 = new Integer((-1929));
      linkedList0.add(integer0);
      Comparator<GroupImpl> comparator0 = (Comparator<GroupImpl>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        groupImpl0.helpLines((-1929), displaySetting0.ALL, comparator0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to org.apache.commons.cli2.Option
         //
         verifyException("org.apache.commons.cli2.option.GroupImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = new PropertyOption("", "", 2676);
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "-D", 2676, 2676);
      Option option0 = groupImpl0.findOption("");
      assertNotNull(option0);
      assertEquals(2676, groupImpl0.getMinimum());
      assertEquals(2676, groupImpl0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "6fH~_%MC", "6fH~_%MC", 3, 3);
      linkedList0.offer(groupImpl0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      // Undeclared exception!
      try { 
        groupImpl0.defaults(writeableCommandLineImpl0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<SourceDestArgument> linkedList0 = new LinkedList<SourceDestArgument>();
      FileValidator fileValidator0 = FileValidator.getExistingDirectoryInstance();
      ArgumentImpl argumentImpl0 = new ArgumentImpl("x:zZJ-", "x:zZJ-", 61, 61, '7', 'G', fileValidator0, "joE%RX$7", linkedList0, 61);
      LinkedList<DefaultOption> linkedList1 = new LinkedList<DefaultOption>();
      SourceDestArgument sourceDestArgument0 = new SourceDestArgument(argumentImpl0, argumentImpl0, 'j', 'j', "--", linkedList1);
      linkedList0.add(sourceDestArgument0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "\"1ez(U #n_t", "\"1ez(U #n_t", '\u0000', '\u0000');
      LinkedList<GroupImpl> linkedList2 = new LinkedList<GroupImpl>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(sourceDestArgument0, linkedList2);
      groupImpl0.defaults(writeableCommandLineImpl0);
      assertFalse(linkedList0.contains(sourceDestArgument0));
      assertEquals(0, groupImpl0.getMaximum());
  }
}
