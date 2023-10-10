/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 20:51:54 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Comparator;
import java.util.Locale;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.junit.runner.RunWith;

public class HelpFormatterTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        String string0 = "arg";
        Options options0 = null;
        int int0 = 0;
        helpFormatter0.setLeftPadding(0);
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter("7kymYe1");
        char char0 = '$';
        PrintWriter printWriter0 = mockPrintWriter0.append('$');
        helpFormatter0.printUsage(printWriter0, 74, "7kymYe1");
        mockPrintWriter0.flush();
        helpFormatter0.getLeftPadding();
        mockPrintWriter0.println(74);
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 74, (-2399), (String) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
        HelpFormatter helpFormatter0 = new HelpFormatter();
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0, false);
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 2050, 2030, " :: ");
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 2050, "n}%AG\"#<`");
        helpFormatter0.getArgName();
        helpFormatter0.getDescPadding();
        Options options0 = new Options();
        Options options1 = options0.addOption("", false, " :: ");
        OptionGroup optionGroup0 = new OptionGroup();
        Options options2 = options1.addOptionGroup(optionGroup0);
        helpFormatter0.printHelp((PrintWriter) null, 2050, "arg", "n}%AG\"#<`", options2, 3, 0, "arg", false);
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.getOptionComparator();
        Options options0 = new Options();
        Option option0 = new Option((String) null, false, (String) null);
        options0.addOption(option0);
        helpFormatter0.printHelp(2042, "~", ".E^|YbFb@Ba", options0, "~");
        helpFormatter0.setLongOptSeparator(".E^|YbFb@Ba");
        helpFormatter0.getLongOptSeparator();
        helpFormatter0.getWidth();
        helpFormatter0.findWrapPos((String) null, 74, 74);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        StringBuffer stringBuffer0 = null;
        int int0 = (-2266);
        Options options0 = new Options();
        helpFormatter0.setLeftPadding(0);
        Options options1 = options0.addOption((String) null, ">];[(D][", false, (String) null);
        helpFormatter0.renderOptions((StringBuffer) null, 0, options1, 63, 0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        String string0 = "--";
        helpFormatter0.printUsage((PrintWriter) null, 8, "--");
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.getNewLine();
        helpFormatter0.getWidth();
        Options options0 = new Options();
        String string0 = "";
        options0.addOption("", false, "-");
        helpFormatter0.printHelp("sf[", "\n", options0, "\n", true);
        URI uRI0 = MockURI.aHttpURI;
        URI uRI1 = MockURI.resolve(uRI0, uRI0);
        MockFile mockFile0 = null;
        mockFile0 = new MockFile(uRI1);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.getNewLine();
        boolean boolean0 = true;
        helpFormatter0.getArgName();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter("w9fv/pJJtxI;49OE/bS");
        Object[] objectArray0 = new Object[3];
        objectArray0[0] = (Object) null;
        objectArray0[1] = (Object) "w9fv/pJJtxI;49OE/bS";
        objectArray0[2] = (Object) null;
        PrintWriter printWriter0 = mockPrintWriter0.printf(" ", objectArray0);
        helpFormatter0.printWrapped(printWriter0, 525, " ");
        MockPrintWriter mockPrintWriter1 = null;
        mockPrintWriter1 = new MockPrintWriter((OutputStream) null, true);
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        String string0 = "--";
        helpFormatter0.printUsage((PrintWriter) null, 74, "--");
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0);
        Object[] objectArray0 = new Object[6];
        objectArray0[0] = (Object) pipedOutputStream0;
        objectArray0[1] = (Object) mockPrintWriter0;
        objectArray0[2] = (Object) mockPrintWriter0;
        objectArray0[3] = (Object) pipedOutputStream0;
        objectArray0[4] = (Object) helpFormatter0;
        objectArray0[5] = (Object) pipedOutputStream0;
        PrintWriter printWriter0 = mockPrintWriter0.printf("-", objectArray0);
        Options options0 = new Options();
        Option option0 = new Option("arg", false, "arg");
        Options options1 = options0.addOption(option0);
        Options options2 = options1.addOption("", true, "' was specified but an option from this group ");
        Options options3 = options2.addOption("", "org.apache.commons.cli.HelpFormatter$1", false, " | ");
        helpFormatter0.printHelp("~/<T#SkeM:%", "", options3, "");
        helpFormatter0.printWrapped(printWriter0, (-1), 1913, "");
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        byte[] byteArray0 = new byte[2];
        byteArray0[0] = (byte) 105;
        byteArray0[1] = (byte) 5;
        FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter("Z0\"[Gmr:;/mpu'p+V");
        PrintWriter printWriter0 = mockPrintWriter0.append('`');
        Options options0 = new Options();
        mockPrintWriter0.print('`');
        helpFormatter0.setArgName("Z0\"[Gmr:;/mpu'p+V");
        mockPrintWriter0.print('`');
        FileSystemHandling.setPermissions((EvoSuiteFile) null, false, false, true);
        helpFormatter0.printHelp(printWriter0, 998, "Z0\"[Gmr:;/mpu'p+V", "Z0\"[Gmr:;/mpu'p+V", options0, 74, 35, "has already been selected: '");
        mockPrintWriter0.print(1);
        helpFormatter0.printHelp(printWriter0, 112, "YHW)4", "YHW)4", options0, 35, 74, "", false);
        helpFormatter0.getWidth();
        helpFormatter0.getLeftPadding();
        helpFormatter0.getOptionComparator();
        StringBuffer stringBuffer0 = new StringBuffer("");
        helpFormatter0.renderOptions(stringBuffer0, 35, options0, 998, (-400));
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        MockPrintStream mockPrintStream0 = new MockPrintStream("--");
        helpFormatter0.defaultSyntaxPrefix = "<";
        DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream0);
        FilterOutputStream filterOutputStream0 = new FilterOutputStream(dataOutputStream0);
        dataOutputStream0.writeBoolean(false);
        int int0 = 0;
        Options options0 = new Options();
        helpFormatter0.printHelp(0, "9q^;CtooTN5gu", ">", options0, "9q^;CtooTN5gu", false);
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        String string0 = "u\"6XE";
        helpFormatter0.setDescPadding(156);
        Options options0 = null;
        helpFormatter0.defaultSyntaxPrefix = "u\"6XE";
        String string1 = "";
        helpFormatter0.printHelp(1367, "u\"6XE", "u\"6XE", (Options) null, "");
    }

    @Test(timeout = 4000)
    public void test1512() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        int int0 = (-1);
        helpFormatter0.setLeftPadding((-1));
        int int1 = 0;
        helpFormatter0.createPadding(0);
        helpFormatter0.getLongOptPrefix();
        MockPrintWriter mockPrintWriter0 = null;
        mockPrintWriter0 = new MockPrintWriter((File) null, "--");
    }

    @Test(timeout = 4000)
    public void test1613() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        Options options0 = new Options();
        StringBuffer stringBuffer0 = new StringBuffer("\n");
        stringBuffer0.trimToSize();
        StringBuffer stringBuffer1 = helpFormatter0.renderOptions(stringBuffer0, 0, options0, 0, 0);
        stringBuffer0.setLength(0);
        stringBuffer1.insert((-328), true);
    }

    @Test(timeout = 4000)
    public void test1714() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.setLongOptSeparator((String) null);
        StringBuffer stringBuffer0 = new StringBuffer();
        int int0 = 0;
        Options options0 = new Options();
        Option option0 = new Option("", "kB");
        options0.helpOptions();
        Options options1 = options0.addOption(option0);
        Options options2 = options1.addOption("arg", false, "\n");
        OptionGroup optionGroup0 = new OptionGroup();
        option0.setOptionalArg(false);
        Options options3 = options2.addOptionGroup(optionGroup0);
        options1.hasOption((String) null);
        int int1 = 0;
        helpFormatter0.renderOptions(stringBuffer0, 0, options3, 0, 0);
    }

    @Test(timeout = 4000)
    public void test1815() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.getOptPrefix();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter("\":`9;");
        Object[] objectArray0 = new Object[4];
        objectArray0[0] = (Object) helpFormatter0;
        Object object0 = new Object();
        objectArray0[1] = object0;
        objectArray0[2] = (Object) "\":`9;";
        objectArray0[3] = (Object) "Cannot add value, list full.";
        mockPrintWriter0.print((Object) "Cannot add value, list full.");
        PrintWriter printWriter0 = mockPrintWriter0.format("Cannot add value, list full.", objectArray0);
        helpFormatter0.printUsage(printWriter0, (-1788), "[ Options: [ short ");
    }

    @Test(timeout = 4000)
    public void test2016() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(" ");
        Object[] objectArray0 = new Object[5];
        Object object0 = new Object();
        objectArray0[0] = object0;
        Object object1 = new Object();
        objectArray0[1] = object1;
        objectArray0[2] = (Object) mockPrintWriter0;
        objectArray0[3] = (Object) mockPrintWriter0;
        objectArray0[4] = (Object) helpFormatter0;
        PrintWriter printWriter0 = mockPrintWriter0.printf("", objectArray0);
        helpFormatter0.printHelp(printWriter0, (-740), "K-|PUWPd2<)?~", "[ARG...]", (Options) null, (-4322), (-1104), ", ", false);
    }

    @Test(timeout = 4000)
    public void test2117() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "\n");
        helpFormatter0.getWidth();
        PrintWriter printWriter0 = null;
        helpFormatter0.printWrapped((PrintWriter) null, 74, " ");
    }

    @Test(timeout = 4000)
    public void test2418() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.setNewLine("--");
        helpFormatter0.setLongOptPrefix("x'W67qe @qB{Zsu");
        helpFormatter0.defaultLongOptPrefix = "x'W67qe @qB{Zsu";
        helpFormatter0.getWidth();
        helpFormatter0.getLongOptSeparator();
        helpFormatter0.findWrapPos(" ", 74, 74);
        helpFormatter0.defaultOptPrefix = " ";
        helpFormatter0.setWidth(0);
        Options options0 = null;
        helpFormatter0.defaultOptPrefix = "";
        helpFormatter0.printHelp("x'W67qe @qB{Zsu", "", (Options) null, "b7kS}sflFb)p>vjSM", true);
    }

    @Test(timeout = 4000)
    public void test2619() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        String string0 = "org.apache.commons.cli.HelpFormatter$1";
        helpFormatter0.defaultOptPrefix = "org.apache.commons.cli.HelpFormatter$1";
        helpFormatter0.defaultWidth = 1;
        int int0 = 9;
        helpFormatter0.findWrapPos("'", 9, 9);
        MockPrintStream mockPrintStream0 = new MockPrintStream("usage: ");
        Object[] objectArray0 = new Object[0];
        PrintStream printStream0 = mockPrintStream0.format("usage: ", objectArray0);
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0, true);
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter0, 1, "org.apache.commons.cli.HelpFormatter$1");
    }

    @Test(timeout = 4000)
    public void test2720() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.printHelp("*x)9%vnL=", (Options) null);
    }

    @Test(timeout = 4000)
    public void test2821() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        Options options0 = new Options();
        options0.helpOptions();
        String string0 = "org.apache.commons.cli.HelpFormatter";
        helpFormatter0.printHelp((-3055), "", "", options0, "org.apache.commons.cli.HelpFormatter");
    }

    @Test(timeout = 4000)
    public void test2922() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.setDescPadding(760);
        Options options0 = new Options();
        options0.getOption("");
        Option option0 = new Option("", "", false, "");
        Options options1 = options0.addOption(option0);
        helpFormatter0.printHelp("", "", options1, "FMI(?zcf");
    }

    @Test(timeout = 4000)
    public void test3423() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        String string0 = "[";
        helpFormatter0.setSyntaxPrefix("[");
        Options options0 = null;
        boolean boolean0 = false;
        helpFormatter0.printHelp("", "The addValue method is not intended for client use. Subclasses should use the addValueForProcessing method instead. ", (Options) null, "", false);
    }

    @Test(timeout = 4000)
    public void test3524() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        String string0 = ", ";
        Options options0 = new Options();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter("<V");
        Object[] objectArray0 = new Object[0];
        PrintWriter printWriter0 = mockPrintWriter0.format("-", objectArray0);
        helpFormatter0.printUsage(printWriter0, (-2), "<-2z'j@xi_AAjO/6{De", options0);
    }

    @Test(timeout = 4000)
    public void test3625() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        String string0 = "";
        helpFormatter0.defaultArgName = "";
        String string1 = "TQMt";
        helpFormatter0.defaultLongOptPrefix = "TQMt";
        helpFormatter0.getLeftPadding();
        String string2 = "8h>p(.EE|pW";
        helpFormatter0.findWrapPos("8h>p(.EE|pW", 1, (-1087));
    }

    @Test(timeout = 4000)
    public void test3726() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        Options options0 = new Options();
        Options options1 = options0.addOption("", false, "1N*W_yjSq?W{");
        helpFormatter0.printHelp("", options1);
    }

    @Test(timeout = 4000)
    public void test3827() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.defaultDescPad = 550;
        helpFormatter0.setLongOptSeparator("nlD?p^L?`Te");
        helpFormatter0.defaultWidth = 4571;
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        helpFormatter0.optionComparator = comparator0;
        Comparator<String> comparator1 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        helpFormatter0.setOptionComparator(comparator1);
        helpFormatter0.getNewLine();
        helpFormatter0.printHelp(0, "\n", "", (Options) null, (String) null, true);
    }

    @Test(timeout = 4000)
    public void test3928() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        String string0 = "";
        Options options0 = new Options();
        boolean boolean0 = false;
        options0.hasOption("--");
        String string1 = "$zY6ZZY7FF3";
        options0.hasOption("usage: ");
        helpFormatter0.setArgName("$zY6ZZY7FF3");
        Option option0 = new Option("", "$zY6ZZY7FF3", false, "");
        options0.addOption(option0);
        helpFormatter0.printHelp("", options0, false);
    }

    @Test(timeout = 4000)
    public void test4029() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter("--");
        Object[] objectArray0 = new Object[3];
        objectArray0[0] = (Object) helpFormatter0;
        Object object0 = new Object();
        objectArray0[1] = object0;
        Object object1 = new Object();
        objectArray0[2] = object1;
        PrintWriter printWriter0 = mockPrintWriter0.format(",\u0000Twq9", objectArray0);
        Options options0 = new Options();
        helpFormatter0.printHelp(printWriter0, (-3982), "[ARG...]", "[ARG...]", options0, (-1), 1856, "Se.[_)1;/X@GA&__", true);
    }

    @Test(timeout = 4000)
    public void test4130() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.rtrim("&?\nKwz}_");
        Options options0 = new Options();
        options0.toString();
        helpFormatter0.printHelp("&?\nKwz}_", "&?\nKwz}_", options0, "&?\nKwz}_");
        int int0 = (-1834);
        String string0 = null;
        helpFormatter0.printHelp((-1834), "&?\nKwz}_", (String) null, options0, "[ Options: [ short java.util.HashMap@0000000004 ] [ long {} ]");
    }

    @Test(timeout = 4000)
    public void test4231() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        Options options0 = new Options();
        helpFormatter0.printHelp((-412), "cmdLineSyntax not provided", "cmdLineSyntax not provided", options0, "cmdLineSyntax not provided");
    }

    @Test(timeout = 4000)
    public void test4332() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        StringBuffer stringBuffer0 = new StringBuffer("-");
        helpFormatter0.renderWrappedText(stringBuffer0, 0, 4645, "");
        String string0 = "";
        MockFileOutputStream mockFileOutputStream0 = null;
        mockFileOutputStream0 = new MockFileOutputStream("");
    }

    @Test(timeout = 4000)
    public void test4633() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.defaultNewLine = "XsfZ))";
        helpFormatter0.printHelp("]-&vg[49`Hc", ")*C'", (Options) null, ")*C'");
    }

    @Test(timeout = 4000)
    public void test4734() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("}4P");
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(mockFileOutputStream0);
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(bufferedOutputStream0, false);
        int int0 = (-1087);
        helpFormatter0.printUsage((PrintWriter) mockPrintWriter0, (-1087), "}4P", (Options) null);
    }

    @Test(timeout = 4000)
    public void test4835() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        helpFormatter0.setOptionComparator(comparator0);
        helpFormatter0.setNewLine("w+9Lr#}&r&(e");
        Comparator<Option> comparator1 = (Comparator<Option>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        String string0 = "";
        MockFile mockFile0 = new MockFile("", "w+9Lr#}&r&(e");
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
        mockPrintWriter0.println((Object) "/");
        Options options0 = new Options();
        Options options1 = options0.addOption("", false, "9F");
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, (-742), (String) null, "", options1, (-742), 1, "w+9Lr#}&r&(e", false);
    }

    @Test(timeout = 4000)
    public void test4936() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.defaultWidth = (-5049);
        HelpFormatter helpFormatter1 = new HelpFormatter();
        StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "\n");
        int int0 = (-8);
        Options options0 = new Options();
        helpFormatter1.renderOptions(stringBuffer0, (-8), options0, (-35), 864);
    }

    @Test(timeout = 4000)
    public void test5037() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("%*JJMup^Em-QvA*");
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, true);
        MockPrintWriter mockPrintWriter1 = new MockPrintWriter(mockPrintWriter0);
        PrintWriter printWriter0 = mockPrintWriter1.append('u');
        helpFormatter0.printWrapped(printWriter0, 1, 1, "%*JJMup^Em-QvA*");
    }

    @Test(timeout = 4000)
    public void test5238() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.setWidth((-1879));
        helpFormatter0.printWrapped((PrintWriter) null, 4427, "_CV-qOcIV1>'8E9");
    }

    @Test(timeout = 4000)
    public void test5339() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "arg");
        MockFile mockFile0 = new MockFile("usage: ", " ");
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFileOutputStream0, true);
        Object[] objectArray0 = new Object[9];
        Object object0 = new Object();
        objectArray0[0] = object0;
        objectArray0[1] = (Object) mockFile0;
        objectArray0[2] = (Object) mockFile0;
        objectArray0[3] = (Object) mockFile0;
        objectArray0[4] = (Object) helpFormatter0;
        objectArray0[5] = (Object) stringBuffer0;
        objectArray0[6] = (Object) helpFormatter0;
        objectArray0[7] = (Object) mockFileOutputStream0;
        objectArray0[8] = (Object) helpFormatter0;
        PrintWriter printWriter0 = mockPrintWriter0.printf("1T[MPmf6/yGLlvX", objectArray0);
        MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0, true);
        helpFormatter0.printWrapped((PrintWriter) mockPrintWriter1, 0, (-3300), "1f :5WD-yg@*Yk8");
    }

    @Test(timeout = 4000)
    public void test5440() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        StringBuffer stringBuffer0 = new StringBuffer((CharSequence) "arg");
        int int0 = 0;
        helpFormatter0.renderWrappedText(stringBuffer0, 0, 0, (String) null);
    }

    @Test(timeout = 4000)
    public void test5541() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        int int0 = (-76);
        helpFormatter0.createPadding((-76));
    }

    @Test(timeout = 4000)
    public void test5742() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter("arg");
        PrintWriter printWriter0 = mockPrintWriter0.append('E');
        Options options0 = new Options();
        int int0 = (-502);
        helpFormatter0.printOptions(printWriter0, 0, options0, 0, (-502));
    }

    @Test(timeout = 4000)
    public void test5843() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        PrintWriter printWriter0 = null;
        int int0 = 0;
        Comparator<Option> comparator0 = (Comparator<Option>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        helpFormatter0.setOptionComparator(comparator0);
        String string0 = "9:c16d=Fg@ryywr@H";
        helpFormatter0.defaultArgName = "9:c16d=Fg@ryywr@H";
        String string1 = "n";
        String string2 = null;
        String string3 = null;
        helpFormatter0.defaultNewLine = null;
        Options options0 = null;
        helpFormatter0.printWrapped((PrintWriter) null, 0, ">Gj;P");
    }

    @Test(timeout = 4000)
    public void test5944() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.defaultOptPrefix = "org.apache.commons.cli.Options";
        helpFormatter0.setLongOptSeparator("org.apache.commons.cli.Options");
        helpFormatter0.getLongOptPrefix();
        helpFormatter0.setSyntaxPrefix("org.apache.commons.cli.Options");
        MockFile mockFile0 = new MockFile((String) null, "--");
        MockFile mockFile1 = new MockFile(mockFile0, "--");
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile1);
        int int0 = (-2);
        String string0 = "ac:cA74j";
        Options options0 = null;
        mockFile0.mkdir();
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, (-2), "ac:cA74j", "ac:cA74j", (Options) null, 2360, (-2), "");
    }

    @Test(timeout = 4000)
    public void test6145() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        int int0 = 0;
        String string0 = "";
        Options options0 = new Options();
        OptionGroup optionGroup0 = new OptionGroup();
        String string1 = "Cannot add value, list full.";
        boolean boolean0 = false;
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter("I4+*E@");
        PrintWriter printWriter0 = mockPrintWriter0.format("wG^Z}fA^/m`,ky", (Object[]) null);
        MockPrintWriter mockPrintWriter1 = new MockPrintWriter(printWriter0);
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter1, (-511), "", "", options0, 0, (-511), (String) null);
    }

    @Test(timeout = 4000)
    public void test6346() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.defaultOptPrefix = "[ Options: [ short ";
        helpFormatter0.setOptPrefix("");
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0);
        String string0 = "/y<.b,";
        Options options0 = new Options();
        helpFormatter0.printHelp((PrintWriter) mockPrintWriter0, 1, "", "/y<.b,", options0, 1, (-150), "p`Dsm&J5{CpnN|`", false);
    }

    @Test(timeout = 4000)
    public void test6447() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.printHelp(3, "[ARG...]", (String) null, (Options) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test6548() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.getNewLine();
        helpFormatter0.getWidth();
        Options options0 = new Options();
        String string0 = "";
        options0.addOption("", false, "-");
        helpFormatter0.printHelp("[", "\n", options0, "\n", false);
        URI uRI0 = MockURI.aHttpURI;
        URI uRI1 = MockURI.resolve(uRI0, uRI0);
        MockFile mockFile0 = null;
        mockFile0 = new MockFile(uRI1);
    }

    @Test(timeout = 4000)
    public void test6749() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.getNewLine();
        boolean boolean0 = true;
        MockPrintWriter mockPrintWriter0 = null;
        mockPrintWriter0 = new MockPrintWriter((OutputStream) null, true);
    }

    @Test(timeout = 4000)
    public void test7050() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        Comparator<String> comparator0 = (Comparator<String>) mock(Comparator.class, new ViolatedAssumptionAnswer());
        helpFormatter0.setOptionComparator(comparator0);
        String string0 = "x.G7TNJx0DNRLj<alwc";
        helpFormatter0.setOptPrefix("x.G7TNJx0DNRLj<alwc");
        helpFormatter0.getLongOptSeparator();
        StringBuffer stringBuffer0 = new StringBuffer(3);
        stringBuffer0.chars();
        int int0 = (-391);
        String string1 = "NO_ARGS_ALLOWED";
        helpFormatter0.renderWrappedText(stringBuffer0, (-391), (-224), "NO_ARGS_ALLOWED");
    }

    @Test(timeout = 4000)
    public void test7151() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        Options options0 = new Options();
        Option option0 = new Option("arg", false, "8FT");
        Options options1 = options0.addOption(option0);
        options1.hasLongOption("");
        Options options2 = options1.addOption("8FT", "usage: ", false, "x2Zob+^GI]p~+@BV1@d");
        helpFormatter0.printHelp((-1818), (String) null, "--", options2, "--", false);
    }

    @Test(timeout = 4000)
    public void test7552() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        StringWriter stringWriter0 = new StringWriter(3);
        FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "[");
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, true);
        PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "usage: ");
        Options options0 = new Options();
        FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
        Option option0 = new Option("", "y>.V\"WH");
        Options options1 = options0.addOption(option0);
        Options options2 = options1.addOption("", true, "");
        OptionGroup optionGroup0 = new OptionGroup();
        Options options3 = options2.addOptionGroup(optionGroup0);
        options3.addOption("", true, "--");
        Options options4 = options3.addOption("", "[ option: ", true, "-");
        helpFormatter0.printUsage(printWriter0, 34, "[", options4);
        helpFormatter0.getDescPadding();
        helpFormatter0.rtrim((String) null);
        helpFormatter0.getNewLine();
        helpFormatter0.getLongOptSeparator();
        StringBuffer stringBuffer0 = new StringBuffer(63);
        helpFormatter0.renderOptions(stringBuffer0, 63, options0, (-2712), 3);
    }

    @Test(timeout = 4000)
    public void test7853() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        helpFormatter0.getOptionComparator();
        Options options0 = new Options();
        helpFormatter0.printHelp(2042, "~", ".E^|YbFb@Ba", options0, "~");
        helpFormatter0.setLongOptSeparator(".E^|YbFb@Ba");
        helpFormatter0.getLongOptSeparator();
        helpFormatter0.getWidth();
        helpFormatter0.findWrapPos((String) null, 74, 74);
    }

    @Test(timeout = 4000)
    public void test7954() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        MockPrintWriter mockPrintWriter0 = new MockPrintWriter("arg");
        int int0 = 829;
        String string0 = "org.apache.commons.cli.Option";
        String string1 = null;
        Options options0 = new Options();
        boolean boolean0 = false;
        options0.addOption("\n", "arg", false, ", ");
    }

    @Test(timeout = 4000)
    public void test8155() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        int int0 = (-1836);
        String string0 = ":\\/C}";
        Options options0 = new Options();
        boolean boolean0 = false;
        String string1 = "";
        options0.addOption("usage: ", false, "");
    }

    @Test(timeout = 4000)
    public void test8256() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        int int0 = 731;
        String string0 = "Z=[}&6?W3q}|";
        Options options0 = new Options();
        boolean boolean0 = true;
        options0.addOption("-", "usage: ", true, "arg");
    }

    @Test(timeout = 4000)
    public void test8357() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        Options options0 = new Options();
        String string0 = "";
        Option option0 = new Option("", true, "arg");
        Options options1 = options0.addOption(option0);
        Options options2 = options1.addOption("arg", true, "\n");
        option0.setArgName("arg");
        Options options3 = options2.addOption("", "\n", true, "");
        OptionGroup optionGroup0 = new OptionGroup();
        options2.helpOptions();
        OptionGroup optionGroup1 = optionGroup0.addOption(option0);
        Options options4 = options3.addOptionGroup(optionGroup1);
        helpFormatter0.printHelp("[", options4);
        StringBuffer stringBuffer0 = new StringBuffer("");
        helpFormatter0.renderOptions(stringBuffer0, 1708, options4, (-1), (-2));
    }

    @Test(timeout = 4000)
    public void test8458() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        Options options0 = new Options();
        Option option0 = new Option("B1", "", true, "org.apache.commons.cli.AlreadySelectedException");
        Options options1 = options0.addOption(option0);
        OptionGroup optionGroup0 = new OptionGroup();
        String string0 = "{T#";
        Option option1 = new Option("arg", false, "{T#");
        OptionGroup optionGroup1 = optionGroup0.addOption(option1);
        Options options2 = options1.addOptionGroup(optionGroup1);
        helpFormatter0.printHelp("", options2);
    }

    @Test(timeout = 4000)
    public void test8559() throws Throwable {
        HelpFormatter helpFormatter0 = new HelpFormatter();
        String string0 = "--";
        Options options0 = new Options();
        String string1 = "$Gn^Nd\",.)3Q_k{";
        helpFormatter0.printHelp("$Gn^Nd\",.)3Q_k{", "--", options0, "--", true);
        options0.hasOption("$Gn^Nd\",.)3Q_k{");
        options0.addOption("--", true, "--");
    }
}
