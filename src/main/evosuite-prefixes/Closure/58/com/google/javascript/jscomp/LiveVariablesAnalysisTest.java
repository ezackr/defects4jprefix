/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 02:53:30 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.LiveVariablesAnalysis;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import java.util.Set;
import org.junit.runner.RunWith;

public class LiveVariablesAnalysisTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "g5xD3>UEB(/^Ayc{\"o", "g5xD3>UEB(/^Ayc{\"o");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, false);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        Set<Scope.Var> set0 = liveVariablesAnalysis0.getEscapedLocals();
        set0.size();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.getVarIndex("arguments");
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
        liveVariablesAnalysis_LiveVariableLattice0.isLive((Scope.Var) null);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
        String string0 = liveVariablesAnalysis_LiveVariableLattice0.toString();
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "", "");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, false, false);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
        boolean boolean0 = liveVariablesAnalysis_LiveVariableLattice0.isLive(0);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "}A=P@Yq[Qhyj", "}A=P@Yq[Qhyj");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createEntryLattice();
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice1 = liveVariablesAnalysis0.join(liveVariablesAnalysis_LiveVariableLattice0, liveVariablesAnalysis_LiveVariableLattice0);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "g5xD3>UE?$(/^Ayc{\"o", "g5xD3>UE?$(/^Ayc{\"o");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        LiveVariablesAnalysis.LiveVariableLattice liveVariablesAnalysis_LiveVariableLattice0 = liveVariablesAnalysis0.createInitialEstimateLattice();
        boolean boolean0 = liveVariablesAnalysis_LiveVariableLattice0.equals("g5xD3>UE?$(/^Ayc{\"o");
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("R", "R");
        Node node1 = Node.newString(118, "R");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
        node1.addChildrenToFront(node0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(32);
    }

    @Test(timeout = 4000)
    public void test108() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("eJp {+KUEi:~ !9q=Xw,", "eJp {+KUEi:~ !9q=Xw,");
        Node node1 = Node.newString(98, "eJp {+KUEi:~ !9q=Xw,");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(4);
    }

    @Test(timeout = 4000)
    public void test119() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ")Gg8=cacX>>r|gD", ")Gg8=cacX>>r|gD");
        Node node1 = Node.newString(100, "Should be unreachable.");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(2);
    }

    @Test(timeout = 4000)
    public void test1210() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "%", "%");
        Node node1 = Node.newString(101, "%");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(35);
    }

    @Test(timeout = 4000)
    public void test1411() throws Throwable {
        Compiler compiler0 = new Compiler();
        Normalize.parseAndNormalizeTestCode(compiler0, "", "");
        Node node0 = Node.newString(108, "");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(5);
    }

    @Test(timeout = 4000)
    public void test1512() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "%", "%");
        Node node1 = Node.newString(113, "%");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(15);
    }

    @Test(timeout = 4000)
    public void test1613() throws Throwable {
        Compiler compiler0 = new Compiler();
        Normalize.parseAndNormalizeTestCode(compiler0, "U.Pv<", "U.Pv<");
        Node node0 = Node.newString(114, "U.Pv<");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(1);
    }

    @Test(timeout = 4000)
    public void test1714() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscmp.LiveVaiabesAnalysis$LiveVariableJoinOp", "com.google.javascript.jscmp.LiveVaiabesAnalysis$LiveVariableJoinOp");
        Node node1 = Node.newString(115, "com.google.javascript.jscmp.LiveVaiabesAnalysis$LiveVariableJoinOp");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(36);
    }

    @Test(timeout = 4000)
    public void test2115() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("R", "R");
        Node node1 = Node.newString(118, "R");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
        scope0.declare("R", node0, (JSType) null, (CompilerInput) null, true);
        node1.addChildrenToFront(node0);
        LiveVariablesAnalysis liveVariablesAnalysis0 = new LiveVariablesAnalysis(controlFlowGraph0, scope0, compiler0);
        liveVariablesAnalysis0.analyze(32);
    }
}
