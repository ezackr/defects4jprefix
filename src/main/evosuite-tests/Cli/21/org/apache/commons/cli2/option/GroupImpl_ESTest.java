/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 21:47:37 GMT 2023
 */

package org.apache.commons.cli2.option;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.cli2.DisplaySetting;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.Command;
import org.apache.commons.cli2.option.GroupImpl;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.option.SourceDestArgument;
import org.apache.commons.cli2.validation.DateValidator;
import org.apache.commons.cli2.validation.NumberValidator;
import org.apache.commons.cli2.validation.UrlValidator;
import org.apache.commons.cli2.validation.Validator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GroupImpl_ESTest extends GroupImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      ListIterator<String> listIterator0 = (ListIterator<String>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false, false, false).when(listIterator0).hasNext();
      doReturn("Unexpected.token", (Object) null, (Object) null, (Object) null, (Object) null).when(listIterator0).next();
      doReturn("Unexpected.token", (Object) null, (Object) null).when(listIterator0).previous();
      DateValidator dateValidator0 = new DateValidator();
      ArgumentImpl argumentImpl0 = new ArgumentImpl("Unexpected.token", "w1n:9", 312, 312, 'g', 'j', dateValidator0, "w1n:9", linkedList0, 312);
      linkedList0.add(argumentImpl0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Unexpected.token", "Unexpected.token", 312, 312, true);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      groupImpl0.process(writeableCommandLineImpl0, listIterator0);
      assertFalse(linkedList0.contains(argumentImpl0));
      assertEquals(312, groupImpl0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Argument.missing.values", "", 6837, 1910, true);
      groupImpl0.getAnonymous();
      assertEquals("", groupImpl0.getDescription());
      assertEquals(6837, groupImpl0.getMinimum());
      assertEquals(1910, groupImpl0.getMaximum());
      assertEquals("Argument.missing.values", groupImpl0.getPreferredName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, " (", " (", 91, 91, true);
      int int0 = groupImpl0.getMaximum();
      assertEquals(91, groupImpl0.getMinimum());
      assertEquals(91, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "-D", (-931), (-931), true);
      groupImpl0.findOption("-D");
      assertEquals(1, linkedList0.size());
      assertEquals((-931), groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, (String) null, (String) null, 97, 97, false);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, (String) null);
      assertFalse(boolean0);
      assertEquals(97, groupImpl0.getMinimum());
      assertEquals(97, groupImpl0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "-D", 809, 809, true);
      LinkedList<GroupImpl> linkedList1 = new LinkedList<GroupImpl>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList1);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, "-D");
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "-D", 809, 809, true);
      LinkedList<GroupImpl> linkedList1 = new LinkedList<GroupImpl>();
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList1);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, "-D (-D<property>=<value>)");
      assertEquals(1, linkedList0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "-D", 809, 809, true);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, "Passes properties and values to the application");
      assertEquals(1, linkedList0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      PropertyOption propertyOption0 = new PropertyOption();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "2dK7j!21Y9#@- `g S", 32, 32, false);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, "-D");
      assertEquals("2dK7j!21Y9#@- `g S", groupImpl0.getDescription());
      assertEquals("-D", groupImpl0.getPreferredName());
      assertEquals(32, groupImpl0.getMaximum());
      assertEquals(32, groupImpl0.getMinimum());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      NumberValidator numberValidator0 = NumberValidator.getPercentInstance();
      ArgumentImpl argumentImpl0 = new ArgumentImpl("9F?66Q|Y\"#*", "9F?66Q|Y\"#*", 97, 97, 'd', 'd', numberValidator0, "Unexpected.token", linkedList0, 97);
      linkedList0.add(argumentImpl0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "9F?66Q|Y\"#*", "9F?66Q|Y\"#*", 97, 97, true);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      boolean boolean0 = groupImpl0.canProcess((WriteableCommandLine) writeableCommandLineImpl0, "9F?66Q|Y\"#*");
      assertFalse(linkedList0.contains(argumentImpl0));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      ListIterator<String> listIterator0 = (ListIterator<String>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(listIterator0).hasNext();
      doReturn("Argument.too.many.values", "Argument.too.many.values").when(listIterator0).next();
      doReturn("Argument.too.many.values").when(listIterator0).previous();
      PropertyOption propertyOption0 = new PropertyOption("Argument.too.many.values", "Argument.too.many.values", 0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      LinkedList<PropertyOption> linkedList1 = new LinkedList<PropertyOption>();
      linkedList1.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList1, "--", "~[B)]6@\"J||?Wg#5S5", 712, 842, true);
      try { 
        groupImpl0.process(writeableCommandLineImpl0, listIterator0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected Argument.too.many.values while processing 
         //
         verifyException("org.apache.commons.cli2.option.PropertyOption", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      ListIterator<String> listIterator0 = (ListIterator<String>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(listIterator0).hasNext();
      doReturn("Argument.too.many.values").when(listIterator0).next();
      doReturn("Argument.too.many.values").when(listIterator0).previous();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Argument.too.many.values", "Argument.too.many.values", 842, 842, true);
      PropertyOption propertyOption0 = new PropertyOption("Argument.too.many.values", "Argument.too.many.values", 0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
      groupImpl0.process(writeableCommandLineImpl0, listIterator0);
      assertEquals(842, groupImpl0.getMaximum());
      assertEquals(842, groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      ListIterator<String> listIterator0 = (ListIterator<String>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(listIterator0).hasNext();
      doReturn("Unexpected.token").when(listIterator0).next();
      doReturn("Unexpected.token").when(listIterator0).previous();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Unexpected.token", "Unexpected.token", 312, 312, true);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      groupImpl0.process(writeableCommandLineImpl0, listIterator0);
      assertEquals(312, groupImpl0.getMinimum());
      assertEquals(312, groupImpl0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      ArgumentImpl argumentImpl0 = new ArgumentImpl("Misming.option", "Misming.option", 322, 2147483645, '`', '`', (Validator) null, "Misming.option", linkedList0, 2147483645);
      linkedList0.add(argumentImpl0);
      ListIterator<String> listIterator0 = (ListIterator<String>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false, false, false, false).when(listIterator0).hasNext();
      doReturn("Misming.option", (Object) null, (Object) null, (Object) null, (Object) null).when(listIterator0).next();
      doReturn("Misming.option", (Object) null).when(listIterator0).previous();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Misming.option", "Misming.option", 322, 322, true);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      // Undeclared exception!
      groupImpl0.process(writeableCommandLineImpl0, listIterator0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "2dK7j!21Y9#@- `g S", "2dK7j!21Y9#@- `g S", (-848), (-848), true);
      linkedList0.add(groupImpl0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      assertFalse(groupImpl0.isRequired());
      
      groupImpl0.validate(writeableCommandLineImpl0);
      assertEquals((-848), groupImpl0.getMinimum());
      assertEquals((-848), groupImpl0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "2dK7j!21Y9#@- `g S", "2dK7j!21Y9#@- `g S", (-848), (-848), true);
      linkedList0.add(groupImpl0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      writeableCommandLineImpl0.addOption(groupImpl0);
      try { 
        groupImpl0.validate(writeableCommandLineImpl0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unexpected 2dK7j!21Y9#@- `g S while processing 2dK7j!21Y9#@- `g S
         //
         verifyException("org.apache.commons.cli2.option.GroupImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "kYk", "9<iME\nW^T", (-2596), 1882, false);
      linkedList0.add(groupImpl0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      writeableCommandLineImpl0.addOption(groupImpl0);
      // Undeclared exception!
      try { 
        groupImpl0.validate(writeableCommandLineImpl0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      UrlValidator urlValidator0 = new UrlValidator("");
      ArgumentImpl argumentImpl0 = new ArgumentImpl("", "", (-1), (-1), 'g', 'g', urlValidator0, " ", linkedList0, 0);
      linkedList0.offerLast(argumentImpl0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, " ", " ", 0, (-1), true);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(argumentImpl0, linkedList0);
      // Undeclared exception!
      try { 
        groupImpl0.validate(writeableCommandLineImpl0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1
         //
         verifyException("java.util.Collections$EmptyList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      LinkedList<GroupImpl> linkedList1 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", "", (-2863), (-4282), true);
      linkedList1.add(groupImpl0);
      GroupImpl groupImpl1 = new GroupImpl(linkedList1, "", "", (-4282), 1458, true);
      String string0 = groupImpl1.toString();
      assertEquals(1, linkedList1.size());
      assertEquals("[ ([ ()])]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, (String) null, (String) null, (-653), (-653), true);
      String string0 = groupImpl0.toString();
      assertEquals((-653), groupImpl0.getMaximum());
      assertEquals((-653), groupImpl0.getMinimum());
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      LinkedList<DisplaySetting> linkedList0 = new LinkedList<DisplaySetting>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, (String) null, (String) null, 992, 992, false);
      try { 
        groupImpl0.validate((WriteableCommandLine) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing option 
         //
         verifyException("org.apache.commons.cli2.option.GroupImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "|", "|", 96, 96, false);
      DisplaySetting displaySetting0 = mock(DisplaySetting.class, new ViolatedAssumptionAnswer());
      Comparator<Integer> comparator0 = (Comparator<Integer>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      StringBuffer stringBuffer0 = new StringBuffer("|");
      groupImpl0.appendUsage(stringBuffer0, displaySetting0.ALL, comparator0, "|");
      assertEquals("|| ()", stringBuffer0.toString());
      assertEquals(5, stringBuffer0.length());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      linkedList0.add(propertyOption0);
      linkedList0.add(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "-D", 1638, 1638, true);
      String string0 = groupImpl0.toString();
      assertEquals(2, linkedList0.size());
      assertEquals("-D (-D<property>=<value>|-D<property>=<value>)", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      DateValidator dateValidator0 = DateValidator.getTimeInstance();
      ArgumentImpl argumentImpl0 = new ArgumentImpl("", (String) null, 842, 842, 'g', 'G', dateValidator0, (String) null, linkedList0, (-2550));
      SourceDestArgument sourceDestArgument0 = new SourceDestArgument(argumentImpl0, argumentImpl0, '\u0000', '\u0000', (String) null, linkedList0);
      linkedList0.offerFirst(sourceDestArgument0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Argument.too.many.values", "Argument.too.many.values", 842, 842, true);
      groupImpl0.toString();
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Argument.too.many.values", "Argument.too.many.values", 842, 842, true);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      Comparator<Command> comparator0 = (Comparator<Command>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      List list0 = groupImpl0.helpLines(842, linkedHashSet0, comparator0);
      assertEquals(842, groupImpl0.getMinimum());
      assertEquals(0, list0.size());
      assertEquals(842, groupImpl0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LinkedList<GroupImpl> linkedList0 = new LinkedList<GroupImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", "", 32, 32, false);
      linkedList0.add(groupImpl0);
      DisplaySetting displaySetting0 = mock(DisplaySetting.class, new ViolatedAssumptionAnswer());
      Comparator<PropertyOption> comparator0 = (Comparator<PropertyOption>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      groupImpl0.helpLines(2305, displaySetting0.ALL, comparator0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      DateValidator dateValidator0 = DateValidator.getTimeInstance();
      ArgumentImpl argumentImpl0 = new ArgumentImpl("", (String) null, 842, 842, 'g', 'G', dateValidator0, (String) null, linkedList0, (-2550));
      SourceDestArgument sourceDestArgument0 = new SourceDestArgument(argumentImpl0, argumentImpl0, '\u0000', '\u0000', (String) null, linkedList0);
      linkedList0.offerFirst(sourceDestArgument0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "Argument.too.many.values", "Argument.too.many.values", 842, 842, true);
      DisplaySetting displaySetting0 = mock(DisplaySetting.class, new ViolatedAssumptionAnswer());
      List list0 = groupImpl0.helpLines(223, displaySetting0.ALL, (Comparator) null);
      assertEquals(0, linkedList0.size());
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "N4hr$9|djnLV!", "N4hr$9|djnLV!", 50, 50, false);
      ArgumentImpl argumentImpl0 = new ArgumentImpl("N4hr$9|djnLV!", "N4hr$9|djnLV!", 50, 50, 'Y', 'Y', (Validator) null, "N4hr$9|djnLV!", linkedList0, 50);
      linkedList0.add(argumentImpl0);
      groupImpl0.findOption("N4hr$9|djnLV!");
      assertEquals(50, groupImpl0.getMinimum());
      assertEquals(50, groupImpl0.getMaximum());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      Boolean boolean0 = Boolean.valueOf("Passes properties and values to the application");
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "-D", 809, 809, (boolean) boolean0);
      groupImpl0.setParent(propertyOption0);
      groupImpl0.toString();
      assertFalse(groupImpl0.isRequired());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
      PropertyOption propertyOption0 = PropertyOption.INSTANCE;
      Boolean boolean0 = new Boolean("Passes properties and values to the application");
      linkedList0.addFirst(propertyOption0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "-D", (-1592), (-1592), (boolean) boolean0);
      WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
      groupImpl0.defaults(writeableCommandLineImpl0);
      assertEquals(1, linkedList0.size());
      assertEquals((-1592), groupImpl0.getMinimum());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ArgumentImpl argumentImpl0 = new ArgumentImpl("", "DISPLAY_GROUP_OUTER", (-3969), (-431), 'N', 'N', (Validator) null, "Argument.too.few.defaults", linkedList0, 46);
      LinkedList<ArgumentImpl> linkedList1 = new LinkedList<ArgumentImpl>();
      linkedList1.add(argumentImpl0);
      GroupImpl groupImpl0 = new GroupImpl(linkedList1, "Argument.too.few.defaults", "i#<x0zt", (-431), 255, true);
      // Undeclared exception!
      try { 
        groupImpl0.defaults((WriteableCommandLine) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli2.option.ArgumentImpl", e);
      }
  }
}
