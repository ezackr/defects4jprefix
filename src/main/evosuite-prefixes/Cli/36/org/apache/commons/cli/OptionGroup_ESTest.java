/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 15 00:12:56 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class OptionGroup_ESTest extends OptionGroup_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        boolean boolean0 = optionGroup0.isRequired();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        optionGroup0.setRequired(false);
        optionGroup0.isRequired();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Collection<String> collection0 = optionGroup0.getNames();
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("W", "", false, "W");
        optionGroup0.setSelected(option0);
        Option option1 = new Option("", (String) null);
        optionGroup0.setSelected(option1);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        optionGroup0.setSelected((Option) null);
        optionGroup0.getSelected();
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("", "", true, (String) null);
        optionGroup0.setSelected(option0);
        optionGroup0.setSelected(option0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option((String) null, "org.apache.commons.cli.OptionGroup");
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        String string0 = optionGroup1.toString();
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("", (String) null);
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        String string0 = optionGroup1.toString();
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("Db0KDf", "", true, "Db0KDf");
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        Option option1 = new Option("", "", true, "Db0KDf");
        OptionGroup optionGroup2 = optionGroup1.addOption(option1);
        String string0 = optionGroup2.toString();
    }
}
