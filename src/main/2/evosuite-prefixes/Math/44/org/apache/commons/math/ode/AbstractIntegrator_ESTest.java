/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 19:04:59 GMT 2024
 */
package org.apache.commons.math.ode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.math.analysis.solvers.MullerSolver;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolver;
import org.apache.commons.math.ode.ExpandableStatefulODE;
import org.apache.commons.math.ode.FirstOrderConverter;
import org.apache.commons.math.ode.FirstOrderDifferentialEquations;
import org.apache.commons.math.ode.SecondOrderDifferentialEquations;
import org.apache.commons.math.ode.events.EventHandler;
import org.apache.commons.math.ode.nonstiff.AdamsMoultonIntegrator;
import org.apache.commons.math.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math.ode.nonstiff.GillIntegrator;
import org.apache.commons.math.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math.ode.nonstiff.HighamHall54Integrator;
import org.apache.commons.math.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math.ode.nonstiff.ThreeEighthesIntegrator;
import org.apache.commons.math.ode.sampling.DummyStepHandler;
import org.apache.commons.math.ode.sampling.StepHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class AbstractIntegrator_ESTest extends AbstractIntegrator_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2.298302779758532E-9), (-2.298302779758532E-9), (-2.298302779758532E-9), 1386.7260430029824);
        int int0 = highamHall54Integrator0.getEvaluations();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-966.6985908833), (-966.6985908833), 1493.5658845, (-966.6985908833));
        String string0 = graggBulirschStoerIntegrator0.getName();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-967.8647041599768), (-507.95729897482016), (-967.8647041599768), (-967.8647041599768));
        double double0 = graggBulirschStoerIntegrator0.getCurrentSignedStepsize();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-1133.54));
        double double0 = midpointIntegrator0.getCurrentStepStart();
        midpointIntegrator0.getCurrentSignedStepsize();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator((-1133.54));
        double double0 = midpointIntegrator0.getCurrentStepStart();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-966.6985908833), (-966.6985908833), 1493.5658845, (-966.6985908833));
        Collection<StepHandler> collection0 = graggBulirschStoerIntegrator0.getStepHandlers();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator((-3535.60688105498), 3347.0077, (-1.0), 4.547473508864641E-10);
        int int0 = dormandPrince853Integrator0.getMaxEvaluations();
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        AdamsMoultonIntegrator adamsMoultonIntegrator0 = new AdamsMoultonIntegrator(9, 0.3325583338737488, 9, (-2325.7212), 0.3325583338737488);
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
        adamsMoultonIntegrator0.integrate(expandableStatefulODE0, 0.0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator((-966.6985908833), (-966.6985908833), 1493.5658845, (-966.6985908833));
        EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(eventHandler0).toString();
        MullerSolver mullerSolver0 = new MullerSolver((-966.6985908833), (-1710));
        graggBulirschStoerIntegrator0.addEventHandler(eventHandler0, 1493.5658845, (-1.0), (-1710), (UnivariateRealSolver) mullerSolver0);
        Collection<EventHandler> collection0 = graggBulirschStoerIntegrator0.getEventHandlers();
        collection0.contains(eventHandler0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-1538.94), 2.0089026801414973E-37, 2.0089026801414973E-37, 2.0089026801414973E-37);
        highamHall54Integrator0.setMaxEvaluations(810);
        highamHall54Integrator0.getName();
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        double[] doubleArray0 = new double[0];
        HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator(498.078152, 498.078152, doubleArray0, doubleArray0);
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(3274).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 498.078152, doubleArray0, (-2346.396443165), doubleArray0);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        double[] doubleArray0 = new double[0];
        HighamHall54Integrator highamHall54Integrator0 = new HighamHall54Integrator((-2531.84444204), (-2531.84444204), (-2531.84444204), (-2531.84444204));
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        double[] doubleArray1 = new double[20];
        highamHall54Integrator0.integrate((FirstOrderDifferentialEquations) firstOrderConverter0, 2249.00305, doubleArray0, (-581.868116979771), doubleArray1);
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator((-1538.94));
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
        expandableStatefulODE0.setTime((-3906.7));
        threeEighthesIntegrator0.integrate(expandableStatefulODE0, (-1538.94));
        threeEighthesIntegrator0.getName();
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        GillIntegrator gillIntegrator0 = new GillIntegrator(1741.834462131812);
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(684).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
        EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
        doReturn(0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble(), any(double[].class));
        gillIntegrator0.addEventHandler(eventHandler0, (double) 684, (double) 684, 684);
        // Undeclared exception!
        gillIntegrator0.integrate(expandableStatefulODE0, (double) 684);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        GillIntegrator gillIntegrator0 = new GillIntegrator(1741.834462131812);
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(658).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
        DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
        gillIntegrator0.addStepHandler(dummyStepHandler0);
        EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
        doReturn((-1.0), 1741.834462131812, (-1.0), (double) 0, (double) 658).when(eventHandler0).g(anyDouble(), any(double[].class));
        gillIntegrator0.addEventHandler(eventHandler0, (double) 0, 1741.834462131812, 658);
        // Undeclared exception!
        gillIntegrator0.integrate(expandableStatefulODE0, (double) 658);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        GillIntegrator gillIntegrator0 = new GillIntegrator(1741.834462131812);
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(684).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
        EventHandler.Action eventHandler_Action0 = EventHandler.Action.STOP;
        EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
        doReturn(0.0, 0.0, 0.0, 0.0, 0.0).when(eventHandler0).g(anyDouble(), any(double[].class));
        expandableStatefulODE0.setTime(2.723009182661306E-8);
        gillIntegrator0.addEventHandler(eventHandler0, (double) 0, 1741.834462131812, 684);
        // Undeclared exception!
        gillIntegrator0.integrate(expandableStatefulODE0, (double) 684);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        GillIntegrator gillIntegrator0 = new GillIntegrator(1741.834462131812);
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(684).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
        EventHandler.Action eventHandler_Action0 = EventHandler.Action.RESET_DERIVATIVES;
        EventHandler eventHandler0 = mock(EventHandler.class, new ViolatedAssumptionAnswer());
        doReturn(eventHandler_Action0).when(eventHandler0).eventOccurred(anyDouble(), any(double[].class), anyBoolean());
        doReturn((-1.0), 1741.834462131812, 4.547473508864641E-10, (double) 0, 683.99999997277).when(eventHandler0).g(anyDouble(), any(double[].class));
        expandableStatefulODE0.setTime(2.723009182661306E-8);
        gillIntegrator0.addEventHandler(eventHandler0, (double) 0, 1741.834462131812, 684);
        // Undeclared exception!
        gillIntegrator0.integrate(expandableStatefulODE0, (double) 684);
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        SecondOrderDifferentialEquations secondOrderDifferentialEquations0 = mock(SecondOrderDifferentialEquations.class, new ViolatedAssumptionAnswer());
        doReturn(0).when(secondOrderDifferentialEquations0).getDimension();
        FirstOrderConverter firstOrderConverter0 = new FirstOrderConverter(secondOrderDifferentialEquations0);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(firstOrderConverter0);
        expandableStatefulODE0.setTime(0.0);
        ThreeEighthesIntegrator threeEighthesIntegrator0 = new ThreeEighthesIntegrator(0.0);
        threeEighthesIntegrator0.integrate(expandableStatefulODE0, 0.0);
    }
}
