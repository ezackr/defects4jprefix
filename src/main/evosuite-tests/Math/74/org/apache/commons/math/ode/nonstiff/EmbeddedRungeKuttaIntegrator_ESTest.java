/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 18:48:13 GMT 2023
 */

package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.sampling.FixedStepHandler;
import org.apache.commons.math.ode.sampling.StepNormalizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmbeddedRungeKuttaIntegrator_ESTest extends EmbeddedRungeKuttaIntegrator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2473.63036006), 573.13, doubleArray0, doubleArray0);
      assertNotNull(dormandPrince54Integrator0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, doubleArray0.length);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals((-2473.63036006), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(573.13, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      
      dormandPrince54Integrator0.setSafety(0.0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, doubleArray0.length);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals((-2473.63036006), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(573.13, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals(0.0, double0, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, doubleArray0.length);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals((-2473.63036006), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(573.13, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.0, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(10.0, (-2333.907148752371), (-1151.70847888), (-2826.589577));
      assertNotNull(dormandPrince54Integrator0);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(2333.907148752371, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(152.77130452910228, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      
      dormandPrince54Integrator0.setSafety((-1151.70847888));
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(2333.907148752371, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals((-1151.70847888), dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(152.77130452910228, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      
      double double0 = dormandPrince54Integrator0.getSafety();
      assertEquals((-1151.70847888), double0, 0.01);
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(2333.907148752371, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals((-1151.70847888), dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(10.0, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(152.77130452910228, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-547.75788), (-7.35), doubleArray0, doubleArray0);
      assertNotNull(highamHall54Integrator0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, doubleArray0.length);
      assertEquals((-547.75788), highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(63.45092921305408, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-7.35), highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      
      int int0 = highamHall54Integrator0.getOrder();
      assertEquals(5, int0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, doubleArray0.length);
      assertEquals((-547.75788), highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(63.45092921305408, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-7.35), highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-3004.8064), (-3004.8064), doubleArray0, doubleArray0);
      assertNotNull(highamHall54Integrator0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(9, doubleArray0.length);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals((-3004.8064), highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-3004.8064), highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(3004.8064, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      
      highamHall54Integrator0.setMinReduction(0.0);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(9, doubleArray0.length);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals((-3004.8064), highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals((-3004.8064), highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(3004.8064, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals(0.0, double0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(9, doubleArray0.length);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals((-3004.8064), highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals((-3004.8064), highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(3004.8064, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1643.914493, 1643.914493, (-1368.3), (-452.1072983195));
      assertNotNull(highamHall54Integrator0);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(1643.914493, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(1643.914493, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1643.914493, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      
      highamHall54Integrator0.setMinReduction((-3.0689499459498917));
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals((-3.0689499459498917), highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(1643.914493, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(1643.914493, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1643.914493, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals((-3.0689499459498917), double0, 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals((-3.0689499459498917), highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(1643.914493, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(1643.914493, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(1643.914493, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(10.0, (-2333.907148752371), (-1151.70847888), (-2826.589577));
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(2333.907148752371, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(152.77130452910228, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      
      dormandPrince54Integrator0.setMaxGrowth((-2629.544768));
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-2629.544768), dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(2333.907148752371, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(152.77130452910228, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals((-2629.544768), double0, 0.01);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals((-2629.544768), dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(2333.907148752371, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(152.77130452910228, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(4, firstOrderConverter0.getDimension());
      
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 5, 756.9, (-11.87528245965743));
      assertNotNull(highamHall54Integrator0);
      assertEquals(5.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(0.0, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      
      double[][] doubleArray0 = new double[3][7];
      try { 
        highamHall54Integrator0.integrate(firstOrderConverter0, 958.3823, doubleArray0[2], 2.0, doubleArray0[1]);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // dimensions mismatch: ODE problem has dimension 4, initial state vector has dimension 7
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(305.07576780617, 305.07576780617, 539.627267855558, 0.0);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(305.07576780617, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(305.07576780617, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(305.07576780617, dormandPrince54Integrator0.getMinStep(), 0.01);
      
      double[] doubleArray0 = new double[7];
      // Undeclared exception!
      try { 
        dormandPrince54Integrator0.integrate((FirstOrderDifferentialEquations) null, (-331.364376440207), doubleArray0, 0.0, doubleArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math.ode.AbstractIntegrator", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      double[] doubleArray0 = new double[1];
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator((-2473.63036006), 573.13, doubleArray0, doubleArray0);
      assertNotNull(dormandPrince54Integrator0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, doubleArray0.length);
      assertEquals(573.13, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals((-2473.63036006), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      
      dormandPrince54Integrator0.setMaxGrowth(0.0);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, doubleArray0.length);
      assertEquals(573.13, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals((-2473.63036006), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      
      double double0 = dormandPrince54Integrator0.getMaxGrowth();
      assertEquals(0.0, double0, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray0, 0.01);
      assertEquals(1, doubleArray0.length);
      assertEquals(573.13, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(0.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals((-2473.63036006), dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(4, firstOrderConverter0.getDimension());
      
      double[] doubleArray0 = new double[4];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 5, 756.9, 3831.9243024);
      assertNotNull(highamHall54Integrator0);
      assertEquals(Double.NaN, highamHall54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(Integer.MAX_VALUE, highamHall54Integrator0.getMaxEvaluations());
      assertEquals(0.0, highamHall54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(0, highamHall54Integrator0.getEvaluations());
      assertEquals("Higham-Hall 5(4)", highamHall54Integrator0.getName());
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.0, highamHall54Integrator0.getMinStep(), 0.01);
      assertEquals(5.0, highamHall54Integrator0.getMaxStep(), 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(5, highamHall54Integrator0.getOrder());
      
      // Undeclared exception!
      highamHall54Integrator0.integrate(firstOrderConverter0, (-3088.0470801), doubleArray0, 2.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(958.3823, 958.3823, (-11.87528245965743), 0.0);
      assertNotNull(dormandPrince54Integrator0);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(958.3823, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(958.3823, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(958.3823, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      assertNotNull(firstOrderConverter0);
      assertEquals(4, firstOrderConverter0.getDimension());
      
      double[] doubleArray0 = new double[4];
      FixedStepHandler fixedStepHandler0 = mock(FixedStepHandler.class, new ViolatedAssumptionAnswer());
      StepNormalizer stepNormalizer0 = new StepNormalizer(2662.6024984, fixedStepHandler0);
      assertNotNull(stepNormalizer0);
      assertTrue(stepNormalizer0.requiresDenseOutput());
      
      dormandPrince54Integrator0.addStepHandler(stepNormalizer0);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(958.3823, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(0, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(958.3823, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(958.3823, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertTrue(stepNormalizer0.requiresDenseOutput());
      
      double double0 = dormandPrince54Integrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, 3831.9243024, doubleArray0);
      assertEquals(3831.9243024, double0, 0.01);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertEquals(4, doubleArray0.length);
      assertEquals(Double.NaN, dormandPrince54Integrator0.getCurrentStepStart(), 0.01);
      assertEquals(958.3823, dormandPrince54Integrator0.getMinStep(), 0.01);
      assertEquals(32, dormandPrince54Integrator0.getEvaluations());
      assertEquals(0.9, dormandPrince54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, dormandPrince54Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, dormandPrince54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(958.3823, dormandPrince54Integrator0.getCurrentSignedStepsize(), 0.01);
      assertEquals(958.3823, dormandPrince54Integrator0.getMaxStep(), 0.01);
      assertEquals(5, dormandPrince54Integrator0.getOrder());
      assertEquals("Dormand-Prince 5(4)", dormandPrince54Integrator0.getName());
      assertEquals(Integer.MAX_VALUE, dormandPrince54Integrator0.getMaxEvaluations());
      assertEquals(4, firstOrderConverter0.getDimension());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[4];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(0.0, 5, 756.9, 3831.9243024);
      double[] doubleArray1 = new double[4];
      // Undeclared exception!
      highamHall54Integrator0.integrate(firstOrderConverter0, 958.3823, doubleArray1, 2.0, doubleArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(958.3823, 958.3823, (-11.87528245965743), (-11.87528245965743));
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(2).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      double[] doubleArray0 = new double[4];
      double double0 = dormandPrince54Integrator0.integrate(firstOrderConverter0, 958.3823, doubleArray0, (-11.87528245965743), doubleArray0);
      assertEquals(20, dormandPrince54Integrator0.getEvaluations());
      assertEquals((-11.87528245965743), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-3004.8064), (-3004.8064), doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getMaxGrowth();
      assertEquals(10.0, double0, 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(1643.914493, 1643.914493, (-1368.3), (-452.1072983195));
      double double0 = highamHall54Integrator0.getMinReduction();
      assertEquals(0.2, double0, 0.01);
      assertEquals(0.9, highamHall54Integrator0.getSafety(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double[] doubleArray0 = new double[9];
      HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-3004.8064), (-3004.8064), doubleArray0, doubleArray0);
      double double0 = highamHall54Integrator0.getSafety();
      assertEquals(0.2, highamHall54Integrator0.getMinReduction(), 0.01);
      assertEquals(10.0, highamHall54Integrator0.getMaxGrowth(), 0.01);
      assertEquals(0.9, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.9, (-1.0), doubleArray0, doubleArray0);
      SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
      FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
      // Undeclared exception!
      dormandPrince853Integrator0.integrate(firstOrderConverter0, 0.0, doubleArray0, 5, doubleArray0);
  }
}
