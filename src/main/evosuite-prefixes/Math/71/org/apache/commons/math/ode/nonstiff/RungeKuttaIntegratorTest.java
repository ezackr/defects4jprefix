/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 09:32:04 GMT 2023
 */
package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math.ode.sampling.FixedStepHandler;
import org.apache.commons.math.ode.sampling.StepNormalizer;
import org.junit.runner.RunWith;

public class RungeKuttaIntegratorTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        double[] doubleArray0 = new double[0];
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator((-2701.708662));
        classicalRungeKuttaIntegrator0.integrate(firstOrderConverter0, (-856.79967603), doubleArray0, 211.0, doubleArray0);
        classicalRungeKuttaIntegrator0.getEvaluations();
    }
}
