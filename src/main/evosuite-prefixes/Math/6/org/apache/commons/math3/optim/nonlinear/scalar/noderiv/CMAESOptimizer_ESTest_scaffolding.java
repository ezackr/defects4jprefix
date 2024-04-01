/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 20 08:23:13 GMT 2023
 */

package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CMAESOptimizer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer"; 
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

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CMAESOptimizer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer",
      "org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor",
      "org.apache.commons.math3.optim.SimplePointChecker",
      "org.apache.commons.math3.analysis.function.Tan",
      "org.apache.commons.math3.linear.RealVectorFormat",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize",
      "org.apache.commons.math3.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math3.linear.RealVector",
      "org.apache.commons.math3.analysis.function.Constant",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.exception.MathArithmeticException",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.optim.nonlinear.scalar.GoalType",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionNewtonForm",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback",
      "org.apache.commons.math3.analysis.function.Cos",
      "org.apache.commons.math3.analysis.differentiation.DSCompiler",
      "org.apache.commons.math3.RealFieldElement",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.analysis.function.Sinc",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.optim.PointValuePair",
      "org.apache.commons.math3.analysis.function.Ulp",
      "org.apache.commons.math3.FieldElement",
      "org.apache.commons.math3.optim.BaseMultivariateOptimizer",
      "org.apache.commons.math3.analysis.function.Acos",
      "org.apache.commons.math3.optim.OptimizationData",
      "org.apache.commons.math3.linear.RealVector$Entry",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.exception.TooManyEvaluationsException",
      "org.apache.commons.math3.analysis.function.HarmonicOscillator",
      "org.apache.commons.math3.analysis.differentiation.UnivariateDifferentiableFunction",
      "org.apache.commons.math3.linear.RealMatrix",
      "org.apache.commons.math3.optim.MaxEval",
      "org.apache.commons.math3.analysis.function.Sinh",
      "org.apache.commons.math3.optim.SimpleBounds",
      "org.apache.commons.math3.exception.util.ExceptionContextProvider",
      "org.apache.commons.math3.linear.BlockRealMatrix",
      "org.apache.commons.math3.analysis.function.Asinh",
      "org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math3.analysis.function.Sqrt",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.random.SynchronizedRandomGenerator",
      "org.apache.commons.math3.exception.MathIllegalStateException",
      "org.apache.commons.math3.optim.BaseOptimizer",
      "org.apache.commons.math3.linear.NonSquareMatrixException",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math3.analysis.function.Log",
      "org.apache.commons.math3.analysis.function.Expm1",
      "org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math3.linear.Array2DRowRealMatrix",
      "org.apache.commons.math3.analysis.function.Log1p",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.linear.AbstractRealMatrix",
      "org.apache.commons.math3.analysis.function.Floor",
      "org.apache.commons.math3.util.Incrementor$MaxCountExceededCallback",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.analysis.function.Rint",
      "org.apache.commons.math3.analysis.function.Abs",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.optim.ConvergenceChecker",
      "org.apache.commons.math3.linear.RealVectorPreservingVisitor",
      "org.apache.commons.math3.linear.RealVectorChangingVisitor",
      "org.apache.commons.math3.analysis.function.StepFunction",
      "org.apache.commons.math3.optim.SimpleVectorValueChecker",
      "org.apache.commons.math3.random.Well512a",
      "org.apache.commons.math3.linear.RealVector$2",
      "org.apache.commons.math3.analysis.function.Tanh",
      "org.apache.commons.math3.analysis.DifferentiableUnivariateFunction",
      "org.apache.commons.math3.analysis.function.Exp",
      "org.apache.commons.math3.analysis.function.Cbrt",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.analysis.differentiation.DerivativeStructure",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.exception.NonMonotonicSequenceException",
      "org.apache.commons.math3.linear.ArrayRealVector",
      "org.apache.commons.math3.linear.RealVector$SparseEntryIterator",
      "org.apache.commons.math3.analysis.function.Sigmoid",
      "org.apache.commons.math3.exception.MathUnsupportedOperationException",
      "org.apache.commons.math3.analysis.function.Ceil",
      "org.apache.commons.math3.analysis.function.Minus",
      "org.apache.commons.math3.analysis.function.Log10",
      "org.apache.commons.math3.linear.RealMatrixFormat",
      "org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction",
      "org.apache.commons.math3.analysis.function.Logit",
      "org.apache.commons.math3.linear.SparseRealMatrix",
      "org.apache.commons.math3.exception.NumberIsTooLargeException",
      "org.apache.commons.math3.analysis.function.Signum",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.analysis.BivariateFunction",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.optim.PointVectorValuePair",
      "org.apache.commons.math3.analysis.function.Logistic",
      "org.apache.commons.math3.exception.NoDataException",
      "org.apache.commons.math3.random.AbstractRandomGenerator",
      "org.apache.commons.math3.analysis.function.Gaussian",
      "org.apache.commons.math3.linear.SparseRealVector",
      "org.apache.commons.math3.analysis.UnivariateFunction",
      "org.apache.commons.math3.analysis.MultivariateFunction",
      "org.apache.commons.math3.linear.RealLinearOperator",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.optim.MaxIter",
      "org.apache.commons.math3.analysis.function.Acosh",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$Sigma",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math3.analysis.function.Inverse",
      "org.apache.commons.math3.analysis.function.Atan",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.optim.BaseOptimizer$1",
      "org.apache.commons.math3.random.RandomAdaptor",
      "org.apache.commons.math3.analysis.function.Sin",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer",
      "org.apache.commons.math3.linear.OpenMapRealMatrix",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$FitnessFunction",
      "org.apache.commons.math3.optim.SimpleValueChecker",
      "org.apache.commons.math3.linear.OpenMapRealVector",
      "org.apache.commons.math3.linear.MatrixDimensionMismatchException",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.optim.InitialGuess",
      "org.apache.commons.math3.exception.MultiDimensionMismatchException",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.optim.AbstractConvergenceChecker",
      "org.apache.commons.math3.linear.AnyMatrix",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$DoubleIndex",
      "org.apache.commons.math3.exception.MaxCountExceededException",
      "org.apache.commons.math3.analysis.function.Identity",
      "org.apache.commons.math3.analysis.function.Atanh",
      "org.apache.commons.math3.analysis.function.Cosh",
      "org.apache.commons.math3.exception.TooManyIterationsException",
      "org.apache.commons.math3.exception.util.Localizable",
      "org.apache.commons.math3.random.RandomGenerator",
      "org.apache.commons.math3.exception.NullArgumentException",
      "org.apache.commons.math3.analysis.function.Power",
      "org.apache.commons.math3.Field",
      "org.apache.commons.math3.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math3.linear.DiagonalMatrix",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.analysis.function.Asin"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CMAESOptimizer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.math3.optim.BaseOptimizer",
      "org.apache.commons.math3.optim.BaseMultivariateOptimizer",
      "org.apache.commons.math3.optim.nonlinear.scalar.MultivariateOptimizer",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$FitnessFunction",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$DoubleIndex",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$Sigma",
      "org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize",
      "org.apache.commons.math3.optim.nonlinear.scalar.GoalType",
      "org.apache.commons.math3.random.BitsStreamGenerator",
      "org.apache.commons.math3.random.AbstractWell",
      "org.apache.commons.math3.random.Well19937a",
      "org.apache.commons.math3.optim.AbstractConvergenceChecker",
      "org.apache.commons.math3.optim.SimpleValueChecker",
      "org.apache.commons.math3.exception.MathIllegalArgumentException",
      "org.apache.commons.math3.exception.MathIllegalNumberException",
      "org.apache.commons.math3.exception.NumberIsTooSmallException",
      "org.apache.commons.math3.exception.NotStrictlyPositiveException",
      "org.apache.commons.math3.exception.util.LocalizedFormats",
      "org.apache.commons.math3.exception.util.ExceptionContext",
      "org.apache.commons.math3.exception.util.ArgUtils",
      "org.apache.commons.math3.random.Well512a",
      "org.apache.commons.math3.util.Incrementor",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxEvalCallback",
      "org.apache.commons.math3.optim.BaseOptimizer$MaxIterCallback",
      "org.apache.commons.math3.optim.MaxEval",
      "org.apache.commons.math3.random.ISAACRandom",
      "org.apache.commons.math3.random.RandomAdaptor",
      "org.apache.commons.math3.optim.MaxIter",
      "org.apache.commons.math3.random.Well44497a",
      "org.apache.commons.math3.optim.SimplePointChecker",
      "org.apache.commons.math3.exception.NotPositiveException",
      "org.apache.commons.math3.random.MersenneTwister",
      "org.apache.commons.math3.util.FastMath",
      "org.apache.commons.math3.optim.SimpleBounds",
      "org.apache.commons.math3.random.Well19937c",
      "org.apache.commons.math3.optim.InitialGuess",
      "org.apache.commons.math3.random.Well44497b",
      "org.apache.commons.math3.random.JDKRandomGenerator",
      "org.apache.commons.math3.random.Well1024a",
      "org.apache.commons.math3.random.SynchronizedRandomGenerator",
      "org.apache.commons.math3.util.Pair",
      "org.apache.commons.math3.optim.PointValuePair",
      "org.apache.commons.math3.util.FastMathLiteralArrays",
      "org.apache.commons.math3.util.FastMath$lnMant",
      "org.apache.commons.math3.util.FastMath$CodyWaite",
      "org.apache.commons.math3.exception.DimensionMismatchException",
      "org.apache.commons.math3.exception.OutOfRangeException",
      "org.apache.commons.math3.exception.NumberIsTooLargeException"
    );
  }
}
