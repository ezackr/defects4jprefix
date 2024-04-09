/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 00:10:32 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ExploitAssigns;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.PeepholeCollectPropertyAssignments;
import com.google.javascript.jscomp.PeepholeOptimizationsPass;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.ReorderConstantExpression;
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
        AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[4];
        PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
        abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeRemoveDeadCode0;
        ExploitAssigns exploitAssigns0 = new ExploitAssigns();
        abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) exploitAssigns0;
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments0 = new PeepholeCollectPropertyAssignments();
        abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
        ReorderConstantExpression reorderConstantExpression0 = new ReorderConstantExpression();
        abstractPeepholeOptimizationArray0[3] = (AbstractPeepholeOptimization) reorderConstantExpression0;
        PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ";hF", ";hF");
        peepholeOptimizationsPass0.process(node0, node0);
        node0.hasMoreThanOneChild();
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Compiler compiler0 = new Compiler();
        AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[4];
        PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
        abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeRemoveDeadCode0;
        ExploitAssigns exploitAssigns0 = new ExploitAssigns();
        abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) exploitAssigns0;
        PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments0 = new PeepholeCollectPropertyAssignments();
        abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
        ReorderConstantExpression reorderConstantExpression0 = new ReorderConstantExpression();
        abstractPeepholeOptimizationArray0[3] = (AbstractPeepholeOptimization) reorderConstantExpression0;
        PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, ";hF", ";hF");
        peepholeOptimizationsPass0.process(node0, node0);
        node0.hasChildren();
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        Compiler compiler0 = new Compiler();
        AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[5];
        PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
        AbstractCompiler abstractCompiler0 = peepholeOptimizationsPass0.getCompiler();
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Compiler compiler0 = new Compiler();
        AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[0];
        PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "JSC_MSG_HAS_NO_TEXT", "JSC_MSG_HAS_NO_TEXT");
        peepholeOptimizationsPass0.process(node0, node0);
        peepholeOptimizationsPass0.process(node0, node0);
        node0.isIn();
    }
}
