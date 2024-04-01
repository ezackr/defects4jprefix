/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 00:56:01 GMT 2023
 */
package org.mockito.internal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.util.Timer;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Timer_ESTest extends Timer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Timer timer0 = new Timer((-1147L));
        timer0.start();
        boolean boolean0 = timer0.isCounting();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Timer timer0 = new Timer((-1147L));
        timer0.isCounting();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Timer timer0 = new Timer(1588L);
        timer0.start();
        boolean boolean0 = timer0.isCounting();
    }
}
