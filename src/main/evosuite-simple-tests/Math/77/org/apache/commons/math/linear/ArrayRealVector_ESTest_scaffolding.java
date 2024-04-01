/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Oct 16 19:04:18 GMT 2023
 */

package org.apache.commons.math.linear;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ArrayRealVector_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.linear.ArrayRealVector"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ArrayRealVector_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry",
      "org.apache.commons.math.analysis.ComposableFunction$2",
      "org.apache.commons.math.analysis.ComposableFunction$1",
      "org.apache.commons.math.analysis.ComposableFunction$4",
      "org.apache.commons.math.analysis.ComposableFunction$3",
      "org.apache.commons.math.analysis.ComposableFunction$6",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math.analysis.ComposableFunction$5",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.DuplicateSampleAbscissaException",
      "org.apache.commons.math.linear.AbstractRealVector$SparseEntryIterator",
      "org.apache.commons.math.analysis.ComposableFunction$17",
      "org.apache.commons.math.analysis.ComposableFunction$16",
      "org.apache.commons.math.linear.AbstractRealVector$1",
      "org.apache.commons.math.analysis.ComposableFunction$19",
      "org.apache.commons.math.analysis.ComposableFunction$18",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.analysis.ComposableFunction$13",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.analysis.ComposableFunction$12",
      "org.apache.commons.math.analysis.ComposableFunction$15",
      "org.apache.commons.math.ArgumentOutsideDomainException",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.analysis.ComposableFunction$14",
      "org.apache.commons.math.MathRuntimeException$2",
      "org.apache.commons.math.MathRuntimeException$3",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.analysis.ComposableFunction$11",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.analysis.ComposableFunction$10",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.MathRuntimeException$8",
      "org.apache.commons.math.MathRuntimeException$9",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.analysis.ComposableFunction$28",
      "org.apache.commons.math.analysis.ComposableFunction$27",
      "org.apache.commons.math.analysis.ComposableFunction$29",
      "org.apache.commons.math.analysis.ComposableFunction$24",
      "org.apache.commons.math.analysis.ComposableFunction$23",
      "org.apache.commons.math.analysis.ComposableFunction$26",
      "org.apache.commons.math.analysis.ComposableFunction$25",
      "org.apache.commons.math.analysis.ComposableFunction$8",
      "org.apache.commons.math.analysis.ComposableFunction$20",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.analysis.ComposableFunction$7",
      "org.apache.commons.math.analysis.ComposableFunction$22",
      "org.apache.commons.math.analysis.ComposableFunction$9",
      "org.apache.commons.math.analysis.ComposableFunction$21",
      "org.apache.commons.math.linear.SparseRealMatrix",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.FunctionEvaluationException",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.linear.AbstractRealVector",
      "org.apache.commons.math.analysis.ComposableFunction$35",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.analysis.ComposableFunction$34",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.analysis.ComposableFunction$36",
      "org.apache.commons.math.analysis.ComposableFunction$31",
      "org.apache.commons.math.analysis.ComposableFunction$30",
      "org.apache.commons.math.analysis.ComposableFunction$33",
      "org.apache.commons.math.analysis.ComposableFunction$32",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.analysis.BinaryFunction$3",
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.analysis.BinaryFunction$4",
      "org.apache.commons.math.analysis.BinaryFunction$5",
      "org.apache.commons.math.analysis.BinaryFunction$6",
      "org.apache.commons.math.analysis.BinaryFunction$7",
      "org.apache.commons.math.analysis.BinaryFunction$8",
      "org.apache.commons.math.analysis.BinaryFunction",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap$1",
      "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.analysis.MultivariateRealFunction",
      "org.apache.commons.math.analysis.BinaryFunction$1",
      "org.apache.commons.math.analysis.BinaryFunction$2",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.linear.RealVector$Entry",
      "org.apache.commons.math.linear.SparseRealVector",
      "org.apache.commons.math.analysis.BivariateRealFunction",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator",
      "org.apache.commons.math.MathRuntimeException$10",
      "org.apache.commons.math.linear.AbstractRealVector$EntryImpl",
      "org.apache.commons.math.analysis.ComposableFunction",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.linear.MatrixVisitorException",
      "org.apache.commons.math.linear.BigMatrix",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm",
      "org.apache.commons.math.linear.FieldMatrix"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ArrayRealVector_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.linear.AbstractRealVector",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator",
      "org.apache.commons.math.linear.RealVector$Entry",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.analysis.ComposableFunction$1",
      "org.apache.commons.math.analysis.ComposableFunction$2",
      "org.apache.commons.math.analysis.ComposableFunction$3",
      "org.apache.commons.math.analysis.ComposableFunction$4",
      "org.apache.commons.math.analysis.ComposableFunction$5",
      "org.apache.commons.math.analysis.ComposableFunction$6",
      "org.apache.commons.math.analysis.ComposableFunction$7",
      "org.apache.commons.math.analysis.ComposableFunction$8",
      "org.apache.commons.math.analysis.ComposableFunction$9",
      "org.apache.commons.math.analysis.ComposableFunction$10",
      "org.apache.commons.math.analysis.ComposableFunction$11",
      "org.apache.commons.math.analysis.ComposableFunction$12",
      "org.apache.commons.math.analysis.ComposableFunction$13",
      "org.apache.commons.math.analysis.ComposableFunction$14",
      "org.apache.commons.math.analysis.ComposableFunction$15",
      "org.apache.commons.math.analysis.ComposableFunction$16",
      "org.apache.commons.math.analysis.ComposableFunction$17",
      "org.apache.commons.math.analysis.ComposableFunction$18",
      "org.apache.commons.math.analysis.ComposableFunction$19",
      "org.apache.commons.math.analysis.ComposableFunction$20",
      "org.apache.commons.math.analysis.ComposableFunction$21",
      "org.apache.commons.math.analysis.ComposableFunction$22",
      "org.apache.commons.math.analysis.ComposableFunction$23",
      "org.apache.commons.math.analysis.ComposableFunction$24",
      "org.apache.commons.math.analysis.ComposableFunction$25",
      "org.apache.commons.math.analysis.ComposableFunction$26",
      "org.apache.commons.math.analysis.ComposableFunction$27",
      "org.apache.commons.math.analysis.ComposableFunction",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.linear.AbstractRealVector$SparseEntryIterator",
      "org.apache.commons.math.linear.AbstractRealVector$EntryImpl",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.analysis.BinaryFunction$1",
      "org.apache.commons.math.analysis.BinaryFunction$2",
      "org.apache.commons.math.analysis.BinaryFunction$3",
      "org.apache.commons.math.analysis.BinaryFunction$4",
      "org.apache.commons.math.analysis.BinaryFunction$5",
      "org.apache.commons.math.analysis.BinaryFunction$6",
      "org.apache.commons.math.analysis.BinaryFunction",
      "org.apache.commons.math.analysis.BinaryFunction$8",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm",
      "org.apache.commons.math.linear.AbstractRealVector$1"
    );
  }
}
