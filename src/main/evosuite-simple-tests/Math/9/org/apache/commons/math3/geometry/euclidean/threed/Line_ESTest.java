/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 05:07:37 GMT 2023
 */
package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Line_ESTest extends Line_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = Vector3D.PLUS_J;
        Line line0 = new Line(vector3D0, vector3D1);
        Line line1 = new Line(line0);
        double double0 = line1.distance(line0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.8747858), (-1930.8747858), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.8747858), vector3D0, (-1930.8747858), vector3D0, (-1930.8747858), vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
        Vector3D vector3D3 = line0.toSpace(vector1D0);
        line0.toSubSpace(vector3D3);
        assertEquals(Double.POSITIVE_INFINITY, vector3D3.getY(), 0.01);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.8747858), (-1930.8747858), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.8747858), vector3D0, (-1930.8747858), vector3D0, (-1930.8747858), vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
        Vector3D vector3D3 = line0.toSpace(vector1D0);
        line0.toSubSpace(vector3D3);
        assertEquals(Double.NEGATIVE_INFINITY, vector3D3.getZ(), 0.01);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.8747858), vector3D0, (-1930.8747858), vector3D0, (-1930.8747858), vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector1D vector1D0 = line0.toSubSpace(vector3D1);
        assertEquals((-5792.624357399999), vector1D0.getX(), 0.01);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Vector3D vector3D0 = new Vector3D((-2872.495), (-2872.495));
        Vector3D vector3D1 = new Vector3D(0.0, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector1D vector1D0 = line0.toSubSpace(vector3D1);
        assertEquals(0.0, vector1D0.getX(), 0.01);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Line line0 = new Line(vector3D0, vector3D1);
        Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
        Vector1D vector1D1 = new Vector1D((-3052.86369532419), vector1D0, 3820.9, vector1D0);
        Vector3D vector3D2 = line0.toSpace(vector1D1);
        assertEquals(Double.NaN, vector3D2.getNormInf(), 0.01);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_I;
        Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector1D vector1D0 = line0.toSubSpace(vector3D0);
        Vector3D vector3D2 = line0.toSpace(vector1D0);
        assertEquals(1.0, vector1D0.getX(), 0.01);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_I;
        Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector1D vector1D0 = line0.toSubSpace(vector3D0);
        Vector3D vector3D2 = line0.toSpace(vector1D0);
        assertEquals(3.141592653589793, vector3D2.getAlpha(), 0.01);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_I;
        Vector3D vector3D1 = new Vector3D(0.0, vector3D0);
        Line line0 = new Line(vector3D0, vector3D1);
        Vector1D vector1D0 = Vector1D.ZERO;
        Vector3D vector3D2 = line0.toSpace(vector1D0);
        assertEquals(0.0, vector3D2.getNormSq(), 0.01);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(2.0, vector3D0);
        Line line0 = new Line(vector3D0, vector3D1);
        Vector1D vector1D0 = Vector1D.ONE;
        Vector3D vector3D2 = line0.toSpace(vector1D0);
        assertEquals((-1.0), vector3D2.getZ(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.8747858), vector3D0, (-1930.8747858), vector3D0, (-1930.8747858), vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector1D vector1D0 = new Vector1D((-1930.8747858));
        Vector3D vector3D2 = line0.toSpace(vector1D0);
        assertEquals(1930.8747858000006, vector3D2.getNormInf(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        Vector3D vector3D0 = Vector3D.NaN;
        Line line0 = new Line(vector3D0, vector3D0);
        Vector3D vector3D1 = line0.pointAt(Double.NaN);
        assertEquals(Double.NaN, vector3D1.getAlpha(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.8747858), (-1930.8747858), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.8747858), vector3D0, (-1930.8747858), vector3D0, (-1930.8747858), vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Vector3D vector3D3 = line0.pointAt(Double.NEGATIVE_INFINITY);
        assertEquals(0.7853981633974483, vector3D3.getAlpha(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.874785751), vector3D0, (-1930.874785751), vector3D0, 0.7071067811865475, vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Vector3D vector3D3 = line0.pointAt(2631.61399663977);
        assertEquals(1.5707963267949203, vector3D3.getAlpha(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.874785751), vector3D0, (-1930.874785751), vector3D0, 0.7071067811865475, vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Vector3D vector3D3 = line0.pointAt((-3052.86369532419));
        assertEquals((-0.2274401503323786), vector3D3.getDelta(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = Vector3D.PLUS_J;
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = line0.pointAt(0.0);
        assertEquals(0.0, vector3D2.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_J;
        Vector3D vector3D1 = new Vector3D(1.1102230246251565E-16, vector3D0);
        Line line0 = new Line(vector3D0, vector3D1);
        Vector3D vector3D2 = line0.pointAt(2814.825390032998);
        assertEquals((-2814.825390032998), vector3D2.getY(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_K;
        Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = line0.intersection(line0);
        assertNotNull(vector3D2);
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_K;
        Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = line0.intersection(line0);
        assertEquals(0.0, vector3D2.getNormSq(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = Vector3D.PLUS_I;
        Line line0 = new Line(vector3D0, vector3D1);
        Vector3D vector3D2 = line0.intersection(line0);
        assertNotNull(vector3D2);
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = Vector3D.PLUS_I;
        Line line0 = new Line(vector3D0, vector3D1);
        Vector3D vector3D2 = line0.intersection(line0);
        assertEquals((-0.7853981633974482), vector3D2.getDelta(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1721() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.874785751), vector3D0, (-1930.874785751), vector3D0, 0.7071067811865475, vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Vector3D vector3D3 = line0.intersection(line0);
        assertEquals(13184.837825772072, vector3D3.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1722() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.874785751), vector3D0, (-1930.874785751), vector3D0, 0.7071067811865475, vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Vector3D vector3D3 = line0.intersection(line0);
        assertNotNull(vector3D3);
    }

    @Test(timeout = 4000)
    public void test1823() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.8747858), (-1930.8747858), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.8747858), vector3D0, (-1930.8747858), vector3D0, (-1930.8747858), vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Vector3D vector3D3 = line0.getOrigin();
        assertEquals(1.9989647361677867, vector3D3.getY(), 0.01);
    }

    @Test(timeout = 4000)
    public void test1924() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_I;
        Vector3D vector3D1 = new Vector3D(0.0, vector3D0);
        Line line0 = new Line(vector3D0, vector3D1);
        Vector3D vector3D2 = line0.getOrigin();
        assertEquals(Double.NaN, vector3D2.getDelta(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2025() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_I;
        Vector3D vector3D1 = new Vector3D(1.0E-10, vector3D0);
        Line line0 = new Line(vector3D0, vector3D1);
        Vector3D vector3D2 = line0.getOrigin();
        assertEquals(1.0000001654807488E-20, vector3D2.getNorm(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2126() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 0.0, vector3D0, 756.9, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = line0.getOrigin();
        assertEquals(1.4351956879477356E-14, vector3D2.getNorm1(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2227() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = Vector3D.MINUS_J;
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = line0.getOrigin();
        assertEquals((-0.5), vector3D2.getY(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2328() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = Vector3D.MINUS_I;
        Vector3D vector3D2 = new Vector3D((-6039.008730520395), vector3D0, (-6039.008730520395), vector3D1, (-6039.008730520395), vector3D0, 2.220446049250313E-16, vector3D0);
        Line line0 = new Line(vector3D2, vector3D1);
        Vector3D vector3D3 = line0.getDirection();
        assertEquals((-0.44727283586859634), vector3D3.getX(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2429() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D((-6039.008730520395), vector3D0, (-6039.008730520395), vector3D0, (-6039.008730520395), vector3D0, 2.220446049250313E-16, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = line0.getDirection();
        assertEquals((-1.0), vector3D2.getZ(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2530() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_I;
        Vector3D vector3D1 = new Vector3D((-8.0E298), vector3D0, (-8.0E298), vector3D0, (-3639.568656), vector3D0);
        Line line0 = new Line(vector3D0, vector3D1);
        Vector3D vector3D2 = line0.getDirection();
        assertEquals(0.0, vector3D2.getX(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2631() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = vector3D0.negate();
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = line0.getDirection();
        assertEquals((-1.0), vector3D2.getY(), 0.01);
    }

    @Test(timeout = 4000)
    public void test2732() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_K;
        Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        double double0 = line0.getAbscissa(vector3D1);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test2833() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_K;
        Vector3D vector3D1 = new Vector3D(779.2612664617, vector3D0);
        Line line0 = new Line(vector3D0, vector3D1);
        double double0 = line0.getAbscissa(vector3D0);
        assertEquals(0.9999999999999998, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test2934() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_K;
        Vector3D vector3D1 = vector3D0.scalarMultiply(0.625);
        Vector3D vector3D2 = new Vector3D((-198.2), vector3D0);
        Line line0 = new Line(vector3D2, vector3D0);
        line0.reset(vector3D0, vector3D1);
        double double0 = line0.getAbscissa(vector3D0);
        assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test3035() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D(1.0E-10, vector3D0, (-646.4229371), vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        double double0 = line0.distance(vector3D0);
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test3136() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = Vector3D.MINUS_I;
        Line line0 = new Line(vector3D0, vector3D1);
        double double0 = line0.distance(vector3D0);
        assertEquals(1.2537167179050217E-16, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test3237() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 0.0, vector3D0, 756.9, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = Vector3D.NaN;
        line0.reset(vector3D2, vector3D0);
        Vector3D vector3D3 = line0.closestPoint(line0);
        assertEquals(Double.NaN, vector3D3.getZ(), 0.01);
    }

    @Test(timeout = 4000)
    public void test3338() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = Vector3D.MINUS_K;
        Line line0 = new Line(vector3D0, vector3D1);
        Vector3D vector3D2 = Vector3D.PLUS_J;
        Line line1 = new Line(vector3D2, vector3D0);
        Vector3D vector3D3 = line1.closestPoint(line0);
        assertEquals((-0.9999999999999998), vector3D3.getY(), 0.01);
    }

    @Test(timeout = 4000)
    public void test3439() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_I;
        Vector3D vector3D1 = new Vector3D(0.0, vector3D0);
        Line line0 = new Line(vector3D0, vector3D1);
        Vector3D vector3D2 = line0.closestPoint(line0);
        assertEquals(0.0, vector3D2.getX(), 0.01);
    }

    @Test(timeout = 4000)
    public void test3540() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.874785751), vector3D0, (-1930.874785751), vector3D0, 0.7071067811865475, vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Vector3D vector3D3 = line0.closestPoint(line0);
        assertEquals(13184.837761510615, vector3D3.getY(), 0.01);
    }

    @Test(timeout = 4000)
    public void test3641() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        // Undeclared exception!
        try {
            line0.toSubSpace((Vector<Euclidean3D>) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test3742() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        // Undeclared exception!
        try {
            line0.toSpace((Vector<Euclidean1D>) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test3843() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        // Undeclared exception!
        try {
            line0.reset((Vector3D) null, (Vector3D) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test3944() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 0.0, vector3D0, 0.0, vector3D0, 0.0, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        // Undeclared exception!
        try {
            line0.isSimilarTo((Line) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test4045() throws Throwable {
        Vector3D vector3D0 = Vector3D.ZERO;
        Vector3D vector3D1 = Vector3D.PLUS_I;
        Line line0 = new Line(vector3D0, vector3D1);
        // Undeclared exception!
        try {
            line0.intersection((Line) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test4146() throws Throwable {
        Vector3D vector3D0 = Vector3D.NaN;
        Line line0 = new Line(vector3D0, vector3D0);
        // Undeclared exception!
        try {
            line0.distance((Vector3D) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test4247() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_I;
        Vector3D vector3D1 = new Vector3D((-8.0E298), vector3D0, (-8.0E298), vector3D0, (-3639.568656), vector3D0);
        Line line0 = new Line(vector3D0, vector3D1);
        // Undeclared exception!
        try {
            line0.distance((Line) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test4348() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        // Undeclared exception!
        try {
            line0.contains((Vector3D) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test4449() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(2.0, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        // Undeclared exception!
        try {
            line0.closestPoint((Line) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test4550() throws Throwable {
        Line line0 = null;
        try {
            line0 = new Line((Vector3D) null, (Vector3D) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test4651() throws Throwable {
        Line line0 = null;
        try {
            line0 = new Line((Line) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test4752() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = Vector3D.MINUS_K;
        Line line0 = new Line(vector3D0, vector3D1);
        Vector3D vector3D2 = line0.closestPoint(line0);
        assertEquals((-0.5), vector3D2.getY(), 0.01);
    }

    @Test(timeout = 4000)
    public void test4853() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(0.0, vector3D0, 0.0, vector3D0, 0.0, vector3D0, 0.0, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = Vector3D.PLUS_J;
        line0.reset(vector3D2, vector3D0);
        boolean boolean0 = line0.contains(vector3D1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4954() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = vector3D0.negate();
        Line line0 = new Line(vector3D1, vector3D0);
        boolean boolean0 = line0.contains(vector3D0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5055() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = Vector3D.MINUS_K;
        Line line0 = new Line(vector3D0, vector3D1);
        try {
            line0.reset(vector3D1, vector3D1);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // zero norm
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test5156() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        // Undeclared exception!
        try {
            line0.getAbscissa((Vector3D) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test5257() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), vector3D0, (-1930.874785751), vector3D0, 0.7071067811865475, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = line0.intersection(line0);
        assertNotNull(vector3D2);
    }

    @Test(timeout = 4000)
    public void test5258() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), vector3D0, (-1930.874785751), vector3D0, 0.7071067811865475, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        Vector3D vector3D2 = line0.intersection(line0);
        assertEquals(9.662748808620143E-14, vector3D2.getNorm1(), 0.01);
    }

    @Test(timeout = 4000)
    public void test5359() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.874785751), vector3D0, (-1930.874785751), vector3D0, 0.7071067811865475, vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Line line1 = new Line(line0);
        line0.reset(vector3D1, vector3D0);
        double double0 = line1.distance(line0);
        assertEquals(1.540381000745449E-14, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test5460() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        boolean boolean0 = line0.isSimilarTo(line0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5561() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Vector3D vector3D2 = new Vector3D((-1930.874785751), vector3D0, (-1930.874785751), vector3D0, 0.7071067811865475, vector3D1);
        Line line0 = new Line(vector3D2, vector3D1);
        Line line1 = new Line(line0);
        line0.reset(vector3D1, vector3D0);
        boolean boolean0 = line0.isSimilarTo(line1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5662() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), vector3D0, (-1930.874785751), vector3D0, 0.7071067811865475, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        boolean boolean0 = line0.isSimilarTo(line0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5763() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Line line0 = null;
        try {
            line0 = new Line(vector3D0, vector3D0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // zero norm
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test5864() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        Vector1D vector1D0 = line0.toSubSpace(vector3D0);
        assertEquals(Double.NaN, vector1D0.getNormInf(), 0.01);
    }

    @Test(timeout = 4000)
    public void test5965() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        Vector3D vector3D1 = line0.getDirection();
        assertEquals(Double.NaN, vector3D1.getNormSq(), 0.01);
    }

    @Test(timeout = 4000)
    public void test6066() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        SubLine subLine0 = line0.wholeLine();
        assertNotNull(subLine0);
    }

    @Test(timeout = 4000)
    public void test6167() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Line line0 = new Line(vector3D0, vector3D1);
        Line line1 = new Line(line0);
        Vector3D vector3D2 = line1.intersection(line0);
        assertNotNull(vector3D2);
    }

    @Test(timeout = 4000)
    public void test6168() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Line line0 = new Line(vector3D0, vector3D1);
        Line line1 = new Line(line0);
        Vector3D vector3D2 = line1.intersection(line0);
        assertEquals((-1.5707963267948966), vector3D2.getAlpha(), 0.01);
    }

    @Test(timeout = 4000)
    public void test6169() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_J;
        Vector3D vector3D1 = new Vector3D((-1930.874785751), (-1900.6668464), 1.633123935319537E16);
        Line line0 = new Line(vector3D0, vector3D1);
        Line line1 = new Line(line0);
        Vector3D vector3D2 = line1.intersection(line0);
        assertEquals((-1.163210461445053E-13), vector3D2.getDelta(), 0.01);
    }

    @Test(timeout = 4000)
    public void test6270() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        Vector3D vector3D1 = line0.intersection(line0);
        assertNull(vector3D1);
    }

    @Test(timeout = 4000)
    public void test6371() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        Vector3D vector3D1 = line0.getOrigin();
        assertTrue(vector3D1.isNaN());
    }

    @Test(timeout = 4000)
    public void test6472() throws Throwable {
        Vector3D vector3D0 = Vector3D.NEGATIVE_INFINITY;
        Line line0 = new Line(vector3D0, vector3D0);
        Line line1 = line0.revert();
        assertNotSame(line1, line0);
    }
}
