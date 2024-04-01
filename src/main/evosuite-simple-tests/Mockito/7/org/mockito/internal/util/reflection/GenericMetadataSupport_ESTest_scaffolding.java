/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 05 01:08:52 GMT 2023
 */

package org.mockito.internal.util.reflection;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class GenericMetadataSupport_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mockito.internal.util.reflection.GenericMetadataSupport"; 
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
    java.lang.System.setProperty("user.dir", "/Users/elliottzackrone/IdeaProjects/defects4jprefix"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(GenericMetadataSupport_ESTest_scaffolding.class.getClassLoader() ,
      "org.mockito.internal.configuration.plugins.PluginRegistry",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$BoundedType",
      "org.mockito.configuration.AnnotationEngine",
      "org.mockito.cglib.proxy.Callback",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$FromClassGenericMetadataSupport",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$NotGenericReturnTypeSupport",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.plugins.PluginSwitch",
      "org.mockito.stubbing.Answer",
      "org.mockito.internal.util.collections.Iterables",
      "org.mockito.internal.configuration.plugins.PluginLoader",
      "org.mockito.internal.configuration.plugins.DefaultPluginSwitch",
      "org.mockito.internal.exceptions.stacktrace.StackTraceFilter",
      "org.mockito.internal.creation.cglib.CglibMockMaker",
      "org.mockito.configuration.IMockitoConfiguration",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType",
      "org.mockito.internal.util.Checks",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$FromParameterizedTypeGenericMetadataSupport",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner",
      "org.mockito.exceptions.stacktrace.StackTraceCleaner",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.internal.configuration.plugins.Plugins",
      "org.mockito.cglib.proxy.MethodInterceptor",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVarBoundedType",
      "org.mockito.plugins.MockMaker",
      "org.mockito.internal.configuration.plugins.PluginFinder",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider",
      "org.mockito.plugins.StackTraceCleanerProvider",
      "org.mockito.internal.util.reflection.GenericMetadataSupport",
      "org.mockito.exceptions.misusing.MockitoConfigurationException",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$ParameterizedReturnType",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$WildCardBoundedType",
      "org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.lang.reflect.TypeVariable", false, GenericMetadataSupport_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.lang.reflect.WildcardType", false, GenericMetadataSupport_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(GenericMetadataSupport_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mockito.internal.util.reflection.GenericMetadataSupport",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$WildCardBoundedType",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVarBoundedType",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$NotGenericReturnTypeSupport",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$ParameterizedReturnType",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$TypeVariableReturnType",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$FromClassGenericMetadataSupport",
      "org.mockito.internal.util.reflection.GenericMetadataSupport$FromParameterizedTypeGenericMetadataSupport",
      "org.mockito.internal.util.Checks",
      "org.mockito.exceptions.base.MockitoException",
      "org.mockito.internal.exceptions.stacktrace.ConditionalStackTraceFilter",
      "org.mockito.internal.configuration.GlobalConfiguration",
      "org.mockito.configuration.DefaultMockitoConfiguration",
      "org.mockito.internal.configuration.ClassPathLoader",
      "org.mockito.internal.configuration.plugins.PluginRegistry",
      "org.mockito.internal.configuration.plugins.PluginLoader",
      "org.mockito.internal.configuration.plugins.DefaultPluginSwitch",
      "org.mockito.internal.configuration.plugins.PluginFinder",
      "org.mockito.internal.util.collections.Iterables",
      "org.mockito.internal.creation.cglib.CglibMockMaker",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleanerProvider",
      "org.mockito.internal.configuration.plugins.Plugins",
      "org.mockito.internal.exceptions.stacktrace.DefaultStackTraceCleaner",
      "org.mockito.internal.exceptions.stacktrace.StackTraceFilter"
    );
  }
}
