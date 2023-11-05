/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 05:52:30 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.InlineVariables;
import com.google.javascript.rhino.Node;
import org.junit.runner.RunWith;

public class InlineVariablesTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
        InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, false);
        inlineVariables0.process((Node) null, (Node) null);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Compiler compiler0 = new Compiler();
        InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.LOCALS_ONLY;
        InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, true);
        inlineVariables0.process((Node) null, (Node) null);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Compiler compiler0 = new Compiler();
        InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.CONSTANTS_ONLY;
        InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, true);
        inlineVariables0.process((Node) null, (Node) null);
    }
}
