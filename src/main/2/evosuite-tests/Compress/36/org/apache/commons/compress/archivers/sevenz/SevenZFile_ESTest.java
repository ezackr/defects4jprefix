/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 14:20:05 GMT 2024
 */

package org.apache.commons.compress.archivers.sevenz;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SevenZFile_ESTest extends SevenZFile_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/r gE]W`q[M*B)9,Wv<+0r gE]W`q[M*B)9,Wv<+");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "r gE]W`q[M*B)9,Wv<+");
      File file0 = MockFile.createTempFile("r gE]W`q[M*B)9,Wv<+", "r gE]W`q[M*B)9,Wv<+");
      SevenZFile sevenZFile0 = null;
      try {
        sevenZFile0 = new SevenZFile(file0);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Unsupported 7z version (96,113)
         //
         verifyException("org.apache.commons.compress.archivers.sevenz.SevenZFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      boolean boolean0 = SevenZFile.matches(byteArray0, (byte)0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)55;
      boolean boolean0 = SevenZFile.matches(byteArray0, (byte)55);
      assertFalse(boolean0);
  }
}
