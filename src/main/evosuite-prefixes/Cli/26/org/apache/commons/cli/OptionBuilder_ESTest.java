/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 23:46:20 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class OptionBuilder_ESTest extends OptionBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.hasArgs(293);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Object object0 = new Object();
        OptionBuilder optionBuilder0 = OptionBuilder.withType(object0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.isRequired();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.withValueSeparator('4');
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.hasArg();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        OptionBuilder.withLongOpt("org.apache.commons.cli.OptionBuilder");
        Option option0 = OptionBuilder.create();
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.isRequired(false);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.withArgName("org.apache.commons.cli.OptionBuilder");
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.withValueSeparator();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.hasOptionalArg();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Option option0 = OptionBuilder.create('q');
        option0.getArgs();
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        Option option0 = OptionBuilder.create('q');
        option0.getId();
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.hasArgs();
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.hasOptionalArgs((-2));
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.hasOptionalArgs();
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.withDescription("org.apache.commons.cli.OptionBuilder");
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.hasArg(false);
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        OptionBuilder optionBuilder0 = OptionBuilder.hasArg(true);
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        OptionBuilder.create();
    }
}
