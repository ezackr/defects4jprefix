/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Oct 15 05:51:16 GMT 2023
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
public class CollapseProperties_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.javascript.jscomp.CollapseProperties"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CollapseProperties_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.javascript.jscomp.CoalesceVariableNames",
      "com.google.javascript.jscomp.MakeDeclaredNamesUnique",
      "com.google.javascript.jscomp.graph.GraphColoring$GreedyGraphColoring",
      "com.google.javascript.rhino.jstype.PrototypeObjectType",
      "com.google.javascript.jscomp.JsMessage$Builder",
      "com.google.javascript.rhino.jstype.ArrowType",
      "com.google.javascript.jscomp.GlobalNamespace$1",
      "com.google.javascript.jscomp.graph.GraphNode",
      "com.google.javascript.jscomp.RenameLabels$LabelNamespace",
      "com.google.javascript.jscomp.NodeTraversal$Callback",
      "com.google.javascript.jscomp.CheckSideEffects",
      "com.google.javascript.jscomp.Scope$Arguments",
      "com.google.javascript.jscomp.graph.Graph",
      "com.google.javascript.rhino.jstype.StaticScope",
      "com.google.javascript.rhino.jstype.InstanceObjectType",
      "com.google.javascript.jscomp.graph.LinkedUndirectedGraph$AnnotatedLinkedUndirectedGraphNode",
      "com.google.javascript.jscomp.graph.Annotatable",
      "com.google.javascript.jscomp.PassFactory",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.jscomp.SyntacticScopeCreator$1",
      "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter",
      "com.google.javascript.rhino.JSDocInfo$Marker",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.jscomp.ControlFlowGraph",
      "com.google.javascript.jscomp.graph.GraphvizGraph",
      "com.google.javascript.rhino.Node$AncestorIterable$1",
      "com.google.javascript.jscomp.CodingConvention$SubclassType",
      "com.google.javascript.jscomp.GlobalNamespace",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.jscomp.ClosureCodingConvention",
      "com.google.javascript.jscomp.CodingConvention",
      "com.google.javascript.jscomp.CrossModuleCodeMotion$Declaration",
      "com.google.javascript.jscomp.MemoizedScopeCreator",
      "com.google.javascript.jscomp.WarningsGuard",
      "com.google.javascript.jscomp.Normalize$ScopeTicklingCallback",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.jscomp.RenameLabels$ProcessLabels",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizNode",
      "com.google.javascript.rhino.ErrorReporter",
      "com.google.javascript.jscomp.DefaultCodingConvention",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.jscomp.CheckRegExp",
      "com.google.javascript.jscomp.CssRenamingMap",
      "com.google.javascript.jscomp.CombinedCompilerPass",
      "com.google.javascript.jscomp.CheckGlobalThis",
      "com.google.javascript.rhino.JSDocInfo$1",
      "com.google.javascript.jscomp.CssRenamingMap$Style",
      "com.google.javascript.jscomp.UnreachableCodeElimination",
      "com.google.javascript.jscomp.MessageFormatter",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.jscomp.LineNumberCheck",
      "com.google.javascript.jscomp.graph.Graph$GraphEdge",
      "com.google.javascript.jscomp.GoogleCodingConvention",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "com.google.javascript.jscomp.Denormalize",
      "com.google.javascript.jscomp.SourceFile$Generator",
      "com.google.javascript.jscomp.Denormalize$StripConstantAnnotations",
      "com.google.javascript.jscomp.StrictModeCheck",
      "com.google.javascript.jscomp.PeepholeFoldConstants",
      "com.google.javascript.jscomp.CodingConvention$ObjectLiteralCast",
      "com.google.javascript.jscomp.CodingConvention$SubclassRelationship",
      "com.google.javascript.jscomp.graph.GraphvizGraph$GraphvizEdge",
      "com.google.javascript.jscomp.CompilerPass",
      "com.google.javascript.jscomp.RenameLabels",
      "com.google.javascript.rhino.jstype.EnumElementType",
      "com.google.javascript.jscomp.CollapseProperties",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.Scope",
      "com.google.javascript.jscomp.AliasStrings",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphNode",
      "com.google.javascript.jscomp.Scope$Var",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$Reference",
      "com.google.javascript.jscomp.SourceInformationAnnotator",
      "com.google.javascript.jscomp.LatticeElement",
      "com.google.javascript.jscomp.CodeChangeHandler",
      "com.google.javascript.jscomp.MakeDeclaredNamesUnique$Renamer",
      "com.google.javascript.jscomp.AbstractPeepholeOptimization",
      "com.google.javascript.rhino.jstype.EnumType",
      "com.google.javascript.rhino.JSDocInfo$TypePosition",
      "com.google.javascript.jscomp.JsMessageVisitor$MalformedException",
      "com.google.javascript.jscomp.graph.UndiGraph$UndiGraphNode",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter",
      "com.google.javascript.jscomp.JSSourceFile",
      "com.google.javascript.jscomp.graph.LinkedUndirectedGraph$LinkedUndirectedGraphNode",
      "com.google.javascript.jscomp.CrossModuleCodeMotion$NamedInfo",
      "com.google.javascript.jscomp.PrepareAst$PrepareAnnotations",
      "com.google.javascript.jscomp.Compiler$3",
      "com.google.javascript.jscomp.FindExportableNodes",
      "com.google.javascript.jscomp.graph.LinkedUndirectedGraph$AnnotatedLinkedUndirectedGraphEdge",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph",
      "com.google.javascript.jscomp.CrossModuleCodeMotion",
      "com.google.javascript.rhino.Kit",
      "com.google.javascript.jscomp.TypeValidator",
      "com.google.javascript.jscomp.graph.UndiGraph$UndiGraphEdge",
      "com.google.javascript.jscomp.OptimizeArgumentsArray",
      "com.google.javascript.jscomp.GlobalNamespace$Ref$Type",
      "com.google.javascript.jscomp.UnfoldCompoundAssignments",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$LinkedDirectedGraphEdge",
      "com.google.javascript.jscomp.graph.UndiGraph",
      "com.google.javascript.jscomp.CollapseProperties$1",
      "com.google.javascript.jscomp.PassFactory$1",
      "com.google.javascript.jscomp.NodeTraversal$AbstractNodeTypePruningCallback",
      "com.google.javascript.jscomp.JsMessage$IdGenerator",
      "com.google.javascript.jscomp.graph.LinkedUndirectedGraph$LinkedUndirectedGraphEdge",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.GroupVariableDeclarations",
      "com.google.javascript.jscomp.graph.GraphColoring",
      "com.google.javascript.jscomp.CheckAccidentalSemicolon",
      "com.google.javascript.jscomp.FunctionNames",
      "com.google.javascript.rhino.JSDocInfo$StringPosition",
      "com.google.javascript.jscomp.graph.LinkedUndirectedGraph",
      "com.google.javascript.rhino.JSDocInfo$Visibility",
      "com.google.javascript.jscomp.MinimizeExitPoints",
      "com.google.javascript.jscomp.graph.SubGraph",
      "com.google.javascript.jscomp.SourceAst",
      "com.google.javascript.rhino.jstype.TernaryValue$1",
      "com.google.javascript.rhino.EvaluatorException",
      "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments",
      "com.google.javascript.rhino.jstype.TernaryValue$3",
      "com.google.javascript.rhino.jstype.TernaryValue$2",
      "com.google.javascript.jscomp.SourceExcerptProvider",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$Behavior",
      "com.google.javascript.jscomp.StatementFusion",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.rhino.RhinoException",
      "com.google.javascript.jscomp.RecordFunctionInformation",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.SourcePosition",
      "com.google.javascript.jscomp.InferJSDocInfo",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphNode",
      "com.google.javascript.jscomp.GlobalNamespace$Name",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.ExternExportsPass",
      "com.google.javascript.jscomp.ComposeWarningsGuard",
      "com.google.javascript.rhino.jstype.FunctionPrototypeType",
      "com.google.javascript.jscomp.VariableMap",
      "com.google.javascript.jscomp.JsAst",
      "com.google.javascript.jscomp.PeepholeOptimizationsPass",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.JsMessageDefinition",
      "com.google.javascript.jscomp.CheckMissingGetCssName",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphEdge",
      "com.google.javascript.jscomp.MoveFunctionDeclarations",
      "com.google.javascript.jscomp.RenameVars$Assignment",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.jscomp.ConvertToDottedProperties",
      "com.google.javascript.jscomp.ControlFlowGraph$Branch",
      "com.google.javascript.jscomp.SyntheticAst",
      "com.google.javascript.jscomp.Normalize$NormalizeStatements",
      "com.google.javascript.jscomp.ScopeCreator",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.jscomp.ReferenceCollectingCallback",
      "com.google.javascript.jscomp.FlowScope",
      "com.google.javascript.jscomp.graph.AdjacencyGraph",
      "com.google.javascript.jscomp.deps.SortedDependencies$CircularDependencyException",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.graph.LinkedDirectedGraph$AnnotatedLinkedDirectedGraphEdge",
      "com.google.javascript.jscomp.Normalize$1",
      "com.google.javascript.jscomp.CodingConvention$DelegateRelationship",
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback$SideEffectAccumulator",
      "com.google.javascript.jscomp.AliasStrings$StringOccurrence",
      "com.google.javascript.jscomp.graph.DiGraph$DiGraphNode",
      "com.google.javascript.jscomp.PrepareAst",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.rhino.jstype.FunctionType",
      "com.google.javascript.jscomp.AbstractCompiler",
      "com.google.javascript.jscomp.ProcessClosurePrimitives",
      "com.google.javascript.jscomp.ExploitAssigns",
      "com.google.javascript.jscomp.CheckPropertyOrder",
      "com.google.javascript.jscomp.Compiler",
      "com.google.javascript.jscomp.Normalize$DuplicateDeclarationHandler",
      "com.google.javascript.jscomp.NodeTraversal$ScopedCallback",
      "com.google.javascript.jscomp.TypedScopeCreator",
      "com.google.javascript.jscomp.DiagnosticGroup",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback$CopySideEffectSubexpressions",
      "com.google.javascript.jscomp.SyntacticScopeCreator$RedeclarationHandler",
      "com.google.javascript.rhino.jstype.TernaryValue",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.jscomp.TypedScopeCreator$GlobalScopeBuilder",
      "com.google.javascript.jscomp.PeepholeFoldWithTypes",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowCallback",
      "com.google.javascript.jscomp.ErrorManager",
      "com.google.javascript.jscomp.RenameVars",
      "com.google.javascript.jscomp.AnonymousFunctionNamingCallback$FunctionNamer",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.rhino.jstype.StaticSlot",
      "com.google.javascript.jscomp.CoalesceVariableNames$1",
      "com.google.javascript.jscomp.Normalize$PropagateConstantAnnotationsOverVars",
      "com.google.javascript.jscomp.JSModuleGraph",
      "com.google.javascript.jscomp.GatherRawExports",
      "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler",
      "com.google.javascript.jscomp.TypedScopeCreator$LocalScopeBuilder",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.jscomp.graph.Annotation",
      "com.google.javascript.jscomp.Region",
      "com.google.javascript.jscomp.RenameLabels$LabelInfo",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.rhino.jstype.BooleanLiteralSet",
      "com.google.javascript.jscomp.Normalize",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$1",
      "com.google.javascript.jscomp.AliasStrings$StringInfo",
      "com.google.javascript.jscomp.RenameLabels$1",
      "com.google.javascript.jscomp.RenameVars$1",
      "com.google.javascript.jscomp.RenameVars$2",
      "com.google.javascript.jscomp.VarCheck",
      "com.google.javascript.jscomp.TypedScopeCreator$AbstractScopeBuilder",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation",
      "com.google.javascript.jscomp.JsMessage",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.javascript.rhino.jstype.JSTypeRegistry",
      "com.google.javascript.jscomp.JSModuleGraph$ModuleDependenceException",
      "com.google.javascript.jscomp.graph.DiGraph",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback",
      "com.google.javascript.jscomp.GlobalNamespace$Ref",
      "com.google.javascript.jscomp.ReverseAbstractInterpreter",
      "com.google.javascript.jscomp.GlobalNamespace$Name$Type",
      "com.google.javascript.jscomp.ReplaceMessages",
      "com.google.javascript.jscomp.ConstCheck",
      "com.google.javascript.rhino.jstype.Visitor",
      "com.google.javascript.jscomp.TypeCheck",
      "com.google.javascript.rhino.jstype.JSTypeNative",
      "com.google.javascript.jscomp.deps.DependencyInfo",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowStatementCallback",
      "com.google.javascript.jscomp.Normalize$VerifyConstants",
      "com.google.javascript.rhino.JSTypeExpression",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CollapseProperties_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.javascript.jscomp.DiagnosticType",
      "com.google.javascript.jscomp.CheckLevel",
      "com.google.javascript.jscomp.CollapseProperties",
      "com.google.javascript.jscomp.NodeTraversal$AbstractShallowCallback",
      "com.google.javascript.jscomp.CollapseProperties$1",
      "com.google.javascript.jscomp.GlobalNamespace$Name$Type",
      "com.google.javascript.jscomp.GlobalNamespace$Ref$Type",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$1",
      "com.google.javascript.jscomp.ReferenceCollectingCallback",
      "com.google.javascript.rhino.Node",
      "com.google.javascript.rhino.Node$StringNode",
      "com.google.javascript.jscomp.AbstractPeepholeOptimization",
      "com.google.javascript.jscomp.PeepholeFoldConstants",
      "com.google.javascript.jscomp.SyntheticAst",
      "com.google.javascript.rhino.Node$PropListItem",
      "com.google.javascript.jscomp.SourceFile",
      "com.google.javascript.jscomp.SourceFile$OnDisk",
      "com.google.javascript.rhino.Node$NumberNode",
      "com.google.javascript.jscomp.Scope",
      "com.google.javascript.jscomp.NodeTraversal$AbstractPostOrderCallback",
      "com.google.javascript.jscomp.ConvertToDottedProperties",
      "com.google.javascript.jscomp.NodeTraversal",
      "com.google.javascript.jscomp.SyntacticScopeCreator",
      "com.google.javascript.jscomp.SyntacticScopeCreator$DefaultRedeclarationHandler",
      "com.google.javascript.jscomp.GatherRawExports",
      "com.google.javascript.jscomp.OptimizeArgumentsArray",
      "com.google.javascript.jscomp.LineNumberCheck",
      "com.google.javascript.rhino.jstype.JSType$1",
      "com.google.javascript.rhino.jstype.JSType",
      "com.google.javascript.rhino.jstype.ObjectType",
      "com.google.javascript.jscomp.TypedScopeCreator",
      "com.google.javascript.jscomp.PeepholeCollectPropertyAssignments",
      "com.google.javascript.jscomp.JsAst",
      "com.google.javascript.jscomp.ExploitAssigns",
      "com.google.javascript.jscomp.CheckRegExp",
      "com.google.javascript.jscomp.DefaultCodingConvention",
      "com.google.javascript.jscomp.ClosureCodingConvention",
      "com.google.javascript.jscomp.PeepholeFoldWithTypes",
      "com.google.javascript.jscomp.JSSourceFile",
      "com.google.javascript.jscomp.CompilerInput",
      "com.google.javascript.jscomp.Normalize$VerifyConstants",
      "com.google.javascript.jscomp.MoveFunctionDeclarations",
      "com.google.javascript.jscomp.StrictModeCheck",
      "com.google.javascript.rhino.Node$AncestorIterable",
      "com.google.javascript.rhino.Node$AncestorIterable$1",
      "com.google.javascript.jscomp.PrepareAst$PrepareAnnotations",
      "com.google.javascript.jscomp.UnreachableCodeElimination",
      "com.google.javascript.jscomp.VarCheck",
      "com.google.javascript.jscomp.CheckPropertyOrder",
      "com.google.javascript.jscomp.SourceFile$Generated",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback$CopySideEffectSubexpressions",
      "com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback",
      "com.google.javascript.jscomp.GroupVariableDeclarations",
      "com.google.javascript.jscomp.SourceFile$Preloaded",
      "com.google.javascript.jscomp.ProcessClosurePrimitives",
      "com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock",
      "com.google.javascript.jscomp.Denormalize$StripConstantAnnotations",
      "com.google.javascript.jscomp.Denormalize",
      "com.google.javascript.jscomp.CoalesceVariableNames$1",
      "com.google.javascript.jscomp.CoalesceVariableNames",
      "com.google.javascript.jscomp.MemoizedScopeCreator",
      "com.google.javascript.jscomp.StatementFusion",
      "com.google.javascript.jscomp.CombinedCompilerPass",
      "com.google.javascript.jscomp.CheckSideEffects",
      "com.google.javascript.jscomp.Normalize$NormalizeStatements",
      "com.google.javascript.jscomp.CheckGlobalThis",
      "com.google.javascript.jscomp.JsMessageVisitor",
      "com.google.javascript.jscomp.ReplaceMessages",
      "com.google.javascript.jscomp.Normalize$PropagateConstantAnnotationsOverVars",
      "com.google.javascript.rhino.Token",
      "com.google.javascript.jscomp.ExternExportsPass",
      "com.google.javascript.jscomp.ConstCheck",
      "com.google.javascript.jscomp.GoogleCodingConvention",
      "com.google.javascript.jscomp.CheckMissingGetCssName",
      "com.google.javascript.jscomp.MakeDeclaredNamesUnique",
      "com.google.javascript.jscomp.PeepholeOptimizationsPass",
      "com.google.javascript.jscomp.RenameLabels",
      "com.google.javascript.jscomp.RenameLabels$ProcessLabels",
      "com.google.javascript.jscomp.InferJSDocInfo",
      "com.google.javascript.rhino.Node$SiblingNodeIterable",
      "com.google.javascript.jscomp.JSModule",
      "com.google.javascript.rhino.Node$NodeMismatch",
      "com.google.javascript.jscomp.UnfoldCompoundAssignments",
      "com.google.javascript.jscomp.FindExportableNodes",
      "com.google.javascript.jscomp.GlobalNamespace$Ref",
      "com.google.javascript.jscomp.MinimizeExitPoints",
      "com.google.javascript.rhino.Kit",
      "com.google.javascript.jscomp.SourceInformationAnnotator",
      "com.google.javascript.jscomp.CheckAccidentalSemicolon",
      "com.google.javascript.rhino.Node$FileLevelJsDocBuilder",
      "com.google.javascript.jscomp.VariableMap",
      "com.google.javascript.rhino.Node$SideEffectFlags",
      "com.google.javascript.jscomp.JSError",
      "com.google.javascript.rhino.JSDocInfo",
      "com.google.javascript.jscomp.AliasStrings",
      "com.google.javascript.jscomp.CrossModuleCodeMotion",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter",
      "com.google.javascript.jscomp.ClosureReverseAbstractInterpreter",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$1",
      "com.google.javascript.jscomp.ChainableReverseAbstractInterpreter$2",
      "com.google.javascript.jscomp.RecordFunctionInformation",
      "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo",
      "com.google.javascript.jscomp.RenameVars$1",
      "com.google.javascript.jscomp.RenameVars$2",
      "com.google.javascript.jscomp.RenameVars",
      "com.google.javascript.jscomp.DiagnosticGroup",
      "com.google.javascript.jscomp.TypeCheck",
      "com.google.javascript.jscomp.FunctionNames"
    );
  }
}
