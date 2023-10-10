/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 21:01:52 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.junit.runner.RunWith;

public class OptionGroupTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        optionGroup0.setRequired(true);
        boolean boolean0 = optionGroup0.isRequired();
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("g$85vk", false, "org.apache.commons.cli.AlreadySelectedException");
        optionGroup0.setSelected(option0);
        String string0 = optionGroup0.getSelected();
        assertEquals("g$85vk", string0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("", "");
        optionGroup0.setSelected(option0);
        String string0 = optionGroup0.getSelected();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("", false, "");
        optionGroup0.setRequired(true);
        optionGroup0.addOption(option0);
        assertTrue(optionGroup0.isRequired());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        // Undeclared exception!
        try {
            optionGroup0.addOption((Option) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Collection<Option> collection0 = optionGroup0.getOptions();
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option((String) null, "!%}DVdcR:K~]", false, "!%}DVdcR:K~]");
        optionGroup0.addOption(option0);
        Option option1 = new Option((String) null, (String) null);
        OptionGroup optionGroup1 = optionGroup0.addOption(option1);
        String string0 = optionGroup1.toString();
        assertEquals("[--null, --!%}DVdcR:K~] !%}DVdcR:K~]]", string0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("g$85vk", false, "org.apache.commons.cli.AlreadySelectedException");
        optionGroup0.addOption(option0);
        String string0 = optionGroup0.toString();
        assertEquals("[-g$85vk org.apache.commons.cli.AlreadySelectedException]", string0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("l", "l");
        optionGroup0.setSelected(option0);
        Option option1 = new Option("m", "m");
        try {
            optionGroup0.setSelected(option1);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // The option 'm' was specified but an option from this group has already been selected: 'l'
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        optionGroup0.setSelected((Option) null);
        assertFalse(optionGroup0.isRequired());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("l", "l");
        optionGroup0.setSelected(option0);
        optionGroup0.setSelected(option0);
        assertFalse(option0.hasOptionalArg());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        String string0 = optionGroup0.getSelected();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        Collection<String> collection0 = optionGroup0.getNames();
        assertNotNull(collection0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        OptionGroup optionGroup0 = new OptionGroup();
        boolean boolean0 = optionGroup0.isRequired();
        assertFalse(boolean0);
    }
}
