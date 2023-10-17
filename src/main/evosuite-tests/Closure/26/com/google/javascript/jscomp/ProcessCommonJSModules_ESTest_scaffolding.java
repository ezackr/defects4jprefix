/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Oct 15 01:19:12 GMT 2023
 */

package com.google.javascript.jscomp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ProcessCommonJSModules_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.ProcessCommonJSModules"; 
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
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/Users/elliottzackrone/IdeaProjects/defects4jprefix"); 
    java.lang.System.setProperty("user.home", "/Users/elliottzackrone"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "elliottzackrone"); 
    java.lang.System.setProperty("user.timezone", "America/Los_Angeles"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ProcessCommonJSModules_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.NodeTraversal$ScopedCallback",
      "com.google.javascript.jscomp.graph.Graph$GraphEdge",
      "com.google.javascript.jscomp.DiagnosticGroup",
      "com.google.javascript.jscomp.ErrorHandler",
      "com.google.javascript.jscomp.SyntacticScopeCreator$RedeclarationHandler",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "com.google.javascript.jscomp.graph.SubGraph",
      "com.google.javascript.jscomp.SourceFile$Generator",
      "com.google.javascript.jscomp.graph.GraphNode",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.jscomp.NodeTraversal$Callback",
      "com.google.javascript.jscomp.SourceAst",
      "com.google.javascript.jscomp.graph.Graph",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowCallback",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizEdge",
      "com.google.javascript.jscomp.CodingConvention$SubclassRelationship",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.graph.Annotatable",
      "com.google.javascript.jscomp.PassFactory",
      "com.google.javascript.jscomp.ErrorManager",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.Scope",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.jscomp.SyntacticScopeCreator$1",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode",
      "com.google.javascript.jscomp.Scope$Var",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode",
      "com.google.javascript.jscomp.CodeChangeHandler",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.javascript.jscomp.ControlFlowGraph",
      "com.google.javascript.jscomp.graph.GraphvizGraph",
      "com.google.javascript.jscomp.NodeTraversal$AbstractScopedCallback",
      "com.google.javascript.jscomp.JSModuleGraph",
      "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler",
      "com.google.javascript.jscomp.NodeUtil",
      "com.google.javascript.jscomp.HotSwapCompilerPass",
      "com.google.javascript.jscomp.SourceFile$Builder",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphEdge",
      "com.google.javascript.jscomp.graph.Annotation",
      "com.google.javascript.jscomp.Region",
      "com.google.javascript.jscomp.CodingConvention",
      "com.google.javascript.jscomp.ProcessCommonJSModules",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.javascript.jscomp.ProcessCommonJSModules$1",
      "com.google.javascript.jscomp.Compiler$3",
      "com.google.javascript.rhino.jstype.StaticReference",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.jscomp.ControlFlowGraph$Branch",
      "com.google.javascript.rhino.InputId",
      "com.google.javascript.jscomp.ProcessCommonJSModules$ProcessCommonJsModulesCallback",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph",
      "com.google.javascript.jscomp.ScopeCreator",
      "com.google.javascript.jscomp.TypeValidator",
      "com.google.javascript.jscomp.ProcessCommonJSModules$SuffixVarsCallback",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizNode",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.javascript.rhino.jstype.StaticSymbolTable",
      "com.google.javascript.jscomp.graph.AdjacencyGraph",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.jscomp.JSModuleGraph$ModuleDependenceException",
      "com.google.javascript.jscomp.graph.DiGraph",
      "com.google.javascript.jscomp.deps.SortedDependencies$CircularDependencyException",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphEdge",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphEdge",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.rhino.jstype.StaticSourceFile",
      "com.google.javascript.jscomp.PassFactory$1",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.deps.DependencyInfo",
      "com.google.javascript.jscomp.CssRenamingMap",
      "com.google.javascript.jscomp.NodeTraversal$AbstractNodeTypePruningCallback",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowStatementCallback",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode",
      "com.google.javascript.jscomp.CssRenamingMap$Style",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.DiagnosticGroupWarningsGuard",
      "com.google.javascript.jscomp.MessageFormatter",
      "com.google.javascript.jscomp.Compiler"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ProcessCommonJSModules_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.ProcessCommonJSModules",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.jscomp.ProcessCommonJSModules$ProcessCommonJsModulesCallback",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler"
    );
  }
}
