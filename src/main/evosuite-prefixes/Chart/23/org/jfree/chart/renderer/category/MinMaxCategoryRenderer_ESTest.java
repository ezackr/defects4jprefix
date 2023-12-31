/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 02:35:20 GMT 2023
 */
package org.jfree.chart.renderer.category;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.javax.swing.MockJFileChooser;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryAxis3D;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.PeriodAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.entity.EntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.CombinedDomainCategoryPlot;
import org.jfree.chart.plot.CombinedRangeCategoryPlot;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.renderer.category.BoxAndWhiskerRenderer;
import org.jfree.chart.renderer.category.CategoryItemRendererState;
import org.jfree.chart.renderer.category.MinMaxCategoryRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultIntervalCategoryDataset;
import org.jfree.data.general.DefaultKeyedValues2DDataset;
import org.jfree.data.time.FixedMillisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Second;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class MinMaxCategoryRenderer_ESTest extends MinMaxCategoryRenderer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        Color color0 = Color.MAGENTA;
        minMaxCategoryRenderer0.setGroupPaint(color0);
        Color color1 = (Color) minMaxCategoryRenderer0.getGroupPaint();
        minMaxCategoryRenderer0.isDrawLines();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        Color color0 = Color.MAGENTA;
        minMaxCategoryRenderer0.setGroupPaint(color0);
        Color color1 = (Color) minMaxCategoryRenderer0.getGroupPaint();
        color1.getRGB();
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("iS~");
        CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
        JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
        ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
        BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(93, 10, 2201.36027707, 1.0, chartRenderingInfo0);
        Graphics2D graphics2D0 = bufferedImage0.createGraphics();
        PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
        CategoryItemRendererState categoryItemRendererState0 = minMaxCategoryRenderer0.createState(plotRenderingInfo0);
        ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true);
        Rectangle rectangle0 = chartPanel0.getVisibleRect();
        PeriodAxis periodAxis0 = new PeriodAxis("ZOOM_DOMAIN_BOTH");
        minMaxCategoryRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle0, combinedDomainCategoryPlot0, categoryAxis3D0, periodAxis0, (CategoryDataset) null, 243, (-5042), 53);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        BoxAndWhiskerRenderer boxAndWhiskerRenderer0 = new BoxAndWhiskerRenderer();
        MockDate mockDate0 = (MockDate) DateAxis.DEFAULT_ANCHOR_DATE;
        FixedMillisecond fixedMillisecond0 = new FixedMillisecond(mockDate0);
        PeriodAxis periodAxis0 = new PeriodAxis("", fixedMillisecond0, fixedMillisecond0);
        CombinedRangeCategoryPlot combinedRangeCategoryPlot0 = new CombinedRangeCategoryPlot(periodAxis0);
        ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo();
        PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
        CategoryItemRendererState categoryItemRendererState0 = boxAndWhiskerRenderer0.initialise((Graphics2D) null, (Rectangle2D) null, combinedRangeCategoryPlot0, 10, plotRenderingInfo0);
        CategoryAxis categoryAxis0 = new CategoryAxis();
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
        minMaxCategoryRenderer0.drawItem((Graphics2D) null, categoryItemRendererState0, (Rectangle2D) null, combinedRangeCategoryPlot0, categoryAxis0, periodAxis0, defaultKeyedValues2DDataset0, 1, 1, 1);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D("iS~");
        CombinedDomainCategoryPlot combinedDomainCategoryPlot0 = new CombinedDomainCategoryPlot(categoryAxis3D0);
        JFreeChart jFreeChart0 = new JFreeChart(combinedDomainCategoryPlot0);
        ChartRenderingInfo chartRenderingInfo0 = new ChartRenderingInfo((EntityCollection) null);
        BufferedImage bufferedImage0 = jFreeChart0.createBufferedImage(10, 10, (double) 1.0F, (double) 10, chartRenderingInfo0);
        Graphics2D graphics2D0 = bufferedImage0.createGraphics();
        PlotRenderingInfo plotRenderingInfo0 = new PlotRenderingInfo(chartRenderingInfo0);
        CategoryItemRendererState categoryItemRendererState0 = minMaxCategoryRenderer0.createState(plotRenderingInfo0);
        ChartPanel chartPanel0 = new ChartPanel(jFreeChart0, true);
        Rectangle rectangle0 = chartPanel0.getVisibleRect();
        Minute minute0 = new Minute();
        Second second0 = new Second(600, minute0);
        PeriodAxis periodAxis0 = new PeriodAxis("l>V-^\"}P", second0, minute0);
        DefaultIntervalCategoryDataset defaultIntervalCategoryDataset0 = new DefaultIntervalCategoryDataset((Number[][]) null, (Number[][]) null);
        minMaxCategoryRenderer0.drawItem(graphics2D0, categoryItemRendererState0, rectangle0, combinedDomainCategoryPlot0, categoryAxis3D0, periodAxis0, defaultIntervalCategoryDataset0, 59, 680, 500);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        Rectangle2D.Double rectangle2D_Double0 = (Rectangle2D.Double) minMaxCategoryRenderer0.lookupSeriesShape(0);
        CategoryAxis3D categoryAxis3D0 = new CategoryAxis3D();
        CategoryPlot categoryPlot0 = new CategoryPlot();
        DefaultKeyedValues2DDataset defaultKeyedValues2DDataset0 = new DefaultKeyedValues2DDataset();
        minMaxCategoryRenderer0.drawItem((Graphics2D) null, (CategoryItemRendererState) null, rectangle2D_Double0, categoryPlot0, categoryAxis3D0, (ValueAxis) null, defaultKeyedValues2DDataset0, (-2470), 93, 658);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setMinIcon((Icon) null);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        MockFile mockFile0 = new MockFile("");
        MockJFileChooser mockJFileChooser0 = new MockJFileChooser(mockFile0);
        Icon icon0 = mockJFileChooser0.getIcon(mockFile0);
        minMaxCategoryRenderer0.setMinIcon(icon0);
        minMaxCategoryRenderer0.isDrawLines();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setMaxIcon((Icon) null);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        MockFile mockFile0 = new MockFile("");
        MockJFileChooser mockJFileChooser0 = new MockJFileChooser(mockFile0);
        Icon icon0 = mockJFileChooser0.getIcon(mockFile0);
        minMaxCategoryRenderer0.setMaxIcon(icon0);
        minMaxCategoryRenderer0.isDrawLines();
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setObjectIcon((Icon) null);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setGroupStroke((Stroke) null);
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        BasicStroke basicStroke0 = (BasicStroke) CategoryPlot.DEFAULT_GRIDLINE_STROKE;
        minMaxCategoryRenderer0.setGroupStroke(basicStroke0);
        minMaxCategoryRenderer0.isDrawLines();
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setGroupPaint((Paint) null);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.isDrawLines();
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setDrawLines(true);
        boolean boolean0 = minMaxCategoryRenderer0.isDrawLines();
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.setDrawLines(false);
        minMaxCategoryRenderer0.getBaseCreateEntities();
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        BasicStroke basicStroke0 = (BasicStroke) minMaxCategoryRenderer0.getGroupStroke();
        basicStroke0.getLineWidth();
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.getMaxIcon();
        minMaxCategoryRenderer0.isDrawLines();
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        boolean boolean0 = minMaxCategoryRenderer0.isDrawLines();
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        Icon icon0 = minMaxCategoryRenderer0.getObjectIcon();
        minMaxCategoryRenderer0.setObjectIcon(icon0);
        minMaxCategoryRenderer0.isDrawLines();
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        MinMaxCategoryRenderer minMaxCategoryRenderer0 = new MinMaxCategoryRenderer();
        minMaxCategoryRenderer0.getMinIcon();
        minMaxCategoryRenderer0.isDrawLines();
    }
}
