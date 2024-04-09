/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 08 02:57:31 GMT 2024
 */

package org.mockito.internal.creation.bytebuddy;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ByteBuddyMockMaker_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/"); 
    java.lang.System.setProperty("user.dir", "/Users/elliottzackrone/IdeaProjects/defects4jprefix"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ByteBuddyMockMaker_ESTest_scaffolding.class.getClassLoader() ,
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler",
      "net.bytebuddy.instrumentation.attribute.annotation.AnnotationAppender",
      "org.mockito.mock.MockCreationSettings",
      "org.mockito.mock.SerializableMode",
      "org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker",
      "org.mockito.internal.creation.MockSettingsImpl",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$NegatingMethodMatcher",
      "org.mockito.internal.exceptions.stacktrace.StackTraceFilter",
      "org.mockito.internal.creation.bytebuddy.AcrossJVMSerializationFeature",
      "org.objenesis.ObjenesisStd",
      "net.bytebuddy.dynamic.DynamicType$Builder",
      "org.mockito.internal.creation.bytebuddy.InterceptedInvocation$SuperMethod",
      "net.bytebuddy.instrumentation.attribute.MethodAttributeAppender$ForInstrumentedMethod",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$DefaultFinalizeMethodMatcher",
      "net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy",
      "net.bytebuddy.instrumentation.type.TypeDescription",
      "net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher$Disjunction",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher$AbstractBase",
      "org.objenesis.Objenesis",
      "org.mockito.plugins.MockMaker",
      "org.objenesis.strategy.InstantiatorStrategy",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "net.bytebuddy.instrumentation.method.ByteCodeMethod",
      "net.bytebuddy.instrumentation.attribute.FieldAttributeAppender$NoOp",
      "org.mockito.internal.invocation.MockitoMethod",
      "org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter",
      "net.bytebuddy.instrumentation.attribute.MethodAttributeAppender$Factory",
      "net.bytebuddy.NamingStrategy",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler$Default$3",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler$Default$2",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler$Default$1",
      "org.mockito.listeners.InvocationListener",
      "net.bytebuddy.instrumentation.method.MethodDescription",
      "net.bytebuddy.utility.ByteBuddyCommons",
      "org.mockito.plugins.PluginSwitch",
      "org.mockito.internal.creation.bytebuddy.ClassInstantiator$UsingObjenesis",
      "org.mockito.stubbing.Answer",
      "org.mockito.invocation.InvocationOnMock",
      "org.mockito.internal.util.collections.Iterables",
      "org.mockito.internal.configuration.plugins.DefaultPluginSwitch",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$VisibilityBridgeMethodMatcher",
      "net.bytebuddy.asm.ClassVisitorWrapper",
      "org.mockito.internal.creation.bytebuddy.MockMethodInterceptor",
      "org.objenesis.instantiator.ObjectInstantiator",
      "org.objenesis.strategy.StdInstantiatorStrategy",
      "net.bytebuddy.instrumentation.type.TypeList$Empty",
      "org.mockito.invocation.MockHandler",
      "net.bytebuddy.ByteBuddy$Definable$Defined",
      "net.bytebuddy.dynamic.scaffold.FieldRegistry",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator",
      "org.mockito.exceptions.base.MockitoSerializationIssue",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$BridgeTarget",
      "net.bytebuddy.instrumentation.attribute.MethodAttributeAppender",
      "org.mockito.MockSettings",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Factory",
      "net.bytebuddy.instrumentation.ByteCodeElement",
      "net.bytebuddy.instrumentation.method.MethodLookupEngine",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner",
      "net.bytebuddy.instrumentation.attribute.TypeAttributeAppender",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$Factory",
      "net.bytebuddy.instrumentation.method.MethodLookupEngine$Default$Factory",
      "net.bytebuddy.instrumentation.attribute.annotation.AnnotationAppender$Target",
      "net.bytebuddy.instrumentation.Instrumentation",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Default",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatcher",
      "net.bytebuddy.ByteBuddy$Definable",
      "org.objenesis.strategy.BaseInstantiatorStrategy",
      "org.mockito.internal.creation.bytebuddy.MockBytecodeGenerator",
      "org.mockito.internal.configuration.plugins.PluginRegistry",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockito.invocation.Invocation",
      "net.bytebuddy.ByteBuddy",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Compiled",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.creation.instance.InstantiationException",
      "net.bytebuddy.instrumentation.attribute.TypeAttributeAppender$ForSuperType",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool",
      "net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher",
      "org.mockito.internal.configuration.plugins.PluginLoader",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver",
      "org.mockito.internal.util.StringJoiner",
      "net.bytebuddy.instrumentation.attribute.FieldAttributeAppender$Factory",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler$Default",
      "net.bytebuddy.instrumentation.attribute.FieldAttributeAppender",
      "net.bytebuddy.NamingStrategy$SuffixingRandom",
      "net.bytebuddy.dynamic.ClassLoadingStrategy",
      "net.bytebuddy.instrumentation.method.MethodLookupEngine$Factory",
      "net.bytebuddy.ByteBuddy$Definable$Undefined",
      "org.mockito.internal.configuration.plugins.Plugins",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$LatentMethodMatcher",
      "org.mockito.internal.invocation.AbstractAwareMethod",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider",
      "org.mockito.plugins.StackTraceCleanerProvider",
      "net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher$Conjunction",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$BooleanMethodMatcher",
      "org.mockito.internal.creation.settings.CreationSettings",
      "net.bytebuddy.instrumentation.ModifierReviewable",
      "net.bytebuddy.ClassFileVersion",
      "org.mockito.mock.MockName",
      "org.mockito.exceptions.PrintableInvocation",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.invocation.DescribedInvocation",
      "org.mockito.exceptions.base.MockitoException",
      "net.bytebuddy.instrumentation.type.TypeList",
      "net.bytebuddy.instrumentation.attribute.MethodAttributeAppender$NoOp",
      "org.mockito.internal.InternalMockHandler",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$ModifierMethodMatcher",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$DeclaredExceptionMethodMatcher",
      "net.bytebuddy.instrumentation.type.DeclaredInType",
      "net.bytebuddy.asm.ClassVisitorWrapper$Chain",
      "org.mockito.exceptions.stacktrace.StackTraceCleaner",
      "org.mockito.internal.creation.bytebuddy.ClassInstantiator",
      "org.mockito.internal.configuration.plugins.PluginFinder",
      "org.objenesis.ObjenesisBase",
      "org.mockito.internal.creation.bytebuddy.MockMethodInterceptor$MockAccess"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ByteBuddyMockMaker_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker",
      "org.mockito.mock.SerializableMode",
      "org.mockito.internal.creation.bytebuddy.ClassInstantiator$UsingObjenesis",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.objenesis.ObjenesisBase",
      "org.objenesis.ObjenesisStd",
      "org.objenesis.strategy.BaseInstantiatorStrategy",
      "org.objenesis.strategy.StdInstantiatorStrategy",
      "org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator",
      "org.mockito.internal.creation.bytebuddy.MockBytecodeGenerator",
      "net.bytebuddy.ByteBuddy",
      "net.bytebuddy.ClassFileVersion",
      "net.bytebuddy.NamingStrategy$SuffixingRandom",
      "net.bytebuddy.instrumentation.type.TypeList$Empty",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers",
      "net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher$AbstractBase",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$DefaultFinalizeMethodMatcher",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$ModifierMethodMatcher",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$VisibilityBridgeMethodMatcher",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$NegatingMethodMatcher",
      "net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher$Conjunction",
      "net.bytebuddy.instrumentation.method.matcher.JunctionMethodMatcher$Disjunction",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$ConflictHandler$Default",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple$Factory",
      "net.bytebuddy.asm.ClassVisitorWrapper$Chain",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Default",
      "net.bytebuddy.ByteBuddy$Definable$Undefined",
      "net.bytebuddy.instrumentation.method.MethodLookupEngine$Default$Factory",
      "net.bytebuddy.instrumentation.attribute.FieldAttributeAppender$NoOp",
      "net.bytebuddy.instrumentation.attribute.MethodAttributeAppender$NoOp",
      "net.bytebuddy.instrumentation.attribute.MethodAttributeAppender$ForInstrumentedMethod",
      "net.bytebuddy.utility.ByteBuddyCommons",
      "net.bytebuddy.instrumentation.attribute.TypeAttributeAppender$ForSuperType",
      "net.bytebuddy.ByteBuddy$Definable$Defined",
      "org.mockito.internal.creation.settings.CreationSettings",
      "org.mockito.internal.creation.MockSettingsImpl",
      "org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator$CachedBytecodeGenerator",
      "org.mockito.internal.creation.bytebuddy.CachingMockBytecodeGenerator$CachedBytecodeGenerator$MockKey",
      "net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default",
      "net.bytebuddy.instrumentation.ModifierReviewable$AbstractModifierReviewable",
      "net.bytebuddy.instrumentation.type.TypeDescription$AbstractTypeDescription",
      "net.bytebuddy.instrumentation.type.TypeDescription$ForLoadedType",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder",
      "net.bytebuddy.modifier.TypeManifestation",
      "net.bytebuddy.instrumentation.attribute.TypeAttributeAppender$NoOp",
      "net.bytebuddy.dynamic.scaffold.FieldRegistry$Default",
      "net.bytebuddy.NamingStrategy$Fixed",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$AbstractDelegatingBuilder",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder$SubclassOptionalMatchedMethodInterception",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$BooleanMethodMatcher",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$IsMethodMethodMatcher",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder$SubclassMatchedMethodInterception",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$LatentMethodMatcher$Simple",
      "net.bytebuddy.instrumentation.MethodDelegation",
      "net.bytebuddy.instrumentation.method.MethodLookupEngine$Default",
      "net.bytebuddy.instrumentation.method.MethodLookupEngine$Default$DefaultMethodLookup",
      "net.bytebuddy.instrumentation.MethodDelegation$InstrumentationDelegate$ForInstanceField",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.Argument$Binder",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.AllArguments$Binder",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.Origin$Binder",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.This$Binder",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.Super$Binder",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.SuperCall$Binder",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.DefaultCall$Binder",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.Argument$NextUnboundAsDefaultsProvider",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.BindingPriority$Resolver",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodNameEqualityResolver",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MostSpecificTypeResolver",
      "net.bytebuddy.instrumentation.method.bytecode.bind.ParameterLengthResolver",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$AmbiguityResolver$Chain",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.primitive.VoidAwareAssigner",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.primitive.PrimitiveTypeAwareAssigner",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.reference.ReferenceTypeAwareAssigner",
      "net.bytebuddy.instrumentation.method.MethodLookupEngine$Default$MethodBucket",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$VisibilityMethodMatcher",
      "net.bytebuddy.instrumentation.method.MethodList$ForLoadedType",
      "net.bytebuddy.instrumentation.method.MethodDescription$AbstractMethodDescription",
      "net.bytebuddy.instrumentation.method.MethodDescription$ForLoadedMethod",
      "net.bytebuddy.instrumentation.method.MethodDescription$ForLoadedConstructor",
      "net.bytebuddy.instrumentation.method.MethodList$Explicit",
      "net.bytebuddy.jar.asm.Type",
      "net.bytebuddy.instrumentation.type.TypeList$ForLoadedType",
      "net.bytebuddy.instrumentation.method.MethodLookupEngine$Default$MethodBucket$DefaultMethodLookup$Disabled",
      "net.bytebuddy.instrumentation.method.MethodLookupEngine$Finding$Default",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$IsConstructorMethodMatcher",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$DeclaringTypeMethodMatcher",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder$SubclassMethodAnnotationTarget",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Entry",
      "net.bytebuddy.instrumentation.FieldAccessor",
      "net.bytebuddy.instrumentation.FieldAccessor$ForBeanProperty",
      "net.bytebuddy.instrumentation.FieldAccessor$FieldLocator$ForInstrumentedTypeHierarchy$Factory",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$MethodNameMethodMatcher",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$MatchMode",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$ParameterCountMethodMatcher",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$ReturnTypeMethodMatcher",
      "net.bytebuddy.instrumentation.MethodDelegation$InstrumentationDelegate$ForStaticMethod",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$ParameterTypeMethodMatcher",
      "net.bytebuddy.modifier.Ownership",
      "net.bytebuddy.modifier.Visibility",
      "net.bytebuddy.modifier.FieldManifestation",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder$SubclassFieldValueTarget",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$FieldToken",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Entry$Simple",
      "net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$1",
      "net.bytebuddy.instrumentation.SuperMethodCall",
      "net.bytebuddy.instrumentation.type.InstrumentedType$AbstractBase",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassInstrumentedType",
      "net.bytebuddy.instrumentation.LoadedTypeInitializer$NoOp",
      "net.bytebuddy.instrumentation.field.FieldDescription$AbstractFieldDescription",
      "net.bytebuddy.instrumentation.type.InstrumentedType$AbstractBase$FieldToken",
      "net.bytebuddy.instrumentation.type.InstrumentedType$AbstractBase$MethodToken",
      "net.bytebuddy.instrumentation.type.TypeList$Explicit",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassInstrumentationTarget$Factory",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Entry$Skip",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled",
      "net.bytebuddy.instrumentation.Instrumentation$Target$AbstractBase",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassInstrumentationTarget",
      "net.bytebuddy.dynamic.scaffold.BridgeMethodResolver$Simple",
      "net.bytebuddy.instrumentation.SuperMethodCall$Appender",
      "net.bytebuddy.dynamic.scaffold.MethodRegistry$Default$Compiled$Entry",
      "net.bytebuddy.instrumentation.MethodDelegation$MethodDelegationByteCodeAppender",
      "net.bytebuddy.instrumentation.method.bytecode.stack.StackManipulation$LegalTrivial",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$Processor",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.TargetMethodAnnotationDrivenBinder",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$MethodInvoker$Simple",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor",
      "net.bytebuddy.instrumentation.FieldAccessor$Appender",
      "net.bytebuddy.instrumentation.FieldAccessor$FieldLocator$ForInstrumentedTypeHierarchy",
      "net.bytebuddy.instrumentation.method.bytecode.stack.StackManipulation$Compound",
      "net.bytebuddy.instrumentation.method.bytecode.stack.StackSize",
      "net.bytebuddy.instrumentation.method.bytecode.stack.StackManipulation$Size",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.MethodVariableAccess",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.MethodVariableAccess$ArgumentLoadingStackManipulation",
      "net.bytebuddy.instrumentation.field.FieldList$Explicit",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.FieldAccess",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.FieldAccess$AccessDispatcher",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.FieldAccess$AccessDispatcher$AbstractFieldInstruction",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.FieldAccess$AccessDispatcher$FieldGetInstruction",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$MethodInvoker$Virtual",
      "net.bytebuddy.dynamic.scaffold.TypeExtensionDelegate",
      "net.bytebuddy.dynamic.scaffold.TypeExtensionDelegate$AuxiliaryTypeNamingStrategy$SuffixingRandom",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$Builder",
      "net.bytebuddy.jar.asm.ClassVisitor",
      "net.bytebuddy.jar.asm.ClassWriter",
      "net.bytebuddy.jar.asm.ByteVector",
      "net.bytebuddy.jar.asm.Item",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$Builder$Handler",
      "net.bytebuddy.instrumentation.attribute.annotation.AnnotationAppender$Default",
      "net.bytebuddy.instrumentation.attribute.annotation.AnnotationAppender$Target$OnType",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$FieldPool$Entry$NoOp",
      "net.bytebuddy.dynamic.scaffold.FieldRegistry$Default$Compiled",
      "net.bytebuddy.jar.asm.FieldVisitor",
      "net.bytebuddy.jar.asm.FieldWriter",
      "net.bytebuddy.instrumentation.method.matcher.MethodMatchers$OverridableMethodMatcher",
      "net.bytebuddy.jar.asm.MethodVisitor",
      "net.bytebuddy.jar.asm.MethodWriter",
      "net.bytebuddy.instrumentation.attribute.annotation.AnnotationAppender$Target$OnMethod",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.IgnoreForBinding$Verifier",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.RuntimeType$Verifier",
      "net.bytebuddy.instrumentation.method.bytecode.stack.StackManipulation$Illegal",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.primitive.PrimitiveWideningDelegate$WideningStackManipulation",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.primitive.PrimitiveWideningDelegate",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$MethodBinding$Builder",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.Argument$NextUnboundAsDefaultsProvider$NextUnboundArgumentIterator",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.TargetMethodAnnotationDrivenBinder$DelegationProcessor$Handler$Bound",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$ParameterBinding$Anonymous",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$MethodBinding$Builder$Build",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.MethodInvocation",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.MethodInvocation$Invocation",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.MethodReturn",
      "net.bytebuddy.instrumentation.method.bytecode.ByteCodeAppender$Size",
      "net.bytebuddy.instrumentation.attribute.annotation.AnnotationAppender$Target$OnMethodParameter",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.Argument$BindingMechanic",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MostSpecificTypeResolver$ParameterIndexToken",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$ParameterBinding$Unique",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.AllArguments$Assignment",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.MethodConstant",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.MethodConstant$ForMethod",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.MethodConstant$Cached",
      "net.bytebuddy.instrumentation.method.bytecode.stack.collection.ArrayFactory",
      "net.bytebuddy.instrumentation.method.bytecode.stack.collection.ArrayFactory$ArrayCreator$Reference",
      "net.bytebuddy.instrumentation.method.bytecode.stack.collection.ArrayFactory$ArrayStackManipulation",
      "net.bytebuddy.instrumentation.method.bytecode.bind.annotation.DefaultCall$Binder$DefaultMethodLocator$Implicit",
      "net.bytebuddy.instrumentation.Instrumentation$SpecialMethodInvocation$Illegal",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$ParameterBinding$Illegal",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$MethodBinding$Illegal",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.primitive.PrimitiveBoxingDelegate",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.primitive.PrimitiveBoxingDelegate$BoxingStackManipulation",
      "net.bytebuddy.instrumentation.Instrumentation$Target$MethodLookup$Default",
      "net.bytebuddy.instrumentation.Instrumentation$SpecialMethodInvocation$Simple",
      "net.bytebuddy.instrumentation.type.auxiliary.MethodCallProxy$AssignableSignatureCall",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$AmbiguityResolver$Resolution",
      "net.bytebuddy.instrumentation.method.bytecode.bind.MethodDelegationBinder$1",
      "net.bytebuddy.dynamic.scaffold.TypeExtensionDelegate$FieldCacheEntry",
      "net.bytebuddy.instrumentation.field.FieldDescription$Latent",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.IntegerConstant",
      "net.bytebuddy.instrumentation.method.bytecode.stack.collection.ArrayFactory$ArrayCreator",
      "net.bytebuddy.instrumentation.type.auxiliary.MethodCallProxy",
      "net.bytebuddy.instrumentation.method.MethodDescription$Latent",
      "net.bytebuddy.dynamic.scaffold.TypeExtensionDelegate$AccessorMethodDelegation",
      "net.bytebuddy.instrumentation.type.auxiliary.MethodCallProxy$ProxyMethodLookupEngine",
      "net.bytebuddy.modifier.SyntheticState",
      "net.bytebuddy.instrumentation.type.auxiliary.AuxiliaryType",
      "net.bytebuddy.instrumentation.type.auxiliary.MethodCallProxy$MethodCall",
      "net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder$SubclassExceptionDeclarableMethodInterception",
      "net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$MethodToken",
      "net.bytebuddy.instrumentation.type.auxiliary.MethodCallProxy$ConstructorCall",
      "net.bytebuddy.instrumentation.method.MethodList$Empty",
      "net.bytebuddy.instrumentation.type.auxiliary.MethodCallProxy$ConstructorCall$Appender",
      "net.bytebuddy.instrumentation.type.auxiliary.MethodCallProxy$MethodCall$Appender",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.primitive.VoidAwareAssigner$ValueRemovingStackManipulation",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.FieldAccess$AccessDispatcher$FieldPutInstruction",
      "net.bytebuddy.dynamic.scaffold.TypeExtensionDelegate$FieldCacheWritingMethodPool",
      "net.bytebuddy.dynamic.scaffold.TypeExtensionDelegate$SameThreadCoModifiableIterable",
      "net.bytebuddy.dynamic.scaffold.TypeExtensionDelegate$SameThreadCoModifiableIterable$Iterator",
      "net.bytebuddy.dynamic.DynamicType$Default",
      "net.bytebuddy.dynamic.DynamicType$Default$Unloaded",
      "net.bytebuddy.instrumentation.method.bytecode.stack.TypeCreation",
      "net.bytebuddy.instrumentation.method.bytecode.stack.Duplication",
      "net.bytebuddy.instrumentation.method.bytecode.stack.member.MethodVariableAccess$TypeCastingHandler$NoOp",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.reference.DownCasting",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Entry$Simple",
      "net.bytebuddy.instrumentation.method.bytecode.ByteCodeAppender$Compound",
      "net.bytebuddy.dynamic.scaffold.TypeExtensionDelegate$TypeInitializerReturn",
      "org.mockito.internal.creation.util.SearchingClassLoader",
      "net.bytebuddy.dynamic.ClassLoadingStrategy$Default",
      "net.bytebuddy.dynamic.DynamicType$Default$Loaded",
      "net.bytebuddy.dynamic.loading.ClassLoaderByteArrayInjector$ReflectionStore$Resolved",
      "net.bytebuddy.dynamic.loading.ClassLoaderByteArrayInjector",
      "org.objenesis.strategy.PlatformDescription",
      "org.objenesis.instantiator.sun.SunReflectionFactoryInstantiator",
      "org.objenesis.instantiator.sun.SunReflectionFactoryHelper",
      "org.mockito.internal.creation.bytebuddy.MockMethodInterceptor",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.util.StringJoiner",
      "org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter",
      "org.mockito.internal.configuration.plugins.PluginRegistry",
      "org.mockito.internal.configuration.plugins.PluginLoader",
      "org.mockito.internal.configuration.plugins.DefaultPluginSwitch",
      "org.mockito.internal.configuration.plugins.PluginFinder",
      "org.mockito.internal.util.collections.Iterables",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider",
      "org.mockito.internal.configuration.plugins.Plugins",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner",
      "org.mockito.internal.exceptions.stacktrace.StackTraceFilter",
      "org.mockito.internal.util.MockCreationValidator",
      "org.mockito.internal.util.MockUtil",
      "org.mockito.internal.util.MockNameImpl",
      "org.mockito.internal.invocation.InvocationMatcher",
      "org.mockito.internal.debugging.VerboseMockInvocationLogger",
      "net.bytebuddy.instrumentation.attribute.annotation.AnnotationAppender$AnnotationVisibility",
      "net.bytebuddy.jar.asm.AnnotationVisitor",
      "net.bytebuddy.jar.asm.AnnotationWriter",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.ClassConstant",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.ClassConstant$ForReferenceType",
      "org.mockito.exceptions.Reporter",
      "org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsSmartNulls",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsMoreEmptyValues",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues",
      "org.mockito.internal.util.ObjectMethodsGuru",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsMocks",
      "org.mockito.internal.MockitoCore",
      "org.mockito.internal.progress.ThreadSafeMockingProgress",
      "org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs",
      "org.mockito.internal.stubbing.answers.CallsRealMethods",
      "org.mockito.Answers",
      "org.mockito.internal.util.reflection.Constructors",
      "org.mockito.internal.invocation.SerializableMethod",
      "org.mockito.internal.stubbing.StubbedInvocationMatcher",
      "org.mockito.internal.invocation.realmethod.CleanTraceRealMethod",
      "org.mockito.internal.invocation.realmethod.DefaultRealMethod",
      "org.mockito.internal.invocation.InvocationImpl",
      "org.mockito.internal.invocation.ArgumentsProcessor",
      "org.mockito.internal.listeners.NotifiedMethodInvocationReport",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.primitive.PrimitiveUnboxingDelegate",
      "net.bytebuddy.instrumentation.method.bytecode.stack.assign.primitive.PrimitiveUnboxingDelegate$ImplicitlyTypedUnboxingResponsible",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.LongConstant",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.FloatConstant",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.DoubleConstant",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.NullConstant",
      "net.bytebuddy.instrumentation.method.bytecode.stack.constant.DefaultValue",
      "org.mockito.internal.util.collections.Sets",
      "org.mockito.internal.creation.bytebuddy.AcrossJVMSerializationFeature"
    );
  }
}
