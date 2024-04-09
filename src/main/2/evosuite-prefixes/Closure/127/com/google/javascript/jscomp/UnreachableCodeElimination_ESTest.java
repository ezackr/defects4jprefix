/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 07:41:45 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.UnreachableCodeElimination;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class UnreachableCodeElimination_ESTest extends UnreachableCodeElimination_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        UnreachableCodeElimination unreachableCodeElimination0 = new UnreachableCodeElimination(compiler0, true);
        unreachableCodeElimination0.process((Node) null, (Node) null);
    }
}
