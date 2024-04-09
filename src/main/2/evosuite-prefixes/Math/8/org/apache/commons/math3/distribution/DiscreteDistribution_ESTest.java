/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 17:42:58 GMT 2024
 */
package org.apache.commons.math3.distribution;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.math3.distribution.DiscreteDistribution;
import org.apache.commons.math3.util.Pair;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DiscreteDistribution_ESTest extends DiscreteDistribution_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Byte byte0 = new Byte((byte) 54);
        Double double0 = new Double((byte) 54);
        Pair<Object, Double> pair0 = new Pair<Object, Double>(byte0, double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(linkedList0);
        discreteDistribution0.reseedRandomGenerator((byte) 54);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Double double0 = new Double((-1191.5));
        Pair<Object, Double> pair0 = new Pair<Object, Double>(double0, double0);
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        linkedList0.add(pair0);
        DiscreteDistribution<Object> discreteDistribution0 = null;
        discreteDistribution0 = new DiscreteDistribution<Object>(linkedList0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
        Double double0 = new Double(6.283185307179586);
        Pair<String, Double> pair0 = new Pair<String, Double>("*", double0);
        linkedList0.offer(pair0);
        DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>(linkedList0);
        double double1 = discreteDistribution0.probability((String) null);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
        Double double0 = new Double(6.283185307179586);
        Pair<String, Double> pair0 = new Pair<String, Double>("ixc)q*qbxxm", double0);
        linkedList0.offer(pair0);
        DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>(linkedList0);
        double double1 = discreteDistribution0.probability("ixc)q*qbxxm");
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
        Double double0 = new Double(6.2831853071796);
        Pair<String, Double> pair0 = new Pair<String, Double>((String) null, double0);
        linkedList0.offer(pair0);
        DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>(linkedList0);
        double double1 = discreteDistribution0.probability((String) null);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
        Double double0 = new Double(6.283185307179586);
        Pair<String, Double> pair0 = new Pair<String, Double>((String) null, double0);
        linkedList0.offer(pair0);
        DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>(linkedList0);
        double double1 = discreteDistribution0.probability("");
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        LinkedList<Pair<String, Double>> linkedList0 = new LinkedList<Pair<String, Double>>();
        Double double0 = new Double(6.283185307179586);
        Pair<String, Double> pair0 = new Pair<String, Double>("*", double0);
        linkedList0.offer(pair0);
        DiscreteDistribution<String> discreteDistribution0 = new DiscreteDistribution<String>(linkedList0);
        List<Pair<String, Double>> list0 = discreteDistribution0.getSamples();
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        Double double0 = new Double(407);
        Pair<Object, Double> pair0 = new Pair<Object, Double>(double0, double0);
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        linkedList0.add(pair0);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(linkedList0);
        Object[] objectArray0 = discreteDistribution0.sample(407);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        Double double0 = new Double(407);
        Pair<Object, Double> pair0 = new Pair<Object, Double>(double0, double0);
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        linkedList0.add(pair0);
        linkedList0.add(pair0);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(linkedList0);
        Object object0 = discreteDistribution0.sample();
    }

    @Test(timeout = 4000)
    public void test99() throws Throwable {
        LinkedList<Pair<Object, Double>> linkedList0 = new LinkedList<Pair<Object, Double>>();
        Double double0 = new Double(466.44608452672);
        Pair<Object, Double> pair0 = new Pair<Object, Double>(linkedList0, double0);
        linkedList0.add(pair0);
        DiscreteDistribution<Object> discreteDistribution0 = new DiscreteDistribution<Object>(linkedList0);
        discreteDistribution0.sample((-335));
    }
}
