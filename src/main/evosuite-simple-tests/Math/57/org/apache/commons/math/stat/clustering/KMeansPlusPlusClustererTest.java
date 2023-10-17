/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 16:09:28 GMT 2023
 */
package org.apache.commons.math.stat.clustering;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.apache.commons.math.stat.clustering.Cluster;
import org.apache.commons.math.stat.clustering.EuclideanIntegerPoint;
import org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer;
import org.junit.runner.RunWith;

public class KMeansPlusPlusClustererTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
        int[] intArray0 = new int[4];
        EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
        Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
        List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
        EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray0);
        cluster0.addPoint(euclideanIntegerPoint1);
        cluster0.addPoint(euclideanIntegerPoint0);
        // Undeclared exception!
        try {
            kMeansPlusPlusClusterer0.cluster(list0, 1001, (-149));
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
        int[] intArray0 = new int[0];
        EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
        Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
        cluster0.addPoint(euclideanIntegerPoint0);
        List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
        cluster0.addPoint(euclideanIntegerPoint0);
        cluster0.addPoint(euclideanIntegerPoint0);
        // Undeclared exception!
        try {
            kMeansPlusPlusClusterer0.cluster(list0, 1312, 2);
            fail("Expecting exception: IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            //
            // Index: 0, Size: 0
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
        int[] intArray0 = new int[0];
        EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
        Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
        cluster0.addPoint(euclideanIntegerPoint0);
        List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
        cluster0.addPoint(euclideanIntegerPoint0);
        List<Cluster<EuclideanIntegerPoint>> list1 = kMeansPlusPlusClusterer0.cluster(list0, 2, 0);
        assertEquals(2, list1.size());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
        Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>((EuclideanIntegerPoint) null);
        cluster0.addPoint((EuclideanIntegerPoint) null);
        List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
        // Undeclared exception!
        try {
            kMeansPlusPlusClusterer0.cluster(list0, 0, 0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
        int[] intArray0 = new int[4];
        EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
        Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
        List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
        int[] intArray1 = new int[7];
        EuclideanIntegerPoint euclideanIntegerPoint1 = new EuclideanIntegerPoint(intArray1);
        cluster0.addPoint(euclideanIntegerPoint1);
        cluster0.addPoint(euclideanIntegerPoint0);
        // Undeclared exception!
        try {
            kMeansPlusPlusClusterer0.cluster(list0, 0, (-2568));
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        MockRandom mockRandom0 = new MockRandom();
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0);
        int[] intArray0 = new int[4];
        EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
        Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
        List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
        cluster0.addPoint(euclideanIntegerPoint0);
        List<Cluster<EuclideanIntegerPoint>> list1 = kMeansPlusPlusClusterer0.cluster(list0, 0, (-2568));
        assertFalse(list1.contains(cluster0));
    }

    @Test(timeout = 4000)
    public void test86() throws Throwable {
        MockRandom mockRandom0 = new MockRandom((-546L));
        KMeansPlusPlusClusterer.EmptyClusterStrategy kMeansPlusPlusClusterer_EmptyClusterStrategy0 = KMeansPlusPlusClusterer.EmptyClusterStrategy.ERROR;
        KMeansPlusPlusClusterer<EuclideanIntegerPoint> kMeansPlusPlusClusterer0 = new KMeansPlusPlusClusterer<EuclideanIntegerPoint>(mockRandom0, kMeansPlusPlusClusterer_EmptyClusterStrategy0);
        int[] intArray0 = new int[6];
        EuclideanIntegerPoint euclideanIntegerPoint0 = new EuclideanIntegerPoint(intArray0);
        Cluster<EuclideanIntegerPoint> cluster0 = new Cluster<EuclideanIntegerPoint>(euclideanIntegerPoint0);
        List<EuclideanIntegerPoint> list0 = cluster0.getPoints();
        // Undeclared exception!
        try {
            kMeansPlusPlusClusterer0.cluster(list0, (-850), 0);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }
}
