/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 05:36:18 GMT 2023
 */

package org.mockito.internal.stubbing.answers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockError;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.stubbing.answers.AnswersValidator;
import org.mockito.internal.stubbing.answers.DoesNothing;
import org.mockito.internal.stubbing.answers.Returns;
import org.mockito.internal.stubbing.answers.ThrowsException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AnswersValidator_ESTest extends AnswersValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      Returns returns0 = new Returns(answersValidator0);
      // Undeclared exception!
      try { 
        answersValidator0.validate(returns0, (Invocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.stubbing.answers.AnswersValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      MockError mockError0 = new MockError();
      ThrowsException throwsException0 = new ThrowsException(mockError0);
      answersValidator0.validate(throwsException0, (Invocation) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DoesNothing doesNothing0 = new DoesNothing();
      AnswersValidator answersValidator0 = new AnswersValidator();
      // Undeclared exception!
      try { 
        answersValidator0.validate(doesNothing0, (Invocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.stubbing.answers.AnswersValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      ThrowsException throwsException0 = new ThrowsException((Throwable) null);
      // Undeclared exception!
      try { 
        answersValidator0.validate(throwsException0, (Invocation) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException();
      ThrowsException throwsException0 = new ThrowsException(mockRuntimeException0);
      answersValidator0.validate(throwsException0, (Invocation) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AnswersValidator answersValidator0 = new AnswersValidator();
      MockThrowable mockThrowable0 = new MockThrowable();
      ThrowsException throwsException0 = new ThrowsException(mockThrowable0);
      // Undeclared exception!
      try { 
        answersValidator0.validate(throwsException0, (Invocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.internal.stubbing.answers.AnswersValidator", e);
      }
  }
}
