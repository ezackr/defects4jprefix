/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 02:43:45 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FunctionRewriter;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class FunctionRewriter_ESTest extends FunctionRewriter_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSCompiler_emptyFn() {  return function() {}}");
        FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
        functionRewriter0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "function JSCompiler_identityFn() { return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_value}}", "function JSCompiler_identityFn() { return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_value}}");
        FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
        Normalize.parseAndNormalizeTestCode(compiler0, "XluuFK&j?", "function JSCompiler_identityFn() { return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_value}}");
        functionRewriter0.process(node0, node0);
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "function JSCompiler_set(JSCompiler_set_name) {  return function(JSCompiler_set_value) {this[JSCompiler_set_name] = JSCompiler_set_value}}", "function JSCompiler_set(JSCompiler_set_name) {  return function(JSCompiler_set_value) {this[JSCompiler_set_name] = JSCompiler_set_value}}");
        FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
        functionRewriter0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}", "function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}");
        FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
        functionRewriter0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "function JSCompiler_identityFn() { return function(JSCompiler_identityFn_value) {return JSCompiler_iden+ityFn_value}}", "function JSCompiler_identityFn() { return function(JSCompiler_identityFn_value) {return JSCompiler_iden+ityFn_value}}");
        FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
        functionRewriter0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        Compiler compiler0 = new Compiler();
        FunctionRewriter functionRewriter0 = new FunctionRewriter(compiler0);
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "function JSCompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_vale}}", "function JSCompiler_identityFn() {  return function(JSCompiler_identityFn_value) {return JSCompiler_identityFn_vale}}");
        functionRewriter0.process(node0, node0);
    }
}
