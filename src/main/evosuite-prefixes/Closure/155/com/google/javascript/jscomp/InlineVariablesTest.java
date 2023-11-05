/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 07:29:24 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.InlineVariables;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.rhino.Node;
import org.junit.runner.RunWith;

public class InlineVariablesTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
        InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, true);
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}", "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}");
        inlineVariables0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Compiler compiler0 = new Compiler();
        InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.LOCALS_ONLY;
        InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, false);
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}", "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}");
        inlineVariables0.process(node0, node0);
        node0.isOnlyModifiesThisCall();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Compiler compiler0 = new Compiler();
        InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.CONSTANTS_ONLY;
        InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, false);
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "7~ZP", "7~ZP");
        inlineVariables0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Compiler compiler0 = new Compiler();
        InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
        InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, true);
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}", "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}");
        Node node1 = Normalize.parseAndNormalizeSyntheticCode(compiler0, "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}", "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}");
        node1.addChildToBack(node0);
        inlineVariables0.process(node1, node1);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Compiler compiler0 = new Compiler();
        InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
        InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, true);
        Node node0 = Normalize.parseAndNormalizeTestCode(compiler0, "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}", "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}");
        Node node1 = Normalize.parseAndNormalizeSyntheticCode(compiler0, "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}", "function JSCompiler_get(JSCompiler_get_name) {  return function() {return this[JSCompiler_get_name]}}");
        node1.addChildToBack(node0);
        node0.checkTreeEquals(node1);
        inlineVariables0.process(node0, node1);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        Compiler compiler0 = new Compiler();
        InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
        InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, true);
        Node node0 = compiler0.parseSyntheticCode("function JSompile_get(JSCompiler_get_name) {  return function() {return this[JSCompilerget_name]}}", "function JSompile_get(JSCompiler_get_name) {  return function() {return this[JSCompilerget_name]}}");
        Node node1 = compiler0.parseTestCode("function JSompile_get(JSCompiler_get_name) {  return function() {return this[JSCompilerget_name]}}");
        Node node2 = Normalize.parseAndNormalizeSyntheticCode(compiler0, "JSompile_get", "function JSompile_get(JSCompiler_get_name) {  return function() {return this[JSCompilerget_name]}}");
        node2.addChildToBack(node1);
        inlineVariables0.process(node0, node2);
    }
}
