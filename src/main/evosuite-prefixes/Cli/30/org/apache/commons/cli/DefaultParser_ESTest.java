/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 23:51:54 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Properties;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DefaultParser_ESTest extends DefaultParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addOption("o", true, "-o");
        String[] stringArray0 = new String[2];
        stringArray0[0] = "-o";
        stringArray0[1] = "-o";
        defaultParser0.parse(options1, stringArray0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        CommandLine commandLine0 = defaultParser0.parse(options0, (String[]) null, properties0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Option option0 = new Option("o", true, "o");
        options0.addOption(option0);
        String[] stringArray0 = new String[3];
        stringArray0[0] = "o";
        stringArray0[1] = "o";
        stringArray0[2] = "-org.apach.common].cli.Co}mandLine";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        properties0.put("o", options0);
        defaultParser0.parse(options0, (String[]) null, properties0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        OptionGroup optionGroup0 = new OptionGroup();
        optionGroup0.setRequired(true);
        Options options1 = options0.addOptionGroup(optionGroup0);
        String[] stringArray0 = new String[0];
        defaultParser0.parse(options1, stringArray0, true);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "--";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addOption("o", true, "-o");
        String[] stringArray0 = new String[2];
        stringArray0[0] = "-o";
        stringArray0[1] = "o";
        CommandLine commandLine0 = defaultParser0.parse(options1, stringArray0);
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addOption("o", true, "o");
        String[] stringArray0 = new String[6];
        stringArray0[0] = "-o";
        stringArray0[1] = "-";
        stringArray0[2] = "--Rx|v,K'-G3+v7c-7";
        defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addOption("o", "o", true, "o");
        String[] stringArray0 = new String[2];
        stringArray0[0] = "-o";
        stringArray0[1] = "-o";
        defaultParser0.parse(options1, stringArray0);
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addOption("o", true, "H");
        String[] stringArray0 = new String[4];
        stringArray0[0] = "-o";
        stringArray0[1] = "--t<=E";
        defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[11];
        stringArray0[0] = "----=Fi!(0";
        defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test1412() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addOption("o", "---", false, "---");
        String[] stringArray0 = new String[2];
        stringArray0[0] = "---";
        defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test1513() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addOption("", "---", false, "---");
        options0.addOption("yes", "-: ", false, "---");
        String[] stringArray0 = new String[4];
        stringArray0[0] = "---";
        defaultParser0.parse(options1, stringArray0);
    }

    @Test(timeout = 4000)
    public void test1614() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "-1";
        defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test1715() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[3];
        stringArray0[0] = "t";
        stringArray0[1] = "-t=";
        defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addOption("true", false, "-true");
        String[] stringArray0 = new String[4];
        stringArray0[0] = "";
        stringArray0[1] = "o";
        stringArray0[2] = "-true";
        defaultParser0.parse(options1, stringArray0);
    }

    @Test(timeout = 4000)
    public void test1917() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Option option0 = new Option("o", true, "o");
        option0.setArgs((-2));
        options0.addOption(option0);
        String[] stringArray0 = new String[3];
        stringArray0[0] = "o";
        stringArray0[1] = "o";
        stringArray0[2] = "-org.apach.common].cli.Co}mandLine";
        CommandLine commandLine0 = defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test2018() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-[O<N60=+P[%tV{X";
        defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test2119() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        Options options1 = options0.addOption("t", true, "-t=");
        String[] stringArray0 = new String[3];
        stringArray0[0] = "t";
        stringArray0[1] = "-t=";
        defaultParser0.parse(options1, stringArray0);
    }

    @Test(timeout = 4000)
    public void test2220() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        options0.addOption("t", false, "-t=");
        String[] stringArray0 = new String[17];
        stringArray0[0] = "-t=";
        defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test2321() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[5];
        stringArray0[0] = "-org.apache.commons.cli.Option";
        Option option0 = new Option("o", true, stringArray0[1]);
        option0.setArgs(174);
        OptionGroup optionGroup0 = new OptionGroup();
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        options0.addOptionGroup(optionGroup1);
        defaultParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test2622() throws Throwable {
        DefaultParser defaultParser0 = new DefaultParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-org.apach4.ommons.zli.AlreadySelectedExcepion";
        defaultParser0.parse(options0, stringArray0);
    }
}
