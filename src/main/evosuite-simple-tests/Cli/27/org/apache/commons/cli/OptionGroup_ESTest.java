/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 23:46:27 GMT 2023
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
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        optionGroup0.setRequired(true);
        assertTrue(optionGroup0.isRequired());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Collection collection0 = optionGroup0.getNames();
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        optionGroup0.setSelected((Option) null);
        assertNull(optionGroup0.getSelected());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("Q8", false, "Q8");
        optionGroup0.setSelected(option0);
        optionGroup0.setSelected(option0);
        assertEquals(81, option0.getId());
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("l7to", "maXvo'PF");
        optionGroup0.setSelected(option0);
        Option option1 = new Option("", false, "The option '");
        try {
            optionGroup0.setSelected(option1);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // The option '' was specified but an option from this group has already been selected: 'l7to'
            //
            verifyException("org.apache.commons.cli.OptionGroup", e);
        }
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option((String) null, true, "org.apache.commons.cli.Option");
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        Option option1 = new Option("", false, "illegal option value '");
        optionGroup1.addOption(option1);
        String string0 = optionGroup1.toString();
        assertEquals("[--null org.apache.commons.cli.Option, - illegal option value ']", string0);
    }
}
