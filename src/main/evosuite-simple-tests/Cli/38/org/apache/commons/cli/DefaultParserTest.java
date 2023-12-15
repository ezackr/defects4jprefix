/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 15 00:18:25 GMT 2023
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
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addRequiredOption("1", "-1", true, "1");
        String[] stringArray0 = new String[8];
        stringArray0[0] = "-1";
        stringArray0[1] = "-1";
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "--";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
        assertNotNull(commandLine0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        properties0.put("(tM_M.-lD<", options0);
        try {
            defaultParser0.parse(options0, (String[]) null, properties0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Default option wasn't defined
        }
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addRequiredOption("", "", false, "");
        String[] stringArray0 = new String[0];
        try {
            defaultParser0.parse(options1, stringArray0);
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
        Options options1 = options0.addRequiredOption("1", "1", true, "-");
        String[] stringArray0 = new String[9];
        stringArray0[0] = "--1";
        stringArray0[1] = "-";
        stringArray0[2] = "1";
        stringArray0[3] = "1";
        stringArray0[4] = "--1";
        stringArray0[5] = "--1";
        try {
            defaultParser0.parse(options1, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Missing argument for option: 1
        }
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "-";
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0);
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
        Options options1 = options0.addRequiredOption("1", "-1", true, "1");
        String[] stringArray0 = new String[8];
        stringArray0[0] = "-1";
        stringArray0[1] = "1";
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

    @Test(timeout = 4000)
    public void test108() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addRequiredOption("1", "1", true, "--1");
        String[] stringArray0 = new String[4];
        stringArray0[0] = "--1";
        stringArray0[1] = "---6=";
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

    @Test(timeout = 4000)
    public void test119() throws Throwable {
        Options options0 = new Options();
        String[] stringArray0 = new String[3];
        stringArray0[0] = "-6=";
        DefaultParser defaultParser0 = new DefaultParser();
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -6=
        }
    }

    @Test(timeout = 4000)
    public void test1210() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-----G6=";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -----G6=
        }
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "--1";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: --1
        }
    }

    @Test(timeout = 4000)
    public void test1412() throws Throwable {
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
    public void test1513() throws Throwable {
        Options options0 = new Options();
        DefaultParser defaultParser0 = new DefaultParser();
        String[] stringArray0 = new String[5];
        stringArray0[0] = "^u";
        stringArray0[1] = "^u";
        stringArray0[2] = "-^u8&#Q$Gsl:Mp:";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -^u8&#Q$Gsl:Mp:
        }
    }

    @Test(timeout = 4000)
    public void test1614() throws Throwable {
        Options options0 = new Options();
        options0.addRequiredOption("1", "^u", true, "^u");
        DefaultParser defaultParser0 = new DefaultParser();
        String[] stringArray0 = new String[5];
        stringArray0[0] = "^u";
        stringArray0[1] = "^u";
        stringArray0[2] = "-^u8&#Q$Gsl:Mp:";
        // Undeclared exception!
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test1715() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "-B6A)w='9";
        try {
            defaultParser0.parse(options0, stringArray0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Unrecognized option: -B6A)w='9
        }
    }
}
