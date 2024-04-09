/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Apr 05 21:36:43 GMT 2024
 */

package org.jfree.chart.plot;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ValueMarker_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jfree.chart.plot.ValueMarker"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/Users/elliottzackrone/IdeaProjects/defects4jprefix"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/vv/c7q6vm8920vc7d5p_87011w40000gn/T/"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ValueMarker_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Year",
      "org.jfree.chart.LegendItemSource",
      "org.jfree.data.time.SerialDate",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.util.GradientPaintTransformer",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.axis.AxisState",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.data.time.Hour",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.general.DatasetChangeListener",
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.axis.AxisSpace",
      "org.jfree.chart.entity.AxisLabelEntity",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.axis.TickUnitSource",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.chart.util.PublicCloneable",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.data.time.Day",
      "org.jfree.chart.entity.ChartEntity",
      "org.jfree.data.time.MonthConstants",
      "org.jfree.chart.event.MarkerChangeListener",
      "org.jfree.chart.event.AxisChangeListener",
      "org.jfree.data.Range",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.chart.util.PaintUtilities"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ValueMarker_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jfree.chart.plot.Marker",
      "org.jfree.chart.plot.ValueMarker",
      "org.jfree.chart.util.RectangleAnchor",
      "org.jfree.chart.util.UnitType",
      "org.jfree.chart.util.RectangleInsets",
      "org.jfree.chart.util.LengthAdjustmentType",
      "org.jfree.chart.text.TextAnchor",
      "org.jfree.chart.event.ChartChangeEvent",
      "org.jfree.chart.event.MarkerChangeEvent",
      "org.jfree.chart.event.ChartChangeEventType",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Week",
      "org.jfree.chart.axis.Axis",
      "org.jfree.data.Range",
      "org.jfree.chart.axis.ValueAxis",
      "org.jfree.chart.axis.PeriodAxis",
      "org.jfree.data.time.Year",
      "org.jfree.data.time.Quarter",
      "org.jfree.data.time.Month",
      "org.jfree.data.time.Day",
      "org.jfree.data.time.Hour",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Millisecond",
      "org.jfree.chart.axis.PeriodAxisLabelInfo",
      "org.jfree.chart.ChartColor",
      "org.jfree.chart.plot.DefaultDrawingSupplier",
      "org.jfree.chart.renderer.AbstractRenderer",
      "org.jfree.chart.renderer.category.AbstractCategoryItemRenderer",
      "org.jfree.chart.renderer.category.AreaRenderer",
      "org.jfree.chart.renderer.category.StackedAreaRenderer",
      "org.jfree.chart.util.AbstractObjectList",
      "org.jfree.chart.util.BooleanList",
      "org.jfree.chart.util.PaintList",
      "org.jfree.chart.util.StrokeList",
      "org.jfree.chart.util.ShapeList",
      "org.jfree.chart.util.ObjectList",
      "org.jfree.chart.labels.ItemLabelPosition",
      "org.jfree.chart.labels.ItemLabelAnchor",
      "org.jfree.chart.labels.StandardCategorySeriesLabelGenerator",
      "org.jfree.chart.renderer.AreaRendererEndType",
      "org.jfree.chart.event.RendererChangeEvent",
      "org.jfree.chart.plot.CategoryMarker",
      "org.jfree.chart.plot.Plot",
      "org.jfree.chart.plot.PiePlot",
      "org.jfree.chart.plot.RingPlot",
      "org.jfree.chart.event.PlotChangeEvent",
      "org.jfree.chart.util.Rotation",
      "org.jfree.chart.PaintMap",
      "org.jfree.chart.StrokeMap",
      "org.jfree.chart.labels.AbstractPieItemLabelGenerator",
      "org.jfree.chart.labels.StandardPieSectionLabelGenerator",
      "org.jfree.chart.plot.AbstractPieLabelDistributor",
      "org.jfree.chart.plot.PieLabelDistributor",
      "org.jfree.chart.plot.CompassPlot",
      "org.jfree.chart.needle.MeterNeedle",
      "org.jfree.chart.needle.ArrowNeedle",
      "org.jfree.chart.plot.FastScatterPlot",
      "org.jfree.chart.renderer.xy.AbstractXYItemRenderer",
      "org.jfree.chart.renderer.xy.CandlestickRenderer",
      "org.jfree.chart.labels.HighLowItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYSeriesLabelGenerator",
      "org.jfree.chart.plot.CategoryPlot",
      "org.jfree.chart.plot.CombinedDomainCategoryPlot",
      "org.jfree.chart.axis.CategoryAxis",
      "org.jfree.chart.event.AxisChangeEvent",
      "org.jfree.chart.axis.CategoryLabelPosition",
      "org.jfree.chart.text.TextBlockAnchor",
      "org.jfree.chart.axis.CategoryLabelWidthType",
      "org.jfree.chart.axis.CategoryLabelPositions",
      "org.jfree.chart.plot.DatasetRenderingOrder",
      "org.jfree.chart.util.SortOrder",
      "org.jfree.chart.plot.PlotOrientation",
      "org.jfree.chart.axis.AxisLocation",
      "org.jfree.data.general.DatasetChangeEvent",
      "org.jfree.chart.axis.CategoryAnchor",
      "org.jfree.chart.util.Layer",
      "org.jfree.chart.axis.TickUnit",
      "org.jfree.chart.axis.NumberTickUnit",
      "org.jfree.chart.axis.NumberAxis",
      "org.jfree.chart.axis.CyclicNumberAxis",
      "org.jfree.chart.axis.TickUnits",
      "org.jfree.data.RangeType",
      "org.jfree.chart.axis.LogAxis",
      "org.jfree.chart.renderer.DefaultPolarItemRenderer",
      "org.jfree.chart.plot.PolarPlot",
      "org.jfree.chart.block.BorderArrangement",
      "org.jfree.chart.renderer.category.LineAndShapeRenderer",
      "org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer",
      "org.jfree.chart.block.AbstractBlock",
      "org.jfree.chart.util.RectangleEdge",
      "org.jfree.chart.util.HorizontalAlignment",
      "org.jfree.chart.util.VerticalAlignment",
      "org.jfree.chart.title.Title",
      "org.jfree.chart.title.LegendTitle",
      "org.jfree.chart.block.FlowArrangement",
      "org.jfree.chart.block.ColumnArrangement",
      "org.jfree.chart.block.BlockBorder",
      "org.jfree.chart.block.BlockContainer",
      "org.jfree.chart.plot.PiePlot3D",
      "org.jfree.data.time.SerialDate",
      "org.jfree.data.time.SpreadsheetDate",
      "org.jfree.chart.plot.SpiderWebPlot",
      "org.jfree.chart.util.TableOrder",
      "org.jfree.chart.labels.AbstractCategoryItemLabelGenerator",
      "org.jfree.chart.labels.StandardCategoryItemLabelGenerator",
      "org.jfree.chart.axis.LogarithmicAxis",
      "org.jfree.chart.plot.XYPlot",
      "org.jfree.chart.plot.CombinedDomainXYPlot",
      "org.jfree.chart.plot.SeriesRenderingOrder",
      "org.jfree.chart.renderer.WaferMapRenderer",
      "org.jfree.chart.annotations.TextAnnotation",
      "org.jfree.chart.annotations.CategoryTextAnnotation",
      "org.jfree.chart.annotations.CategoryPointerAnnotation",
      "org.jfree.chart.renderer.category.BarRenderer",
      "org.jfree.chart.renderer.category.StatisticalBarRenderer",
      "org.jfree.chart.util.StandardGradientPaintTransformer",
      "org.jfree.chart.util.GradientPaintTransformType",
      "org.jfree.data.general.AbstractDataset",
      "org.jfree.data.general.DefaultValueDataset",
      "org.jfree.data.general.DatasetGroup",
      "org.jfree.chart.labels.AbstractXYItemLabelGenerator",
      "org.jfree.chart.labels.StandardXYToolTipGenerator",
      "org.jfree.chart.renderer.xy.XYAreaRenderer",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer",
      "org.jfree.chart.axis.ModuloAxis",
      "org.jfree.chart.ui.Library",
      "org.jfree.chart.ui.BasicProjectInfo",
      "org.jfree.chart.ui.ProjectInfo",
      "org.jfree.chart.JFreeChartInfo",
      "org.jfree.chart.resources.JFreeChartResources",
      "org.jfree.chart.ui.Licences",
      "org.jfree.chart.ui.Contributor",
      "org.jfree.chart.JFreeChart",
      "org.jfree.chart.block.LineBorder",
      "org.jfree.chart.event.TitleChangeEvent",
      "org.jfree.chart.title.TextTitle",
      "org.jfree.chart.plot.WaferMapPlot",
      "org.jfree.chart.axis.StandardTickUnitSource",
      "org.jfree.chart.axis.SymbolAxis",
      "org.jfree.chart.renderer.xy.XYLineAndShapeRenderer",
      "org.jfree.chart.renderer.xy.XYLine3DRenderer",
      "org.jfree.data.category.DefaultCategoryDataset",
      "org.jfree.data.jdbc.JDBCCategoryDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.jfree.data.general.DefaultPieDataset",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.chart.plot.MultiplePiePlot",
      "org.jfree.chart.axis.ExtendedCategoryAxis",
      "org.jfree.chart.renderer.category.BoxAndWhiskerRenderer",
      "org.jfree.chart.labels.SymbolicXYItemLabelGenerator",
      "org.jfree.chart.util.PaintUtilities",
      "org.jfree.chart.util.ObjectUtilities",
      "org.jfree.chart.labels.StandardXYZToolTipGenerator",
      "org.jfree.chart.renderer.category.IntervalBarRenderer",
      "org.jfree.chart.renderer.category.GanttRenderer",
      "org.jfree.data.general.DefaultKeyedValuesDataset",
      "org.jfree.data.jdbc.JDBCPieDataset",
      "org.jfree.data.general.AbstractSeriesDataset",
      "org.jfree.data.gantt.TaskSeriesCollection",
      "org.jfree.data.xy.AbstractXYDataset",
      "org.jfree.data.xy.AbstractIntervalXYDataset",
      "org.jfree.data.statistics.SimpleHistogramDataset",
      "org.jfree.chart.renderer.category.BarRenderer3D",
      "org.jfree.data.statistics.DefaultStatisticalCategoryDataset",
      "org.jfree.data.KeyedObjects2D",
      "org.jfree.data.general.DatasetUtilities",
      "org.jfree.chart.needle.WindNeedle",
      "org.jfree.data.general.DefaultKeyedValues2DDataset",
      "org.jfree.data.xy.XYDatasetTableModel",
      "org.jfree.chart.renderer.category.LineRenderer3D",
      "org.jfree.chart.plot.ThermometerPlot",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$1",
      "org.jfree.chart.renderer.category.MinMaxCategoryRenderer$2",
      "org.jfree.chart.annotations.AbstractXYAnnotation",
      "org.jfree.chart.annotations.XYTextAnnotation",
      "org.jfree.chart.annotations.XYPointerAnnotation",
      "org.jfree.data.xy.XYSeriesCollection",
      "org.jfree.data.xy.IntervalXYDelegate",
      "org.jfree.chart.axis.NumberAxis3D",
      "org.jfree.chart.axis.Tick",
      "org.jfree.chart.axis.ValueTick",
      "org.jfree.chart.axis.NumberTick",
      "org.jfree.chart.axis.TickType",
      "org.jfree.data.xy.DefaultTableXYDataset",
      "org.jfree.data.category.CategoryToPieDataset",
      "org.jfree.data.time.TimeTableXYDataset",
      "org.jfree.data.time.TimePeriodAnchor",
      "org.jfree.chart.text.TextFragment",
      "org.jfree.data.jdbc.JDBCXYDataset",
      "org.jfree.chart.renderer.xy.XYBlockRenderer",
      "org.jfree.chart.renderer.LookupPaintScale",
      "org.jfree.data.category.DefaultIntervalCategoryDataset",
      "org.jfree.chart.plot.IntervalMarker",
      "org.jfree.data.DataUtilities",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.xy.XIntervalSeriesCollection",
      "org.jfree.chart.renderer.xy.HighLowRenderer",
      "org.jfree.chart.block.LabelBlock",
      "org.jfree.chart.axis.CategoryAxis3D",
      "org.jfree.chart.ChartRenderingInfo",
      "org.jfree.chart.entity.StandardEntityCollection",
      "org.jfree.chart.plot.PlotRenderingInfo",
      "org.jfree.chart.labels.MultipleXYSeriesLabelGenerator",
      "org.jfree.chart.urls.StandardXYURLGenerator",
      "org.jfree.data.statistics.HistogramDataset",
      "org.jfree.data.statistics.HistogramType",
      "org.jfree.chart.renderer.xy.XYErrorRenderer",
      "org.jfree.chart.plot.MeterPlot",
      "org.jfree.chart.ChartPanel",
      "org.jfree.chart.PolarChartPanel",
      "org.jfree.data.xy.CategoryTableXYDataset",
      "org.jfree.chart.labels.BoxAndWhiskerXYToolTipGenerator",
      "org.jfree.chart.axis.SegmentedTimeline",
      "org.jfree.data.xy.DefaultWindDataset",
      "org.jfree.chart.renderer.xy.XYBoxAndWhiskerRenderer",
      "org.jfree.data.xy.DefaultXYDataset",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerXYDataset",
      "org.jfree.data.time.DateRange",
      "org.jfree.chart.axis.DateTickUnit",
      "org.jfree.chart.axis.DateAxis$DefaultTimeline",
      "org.jfree.chart.axis.DateAxis",
      "org.jfree.chart.axis.DateTickMarkPosition",
      "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset",
      "org.jfree.chart.urls.CustomXYURLGenerator",
      "org.jfree.chart.renderer.xy.XYAreaRenderer2",
      "org.jfree.chart.renderer.xy.StackedXYAreaRenderer2",
      "org.jfree.chart.plot.CombinedRangeCategoryPlot",
      "org.jfree.data.time.FixedMillisecond",
      "org.jfree.chart.LegendItemCollection",
      "org.jfree.chart.renderer.GrayPaintScale",
      "org.jfree.chart.title.PaintScaleLegend",
      "org.jfree.chart.annotations.XYPolygonAnnotation",
      "org.jfree.chart.renderer.xy.YIntervalRenderer",
      "org.jfree.chart.plot.DialShape",
      "org.jfree.chart.text.TextBox",
      "org.jfree.chart.axis.SubCategoryAxis",
      "org.jfree.data.general.Series",
      "org.jfree.data.ComparableObjectSeries",
      "org.jfree.data.xy.XYIntervalSeries",
      "org.jfree.data.general.WaferMapDataset",
      "org.jfree.chart.renderer.category.StackedBarRenderer3D",
      "org.jfree.chart.renderer.category.CategoryStepRenderer",
      "org.jfree.data.gantt.Task",
      "org.jfree.data.time.SimpleTimePeriod",
      "org.jfree.chart.plot.CrosshairState",
      "org.jfree.data.time.DynamicTimeSeriesCollection",
      "org.jfree.chart.plot.CombinedRangeXYPlot",
      "org.jfree.data.xy.OHLCDataItem",
      "org.jfree.data.UnknownKeyException",
      "org.jfree.chart.renderer.xy.StandardXYItemRenderer",
      "org.jfree.chart.renderer.xy.CyclicXYItemRenderer",
      "org.jfree.chart.text.TextBlock",
      "org.jfree.chart.text.TextLine",
      "org.jfree.chart.renderer.xy.WindItemRenderer",
      "org.jfree.chart.needle.PointerNeedle",
      "org.jfree.data.time.TimeSeriesCollection",
      "org.jfree.chart.axis.SegmentedTimeline$Segment",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.chart.annotations.CategoryLineAnnotation"
    );
  }
}
