/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Apr 07 11:07:16 GMT 2024
 */

package org.apache.commons.jxpath.ri.model.dom;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DOMNodePointer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DOMNodePointer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.jxpath.Variables",
      "org.apache.html.dom.HTMLLinkElementImpl",
      "org.apache.commons.jxpath.JXPathBeanInfo",
      "org.apache.html.dom.HTMLPreElementImpl",
      "org.apache.html.dom.HTMLHRElementImpl",
      "org.apache.html.dom.HTMLOptGroupElementImpl",
      "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory",
      "org.apache.commons.jxpath.JXPathInvalidSyntaxException",
      "org.apache.commons.jxpath.ri.model.beans.PropertyPointer",
      "org.apache.commons.jxpath.ri.model.beans.BeanPointer",
      "org.jdom.Document",
      "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointer",
      "org.apache.html.dom.HTMLTableRowElementImpl",
      "org.apache.commons.jxpath.ri.model.VariablePointerFactory$VariableContextWrapper",
      "org.apache.commons.jxpath.util.BasicTypeConverter",
      "org.apache.html.dom.HTMLButtonElementImpl",
      "org.apache.html.dom.HTMLModElementImpl",
      "org.apache.commons.jxpath.ri.model.VariablePointer",
      "org.apache.html.dom.HTMLTextAreaElementImpl",
      "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory",
      "org.apache.html.dom.HTMLHeadingElementImpl",
      "org.apache.html.dom.HTMLDListElementImpl",
      "org.apache.html.dom.HTMLLIElementImpl",
      "org.apache.commons.jxpath.ri.model.NodeIterator",
      "org.apache.html.dom.HTMLFrameSetElementImpl",
      "org.apache.commons.jxpath.JXPathContextFactory",
      "org.apache.commons.jxpath.ri.compiler.CoreOperationCompare",
      "org.apache.commons.jxpath.ExpressionContext",
      "org.apache.commons.jxpath.ri.QName",
      "org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer",
      "org.apache.html.dom.HTMLBodyElementImpl",
      "org.apache.commons.jxpath.ri.model.beans.CollectionPointer",
      "org.apache.html.dom.HTMLBRElementImpl",
      "org.jdom.Parent",
      "org.apache.commons.jxpath.CompiledExpression",
      "org.apache.commons.jxpath.NodeSet",
      "org.apache.html.dom.HTMLIFrameElementImpl",
      "org.apache.html.dom.HTMLTableElementImpl",
      "org.apache.commons.jxpath.JXPathContext",
      "org.apache.html.dom.HTMLTableSectionElementImpl",
      "org.apache.commons.jxpath.ri.compiler.TreeCompiler",
      "org.apache.html.dom.HTMLHeadElementImpl",
      "org.apache.html.dom.HTMLLegendElementImpl",
      "org.apache.commons.jxpath.JXPathNotFoundException",
      "org.apache.commons.jxpath.ri.model.dom.NamespacePointer",
      "org.jdom.Comment",
      "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator",
      "org.apache.html.dom.HTMLFontElementImpl",
      "org.apache.commons.jxpath.ri.model.beans.NullPointer",
      "org.apache.html.dom.HTMLElementImpl",
      "org.apache.commons.jxpath.JXPathIntrospector",
      "org.apache.commons.jxpath.ri.compiler.NodeTest",
      "org.apache.html.dom.HTMLQuoteElementImpl",
      "org.apache.html.dom.HTMLDocumentImpl",
      "org.apache.commons.jxpath.JXPathBasicBeanInfo$1",
      "org.apache.commons.jxpath.KeyManager",
      "org.apache.commons.jxpath.util.TypeConverter",
      "org.apache.html.dom.HTMLScriptElementImpl",
      "org.apache.html.dom.HTMLParamElementImpl",
      "org.apache.commons.jxpath.ri.compiler.NameAttributeTest",
      "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1",
      "org.apache.commons.jxpath.DynamicPropertyHandler",
      "org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest",
      "org.apache.html.dom.HTMLBaseElementImpl",
      "org.apache.commons.jxpath.Container",
      "org.apache.commons.jxpath.ri.model.NodePointerFactory",
      "org.apache.html.dom.HTMLMenuElementImpl",
      "org.apache.html.dom.HTMLFormControl",
      "org.apache.html.dom.HTMLFieldSetElementImpl",
      "org.apache.commons.jxpath.ri.NamespaceResolver",
      "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer",
      "org.apache.html.dom.HTMLTableCellElementImpl",
      "org.apache.commons.jxpath.AbstractFactory",
      "org.apache.html.dom.HTMLOptionElementImpl",
      "org.jdom.ContentList",
      "org.apache.html.dom.HTMLFrameElementImpl",
      "org.jdom.IllegalAddException",
      "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointer",
      "org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory",
      "org.jdom.Element",
      "org.apache.html.dom.HTMLDirectoryElementImpl",
      "org.apache.html.dom.HTMLTableCaptionElementImpl",
      "org.apache.commons.jxpath.ri.Compiler",
      "org.apache.html.dom.HTMLObjectElementImpl",
      "org.apache.html.dom.HTMLFormElementImpl",
      "org.apache.commons.jxpath.JXPathAbstractFactoryException",
      "org.apache.html.dom.HTMLDivElementImpl",
      "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual",
      "org.apache.commons.jxpath.JXPathInvalidAccessException",
      "org.apache.html.dom.HTMLSelectElementImpl",
      "org.apache.commons.jxpath.ri.model.NodePointer",
      "org.apache.commons.jxpath.ri.compiler.CoreOperation",
      "org.apache.html.dom.HTMLAppletElementImpl",
      "org.apache.html.dom.HTMLMetaElementImpl",
      "org.apache.commons.jxpath.Functions",
      "org.apache.html.dom.HTMLStyleElementImpl",
      "org.apache.commons.jxpath.ri.model.container.ContainerPointer",
      "org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory",
      "org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl",
      "org.apache.html.dom.HTMLHtmlElementImpl",
      "org.apache.html.dom.HTMLImageElementImpl",
      "org.apache.html.dom.HTMLInputElementImpl",
      "org.apache.commons.jxpath.ri.axes.RootContext",
      "org.apache.commons.jxpath.ri.axes.InitialContext",
      "org.apache.html.dom.HTMLAnchorElementImpl",
      "org.apache.commons.jxpath.util.ClassLoaderUtil",
      "org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer",
      "org.apache.commons.beanutils.DynaBean",
      "org.apache.html.dom.HTMLMapElementImpl",
      "org.apache.commons.jxpath.MapDynamicPropertyHandler",
      "org.apache.commons.jxpath.ri.compiler.NodeTypeTest",
      "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl",
      "org.apache.html.dom.HTMLOListElementImpl",
      "org.apache.commons.jxpath.util.TypeUtils$1",
      "org.apache.commons.jxpath.IdentityManager",
      "org.apache.commons.jxpath.util.ValueUtils",
      "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator",
      "org.apache.commons.jxpath.JXPathException",
      "org.apache.html.dom.HTMLUListElementImpl",
      "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer",
      "org.apache.html.dom.HTMLIsIndexElementImpl",
      "org.apache.commons.jxpath.PackageFunctions",
      "org.jdom.Content",
      "org.apache.html.dom.HTMLLabelElementImpl",
      "org.apache.html.dom.HTMLTableColElementImpl",
      "org.apache.commons.jxpath.ri.model.VariablePointerFactory",
      "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory",
      "org.apache.html.dom.HTMLTitleElementImpl",
      "org.apache.html.dom.HTMLParagraphElementImpl",
      "org.apache.commons.jxpath.JXPathContextFactoryConfigurationError",
      "org.jdom.DocType",
      "org.apache.commons.jxpath.util.TypeUtils",
      "org.apache.html.dom.HTMLAreaElementImpl",
      "org.apache.commons.jxpath.JXPathTypeConversionException",
      "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator",
      "org.apache.commons.jxpath.JXPathBasicBeanInfo",
      "org.jdom.ProcessingInstruction",
      "org.apache.html.dom.HTMLBaseFontElementImpl",
      "org.apache.commons.jxpath.ri.EvalContext",
      "org.apache.commons.jxpath.JXPathFunctionNotFoundException",
      "org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory",
      "org.apache.commons.jxpath.ri.compiler.NodeNameTest",
      "org.apache.commons.jxpath.Pointer",
      "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer",
      "org.apache.commons.jxpath.ri.compiler.Expression",
      "org.apache.commons.jxpath.ri.compiler.Operation",
      "org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory",
      "org.apache.commons.jxpath.Function",
      "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DOMNodePointer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.jxpath.ri.model.NodePointer",
      "org.apache.commons.jxpath.ri.model.dom.DOMNodePointer",
      "org.apache.commons.jxpath.util.BasicTypeConverter",
      "org.apache.commons.jxpath.util.TypeUtils$1",
      "org.apache.commons.jxpath.util.TypeUtils",
      "org.apache.wml.dom.WMLElementImpl",
      "org.apache.wml.dom.WMLBElementImpl",
      "org.apache.wml.dom.WMLNoopElementImpl",
      "org.apache.wml.dom.WMLAElementImpl",
      "org.apache.wml.dom.WMLSetvarElementImpl",
      "org.apache.wml.dom.WMLAccessElementImpl",
      "org.apache.wml.dom.WMLStrongElementImpl",
      "org.apache.wml.dom.WMLPostfieldElementImpl",
      "org.apache.wml.dom.WMLDoElementImpl",
      "org.apache.wml.dom.WMLWmlElementImpl",
      "org.apache.wml.dom.WMLTrElementImpl",
      "org.apache.wml.dom.WMLGoElementImpl",
      "org.apache.wml.dom.WMLBigElementImpl",
      "org.apache.wml.dom.WMLAnchorElementImpl",
      "org.apache.wml.dom.WMLTimerElementImpl",
      "org.apache.wml.dom.WMLSmallElementImpl",
      "org.apache.wml.dom.WMLOptgroupElementImpl",
      "org.apache.wml.dom.WMLHeadElementImpl",
      "org.apache.wml.dom.WMLTdElementImpl",
      "org.apache.wml.dom.WMLFieldsetElementImpl",
      "org.apache.wml.dom.WMLImgElementImpl",
      "org.apache.wml.dom.WMLRefreshElementImpl",
      "org.apache.wml.dom.WMLOneventElementImpl",
      "org.apache.wml.dom.WMLInputElementImpl",
      "org.apache.wml.dom.WMLPrevElementImpl",
      "org.apache.wml.dom.WMLTableElementImpl",
      "org.apache.wml.dom.WMLMetaElementImpl",
      "org.apache.wml.dom.WMLTemplateElementImpl",
      "org.apache.wml.dom.WMLBrElementImpl",
      "org.apache.wml.dom.WMLOptionElementImpl",
      "org.apache.wml.dom.WMLUElementImpl",
      "org.apache.wml.dom.WMLPElementImpl",
      "org.apache.wml.dom.WMLSelectElementImpl",
      "org.apache.wml.dom.WMLEmElementImpl",
      "org.apache.wml.dom.WMLIElementImpl",
      "org.apache.wml.dom.WMLCardElementImpl",
      "org.apache.wml.dom.WMLDocumentImpl",
      "org.apache.html.dom.HTMLDocumentImpl",
      "org.apache.html.dom.HTMLElementImpl",
      "org.apache.html.dom.HTMLSelectElementImpl",
      "org.apache.commons.jxpath.PackageFunctions",
      "org.apache.commons.jxpath.JXPathContext",
      "org.apache.commons.jxpath.JXPathContextFactory",
      "org.apache.commons.jxpath.util.ClassLoaderUtil",
      "org.apache.commons.jxpath.ri.JXPathContextFactoryReferenceImpl",
      "org.apache.commons.jxpath.ri.QName",
      "org.apache.commons.jxpath.ri.compiler.TreeCompiler",
      "org.apache.commons.jxpath.ri.model.beans.CollectionPointerFactory",
      "org.apache.commons.jxpath.ri.model.beans.BeanPointerFactory",
      "org.apache.commons.jxpath.ri.model.dynamic.DynamicPointerFactory",
      "org.apache.commons.jxpath.ri.model.VariablePointerFactory",
      "org.apache.commons.jxpath.ri.model.dom.DOMPointerFactory",
      "org.jdom.Document",
      "org.apache.commons.jxpath.ri.model.jdom.JDOMPointerFactory",
      "org.apache.commons.jxpath.ri.model.dynabeans.DynaBeanPointerFactory",
      "org.apache.commons.jxpath.ri.model.container.ContainerPointerFactory",
      "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl$1",
      "org.apache.commons.jxpath.ri.JXPathContextReferenceImpl",
      "org.apache.commons.jxpath.util.ValueUtils",
      "org.apache.commons.jxpath.ri.NamespaceResolver",
      "org.apache.html.dom.HTMLParamElementImpl",
      "org.apache.commons.jxpath.ri.compiler.NodeTest",
      "org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest",
      "org.apache.html.dom.HTMLFieldSetElementImpl",
      "org.apache.commons.jxpath.JXPathException",
      "org.apache.html.dom.HTMLTableSectionElementImpl",
      "org.apache.commons.jxpath.ri.model.VariablePointer",
      "org.apache.commons.jxpath.ri.compiler.NodeTypeTest",
      "org.apache.commons.jxpath.ri.model.dom.DOMNodeIterator",
      "org.apache.commons.jxpath.ri.model.beans.PropertyOwnerPointer",
      "org.apache.commons.jxpath.ri.model.beans.NullPointer",
      "org.apache.commons.jxpath.ri.model.VariablePointer$1",
      "org.apache.html.dom.HTMLIsIndexElementImpl",
      "org.apache.html.dom.HTMLBRElementImpl",
      "org.apache.commons.jxpath.BasicVariables",
      "org.apache.commons.jxpath.JXPathBasicBeanInfo$1",
      "org.apache.commons.jxpath.JXPathBasicBeanInfo",
      "org.apache.commons.jxpath.JXPathIntrospector",
      "org.apache.commons.jxpath.ri.model.beans.BeanPointer",
      "org.apache.html.dom.HTMLStyleElementImpl",
      "org.apache.commons.jxpath.ri.model.dom.NamespacePointer",
      "org.apache.commons.jxpath.ri.model.dom.DOMNamespaceIterator",
      "org.apache.commons.jxpath.ri.model.dom.DOMAttributeIterator",
      "org.apache.html.dom.HTMLParagraphElementImpl",
      "org.apache.html.dom.HTMLBodyElementImpl",
      "org.apache.commons.jxpath.ri.model.beans.PropertyIterator",
      "org.apache.commons.jxpath.ri.model.beans.BeanAttributeIterator",
      "org.apache.commons.jxpath.ri.model.beans.PropertyPointer",
      "org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer",
      "org.apache.html.dom.HTMLMenuElementImpl",
      "org.apache.html.dom.HTMLObjectElementImpl",
      "org.apache.html.dom.HTMLHtmlElementImpl",
      "org.apache.html.dom.HTMLTableCaptionElementImpl",
      "org.apache.html.dom.HTMLTableRowElementImpl",
      "org.apache.html.dom.HTMLTableCellElementImpl",
      "org.apache.html.dom.HTMLFrameElementImpl",
      "org.apache.html.dom.HTMLCollectionImpl",
      "org.apache.html.dom.HTMLHeadElementImpl",
      "org.apache.html.dom.HTMLInputElementImpl",
      "org.apache.html.dom.HTMLAnchorElementImpl",
      "org.apache.html.dom.HTMLTextAreaElementImpl",
      "org.apache.html.dom.HTMLAreaElementImpl",
      "org.apache.html.dom.HTMLScriptElementImpl",
      "org.apache.commons.jxpath.ri.parser.XPathParser",
      "org.apache.commons.jxpath.ri.parser.XPathParser$LookaheadSuccess",
      "org.apache.commons.jxpath.ri.parser.SimpleCharStream",
      "org.apache.commons.jxpath.ri.parser.XPathParserTokenManager",
      "org.apache.commons.jxpath.ri.parser.Token",
      "org.apache.commons.jxpath.ri.parser.XPathParser$JJCalls",
      "org.apache.commons.jxpath.ri.Parser",
      "org.apache.commons.jxpath.ri.parser.ParseException",
      "org.apache.commons.jxpath.ri.parser.XPathParserConstants",
      "org.apache.commons.jxpath.JXPathInvalidSyntaxException",
      "org.apache.commons.jxpath.ri.parser.TokenMgrError",
      "org.apache.html.dom.HTMLLinkElementImpl",
      "org.apache.html.dom.HTMLBaseFontElementImpl",
      "org.apache.html.dom.HTMLPreElementImpl",
      "org.apache.html.dom.HTMLTableColElementImpl",
      "org.apache.html.dom.HTMLDivElementImpl",
      "org.apache.html.dom.HTMLOptionElementImpl",
      "org.apache.html.dom.HTMLImageElementImpl",
      "org.apache.html.dom.HTMLDListElementImpl",
      "org.apache.html.dom.HTMLIFrameElementImpl",
      "org.apache.html.dom.HTMLLegendElementImpl",
      "org.apache.commons.jxpath.ri.compiler.NodeNameTest",
      "org.apache.commons.jxpath.ri.compiler.Step",
      "org.apache.html.dom.HTMLHRElementImpl",
      "org.apache.html.dom.HTMLButtonElementImpl",
      "org.apache.html.dom.HTMLOptGroupElementImpl",
      "org.apache.html.dom.HTMLHeadingElementImpl",
      "org.apache.commons.jxpath.ri.model.dom.DOMAttributePointer",
      "org.apache.html.dom.HTMLModElementImpl",
      "org.apache.html.dom.HTMLFrameSetElementImpl",
      "org.apache.commons.jxpath.ri.JXPathCompiledExpression",
      "org.apache.html.dom.HTMLFormElementImpl",
      "org.apache.html.dom.HTMLFontElementImpl",
      "org.apache.html.dom.HTMLDirectoryElementImpl",
      "org.apache.html.dom.HTMLLIElementImpl",
      "org.apache.html.dom.HTMLUListElementImpl",
      "org.apache.html.dom.HTMLTitleElementImpl",
      "org.apache.html.dom.HTMLTableElementImpl",
      "org.apache.commons.jxpath.FunctionLibrary",
      "org.apache.html.dom.HTMLQuoteElementImpl",
      "org.apache.commons.jxpath.ri.model.beans.CollectionPointer",
      "org.apache.html.dom.HTMLLabelElementImpl",
      "org.apache.html.dom.HTMLBaseElementImpl",
      "org.apache.commons.jxpath.ri.compiler.Expression",
      "org.apache.commons.jxpath.ri.compiler.Path",
      "org.apache.commons.jxpath.ri.compiler.LocationPath",
      "org.apache.commons.jxpath.ri.EvalContext",
      "org.apache.commons.jxpath.ri.axes.InitialContext",
      "org.apache.commons.jxpath.ri.axes.RootContext",
      "org.apache.commons.jxpath.ri.axes.SimplePathInterpreter",
      "org.apache.commons.jxpath.JXPathNotFoundException",
      "org.apache.html.dom.HTMLOListElementImpl",
      "org.apache.html.dom.HTMLAppletElementImpl",
      "org.apache.html.dom.HTMLMapElementImpl",
      "org.apache.html.dom.HTMLMetaElementImpl",
      "org.apache.html.dom.NameNodeListImpl",
      "org.apache.commons.jxpath.ri.axes.ChildContext",
      "org.apache.commons.jxpath.ri.compiler.Expression$ValueIterator",
      "org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer",
      "org.apache.commons.jxpath.ri.compiler.Constant",
      "org.apache.commons.jxpath.ri.compiler.Operation",
      "org.apache.commons.jxpath.ri.compiler.CoreOperation",
      "org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression",
      "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan",
      "org.apache.commons.jxpath.ClassFunctions",
      "org.apache.commons.jxpath.JXPathInvalidAccessException",
      "org.apache.commons.jxpath.util.ReverseComparator",
      "org.apache.commons.jxpath.ri.compiler.CoreOperationNegate",
      "org.apache.commons.jxpath.ri.compiler.CoreFunction",
      "org.apache.commons.jxpath.ri.InfoSetUtil"
    );
  }
}
