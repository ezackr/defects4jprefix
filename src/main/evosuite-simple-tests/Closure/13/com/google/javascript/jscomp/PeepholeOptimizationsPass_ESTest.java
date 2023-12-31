/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 03 22:27:56 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PeepholeFoldConstants;
import com.google.javascript.jscomp.PeepholeOptimizationsPass;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax;
import com.google.javascript.jscomp.StatementFusion;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PeepholeOptimizationsPass_ESTest extends PeepholeOptimizationsPass_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[3];
        PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
        AbstractCompiler abstractCompiler0 = peepholeOptimizationsPass0.getCompiler();
        assertSame(abstractCompiler0, compiler0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Compiler compiler0 = new Compiler();
        AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[0];
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "3OY>dm", "3OY>dm");
        PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
        peepholeOptimizationsPass0.process(node0, node0);
        peepholeOptimizationsPass0.process(node0, node0);
        assertFalse(node0.isBreak());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants(false);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.PreprocessorSymbolTable", "com.google.javascript.jscomp.PreprocessorSymbolTable");
        PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
        AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[4];
        abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeFoldConstants0;
        abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) peepholeRemoveDeadCode0;
        abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) peepholeFoldConstants0;
        abstractPeepholeOptimizationArray0[3] = (AbstractPeepholeOptimization) peepholeSubstituteAlternateSyntax0;
        node0.addChildToBack(node0);
        PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
        peepholeOptimizationsPass0.process(node0, node0);
        assertFalse(node0.hasMoreThanOneChild());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants(false);
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "com.google.javascript.jscomp.PreprocessorSymbolTable", "com.google.javascript.jscomp.PreprocessorSymbolTable");
        PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
        AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[4];
        abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeFoldConstants0;
        abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) peepholeRemoveDeadCode0;
        abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) peepholeFoldConstants0;
        abstractPeepholeOptimizationArray0[3] = (AbstractPeepholeOptimization) peepholeSubstituteAlternateSyntax0;
        node0.addChildToBack(node0);
        PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
        peepholeOptimizationsPass0.process(node0, node0);
        assertEquals(1, node0.getChildCount());
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "3,Ydm", ">i");
        AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[3];
        PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax0 = new PeepholeSubstituteAlternateSyntax(false);
        abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeSubstituteAlternateSyntax0;
        PeepholeFoldConstants peepholeFoldConstants0 = new PeepholeFoldConstants(false);
        abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) peepholeFoldConstants0;
        StatementFusion statementFusion0 = new StatementFusion();
        abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) statementFusion0;
        PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
        // Undeclared exception!
        try {
            peepholeOptimizationsPass0.process(node0, node0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.StatementFusion", e);
        }
    }
}
