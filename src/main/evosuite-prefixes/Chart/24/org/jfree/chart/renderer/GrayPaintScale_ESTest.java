/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 02:36:38 GMT 2023
 */
package org.jfree.chart.renderer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Color;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jfree.chart.renderer.GrayPaintScale;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class GrayPaintScale_ESTest extends GrayPaintScale_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 255.0);
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 255.0);
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
        grayPaintScale1.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 255.0);
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
        grayPaintScale0.equals((Object) grayPaintScale1);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1479.849912401), (-1062.40207109));
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1479.849912401), (-1062.40207109));
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
        grayPaintScale1.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test025() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(177.0, 1937.46546);
        grayPaintScale0.getPaint(0.0);
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1227.8371), 0.0);
        double double0 = grayPaintScale0.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1227.8371), 0.0);
        double double0 = grayPaintScale0.getUpperBound();
        grayPaintScale0.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1479.849912401), (-1062.40207109));
        double double0 = grayPaintScale0.getUpperBound();
        grayPaintScale0.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test049() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1479.849912401), (-1062.40207109));
        double double0 = grayPaintScale0.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test0510() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        grayPaintScale0.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test0511() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        Color color0 = (Color) grayPaintScale0.getPaint(2908.0);
        grayPaintScale0.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test0512() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        Color color0 = (Color) grayPaintScale0.getPaint(2908.0);
        color0.getBlue();
    }

    @Test(timeout = 4000)
    public void test0613() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale();
        double double0 = grayPaintScale0.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test0614() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale();
        double double0 = grayPaintScale0.getLowerBound();
        grayPaintScale0.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test0715() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1479.849912401), (-1062.40207109));
        double double0 = grayPaintScale0.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test0716() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale((-1479.849912401), (-1062.40207109));
        double double0 = grayPaintScale0.getLowerBound();
        grayPaintScale0.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test0817() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 255.0);
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
        grayPaintScale1.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test0818() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 255.0);
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
    }

    @Test(timeout = 4000)
    public void test0819() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 255.0);
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
        grayPaintScale1.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test0820() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(0.0, 255.0);
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
        grayPaintScale1.equals((Object) grayPaintScale0);
    }

    @Test(timeout = 4000)
    public void test0921() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        Object object0 = new Object();
        boolean boolean0 = grayPaintScale0.equals(object0);
    }

    @Test(timeout = 4000)
    public void test0922() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        Object object0 = new Object();
        boolean boolean0 = grayPaintScale0.equals(object0);
        grayPaintScale0.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test0923() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        Object object0 = new Object();
        boolean boolean0 = grayPaintScale0.equals(object0);
        grayPaintScale0.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test1024() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale0);
    }

    @Test(timeout = 4000)
    public void test1025() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale0);
        grayPaintScale0.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test1026() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale0);
        grayPaintScale0.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test1127() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
        grayPaintScale1.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test1128() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
        grayPaintScale1.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test1129() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        GrayPaintScale grayPaintScale1 = new GrayPaintScale();
        boolean boolean0 = grayPaintScale0.equals(grayPaintScale1);
    }

    @Test(timeout = 4000)
    public void test1230() throws Throwable {
        GrayPaintScale grayPaintScale0 = null;
        grayPaintScale0 = new GrayPaintScale(0.0, (-1.0));
    }

    @Test(timeout = 4000)
    public void test1331() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        double double0 = grayPaintScale0.getUpperBound();
        grayPaintScale0.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test1332() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        double double0 = grayPaintScale0.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test1433() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        GrayPaintScale grayPaintScale1 = (GrayPaintScale) grayPaintScale0.clone();
        boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
    }

    @Test(timeout = 4000)
    public void test1434() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        GrayPaintScale grayPaintScale1 = (GrayPaintScale) grayPaintScale0.clone();
        boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
        grayPaintScale1.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test1435() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        GrayPaintScale grayPaintScale1 = (GrayPaintScale) grayPaintScale0.clone();
        boolean boolean0 = grayPaintScale1.equals(grayPaintScale0);
        grayPaintScale1.getUpperBound();
    }

    @Test(timeout = 4000)
    public void test1536() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        double double0 = grayPaintScale0.getLowerBound();
    }

    @Test(timeout = 4000)
    public void test1537() throws Throwable {
        GrayPaintScale grayPaintScale0 = new GrayPaintScale(562.6361001936054, 2908.0);
        double double0 = grayPaintScale0.getLowerBound();
        grayPaintScale0.getUpperBound();
    }
}
