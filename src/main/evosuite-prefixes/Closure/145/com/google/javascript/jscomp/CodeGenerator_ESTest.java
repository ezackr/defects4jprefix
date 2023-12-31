/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 07:01:19 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CodeGenerator_ESTest extends CodeGenerator_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = new Node(85);
        codeGenerator0.addList(node0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = new Node((-1709), (-1709), (-1709));
        int[] intArray0 = new int[1];
        intArray0[0] = 13;
        codeGenerator0.addList(node0, intArray0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("W-^->7z^-");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("WrP]]>o,o");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addCaseBody((Node) null);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Node node0 = new Node(36);
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addAllSiblings(node0);
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        Node node0 = Node.newNumber(0.0);
        codeGenerator0.addList(node0, true, codeGenerator_Context0);
    }

    @Test(timeout = 4000)
    public void test107() throws Throwable {
        Node node0 = new Node(52, 52, 52);
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addList(node0);
    }

    @Test(timeout = 4000)
    public void test118() throws Throwable {
        Node node0 = new Node(51);
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
    }

    @Test(timeout = 4000)
    public void test139() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = new Node((-2923));
        codeGenerator0.addList(node0, (int[]) null);
    }

    @Test(timeout = 4000)
    public void test1410() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = new Node((-1709), (-1709), (-1709));
        int[] intArray0 = new int[0];
        codeGenerator0.addList(node0, intArray0);
    }

    @Test(timeout = 4000)
    public void test1511() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = new Node((-1709));
        int[] intArray0 = new int[1];
        codeGenerator0.addList(node0, intArray0);
    }

    @Test(timeout = 4000)
    public void test1712() throws Throwable {
        String string0 = CodeGenerator.jsString("e'9D:yQ.d;=o", (CharsetEncoder) null);
    }

    @Test(timeout = 4000)
    public void test1813() throws Throwable {
        String string0 = CodeGenerator.jsString("\"", (CharsetEncoder) null);
    }

    @Test(timeout = 4000)
    public void test1914() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("\n\nSubtree2: ");
    }

    @Test(timeout = 4000)
    public void test2015() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("}2<V/`L'(*]$@J/@i(v");
    }

    @Test(timeout = 4000)
    public void test2116() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("u2%</scripta");
    }

    @Test(timeout = 4000)
    public void test2217() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("]>$\"");
    }

    @Test(timeout = 4000)
    public void test2318() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("-->7z^-");
    }

    @Test(timeout = 4000)
    public void test2419() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("L]>Ww");
    }

    @Test(timeout = 4000)
    public void test2520() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        String string0 = CodeGenerator.regexpEscape("L]e(y^RI+KJ", charsetEncoder0);
    }

    @Test(timeout = 4000)
    public void test2621() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("continue");
    }
}
