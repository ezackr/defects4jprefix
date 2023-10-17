/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 05:28:22 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.SyntheticAst;
import com.google.javascript.rhino.Node;
import org.junit.runner.RunWith;

public class NormalizeTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        SyntheticAst syntheticAst0 = new SyntheticAst("2P!+5?z");
        Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
        Node node1 = Node.newNumber(2333.03989812353, 1269, 113);
        Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, false);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_NormalizeStatements0);
        normalize_NormalizeStatements0.shouldTraverse(nodeTraversal0, node1, node0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, true);
        Node node0 = Node.newString("bitor", 661, 661);
        normalize_NormalizeStatements0.visit((NodeTraversal) null, node0, (Node) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Normalize.PropagateConstantAnnotationsOverVars normalize_PropagateConstantAnnotationsOverVars0 = new Normalize.PropagateConstantAnnotationsOverVars((AbstractCompiler) null, false);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_PropagateConstantAnnotationsOverVars0);
        Node node0 = Node.newString((-111), "not", 126, (-1275));
        normalize_PropagateConstantAnnotationsOverVars0.visit(nodeTraversal0, node0, node0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, true);
        Node node0 = Node.newString("bitor", 661, 661);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_NormalizeStatements0);
        Node node1 = Node.newNumber((double) 17);
        Normalize.PropagateConstantAnnotationsOverVars normalize_PropagateConstantAnnotationsOverVars0 = new Normalize.PropagateConstantAnnotationsOverVars((AbstractCompiler) null, true);
        normalize_PropagateConstantAnnotationsOverVars0.visit(nodeTraversal0, node1, node0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Normalize.PropagateConstantAnnotationsOverVars normalize_PropagateConstantAnnotationsOverVars0 = new Normalize.PropagateConstantAnnotationsOverVars((AbstractCompiler) null, false);
        Node node0 = Node.newNumber(2333.03989812353, 1269, 113);
        normalize_PropagateConstantAnnotationsOverVars0.process(node0, (Node) null);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Normalize normalize0 = new Normalize((AbstractCompiler) null, false);
        Node node0 = new Node((-1));
        Node node1 = Node.newNumber((double) 25);
        normalize0.process(node0, node1);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Normalize.parseAndNormalizeTestCode((AbstractCompiler) null, (String) null, "Mz");
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Normalize.parseAndNormalizeSyntheticCode((AbstractCompiler) null, "com.google.javascript.jscomp.Normalize$NormalizeStatements", "LABEL normalization");
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Node node0 = new Node(126, 126, 126);
        Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, true);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_NormalizeStatements0);
        normalize_NormalizeStatements0.shouldTraverse(nodeTraversal0, node0, (Node) null);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, true);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_NormalizeStatements0);
        Node node0 = Node.newString(113, "\"q^}]=QO`Ix<l\"6A", 113, 3642);
        normalize_NormalizeStatements0.visit(nodeTraversal0, node0, node0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, true);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_NormalizeStatements0);
        Node node0 = Node.newString(105, "\"q^}]=QO`Ix<lU\"6A", 105, 3621);
        normalize_NormalizeStatements0.visit(nodeTraversal0, node0, node0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, true);
        Node node0 = Node.newString("bitor", 661, 661);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_NormalizeStatements0);
        Node node1 = Node.newNumber((double) 17);
        normalize_NormalizeStatements0.visit(nodeTraversal0, node1, node0);
        node1.isOnlyModifiesThisCall();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Normalize.PropagateConstantAnnotationsOverVars normalize_PropagateConstantAnnotationsOverVars0 = new Normalize.PropagateConstantAnnotationsOverVars((AbstractCompiler) null, false);
        NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) null, normalize_PropagateConstantAnnotationsOverVars0);
        SyntheticAst syntheticAst0 = new SyntheticAst("2P!+5?z");
        Node node0 = syntheticAst0.getAstRoot((AbstractCompiler) null);
        Normalize.NormalizeStatements normalize_NormalizeStatements0 = new Normalize.NormalizeStatements((AbstractCompiler) null, true);
        normalize_NormalizeStatements0.shouldTraverse(nodeTraversal0, node0, node0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Normalize.VerifyConstants normalize_VerifyConstants0 = null;
        normalize_VerifyConstants0 = new Normalize.VerifyConstants((AbstractCompiler) null, true);
    }
}
