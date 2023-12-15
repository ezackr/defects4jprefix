/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 15 00:15:43 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.runner.RunWith;

public class DefaultParserTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addOption("1", true, "1");
        String[] stringArray0 = new String[3];
        stringArray0[0] = "-1";
        stringArray0[1] = "-1";
        // Undeclared exception!
        try {
            defaultParser0.parse(options1, stringArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-1e1";
        Properties properties0 = new Properties();
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        properties0.put("", options0);
        try {
            defaultParser0.parse(options0, (String[]) null, properties0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Default option wasn't defined
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addRequiredOption("1", "1", true, "1");
        String[] stringArray0 = new String[0];
        try {
            defaultParser0.parse(options1, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Missing required option: 1
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addRequiredOption("1", "1", true, "1");
        String[] stringArray0 = new String[3];
        stringArray0[0] = "--1";
        stringArray0[1] = "--1";
        try {
            defaultParser0.parse(options1, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Missing argument for option: 1
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "--1";
        Properties properties0 = new Properties();
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[3];
        stringArray0[0] = "--";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "-";
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addRequiredOption("1", "1", true, "1");
        String[] stringArray0 = new String[3];
        stringArray0[0] = "1";
        stringArray0[1] = "--1";
        stringArray0[2] = "-";
        CommandLine commandLine0 = defaultParser0.parse(options1, stringArray0);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addRequiredOption("1", "1", true, "1");
        String[] stringArray0 = new String[2];
        stringArray0[0] = "--1";
        stringArray0[1] = "1";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addRequiredOption("1", "1", true, "1");
        String[] stringArray0 = new String[2];
        stringArray0[0] = "--1";
        stringArray0[1] = "--o=.8F?tc";
        CommandLine commandLine0 = defaultParser0.parse(options1, stringArray0);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addRequiredOption("1", "1", true, "1");
        String[] stringArray0 = new String[1];
        stringArray0[0] = "--=xN1";
        CommandLine commandLine0 = defaultParser0.parse(options1, stringArray0);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addRequiredOption("1", "1", true, "1");
        options0.addRequiredOption("1", "--=xN1", true, "--=xN1");
        String[] stringArray0 = new String[1];
        stringArray0[0] = "--=xN1";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Ambiguous option: '--'  (could be: '1', '--=xN1')
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addRequiredOption("", "", false, "");
        String[] stringArray0 = new String[8];
        stringArray0[0] = "--=xN1";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: --=xN1
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-\"";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -\"
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "-M=>7Qd/3";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -M=>7Qd/3
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addRequiredOption("11", "11", true, "11");
        String[] stringArray0 = new String[10];
        stringArray0[0] = "-11";
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addRequiredOption("De", "De", false, "Default option wasn't defined");
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-Default option wasn't defined";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -Default option wasn't defined
        }
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addRequiredOption("De", "De", true, "-Default option wasn't defined");
        String[] stringArray0 = new String[6];
        stringArray0[0] = "-Default option wasn't defined";
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "-M$?f=D79BF@d/3J";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -M$?f=D79BF@d/3J
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addOption("1", "1");
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-1e1";
        Properties properties0 = new Properties();
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("1", "1", true, "1");
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        options0.addOptionGroup(optionGroup1);
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-11";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("1", "1", true, "1");
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        optionGroup1.setRequired(true);
        options0.addOptionGroup(optionGroup1);
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-11";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addOption("1", "1");
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-11";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
        assertNotNull(commandLine0);
    }
}
