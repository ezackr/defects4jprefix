/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 21 17:52:57 GMT 2023
 */
package org.apache.commons.math.stat.descriptive;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.stat.descriptive.StatisticalSummary;
import org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic;
import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.apache.commons.math.stat.descriptive.moment.SecondMoment;
import org.apache.commons.math.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import org.apache.commons.math.stat.descriptive.summary.Product;
import org.apache.commons.math.stat.descriptive.summary.SumOfLogs;
import org.apache.commons.math.stat.descriptive.summary.SumOfSquares;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class SummaryStatistics_ESTest extends SummaryStatistics_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        String string0 = summaryStatistics0.toString();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = summaryStatistics0.copy();
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
        summaryStatistics1.getN();
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic0);
        summaryStatistics0.clear();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        StandardDeviation standardDeviation0 = new StandardDeviation(true);
        summaryStatistics0.setSumImpl(standardDeviation0);
        SummaryStatistics summaryStatistics1 = new SummaryStatistics();
        boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
        summaryStatistics1.getN();
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        StandardDeviation standardDeviation0 = new StandardDeviation(true);
        summaryStatistics0.setSumImpl(standardDeviation0);
        SummaryStatistics summaryStatistics1 = new SummaryStatistics();
        boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.hashCode();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.getSecondMoment();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
        summaryStatistics0.setSumLogImpl(storelessUnivariateStatistic0);
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.getSumLogImpl();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.addValue(0.0);
        boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
        summaryStatistics1.getN();
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.addValue(0.0);
        boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test0913() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.getSumImpl();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test1014() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        Product product0 = new Product();
        summaryStatistics0.setMaxImpl(product0);
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test1115() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        StatisticalSummary statisticalSummary0 = summaryStatistics0.getSummary();
        statisticalSummary0.getN();
    }

    @Test(timeout = 4000)
    public void test1216() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.getMinImpl();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test1317() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.getMaxImpl();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test1418() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.getMeanImpl();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.getPopulationVariance();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.addValue((-674.23487837027));
        double double0 = summaryStatistics0.getStandardDeviation();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test1621() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.addValue((-674.23487837027));
        double double0 = summaryStatistics0.getStandardDeviation();
    }

    @Test(timeout = 4000)
    public void test1722() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SecondMoment secondMoment0 = summaryStatistics0.secondMoment;
        Variance variance0 = new Variance(false, secondMoment0);
        summaryStatistics0.setMeanImpl(variance0);
        summaryStatistics0.addValue(0.0);
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test1823() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        Product product0 = new Product();
        summaryStatistics0.setVarianceImpl(product0);
        summaryStatistics0.addValue(Double.NaN);
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test1924() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        Product product0 = new Product();
        summaryStatistics0.setGeoMeanImpl(product0);
        summaryStatistics0.addValue(Double.NaN);
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test2025() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.addValue((-674.23487837027));
        summaryStatistics0.addValue(Double.NaN);
        double double0 = summaryStatistics0.getStandardDeviation();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.addValue((-674.23487837027));
        summaryStatistics0.addValue(Double.NaN);
        double double0 = summaryStatistics0.getStandardDeviation();
    }

    @Test(timeout = 4000)
    public void test2127() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.clear();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test2228() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic0);
        summaryStatistics0.clear();
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test2329() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics0);
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test2330() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test2431() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        Product product0 = new Product();
        boolean boolean0 = summaryStatistics0.equals(product0);
    }

    @Test(timeout = 4000)
    public void test2432() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        Product product0 = new Product();
        boolean boolean0 = summaryStatistics0.equals(product0);
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test2533() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.addValue((-1661.153641221));
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
        summaryStatistics1.getN();
    }

    @Test(timeout = 4000)
    public void test2534() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.addValue((-1661.153641221));
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
    }

    @Test(timeout = 4000)
    public void test2635() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.equals((Object) summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test2636() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        SumOfLogs sumOfLogs0 = new SumOfLogs();
        summaryStatistics1.setMeanImpl(sumOfLogs0);
        boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
        summaryStatistics1.equals((Object) summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test2637() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        SumOfLogs sumOfLogs0 = new SumOfLogs();
        summaryStatistics1.setMeanImpl(sumOfLogs0);
        boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test2738() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.equals((Object) summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test2739() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        SumOfLogs sumOfLogs0 = summaryStatistics1.sumLog;
        summaryStatistics1.setMinImpl(sumOfLogs0);
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
        summaryStatistics1.equals((Object) summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test2740() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        SumOfLogs sumOfLogs0 = summaryStatistics1.sumLog;
        summaryStatistics1.setMinImpl(sumOfLogs0);
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
    }

    @Test(timeout = 4000)
    public void test2841() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.n = (-1740L);
        SummaryStatistics summaryStatistics1 = new SummaryStatistics();
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
        summaryStatistics0.getN();
    }

    @Test(timeout = 4000)
    public void test2842() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.n = (-1740L);
        SummaryStatistics summaryStatistics1 = new SummaryStatistics();
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
    }

    @Test(timeout = 4000)
    public void test2943() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics();
        SecondMoment secondMoment0 = summaryStatistics1.secondMoment;
        Variance variance0 = new Variance(secondMoment0);
        summaryStatistics1.equals((Object) summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test2944() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics();
        SecondMoment secondMoment0 = summaryStatistics1.secondMoment;
        Variance variance0 = new Variance(secondMoment0);
        summaryStatistics1.setSumsqImpl(variance0);
        boolean boolean0 = summaryStatistics0.equals(summaryStatistics1);
    }

    @Test(timeout = 4000)
    public void test3045() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.equals((Object) summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test3046() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        SumOfSquares sumOfSquares0 = new SumOfSquares();
        summaryStatistics0.setVarianceImpl(sumOfSquares0);
        boolean boolean0 = summaryStatistics1.equals(summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test3147() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        summaryStatistics0.n = 1L;
        summaryStatistics0.setVarianceImpl((StorelessUnivariateStatistic) null);
    }

    @Test(timeout = 4000)
    public void test3248() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic0);
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.equals((Object) summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test3249() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
        summaryStatistics0.setVarianceImpl(storelessUnivariateStatistic0);
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.getN();
    }

    @Test(timeout = 4000)
    public void test3350() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic0);
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.getN();
    }

    @Test(timeout = 4000)
    public void test3351() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        StorelessUnivariateStatistic storelessUnivariateStatistic0 = summaryStatistics0.getSumsqImpl();
        summaryStatistics0.setMeanImpl(storelessUnivariateStatistic0);
        SummaryStatistics summaryStatistics1 = new SummaryStatistics(summaryStatistics0);
        summaryStatistics1.equals((Object) summaryStatistics0);
    }

    @Test(timeout = 4000)
    public void test3452() throws Throwable {
        SummaryStatistics summaryStatistics0 = new SummaryStatistics();
        SumOfLogs sumOfLogs0 = summaryStatistics0.sumLog;
        summaryStatistics0.setGeoMeanImpl(sumOfLogs0);
        SummaryStatistics.copy(summaryStatistics0, summaryStatistics0);
        summaryStatistics0.getN();
    }
}
