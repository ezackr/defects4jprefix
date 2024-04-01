/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 03 22:25:07 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.MaybeReachingVariableUse;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MaybeReachingVariableUse_ESTest extends MaybeReachingVariableUse_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode(";");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        maybeReachingVariableUse0.getUses(";", node0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("TI");
        PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
        Compiler compiler0 = new Compiler(printStreamErrorManager0);
        Node node0 = compiler0.parseTestCode("TI");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        maybeReachingVariableUse0.analyze();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("TI");
        PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
        Compiler compiler0 = new Compiler(printStreamErrorManager0);
        Node node0 = compiler0.parseTestCode("TI");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
        mockPrintStream0.println((Object) maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
        boolean boolean0 = maybeReachingVariableUse_ReachingUses0.equals("\"/3Q]<;`G']WVI]hu");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("TI");
        PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
        Compiler compiler0 = new Compiler(printStreamErrorManager0);
        Node node0 = compiler0.parseTestCode("TI");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        InputId inputId0 = node0.getInputId();
        CompilerInput compilerInput0 = compiler0.getInput(inputId0);
        scope0.declare("TI", node0, (JSType) null, compilerInput0, false);
        maybeReachingVariableUse0.analyze();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode(";");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.join(maybeReachingVariableUse_ReachingUses0, maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("TI");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        Node node1 = new Node(98, node0, node0, node0, node0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
        maybeReachingVariableUse0.flowThrough(node1, maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("TI", "TI");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
        Node node1 = new Node(100, node0, node0, node0, node0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node1, maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("TI");
        PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
        Compiler compiler0 = new Compiler(printStreamErrorManager0);
        Node node0 = compiler0.parseTestCode("TI");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
        Node node1 = new Node(101, node0, node0, node0, node0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node1, maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("TI");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
        Node node1 = new Node(105, 45, 37);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node1, maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("Tb");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
        Node node1 = Node.newString(108, "/YfP>:^EV(lPK", 1, 52);
        maybeReachingVariableUse0.flowThrough(node1, maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("TI");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
        Node node1 = new Node(113, node0, node0, node0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node1, maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode(";");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        Node node1 = new Node(114, node0, node0, node0, node0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node1, maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("Tb");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
        Node node1 = new Node(115, 45, 37);
        maybeReachingVariableUse0.flowThrough(node1, maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("TI");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        Node node1 = new Node(118, node0, node0, node0, node0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = new MaybeReachingVariableUse.ReachingUses();
        maybeReachingVariableUse0.flowThrough(node1, maybeReachingVariableUse_ReachingUses0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        MockPrintStream mockPrintStream0 = new MockPrintStream("TI");
        PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(mockPrintStream0);
        Compiler compiler0 = new Compiler(printStreamErrorManager0);
        Node node0 = compiler0.parseTestCode("TI");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
        Scope scope0 = new Scope(node0, compiler0);
        MaybeReachingVariableUse maybeReachingVariableUse0 = new MaybeReachingVariableUse(controlFlowGraph0, scope0, compiler0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses0 = maybeReachingVariableUse0.createEntryLattice();
        Node node1 = new Node(91, node0, node0, node0, node0);
        MaybeReachingVariableUse.ReachingUses maybeReachingVariableUse_ReachingUses1 = maybeReachingVariableUse0.flowThrough(node1, maybeReachingVariableUse_ReachingUses0);
    }
}
