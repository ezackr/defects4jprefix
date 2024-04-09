/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 23:02:32 GMT 2024
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Properties;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Parser_ESTest extends Parser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        GnuParser gnuParser0 = new GnuParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        gnuParser0.parse(options0, stringArray0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BasicParser basicParser0 = new BasicParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        CommandLine commandLine0 = basicParser0.parse(options0, (String[]) null, properties0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BasicParser basicParser0 = new BasicParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("c", "c");
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        options0.addOptionGroup(optionGroup1);
        CommandLine commandLine0 = basicParser0.parse(options0, (String[]) null, properties0, false);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BasicParser basicParser0 = new BasicParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "--";
        CommandLine commandLine0 = basicParser0.parse(options0, stringArray0, properties0, true);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        BasicParser basicParser0 = new BasicParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        String[] stringArray0 = new String[9];
        stringArray0[0] = "-";
        CommandLine commandLine0 = basicParser0.parse(options0, stringArray0, properties0, true);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        BasicParser basicParser0 = new BasicParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        String[] stringArray0 = new String[9];
        stringArray0[0] = "-";
        basicParser0.parse(options0, stringArray0, properties0, false);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Options options0 = new Options();
        String[] stringArray0 = new String[7];
        stringArray0[0] = "-1";
        BasicParser basicParser0 = new BasicParser();
        Properties properties0 = new Properties();
        CommandLine commandLine0 = basicParser0.parse(options0, stringArray0, properties0, true);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        BasicParser basicParser0 = new BasicParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-*";
        basicParser0.parse(options0, stringArray0, properties0, false);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Options options0 = new Options();
        Options options1 = options0.addOption("1", "1", false, "1");
        String[] stringArray0 = new String[7];
        stringArray0[0] = "-1";
        BasicParser basicParser0 = new BasicParser();
        Properties properties0 = new Properties();
        basicParser0.parse(options1, stringArray0, properties0, true);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        BasicParser basicParser0 = new BasicParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        String[] stringArray0 = new String[5];
        stringArray0[0] = "c-*";
        basicParser0.parse(options0, stringArray0, properties0, false);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Options options0 = new Options();
        BasicParser basicParser0 = new BasicParser();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "6C}Ls&G#*_d]3GS l";
        stringArray0[1] = "--";
        Properties properties0 = new Properties();
        CommandLine commandLine0 = basicParser0.parse(options0, stringArray0, properties0, true);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        BasicParser basicParser0 = new BasicParser();
        Options options0 = new Options();
        Properties properties0 = new Properties();
        properties0.setProperty("Taud", "Taud");
        basicParser0.parse(options0, (String[]) null, properties0, false);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        BasicParser basicParser0 = new BasicParser();
        Options options0 = new Options();
        OptionGroup optionGroup0 = new OptionGroup();
        optionGroup0.setRequired(true);
        Options options1 = options0.addOptionGroup(optionGroup0);
        String[] stringArray0 = new String[7];
        stringArray0[0] = "";
        basicParser0.parse(options1, stringArray0, true);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Options options0 = new Options();
        GnuParser gnuParser0 = new GnuParser();
        gnuParser0.setOptions(options0);
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("-@'XnN*Yo8kFtg=");
        ListIterator<String> listIterator0 = linkedList0.listIterator();
        Option option0 = new Option((String) null, true, (String) null);
        gnuParser0.processArgs(option0, listIterator0);
        option0.getArgName();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Options options0 = new Options();
        Options options1 = options0.addOption("G", true, "G");
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("-G");
        ListIterator<String> listIterator0 = linkedList0.listIterator();
        Option option0 = new Option("G", true, "-G");
        Properties properties0 = new Properties();
        BasicParser basicParser0 = new BasicParser();
        basicParser0.parse(options1, (String[]) null, properties0, true);
        basicParser0.processArgs(option0, listIterator0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Options options0 = new Options();
        options0.addOption("", "", true, "");
        GnuParser gnuParser0 = new GnuParser();
        gnuParser0.setOptions(options0);
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("");
        ListIterator<String> listIterator0 = linkedList0.listIterator();
        gnuParser0.processOption("", listIterator0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        BasicParser basicParser0 = new BasicParser();
        Option option0 = new Option((String) null, (String) null, true, (String) null);
        option0.setOptionalArg(true);
        LinkedList<String> linkedList0 = new LinkedList<String>();
        ListIterator<String> listIterator0 = linkedList0.listIterator();
        basicParser0.processArgs(option0, listIterator0);
        option0.hasLongOpt();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Options options0 = new Options();
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("nB", "nB");
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        options0.addOptionGroup(optionGroup1);
        GnuParser gnuParser0 = new GnuParser();
        gnuParser0.setOptions(options0);
        gnuParser0.processOption("nB", (ListIterator) null);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Options options0 = new Options();
        OptionGroup optionGroup0 = new OptionGroup();
        Option option0 = new Option("zA", "zA", false, "zA");
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        optionGroup1.setRequired(true);
        Options options1 = options0.addOptionGroup(optionGroup1);
        GnuParser gnuParser0 = new GnuParser();
        gnuParser0.setOptions(options1);
        LinkedList<String> linkedList0 = new LinkedList<String>();
        ListIterator<String> listIterator0 = linkedList0.listIterator();
        gnuParser0.processOption("zA", listIterator0);
    }
}
