/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 03 22:47:41 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PeepholeSubstituteAlternateSyntax_ESTest extends PeepholeSubstituteAlternateSyntax_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Node node0 = Node.newString("");
        Node node1 = new Node(4, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Node node0 = new Node(14);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node1.isVar();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = new Node(43, 43, 43);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node0 = Node.newNumber(4.67371955799455);
        Node node1 = new Node(44, node0, node0);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Node node0 = new Node(100);
        Node node1 = new Node(98, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = new Node(113);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = new Node(114);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Node node0 = new Node(115);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = new Node(130);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Node node0 = new Node(4);
        Node node1 = new Node(4095, node0, node0);
        Compiler compiler0 = new Compiler();
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Node node0 = Node.newNumber(65.25581514511606);
        Node node1 = new Node(30, node0, node0);
        Compiler compiler0 = new Compiler();
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Node node0 = new Node(106);
        Node node1 = new Node(115, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Node node0 = new Node(106);
        Node node1 = new Node(115, node0, node0);
        node1.replaceChild(node0, node1);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Node node0 = new Node(37, 37, 37);
        Compiler compiler0 = new Compiler();
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Node node0 = new Node((-913));
        Node node1 = new Node(37, node0, node0);
        Compiler compiler0 = new Compiler();
        CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
        compiler0.initOptions(compilerOptions0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        node2.getType();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Node node0 = new Node(85);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Node node0 = new Node(85);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node1 = new Node(41, node0, node0, node0, node0, 1, 30);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        Node node0 = new Node(85);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node1 = new Node(41, node0, node0, node0, node0, 1, 30);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node2.getLineno();
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        Node node0 = new Node(125, 125, 125);
        Node node1 = new Node(125, node0, node0, node0, 38, 30);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Compiler compiler0 = new Compiler();
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        Node node0 = new Node(38);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node1.isFalse();
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        Compiler compiler0 = new Compiler();
        AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
        compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        Node node0 = Node.newString(38, "NT4", 38, 38);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        Node node0 = new Node(49, 49, 49);
        Node node1 = new Node(110, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        Node node0 = new Node(49, 49, 49);
        Node node1 = new Node(110, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node2.getCharno();
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        Node node0 = new Node(49);
        Node node1 = new Node(105, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        Node node0 = new Node(49);
        Node node1 = new Node(105, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node2.getType();
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        Node node0 = new Node(49);
        Node node1 = new Node(132, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test2226() throws Throwable {
        Node node0 = new Node(49);
        Node node1 = new Node(132, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node2.hasOneChild();
    }

    @Test(timeout = 4000)
    public void test2327() throws Throwable {
        Node node0 = new Node(49);
        Node node1 = Node.newNumber((double) 45);
        Node node2 = new Node(16, node0, node1);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test2428() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        boolean boolean0 = peepholeSubstituteAlternateSyntax0.isPure((Node) null);
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = new Node(144);
        boolean boolean0 = peepholeSubstituteAlternateSyntax0.isPure(node0);
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = new Node(30);
        boolean boolean0 = peepholeSubstituteAlternateSyntax0.isPure(node0);
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = new Node(125, 125, 125);
        boolean boolean0 = peepholeSubstituteAlternateSyntax0.isPure(node0);
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        Node node0 = Node.newString("com.moXgle.common.colle\t.Re`ularImmutableMap$TerminalEntry");
        Node node1 = new Node(4, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        boolean boolean0 = peepholeSubstituteAlternateSyntax0.areMatchingExits(node1, node1);
    }

    @Test(timeout = 4000)
    public void test2933() throws Throwable {
        Node node0 = new Node(49);
        Node node1 = new Node(132, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        boolean boolean0 = peepholeSubstituteAlternateSyntax0.areMatchingExits(node0, node0);
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = new Node(125, 125, 125);
        peepholeSubstituteAlternateSyntax0.isExceptionPossible(node0);
    }

    @Test(timeout = 4000)
    public void test3135() throws Throwable {
        Node node0 = new Node(4);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        boolean boolean0 = peepholeSubstituteAlternateSyntax0.areMatchingExits(node0, node0);
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        Node node0 = new Node(101, 101, 101);
        Node node1 = new Node(4, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.areMatchingExits(node1, node1);
    }

    @Test(timeout = 4000)
    public void test3337() throws Throwable {
        Node node0 = new Node(12, 12, 12);
        Node node1 = new Node(26, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test3438() throws Throwable {
        Node node0 = new Node(45, 45, 45);
        Node node1 = new Node(26, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test3539() throws Throwable {
        Node node0 = new Node(46, 46, 46);
        Node node1 = new Node(26, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test3640() throws Throwable {
        Node node0 = new Node(63);
        Node node1 = Node.newNumber((double) 0);
        Node node2 = new Node(108, node1, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node3 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
    }

    @Test(timeout = 4000)
    public void test3641() throws Throwable {
        Node node0 = new Node(63);
        Node node1 = Node.newNumber((double) 0);
        Node node2 = new Node(108, node1, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node3 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
        node3.isIf();
    }

    @Test(timeout = 4000)
    public void test3742() throws Throwable {
        Node node0 = new Node(28, 28, 28);
        Node node1 = new Node(46, 45, 54);
        Node node2 = new Node(108, node1, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node3 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
    }

    @Test(timeout = 4000)
    public void test3843() throws Throwable {
        Node node0 = new Node(14);
        Node node1 = new Node(26, node0, node0);
        Node node2 = new Node(108, node1, node1);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
    }

    @Test(timeout = 4000)
    public void test3944() throws Throwable {
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node0 = new Node(98, 98, 98);
        Node node1 = new Node(98, node0, node0, node0, 38, 37);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test4045() throws Throwable {
        Node node0 = new Node(26);
        node0.addChildToFront(node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
    }

    @Test(timeout = 4000)
    public void test4146() throws Throwable {
        Node node0 = new Node(101, 101, 101);
        SyntheticAst syntheticAst0 = new SyntheticAst("151w8 cNpDxf\"e;%n&/");
        Compiler compiler0 = new Compiler();
        Node node1 = syntheticAst0.getAstRoot(compiler0);
        node0.addChildToBack(node1);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node2 = new Node(26, node0, node0);
        Node node3 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
    }

    @Test(timeout = 4000)
    public void test4147() throws Throwable {
        Node node0 = new Node(101, 101, 101);
        SyntheticAst syntheticAst0 = new SyntheticAst("151w8 cNpDxf\"e;%n&/");
        Compiler compiler0 = new Compiler();
        Node node1 = syntheticAst0.getAstRoot(compiler0);
        node0.addChildToBack(node1);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node2 = new Node(26, node0, node0);
        Node node3 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node2);
        node3.isAnd();
    }

    @Test(timeout = 4000)
    public void test4248() throws Throwable {
        Node node0 = Node.newNumber((double) 26);
        Node node1 = new Node(26, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test4349() throws Throwable {
        Node node0 = new Node(15);
        Node node1 = new Node(30, node0, node0, node0, 12, 2);
        Compiler compiler0 = new Compiler();
        AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test4450() throws Throwable {
        Node node0 = new Node((-891));
        Node node1 = new Node(37, node0, node0);
        Compiler compiler0 = new Compiler();
        AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
        compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        peepholeSubstituteAlternateSyntax0.beginTraversal(compiler0);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test4551() throws Throwable {
        Node node0 = new Node(49, 49, 49);
        Node node1 = new Node(44, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test4652() throws Throwable {
        Node node0 = Node.newString(63, "GK^Q.");
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node1 = new Node(63, node0, node0);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
    }

    @Test(timeout = 4000)
    public void test4753() throws Throwable {
        Node node0 = Node.newString("");
        Node node1 = new Node(63, node0, node0);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(true);
        Node node2 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node1);
        node2.isGetterDef();
    }

    @Test(timeout = 4000)
    public void test4854() throws Throwable {
        Node node0 = new Node(63);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Node node1 = peepholeSubstituteAlternateSyntax0.optimizeSubtree(node0);
        node1.isName();
    }

    @Test(timeout = 4000)
    public void test4955() throws Throwable {
        boolean boolean0 = PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\\u");
    }
}
