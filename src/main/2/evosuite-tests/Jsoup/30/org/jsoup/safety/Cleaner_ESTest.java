/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 02:37:18 GMT 2024
 */

package org.jsoup.safety;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Cleaner_ESTest extends Cleaner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.relaxed();
      Cleaner cleaner0 = new Cleaner(whitelist0);
      Document document0 = Document.createShell("G");
      Document document1 = cleaner0.clean(document0);
      assertNotSame(document1, document0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.none();
      Cleaner cleaner0 = new Cleaner(whitelist0);
      Document document0 = new Document("3Q_k{4_14#/sDx3@n");
      Document document1 = cleaner0.clean(document0);
      assertNotSame(document1, document0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.relaxed();
      Document document0 = Document.createShell("?5n_!_M]7G0MC!I");
      document0.text("?5n_!_M]7G0MC!I");
      Cleaner cleaner0 = new Cleaner(whitelist0);
      boolean boolean0 = cleaner0.isValid(document0);
      assertTrue(boolean0);
  }
}
