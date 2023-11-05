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
import org.junit.runner.RunWith;

public class DeadAssignmentsEliminationTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination(compiler0);
        Node node0 = compiler0.parseSyntheticCode("", "");
        deadAssignmentsElimination0.process(node0, node0);
        assertEquals(10, Node.VARS_PROP);
    }
}
