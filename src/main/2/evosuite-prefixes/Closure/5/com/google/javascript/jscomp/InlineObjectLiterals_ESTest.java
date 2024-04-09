/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 23:44:46 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.InlineObjectLiterals;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class InlineObjectLiterals_ESTest extends InlineObjectLiterals_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        InlineObjectLiterals inlineObjectLiterals0 = new InlineObjectLiterals(compiler0, supplier0);
        Node node0 = Node.newNumber((double) 85, 85, 85);
        inlineObjectLiterals0.process(node0, node0);
    }
}
