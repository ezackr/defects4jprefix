/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 04:20:16 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DeadAssignmentsElimination;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DeadAssignmentsElimination_ESTest extends DeadAssignmentsElimination_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination(compiler0);
        Node node0 = compiler0.parseSyntheticCode("", "");
        deadAssignmentsElimination0.process(node0, node0);
        assertEquals(10, Node.VARS_PROP);
    }
}
