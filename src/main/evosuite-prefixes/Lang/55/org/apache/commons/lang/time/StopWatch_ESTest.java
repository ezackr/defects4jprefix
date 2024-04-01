/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 04:01:56 GMT 2023
 */
package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.time.StopWatch;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class StopWatch_ESTest extends StopWatch_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        String string0 = stopWatch0.toString();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.resume();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.start();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        System.setCurrentTimeMillis((-503L));
        long long0 = stopWatch0.getTime();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long0 = stopWatch0.getSplitTime();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        long long0 = stopWatch0.getSplitTime();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.getSplitTime();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        long long0 = stopWatch0.getTime();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        long long0 = stopWatch0.getTime();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        long long0 = stopWatch0.getTime();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        stopWatch0.suspend();
        long long0 = stopWatch0.getTime();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        stopWatch0.split();
        String string0 = stopWatch0.toSplitString();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.resume();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.suspend();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.unsplit();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.split();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.stop();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.stop();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.start();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.toSplitString();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        StopWatch stopWatch0 = new StopWatch();
        stopWatch0.reset();
    }
}
