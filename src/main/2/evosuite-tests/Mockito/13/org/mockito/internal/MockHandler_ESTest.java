/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 02:11:56 GMT 2024
 */

package org.mockito.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.internal.MockHandler;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.answers.ReturnsElementsOf;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MockHandler_ESTest extends MockHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockHandler<Object> mockHandler0 = new MockHandler<Object>();
      mockHandler0.voidMethodStubbable(mockHandler0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockHandler<ReturnsElementsOf> mockHandler0 = new MockHandler<ReturnsElementsOf>();
      MockHandler<ReturnsElementsOf> mockHandler1 = new MockHandler<ReturnsElementsOf>(mockHandler0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockHandler<Object> mockHandler0 = new MockHandler<Object>();
      mockHandler0.getInvocationContainer();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockHandler<Integer> mockHandler0 = new MockHandler<Integer>();
      mockHandler0.handle((Invocation) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MockHandler<Locale.Category> mockHandler0 = new MockHandler<Locale.Category>();
      Invocation invocation0 = mock(Invocation.class, new ViolatedAssumptionAnswer());
      try { 
        mockHandler0.handle(invocation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.MockHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MockSettingsImpl mockSettingsImpl0 = new MockSettingsImpl();
      MockHandler<Locale.Category> mockHandler0 = new MockHandler<Locale.Category>(mockSettingsImpl0);
      mockHandler0.setAnswersForStubbing((List<Answer>) null);
      MockHandler<String> mockHandler1 = null;
      try {
        mockHandler1 = new MockHandler<String>(mockSettingsImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
