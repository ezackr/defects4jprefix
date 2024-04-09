/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 12:03:23 GMT 2024
 */
package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang3.RandomStringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class RandomStringUtils_ESTest extends RandomStringUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        String string0 = RandomStringUtils.randomAscii(1);
        assertEquals(" ", string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        char[] charArray0 = new char[1];
        // Undeclared exception!
        try {
            RandomStringUtils.random(32, 32, 1, true, false, charArray0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        // Undeclared exception!
        RandomStringUtils.randomAlphabetic(2814);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        // Undeclared exception!
        RandomStringUtils.randomAlphanumeric(389);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        String string0 = RandomStringUtils.random(0);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        // Undeclared exception!
        RandomStringUtils.randomNumeric(2443);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        RandomStringUtils randomStringUtils0 = new RandomStringUtils();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        // Undeclared exception!
        try {
            RandomStringUtils.random(1, "");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // The chars array must not be empty
            //
            verifyException("org.apache.commons.lang3.RandomStringUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        // Undeclared exception!
        RandomStringUtils.random(35358, "2%]1%\"-");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Random.setNextRandom(43);
        String string0 = RandomStringUtils.random(43, true, true);
        assertEquals("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK", string0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Random.setNextRandom(56320);
        MockRandom mockRandom0 = new MockRandom((-1L));
        String string0 = RandomStringUtils.random(29, 872, 4, false, true, (char[]) null, (java.util.Random) mockRandom0);
        assertEquals("\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668\u0668", string0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Random.setNextRandom((-1358));
        MockRandom mockRandom0 = new MockRandom(2283L);
        String string0 = RandomStringUtils.random(123, (-2067), (-1358), true, true, (char[]) null, (java.util.Random) mockRandom0);
        assertEquals("\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76\uFA76", string0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Random.setNextRandom(56320);
        // Undeclared exception!
        RandomStringUtils.random(985, false, false);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        MockRandom mockRandom0 = new MockRandom(43);
        // Undeclared exception!
        RandomStringUtils.random(56310, 55304, (-971), false, false, (char[]) null, (java.util.Random) mockRandom0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Random.setNextRandom(985);
        MockRandom mockRandom0 = new MockRandom(43);
        // Undeclared exception!
        RandomStringUtils.random(56320, 55296, (-959), false, false, (char[]) null, (java.util.Random) mockRandom0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        String string0 = RandomStringUtils.random(0, (String) null);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        // Undeclared exception!
        try {
            RandomStringUtils.random((-1020), (char[]) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Requested random string length -1020 is less than 0.
            //
            verifyException("org.apache.commons.lang3.RandomStringUtils", e);
        }
    }
}
