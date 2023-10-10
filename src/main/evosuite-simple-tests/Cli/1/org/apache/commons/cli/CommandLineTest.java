/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 19:35:47 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.junit.runner.RunWith;

public class CommandLineTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option((String) null, "W", true, ":Szu-YQDh");
        commandLine0.addOption(option0);
        boolean boolean0 = commandLine0.hasOption('W');
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        commandLine0.addOption(option0);
        Option[] optionArray0 = commandLine0.getOptions();
        assertEquals(1, optionArray0.length);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.addValue("");
        commandLine0.addOption(option0);
        String[] stringArray0 = commandLine0.getOptionValues("");
        assertEquals(1, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option(" ", true, "gN");
        option0.addValue((String) null);
        commandLine0.addOption(option0);
        String[] stringArray0 = commandLine0.getOptionValues(' ');
        assertEquals(1, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue(":B%6rbjUdu[5u7'?-", (String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.addValue("cJc,om$/?");
        commandLine0.addOption(option0);
        String string0 = commandLine0.getOptionValue("");
        assertEquals("cJc,om$/?", string0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue('@', (String) null);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue('\u0087', "s");
        assertEquals("s", string0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue('\u0087', "s");
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("s", true, "s");
        option0.addValue("s");
        commandLine0.addOption(option0);
        String string0 = commandLine0.getOptionValue('s');
        assertEquals("s", string0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.addValue("");
        commandLine0.addOption(option0);
        String string0 = commandLine0.getOptionValue('-');
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        commandLine0.addArg("~n@zOF3~)k");
        String[] stringArray0 = commandLine0.getArgs();
        assertEquals(1, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        commandLine0.addArg("");
        List list0 = commandLine0.getArgList();
        assertFalse(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        // Undeclared exception!
        try {
            commandLine0.getOptionValues((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        // Undeclared exception!
        try {
            commandLine0.getOptionValue((String) null, "yF'8FT#C;Sb^X");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        // Undeclared exception!
        try {
            commandLine0.getOptionValue((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        // Undeclared exception!
        try {
            commandLine0.getOptionObject((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.setType(option0);
        option0.addValue("");
        commandLine0.addOption(option0);
        // Undeclared exception!
        try {
            commandLine0.getOptionObject("");
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.apache.commons.cli.Option cannot be cast to java.lang.Class
        }
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        // Undeclared exception!
        try {
            commandLine0.addOption((Option) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue("", "");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("dtr", "org.apache.commons.cli.CommandLine", true, "dtr");
        commandLine0.addOption(option0);
        String[] stringArray0 = commandLine0.getOptionValues("org.apache.commons.cli.CommandLine");
        assertNull(stringArray0);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String[] stringArray0 = commandLine0.getOptionValues("");
        assertNull(stringArray0);
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.addValue("");
        commandLine0.addOption(option0);
        String string0 = commandLine0.getOptionValue("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue("cJc,om$/?");
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Object object0 = commandLine0.getOptionObject("org.apache.commons.cli.OptionValidator");
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        boolean boolean0 = commandLine0.hasOption("org.apache.commons.cli.OptionValidator");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option((String) null, false, (String) null);
        commandLine0.addOption(option0);
        assertFalse(option0.isRequired());
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.addValue("zOBm]RStlqfmT\"s");
        commandLine0.addOption(option0);
        String string0 = commandLine0.getOptionValue("", "[ option:   +ARG ::  ]");
        assertEquals("zOBm]RStlqfmT\"s", string0);
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.setLongOpt("");
        commandLine0.addOption(option0);
        Object object0 = commandLine0.getOptionObject("");
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        commandLine0.addOption(option0);
        boolean boolean0 = commandLine0.hasOption("");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String[] stringArray0 = commandLine0.getArgs();
        assertEquals(0, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Object object0 = commandLine0.getOptionObject('2');
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        List list0 = commandLine0.getArgList();
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3233() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue('a', "");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue('a', "");
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue('R');
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String[] stringArray0 = commandLine0.getOptionValues('2');
        assertNull(stringArray0);
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Iterator iterator0 = commandLine0.iterator();
        assertNotNull(iterator0);
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option[] optionArray0 = commandLine0.getOptions();
        assertEquals(0, optionArray0.length);
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        boolean boolean0 = commandLine0.hasOption('R');
        assertFalse(boolean0);
    }
}
