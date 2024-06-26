/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 06:33:07 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CommandLineRunner;
import java.io.PipedOutputStream;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CommandLineRunner_ESTest extends CommandLineRunner_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        String[] stringArray0 = new String[0];
        PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
        MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
        CommandLineRunner commandLineRunner0 = null;
        commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-cA=";
        CommandLineRunner.main(stringArray0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        String[] stringArray0 = new String[7];
        stringArray0[0] = "--A=";
        CommandLineRunner.main(stringArray0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        CommandLineRunner.getDefaultExterns();
    }
}
