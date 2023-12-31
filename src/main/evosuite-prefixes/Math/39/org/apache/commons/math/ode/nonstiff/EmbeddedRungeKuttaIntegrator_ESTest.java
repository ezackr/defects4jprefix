/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 14:44:23 GMT 2023
 */
package org.apache.commons.math.ode.nonstiff;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.nonstiff.DormandPrince54Integrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class EmbeddedRungeKuttaIntegrator_ESTest extends EmbeddedRungeKuttaIntegrator_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(559.5, 559.5, 559.5, 0.0);
        double double0 = dormandPrince54Integrator0.getSafety();
        dormandPrince54Integrator0.getMaxGrowth();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(559.5, 559.5, 559.5, 0.0);
        double double0 = dormandPrince54Integrator0.getSafety();
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(559.5, 559.5, 559.5, 0.0);
        double double0 = dormandPrince54Integrator0.getSafety();
        dormandPrince54Integrator0.getMinReduction();
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(559.5, 559.5, 559.5, 0.0);
        double double0 = dormandPrince54Integrator0.getMinReduction();
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(559.5, 559.5, 559.5, 0.0);
        double double0 = dormandPrince54Integrator0.getMinReduction();
        dormandPrince54Integrator0.getMaxGrowth();
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(559.5, 559.5, 559.5, 0.0);
        double double0 = dormandPrince54Integrator0.getMinReduction();
        dormandPrince54Integrator0.getSafety();
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(559.5, 559.5, 559.5, 0.0);
        double double0 = dormandPrince54Integrator0.getMaxGrowth();
        dormandPrince54Integrator0.getMinReduction();
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(559.5, 559.5, 559.5, 0.0);
        double double0 = dormandPrince54Integrator0.getMaxGrowth();
    }

    @Test(timeout = 4000)
    public void test028() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(559.5, 559.5, 559.5, 0.0);
        double double0 = dormandPrince54Integrator0.getMaxGrowth();
        dormandPrince54Integrator0.getSafety();
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        double[] doubleArray0 = new double[1];
        DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(1306.7655606344235, (-2471.2328452794), doubleArray0, doubleArray0);
        dormandPrince853Integrator0.integrate((ExpandableStatefulODE) null, 1306.7655606344235);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        double[] doubleArray0 = new double[4];
        DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, (-802.2175), doubleArray0, doubleArray0);
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
        dormandPrince853Integrator0.integrate(expandableStatefulODE0, (-802.2175));
    }
}
