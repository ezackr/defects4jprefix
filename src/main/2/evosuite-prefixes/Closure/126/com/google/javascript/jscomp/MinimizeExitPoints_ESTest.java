/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 07:38:57 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.Denormalize;
import com.google.javascript.jscomp.MinimizeExitPoints;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MinimizeExitPoints_ESTest extends MinimizeExitPoints_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        Node node0 = new Node(126);
        minimizeExitPoints0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, minimizeExitPoints0);
        Node node0 = new Node(105);
        minimizeExitPoints0.visit(nodeTraversal0, node0, node0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        Denormalize.StripConstantAnnotations denormalize_StripConstantAnnotations0 = new Denormalize.StripConstantAnnotations(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, denormalize_StripConstantAnnotations0);
        Node node0 = Node.newString(113, "CLOSURE", (-808), 113);
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        minimizeExitPoints0.visit(nodeTraversal0, node0, node0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, minimizeExitPoints0);
        Node node0 = Node.newString(122, "r}#", 122, (-1202));
        Node node1 = new Node(114, node0, 15, (-581));
        minimizeExitPoints0.visit(nodeTraversal0, node1, node1);
        node1.isIf();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        Node node0 = new Node(115);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, minimizeExitPoints0);
        minimizeExitPoints0.visit(nodeTraversal0, node0, node0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("runtimeTypeCheck");
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        minimizeExitPoints0.process(node0, node0);
        node0.isDebugger();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, minimizeExitPoints0);
        Node node0 = new Node(114);
        Node node1 = new Node(114, node0, 48, 48);
        minimizeExitPoints0.visit(nodeTraversal0, node1, node0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        Node node0 = Node.newString("%:beHdN|");
        Node node1 = new Node(12, node0, node0, node0, 4095, 4095);
        minimizeExitPoints0.tryMinimizeExits(node1, 12, "%:beHdN|");
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        Node node0 = compiler0.parseTestCode("t0av{o>DLC9I81>");
        Node node1 = new Node(126, node0, node0, node0, 16, 38);
        minimizeExitPoints0.tryMinimizeExits(node1, 55, "com.google.javascript.jscAmp.DefaultPassConfig$73");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        Node node0 = Node.newNumber(1131.0, (-1674), (-1674));
        Node node1 = new Node(114, node0, node0);
        minimizeExitPoints0.tryMinimizeExits(node1, 114, (String) null);
        node1.isBreak();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        Node node0 = Node.newString("j//I4%^JlvbH\"I];`");
        minimizeExitPoints0.tryMinimizeExits(node0, 40, (String) null);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        Node node0 = Node.newString("j//I4%^Jl\"4H\"I];`");
        minimizeExitPoints0.tryMinimizeExits(node0, 40, "j//I4%^Jl\"4H\"I];`");
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Compiler compiler0 = new Compiler();
        MinimizeExitPoints minimizeExitPoints0 = new MinimizeExitPoints(compiler0);
        Node node0 = Node.newString("%:beHdN5");
        Node node1 = new Node(3, node0, node0, node0, 4095, 4095);
        minimizeExitPoints0.tryMinimizeExits(node1, 3, "%:beHdN|");
        node1.isCall();
    }
}
