/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 02:28:30 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Supplier;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerPass;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.RenameLabels;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MakeDeclaredNamesUnique_ESTest extends MakeDeclaredNamesUnique_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        MakeDeclaredNamesUnique.getContextualRenameInverter(compiler0);
        // Undeclared exception!
        try {
            Normalize.parseAndNormalizeTestCode(compiler0, "arguments", "arguments");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // duplicate key: consistentIdGenerator
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
        Compiler compiler0 = new Compiler();
        // Undeclared exception!
        try {
            compiler0.parseTestCode("function JSCompiler_mptyFn() {  return function() {}}");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // duplicate key: consistentIdGenerator
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        // Undeclared exception!
        try {
            compiler0.parseTestCode("function JSCompiler_emptyFn() {  return function() {}}");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // duplicate key: consistentIdGenerator
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
        Compiler compiler0 = new Compiler();
        // Undeclared exception!
        try {
            compiler0.parseTestCode("function JSCompiler_mptyFn() {  return function() {}}");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // duplicate key: consistentIdGenerator
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
        MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer(renameLabels_DefaultNameSupplier0, "GJ");
        MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique(makeDeclaredNamesUnique_BoilerplateRenamer0);
        Compiler compiler0 = new Compiler();
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0, (ScopeCreator) null);
        Node node0 = new Node(120);
        // Undeclared exception!
        try {
            makeDeclaredNamesUnique0.visit(nodeTraversal0, node0, node0);
            fail("Expecting exception: NoSuchElementException");
        } catch (NoSuchElementException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("java.util.ArrayDeque", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
        MakeDeclaredNamesUnique.BoilerplateRenamer makeDeclaredNamesUnique_BoilerplateRenamer0 = new MakeDeclaredNamesUnique.BoilerplateRenamer(renameLabels_DefaultNameSupplier0, "1(T~E!mQO-");
        MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = (MakeDeclaredNamesUnique.InlineRenamer) makeDeclaredNamesUnique_BoilerplateRenamer0.forChildScope();
        makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("1(T~E!mQO-");
        makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("1(T~E!mQO-");
        assertFalse(makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
        Node node0 = new Node(105);
        Compiler compiler0 = new Compiler();
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
        // Undeclared exception!
        try {
            nodeTraversal0.traverse(node0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // INTERNAL COMPILER ERROR.
            // Please report this problem.
            // null
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Node node0 = new Node(105, 105, 105);
        Compiler compiler0 = new Compiler();
        MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique((MakeDeclaredNamesUnique.Renamer) null);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
        // Undeclared exception!
        try {
            nodeTraversal0.traverse(node0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        MakeDeclaredNamesUnique makeDeclaredNamesUnique0 = new MakeDeclaredNamesUnique();
        Compiler compiler0 = new Compiler();
        Node node0 = new Node(120);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, makeDeclaredNamesUnique0);
        // Undeclared exception!
        try {
            nodeTraversal0.traverse(node0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        String string0 = MakeDeclaredNamesUnique.ContextualRenameInverter.getOrginalName("arguments");
        assertEquals("arguments", string0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Compiler compiler0 = new Compiler();
        MakeDeclaredNamesUnique.getContextualRenameInverter(compiler0);
        // Undeclared exception!
        try {
            compiler0.parseTestCode("function JSCompiler_mptyFn() {  return function() {}}");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // duplicate key: consistentIdGenerator
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
        makeDeclaredNamesUnique_ContextualRenamer0.addDeclaredName("arguments");
        assertFalse(makeDeclaredNamesUnique_ContextualRenamer0.stripConstIfReplaced());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer0 = new MakeDeclaredNamesUnique.ContextualRenamer();
        MakeDeclaredNamesUnique.ContextualRenamer makeDeclaredNamesUnique_ContextualRenamer1 = (MakeDeclaredNamesUnique.ContextualRenamer) makeDeclaredNamesUnique_ContextualRenamer0.forChildScope();
        makeDeclaredNamesUnique_ContextualRenamer1.addDeclaredName(" Done ");
        makeDeclaredNamesUnique_ContextualRenamer1.addDeclaredName(" Done ");
        assertNotSame(makeDeclaredNamesUnique_ContextualRenamer1, makeDeclaredNamesUnique_ContextualRenamer0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier((Supplier<String>) null);
        MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = null;
        try {
            makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(functionToBlockMutator_LabelNameSupplier0, "", false);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer((Supplier<String>) null, "yQf5~J/-Bky", true);
        // Undeclared exception!
        try {
            makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("arguments");
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.common.base.Preconditions", e);
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(supplier0, "arguments", true);
        makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("");
        assertTrue(makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced());
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        RenameLabels.DefaultNameSupplier renameLabels_DefaultNameSupplier0 = new RenameLabels.DefaultNameSupplier();
        MakeDeclaredNamesUnique.InlineRenamer makeDeclaredNamesUnique_InlineRenamer0 = new MakeDeclaredNamesUnique.InlineRenamer(renameLabels_DefaultNameSupplier0, "arguments", true);
        makeDeclaredNamesUnique_InlineRenamer0.addDeclaredName("$$");
        assertTrue(makeDeclaredNamesUnique_InlineRenamer0.stripConstIfReplaced());
    }
}
