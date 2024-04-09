/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 09:29:10 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSSourceFile;
import java.io.PrintStream;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CommandLineRunner_ESTest extends CommandLineRunner_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        String[] stringArray0 = new String[0];
        // Undeclared exception!
        try {
            CommandLineRunner.main(stringArray0);
            fail("Expecting exception: System.SystemExitException");
        } catch (System.SystemExitException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        commandLineRunner0.createCompiler();
        assertTrue(commandLineRunner0.shouldRunCompiler());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, (PrintStream) null, (PrintStream) null);
        assertTrue(commandLineRunner0.shouldRunCompiler());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        String[] stringArray0 = new String[1];
        stringArray0[0] = "es5.js";
        // Undeclared exception!
        try {
            CommandLineRunner.main(stringArray0);
            fail("Expecting exception: System.SystemExitException");
        } catch (System.SystemExitException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.evosuite.runtime.System", e);
        }
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        String[] stringArray0 = new String[1];
        stringArray0[0] = "--A=";
        // Undeclared exception!
        try {
            CommandLineRunner.main(stringArray0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // No match found
            //
            verifyException("java.util.regex.Matcher", e);
        }
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
        assertFalse(compilerOptions0.generatePseudoNames);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        String[] stringArray0 = new String[0];
        CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
        Supplier<List<JSSourceFile>> supplier0 = (Supplier<List<JSSourceFile>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(supplier0).get();
        Function<Integer, Boolean> function0 = (Function<Integer, Boolean>) mock(Function.class, new ViolatedAssumptionAnswer());
        commandLineRunner0.enableTestMode(supplier0, supplier0, (Supplier<List<JSModule>>) null, function0);
        List<JSSourceFile> list0 = commandLineRunner0.createExterns();
        assertNull(list0);
    }
}
