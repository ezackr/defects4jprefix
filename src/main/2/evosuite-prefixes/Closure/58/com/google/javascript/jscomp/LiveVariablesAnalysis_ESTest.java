/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 02:52:05 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.LiveVariablesAnalysis;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.Tracer;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class LiveVariablesAnalysis_ESTest extends LiveVariablesAnalysis_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Logger logger0 = Tracer.logger;
        LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
        Compiler compiler0 = new Compiler(loggerErrorManager0);
        JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("H", (Charset) null);
        Node node0 = compiler0.parse(jSSourceFile0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        Set<Scope.Var> set0 = liveVariablesAnalysis0.getEscapedLocals();
        set0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Logger logger0 = Tracer.logger;
        LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
        Compiler compiler0 = new Compiler(loggerErrorManager0);
        JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("H", (Charset) null);
        Node node0 = compiler0.parse(jSSourceFile0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.getVarIndex("");
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode(",k", ",k");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
        liveVariablesAnalysis_LiveVariableLattice0.isLive((Scope.Var) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Logger logger0 = Tracer.logger;
        LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
        Compiler compiler0 = new Compiler(loggerErrorManager0);
        JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("H", (Charset) null);
        Node node0 = compiler0.parse(jSSourceFile0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
        String string0 = liveVariablesAnalysis_LiveVariableLattice0.toString();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Logger logger0 = Tracer.logger;
        LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
        Compiler compiler0 = new Compiler(loggerErrorManager0);
        JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("H", (Charset) null);
        Node node0 = compiler0.parse(jSSourceFile0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
        boolean boolean0 = liveVariablesAnalysis_LiveVariableLattice0.isLive(49);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("H", "}/a\";;={-6+d!0_'");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.join(liveVariablesAnalysis_LiveVariableLattice0, liveVariablesAnalysis_LiveVariableLattice0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        JSSourceFile jSSourceFile0 = JSSourceFile.fromCode("H", "H");
        Node node0 = compiler0.parse(jSSourceFile0);
        Scope scope0 = new Scope(node0, compiler0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
        boolean boolean0 = liveVariablesAnalysis_LiveVariableLattice0.equals(compiler0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode(",k", ",k");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, false);
        ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_EX;
        controlFlowGraph0.connectToImplicitReturn(node0, controlFlowGraph_Branch0);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(23);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Logger logger0 = Tracer.logger;
        LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
        Compiler compiler0 = new Compiler(loggerErrorManager0);
        JSSourceFile jSSourceFile0 = JSSourceFile.fromFile("H", (Charset) null);
        Node node0 = compiler0.parse(jSSourceFile0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        ControlFlowGraph.Branch controlFlowGraph_Branch0 = ControlFlowGraph.Branch.ON_FALSE;
        controlFlowGraph0.connectToImplicitReturn(node0, controlFlowGraph_Branch0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.flowThrough(node0, liveVariablesAnalysis_LiveVariableLattice0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("=", "=");
        Node node1 = new Node(38, node0, node0, node0, 8, 38);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(25);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("H", "H");
        Node node1 = new Node(100, node0, node0, node0, (-665), 49);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(1);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode(",k", ",k");
        Node node1 = new Node(101, node0, node0, node0, 895, 28);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(16);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("H", "H");
        Node node1 = new Node(105, node0, node0, node0, (-665), 49);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(44);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode(",k", ",k");
        Node node1 = Node.newString(108, ",k", 99, (-51));
        Node node2 = new Node(48, node1, node0, node0, 8, 85);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node2, true, true);
        Scope scope0 = new Scope(node2, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(31);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("H", "H");
        Node node1 = new Node(113, node0, node0, node0, 0, 49);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(28);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode(",k", ",k");
        Node node1 = new Node(114, node0, node0, node0, (-2173), 1000);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(51);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("YH", "YH");
        Node node1 = new Node(115, node0, node0, node0, 2, 15);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, false);
        Scope scope0 = new Scope(node1, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(52);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("Y~d_Sg9@*Z", "Y~d_Sg9@*Z");
        Node node1 = new Node(118, node0, node0, node0, 353, 132);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, false);
        Scope scope0 = new Scope(node1, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(16);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("H", "}/a\";;={-6+d!0_'");
        Node node1 = new Node(89, node0, node0, node0, 2, 49);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(26);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode(",k", ",k");
        Node node1 = Node.newString(1, ",k", 13, 2);
        Node node2 = new Node(4095, node0, node0, node1, 7, 39);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node2, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.markAllParametersEscaped();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock", "com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock");
        Node node1 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock", "com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock");
        Node node2 = new Node(4095, node0, node0, node1, 7, 39);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node2, compiler0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.markAllParametersEscaped();
    }
}
