/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 21:49:29 GMT 2024
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CommandLine_ESTest extends CommandLine_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        boolean boolean0 = commandLine0.hasOption('t');
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option[] optionArray0 = commandLine0.getOptions();
        assertEquals(0, optionArray0.length);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Iterator iterator0 = commandLine0.iterator();
        assertNotNull(iterator0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String[] stringArray0 = commandLine0.getOptionValues('O');
        assertNull(stringArray0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue('\"');
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue('p', "NO_ARGS_ALLOWED");
        assertEquals("NO_ARGS_ALLOWED", string0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String string0 = commandLine0.getOptionValue('p', "NO_ARGS_ALLOWED");
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        List list0 = commandLine0.getArgList();
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Object object0 = commandLine0.getOptionObject('U');
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        String[] stringArray0 = commandLine0.getArgs();
        assertEquals(0, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        commandLine0.addArg("");
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("mvZl", true, (String) null);
        commandLine0.addOption(option0);
        boolean boolean0 = commandLine0.hasOption("mvZl");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        commandLine0.addOption(option0);
        Object object0 = commandLine0.getOptionObject("");
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.addValue("hA:a#%yP V$HK");
        commandLine0.addOption(option0);
        Object object0 = commandLine0.getOptionObject("");
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.setLongOpt("");
        commandLine0.addOption(option0);
        String string0 = commandLine0.getOptionValue("", "Strings must not be null");
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.setLongOpt("");
        commandLine0.addOption(option0);
        String string0 = commandLine0.getOptionValue("", "Strings must not be null");
        assertEquals("Strings must not be null", string0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option("", true, "");
        option0.addValue("hA:a#%yP V$HK");
        commandLine0.addOption(option0);
        String string0 = commandLine0.getOptionValue("", "Strings must not be null");
        assertEquals("hA:a#%yP V$HK", string0);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        CommandLine commandLine0 = new CommandLine();
        Option option0 = new Option((String) null, false, "");
        commandLine0.addOption(option0);
        assertFalse(option0.hasOptionalArg());
    }
}
