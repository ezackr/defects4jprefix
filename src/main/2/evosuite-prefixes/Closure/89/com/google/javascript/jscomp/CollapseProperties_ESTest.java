/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 04:58:50 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CollapseProperties;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CollapseProperties_ESTest extends CollapseProperties_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompilerOstubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        CollapseProperties collapseProperties0 = new CollapseProperties(compiler0, false, true);
        collapseProperties0.process(node0, node0);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompilerOstubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        CollapseProperties collapseProperties0 = new CollapseProperties(compiler0, true, true);
        collapseProperties0.process(node0, node0);
        compiler0.getWarningCount();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("var JSCompiler_stubMap = [];function JSCompiler_stubMethod(JSCompilerOstubMethod_id) {  return function() {    return JSCompiler_stubMap[JSCompiler_stubMethod_id].apply(        this, arguments);  };}function JSCompiler_unstubMethod(    JSCompiler_unstubMethod_id, JSCompiler_unstubMethod_body) {  return JSCompiler_stubMap[JSCompiler_unstubMethod_id] =       JSCompiler_unstubMethod_body;}");
        CollapseProperties collapseProperties0 = new CollapseProperties(compiler0, false, false);
        collapseProperties0.process(node0, node0);
        compiler0.getWarningCount();
    }
}
