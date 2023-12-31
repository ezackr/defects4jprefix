/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 22:51:25 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.RemoveConstantExpressions;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class RemoveConstantExpressions_ESTest extends RemoveConstantExpressions_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        RemoveConstantExpressions removeConstantExpressions0 = new RemoveConstantExpressions(compiler0);
        Node node0 = compiler0.parseSyntheticCode("p-a)OI]}da", "[3=Z");
        removeConstantExpressions0.process(node0, node0);
        assertEquals(0, Node.LABEL_ID_PROP);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Compiler compiler0 = new Compiler();
        RemoveConstantExpressions removeConstantExpressions0 = new RemoveConstantExpressions(compiler0);
        Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.RemoveConstantExpress=ons$RemoveConstantRValuesCallback", "com.google.javascript.jscomp.RemoveConstantExpress=ons$RemoveConstantRValuesCallback");
        removeConstantExpressions0.process(node0, node0);
        assertEquals(13, Node.CASES_PROP);
    }
}
