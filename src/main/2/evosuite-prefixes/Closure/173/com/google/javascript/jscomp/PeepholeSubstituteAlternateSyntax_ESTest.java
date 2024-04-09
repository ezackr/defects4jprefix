/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 11:27:47 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PeepholeSubstituteAlternateSyntax_ESTest extends PeepholeSubstituteAlternateSyntax_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = Node.newString("igUE$>");
        Node node1 = new Node(4, node0);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        node2.getType();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Node node0 = new Node(8232, 8232, 8232);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node1.isAnd();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Node node0 = Node.newString("com.google.common.base.Throwables");
        Node node1 = new Node(43, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Node node0 = new Node(44, 44, 44);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node1.isWhile();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node0 = Node.newString("`igUE$>");
        Node node1 = new Node(63, node0);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        node2.isTypeOf();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Node node0 = new Node(85, 85, 85);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Node node0 = new Node(30);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Compiler compiler0 = new Compiler();
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Node node0 = new Node(37);
        Compiler compiler0 = new Compiler();
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Node node0 = new Node(8232, 8232, 8232);
        Node node1 = new Node(37, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Compiler compiler0 = new Compiler();
        compiler0.parseTestCode("");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Node node0 = new Node(85, 85, 85);
        Node node1 = new Node(16, node0, node0, 49, 2);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        Node node0 = new Node(85, 85, 85);
        Node node1 = new Node(16, node0, node0, 49, 2);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node2.hasOneChild();
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        Node node0 = new Node(38, 38, 38);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Compiler compiler0 = new Compiler();
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node1.isGetProp();
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        Node node0 = new Node(4, 4, 4);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node1.isContinue();
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        Node node0 = new Node(38);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node1 = new Node(4, node0);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        Node node0 = new Node(44, 44, 44);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        Node node0 = new Node(38);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node1 = new Node(63, node0);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = Node.newString("`igUE$>");
        Node node1 = new Node(63, node0);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        boolean boolean0 = PeepholeSubstituteAlternateSyntax.containsUnicodeEscape(":gWBehB\"Sc~YwK!RR");
    }
}
