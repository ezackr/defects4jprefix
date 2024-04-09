/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 08 02:11:56 GMT 2024
 */

package org.mockito.internal;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class MockHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.MockHandler"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MockHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.util.ObjectMethodsGuru",
      "org.mockito.internal.verification.AtLeast",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.cglib.core.ClassNameReader$1",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod",
      "org.mockito.cglib.proxy.CallbackGenerator",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.cglib.core.ObjectSwitchCallback",
      "org.mockito.internal.stubbing.OngoingStubbingImpl",
      "org.mockito.exceptions.misusing.NotAMockException",
      "org.mockito.cglib.core.ClassEmitter$FieldInfo",
      "org.mockito.exceptions.verification.SmartNullPointerException",
      "org.hamcrest.collection.IsArrayContainingInOrder",
      "org.mockito.internal.progress.MockingProgressImpl",
      "org.mockito.cglib.core.Local",
      "org.hamcrest.collection.IsArrayWithSize",
      "org.mockito.cglib.core.ClassNameReader$EarlyExitException",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.cglib.core.MethodWrapper",
      "org.mockito.cglib.core.MethodInfoTransformer",
      "org.mockito.cglib.core.DuplicatesPredicate",
      "org.mockito.verification.VerificationMode",
      "org.mockito.asm.Item",
      "org.mockito.cglib.core.Transformer",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.mockito.internal.progress.IOngoingStubbing",
      "org.mockito.internal.verification.VerificationModeFactory",
      "org.mockito.cglib.proxy.MethodProxy$CreateInfo",
      "org.hamcrest.DiagnosingMatcher",
      "org.hamcrest.BaseDescription",
      "org.hamcrest.core.IsNot",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.hamcrest.core.AllOf",
      "org.hamcrest.core.Every",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.EmitUtils$15",
      "org.mockito.stubbing.Answer",
      "org.mockito.cglib.core.ClassEmitter$3",
      "org.mockito.cglib.core.EmitUtils$16",
      "org.mockito.internal.progress.ArgumentMatcherStorageImpl",
      "org.hamcrest.beans.SamePropertyValuesAs",
      "org.mockito.cglib.core.EmitUtils$13",
      "org.mockito.cglib.core.EmitUtils$14",
      "org.mockito.cglib.core.EmitUtils$11",
      "org.mockito.cglib.core.EmitUtils$12",
      "org.mockito.cglib.core.ProcessArrayCallback",
      "org.mockito.cglib.core.EmitUtils$10",
      "org.hamcrest.core.IsEqual",
      "org.mockito.asm.Opcodes",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.cglib.core.VisibilityPredicate",
      "org.mockito.internal.util.ListUtil",
      "org.mockito.exceptions.misusing.WrongTypeOfReturnValue",
      "org.mockito.MockSettings",
      "org.hamcrest.object.IsCompatibleType",
      "org.mockito.cglib.core.EmitUtils$ArrayDelimiters",
      "org.mockito.cglib.reflect.FastClassEmitter",
      "org.hamcrest.text.IsEmptyString",
      "org.mockito.exceptions.base.MockitoAssertionError",
      "org.hamcrest.core.CombinableMatcher$CombinableEitherMatcher",
      "org.mockito.internal.invocation.InvocationMarker",
      "org.mockito.asm.ClassVisitor",
      "org.hamcrest.collection.IsIterableWithSize",
      "org.mockito.cglib.core.CodeGenerationException",
      "org.mockito.exceptions.verification.NeverWantedButInvoked",
      "org.mockito.cglib.core.CollectionUtils",
      "org.hamcrest.Matcher",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.internal.util.MockName",
      "org.mockito.internal.creation.SerializableMockitoMethodProxy",
      "org.mockito.cglib.core.KeyFactory$2",
      "org.mockito.cglib.core.KeyFactory$1",
      "org.hamcrest.collection.IsEmptyIterable",
      "org.mockito.cglib.core.Customizer",
      "org.mockito.cglib.core.Block",
      "org.mockito.verification.Timeout",
      "org.hamcrest.collection.IsArrayContainingInAnyOrder",
      "org.mockito.exceptions.Reporter",
      "org.hamcrest.collection.IsEmptyCollection",
      "org.mockito.internal.verification.VerificationWithTimeoutImpl",
      "org.mockito.cglib.reflect.FastClass",
      "org.mockito.stubbing.VoidMethodStubbable",
      "org.mockito.ArgumentMatcher",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.hamcrest.core.StringContains",
      "org.mockito.cglib.core.NamingPolicy",
      "org.mockito.internal.verification.RegisteredInvocations",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.verification.VerificationWithTimeout",
      "org.mockito.internal.MockHandler",
      "org.hamcrest.TypeSafeMatcher",
      "org.mockito.internal.verification.AtMost",
      "org.mockito.cglib.core.DebuggingClassWriter$1",
      "org.hamcrest.text.IsEqualIgnoringCase",
      "org.mockito.exceptions.verification.ArgumentsAreDifferent",
      "org.hamcrest.Condition$NotMatched",
      "org.hamcrest.SelfDescribing",
      "org.hamcrest.Description$NullDescription",
      "org.mockito.asm.FieldWriter",
      "org.mockito.exceptions.misusing.InvalidUseOfMatchersException",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator",
      "org.mockito.internal.invocation.Invocation",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.hamcrest.internal.SelfDescribingValue",
      "org.mockito.cglib.core.CodeEmitter",
      "org.hamcrest.internal.ReflectiveTypeFinder",
      "org.hamcrest.core.CombinableMatcher",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.invocation.realmethod.HasCGLIBMethodProxy",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.internal.MockHandlerInterface",
      "org.mockito.internal.listeners.CollectCreatedMocks",
      "org.mockito.internal.verification.Only",
      "org.mockito.internal.stubbing.ConsecutiveStubbing",
      "org.mockito.asm.Edge",
      "org.mockito.asm.Label",
      "org.mockito.cglib.core.Signature",
      "org.mockito.internal.stubbing.BaseStubbing",
      "org.mockito.internal.debugging.Location",
      "org.mockito.cglib.core.EmitUtils$5",
      "org.mockito.cglib.core.EmitUtils$8",
      "org.mockito.cglib.core.EmitUtils$9",
      "org.mockito.cglib.core.EmitUtils$6",
      "org.hamcrest.text.StringContainsInOrder",
      "org.mockito.cglib.core.EmitUtils$7",
      "org.hamcrest.core.IsCollectionContaining",
      "org.hamcrest.collection.IsMapContaining",
      "org.mockito.asm.Frame",
      "org.mockito.asm.ClassWriter",
      "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod",
      "org.hamcrest.collection.IsIterableContainingInAnyOrder",
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.internal.matchers.ContainsExtraTypeInformation",
      "org.hamcrest.StringDescription",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator$1",
      "org.mockito.internal.stubbing.InvocationContainer",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.hamcrest.core.Is",
      "org.mockito.internal.stubbing.InvocationContainerImpl",
      "org.hamcrest.collection.IsIn",
      "org.mockito.internal.invocation.realmethod.RealMethod",
      "org.mockito.cglib.core.GeneratorStrategy",
      "org.mockito.internal.verification.MockAwareVerificationMode",
      "org.mockito.internal.progress.MockingProgress",
      "org.hamcrest.core.SubstringMatcher",
      "org.hamcrest.number.IsCloseTo",
      "org.mockito.exceptions.misusing.MissingMethodInvocationException",
      "org.hamcrest.CustomMatcher",
      "org.hamcrest.Condition",
      "org.mockito.exceptions.verification.TooLittleActualInvocations",
      "org.mockito.internal.invocation.StubInfo",
      "org.hamcrest.core.DescribedAs",
      "org.mockito.stubbing.DeprecatedOngoingStubbing",
      "org.mockito.exceptions.verification.TooManyActualInvocations",
      "org.mockito.cglib.reflect.FastClass$Generator",
      "org.hamcrest.beans.SamePropertyValuesAs$PropertyMatcher",
      "org.mockito.asm.FieldVisitor",
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.internal.invocation.MockitoMethod",
      "org.hamcrest.number.OrderingComparison",
      "org.mockito.internal.debugging.Localized",
      "org.mockito.internal.util.ListUtil$Filter",
      "org.hamcrest.CustomTypeSafeMatcher",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.cglib.proxy.MethodProxy$FastClassInfo",
      "org.hamcrest.TypeSafeDiagnosingMatcher",
      "org.hamcrest.BaseMatcher",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.internal.verification.Times",
      "org.mockito.invocation.InvocationOnMock",
      "org.hamcrest.collection.IsCollectionWithSize",
      "org.hamcrest.core.IsSame",
      "org.hamcrest.Condition$Matched",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.hamcrest.beans.HasProperty",
      "org.hamcrest.object.HasToString",
      "org.hamcrest.object.IsEventFrom",
      "org.mockito.stubbing.OngoingStubbing",
      "org.mockito.cglib.core.Predicate",
      "org.mockito.internal.progress.ArgumentMatcherStorage",
      "org.mockito.internal.matchers.Equals",
      "org.mockito.internal.matchers.LocalizedMatcher",
      "org.mockito.internal.verification.RegisteredInvocations$RemoveToString",
      "org.hamcrest.core.IsNull",
      "org.hamcrest.collection.IsIterableContainingInOrder",
      "org.hamcrest.collection.IsArray",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockito.asm.Handler",
      "org.mockito.internal.invocation.MatchersBinder",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.cglib.core.Constants",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.hamcrest.Condition$Step",
      "org.mockito.internal.creation.DelegatingMethod",
      "org.mockito.exceptions.verification.VerificationInOrderFailure",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.exceptions.misusing.NullInsteadOfMockException",
      "org.mockito.internal.creation.DelegatingMockitoMethodProxy",
      "org.mockito.internal.util.StringJoiner",
      "org.hamcrest.core.CombinableMatcher$CombinableBothMatcher",
      "org.hamcrest.core.StringEndsWith",
      "org.hamcrest.core.StringStartsWith",
      "org.hamcrest.text.IsEqualIgnoringWhiteSpace",
      "org.mockito.cglib.core.ReflectUtils$4",
      "org.mockito.cglib.core.ReflectUtils$2",
      "org.mockito.cglib.core.ReflectUtils$3",
      "org.hamcrest.xml.HasXPath",
      "org.mockito.asm.ByteVector",
      "org.mockito.cglib.core.ReflectUtils$1",
      "org.hamcrest.beans.HasPropertyWithValue",
      "org.mockito.internal.matchers.MatcherDecorator",
      "org.mockito.internal.creation.MockitoMethodProxy",
      "org.mockito.internal.reporting.PrintingFriendlyInvocation",
      "org.mockito.cglib.reflect.FastClassEmitter$3",
      "org.mockito.cglib.reflect.FastClassEmitter$4",
      "org.mockito.cglib.core.AbstractClassGenerator$1",
      "org.mockito.internal.util.reflection.Whitebox",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.cglib.reflect.FastClassEmitter$1",
      "org.mockito.cglib.core.MethodWrapper$MethodWrapperKey",
      "org.mockito.cglib.core.ProcessSwitchCallback",
      "org.mockito.cglib.core.ClassNameReader",
      "org.mockito.cglib.core.AbstractClassGenerator$Source",
      "org.hamcrest.Condition$1",
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.hamcrest.collection.IsArrayContaining",
      "org.mockito.cglib.core.EmitUtils$ParameterTyper",
      "org.mockito.internal.listeners.MockingProgressListener",
      "org.mockito.exceptions.verification.NoInteractionsWanted",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.internal.creation.AbstractMockitoMethodProxy",
      "org.mockito.internal.invocation.CapturesArgumensFromInvocation",
      "org.mockito.exceptions.PrintableInvocation",
      "org.mockito.asm.ClassReader",
      "org.mockito.internal.verification.VerificationDataImpl",
      "org.mockito.internal.matchers.CapturesArguments",
      "org.mockito.internal.verification.api.VerificationData",
      "org.hamcrest.core.AnyOf",
      "org.mockito.internal.stubbing.VoidMethodStubbableImpl",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.exceptions.verification.WantedButNotInvoked",
      "org.mockito.asm.MethodWriter",
      "org.hamcrest.core.ShortcutCombination",
      "org.hamcrest.core.IsAnything",
      "org.hamcrest.Factory",
      "org.mockito.stubbing.answers.ReturnsElementsOf",
      "org.hamcrest.core.IsInstanceOf",
      "org.mockito.internal.invocation.InvocationsFinder",
      "org.hamcrest.Description",
      "org.hamcrest.number.BigDecimalCloseTo",
      "org.mockito.asm.Attribute",
      "org.mockito.internal.MockitoInvocationHandler",
      "org.mockito.internal.listeners.MockingStartedListener",
      "org.mockito.asm.AnnotationVisitor",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.reflect.FastClassEmitter$GetIndexCallback",
      "org.mockito.internal.progress.HandyReturnValues",
      "org.mockito.cglib.proxy.MethodProxy",
      "org.hamcrest.FeatureMatcher",
      "org.mockito.asm.MethodVisitor",
      "org.mockito.internal.verification.api.VerificationInOrderMode",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.internal.reporting.PrintSettings",
      "org.mockito.cglib.core.ClassGenerator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.mockito.internal.invocation.Invocation", false, MockHandler_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MockHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.internal.MockHandler",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.internal.util.MockName",
      "org.mockito.internal.invocation.MatchersBinder",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.internal.stubbing.InvocationContainerImpl",
      "org.mockito.internal.verification.RegisteredInvocations",
      "org.mockito.internal.stubbing.VoidMethodStubbableImpl",
      "org.mockito.internal.invocation.Invocation",
      "org.mockito.internal.progress.ArgumentMatcherStorageImpl",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.stubbing.answers.ReturnsElementsOf",
      "org.mockito.internal.progress.MockingProgressImpl",
      "org.mockito.exceptions.Reporter",
      "org.mockito.verification.VerificationWithTimeout",
      "org.mockito.internal.verification.VerificationWithTimeoutImpl",
      "org.mockito.internal.verification.MockAwareVerificationMode",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.internal.stubbing.BaseStubbing",
      "org.mockito.internal.stubbing.OngoingStubbingImpl",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.internal.exceptions.base.ConditionalStackTraceFilter",
      "org.mockito.internal.exceptions.base.StackTraceFilter",
      "org.mockito.internal.verification.RegisteredInvocations$RemoveToString",
      "org.mockito.internal.util.ListUtil",
      "org.mockito.internal.invocation.realmethod.FilteredCGLIBProxyRealMethod",
      "org.mockito.internal.invocation.realmethod.CGLIBProxyRealMethod",
      "org.mockito.internal.creation.AbstractMockitoMethodProxy",
      "org.mockito.internal.creation.SerializableMockitoMethodProxy",
      "org.mockito.internal.util.reflection.Whitebox",
      "org.mockito.cglib.proxy.MethodProxy",
      "org.mockito.cglib.core.Signature",
      "org.mockito.cglib.proxy.MethodProxy$CreateInfo",
      "org.mockito.cglib.core.AbstractClassGenerator",
      "org.mockito.cglib.core.CollectionUtils",
      "org.mockito.cglib.core.TypeUtils",
      "org.mockito.asm.Type",
      "org.mockito.cglib.core.Constants",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator$1",
      "org.mockito.cglib.proxy.MethodInterceptorGenerator",
      "org.mockito.internal.creation.DelegatingMockitoMethodProxy",
      "org.mockito.internal.verification.VerificationModeFactory",
      "org.mockito.internal.verification.Times",
      "org.mockito.internal.debugging.Location",
      "org.hamcrest.BaseMatcher",
      "org.mockito.ArgumentMatcher",
      "org.mockito.internal.matchers.Equals",
      "org.mockito.internal.verification.AtMost",
      "org.mockito.internal.invocation.InvocationMarker",
      "org.mockito.internal.verification.Only",
      "org.mockito.internal.invocation.InvocationsFinder",
      "org.mockito.internal.listeners.CollectCreatedMocks",
      "org.mockito.internal.verification.AtLeast",
      "org.mockito.internal.verification.VerificationDataImpl",
      "org.mockito.cglib.proxy.MethodProxy$FastClassInfo",
      "org.mockito.cglib.core.AbstractClassGenerator$Source",
      "org.mockito.cglib.reflect.FastClass$Generator",
      "org.mockito.cglib.core.DefaultGeneratorStrategy",
      "org.mockito.cglib.core.DefaultNamingPolicy",
      "org.mockito.asm.ClassWriter",
      "org.mockito.cglib.core.DebuggingClassWriter",
      "org.mockito.asm.ByteVector",
      "org.mockito.asm.Item",
      "org.mockito.asm.ClassAdapter",
      "org.mockito.cglib.core.ClassEmitter",
      "org.mockito.cglib.reflect.FastClassEmitter",
      "org.mockito.cglib.core.AbstractClassGenerator$1",
      "org.mockito.cglib.core.ClassInfo",
      "org.mockito.cglib.core.ClassEmitter$1",
      "org.mockito.asm.MethodWriter",
      "org.mockito.asm.Label",
      "org.mockito.asm.MethodAdapter",
      "org.mockito.cglib.core.LocalVariablesSorter",
      "org.mockito.cglib.core.CodeEmitter",
      "org.mockito.cglib.core.LocalVariablesSorter$State",
      "org.mockito.cglib.core.MethodInfo",
      "org.mockito.cglib.core.CodeEmitter$State",
      "org.mockito.asm.Frame",
      "org.mockito.cglib.core.VisibilityPredicate",
      "org.mockito.cglib.core.ReflectUtils$1",
      "org.mockito.cglib.core.ReflectUtils$2",
      "org.mockito.cglib.core.ReflectUtils",
      "org.mockito.cglib.core.DuplicatesPredicate",
      "org.mockito.cglib.core.KeyFactory$1",
      "org.mockito.cglib.core.KeyFactory$2",
      "org.mockito.cglib.core.KeyFactory",
      "org.mockito.cglib.core.KeyFactory$Generator",
      "org.mockito.cglib.core.EmitUtils$ArrayDelimiters",
      "org.mockito.cglib.core.EmitUtils",
      "org.mockito.cglib.core.ClassEmitter$FieldInfo",
      "org.mockito.asm.FieldWriter",
      "org.mockito.asm.Edge",
      "org.mockito.cglib.core.EmitUtils$7",
      "org.mockito.cglib.core.Local",
      "org.mockito.cglib.core.EmitUtils$8",
      "org.mockito.cglib.core.EmitUtils$9",
      "org.mockito.cglib.core.DebuggingClassWriter$1",
      "org.mockito.asm.ClassReader",
      "org.mockito.cglib.core.ClassNameReader$EarlyExitException",
      "org.mockito.cglib.core.ClassNameReader",
      "org.mockito.cglib.core.ClassNameReader$1",
      "org.mockito.cglib.core.MethodWrapper",
      "org.mockito.cglib.reflect.FastClassEmitter$1",
      "org.mockito.cglib.reflect.FastClassEmitter$3",
      "org.mockito.cglib.core.EmitUtils$5",
      "org.mockito.cglib.core.EmitUtils$6",
      "org.mockito.cglib.core.MethodInfoTransformer",
      "org.mockito.cglib.core.ReflectUtils$3",
      "org.mockito.cglib.reflect.FastClassEmitter$GetIndexCallback",
      "org.mockito.cglib.core.EmitUtils$10",
      "org.mockito.cglib.core.EmitUtils$11",
      "org.mockito.cglib.core.EmitUtils$12",
      "org.mockito.cglib.core.EmitUtils$13",
      "org.mockito.cglib.core.EmitUtils$14",
      "org.mockito.cglib.core.EmitUtils$15",
      "org.mockito.cglib.core.EmitUtils$16",
      "org.mockito.cglib.core.Block",
      "org.mockito.cglib.reflect.FastClassEmitter$4",
      "org.mockito.cglib.core.ReflectUtils$4",
      "org.mockito.asm.Handler",
      "org.mockito.cglib.reflect.FastClass",
      "org.mockito.internal.debugging.Localized",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.internal.util.ObjectMethodsGuru",
      "org.mockito.internal.creation.DelegatingMethod",
      "org.mockito.exceptions.misusing.UnfinishedStubbingException",
      "org.mockito.internal.reporting.PrintSettings",
      "org.mockito.exceptions.misusing.UnfinishedVerificationException"
    );
  }
}
