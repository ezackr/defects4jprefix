/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Apr 07 18:50:51 GMT 2024
 */

package org.apache.commons.math.optimization.direct;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BOBYQAOptimizer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.optimization.direct.BOBYQAOptimizer"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BOBYQAOptimizer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.util.Incrementor",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.optimization.SimpleScalarValueChecker",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.random.UnitSphereRandomVectorGenerator",
      "org.apache.commons.math.exception.NotFiniteNumberException",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException",
      "org.apache.commons.math.random.RandomGenerator",
      "org.apache.commons.math.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math.linear.RealLinearOperator",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.exception.MultiDimensionMismatchException",
      "org.apache.commons.math.exception.MathParseException",
      "org.apache.commons.math.util.FastMath$ExpIntTable",
      "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.optimization.MultivariateOptimizer",
      "org.apache.commons.math.analysis.MultivariateFunction",
      "org.apache.commons.math.analysis.BivariateRealFunction",
      "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction$MicrosphereSurfaceElement",
      "org.apache.commons.math.util.FastMath$lnMant",
      "org.apache.commons.math.random.MersenneTwister",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.util.FastMathLiteralArrays",
      "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction",
      "org.apache.commons.math.optimization.ConvergenceChecker",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.linear.RealVector$2",
      "org.apache.commons.math.exception.ZeroException",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.optimization.BaseMultivariateOptimizer",
      "org.apache.commons.math.optimization.BaseOptimizer",
      "org.apache.commons.math.linear.SparseRealMatrix",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.linear.NonSquareMatrixException",
      "org.apache.commons.math.random.RandomVectorGenerator",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.util.Incrementor$1",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.random.BitsStreamGenerator",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.optimization.BaseMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer",
      "org.apache.commons.math.exception.util.ExceptionContextProvider",
      "org.apache.commons.math.util.FastMath$ExpFracTable",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.optimization.GoalType",
      "org.apache.commons.math.exception.util.ArgUtils"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BOBYQAOptimizer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateOptimizer",
      "org.apache.commons.math.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer",
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer",
      "org.apache.commons.math.optimization.direct.BOBYQAOptimizer$PathIsExploredException",
      "org.apache.commons.math.optimization.GoalType",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.optimization.SimpleScalarValueChecker",
      "org.apache.commons.math.util.Incrementor",
      "org.apache.commons.math.util.Incrementor$1",
      "org.apache.commons.math.random.BitsStreamGenerator",
      "org.apache.commons.math.random.AbstractWell",
      "org.apache.commons.math.random.Well44497a",
      "org.apache.commons.math.random.UnitSphereRandomVectorGenerator",
      "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.exception.util.ArgUtils",
      "org.apache.commons.math.random.MersenneTwister",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.random.Well1024a",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.util.MathUtils",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.random.Well19937c",
      "org.apache.commons.math.random.Well512a",
      "org.apache.commons.math.util.FastMathLiteralArrays",
      "org.apache.commons.math.util.FastMath$lnMant",
      "org.apache.commons.math.random.ISAACRandom",
      "org.apache.commons.math.random.Well44497b",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.analysis.interpolation.MicrosphereInterpolatingFunction$MicrosphereSurfaceElement",
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.random.Well19937a",
      "org.apache.commons.math.random.RandomAdaptor",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.linear.RealLinearOperator",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.util.FastMath$ExpIntTable",
      "org.apache.commons.math.util.FastMath$ExpFracTable",
      "org.apache.commons.math.optimization.RealPointValuePair"
    );
  }
}
