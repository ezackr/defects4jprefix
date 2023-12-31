/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 05:52:03 GMT 2023
 */
package org.apache.commons.math3.random;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.random.ISAACRandom;
import org.apache.commons.math3.random.MersenneTwister;
import org.apache.commons.math3.random.Well1024a;
import org.apache.commons.math3.random.Well19937a;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.random.Well44497a;
import org.apache.commons.math3.random.Well44497b;
import org.apache.commons.math3.random.Well512a;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class BitsStreamGenerator_ESTest extends BitsStreamGenerator_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MersenneTwister mersenneTwister0 = new MersenneTwister();
        mersenneTwister0.nextInt(0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Well19937a well19937a0 = new Well19937a();
        byte[] byteArray0 = new byte[6];
        well19937a0.nextBytes(byteArray0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        int[] intArray0 = new int[3];
        ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
        byte[] byteArray0 = new byte[3];
        iSAACRandom0.nextBytes(byteArray0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        int[] intArray0 = new int[0];
        ISAACRandom iSAACRandom0 = new ISAACRandom(intArray0);
        iSAACRandom0.setSeed(intArray0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        int[] intArray0 = new int[20];
        Well512a well512a0 = new Well512a(intArray0);
        long long0 = well512a0.nextLong();
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        Well19937a well19937a0 = new Well19937a();
        long long0 = well19937a0.nextLong();
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        Well44497b well44497b0 = new Well44497b(1284L);
        long long0 = well44497b0.nextLong();
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        Well44497b well44497b0 = new Well44497b(1284L);
        long long0 = well44497b0.nextLong();
        int int0 = well44497b0.nextInt();
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        MersenneTwister mersenneTwister0 = new MersenneTwister((-734));
        int[] intArray0 = new int[0];
        mersenneTwister0.setSeed(intArray0);
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        Well512a well512a0 = new Well512a((int[]) null);
        well512a0.index = 32;
        well512a0.nextLong();
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        Well44497b well44497b0 = new Well44497b(1345365059);
        well44497b0.index = 1345365059;
        well44497b0.nextInt(3491);
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        Well44497a well44497a0 = new Well44497a();
        well44497a0.index = 3638;
        well44497a0.nextInt();
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        Well44497b well44497b0 = new Well44497b(4607182418800017428L);
        well44497b0.index = 4704;
        well44497b0.nextGaussian();
    }

    @Test(timeout = 4000)
    public void test1413() throws Throwable {
        Well44497a well44497a0 = new Well44497a((-1122L));
        well44497a0.index = 3593;
        well44497a0.nextFloat();
    }

    @Test(timeout = 4000)
    public void test1514() throws Throwable {
        int[] intArray0 = new int[1];
        Well512a well512a0 = new Well512a(intArray0);
        well512a0.index = 1330;
        well512a0.nextDouble();
    }

    @Test(timeout = 4000)
    public void test1615() throws Throwable {
        Well44497b well44497b0 = new Well44497b();
        well44497b0.nextBytes((byte[]) null);
    }

    @Test(timeout = 4000)
    public void test1716() throws Throwable {
        Well19937c well19937c0 = new Well19937c(1547);
        well19937c0.index = (-254);
        byte[] byteArray0 = new byte[1];
        well19937c0.nextBytes(byteArray0);
    }

    @Test(timeout = 4000)
    public void test1817() throws Throwable {
        Well19937a well19937a0 = new Well19937a(0L);
        well19937a0.index = 353;
        well19937a0.index = 1303;
        well19937a0.nextBoolean();
    }

    @Test(timeout = 4000)
    public void test2018() throws Throwable {
        MersenneTwister mersenneTwister0 = new MersenneTwister();
        int int0 = mersenneTwister0.nextInt(1);
    }

    @Test(timeout = 4000)
    public void test2119() throws Throwable {
        Well44497b well44497b0 = new Well44497b(1345365059);
        int int0 = well44497b0.nextInt(3491);
    }

    @Test(timeout = 4000)
    public void test2220() throws Throwable {
        Well44497b well44497b0 = new Well44497b();
        well44497b0.nextInt((int) (byte) (-8));
    }

    @Test(timeout = 4000)
    public void test2321() throws Throwable {
        MersenneTwister mersenneTwister0 = new MersenneTwister();
        double double0 = mersenneTwister0.nextGaussian();
    }

    @Test(timeout = 4000)
    public void test2322() throws Throwable {
        MersenneTwister mersenneTwister0 = new MersenneTwister();
        double double0 = mersenneTwister0.nextGaussian();
        double double1 = mersenneTwister0.nextGaussian();
    }

    @Test(timeout = 4000)
    public void test2423() throws Throwable {
        Well44497b well44497b0 = new Well44497b(0L);
        byte[] byteArray0 = new byte[5];
        well44497b0.nextBytes(byteArray0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Well44497b well44497b0 = new Well44497b(0L);
        byte[] byteArray0 = new byte[5];
        well44497b0.nextBytes(byteArray0);
        long long0 = well44497b0.nextLong();
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        Well44497b well44497b0 = new Well44497b(0L);
        byte[] byteArray0 = new byte[5];
        well44497b0.nextBytes(byteArray0);
        long long0 = well44497b0.nextLong();
        boolean boolean0 = well44497b0.nextBoolean();
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        Well44497b well44497b0 = new Well44497b(0L);
        boolean boolean0 = well44497b0.nextBoolean();
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        MersenneTwister mersenneTwister0 = new MersenneTwister((-734));
        float float0 = mersenneTwister0.nextFloat();
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        MersenneTwister mersenneTwister0 = new MersenneTwister();
        int int0 = mersenneTwister0.nextInt();
    }

    @Test(timeout = 4000)
    public void test2729() throws Throwable {
        MersenneTwister mersenneTwister0 = new MersenneTwister();
        int int0 = mersenneTwister0.nextInt();
        int int1 = mersenneTwister0.nextInt(1140807170);
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        MersenneTwister mersenneTwister0 = new MersenneTwister((-734));
        double double0 = mersenneTwister0.nextDouble();
    }
}
