/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 23:02:31 GMT 2023
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Position;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.rhino.Node;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SourceMap_ESTest extends SourceMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SourceMap.Mapping sourceMap_Mapping0 = new SourceMap.Mapping();
      sourceMap_Mapping0.originalPosition = null;
      MockFileWriter mockFileWriter0 = new MockFileWriter("nh1d.", false);
      Position position0 = new Position((-596), (-596));
      sourceMap_Mapping0.originalPosition = position0;
      sourceMap_Mapping0.appendTo(mockFileWriter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SourceMap sourceMap0 = new SourceMap();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        sourceMap0.appendTo(stringWriter0, "I");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SourceMap sourceMap0 = new SourceMap();
      sourceMap0.setStartingPosition(62, 62);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SourceMap sourceMap0 = new SourceMap();
      sourceMap0.reset();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SourceMap.Mapping sourceMap_Mapping0 = new SourceMap.Mapping();
      sourceMap_Mapping0.originalPosition = null;
      sourceMap_Mapping0.originalName = "nh1d.";
      MockFileWriter mockFileWriter0 = new MockFileWriter("nh1d.");
      Position position0 = new Position((-596), (-596));
      sourceMap_Mapping0.originalPosition = position0;
      sourceMap_Mapping0.appendTo(mockFileWriter0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SourceMap sourceMap0 = new SourceMap();
      Node node0 = Node.newNumber(0.0);
      Position position0 = new Position((-1), 38);
      sourceMap0.addMapping(node0, position0, position0);
      assertEquals(44, Node.IS_OPTIONAL_PARAM);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SourceMap sourceMap0 = new SourceMap();
      sourceMap0.setWrapperPrefix("]\n");
  }
}
