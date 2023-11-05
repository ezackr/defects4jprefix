/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 03 23:04:29 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.ProcessCommonJSModules;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.rhino.Node;
import org.junit.runner.RunWith;

public class ProcessCommonJSModulesTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules((AbstractCompiler) null, "opt_arg");
        JSModule jSModule0 = processCommonJSModules0.getModule();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseSyntheticCode("module.exports", "module.exports");
        ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "module.exports", false);
        processCommonJSModules0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "4HXghP9/");
        String string0 = processCommonJSModules0.guessCJSModuleName("4HXghP9/");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        String string0 = ProcessCommonJSModules.toModuleName("./=N,G7,fms85P", "./=N,G7,fms85P");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ProcessCommonJSModules.toModuleName("../OOZl>0.d{M$U-JzMHt", "../OOZl>0.d{M$U-JzMHt");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        String string0 = ProcessCommonJSModules.toModuleName("ua[do-", "ua[do-");
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Compiler compiler0 = new Compiler();
        ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "A{mp71fOa,b");
        Node node0 = Node.newString(37, "A{mp71fOa,b");
        processCommonJSModules0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("goog.ikArray");
        ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "goog.ikArray");
        Node node1 = Normalize.parseAndNormalizeSyntheticCode(compiler0, "goog.ikArray", "./");
        node0.addChildToBack(node1);
        processCommonJSModules0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("exports");
        ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "exports");
        processCommonJSModules0.process(node0, node0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("7jbqGnDKib\".");
        ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "7jbqGnDKib\".");
        processCommonJSModules0.process(node0, node0);
        SourceFile sourceFile0 = new SourceFile("./");
        node0.setStaticSourceFile(sourceFile0);
        processCommonJSModules0.process(node0, node0);
        compiler0.getErrorCount();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Compiler compiler0 = new Compiler();
        Node node0 = compiler0.parseTestCode("function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}");
        ProcessCommonJSModules processCommonJSModules0 = new ProcessCommonJSModules(compiler0, "function JSCompiler_returnArg(JSCompiler_returnArg_value) {  return function() {return JSCompiler_returnArg_value}}");
        processCommonJSModules0.process(node0, node0);
    }
}
