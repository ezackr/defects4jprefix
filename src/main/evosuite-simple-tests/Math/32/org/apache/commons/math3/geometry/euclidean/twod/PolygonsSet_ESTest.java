/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 13:05:01 GMT 2023
 */
package org.apache.commons.math3.geometry.euclidean.twod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.geom.AffineTransform;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Euclidean1D;
import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Plane;
import org.apache.commons.math3.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D;
import org.apache.commons.math3.geometry.euclidean.twod.Line;
import org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math3.geometry.euclidean.twod.Segment;
import org.apache.commons.math3.geometry.euclidean.twod.SubLine;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.partitioning.AbstractSubHyperplane;
import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.apache.commons.math3.geometry.partitioning.BSPTreeVisitor;
import org.apache.commons.math3.geometry.partitioning.Hyperplane;
import org.apache.commons.math3.geometry.partitioning.Region;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;
import org.apache.commons.math3.geometry.partitioning.Transform;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class PolygonsSet_ESTest extends PolygonsSet_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test100() throws Throwable {
        PolygonsSet polygonsSet0 = new PolygonsSet(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, (-2342.849338), 1419.1162628977);
        polygonsSet0.computeGeometricalProperties();
        BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
        polygonsSet0.buildNew(bSPTree0);
        PolygonsSet polygonsSet1 = null;
        try {
            polygonsSet1 = new PolygonsSet(bSPTree0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
        }
    }

    @Test(timeout = 4000)
    public void test151() throws Throwable {
        PolygonsSet polygonsSet0 = new PolygonsSet();
        polygonsSet0.computeGeometricalProperties();
        polygonsSet0.computeGeometricalProperties();
        polygonsSet0.getVertices();
        Vector2D vector2D0 = Vector2D.NaN;
        Line line0 = new Line(vector2D0, (-399.4336413617017));
        Segment segment0 = new Segment(vector2D0, vector2D0, line0);
        SubLine subLine0 = new SubLine(segment0);
        BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>();
        SubLine subLine1 = new SubLine(segment0);
        AffineTransform affineTransform0 = AffineTransform.getRotateInstance((-3356.39928), 0.0, 0.0, (-3356.39928));
        AffineTransform affineTransform1 = new AffineTransform(affineTransform0);
        Transform<Euclidean2D, Euclidean1D> transform0 = Line.getTransform(affineTransform1);
        subLine1.applyTransform(transform0);
        bSPTree0.getCell(vector2D0);
        Vector<Euclidean2D> vector0 = polygonsSet0.getBarycenter();
        subLine1.reunite(subLine0);
        vector2D0.distanceInf(vector0);
        subLine0.reunite(subLine1);
        BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, vector2D0);
        BSPTree<Euclidean2D> bSPTree2 = bSPTree1.getPlus();
        BSPTree<Euclidean2D> bSPTree3 = bSPTree2.getCell(vector2D0);
        PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree3);
        polygonsSet0.computeGeometricalProperties();
        polygonsSet1.getVertices();
        PolygonsSet polygonsSet2 = polygonsSet0.buildNew(bSPTree2);
        polygonsSet2.computeGeometricalProperties();
        polygonsSet2.computeGeometricalProperties();
        polygonsSet0.buildNew(bSPTree0);
        polygonsSet1.buildNew(bSPTree0);
        // Undeclared exception!
        try {
            polygonsSet1.getVertices();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
        }
    }

    @Test(timeout = 4000)
    public void test162() throws Throwable {
        LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
        linkedList0.iterator();
        PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
        BSPTree<Euclidean2D> bSPTree0 = null;
        Vector3D vector3D0 = Vector3D.PLUS_J;
        Plane plane0 = new Plane(vector3D0, vector3D0);
        Vector2D vector2D0 = plane0.toSubSpace(vector3D0);
        LinkedList<Euclidean1D> linkedList1 = new LinkedList<Euclidean1D>();
        linkedList0.containsAll(linkedList1);
        Vector2D vector2D1 = new Vector2D((-1634.333308), vector2D0, 0.0, vector2D0, (-1634.333308), vector2D0);
        vector2D1.add((Vector<Euclidean2D>) vector2D0);
        vector2D0.distance1(vector2D1);
        SubLine subLine0 = new SubLine(vector2D0, vector2D0);
        linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
        PolygonsSet polygonsSet1 = polygonsSet0.buildNew((BSPTree<Euclidean2D>) null);
        polygonsSet1.getVertices();
        polygonsSet1.getSize();
        // Undeclared exception!
        try {
            polygonsSet0.getVertices();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
        }
    }

    @Test(timeout = 4000)
    public void test183() throws Throwable {
        Vector2D vector2D0 = Vector2D.NEGATIVE_INFINITY;
        Vector2D vector2D1 = new Vector2D((-0.999999999999998), vector2D0);
        Line line0 = new Line(vector2D1, 3166.5879);
        PolygonsSet polygonsSet0 = line0.wholeSpace();
        polygonsSet0.getVertices();
        line0.toSubSpace(vector2D1);
        BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(polygonsSet0);
        bSPTree0.insertCut(line0);
        BSPTree<Euclidean2D> bSPTree1 = bSPTree0.copySelf();
        BSPTree.LeafMerger<Euclidean2D> bSPTree_LeafMerger0 = (BSPTree.LeafMerger<Euclidean2D>) mock(BSPTree.LeafMerger.class, new ViolatedAssumptionAnswer());
        doReturn((BSPTree) null, (BSPTree) null).when(bSPTree_LeafMerger0).merge(nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class), nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class), nullable(org.apache.commons.math3.geometry.partitioning.BSPTree.class), anyBoolean(), anyBoolean());
        bSPTree0.merge(bSPTree1, bSPTree_LeafMerger0);
        Euclidean2D euclidean2D0 = Euclidean2D.getInstance();
        euclidean2D0.getSubSpace();
        bSPTree0.insertInTree(bSPTree1, true);
        bSPTree1.setAttribute(euclidean2D0);
        PolygonsSet polygonsSet1 = polygonsSet0.buildNew(bSPTree1);
        polygonsSet0.computeGeometricalProperties();
        polygonsSet1.getVertices();
        polygonsSet1.computeGeometricalProperties();
        // Undeclared exception!
        try {
            polygonsSet0.getVertices();
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.apache.commons.math3.geometry.euclidean.twod.Euclidean2D cannot be cast to org.apache.commons.math3.geometry.partitioning.BoundaryAttribute
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet$SegmentsBuilder", e);
        }
    }

    @Test(timeout = 4000)
    public void test224() throws Throwable {
        Vector1D vector1D0 = Vector1D.POSITIVE_INFINITY;
        Vector1D vector1D1 = new Vector1D(4.0, vector1D0, 4.0, vector1D0);
        boolean boolean0 = true;
        OrientedPoint orientedPoint0 = new OrientedPoint(vector1D1, true);
        Vector1D vector1D2 = new Vector1D((-1170.0), vector1D1, (-1170.0), vector1D0);
        vector1D2.getNorm1();
        Vector1D.distanceInf(vector1D1, vector1D2);
        orientedPoint0.wholeHyperplane();
        Region<Euclidean1D> region0 = null;
        vector1D0.getNormInf();
        SubOrientedPoint subOrientedPoint0 = new SubOrientedPoint(orientedPoint0, (Region<Euclidean1D>) null);
        vector1D1.distance((Vector<Euclidean1D>) vector1D0);
        BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(subOrientedPoint0);
        orientedPoint0.wholeHyperplane();
        PolygonsSet polygonsSet0 = new PolygonsSet(bSPTree0);
        polygonsSet0.getVertices();
        polygonsSet0.computeGeometricalProperties();
        polygonsSet0.computeGeometricalProperties();
        // Undeclared exception!
        try {
            bSPTree0.getParent();
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.apache.commons.math3.geometry.euclidean.oned.SubOrientedPoint cannot be cast to java.lang.Boolean
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
        }
    }

    @Test(timeout = 4000)
    public void test235() throws Throwable {
        double double0 = (-1591.66662191364);
        PolygonsSet polygonsSet0 = new PolygonsSet((-1591.66662191364), 0.0, (-1591.66662191364), 3.4028234663852886E38);
        polygonsSet0.computeGeometricalProperties();
        polygonsSet0.getVertices();
        // Undeclared exception!
        try {
            polygonsSet0.getBarycenter();
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.apache.commons.math3.geometry.partitioning.BoundaryAttribute cannot be cast to java.lang.Boolean
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
        }
    }

    @Test(timeout = 4000)
    public void test246() throws Throwable {
        LinkedList<SubHyperplane<Euclidean2D>> linkedList0 = new LinkedList<SubHyperplane<Euclidean2D>>();
        Vector2D vector2D0 = Vector2D.ZERO;
        Line line0 = new Line(vector2D0, (-119.352107946));
        line0.reset(vector2D0, 2461.7259619);
        Vector2D vector2D1 = Vector2D.NEGATIVE_INFINITY;
        vector2D0.distance1(vector2D1);
        SubLine subLine0 = line0.wholeHyperplane();
        linkedList0.add((SubHyperplane<Euclidean2D>) subLine0);
        SubLine subLine1 = line0.wholeHyperplane();
        PolygonsSet polygonsSet0 = new PolygonsSet(linkedList0);
        polygonsSet0.getVertices();
        polygonsSet0.computeGeometricalProperties();
        BSPTree<Euclidean2D> bSPTree0 = new BSPTree<Euclidean2D>(linkedList0);
        BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, bSPTree0, bSPTree0, polygonsSet0);
        subLine0.intersection(subLine1, true);
        polygonsSet0.getBarycenter();
        // Undeclared exception!
        try {
            vector2D1.getNorm();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.twod.Line", e);
        }
    }

    @Test(timeout = 4000)
    public void test267() throws Throwable {
        PolygonsSet polygonsSet0 = new PolygonsSet(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, (-2342.849338), Double.NEGATIVE_INFINITY);
        polygonsSet0.getVertices();
        polygonsSet0.getVertices();
        BSPTree<Euclidean2D> bSPTree0 = null;
        try {
            bSPTree0 = new BSPTree<Euclidean2D>();
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // illegal state: internal error, please fill a bug report at https://issues.apache.org/jira/browse/MATH
            //
            verifyException("org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet", e);
        }
    }

    @Test(timeout = 4000)
    public void test278() throws Throwable {
        double double0 = (-1591.66662191364);
        PolygonsSet polygonsSet0 = new PolygonsSet((-1591.66662191364), 0.0, (-1591.66662191364), 3.4028234663852886E38);
        Vector2D vector2D0 = Vector2D.ZERO;
        polygonsSet0.getVertices();
        Line line0 = new Line(vector2D0, 3.4028234663852886E38);
        SubLine subLine0 = line0.wholeHyperplane();
        BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
        bSPTree0.getParent();
        SubOrientedPoint subOrientedPoint0 = new SubOrientedPoint((Hyperplane<Euclidean1D>) null, (Region<Euclidean1D>) null);
        BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, (BSPTree<Euclidean2D>) null, bSPTree0, subOrientedPoint0);
        polygonsSet0.buildNew(bSPTree1);
        polygonsSet0.getSize();
        polygonsSet0.getVertices();
        polygonsSet0.getBarycenter();
        // Undeclared exception!
        try {
            polygonsSet0.getVertices();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.math3.geometry.partitioning.BSPTree", e);
        }
    }

    @Test(timeout = 4000)
    public void test289() throws Throwable {
        double double0 = (-1591.66662191364);
        PolygonsSet polygonsSet0 = new PolygonsSet((-1591.66662191364), 0.0, (-1591.66662191364), 2609.623610342003);
        polygonsSet0.computeGeometricalProperties();
        Vector2D vector2D0 = Vector2D.ZERO;
        Line line0 = new Line(vector2D0, 2609.623610342003);
        SubLine subLine0 = line0.wholeHyperplane();
        BSPTree<Euclidean2D> bSPTree0 = polygonsSet0.getTree(true);
        bSPTree0.getParent();
        SubOrientedPoint subOrientedPoint0 = new SubOrientedPoint((Hyperplane<Euclidean1D>) null, (Region<Euclidean1D>) null);
        BSPTree<Euclidean2D> bSPTree1 = new BSPTree<Euclidean2D>(subLine0, (BSPTree<Euclidean2D>) null, bSPTree0, subOrientedPoint0);
        polygonsSet0.buildNew(bSPTree1);
        polygonsSet0.getSize();
        polygonsSet0.getVertices();
        polygonsSet0.getBarycenter();
        // Undeclared exception!
        try {
            polygonsSet0.getVertices();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }
}
