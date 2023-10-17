/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:48:18 GMT 2023
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import org.apache.commons.lang3.SystemUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SystemUtils_ESTest extends SystemUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionInt("/Users/elliottzackrone/.sdkman/candidates/java/8.0.382-amzn/jre/lib/endorsed");
      assertEquals(1182.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionInt("1.6");
      assertEquals(160.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast((-648));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(1.8F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[] intArray0 = SystemUtils.toJavaVersionIntArray(".");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch("1.2", "1.2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/elliottzackrone");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      File file0 = SystemUtils.getUserHome();
      assertTrue(file0.isDirectory());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/elliottzackrone/IdeaProjects/defects4jprefix");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      File file0 = SystemUtils.getUserDir();
      assertTrue(file0.canRead());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T");
      FileSystemHandling.setPermissions(evoSuiteFile0, false, false, false);
      File file0 = SystemUtils.getJavaIoTmpDir();
      assertEquals(1392409281320L, file0.lastModified());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/elliottzackrone/.sdkman/candidates/java/8.0.382-amzn/jre");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "Mac OS XMac OS X");
      File file0 = SystemUtils.getJavaHome();
      assertEquals("/Users/elliottzackrone/.sdkman/candidates/java/8.0.382-amzn/jre", file0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/Users/elliottzackrone/.sdkman/candidates/java/8.0.382-amzn/jre");
      FileSystemHandling.createFolder(evoSuiteFile0);
      File file0 = SystemUtils.getJavaHome();
      assertEquals("/Users/elliottzackrone/.sdkman/candidates/java/8.0.382-amzn", file0.getParent());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.toJavaVersionIntArray("/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/EvoSuite_pathingJar7249637649498281454.jar");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"7249637649498281454\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isOSNameMatch("Mac OS ", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isOSMatch(".", ".", (String) null, "Array and element cannot both be null");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        SystemUtils.isJavaVersionMatch("OpenJDK Runtime Environment", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionInt("");
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat("3D");
      assertEquals(3.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat("/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/EvoSuite_pathingJar7249637649498281454.jar");
      assertEquals(7.6892F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionInt((String) null);
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSNameMatch((String) null, "Arguments cannot both be null");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("1.7", "1.6America/Los_Angeles", "1.7", "1.7");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("1.6America/Los_Angeles", "1.6America/Los_Angeles", "1.6America/Los_Angeles", "1.6America/Los_Angeles");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("Oracle Corporation", (String) null, "Mac OS X", "Amazon.com Inc.");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch("aP?Ft1ZucjjT*w+\"W", "%R8Cs", ">CNg", ">CNg");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      boolean boolean0 = SystemUtils.isOSMatch((String) null, "Windows", (String) null, "Windows");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch((String) null, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionMatch("Windows", "Windows");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(180);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(1404);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(0.0F);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaVersionAtLeast(3.0F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = SystemUtils.isJavaAwtHeadless();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SystemUtils systemUtils0 = new SystemUtils();
      assertTrue(SystemUtils.IS_OS_MAC_OSX);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      File file0 = SystemUtils.getUserHome();
      assertEquals(1392409281320L, file0.lastModified());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      File file0 = SystemUtils.getUserDir();
      assertFalse(file0.isFile());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      File file0 = SystemUtils.getJavaHome();
      assertFalse(file0.canExecute());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      File file0 = SystemUtils.getJavaIoTmpDir();
      assertTrue(file0.exists());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int[] intArray0 = SystemUtils.toJavaVersionIntArray("1.8.0_382");
      assertEquals(4, intArray0.length);
      assertArrayEquals(new int[] {1, 8, 0, 382}, intArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      float float0 = SystemUtils.toJavaVersionFloat("_");
      assertEquals(0.0F, float0, 0.01F);
  }
}
