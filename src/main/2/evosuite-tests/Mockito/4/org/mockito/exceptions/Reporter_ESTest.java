/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 01:23:43 GMT 2024
 */

package org.mockito.exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.BatchUpdateException;
import java.sql.SQLClientInfoException;
import java.sql.SQLRecoverableException;
import java.sql.SQLTransactionRollbackException;
import java.sql.SQLWarning;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.base.MockitoAssertionError;
import org.mockito.internal.debugging.LocationImpl;
import org.mockito.internal.debugging.VerboseMockInvocationLogger;
import org.mockito.internal.exceptions.VerificationAwareInvocation;
import org.mockito.internal.exceptions.stacktrace.StackTraceFilter;
import org.mockito.internal.invocation.InvocationImpl;
import org.mockito.internal.matchers.LocalizedMatcher;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.invocation.DescribedInvocation;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.invocation.Location;
import org.mockito.mock.SerializableMode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Reporter_ESTest extends Reporter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<LocalizedMatcher> class0 = LocalizedMatcher.class;
      // Undeclared exception!
      try { 
        reporter0.cannotMockFinalClass(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.extraInterfacesDoesNotAcceptNullParameters();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.wrongTypeOfReturnValue("7Ie1G;g763~", "7Ie1G;g763~", "7Ie1G;g763~");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.invalidArgumentRangeAtIdentityAnswerCreationTime();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.cannotInitializeForSpyAnnotation("", (Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      org.mockito.internal.reporting.Discrepancy discrepancy0 = new org.mockito.internal.reporting.Discrepancy(0, 1);
      // Undeclared exception!
      try { 
        reporter0.tooLittleActualInvocations(discrepancy0, (DescribedInvocation) null, (Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.noMoreInteractionsWantedInOrder((Invocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      SerializableMode serializableMode0 = SerializableMode.NONE;
      // Undeclared exception!
      try { 
        reporter0.usingConstructorWithFancySerializable(serializableMode0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.mocksHaveToBePassedWhenCreatingInOrder();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.notAMockPassedWhenCreatingInOrder();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.inOrderRequiresFamiliarMock();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.cannotVerifyToString();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.delegatedMethodDoesNotExistOnDelegate((Method) null, (Object) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.invocationListenerDoesNotAcceptNullParameters();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.tooManyActualInvocationsInOrder((-857), (-857), (DescribedInvocation) null, (Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.cannotInitializeForInjectMocksAnnotation("(CZ%[D}", (Exception) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      LocationImpl locationImpl0 = new LocationImpl();
      // Undeclared exception!
      try { 
        reporter0.unfinishedVerificationException(locationImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.tooManyActualInvocations((-1), (-1), (DescribedInvocation) null, (Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.spyAndDelegateAreMutuallyExclusive();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.defaultAnswerDoesNotAcceptNullParameter();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.cannotStubWithNullThrowable();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      ArrayList<InvocationImpl> arrayList0 = new ArrayList<InvocationImpl>();
      // Undeclared exception!
      try { 
        reporter0.wantedButNotInvoked((DescribedInvocation) null, (List<? extends DescribedInvocation>) arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.extraInterfacesRequiresAtLeastOneInterface();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.wantedButNotInvokedInOrder((DescribedInvocation) null, (DescribedInvocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.invocationListenersRequiresAtLeastOneListener();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.cannotStubVoidMethodWithAReturnValue("qHBVSx9T5;Rz;)J%");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.moreThanOneAnnotationNotAllowed("U");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.nullPassedToWhenMethod();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Stack<LocalizedMatcher> stack0 = new Stack<LocalizedMatcher>();
      // Undeclared exception!
      try { 
        reporter0.incorrectUseOfAdditionalMatchers(">lH|6", 7, stack0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        reporter0.notAMockPassedToVerify(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.unsupportedCombinationOfAnnotations("J#r9)?!]_Ms", "J#r9)?!]_Ms");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.incorrectUseOfApi();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.onlyVoidMethodsCanBeSetToDoNothing();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.atMostAndNeverShouldNotBeUsedWithTimeout();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.notAMockPassedToWhenMethod();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.wantedAtMostX((-2), (-2));
        fail("Expecting exception: MockitoAssertionError");
      
      } catch(MockitoAssertionError e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.delegatedMethodHasWrongReturnType((Method) null, (Method) null, (Object) null, (Object) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.nullPassedToVerify();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.argumentsAreDifferent(" cannot be returned by ", " cannot be returned by ", (Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        reporter0.extraInterfacesAcceptsOnlyInterfaces(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<InvocationImpl> class0 = InvocationImpl.class;
      // Undeclared exception!
      try { 
        reporter0.serializableWontWorkForObjectsThatDontImplementSerializable(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.mocksHaveToBePassedToVerifyNoMoreInteractions();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      LocationImpl locationImpl0 = new LocationImpl();
      // Undeclared exception!
      try { 
        reporter0.smartNullPointerException("", locationImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      LocationImpl locationImpl0 = new LocationImpl();
      // Undeclared exception!
      try { 
        reporter0.unfinishedStubbing(locationImpl0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.nullPassedWhenCreatingInOrder();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      SQLWarning sQLWarning0 = new SQLWarning();
      // Undeclared exception!
      try { 
        reporter0.checkedExceptionInvalid(sQLWarning0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.noArgumentValueWasCaptured();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      SQLRecoverableException sQLRecoverableException0 = new SQLRecoverableException("", "", 0);
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException("", "", sQLRecoverableException0);
      // Undeclared exception!
      try { 
        reporter0.fieldInitialisationThrewException((Field) null, sQLTransactionRollbackException0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      LinkedList<LocalizedMatcher> linkedList0 = new LinkedList<LocalizedMatcher>();
      // Undeclared exception!
      try { 
        reporter0.misplacedArgumentMatcher(linkedList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      VerboseMockInvocationLogger verboseMockInvocationLogger0 = new VerboseMockInvocationLogger();
      BatchUpdateException batchUpdateException0 = new BatchUpdateException();
      // Undeclared exception!
      try { 
        reporter0.invocationListenerThrewException(verboseMockInvocationLogger0, batchUpdateException0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Vector<VerificationAwareInvocation> vector0 = new Vector<VerificationAwareInvocation>();
      // Undeclared exception!
      try { 
        reporter0.noMoreInteractionsWanted((Invocation) null, vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.wantedButNotInvoked((DescribedInvocation) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.nullPassedToVerifyNoMoreInteractions();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<InvocationImpl> class0 = InvocationImpl.class;
      // Undeclared exception!
      try { 
        reporter0.mockedTypeIsInconsistentWithSpiedInstanceType(class0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.cannotCallAbstractRealMethod();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.stubPassedToVerify();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.tooLittleActualInvocationsInOrder((org.mockito.internal.reporting.Discrepancy) null, (DescribedInvocation) null, (Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.neverWantedButInvoked((DescribedInvocation) null, (Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        reporter0.mockedTypeIsInconsistentWithDelegatedInstanceType(class0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.notAMockPassedToVerifyNoMoreInteractions();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      SQLClientInfoException sQLClientInfoException0 = new SQLClientInfoException();
      // Undeclared exception!
      try { 
        reporter0.cannotInjectDependency((Field) null, (Object) null, sQLClientInfoException0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.missingMethodInvocation();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<StubbedInvocationMatcher> class0 = StubbedInvocationMatcher.class;
      // Undeclared exception!
      try { 
        reporter0.wrongTypeOfArgumentToReturn((InvocationOnMock) null, "    not: verify(mock.someMethod());", class0, 1062);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.reportNoSubMatchersFound("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        reporter0.extraInterfacesCannotContainMockedType(class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      LinkedList<LocalizedMatcher> linkedList0 = new LinkedList<LocalizedMatcher>();
      linkedList0.add((LocalizedMatcher) null);
      // Undeclared exception!
      try { 
        reporter0.invalidUseOfMatchers(1024, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ArrayList<InvocationImpl> arrayList0 = new ArrayList<InvocationImpl>();
      arrayList0.add((InvocationImpl) null);
      Reporter reporter0 = new Reporter();
      // Undeclared exception!
      try { 
        reporter0.wantedButNotInvoked((DescribedInvocation) null, (List<? extends DescribedInvocation>) arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Reporter reporter0 = new Reporter();
      org.mockito.internal.reporting.Discrepancy discrepancy0 = new org.mockito.internal.reporting.Discrepancy(207, 207);
      StackTraceFilter stackTraceFilter0 = new StackTraceFilter();
      LocationImpl locationImpl0 = new LocationImpl(stackTraceFilter0);
      // Undeclared exception!
      try { 
        reporter0.tooLittleActualInvocationsInOrder(discrepancy0, (DescribedInvocation) null, locationImpl0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.exceptions.Reporter", e);
      }
  }
}
