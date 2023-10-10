/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 21:04:28 GMT 2023
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
    public void test020() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "--,/#m/K=()0b@J?p";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, (Properties) null, true);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test031() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[9];
        stringArray0[0] = "--IZ`r{x!";
        Properties properties0 = new Properties();
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test053() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[7];
        stringArray0[0] = "";
        stringArray0[1] = "";
        stringArray0[2] = "";
        stringArray0[3] = "";
        stringArray0[4] = "";
        stringArray0[5] = "";
        stringArray0[6] = "";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addRequiredOption((String) null, "", true, "");
        String[] stringArray0 = new String[7];
        stringArray0[0] = "";
        try {
            defaultParser0.parse(options0, stringArray0, true);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Missing required option:
        }
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[5];
        stringArray0[0] = "";
        Properties properties0 = new Properties();
        properties0.put(defaultParser0, "");
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0, properties0, true);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // org.apache.commons.cli.DefaultParser cannot be cast to java.lang.String
        }
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[5];
        Properties properties0 = new Properties();
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0, properties0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[7];
        stringArray0[0] = "<";
        stringArray0[1] = "F\"oaX";
        stringArray0[2] = "3HW'twJ^u";
        stringArray0[3] = "5G scdi_52";
        stringArray0[4] = "5G$^m#k-%\"_GN*$m";
        stringArray0[5] = "";
        stringArray0[6] = "";
        Properties properties0 = new Properties();
        Object object0 = new Object();
        properties0.put(object0, "Ambiguous option: '");
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0, properties0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // java.lang.Object cannot be cast to java.lang.String
        }
    }

    @Test(timeout = 4000)
    public void test108() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "K(D2";
        stringArray0[1] = "$@-b{lOi^*LWMIDsA,";
        defaultParser0.parse(options0, stringArray0, false);
        try {
            defaultParser0.handleConcatenatedOptions("-N");
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -N
        }
    }

    @Test(timeout = 4000)
    public void test119() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        // Undeclared exception!
        try {
            defaultParser0.handleConcatenatedOptions("$O!cK K`1]");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1210() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Option option0 = new Option("", true, "");
        OptionGroup optionGroup0 = new OptionGroup();
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        Options options1 = options0.addOptionGroup(optionGroup1);
        String[] stringArray0 = new String[5];
        Properties properties0 = new Properties();
        // Undeclared exception!
        try {
            defaultParser0.parse(options1, stringArray0, properties0, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[7];
        stringArray0[0] = "-UB@H[_zi,` oDd";
        Properties properties0 = new Properties();
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test1512() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[6];
        stringArray0[0] = "org.apache.commons.cli.MissingOptionException";
        stringArray0[1] = "N";
        stringArray0[2] = "org.apache.commons.cli.MissingOptionException";
        stringArray0[3] = "N";
        stringArray0[4] = "-UB@H[_zi,` oDd";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -UB@H[_zi,` oDd
        }
    }

    @Test(timeout = 4000)
    public void test1613() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-',/#m/K=()0&@J?p";
        Properties properties0 = new Properties();
        try {
            defaultParser0.parse(options0, stringArray0, properties0, false);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -',/#m/K=()0&@J?p
        }
    }

    @Test(timeout = 4000)
    public void test1714() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[5];
        stringArray0[0] = "-U";
        Properties properties0 = new Properties();
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, true);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test1815() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[6];
        stringArray0[0] = "0v\"$:";
        stringArray0[1] = "-";
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test1916() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[8];
        stringArray0[0] = "has already been selected: '";
        stringArray0[1] = "T#L>@[z{Cr8j";
        stringArray0[2] = "";
        stringArray0[3] = "' was specified but an option from this group ";
        stringArray0[4] = "--";
        Properties properties0 = new Properties();
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0, properties0, false);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test2017() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[7];
        stringArray0[0] = "0v\"$:";
        stringArray0[1] = "3 \"lO9`{fT5;]mW;#l";
        stringArray0[2] = "%Cq!qF6djRplPt260";
        stringArray0[3] = "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ";
        stringArray0[4] = ",/#m/K=()0b@J?p";
        stringArray0[5] = "Exception found converting ";
        stringArray0[6] = "`r5gFQ*`m1";
        Properties properties0 = new Properties();
        properties0.put("3 \"lO9`{fT5;]mW;#l", "%Cq!qF6djRplPt260");
        try {
            defaultParser0.parse(options0, stringArray0, properties0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Default option wasn't defined
        }
    }

    @Test(timeout = 4000)
    public void test2118() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0, true);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test2219() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[8];
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("N", false, "--A5Dbi1");
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        Options options1 = options0.addOptionGroup(optionGroup1);
        // Undeclared exception!
        try {
            defaultParser0.parse(options1, stringArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }
}
