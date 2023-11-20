/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 08:02:06 GMT 2023
 */
package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Side;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.junit.runner.RunWith;

public class SubLineTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Vector2D vector2D0 = Vector2D.ZERO;
        Line line0 = new Line(vector2D0, vector2D0);
        SubLine subLine0 = line0.wholeHyperplane();
        AbstractSubHyperplane<Euclidean2D, Euclidean1D> abstractSubHyperplane0 = subLine0.copySelf();
        assertNotSame(subLine0, abstractSubHyperplane0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Vector2D vector2D0 = Vector2D.ZERO;
        Line line0 = new Line(vector2D0, (-3026.663285856013));
        Segment segment0 = new Segment(vector2D0, vector2D0, line0);
        SubLine subLine0 = new SubLine(segment0);
        Side side0 = subLine0.side(line0);
        assertEquals(Side.HYPER, side0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Vector2D vector2D0 = Vector2D.NaN;
        SubLine subLine0 = new SubLine(vector2D0, vector2D0);
        Vector2D vector2D1 = subLine0.intersection(subLine0, true);
        assertNull(vector2D1);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Vector2D vector2D0 = Vector2D.ZERO;
        SubLine subLine0 = new SubLine(vector2D0, vector2D0);
        List<Segment> list0 = subLine0.getSegments();
        assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Vector2D vector2D0 = Vector2D.NaN;
        Line line0 = new Line(vector2D0, vector2D0);
        SubLine subLine0 = line0.wholeHyperplane();
        Vector2D vector2D1 = subLine0.intersection(subLine0, false);
        assertEquals(Double.NaN, vector2D1.getNorm1(), 0.01);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Vector2D vector2D0 = Vector2D.NaN;
        Line line0 = new Line(vector2D0, vector2D0);
        SubLine subLine0 = line0.wholeHyperplane();
        Vector2D vector2D1 = subLine0.intersection(subLine0, true);
        assertTrue(vector2D1.equals((Object) vector2D0));
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
        SubLine subLine0 = new SubLine(vector2D0, vector2D0);
        Hyperplane<Euclidean2D> hyperplane0 = subLine0.getHyperplane();
        IntervalsSet intervalsSet0 = new IntervalsSet();
        SubLine subLine1 = new SubLine(hyperplane0, intervalsSet0);
        Vector2D vector2D1 = subLine1.intersection(subLine0, true);
        assertNull(vector2D1);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Vector2D vector2D0 = Vector2D.NaN;
        SubLine subLine0 = new SubLine(vector2D0, vector2D0);
        Vector2D vector2D1 = subLine0.intersection(subLine0, false);
        assertNull(vector2D1);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
        SubLine subLine0 = new SubLine(vector2D0, vector2D0);
        Hyperplane<Euclidean2D> hyperplane0 = subLine0.getHyperplane();
        IntervalsSet intervalsSet0 = new IntervalsSet();
        SubLine subLine1 = new SubLine(hyperplane0, intervalsSet0);
        Vector2D vector2D1 = subLine1.intersection(subLine0, false);
        assertNull(vector2D1);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Vector2D vector2D0 = Vector2D.POSITIVE_INFINITY;
        SubLine subLine0 = new SubLine(vector2D0, vector2D0);
        Hyperplane<Euclidean2D> hyperplane0 = subLine0.getHyperplane();
        Side side0 = subLine0.side(hyperplane0);
        assertEquals(Side.MINUS, side0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Vector2D vector2D0 = Vector2D.ZERO;
        Line line0 = new Line(vector2D0, (-3026.663285856013));
        Line line1 = new Line(line0);
        Segment segment0 = new Segment(vector2D0, vector2D0, line1);
        SubLine subLine0 = new SubLine(segment0);
        line0.setOriginOffset((-2489.84438345));
        Side side0 = subLine0.side(line0);
        assertEquals(Side.MINUS, side0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Vector2D vector2D0 = Vector2D.ZERO;
        Line line0 = new Line(vector2D0, (-619.764576640369));
        IntervalsSet intervalsSet0 = new IntervalsSet();
        SubLine subLine0 = new SubLine(line0, intervalsSet0);
        Line line1 = new Line(vector2D0, (-619.764576640369));
        line0.setOriginOffset((-184.191494550068));
        Side side0 = subLine0.side(line1);
        assertEquals(Side.PLUS, side0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Vector2D vector2D0 = Vector2D.ZERO;
        Line line0 = new Line(vector2D0, 1.0);
        SubLine subLine0 = new SubLine(vector2D0, vector2D0);
        Side side0 = subLine0.side(line0);
        assertEquals(Side.PLUS, side0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Vector2D vector2D0 = Vector2D.ZERO;
        Line line0 = new Line(vector2D0, (-619.764576640369));
        IntervalsSet intervalsSet0 = new IntervalsSet();
        SubLine subLine0 = new SubLine(line0, intervalsSet0);
        SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
        assertNotNull(subHyperplane_SplitSubHyperplane0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Vector2D vector2D0 = Vector2D.ZERO;
        Line line0 = new Line(vector2D0, vector2D0);
        SubLine subLine0 = line0.wholeHyperplane();
        Line line1 = new Line(line0);
        line1.setOriginOffset((-0.06441789580971566));
        SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line1);
        assertNotNull(subHyperplane_SplitSubHyperplane0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Vector2D vector2D0 = Vector2D.ZERO;
        Line line0 = new Line(vector2D0, 45.27502593443734);
        SubLine subLine0 = new SubLine(vector2D0, vector2D0);
        SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
        assertNotNull(subHyperplane_SplitSubHyperplane0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Vector2D vector2D0 = Vector2D.NaN;
        Line line0 = new Line(vector2D0, vector2D0);
        SubLine subLine0 = new SubLine(vector2D0, vector2D0);
        SubHyperplane.SplitSubHyperplane<Euclidean2D> subHyperplane_SplitSubHyperplane0 = subLine0.split(line0);
        assertNotNull(subHyperplane_SplitSubHyperplane0);
    }
}
