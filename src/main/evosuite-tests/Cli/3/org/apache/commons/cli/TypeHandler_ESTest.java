/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 22:44:31 GMT 2023
 */

package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;
import java.net.URL;
import java.util.Date;
import org.apache.commons.cli.TypeHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TypeHandler_ESTest extends TypeHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = TypeHandler.createValue((String) null, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class class0 = TypeHandler.createClass("jOXbD");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Number number0 = TypeHandler.createNumber("");
      assertNull(number0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File[] fileArray0 = TypeHandler.createFiles("aJV~dXoV'?g0:");
      assertNull(fileArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TypeHandler typeHandler0 = new TypeHandler();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      URL uRL0 = TypeHandler.createURL("lDb?p$J4@s");
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      File file0 = TypeHandler.createFile("");
      assertFalse(file0.isFile());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = TypeHandler.createValue(",9W5+1J}b!&8[", class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Class<String> class0 = String.class;
      Object object0 = TypeHandler.createValue("B.", class0);
      assertEquals("B.", object0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Date date0 = TypeHandler.createDate("Jt!^");
      assertNull(date0);
  }
}
