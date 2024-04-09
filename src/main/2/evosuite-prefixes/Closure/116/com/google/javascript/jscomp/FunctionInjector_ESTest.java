/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 07:09:43 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.CheckGlobalThis;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionInjector;
import com.google.javascript.jscomp.FunctionToBlockMutator;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.NameAnalyzer;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.ScopeCreator;
import com.google.javascript.rhino.Node;
import java.util.Set;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class FunctionInjector_ESTest extends FunctionInjector_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        functionInjector0.maybePrepareCall((Node) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        Node node0 = Node.newNumber((-4.306247216468597));
        CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
        CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
        node0.addChildToFront(node0);
        // Undeclared exception!
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, node0, compilerOptions0.stripNamePrefixes, functionInjector_InliningMode0, false, false);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        Node node0 = Node.newNumber(2766.513);
        CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
        CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
        Node node1 = new Node(15, node0, node0);
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, true);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node1, node1, compilerOptions0.stripTypePrefixes, functionInjector_InliningMode0, false, true);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        Node node0 = Node.newNumber(1.2);
        CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
        CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0, (ScopeCreator) null);
        Node node1 = new Node(1, node0, node0);
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node1, node1, compilerOptions0.stripNameSuffixes, functionInjector_InliningMode0, false, true);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        Node node0 = Node.newNumber(2500.29564595132);
        CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
        CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0);
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        node0.addChildToFront(node0);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, node0, compilerOptions0.stripTypePrefixes, functionInjector_InliningMode0, true, false);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        Node node0 = Node.newNumber(2500.29564595132);
        CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
        CheckGlobalThis checkGlobalThis0 = new CheckGlobalThis(compiler0);
        Node node1 = new Node(38, node0, node0);
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        node0.addChildToFront(node1);
        NodeTraversal nodeTraversal0 = new NodeTraversal(compiler0, checkGlobalThis0);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
        functionInjector0.canInlineReferenceToFunction(nodeTraversal0, node0, node1, compilerOptions0.stripTypePrefixes, functionInjector_InliningMode0, true, false);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED;
        compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        functionInjector0.inline((Node) null, (String) null, (Node) null, functionInjector_InliningMode0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        AbstractCompiler.LifeCycleStage abstractCompiler_LifeCycleStage0 = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        compiler0.setLifeCycleStage(abstractCompiler_LifeCycleStage0);
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
        functionInjector0.inline((Node) null, (String) null, (Node) null, functionInjector_InliningMode0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        CompilerOptions compilerOptions0 = new CompilerOptions();
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
        FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
        ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0);
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, immutableList0, compilerOptions0.stripNameSuffixes, true, true);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        Node node0 = Node.newNumber(2500.29564595132);
        CompilerOptions compilerOptions0 = new CompilerOptions();
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        Stack<FunctionInjector.Reference> stack0 = new Stack<FunctionInjector.Reference>();
        boolean boolean0 = functionInjector0.inliningLowersCost((JSModule) null, node0, stack0, compilerOptions0.stripTypePrefixes, false, false);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
        FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, (JSModule) null, functionInjector_InliningMode0);
        ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0);
        functionInjector0.inliningLowersCost((JSModule) null, (Node) null, immutableList0, compilerOptions0.stripTypes, false, false);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        JSModule jSModule0 = new JSModule("Found duHlicate symbol %s in its scope. Type %s");
        Node node0 = Node.newNumber(50.47369);
        CompilerOptions compilerOptions0 = new CompilerOptions();
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
        FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference(node0, (JSModule) null, functionInjector_InliningMode0);
        ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0, functionInjector_Reference0);
        functionInjector0.inliningLowersCost(jSModule0, node0, immutableList0, compilerOptions0.stripNameSuffixes, true, false);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
        JSModule jSModule0 = new JSModule((String) null);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
        FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, jSModule0, functionInjector_InliningMode0);
        ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0, functionInjector_Reference0);
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        functionInjector0.inliningLowersCost(jSModule0, (Node) null, immutableList0, compilerOptions0.aliasableStrings, true, false);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        CompilerOptions compilerOptions0 = compiler0.newCompilerOptions();
        JSModule jSModule0 = new JSModule((String) null);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.BLOCK;
        FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, jSModule0, functionInjector_InliningMode0);
        ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0, functionInjector_Reference0);
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        JSModule jSModule1 = new JSModule("uHA2w;jU ");
        functionInjector0.inliningLowersCost(jSModule1, (Node) null, immutableList0, compilerOptions0.aliasableStrings, true, false);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Compiler compiler0 = new Compiler();
        CompilerOptions compilerOptions0 = new CompilerOptions();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        FunctionToBlockMutator.LabelNameSupplier functionToBlockMutator_LabelNameSupplier0 = new FunctionToBlockMutator.LabelNameSupplier(supplier0);
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, functionToBlockMutator_LabelNameSupplier0, false, false, true);
        FunctionInjector.InliningMode functionInjector_InliningMode0 = FunctionInjector.InliningMode.DIRECT;
        JSModule jSModule0 = new JSModule((String) null);
        FunctionInjector.Reference functionInjector_Reference0 = new FunctionInjector.Reference((Node) null, jSModule0, functionInjector_InliningMode0);
        ImmutableList<FunctionInjector.Reference> immutableList0 = ImmutableList.of(functionInjector_Reference0);
        boolean boolean0 = functionInjector0.inliningLowersCost(jSModule0, (Node) null, immutableList0, compilerOptions0.stripNameSuffixes, true, false);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Compiler compiler0 = new Compiler();
        Supplier<String> supplier0 = compiler0.getUniqueNameIdSupplier();
        FunctionInjector functionInjector0 = new FunctionInjector(compiler0, supplier0, false, false, false);
        Set<String> set0 = NameAnalyzer.DEFAULT_GLOBAL_NAMES;
        functionInjector0.setKnownConstants(set0);
        functionInjector0.setKnownConstants(set0);
    }
}
