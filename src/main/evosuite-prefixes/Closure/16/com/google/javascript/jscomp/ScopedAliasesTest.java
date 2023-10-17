/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 01:05:19 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.PreprocessorSymbolTable;
import com.google.javascript.jscomp.ScopedAliases;
import com.google.javascript.rhino.Node;
import org.junit.runner.RunWith;

public class ScopedAliasesTest {

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        ScopedAliases scopedAliases0 = new ScopedAliases((AbstractCompiler) null, (PreprocessorSymbolTable) null, (CompilerOptions.AliasTransformationHandler) null);
        Node node0 = new Node((-338), (-338), (-4442));
        scopedAliases0.process(node0, node0);
        scopedAliases0.hotSwapScript(node0, node0);
        scopedAliases0.hotSwapScript(node0, node0);
        Node node1 = null;
        scopedAliases0.hotSwapScript(node1, node1);
        scopedAliases0.process(node1, node1);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = mock(CompilerOptions.AliasTransformationHandler.class, new ViolatedAssumptionAnswer());
        ScopedAliases scopedAliases0 = new ScopedAliases((AbstractCompiler) null, (PreprocessorSymbolTable) null, compilerOptions_AliasTransformationHandler0);
        Node node0 = null;
        scopedAliases0.process((Node) null, (Node) null);
        scopedAliases0.hotSwapScript(node0, node0);
        scopedAliases0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        CompilerOptions.AliasTransformationHandler compilerOptions_AliasTransformationHandler0 = mock(CompilerOptions.AliasTransformationHandler.class, new ViolatedAssumptionAnswer());
        ScopedAliases scopedAliases0 = new ScopedAliases((AbstractCompiler) null, (PreprocessorSymbolTable) null, compilerOptions_AliasTransformationHandler0);
        Node node0 = null;
        scopedAliases0.hotSwapScript((Node) null, (Node) null);
        scopedAliases0.hotSwapScript(node0, node0);
        scopedAliases0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        ScopedAliases scopedAliases0 = new ScopedAliases((AbstractCompiler) null, (PreprocessorSymbolTable) null, (CompilerOptions.AliasTransformationHandler) null);
        int int0 = 500;
        int int1 = (-3092);
        Node[] nodeArray0 = new Node[5];
        Node node0 = new Node((-194), 3633, (-3092));
        nodeArray0[0] = node0;
        Node node1 = new Node(4095, (-145), 49);
        nodeArray0[1] = node1;
        scopedAliases0.process(node1, node0);
        int int2 = (-129);
        int int3 = 1239;
        int int4 = 0;
        Node node2 = new Node(int2, nodeArray0, int3, int4);
        nodeArray0[2] = node2;
        int int5 = (-2364);
        Node node3 = null;
        node3 = new Node(int5, nodeArray0[2], nodeArray0[1], node0);
    }
}
