/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 21:56:06 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerInput;
import com.google.javascript.jscomp.ControlFlowGraph;
import com.google.javascript.jscomp.MustBeReachingVariableDef;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MustBeReachingVariableDef_ESTest extends MustBeReachingVariableDef_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("arguments", "arguments");
        Node node1 = new Node(54, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        SyntheticAst syntheticAst0 = new SyntheticAst("arguments");
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0);
        scope0.declare("arguments", node0, (JSType) null, compilerInput0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("arguments");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        SyntheticAst syntheticAst0 = new SyntheticAst("arguments");
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0);
        scope0.declare("arguments", node0, (JSType) null, compilerInput0);
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = mustBeReachingVariableDef0.createEntryLattice();
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.join(mustBeReachingVariableDef_MustDef0, mustBeReachingVariableDef_MustDef0);
        mustBeReachingVariableDef_MustDef1.equals((Object) mustBeReachingVariableDef_MustDef0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = new MustBeReachingVariableDef.MustDef();
        Object object0 = new Object();
        boolean boolean0 = mustBeReachingVariableDef_MustDef0.equals(object0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("ar:=guments");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        SyntheticAst syntheticAst0 = new SyntheticAst("ar:=guments");
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0);
        scope0.declare("ar:=guments", node0, (JSType) null, compilerInput0);
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = mustBeReachingVariableDef0.createEntryLattice();
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.createInitialEstimateLattice();
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef2 = mustBeReachingVariableDef0.join(mustBeReachingVariableDef_MustDef0, mustBeReachingVariableDef_MustDef1);
        mustBeReachingVariableDef_MustDef2.equals((Object) mustBeReachingVariableDef_MustDef0);
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("ar:=guments");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        SyntheticAst syntheticAst0 = new SyntheticAst("ar:=guments");
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0);
        scope0.declare("ar:=guments", node0, (JSType) null, compilerInput0);
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = mustBeReachingVariableDef0.createEntryLattice();
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.createInitialEstimateLattice();
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef2 = mustBeReachingVariableDef0.join(mustBeReachingVariableDef_MustDef0, mustBeReachingVariableDef_MustDef1);
        mustBeReachingVariableDef_MustDef2.equals((Object) mustBeReachingVariableDef_MustDef1);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("com.google.javascriptjscomp.DefaultPassConfig$31");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        SyntheticAst syntheticAst0 = new SyntheticAst("com.google.javascriptjscomp.DefaultPassConfig$31");
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0);
        scope0.declare("com.google.javascriptjscomp.DefaultPassConfig$31", node0, (JSType) null, compilerInput0);
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = mustBeReachingVariableDef0.createEntryLattice();
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.createInitialEstimateLattice();
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef2 = mustBeReachingVariableDef0.join(mustBeReachingVariableDef_MustDef1, mustBeReachingVariableDef_MustDef0);
        mustBeReachingVariableDef_MustDef1.equals((Object) mustBeReachingVariableDef_MustDef0);
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("com.google.javascriptjscomp.DefaultPassConfig$31");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        SyntheticAst syntheticAst0 = new SyntheticAst("com.google.javascriptjscomp.DefaultPassConfig$31");
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0);
        scope0.declare("com.google.javascriptjscomp.DefaultPassConfig$31", node0, (JSType) null, compilerInput0);
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef0 = mustBeReachingVariableDef0.createEntryLattice();
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef1 = mustBeReachingVariableDef0.createInitialEstimateLattice();
        MustBeReachingVariableDef.MustDef mustBeReachingVariableDef_MustDef2 = mustBeReachingVariableDef0.join(mustBeReachingVariableDef_MustDef1, mustBeReachingVariableDef_MustDef0);
        mustBeReachingVariableDef_MustDef2.equals((Object) mustBeReachingVariableDef_MustDef0);
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("1?xQ.Wk>C:W", "1?xQ.Wk>C:W");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
        Node node1 = mustBeReachingVariableDef0.getDef("1?xQ.Wk>C:W", node0);
    }

    @Test(timeout = 4000)
    public void test068() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("misnI pop2: ");
        Node node1 = new Node(99, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("mssin pp2: ");
        Node node1 = new Node(100, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("missing pop2: ");
        Node node1 = new Node(102, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("com.google.javascript.jscomp.CrossModuleMethodMotion");
        Node node1 = new Node(103, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("checkDebuggerStatement", "checkDebuggerStatement");
        Node node1 = new Node(105, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("ar?D:1s=guients");
        Node node1 = new Node(106, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("ar?D:1s=guients");
        Node node1 = new Node(107, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("missing pop2: ");
        Node node1 = new Node(109, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("missing prop: ");
        Node node1 = new Node(110, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("missing pop2: ");
        Node node1 = new Node(111, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("gumpnts");
        Node node1 = new Node(112, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        Compiler compiler0 = new Compiler();
        compiler0.parseSyntheticCode("arguments", "arguments");
        Node node0 = Node.newString(113, "arguments");
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("missing pop2: ");
        Node node1 = new Node(115, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("ar?D:1s=guients");
        Node node1 = new Node(116, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("ar?D:1s=guments");
        Node node1 = new Node(117, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("arHOguments");
        Node node1 = new Node(118, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, false);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("missing pop2: ");
        Node node1 = new Node(120, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("ar?D:1s=oumentZ");
        Node node1 = new Node(121, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("mssin Hg\"App2: ");
        Node node1 = new Node(122, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("missing pop: ");
        Node node1 = new Node(123, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("missing pop: ");
        Node node1 = new Node(124, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test2729() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("missing pop2: ");
        Node node1 = new Node(125, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("arHOguments");
        Node node1 = new Node(118, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node1, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        node0.removeChildren();
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("missing pop2: ");
        Node node1 = new Node(96, node0, node0, node0, node0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node1, true, true);
        Scope scope0 = new Scope(node0, compiler0);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        mustBeReachingVariableDef0.analyze();
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("1?xQ.Wk>C:W", "1?xQ.Wk>C:W");
        Scope scope0 = new Scope(node0, compiler0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        SyntheticAst syntheticAst0 = new SyntheticAst("1?xQ.Wk>C:W");
        InputId inputId0 = node0.getInputId();
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0, inputId0, true);
        scope0.declare("1?xQ.Wk>C:W", node0, (JSType) null, compilerInput0);
        mustBeReachingVariableDef0.analyze();
        Node node1 = mustBeReachingVariableDef0.getDef("1?xQ.Wk>C:W", node0);
        node1.isLabelName();
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("1?xQ.Wk>C:W", "1?xQ.Wk>C:W");
        Scope scope0 = new Scope(node0, compiler0);
        ControlFlowGraph<Node> controlFlowGraph0 = new ControlFlowGraph<Node>(node0, true, true);
        MustBeReachingVariableDef mustBeReachingVariableDef0 = new MustBeReachingVariableDef(controlFlowGraph0, scope0, compiler0);
        SyntheticAst syntheticAst0 = new SyntheticAst("1?xQ.Wk>C:W");
        InputId inputId0 = node0.getInputId();
        CompilerInput compilerInput0 = new CompilerInput(syntheticAst0, inputId0, true);
        scope0.declare("1?xQ.Wk>C:W", node0, (JSType) null, compilerInput0);
        mustBeReachingVariableDef0.analyze();
        boolean boolean0 = mustBeReachingVariableDef0.dependsOnOuterScopeVars("1?xQ.Wk>C:W", node0);
    }
}
