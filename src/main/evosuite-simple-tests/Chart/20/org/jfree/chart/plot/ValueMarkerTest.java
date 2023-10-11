/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 02:30:46 GMT 2023
 */
package org.jfree.chart.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.SystemColor;
import javax.swing.DebugGraphics;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.MeterPlot;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.junit.runner.RunWith;

public class ValueMarkerTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ValueMarker valueMarker0 = new ValueMarker(1.0);
        ValueMarker valueMarker1 = new ValueMarker(1.0);
        valueMarker1.setValue(0.0);
        boolean boolean0 = valueMarker1.equals(valueMarker0);
        assertEquals(0.0, valueMarker1.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        ValueMarker valueMarker0 = new ValueMarker(1.0);
        ValueMarker valueMarker1 = new ValueMarker(1.0);
        valueMarker1.setValue(0.0);
        boolean boolean0 = valueMarker1.equals(valueMarker0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        SystemColor systemColor0 = SystemColor.inactiveCaption;
        BasicStroke basicStroke0 = (BasicStroke) CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        ValueMarker valueMarker0 = new ValueMarker(0.0, systemColor0, basicStroke0);
        double double0 = valueMarker0.getValue();
        assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        ValueMarker valueMarker0 = new ValueMarker(0.0);
        valueMarker0.setValue((-1106.7787));
        double double0 = valueMarker0.getValue();
        assertEquals((-1106.7787), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        DefaultPolarItemRenderer defaultPolarItemRenderer0 = new DefaultPolarItemRenderer();
        Paint paint0 = defaultPolarItemRenderer0.getBaseFillPaint();
        ValueMarker valueMarker0 = null;
        try {
            valueMarker0 = new ValueMarker(0.0, paint0, defaultPolarItemRenderer0.DEFAULT_OUTLINE_STROKE, paint0, defaultPolarItemRenderer0.DEFAULT_OUTLINE_STROKE, (-1776.85F));
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The 'alpha' value must be in the range 0.0f to 1.0f
        }
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        ValueMarker valueMarker0 = null;
        try {
            valueMarker0 = new ValueMarker((-1626.14402239), (Paint) null, (Stroke) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Null 'paint' argument.
        }
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        MeterPlot meterPlot0 = new MeterPlot();
        Paint paint0 = meterPlot0.getNeedlePaint();
        CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
        Stroke stroke0 = categoryAxis3D0.getAxisLineStroke();
        ValueMarker valueMarker0 = new ValueMarker(2676.8241894489, paint0, meterPlot0.DEFAULT_OUTLINE_STROKE, meterPlot0.DEFAULT_OUTLINE_PAINT, stroke0, 1.0F);
        assertEquals(2676.8241894489, valueMarker0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
        Color color0 = DebugGraphics.flashColor();
        ValueMarker valueMarker0 = new ValueMarker(24.7464796430402, color0, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_STROKE);
        ValueMarker valueMarker1 = (ValueMarker) valueMarker0.clone();
        boolean boolean0 = valueMarker0.equals(valueMarker1);
        assertEquals(24.7464796430402, valueMarker1.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
        Color color0 = DebugGraphics.flashColor();
        ValueMarker valueMarker0 = new ValueMarker(24.7464796430402, color0, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_STROKE);
        ValueMarker valueMarker1 = (ValueMarker) valueMarker0.clone();
        boolean boolean0 = valueMarker0.equals(valueMarker1);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
        Color color0 = DebugGraphics.flashColor();
        ValueMarker valueMarker0 = new ValueMarker(24.7464796430402, color0, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_STROKE);
        boolean boolean0 = valueMarker0.equals(valueMarker0);
        assertEquals(24.7464796430402, valueMarker0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
        Color color0 = DebugGraphics.flashColor();
        ValueMarker valueMarker0 = new ValueMarker(24.7464796430402, color0, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_STROKE);
        boolean boolean0 = valueMarker0.equals(valueMarker0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
        Color color0 = DebugGraphics.flashColor();
        ValueMarker valueMarker0 = new ValueMarker(24.7464796430402, color0, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_STROKE);
        boolean boolean0 = valueMarker0.equals(combinedDomainXYPlot0);
        assertEquals(24.7464796430402, valueMarker0.getValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
        Color color0 = DebugGraphics.flashColor();
        ValueMarker valueMarker0 = new ValueMarker(24.7464796430402, color0, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_STROKE);
        boolean boolean0 = valueMarker0.equals(combinedDomainXYPlot0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        CombinedDomainXYPlot combinedDomainXYPlot0 = new CombinedDomainXYPlot();
        Color color0 = DebugGraphics.flashColor();
        ValueMarker valueMarker0 = new ValueMarker(24.7464796430402, color0, combinedDomainXYPlot0.DEFAULT_CROSSHAIR_STROKE);
        double double0 = valueMarker0.getValue();
        assertEquals(24.7464796430402, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        ValueMarker valueMarker0 = new ValueMarker(5395.852723956839);
        ValueMarker valueMarker1 = new ValueMarker(114.0630740598788);
        boolean boolean0 = valueMarker0.equals(valueMarker1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1015() throws Throwable {
        ValueMarker valueMarker0 = new ValueMarker(5395.852723956839);
        ValueMarker valueMarker1 = new ValueMarker(114.0630740598788);
        boolean boolean0 = valueMarker0.equals(valueMarker1);
        assertFalse(valueMarker1.equals((Object) valueMarker0));
    }

    @Test(timeout = 4000)
    public void test1016() throws Throwable {
        ValueMarker valueMarker0 = new ValueMarker(5395.852723956839);
        ValueMarker valueMarker1 = new ValueMarker(114.0630740598788);
        boolean boolean0 = valueMarker0.equals(valueMarker1);
        assertEquals(114.0630740598788, valueMarker1.getValue(), 0.01);
    }
}
