/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 16:49:44 GMT 2023
 */
package org.apache.commons.math.optimization;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunction;
import org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm;
import org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer;
import org.apache.commons.math.optimization.UnivariateRealOptimizer;
import org.apache.commons.math.random.JDKRandomGenerator;
import org.apache.commons.math.random.MersenneTwister;
import org.apache.commons.math.random.RandomAdaptor;
import org.apache.commons.math.random.RandomGenerator;
import org.junit.runner.RunWith;

public class MultiStartUnivariateRealOptimizerTest {

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        int int0 = Integer.MAX_VALUE;
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, Integer.MAX_VALUE, (RandomGenerator) null);
        multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
        try {
            multiStartUnivariateRealOptimizer0.getOptima();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no optimum computed yet
        }
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        int[] intArray0 = new int[4];
        MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-2936), mersenneTwister0);
        multiStartUnivariateRealOptimizer0.setAbsoluteAccuracy(Double.NaN);
        multiStartUnivariateRealOptimizer0.setMaxEvaluations((-1909));
        mersenneTwister0.setSeed((long) (-1909));
        multiStartUnivariateRealOptimizer0.setMaxEvaluations((-2936));
        multiStartUnivariateRealOptimizer0.getMaximalIterationCount();
        try {
            multiStartUnivariateRealOptimizer0.getOptimaValues();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no optimum computed yet
        }
    }

    @Test(timeout = 4000)
    public void test072() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(0.0).when(univariateRealOptimizer0).getAbsoluteAccuracy();
        doReturn(0.0).when(univariateRealOptimizer0).getRelativeAccuracy();
        doReturn(0.0).when(univariateRealOptimizer0).getFunctionValue();
        MersenneTwister mersenneTwister0 = new MersenneTwister((long) 0);
        mersenneTwister0.setSeed(0L);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 0, mersenneTwister0);
        mersenneTwister0.nextInt();
        multiStartUnivariateRealOptimizer0.setMaximalIterationCount(0);
        multiStartUnivariateRealOptimizer0.getRelativeAccuracy();
        multiStartUnivariateRealOptimizer0.getEvaluations();
        multiStartUnivariateRealOptimizer0.setAbsoluteAccuracy(0.0);
        multiStartUnivariateRealOptimizer0.getFunctionValue();
        multiStartUnivariateRealOptimizer0.resetMaximalIterationCount();
        multiStartUnivariateRealOptimizer0.getAbsoluteAccuracy();
        try {
            multiStartUnivariateRealOptimizer0.getOptimaValues();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no optimum computed yet
        }
    }

    @Test(timeout = 4000)
    public void test083() throws Throwable {
        int int0 = 1489;
        MersenneTwister mersenneTwister0 = new MersenneTwister();
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 1489, mersenneTwister0);
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.getResult();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test094() throws Throwable {
        int[] intArray0 = null;
        MersenneTwister mersenneTwister0 = new MersenneTwister((int[]) null);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 0, mersenneTwister0);
        mersenneTwister0.setSeed((long) 0);
        int[] intArray1 = new int[2];
        intArray1[0] = 0;
        mersenneTwister0.setSeed(intArray1);
        intArray1[1] = 0;
        mersenneTwister0.nextGaussian();
        mersenneTwister0.nextInt(1474);
        mersenneTwister0.setSeed(intArray1);
        multiStartUnivariateRealOptimizer0.getIterationCount();
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.getFunctionValue();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test105() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        int int0 = 97;
        MersenneTwister mersenneTwister0 = new MersenneTwister((long) 97);
        int[] intArray0 = new int[6];
        int int1 = 107;
        intArray0[0] = 107;
        intArray0[1] = 97;
        intArray0[2] = 97;
        intArray0[3] = 97;
        intArray0[4] = 97;
        intArray0[5] = 97;
        mersenneTwister0.setSeed(intArray0);
        mersenneTwister0.nextInt(97);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 97, mersenneTwister0);
        multiStartUnivariateRealOptimizer0.getIterationCount();
        try {
            multiStartUnivariateRealOptimizer0.getOptima();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no optimum computed yet
        }
    }

    @Test(timeout = 4000)
    public void test116() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        int int0 = 0;
        MersenneTwister mersenneTwister0 = new MersenneTwister();
        mersenneTwister0.nextFloat();
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 0, mersenneTwister0);
        try {
            multiStartUnivariateRealOptimizer0.getOptimaValues();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no optimum computed yet
        }
    }

    @Test(timeout = 4000)
    public void test147() throws Throwable {
        int int0 = 0;
        JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
        jDKRandomGenerator0.doubles();
        jDKRandomGenerator0.ints((long) 0);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 0, jDKRandomGenerator0);
        multiStartUnivariateRealOptimizer0.setMaximalIterationCount(0);
        int int1 = (-657);
        jDKRandomGenerator0.setSeed((-657));
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.setAbsoluteAccuracy(0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test158() throws Throwable {
        int[] intArray0 = new int[6];
        intArray0[0] = 1106;
        intArray0[1] = 1106;
        intArray0[2] = 1106;
        intArray0[3] = 1106;
        intArray0[4] = 1106;
        intArray0[5] = 1106;
        MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, 1106, mersenneTwister0);
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.resetMaximalIterationCount();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test179() throws Throwable {
        MersenneTwister mersenneTwister0 = new MersenneTwister((-1468L));
        mersenneTwister0.nextBoolean();
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, (-3541), mersenneTwister0);
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.setRelativeAccuracy((-3541));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1910() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-779), jDKRandomGenerator0);
        multiStartUnivariateRealOptimizer0.getEvaluations();
        multiStartUnivariateRealOptimizer0.resetRelativeAccuracy();
        try {
            multiStartUnivariateRealOptimizer0.getOptima();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no optimum computed yet
        }
    }

    @Test(timeout = 4000)
    public void test2011() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(univariateRealOptimizer0).getIterationCount();
        doReturn(0.0).when(univariateRealOptimizer0).getRelativeAccuracy();
        doReturn(0).when(univariateRealOptimizer0).getEvaluations();
        doReturn(0.0).when(univariateRealOptimizer0).getFunctionValue();
        doReturn(0.0).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class), any(org.apache.commons.math.optimization.GoalType.class), anyDouble(), anyDouble());
        MersenneTwister mersenneTwister0 = new MersenneTwister(235L);
        mersenneTwister0.setSeed(235L);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1, mersenneTwister0);
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = (double) 235L;
        doubleArray0[1] = (double) 235L;
        doubleArray0[2] = (double) 235L;
        doubleArray0[3] = (double) 1;
        doubleArray0[4] = (double) 0;
        doubleArray0[5] = (double) 235L;
        doubleArray0[6] = (double) 235L;
        doubleArray0[7] = 0.0;
        PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
        UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
        GoalType goalType0 = GoalType.MINIMIZE;
        multiStartUnivariateRealOptimizer0.optimize(univariateRealFunction0, goalType0, (double) 1, 0.0);
        multiStartUnivariateRealOptimizer0.setMaximalIterationCount(0);
        multiStartUnivariateRealOptimizer0.getOptimaValues();
        multiStartUnivariateRealOptimizer0.getIterationCount();
        multiStartUnivariateRealOptimizer0.resetRelativeAccuracy();
        multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
        multiStartUnivariateRealOptimizer0.getRelativeAccuracy();
        try {
            mersenneTwister0.nextInt(0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // 0 is smaller than, or equal to, the minimum (0)
        }
    }

    @Test(timeout = 4000)
    public void test2212() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        int int0 = 0;
        MersenneTwister mersenneTwister0 = new MersenneTwister((long) 0);
        mersenneTwister0.setSeed((long) 0);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 0, mersenneTwister0);
        double[] doubleArray0 = new double[8];
        doubleArray0[0] = (double) 0;
        doubleArray0[1] = 187.0818123856052;
        doubleArray0[2] = (double) 0;
        doubleArray0[3] = (double) 0;
        doubleArray0[4] = (double) 0;
        mersenneTwister0.setSeed(0L);
        doubleArray0[5] = (double) 0;
        doubleArray0[6] = (double) 0;
        doubleArray0[7] = (double) 0;
        PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
        GoalType goalType0 = GoalType.MINIMIZE;
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunctionLagrangeForm0, goalType0, 0.0, 0.0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test2513() throws Throwable {
        int[] intArray0 = new int[4];
        intArray0[0] = (-685);
        intArray0[1] = 0;
        intArray0[2] = (-685);
        intArray0[3] = (-685);
        MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
        mersenneTwister0.nextBoolean();
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer((UnivariateRealOptimizer) null, (-685), mersenneTwister0);
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.getRelativeAccuracy();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2714() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-1511), (RandomGenerator) null);
        double[] doubleArray0 = new double[2];
        doubleArray0[0] = (double) (-1511);
        doubleArray0[1] = (double) (-1511);
        PolynomialFunctionLagrangeForm polynomialFunctionLagrangeForm0 = new PolynomialFunctionLagrangeForm(doubleArray0, doubleArray0);
        GoalType goalType0 = GoalType.MINIMIZE;
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunctionLagrangeForm0, goalType0, (double) (-1511), 0.0, (-1511.0));
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2915() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        MersenneTwister mersenneTwister0 = new MersenneTwister((-1));
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 0, mersenneTwister0);
        double[] doubleArray0 = new double[7];
        doubleArray0[0] = (double) 0;
        doubleArray0[1] = (double) 0;
        doubleArray0[2] = (double) 0;
        doubleArray0[3] = 328.593902707;
        doubleArray0[4] = (double) (-1);
        doubleArray0[5] = (double) 0;
        doubleArray0[6] = (double) (-1);
        PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
        GoalType goalType0 = GoalType.MINIMIZE;
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 0.0, (-443.0906184439465), (double) 0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3116() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(0.0).when(univariateRealOptimizer0).getRelativeAccuracy();
        MersenneTwister mersenneTwister0 = new MersenneTwister((long) (-2455));
        RandomAdaptor randomAdaptor0 = new RandomAdaptor(mersenneTwister0);
        randomAdaptor0.setSeed((-2255));
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-2455), randomAdaptor0);
        multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
        multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
        multiStartUnivariateRealOptimizer0.setMaximalIterationCount((-2455));
        mersenneTwister0.nextDouble();
        multiStartUnivariateRealOptimizer0.getIterationCount();
        multiStartUnivariateRealOptimizer0.getMaximalIterationCount();
        randomAdaptor0.nextGaussian();
        multiStartUnivariateRealOptimizer0.setRelativeAccuracy((-931.461445));
        multiStartUnivariateRealOptimizer0.setMaximalIterationCount(1150);
        multiStartUnivariateRealOptimizer0.getRelativeAccuracy();
        multiStartUnivariateRealOptimizer0.setMaximalIterationCount(22);
        double[] doubleArray0 = new double[5];
        doubleArray0[0] = (double) (-2455);
        doubleArray0[1] = (double) (-2455);
        doubleArray0[2] = (double) 0;
        doubleArray0[3] = (-931.461445);
        doubleArray0[4] = 934.848070378;
        PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, (double) 22, (double) (-2255));
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3217() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(univariateRealOptimizer0).getIterationCount();
        doReturn(0).when(univariateRealOptimizer0).getEvaluations();
        doReturn(0.0).when(univariateRealOptimizer0).getFunctionValue();
        doReturn(0.0).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class), any(org.apache.commons.math.optimization.GoalType.class), anyDouble(), anyDouble());
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1728, (RandomGenerator) null);
        double double0 = 3426.2169024276;
        GoalType goalType0 = GoalType.MAXIMIZE;
        multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) null, goalType0, 0.0, 0.0, 1547.5406);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test3318() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        int[] intArray0 = new int[4];
        int int0 = 0;
        intArray0[0] = 0;
        intArray0[1] = (-843);
        intArray0[2] = (-843);
        intArray0[3] = (-843);
        MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-843), mersenneTwister0);
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = (double) (-843);
        doubleArray0[1] = (double) (-843);
        doubleArray0[2] = (double) (-843);
        PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
        PolynomialFunction polynomialFunction1 = new PolynomialFunction(doubleArray0);
        multiStartUnivariateRealOptimizer0.setMaxEvaluations(0);
        polynomialFunction0.subtract(polynomialFunction1);
        UnivariateRealFunction univariateRealFunction0 = polynomialFunction0.derivative();
        polynomialFunction0.negate();
        GoalType goalType0 = GoalType.MINIMIZE;
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.optimize(univariateRealFunction0, goalType0, (double) (-843), (-843.0), 2536.2380678878);
            fail("Expecting exception: NegativeArraySizeException");
        } catch (NegativeArraySizeException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test3719() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(91.0).when(univariateRealOptimizer0).getAbsoluteAccuracy();
        JDKRandomGenerator jDKRandomGenerator0 = new JDKRandomGenerator();
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 12, jDKRandomGenerator0);
        multiStartUnivariateRealOptimizer0.getAbsoluteAccuracy();
        Random.setNextRandom(12);
        try {
            multiStartUnivariateRealOptimizer0.getOptima();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no optimum computed yet
        }
    }

    @Test(timeout = 4000)
    public void test4020() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn((-892.0)).when(univariateRealOptimizer0).getRelativeAccuracy();
        MersenneTwister mersenneTwister0 = new MersenneTwister((-968L));
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1348, mersenneTwister0);
        multiStartUnivariateRealOptimizer0.getRelativeAccuracy();
        multiStartUnivariateRealOptimizer0.setMaxEvaluations(3794);
        try {
            multiStartUnivariateRealOptimizer0.getOptima();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no optimum computed yet
        }
    }

    @Test(timeout = 4000)
    public void test4121() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(189, 2839, 189, 26, Integer.MAX_VALUE).when(univariateRealOptimizer0).getIterationCount();
        doReturn(58, (-958), 58, 26, 26).when(univariateRealOptimizer0).getEvaluations();
        doReturn((double) (-958), 1437.71525099608, Double.NaN, (-3284.624325347188), (-1028.624866188)).when(univariateRealOptimizer0).getFunctionValue();
        doReturn(Double.NaN, (double) Integer.MAX_VALUE, 1160.913199592, (double) 26, 1437.71525099608).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class), any(org.apache.commons.math.optimization.GoalType.class), anyDouble(), anyDouble());
        int[] intArray0 = new int[9];
        intArray0[0] = 1532;
        intArray0[1] = 1532;
        intArray0[2] = 1;
        intArray0[3] = 1532;
        intArray0[4] = 1532;
        intArray0[5] = 1532;
        intArray0[6] = 1532;
        intArray0[7] = 1532;
        intArray0[8] = 1532;
        MersenneTwister mersenneTwister0 = new MersenneTwister(intArray0);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 1532, mersenneTwister0);
        double[] doubleArray0 = new double[9];
        doubleArray0[0] = (double) 1532;
        doubleArray0[1] = (double) 1532;
        doubleArray0[2] = (double) 1532;
        doubleArray0[3] = (double) 1532;
        doubleArray0[4] = (double) 1532;
        doubleArray0[5] = (double) 1532;
        doubleArray0[6] = (double) 1532;
        doubleArray0[7] = (double) 1;
        doubleArray0[8] = (double) 1532;
        PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
        GoalType goalType0 = GoalType.MINIMIZE;
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 2009.6002, (double) 1532, Double.NaN);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test4822() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(univariateRealOptimizer0).getIterationCount();
        doReturn(0).when(univariateRealOptimizer0).getEvaluations();
        doReturn(0.0).when(univariateRealOptimizer0).getFunctionValue();
        doReturn(0.0).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class), any(org.apache.commons.math.optimization.GoalType.class), anyDouble(), anyDouble());
        int int0 = 16;
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 16, (RandomGenerator) null);
        multiStartUnivariateRealOptimizer0.resetAbsoluteAccuracy();
        multiStartUnivariateRealOptimizer0.resetMaximalIterationCount();
        multiStartUnivariateRealOptimizer0.getEvaluations();
        double[] doubleArray0 = new double[3];
        doubleArray0[0] = (double) 0;
        double double0 = 1.0;
        doubleArray0[1] = 1.0;
        doubleArray0[2] = (double) 16;
        PolynomialFunction polynomialFunction0 = new PolynomialFunction(doubleArray0);
        polynomialFunction0.toString();
        GoalType goalType0 = GoalType.MAXIMIZE;
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) polynomialFunction0, goalType0, 1.0, 1.0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test5223() throws Throwable {
        UnivariateRealOptimizer univariateRealOptimizer0 = mock(UnivariateRealOptimizer.class, new ViolatedAssumptionAnswer());
        doReturn((-1800), 41, (-1800), (-1800), 41).when(univariateRealOptimizer0).getIterationCount();
        doReturn((-2236), (-2236), (-1800), (-890), (-890)).when(univariateRealOptimizer0).getEvaluations();
        doReturn((double) 41, (-1908.4867478), 1101.462035, (-312.8767485127), 856.6).when(univariateRealOptimizer0).getFunctionValue();
        doReturn((-4182.80226830022), (double) (-890), (-4182.80226830022), Double.NaN, Double.POSITIVE_INFINITY).when(univariateRealOptimizer0).optimize(any(org.apache.commons.math.analysis.UnivariateRealFunction.class), any(org.apache.commons.math.optimization.GoalType.class), anyDouble(), anyDouble());
        MersenneTwister mersenneTwister0 = new MersenneTwister(1987L);
        MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer0 = new MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 131, mersenneTwister0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        // Undeclared exception!
        try {
            multiStartUnivariateRealOptimizer0.optimize((UnivariateRealFunction) null, goalType0, 1137.6576, (double) 131);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }
}
