/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 09:41:05 GMT 2023
 */
package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.RealMatrixImpl;
import org.junit.runner.RunWith;

public class RealMatrixImplTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 920.529;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        assertTrue(realMatrixImpl0.isSquare());
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 920.529;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        assertEquals(920.529, realMatrixImpl0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 920.529;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double[] doubleArray1 = realMatrixImpl0.solve(doubleArray0);
        assertArrayEquals(new double[] { 1.0 }, doubleArray1, 0.01);
    }

    @Test(timeout = 4000)
    public void test003() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 920.529;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double[] doubleArray1 = realMatrixImpl0.solve(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.inverse();
        assertEquals(0.0010863318809076086, realMatrix0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
        // Undeclared exception!
        try {
            realMatrixImpl0.copy();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        double[][] doubleArray0 = new double[4][1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.inverse();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // coefficient matrix is not square
        }
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        double[][] doubleArray0 = new double[1][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        // Undeclared exception!
        try {
            realMatrixImpl0.getPermutation();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = null;
        try {
            realMatrixImpl0 = new RealMatrixImpl((-1), (-1));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // row and column dimensions must be postive
        }
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
        RealMatrix realMatrix0 = realMatrixImpl0.scalarAdd(31);
        assertEquals(961.0, realMatrix0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(31, 31);
        RealMatrix realMatrix0 = realMatrixImpl0.scalarAdd(31);
        assertEquals(31, realMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = null;
        try {
            realMatrixImpl0 = new RealMatrixImpl(2145198021, (-4));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // row and column dimensions must be postive
        }
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        double[][] doubleArray0 = new double[4][1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, true);
        double double0 = realMatrixImpl0.getNorm();
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = null;
        try {
            realMatrixImpl0 = new RealMatrixImpl((double[][]) null, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        double[] doubleArray0 = new double[0];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        // Undeclared exception!
        try {
            realMatrixImpl0.inverse();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Matrix must have at least one row.
        }
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        double[][] doubleArray0 = new double[1][0];
        RealMatrixImpl realMatrixImpl0 = null;
        try {
            realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Matrix must have at least one column.
        }
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[][] doubleArray1 = new double[3][6];
        doubleArray1[0] = doubleArray0;
        RealMatrixImpl realMatrixImpl0 = null;
        try {
            realMatrixImpl0 = new RealMatrixImpl(doubleArray1, false);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // All input rows must have the same length.
        }
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        double[][] doubleArray0 = new double[2][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.transpose();
        try {
            realMatrixImpl0.add(realMatrix0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // matrix dimension mismatch
        }
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        double[][] doubleArray0 = new double[15][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.add((RealMatrix) realMatrixImpl0);
        assertTrue(realMatrix0.equals((Object) realMatrixImpl0));
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        double[][] doubleArray0 = new double[15][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.getRowMatrix(1);
        try {
            realMatrixImpl0.add(realMatrix0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // matrix dimension mismatch
        }
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        double[][] doubleArray0 = new double[3][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.getColumnMatrix(2);
        try {
            realMatrixImpl0.subtract(realMatrix0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // matrix dimension mismatch
        }
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        double[][] doubleArray0 = new double[6][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.getRowMatrix(1);
        try {
            realMatrixImpl0.subtract(realMatrix0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // matrix dimension mismatch
        }
    }

    @Test(timeout = 4000)
    public void test1721() throws Throwable {
        double[][] doubleArray0 = new double[4][1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.scalarMultiply((-1645.855237378296));
        assertFalse(realMatrix0.equals((Object) realMatrixImpl0));
    }

    @Test(timeout = 4000)
    public void test1722() throws Throwable {
        double[][] doubleArray0 = new double[4][1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.scalarMultiply((-1645.855237378296));
        assertEquals(0.0, realMatrix0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1723() throws Throwable {
        double[][] doubleArray0 = new double[4][1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.scalarMultiply((-1645.855237378296));
        assertEquals(1, realMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test1824() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[][] doubleArray1 = new double[4][1];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
        RealMatrix realMatrix0 = realMatrixImpl0.multiply((RealMatrix) realMatrixImpl0);
        assertEquals(4, realMatrix0.getColumnDimension());
    }

    @Test(timeout = 4000)
    public void test1925() throws Throwable {
        double[][] doubleArray0 = new double[1][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.preMultiply((RealMatrix) realMatrixImpl0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Matrices are not multiplication compatible.
        }
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
        try {
            realMatrixImpl0.getSubMatrix((-1085), (-1085), (-1085), (-1085));
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // invalid row or column index selection
        }
    }

    @Test(timeout = 4000)
    public void test2127() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(2170, 2170);
        try {
            realMatrixImpl0.getSubMatrix(2170, 2170, 2170, 3666);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // invalid row or column index selection
        }
    }

    @Test(timeout = 4000)
    public void test2228() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
        try {
            realMatrixImpl0.getSubMatrix(31, 0, 0, 0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // invalid row or column index selection
        }
    }

    @Test(timeout = 4000)
    public void test2329() throws Throwable {
        double[][] doubleArray0 = new double[1][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.getSubMatrix(758, 758, 758, (-2073));
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // invalid row or column index selection
        }
    }

    @Test(timeout = 4000)
    public void test2430() throws Throwable {
        double[] doubleArray0 = new double[4];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.getSubMatrix(2, 2, (-86), 2);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // invalid row or column index selection
        }
    }

    @Test(timeout = 4000)
    public void test2531() throws Throwable {
        double[][] doubleArray0 = new double[1][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.getSubMatrix(1, 1, 1410, 1);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // invalid row or column index selection
        }
    }

    @Test(timeout = 4000)
    public void test2632() throws Throwable {
        double[][] doubleArray0 = new double[1][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, true);
        RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(0, 0, 0, 0);
        assertTrue(realMatrix0.isSquare());
    }

    @Test(timeout = 4000)
    public void test2733() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
        int[] intArray0 = new int[0];
        try {
            realMatrixImpl0.getSubMatrix(intArray0, intArray0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // selected row and column index arrays must be non-empty
        }
    }

    @Test(timeout = 4000)
    public void test2834() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(2, 2);
        int[] intArray0 = new int[1];
        RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(intArray0, intArray0);
        assertTrue(realMatrixImpl0.isSquare());
    }

    @Test(timeout = 4000)
    public void test2835() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(2, 2);
        int[] intArray0 = new int[1];
        RealMatrix realMatrix0 = realMatrixImpl0.getSubMatrix(intArray0, intArray0);
        assertEquals(1, realMatrix0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test2936() throws Throwable {
        double[][] doubleArray0 = new double[12][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.setSubMatrix(doubleArray0, (-348), (-348));
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // invalid row or column index selection
        }
    }

    @Test(timeout = 4000)
    public void test3037() throws Throwable {
        double[][] doubleArray0 = new double[4][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.setSubMatrix(doubleArray0, 3681, (-1));
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // invalid row or column index selection
        }
    }

    @Test(timeout = 4000)
    public void test3138() throws Throwable {
        double[][] doubleArray0 = new double[0][4];
        RealMatrixImpl realMatrixImpl0 = null;
        try {
            realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Matrix must have at least one row.
        }
    }

    @Test(timeout = 4000)
    public void test3239() throws Throwable {
        double[][] doubleArray0 = new double[2][0];
        RealMatrixImpl realMatrixImpl0 = null;
        try {
            realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Matrix must have at least one column.
        }
    }

    @Test(timeout = 4000)
    public void test3340() throws Throwable {
        double[] doubleArray0 = new double[10];
        double[][] doubleArray1 = new double[4][0];
        doubleArray1[0] = doubleArray0;
        RealMatrixImpl realMatrixImpl0 = null;
        try {
            realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // All input rows must have the same length.
        }
    }

    @Test(timeout = 4000)
    public void test3441() throws Throwable {
        double[] doubleArray0 = new double[3];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double[][] doubleArray1 = new double[1][2];
        try {
            realMatrixImpl0.setSubMatrix(doubleArray1, 2, 2024);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // invalid row or column index selection
        }
    }

    @Test(timeout = 4000)
    public void test3542() throws Throwable {
        double[][] doubleArray0 = new double[17][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
        try {
            realMatrixImpl0.setSubMatrix(doubleArray0, 31, 31);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // matrix must be initialized to perfom this method
        }
    }

    @Test(timeout = 4000)
    public void test3643() throws Throwable {
        double[][] doubleArray0 = new double[5][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.setSubMatrix(doubleArray0, 838, 838);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // invalid row or column index selection
        }
    }

    @Test(timeout = 4000)
    public void test3744() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1384, 1384);
        try {
            realMatrixImpl0.getRowMatrix(1384);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // illegal row argument
        }
    }

    @Test(timeout = 4000)
    public void test3845() throws Throwable {
        double[][] doubleArray0 = new double[9][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.getColumnMatrix((-197));
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // illegal column argument
        }
    }

    @Test(timeout = 4000)
    public void test3946() throws Throwable {
        double[][] doubleArray0 = new double[20][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
        double[] doubleArray1 = realMatrixImpl0.getRow(17);
        assertEquals(8, doubleArray1.length);
    }

    @Test(timeout = 4000)
    public void test4047() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(2, 2);
        try {
            realMatrixImpl0.getRow((-2527));
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // illegal row argument
        }
    }

    @Test(timeout = 4000)
    public void test4148() throws Throwable {
        double[][] doubleArray0 = new double[1][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, true);
        double[] doubleArray1 = realMatrixImpl0.getColumn(0);
        assertEquals(1, doubleArray1.length);
    }

    @Test(timeout = 4000)
    public void test4249() throws Throwable {
        double[][] doubleArray0 = new double[1][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.getColumn(25);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // illegal column argument
        }
    }

    @Test(timeout = 4000)
    public void test4350() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        assertEquals(1, realMatrixImpl0.getRowDimension());
    }

    @Test(timeout = 4000)
    public void test4351() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        assertTrue(realMatrixImpl0.isSquare());
    }

    @Test(timeout = 4000)
    public void test4352() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double double0 = realMatrixImpl0.getDeterminant();
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test4453() throws Throwable {
        double[][] doubleArray0 = new double[1][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.getDeterminant();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // matrix is not square
        }
    }

    @Test(timeout = 4000)
    public void test4554() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = (-1461.73353);
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double double0 = realMatrixImpl0.getDeterminant();
        assertEquals((-1461.73353), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test4655() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[][] doubleArray1 = new double[4][1];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
        double double0 = realMatrixImpl0.getTrace();
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test4756() throws Throwable {
        double[] doubleArray0 = new double[4];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.getTrace();
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // matrix is not square
        }
    }

    @Test(timeout = 4000)
    public void test4857() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double[] doubleArray1 = realMatrixImpl0.operate(doubleArray0);
        assertNotSame(doubleArray1, doubleArray0);
    }

    @Test(timeout = 4000)
    public void test4858() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double[] doubleArray1 = realMatrixImpl0.operate(doubleArray0);
        assertArrayEquals(new double[] { 0.0 }, doubleArray1, 0.01);
    }

    @Test(timeout = 4000)
    public void test4959() throws Throwable {
        double[] doubleArray0 = new double[3];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        try {
            realMatrixImpl0.operate(doubleArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // vector has wrong length
        }
    }

    @Test(timeout = 4000)
    public void test5060() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double[] doubleArray1 = realMatrixImpl0.preMultiply(doubleArray0);
        assertArrayEquals(new double[] { 0.0 }, doubleArray1, 0.01);
    }

    @Test(timeout = 4000)
    public void test5161() throws Throwable {
        double[] doubleArray0 = new double[4];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(2, 2);
        try {
            realMatrixImpl0.preMultiply(doubleArray0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // vector has wrong length
        }
    }

    @Test(timeout = 4000)
    public void test5262() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double[] doubleArray1 = new double[0];
        try {
            realMatrixImpl0.solve(doubleArray1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // constant vector has wrong length
        }
    }

    @Test(timeout = 4000)
    public void test5363() throws Throwable {
        double[][] doubleArray0 = new double[2][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.transpose();
        try {
            realMatrixImpl0.solve(realMatrix0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Incorrect row dimension
        }
    }

    @Test(timeout = 4000)
    public void test5464() throws Throwable {
        double[] doubleArray0 = new double[4];
        double[][] doubleArray1 = new double[4][1];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
        try {
            realMatrixImpl0.inverse();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // Matrix is singular.
        }
    }

    @Test(timeout = 4000)
    public void test5565() throws Throwable {
        double[] doubleArray0 = new double[4];
        doubleArray0[0] = (-1645.855237378296);
        double[][] doubleArray1 = new double[4][1];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1);
        RealMatrix realMatrix0 = realMatrixImpl0.transpose();
        RealMatrixImpl realMatrixImpl1 = (RealMatrixImpl) realMatrixImpl0.subtract(realMatrix0);
        try {
            realMatrixImpl1.luDecompose();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // matrix is singular
        }
    }

    @Test(timeout = 4000)
    public void test5666() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
        String string0 = realMatrixImpl0.toString();
        assertEquals("RealMatrixImpl{}", string0);
    }

    @Test(timeout = 4000)
    public void test5767() throws Throwable {
        double[][] doubleArray0 = new double[10][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        String string0 = realMatrixImpl0.toString();
        assertEquals("RealMatrixImpl{{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0},{0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0}}", string0);
    }

    @Test(timeout = 4000)
    public void test5868() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[][] doubleArray1 = new double[9][0];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        doubleArray1[4] = doubleArray0;
        doubleArray1[5] = doubleArray0;
        doubleArray1[6] = doubleArray1[5];
        doubleArray1[7] = doubleArray0;
        doubleArray1[8] = doubleArray0;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1, false);
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray0);
        boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl1);
        assertFalse(realMatrixImpl1.equals((Object) realMatrixImpl0));
    }

    @Test(timeout = 4000)
    public void test5869() throws Throwable {
        double[] doubleArray0 = new double[1];
        double[][] doubleArray1 = new double[9][0];
        doubleArray1[0] = doubleArray0;
        doubleArray1[1] = doubleArray0;
        doubleArray1[2] = doubleArray0;
        doubleArray1[3] = doubleArray0;
        doubleArray1[4] = doubleArray0;
        doubleArray1[5] = doubleArray0;
        doubleArray1[6] = doubleArray1[5];
        doubleArray1[7] = doubleArray0;
        doubleArray1[8] = doubleArray0;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray1, false);
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray0);
        boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5970() throws Throwable {
        double[] doubleArray0 = new double[1];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        boolean boolean0 = realMatrixImpl0.equals(realMatrixImpl0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test6071() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl();
        Object object0 = new Object();
        boolean boolean0 = realMatrixImpl0.equals(object0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test6172() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1409, 1409);
        double[] doubleArray0 = new double[3];
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray0);
        boolean boolean0 = realMatrixImpl1.equals(realMatrixImpl0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test6173() throws Throwable {
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(1409, 1409);
        double[] doubleArray0 = new double[3];
        RealMatrixImpl realMatrixImpl1 = new RealMatrixImpl(doubleArray0);
        boolean boolean0 = realMatrixImpl1.equals(realMatrixImpl0);
        assertTrue(realMatrixImpl0.isSquare());
    }

    @Test(timeout = 4000)
    public void test6274() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 920.529;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        assertEquals(920.529, realMatrixImpl0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test6275() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 920.529;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.inverse();
        boolean boolean0 = realMatrixImpl0.equals(realMatrix0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test6276() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 920.529;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrix realMatrix0 = realMatrixImpl0.inverse();
        boolean boolean0 = realMatrixImpl0.equals(realMatrix0);
        assertEquals(0.0010863318809076086, realMatrix0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test6377() throws Throwable {
        double[][] doubleArray0 = new double[1][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        RealMatrixImpl realMatrixImpl1 = realMatrixImpl0.subtract(realMatrixImpl0);
        boolean boolean0 = realMatrixImpl1.equals(realMatrixImpl0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test6578() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 920.529;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        assertEquals(920.529, realMatrixImpl0.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test6579() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 920.529;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double[] doubleArray1 = realMatrixImpl0.solve(doubleArray0);
        assertArrayEquals(new double[] { 1.0 }, doubleArray1, 0.01);
    }

    @Test(timeout = 4000)
    public void test6580() throws Throwable {
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = 920.529;
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0);
        double[] doubleArray1 = realMatrixImpl0.solve(doubleArray0);
        realMatrixImpl0.getLUMatrix();
        assertArrayEquals(new double[] { 920.529 }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test6681() throws Throwable {
        double[][] doubleArray0 = new double[20][8];
        RealMatrixImpl realMatrixImpl0 = new RealMatrixImpl(doubleArray0, false);
        try {
            realMatrixImpl0.getLUMatrix();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // LU decomposition requires that the matrix be square.
        }
    }
}
