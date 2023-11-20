/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 23:11:07 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.MemoizedScopeCreator;
import com.google.javascript.jscomp.Scope;
import com.google.javascript.jscomp.SyntacticScopeCreator;
import com.google.javascript.rhino.Node;
import org.junit.runner.RunWith;

public class SyntacticScopeCreatorTest {

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("");
        node0.addChildToBack(node0);
        Node node1 = Node.newString(16, "", 1, 2);
        node0.addChildrenToFront(node1);
        node0.setType(105);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        syntacticScopeCreator0.createScope(node0, (Scope) null);
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("M&-2&wprH6VBXQ!!Yc");
        Scope scope0 = compiler0.getTopScope();
        node0.addChildToBack(node0);
        Node node1 = Node.newString(16, "M&-2&wprH6VBXQ!!Yc", 1, 2);
        node0.addChildrenToFront(node1);
        node0.setType(105);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        syntacticScopeCreator0.createScope(node0, scope0);
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("iuKQ=,{jc2|fvlSo_j");
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Node node1 = compiler0.parseTestCode("iuKQ=,{jc2|fvlSo_j");
        MemoizedScopeCreator memoizedScopeCreator0 = new MemoizedScopeCreator(syntacticScopeCreator0);
        Scope scope0 = memoizedScopeCreator0.createScope(node0, (Scope) null);
        syntacticScopeCreator0.createScope(node1, scope0);
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("M&-2#wprH6+BXQ!!Yc");
        Node node1 = Node.newString("M&-2#wprH6+BXQ!!Yc");
        node0.addChildrenToFront(node1);
        node1.setType(105);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        syntacticScopeCreator0.createScope(node0, (Scope) null);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("exec");
        node0.setType(118);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        syntacticScopeCreator0.createScope(node0, (Scope) null);
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("x", "x");
        node0.setType(120);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        syntacticScopeCreator0.createScope(node0, (Scope) null);
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("Z");
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        scope0.isGlobal();
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode(")Z=0'Q`YxH1Ue_{r");
        node0.setType(118);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        scope0.isLocal();
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("x", "x");
        node0.addChildrenToFront(node0);
        node0.setType(120);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        syntacticScopeCreator0.createScope(node0, (Scope) null);
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("exec");
        node0.setType(108);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node0, (Scope) null);
        scope0.isLocal();
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("M&-2&wprH6VBXQ!!Yc");
        node0.addChildToBack(node0);
        Node node1 = Node.newString(16, "M&-2&wprH6VBXQ!!Yc", 1, 2);
        node0.addChildrenToFront(node1);
        node0.setType(105);
        SyntacticScopeCreator syntacticScopeCreator0 = new SyntacticScopeCreator(compiler0);
        Scope scope0 = syntacticScopeCreator0.createScope(node1, (Scope) null);
        syntacticScopeCreator0.createScope(node0, scope0);
    }
}
