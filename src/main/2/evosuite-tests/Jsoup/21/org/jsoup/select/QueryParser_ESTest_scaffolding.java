/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Apr 07 01:54:32 GMT 2024
 */

package org.jsoup.select;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class QueryParser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.select.QueryParser"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(QueryParser_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.jsoup.select.StructuralEvaluator",
      "org.jsoup.select.StructuralEvaluator$ImmediateParent",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.QueryParser",
      "org.jsoup.select.Evaluator$Matches",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.jsoup.select.CombiningEvaluator",
      "org.jsoup.select.CombiningEvaluator$Or",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.jsoup.select.Evaluator",
      "org.jsoup.nodes.Element",
      "org.jsoup.select.StructuralEvaluator$ImmediatePreviousSibling",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.select.StructuralEvaluator$PreviousSibling",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.helper.Validate",
      "org.jsoup.select.StructuralEvaluator$Parent",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.select.StructuralEvaluator$Not",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.nodes.Node",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.select.StructuralEvaluator$Root",
      "org.jsoup.select.Evaluator$AllElements"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(QueryParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.select.QueryParser",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.helper.Validate",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.select.CombiningEvaluator",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.jsoup.select.Evaluator$AllElements",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.StructuralEvaluator$Root",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.jsoup.select.StructuralEvaluator",
      "org.jsoup.select.StructuralEvaluator$PreviousSibling",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.select.StructuralEvaluator$Parent",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.jsoup.select.Evaluator$Matches",
      "org.jsoup.select.StructuralEvaluator$ImmediatePreviousSibling",
      "org.jsoup.select.CombiningEvaluator$Or",
      "org.jsoup.select.StructuralEvaluator$Not",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.select.StructuralEvaluator$ImmediateParent",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.jsoup.select.StructuralEvaluator$Has",
      "org.jsoup.select.Evaluator$MatchesOwn"
    );
  }
}
