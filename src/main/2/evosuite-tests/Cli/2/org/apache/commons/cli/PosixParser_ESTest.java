/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 21:52:08 GMT 2024
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PosixParser_ESTest extends PosixParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      posixParser0.parse(options0, (String[]) null);
      options0.addOption("", true, "");
      posixParser0.burstToken("8$`}U@;-|", true);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = Locale.getISOLanguages();
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      String[] stringArray2 = posixParser0.flatten(options0, stringArray1, true);
      assertEquals(190, stringArray2.length);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "----=@|T\"e P";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-W";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(5, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-)gOJR9";
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
      assertEquals(14, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      String[] stringArray0 = Locale.getISOCountries();
      String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
      assertEquals(250, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      Options options1 = options0.addOption("W", "W", true, "W");
      String[] stringArray0 = new String[6];
      stringArray0[0] = "-W";
      stringArray0[1] = "W";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options1, stringArray0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      posixParser0.parse(options0, (String[]) null, false);
      options0.addOption("", "", false, "");
      posixParser0.burstToken("8$`}U@;-|", true);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-r";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PosixParser posixParser0 = new PosixParser();
      Options options0 = new Options();
      posixParser0.parse(options0, (String[]) null, true);
      options0.addOption("", true, "");
      posixParser0.burstToken("NuZ#Hs/Z+-", true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Options options0 = new Options();
      PosixParser posixParser0 = new PosixParser();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "-)gOJR9";
      // Undeclared exception!
      try { 
        posixParser0.flatten(options0, stringArray0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
