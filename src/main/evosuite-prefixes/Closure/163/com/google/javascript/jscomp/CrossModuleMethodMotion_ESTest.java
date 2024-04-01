/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 23:34:08 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CrossModuleMethodMotion;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CrossModuleMethodMotion_ESTest extends CrossModuleMethodMotion_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
        Compiler compiler0 = new Compiler();
        CrossModuleMethodMotion crossModuleMethodMotion0 = new CrossModuleMethodMotion(compiler0, crossModuleMethodMotion_IdGenerator0, true);
        crossModuleMethodMotion0.process((Node) null, (Node) null);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
        int int0 = crossModuleMethodMotion_IdGenerator0.newId();
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
        int int0 = crossModuleMethodMotion_IdGenerator0.newId();
        boolean boolean0 = crossModuleMethodMotion_IdGenerator0.hasGeneratedAnyIds();
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        CrossModuleMethodMotion.IdGenerator crossModuleMethodMotion_IdGenerator0 = new CrossModuleMethodMotion.IdGenerator();
        boolean boolean0 = crossModuleMethodMotion_IdGenerator0.hasGeneratedAnyIds();
    }
}
