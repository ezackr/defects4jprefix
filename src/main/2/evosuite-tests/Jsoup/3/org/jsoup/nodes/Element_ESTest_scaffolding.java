/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Apr 07 01:02:58 GMT 2024
 */

package org.jsoup.nodes;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Element_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.nodes.Element"; 
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
    java.lang.System.setProperty("user.dir", "/Users/elliottzackrone/IdeaProjects/defects4jprefix"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Element_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.nodes.Attributes",
      "org.jsoup.nodes.Evaluator$Class",
      "org.apache.commons.lang.StringUtils",
      "org.jsoup.nodes.TextNode",
      "org.apache.commons.lang.exception.NestableRuntimeException",
      "org.jsoup.nodes.Evaluator$Id",
      "org.jsoup.nodes.Comment",
      "org.apache.commons.lang.IntHashMap$Entry",
      "org.apache.commons.lang.Entities$PrimitiveEntityMap",
      "org.jsoup.parser.Parser",
      "org.jsoup.nodes.Evaluator$AttributeWithValueEnding",
      "org.apache.commons.lang.UnhandledException",
      "org.apache.commons.lang.exception.NestableDelegate",
      "org.apache.commons.lang.IntHashMap",
      "org.jsoup.nodes.Evaluator$AttributeWithValueStarting",
      "org.jsoup.select.Selector",
      "org.jsoup.nodes.Evaluator$Tag",
      "org.apache.commons.lang.Entities$LookupEntityMap",
      "org.jsoup.nodes.Evaluator$IndexEquals",
      "org.jsoup.nodes.Evaluator$Attribute",
      "org.apache.commons.lang.Entities",
      "org.jsoup.nodes.Element",
      "org.apache.commons.lang.NotImplementedException",
      "org.apache.commons.lang.Entities$EntityMap",
      "org.jsoup.nodes.Evaluator$AttributeWithValueNot",
      "org.jsoup.nodes.Evaluator$IndexEvaluator",
      "org.jsoup.nodes.Evaluator$AttributeWithValueContaining",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.nodes.Evaluator$IndexLessThan",
      "org.jsoup.nodes.XmlDeclaration",
      "org.jsoup.parser.Tag",
      "org.apache.commons.lang.ObjectUtils",
      "org.jsoup.nodes.Evaluator$AttributeWithValue",
      "org.jsoup.nodes.Node",
      "org.apache.commons.lang.exception.Nestable",
      "org.jsoup.nodes.Attribute",
      "org.apache.commons.lang.ObjectUtils$Null",
      "org.jsoup.nodes.Document",
      "org.jsoup.nodes.Evaluator$AllElements",
      "org.jsoup.nodes.Evaluator$IndexGreaterThan",
      "org.jsoup.nodes.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Elements",
      "org.jsoup.nodes.DataNode",
      "org.apache.commons.lang.Validate",
      "org.apache.commons.lang.StringEscapeUtils",
      "org.jsoup.nodes.Evaluator"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Element_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.nodes.Node",
      "org.jsoup.nodes.Element",
      "org.apache.commons.lang.Validate",
      "org.jsoup.parser.Tag",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.nodes.Document",
      "org.apache.commons.lang.StringUtils",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.parser.Parser",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.nodes.Evaluator",
      "org.jsoup.nodes.Evaluator$Tag",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Elements",
      "org.jsoup.nodes.Evaluator$Id",
      "org.apache.commons.lang.ObjectUtils$Null",
      "org.apache.commons.lang.ObjectUtils",
      "org.jsoup.select.Selector",
      "org.jsoup.nodes.Evaluator$AttributeKeyPair",
      "org.jsoup.nodes.Evaluator$AttributeWithValueEnding",
      "org.jsoup.nodes.Evaluator$AttributeWithValue",
      "org.jsoup.nodes.Evaluator$AttributeWithValueNot",
      "org.jsoup.nodes.Evaluator$IndexEvaluator",
      "org.jsoup.nodes.Evaluator$IndexGreaterThan",
      "org.jsoup.nodes.Comment",
      "org.jsoup.nodes.XmlDeclaration",
      "org.jsoup.nodes.Evaluator$IndexEquals",
      "org.jsoup.nodes.Evaluator$AllElements",
      "org.jsoup.nodes.Evaluator$AttributeWithValueContaining",
      "org.jsoup.nodes.Evaluator$IndexLessThan",
      "org.jsoup.nodes.Evaluator$Attribute",
      "org.apache.commons.lang.StringEscapeUtils",
      "org.apache.commons.lang.Entities$PrimitiveEntityMap",
      "org.apache.commons.lang.Entities$LookupEntityMap",
      "org.apache.commons.lang.IntHashMap",
      "org.apache.commons.lang.IntHashMap$Entry",
      "org.apache.commons.lang.Entities",
      "org.apache.commons.lang.NotImplementedException",
      "org.apache.commons.lang.exception.NestableDelegate",
      "org.jsoup.nodes.Evaluator$AttributeWithValueStarting",
      "org.jsoup.nodes.Evaluator$Class",
      "org.jsoup.nodes.DataNode",
      "org.jsoup.select.Selector$SelectorParseException"
    );
  }
}
