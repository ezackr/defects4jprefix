/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 06:14:44 GMT 2023
 */
package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.distribution.FDistribution;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class FDistribution_ESTest extends FDistribution_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(4.0, 4.0, 0.0);
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(4.0, 4.0, 0.0);
        double double0 = fDistribution0.sample();
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(4.0, 4.0, 0.0);
        double double0 = fDistribution0.sample();
        fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(4670.7025729, 4670.7025729, 4670.7025729);
        double double0 = fDistribution0.probability((-1534.45348030732), (-1534.45348030732));
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test014() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(4670.7025729, 4670.7025729, 4670.7025729);
        double double0 = fDistribution0.probability((-1534.45348030732), (-1534.45348030732));
    }

    @Test(timeout = 4000)
    public void test015() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(4670.7025729, 4670.7025729, 4670.7025729);
        double double0 = fDistribution0.probability((-1534.45348030732), (-1534.45348030732));
        fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test026() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2163.44333240904, 8.319947089683576E-278);
        double double0 = fDistribution0.density(1.681278956582695E-9);
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.7534012237555307E-252, 1136.7353534, 0.0);
        double double0 = fDistribution0.getSolverAbsoluteAccuracy();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test038() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.7534012237555307E-252, 1136.7353534, 0.0);
        double double0 = fDistribution0.getSolverAbsoluteAccuracy();
    }

    @Test(timeout = 4000)
    public void test039() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.7534012237555307E-252, 1136.7353534, 0.0);
        double double0 = fDistribution0.getSolverAbsoluteAccuracy();
        fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test0410() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5, 0.5, Double.POSITIVE_INFINITY);
        double double0 = fDistribution0.getSolverAbsoluteAccuracy();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test0411() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5, 0.5, Double.POSITIVE_INFINITY);
        double double0 = fDistribution0.getSolverAbsoluteAccuracy();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test0412() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5, 0.5, Double.POSITIVE_INFINITY);
        double double0 = fDistribution0.getSolverAbsoluteAccuracy();
    }

    @Test(timeout = 4000)
    public void test0513() throws Throwable {
        Well512a well512a0 = new Well512a();
        FDistribution fDistribution0 = new FDistribution(well512a0, 1.6455042362213135, 1.6455042362213135, (-1774.0));
        double double0 = fDistribution0.getSolverAbsoluteAccuracy();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test0514() throws Throwable {
        Well512a well512a0 = new Well512a();
        FDistribution fDistribution0 = new FDistribution(well512a0, 1.6455042362213135, 1.6455042362213135, (-1774.0));
        double double0 = fDistribution0.getSolverAbsoluteAccuracy();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test0515() throws Throwable {
        Well512a well512a0 = new Well512a();
        FDistribution fDistribution0 = new FDistribution(well512a0, 1.6455042362213135, 1.6455042362213135, (-1774.0));
        double double0 = fDistribution0.getSolverAbsoluteAccuracy();
    }

    @Test(timeout = 4000)
    public void test0616() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(3614.0, 3614.0, 3614.0);
        double double0 = fDistribution0.getNumericalVariance();
    }

    @Test(timeout = 4000)
    public void test0717() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(3614.0, 3614.0, 3614.0);
        double double0 = fDistribution0.density(3614.0);
    }

    @Test(timeout = 4000)
    public void test0818() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2163.44333240904, 8.319947089683576E-278);
        double double0 = fDistribution0.cumulativeProbability(8.319947089683576E-278);
    }

    @Test(timeout = 4000)
    public void test0919() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.71390848833098E-15, 1592.049052891426, 3158.098);
        double double0 = fDistribution0.calculateNumericalVariance();
    }

    @Test(timeout = 4000)
    public void test1020() throws Throwable {
        Well44497a well44497a0 = new Well44497a(0);
        FDistribution fDistribution0 = new FDistribution(well44497a0, 2602.553, 9.994400500679653E270, 0);
        fDistribution0.cumulativeProbability(2602.553);
    }

    @Test(timeout = 4000)
    public void test1121() throws Throwable {
        FDistribution fDistribution0 = null;
        fDistribution0 = new FDistribution((-368), (-368), (-368));
    }

    @Test(timeout = 4000)
    public void test1222() throws Throwable {
        int[] intArray0 = new int[9];
        Well512a well512a0 = new Well512a(intArray0);
        FDistribution fDistribution0 = new FDistribution(well512a0, 920, 1.0, 880.9);
        double double0 = fDistribution0.getNumericalMean();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test1223() throws Throwable {
        int[] intArray0 = new int[9];
        Well512a well512a0 = new Well512a(intArray0);
        FDistribution fDistribution0 = new FDistribution(well512a0, 920, 1.0, 880.9);
        double double0 = fDistribution0.getNumericalMean();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test1224() throws Throwable {
        int[] intArray0 = new int[9];
        Well512a well512a0 = new Well512a(intArray0);
        FDistribution fDistribution0 = new FDistribution(well512a0, 920, 1.0, 880.9);
        double double0 = fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test1325() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.71390848833098E-15, 1592.049052891426, 3158.098);
        double double0 = fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test1326() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.71390848833098E-15, 1592.049052891426, 3158.098);
        double double0 = fDistribution0.getNumericalMean();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test1427() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.0E-9, 1.0E-9, 3.8445667684706366E98);
        double double0 = fDistribution0.cumulativeProbability((double) 0L);
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test1428() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.0E-9, 1.0E-9, 3.8445667684706366E98);
        double double0 = fDistribution0.cumulativeProbability((double) 0L);
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test1429() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.0E-9, 1.0E-9, 3.8445667684706366E98);
        double double0 = fDistribution0.cumulativeProbability((double) 0L);
    }

    @Test(timeout = 4000)
    public void test1530() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.0E-9, 1.0E-9, 3.8445667684706366E98);
        double double0 = fDistribution0.cumulativeProbability(3.8445667684706366E98);
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test1531() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.0E-9, 1.0E-9, 3.8445667684706366E98);
        double double0 = fDistribution0.cumulativeProbability(3.8445667684706366E98);
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test1532() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.0E-9, 1.0E-9, 3.8445667684706366E98);
        double double0 = fDistribution0.cumulativeProbability(3.8445667684706366E98);
    }

    @Test(timeout = 4000)
    public void test1633() throws Throwable {
        Well512a well512a0 = new Well512a(1446L);
        FDistribution fDistribution0 = null;
        fDistribution0 = new FDistribution(well512a0, 1446L, 0.0, 0.0);
    }

    @Test(timeout = 4000)
    public void test1734() throws Throwable {
        Well44497a well44497a0 = new Well44497a(2030L);
        FDistribution fDistribution0 = null;
        fDistribution0 = new FDistribution(well44497a0, (-692.1503867), 809.6254254765303, 2030L);
    }

    @Test(timeout = 4000)
    public void test1835() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5, 0.5, Double.POSITIVE_INFINITY);
        boolean boolean0 = fDistribution0.isSupportConnected();
    }

    @Test(timeout = 4000)
    public void test1836() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5, 0.5, Double.POSITIVE_INFINITY);
        boolean boolean0 = fDistribution0.isSupportConnected();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test1837() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.5, 0.5, Double.POSITIVE_INFINITY);
        boolean boolean0 = fDistribution0.isSupportConnected();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test1938() throws Throwable {
        Well19937a well19937a0 = new Well19937a();
        FDistribution fDistribution0 = new FDistribution(well19937a0, 703.131, 0.03360854089260101, 0.0);
        double double0 = fDistribution0.getSupportUpperBound();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test1939() throws Throwable {
        Well19937a well19937a0 = new Well19937a();
        FDistribution fDistribution0 = new FDistribution(well19937a0, 703.131, 0.03360854089260101, 0.0);
        double double0 = fDistribution0.getSupportUpperBound();
    }

    @Test(timeout = 4000)
    public void test1940() throws Throwable {
        Well19937a well19937a0 = new Well19937a();
        FDistribution fDistribution0 = new FDistribution(well19937a0, 703.131, 0.03360854089260101, 0.0);
        double double0 = fDistribution0.getSupportUpperBound();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2041() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2163.44333240904, 8.319947089683576E-278);
        double double0 = fDistribution0.getDenominatorDegreesOfFreedom();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2042() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2163.44333240904, 8.319947089683576E-278);
        double double0 = fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2143() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.71390848833098E-15, 1592.049052891426, 3158.098);
        double double0 = fDistribution0.getSupportLowerBound();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2144() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.71390848833098E-15, 1592.049052891426, 3158.098);
        double double0 = fDistribution0.getSupportLowerBound();
    }

    @Test(timeout = 4000)
    public void test2145() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(1.71390848833098E-15, 1592.049052891426, 3158.098);
        double double0 = fDistribution0.getSupportLowerBound();
        fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test2246() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.680370569229126, 0.680370569229126, 414.35759550097157);
        double double0 = fDistribution0.getNumericalVariance();
        fDistribution0.getSupportUpperBound();
    }

    @Test(timeout = 4000)
    public void test2247() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.680370569229126, 0.680370569229126, 414.35759550097157);
        double double0 = fDistribution0.getNumericalVariance();
    }

    @Test(timeout = 4000)
    public void test2248() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.680370569229126, 0.680370569229126, 414.35759550097157);
        double double0 = fDistribution0.getNumericalVariance();
        double double1 = fDistribution0.inverseCumulativeProbability(0.17516371060289526);
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2249() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.680370569229126, 0.680370569229126, 414.35759550097157);
        double double0 = fDistribution0.getNumericalVariance();
        double double1 = fDistribution0.inverseCumulativeProbability(0.17516371060289526);
    }

    @Test(timeout = 4000)
    public void test2250() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.680370569229126, 0.680370569229126, 414.35759550097157);
        double double0 = fDistribution0.getNumericalVariance();
        double double1 = fDistribution0.inverseCumulativeProbability(0.17516371060289526);
        fDistribution0.isSupportConnected();
    }

    @Test(timeout = 4000)
    public void test2251() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.680370569229126, 0.680370569229126, 414.35759550097157);
        double double0 = fDistribution0.getNumericalVariance();
        double double1 = fDistribution0.inverseCumulativeProbability(0.17516371060289526);
        fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test2352() throws Throwable {
        FDistribution fDistribution0 = null;
        fDistribution0 = new FDistribution((-138.06673922534), (-138.06673922534));
    }

    @Test(timeout = 4000)
    public void test2453() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(4649.4633058815025, 4649.4633058815025, 4649.4633058815025);
        boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2454() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(4649.4633058815025, 4649.4633058815025, 4649.4633058815025);
        boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
        fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test2455() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(4649.4633058815025, 4649.4633058815025, 4649.4633058815025);
        boolean boolean0 = fDistribution0.isSupportLowerBoundInclusive();
    }

    @Test(timeout = 4000)
    public void test2556() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.680370569229126, 0.680370569229126, 414.35759550097157);
        boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2557() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.680370569229126, 0.680370569229126, 414.35759550097157);
        boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2558() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(0.680370569229126, 0.680370569229126, 414.35759550097157);
        boolean boolean0 = fDistribution0.isSupportUpperBoundInclusive();
    }

    @Test(timeout = 4000)
    public void test2659() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2.0, 2.0, 2.0);
        fDistribution0.getSupportUpperBound();
    }

    @Test(timeout = 4000)
    public void test2660() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2.0, 2.0, 2.0);
        double double0 = fDistribution0.sample();
    }

    @Test(timeout = 4000)
    public void test2661() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2.0, 2.0, 2.0);
        double double0 = fDistribution0.sample();
        double double1 = fDistribution0.getNumericalVariance();
        fDistribution0.getNumericalMean();
    }

    @Test(timeout = 4000)
    public void test2662() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2.0, 2.0, 2.0);
        double double0 = fDistribution0.sample();
        double double1 = fDistribution0.getNumericalVariance();
    }

    @Test(timeout = 4000)
    public void test2663() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2.0, 2.0, 2.0);
        double double0 = fDistribution0.sample();
        double double1 = fDistribution0.getNumericalVariance();
        fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2664() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2.0, 2.0, 2.0);
        double double0 = fDistribution0.sample();
        double double1 = fDistribution0.getNumericalVariance();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2665() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2.0, 2.0, 2.0);
        double double0 = fDistribution0.sample();
        double double1 = fDistribution0.getNumericalVariance();
        fDistribution0.isSupportConnected();
    }

    @Test(timeout = 4000)
    public void test2766() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2.0, 2.0, 2.0);
        double double0 = fDistribution0.getNumeratorDegreesOfFreedom();
    }

    @Test(timeout = 4000)
    public void test2767() throws Throwable {
        FDistribution fDistribution0 = new FDistribution(2.0, 2.0, 2.0);
        double double0 = fDistribution0.getNumeratorDegreesOfFreedom();
        fDistribution0.getDenominatorDegreesOfFreedom();
    }
}
