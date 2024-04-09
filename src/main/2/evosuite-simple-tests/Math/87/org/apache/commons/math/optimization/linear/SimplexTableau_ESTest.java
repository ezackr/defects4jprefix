/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 23:55:21 GMT 2024
 */
package org.apache.commons.math.optimization.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVectorImpl;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.linear.LinearConstraint;
import org.apache.commons.math.optimization.linear.LinearObjectiveFunction;
import org.apache.commons.math.optimization.linear.Relationship;
import org.apache.commons.math.optimization.linear.SimplexTableau;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SimplexTableau_ESTest extends SimplexTableau_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 333.42532994058);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 333.42532994058);
        double[][] doubleArray1 = simplexTableau0.getData();
        assertEquals(1, doubleArray1.length);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        double[] doubleArray0 = new double[2];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 347.35222980356644);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 347.35222980356644);
        // Undeclared exception!
        try {
            simplexTableau0.setEntry(1, 1, 347.35222980356644);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // no entry at indices (1, 1) in a 1x4 matrix
            //
            verifyException("org.apache.commons.math.linear.RealMatrixImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, 1.0E-12, relationship0, openMapRealVector0, 1.0E-12);
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12);
        assertEquals(0, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealVectorImpl realVectorImpl0 = new RealVectorImpl();
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 0.0);
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        simplexTableau0.discardArtificialVariables();
        assertEquals(0, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 333.42532994058);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 333.42532994058);
        int int0 = simplexTableau0.getNumDecisionVariables();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        double[] doubleArray0 = new double[1];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 1551.41512);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1551.41512);
        int int0 = simplexTableau0.getNumSlackVariables();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        OpenMapRealVector openMapRealVector0 = new OpenMapRealVector();
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12);
        int int0 = simplexTableau0.getNumArtificialVariables();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 333.42532994058);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 333.42532994058);
        simplexTableau0.hashCode();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        double[] doubleArray0 = new double[5];
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, (-13.013706819988936));
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-13.013706819988936));
        linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau0 = null;
        try {
            simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-13.013706819988936));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        RealVectorImpl realVectorImpl0 = new RealVectorImpl();
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 4.9E-324;
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 4.9E-324);
        linkedList0.add(linearConstraint0);
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MINIMIZE;
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 4.9E-324);
        SimplexTableau simplexTableau0 = null;
        try {
            simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1007.0));
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math.optimization.linear.SimplexTableau", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 333.42532994058);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 333.42532994058);
        simplexTableau0.discardArtificialVariables();
        assertEquals(0, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        double[] doubleArray0 = new double[4];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 4017.7869122);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 4017.7869122);
        RealPointValuePair realPointValuePair0 = simplexTableau0.getSolution();
        assertEquals(4017.7869122, realPointValuePair0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        double[] doubleArray0 = new double[6];
        doubleArray0[1] = (-2968.8870807867697);
        OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 2.2250738585072014E-308);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.LEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(openMapRealVector0, relationship0, (-2968.8870807867697));
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        // Undeclared exception!
        try {
            simplexTableau0.getSolution();
            fail("Expecting exception: NoSuchElementException");
        } catch (NoSuchElementException e) {
            //
            // iterator exhausted
            //
            verifyException("org.apache.commons.math.MathRuntimeException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 327.26281955382444);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 327.26281955382444);
        simplexTableau0.divideRow(0, 0);
        assertEquals(0, simplexTableau0.getNumVariables());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        RealVectorImpl realVectorImpl0 = new RealVectorImpl();
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, (-1.7048313195986922));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.7048313195986922));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.7048313195986922));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(20, 20);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
        boolean boolean0 = simplexTableau0.equals(simplexTableau0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        double[] doubleArray0 = new double[0];
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(doubleArray0, 4017.7869122);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 4017.7869122);
        boolean boolean0 = simplexTableau0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(20, 20);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 20);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealVectorImpl realVectorImpl0 = new RealVectorImpl();
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, (-1.7048313195986922));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.7048313195986922));
        LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(doubleArray0, (-1.7048313195986922));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction1, linkedList0, goalType0, true, (-1.7048313195986922));
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealVectorImpl realVectorImpl0 = new RealVectorImpl();
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, 0.0);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.GEQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, 0.0);
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        boolean boolean0 = linkedList0.add(linearConstraint0);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 0.0);
        boolean boolean1 = simplexTableau0.equals(simplexTableau1);
        assertFalse(boolean1 == boolean0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(20, 20);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
        assertTrue(simplexTableau1.equals((Object) simplexTableau0));
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(20, 20);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
        simplexTableau1.numArtificialVariables = 20;
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        assertFalse(simplexTableau1.equals((Object) simplexTableau0));
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(20, 20);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
        simplexTableau1.numArtificialVariables = 20;
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(20, 20);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 1.0E-12);
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, false, 20);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        RealVectorImpl realVectorImpl0 = new RealVectorImpl();
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, (-1.7048313195986922));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MAXIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.7048313195986922));
        LinearObjectiveFunction linearObjectiveFunction1 = new LinearObjectiveFunction(realVectorImpl0, (-170.0));
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction1, linkedList0, goalType0, true, (-1.7048313195986922));
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealVectorImpl realVectorImpl0 = new RealVectorImpl();
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(realVectorImpl0, (-1.7048313195986922));
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        Relationship relationship0 = Relationship.EQ;
        LinearConstraint linearConstraint0 = new LinearConstraint(doubleArray0, relationship0, (-1.7048313195986922));
        linkedList0.add(linearConstraint0);
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, (-1.7048313195986922));
        List<LinearConstraint> list0 = simplexTableau0.getNormalizedConstraints();
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, list0, goalType0, true, (-1.7048313195986922));
        boolean boolean0 = simplexTableau1.equals(simplexTableau0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(20, 20);
        LinearObjectiveFunction linearObjectiveFunction0 = new LinearObjectiveFunction(openMapRealVector0, 1.0E-12);
        LinkedList<LinearConstraint> linkedList0 = new LinkedList<LinearConstraint>();
        GoalType goalType0 = GoalType.MINIMIZE;
        SimplexTableau simplexTableau0 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
        openMapRealVector0.mapInvToSelf();
        SimplexTableau simplexTableau1 = new SimplexTableau(linearObjectiveFunction0, linkedList0, goalType0, true, 1.0E-12);
        boolean boolean0 = simplexTableau0.equals(simplexTableau1);
        assertFalse(boolean0);
    }
}
