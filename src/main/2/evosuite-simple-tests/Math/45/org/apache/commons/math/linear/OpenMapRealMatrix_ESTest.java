/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 19:07:50 GMT 2024
 */
package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class OpenMapRealMatrix_ESTest extends OpenMapRealMatrix_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2835, 2835);
        openMapRealMatrix0.addToEntry(0, 0, 2835);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
        assertEquals(2835, openMapRealMatrix1.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2835, 2835);
        openMapRealMatrix0.addToEntry(0, 0, 2835);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
        assertEquals(2835, openMapRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2835, 2835);
        openMapRealMatrix0.addToEntry(0, 0, 2835);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
        assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2835, 2835);
        openMapRealMatrix0.addToEntry(0, 0, 2835);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
        assertEquals(2835, openMapRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test004() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2835, 2835);
        openMapRealMatrix0.addToEntry(0, 0, 2835);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
        assertEquals(2835, openMapRealMatrix1.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(1197, 1197);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.copy();
        assertEquals(1197, openMapRealMatrix1.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test016() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(1197, 1197);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.copy();
        assertEquals(1197, openMapRealMatrix1.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test027() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2823, 2823);
        openMapRealMatrix0.setEntry(8, 8, 2823);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.subtract(openMapRealMatrix0);
        assertEquals(2823, openMapRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test028() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2823, 2823);
        openMapRealMatrix0.setEntry(8, 8, 2823);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.subtract(openMapRealMatrix0);
        assertEquals(2823, openMapRealMatrix1.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test029() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2823, 2823);
        openMapRealMatrix0.setEntry(8, 8, 2823);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.subtract(openMapRealMatrix0);
        assertEquals(2823, openMapRealMatrix1.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test0210() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2823, 2823);
        openMapRealMatrix0.setEntry(8, 8, 2823);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.subtract(openMapRealMatrix0);
        assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test0311() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2846, 2846);
        // Undeclared exception!
        openMapRealMatrix0.transpose();
    }

    @Test(timeout = 4000)
    public void test0412() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2794, 2794);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.subtract((RealMatrix) openMapRealMatrix0);
        assertEquals(2794, openMapRealMatrix1.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test0413() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2794, 2794);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.subtract((RealMatrix) openMapRealMatrix0);
        assertEquals(2794, openMapRealMatrix1.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test0414() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2794, 2794);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.subtract((RealMatrix) openMapRealMatrix0);
        assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test0515() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2794, 2794);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
        assertEquals(2794, openMapRealMatrix1.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test0516() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2794, 2794);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
        assertEquals(2794, openMapRealMatrix1.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test0517() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2794, 2794);
        OpenMapRealMatrix openMapRealMatrix1 = openMapRealMatrix0.add(openMapRealMatrix0);
        assertNotSame(openMapRealMatrix1, openMapRealMatrix0);
    }

    @Test(timeout = 4000)
    public void test0618() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2823, 2823);
        openMapRealMatrix0.setEntry(2805, 2805, 2805);
        assertEquals(2823, openMapRealMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test0619() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2823, 2823);
        openMapRealMatrix0.setEntry(2805, 2805, 2805);
        Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(2823, 2574);
        RealMatrix realMatrix0 = openMapRealMatrix0.multiply((RealMatrix) array2DRowRealMatrix0);
        assertEquals(2823, openMapRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test0620() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2823, 2823);
        openMapRealMatrix0.setEntry(2805, 2805, 2805);
        Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(2823, 2574);
        RealMatrix realMatrix0 = openMapRealMatrix0.multiply((RealMatrix) array2DRowRealMatrix0);
        assertEquals(2823, realMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test0621() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2823, 2823);
        openMapRealMatrix0.setEntry(2805, 2805, 2805);
        Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(2823, 2574);
        RealMatrix realMatrix0 = openMapRealMatrix0.multiply((RealMatrix) array2DRowRealMatrix0);
        assertEquals(2574, realMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test0722() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2835, 2835);
        openMapRealMatrix0.addToEntry(0, 0, 2835);
        assertEquals(2835, openMapRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test0723() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2835, 2835);
        openMapRealMatrix0.addToEntry(0, 0, 2835);
        RealMatrix realMatrix0 = openMapRealMatrix0.multiply((RealMatrix) openMapRealMatrix0);
        assertEquals(2835, realMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test0724() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2835, 2835);
        openMapRealMatrix0.addToEntry(0, 0, 2835);
        RealMatrix realMatrix0 = openMapRealMatrix0.multiply((RealMatrix) openMapRealMatrix0);
        assertEquals(2835, realMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test0825() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2835, 2835);
        openMapRealMatrix0.addToEntry(0, 0, 0);
        assertEquals(2835, openMapRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test0926() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2835, 2835);
        openMapRealMatrix0.setEntry(269, 269, 2835);
        openMapRealMatrix0.multiplyEntry(269, 269, 2835);
        assertEquals(2835, openMapRealMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test1027() throws Throwable {
        OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(2815, 2815);
        openMapRealMatrix0.multiplyEntry(0, 0, 0);
        assertEquals(2815, openMapRealMatrix0.getRowDimension());
    }
}
