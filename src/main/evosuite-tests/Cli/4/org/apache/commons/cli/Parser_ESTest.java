/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 22:47:11 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Properties;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Parser_ESTest extends Parser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Options options0 = new Options();
      BasicParser basicParser0 = new BasicParser();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-";
      CommandLine commandLine0 = basicParser0.parse(options0, stringArray0, (Properties) null, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-";
      BasicParser basicParser0 = new BasicParser();
      // Undeclared exception!
      try { 
        basicParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      BasicParser basicParser0 = new BasicParser();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      CommandLine commandLine0 = basicParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      BasicParser basicParser0 = new BasicParser();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "5|?wbcbg.8.%^VH$";
      // Undeclared exception!
      try { 
        basicParser0.parse(options0, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Options options0 = new Options();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-org.apache.commons.cli.UnrecognizedOptio7Exception";
      PosixParser posixParser0 = new PosixParser();
      Properties properties0 = new Properties();
      CommandLine commandLine0 = posixParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      properties0.put("", "");
      GnuParser gnuParser0 = new GnuParser();
      // Undeclared exception!
      try { 
        gnuParser0.parse(options0, (String[]) null, properties0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      GnuParser gnuParser0 = new GnuParser();
      OptionGroup optionGroup0 = new OptionGroup();
      optionGroup0.setRequired(true);
      String[] stringArray0 = new String[8];
      stringArray0[0] = "-yes";
      options0.addOptionGroup(optionGroup0);
      try { 
        gnuParser0.parse(options0, stringArray0, properties0, true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // []
         //
         verifyException("org.apache.commons.cli.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("yes", "-G-", true, "-yes");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      GnuParser gnuParser0 = new GnuParser();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-yes";
      stringArray0[1] = "yes";
      stringArray0[2] = "-yes";
      CommandLine commandLine0 = gnuParser0.parse(options1, stringArray0, properties0);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GnuParser gnuParser0 = new GnuParser();
      Option option0 = new Option("yes", "--", true, "--");
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("(axm6:=G)CZzKbg");
      Options options0 = new Options();
      gnuParser0.parse(options0, (String[]) null, true);
      ListIterator<String> listIterator0 = linkedList0.listIterator(0);
      gnuParser0.processArgs(option0, listIterator0);
      assertFalse(option0.hasArgs());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      GnuParser gnuParser0 = new GnuParser();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("yes", "-G-", true, ":jfO.Us~s");
      optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "-yes";
      try { 
        gnuParser0.parse(options1, stringArray0, properties0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Missing argument for option:yes
         //
         verifyException("org.apache.commons.cli.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ListIterator<Object> listIterator0 = (ListIterator<Object>) mock(ListIterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(listIterator0).hasNext();
      Option option0 = new Option("", "yes", false, "yes");
      option0.setOptionalArg(true);
      BasicParser basicParser0 = new BasicParser();
      basicParser0.processArgs(option0, listIterator0);
      assertFalse(option0.hasArg());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      BasicParser basicParser0 = new BasicParser();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-N";
      try { 
        basicParser0.parse(options0, stringArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unrecognized option: -N
         //
         verifyException("org.apache.commons.cli.Parser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      GnuParser gnuParser0 = new GnuParser();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("yes", "-yes", false, "--");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      options0.addOptionGroup(optionGroup1);
      String[] stringArray0 = new String[9];
      option0.setRequired(true);
      stringArray0[0] = "-yes";
      stringArray0[1] = "--";
      CommandLine commandLine0 = gnuParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      GnuParser gnuParser0 = new GnuParser();
      Option option0 = new Option("yes", "-yes", false, "-G-");
      options0.addOption(option0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "-yes";
      stringArray0[1] = "-G-";
      CommandLine commandLine0 = gnuParser0.parse(options0, stringArray0, properties0, true);
      assertNotNull(commandLine0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Options options0 = new Options();
      Properties properties0 = new Properties();
      GnuParser gnuParser0 = new GnuParser();
      OptionGroup optionGroup0 = new OptionGroup();
      Option option0 = new Option("yes", "-yes", false, "--");
      OptionGroup optionGroup1 = optionGroup0.addOption(option0);
      Options options1 = options0.addOptionGroup(optionGroup1);
      String[] stringArray0 = new String[9];
      optionGroup1.setRequired(true);
      stringArray0[0] = "-yes";
      stringArray0[1] = "--";
      CommandLine commandLine0 = gnuParser0.parse(options1, stringArray0, properties0, false);
      assertNotNull(commandLine0);
  }
}
