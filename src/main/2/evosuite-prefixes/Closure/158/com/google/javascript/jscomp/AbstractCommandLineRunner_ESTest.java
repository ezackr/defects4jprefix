/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 10:07:18 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.AbstractCommandLineRunner;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.Tracer;
import java.io.CharArrayWriter;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Stack;
import java.util.Vector;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class AbstractCommandLineRunner_ESTest extends AbstractCommandLineRunner_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        String[] stringArray0 = new String[0];
        URI uRI0 = MockURI.aFileURI;
        MockFile mockFile0 = new MockFile(uRI0);
        MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
        CompilerOptions compilerOptions0 = new CompilerOptions();
        commandLineRunner0.initOptionsFromFlags(compilerOptions0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        String[] stringArray0 = new String[2];
        stringArray0[0] = "com.google.javascript.jscomp.NodeTraversal$AbstractShallowStatementCallback";
        stringArray0[1] = "com.google.javascript.jscomp.NodeTraversal$AbstractShallowStatementCallback";
        MockFile mockFile0 = new MockFile("com.google.javascript.jscomp.NodeTraversal$AbstractShallowStatementCallback");
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
        MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
        Compiler compiler0 = commandLineRunner0.getCompiler();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
        commandLineRunner0.createJsModules(list0, list0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
        CompilerOptions.TweakProcessing compilerOptions_TweakProcessing0 = CompilerOptions.TweakProcessing.OFF;
        AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setTweakProcessing(compilerOptions_TweakProcessing0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
        List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
        AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setTweak(list0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
        SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
        AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setSourceMapDetailLevel(sourceMap_DetailLevel0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        String[] stringArray0 = new String[7];
        stringArray0[0] = "true";
        stringArray0[1] = "\n";
        stringArray0[2] = "wyX4MFq[V,";
        stringArray0[3] = "";
        stringArray0[4] = "[L1";
        stringArray0[5] = "`K";
        stringArray0[6] = "true";
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
        AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
        AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setSourceMapFormat(compilerOptions0.sourceMapFormat);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        Supplier<List<JSModule>> supplier0 = (Supplier<List<JSModule>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
        commandLineRunner0.enableTestMode((Supplier<List<JSSourceFile>>) null, (Supplier<List<JSSourceFile>>) null, supplier0, (Function<Integer, Boolean>) null);
        commandLineRunner0.shouldRunCompiler();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        String[] stringArray0 = new String[7];
        stringArray0[0] = "true";
        stringArray0[1] = "\n";
        stringArray0[2] = "wyX4MFq[V,";
        stringArray0[3] = "";
        stringArray0[4] = "[L1";
        stringArray0[5] = "`K";
        stringArray0[6] = "true";
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
        commandLineRunner0.setRunOptions(compilerOptions0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        commandLineRunner0.run();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
        List<JSSourceFile> list1 = commandLineRunner0.createInputs(list0, true);
        list1.size();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        Supplier<List<JSSourceFile>> supplier0 = (Supplier<List<JSSourceFile>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
        commandLineRunner0.enableTestMode(supplier0, supplier0, (Supplier<List<JSModule>>) null, (Function<Integer, Boolean>) null);
        LinkedList<String> linkedList0 = new LinkedList<String>();
        commandLineRunner0.createJsModules(linkedList0, linkedList0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        Vector<String> vector0 = new Vector<String>();
        commandLineRunner0.createJsModules((List<String>) null, vector0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        Stack<String> stack0 = new Stack<String>();
        commandLineRunner0.createJsModules(stack0, stack0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
        commandLineRunner0.createJsModules(list0, (List<String>) null);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        Stack<String> stack0 = new Stack<String>();
        stack0.add("yvO:d");
        commandLineRunner0.createJsModules(stack0, stack0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        Stack<String> stack0 = new Stack<String>();
        stack0.add("Referenced Functions: ");
        commandLineRunner0.createJsModules(stack0, stack0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        LinkedList<JSModule> linkedList0 = new LinkedList<JSModule>();
        AbstractCommandLineRunner.parseModuleWrappers((List<String>) null, linkedList0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        Stack<JSModule> stack0 = new Stack<JSModule>();
        Logger logger0 = Logger.getAnonymousLogger();
        LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
        Compiler compiler0 = new Compiler();
        compiler0.setErrorManager(loggerErrorManager0);
        Result result0 = compiler0.getResult();
        CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
        int int0 = commandLineRunner0.processResults(result0, stack0, compilerOptions0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
        LinkedList<JSModule> linkedList0 = new LinkedList<JSModule>();
        JSModule jSModule0 = new JSModule("Hz.");
        linkedList0.addFirst(jSModule0);
        AbstractCommandLineRunner.parseModuleWrappers(list0, linkedList0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Stack<String> stack0 = new Stack<String>();
        stack0.add("--tweUk flag syntax invali]: ");
        LinkedList<JSModule> linkedList0 = new LinkedList<JSModule>();
        AbstractCommandLineRunner.parseModuleWrappers(stack0, linkedList0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Compiler compiler0 = new Compiler();
        CharArrayWriter charArrayWriter0 = new CharArrayWriter();
        AbstractCommandLineRunner.writeOutput(charArrayWriter0, compiler0, "java.clsss", "java.clsss", "Invalid module name: '");
        charArrayWriter0.size();
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        Compiler compiler0 = new Compiler();
        CharArrayWriter charArrayWriter0 = new CharArrayWriter();
        AbstractCommandLineRunner.writeOutput(charArrayWriter0, compiler0, "java.clsss", "java.clsss", "Invalid module name: '");
        charArrayWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        StringBuilder stringBuilder0 = new StringBuilder();
        Compiler compiler0 = new Compiler();
        AbstractCommandLineRunner.writeOutput(stringBuilder0, compiler0, "-", "Expected 2-4 colon-delimited parts in module spec: ", "-");
        stringBuilder0.toString();
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        MockFile mockFile0 = new MockFile("!X>S]Jk.YqQ");
        MockFileWriter mockFileWriter0 = new MockFileWriter(mockFile0);
        AbstractCommandLineRunner.writeOutput(mockFileWriter0, (Compiler) null, "!X>S]Jk.YqQ", "!X>S]Jk.YqQ", "!X>S]Jk.YqQ");
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        Stack<JSModule> stack0 = new Stack<JSModule>();
        Logger logger0 = Logger.getGlobal();
        LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
        Compiler compiler0 = new Compiler(loggerErrorManager0);
        Result result0 = compiler0.getResult();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "";
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        int int0 = commandLineRunner0.processResults(result0, stack0, compilerOptions0);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        Logger logger0 = Tracer.logger;
        LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
        Compiler compiler0 = new Compiler((PrintStream) null);
        compiler0.setErrorManager(loggerErrorManager0);
        Result result0 = compiler0.getResult();
        commandLineRunner0.processResults(result0, (List<JSModule>) null, (CompilerOptions) null);
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        OutputStream outputStream0 = commandLineRunner0.filenameToOutputStream("Kx0&");
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        OutputStream outputStream0 = commandLineRunner0.filenameToOutputStream((String) null);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        Stack<String> stack0 = new Stack<String>();
        stack0.add("=x>");
        CompilerOptions compilerOptions0 = new CompilerOptions();
        AbstractCommandLineRunner.createDefineOrTweakReplacements(stack0, compilerOptions0, true);
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
        CompilerOptions compilerOptions0 = new CompilerOptions();
        AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, true);
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
        CompilerOptions compilerOptions0 = new CompilerOptions();
        AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, false);
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        Stack<String> stack0 = new Stack<String>();
        stack0.add("=,o4");
        CompilerOptions compilerOptions0 = new CompilerOptions();
        AbstractCommandLineRunner.createDefineOrTweakReplacements(stack0, compilerOptions0, false);
    }

    @Test(timeout = 4000)
    public void test3233() throws Throwable {
        String[] stringArray0 = new String[0];
        JSModule jSModule0 = new JSModule("K]v!bs");
        JSModule jSModule1 = new JSModule("_~6;u``3M");
        MockPrintStream mockPrintStream0 = new MockPrintStream("K]v!bs");
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        JSModule[] jSModuleArray0 = new JSModule[3];
        jSModuleArray0[0] = jSModule0;
        jSModuleArray0[1] = jSModule0;
        jSModuleArray0[2] = jSModule1;
        JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
        commandLineRunner0.printModuleGraphManifestTo(jSModuleGraph0, mockPrintStream0);
        commandLineRunner0.shouldRunCompiler();
    }

    @Test(timeout = 4000)
    public void test3334() throws Throwable {
        String[] stringArray0 = new String[0];
        JSModule jSModule0 = new JSModule("--tweak flag syntax invalid: ");
        MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("--tweak flag syntax invalid: ");
        JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("--tweak flag syntax invalid: ");
        jSModule0.add(jSSourceFile0);
        MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0);
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        JSModule[] jSModuleArray0 = new JSModule[1];
        jSModuleArray0[0] = jSModule0;
        JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
        commandLineRunner0.printModuleGraphManifestTo(jSModuleGraph0, mockPrintStream0);
        commandLineRunner0.shouldRunCompiler();
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        CompilerOptions compilerOptions0 = new CompilerOptions();
        Stack<JSSourceFile> stack0 = new Stack<JSSourceFile>();
        JSSourceFile jSSourceFile0 = JSSourceFile.fromCode((String) null, (String) null);
        stack0.add(jSSourceFile0);
        Supplier<List<JSSourceFile>> supplier0 = (Supplier<List<JSSourceFile>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
        doReturn(stack0, stack0, (Object) null, (Object) null).when(supplier0).get();
        Function<Integer, Boolean> function0 = (Function<Integer, Boolean>) mock(Function.class, new ViolatedAssumptionAnswer());
        doReturn(false, (Object) null).when(function0).apply(anyInt());
        commandLineRunner0.enableTestMode(supplier0, supplier0, (Supplier<List<JSModule>>) null, function0);
        commandLineRunner0.run();
        commandLineRunner0.run();
        commandLineRunner0.shouldRunCompiler();
    }
}
