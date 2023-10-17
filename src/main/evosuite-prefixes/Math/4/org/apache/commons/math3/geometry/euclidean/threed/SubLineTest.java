/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 04:45:18 GMT 2023
 */
package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.RotationOrder;
import org.apache.commons.math3.geometry.euclidean.threed.Segment;
import org.apache.commons.math3.geometry.euclidean.threed.SubLine;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.junit.runner.RunWith;

public class SubLineTest {

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_K;
        Vector3D vector3D1 = new Vector3D(291.5, vector3D0, (-397.80643760046), vector3D0, 1.0, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        SubLine subLine0 = line0.wholeLine();
        Vector3D vector3D2 = subLine0.intersection(subLine0, false);
        vector3D2.getZ();
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Vector3D vector3D0 = new Vector3D(4420.3, 1.0, 4420.3);
        Vector3D vector3D1 = Vector3D.MINUS_J;
        Line line0 = new Line(vector3D1, vector3D0);
        SubLine subLine0 = line0.wholeLine();
        Vector3D vector3D2 = subLine0.intersection(subLine0, true);
        vector3D2.getNormSq();
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_J;
        Vector3D vector3D1 = Vector3D.MINUS_I;
        Line line0 = new Line(vector3D0, vector3D1);
        SubLine subLine0 = line0.wholeLine();
        Vector3D vector3D2 = subLine0.intersection(subLine0, true);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_J;
        Vector3D vector3D1 = new Vector3D(0.0, vector3D0);
        Line line0 = new Line(vector3D0, vector3D1);
        IntervalsSet intervalsSet0 = new IntervalsSet();
        SubLine subLine0 = new SubLine(line0, intervalsSet0);
        Vector3D vector3D2 = subLine0.intersection(subLine0, true);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_J;
        Vector3D vector3D1 = Vector3D.MINUS_I;
        Line line0 = new Line(vector3D0, vector3D1);
        SubLine subLine0 = line0.wholeLine();
        subLine0.intersection((SubLine) null, true);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        Vector3D vector3D0 = Vector3D.PLUS_K;
        Vector3D vector3D1 = new Vector3D(291.5, vector3D0, 291.5, vector3D0, 291.5, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        SubLine subLine0 = line0.wholeLine();
        Vector1D vector1D0 = Vector1D.NaN;
        OrientedPoint orientedPoint0 = new OrientedPoint(vector1D0, true);
        IntervalsSet intervalsSet0 = orientedPoint0.wholeSpace();
        SubOrientedPoint subOrientedPoint0 = new SubOrientedPoint(orientedPoint0, intervalsSet0);
        BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>(subOrientedPoint0);
        IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree0);
        SubLine subLine1 = new SubLine(line0, intervalsSet1);
        subLine0.intersection(subLine1, true);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Plane plane0 = new Plane(vector3D0, vector3D0);
        Line line0 = plane0.intersection(plane0);
        IntervalsSet intervalsSet0 = new IntervalsSet((-2448.464), (-2448.464));
        IntervalsSet intervalsSet1 = intervalsSet0.buildNew((BSPTree<Euclidean1D>) null);
        SubLine subLine0 = new SubLine(line0, intervalsSet1);
        subLine0.getSegments();
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
        Plane plane0 = new Plane(vector3D0, vector3D0);
        Line line0 = plane0.intersection(plane0);
        IntervalsSet intervalsSet0 = new IntervalsSet((-2448.464), (-2448.464));
        BSPTree<Euclidean1D> bSPTree0 = new BSPTree<Euclidean1D>("n5D`yg^|E7HA");
        IntervalsSet intervalsSet1 = intervalsSet0.buildNew(bSPTree0);
        SubLine subLine0 = new SubLine(line0, intervalsSet1);
        subLine0.getSegments();
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        SubLine subLine0 = null;
        subLine0 = new SubLine((Vector3D) null, (Vector3D) null);
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        SubLine subLine0 = null;
        subLine0 = new SubLine((Segment) null);
    }

    @Test(timeout = 4000)
    public void test1210() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(332.8866725, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        SubLine subLine0 = line0.wholeLine();
        SubLine subLine1 = new SubLine(vector3D0, vector3D1);
        Vector3D vector3D2 = subLine0.intersection(subLine1, false);
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(332.8866725, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        SubLine subLine0 = line0.wholeLine();
        SubLine subLine1 = new SubLine(vector3D0, vector3D1);
        Vector3D vector3D2 = subLine1.intersection(subLine0, false);
    }

    @Test(timeout = 4000)
    public void test1412() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(332.8866725, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        SubLine subLine0 = line0.wholeLine();
        SubLine subLine1 = new SubLine(vector3D0, vector3D1);
        Vector3D vector3D2 = subLine0.intersection(subLine1, true);
    }

    @Test(timeout = 4000)
    public void test1513() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(332.8866725, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        SubLine subLine0 = line0.wholeLine();
        SubLine subLine1 = new SubLine(vector3D0, vector3D1);
        Vector3D vector3D2 = subLine1.intersection(subLine0, true);
    }

    @Test(timeout = 4000)
    public void test1614() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_K;
        Vector3D vector3D1 = new Vector3D(332.8866725, vector3D0);
        Line line0 = new Line(vector3D1, vector3D0);
        SubLine subLine0 = line0.wholeLine();
        List<Segment> list0 = subLine0.getSegments();
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1715() throws Throwable {
        RotationOrder rotationOrder0 = RotationOrder.YXY;
        Vector3D vector3D0 = rotationOrder0.getA1();
        Segment segment0 = new Segment(vector3D0, vector3D0, (Line) null);
        SubLine subLine0 = null;
        subLine0 = new SubLine(segment0);
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        Vector3D vector3D0 = Vector3D.MINUS_I;
        SubLine subLine0 = null;
        subLine0 = new SubLine(vector3D0, vector3D0);
    }
}
