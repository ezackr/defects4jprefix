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
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.CodeGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = new Node((-1709), (-1709), (-1709));
        int[] intArray0 = new int[1];
        intArray0[0] = 13;
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0, intArray0);
            fail("Expecting exception: Error");
        } catch (Error e) {
            //
            // Unknown precedence for <unknown=-1709> (type -1709)
            //
            verifyException("com.google.javascript.jscomp.NodeUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("W-^->7z^-");
        assertEquals("/W-^->7z^-/", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("WrP]]>o,o");
        assertEquals("\"WrP]]\\>o,o\"", string0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        // Undeclared exception!
        try {
            codeGenerator0.addCaseBody((Node) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.CodeGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Node node0 = new Node(36);
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        // Undeclared exception!
        try {
            codeGenerator0.addAllSiblings(node0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.CodeGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addList((Node) null, false);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Charset charset0 = Charset.forName("default");
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, charset0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        Node node0 = Node.newNumber(0.0);
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0, true, codeGenerator_Context0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.CodeGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Node node0 = new Node(52, 52, 52);
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.CodeGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Node node0 = new Node(51);
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0, false, codeGenerator_Context0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.CodeGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addList((Node) null, (int[]) null);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = new Node((-2923));
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0, (int[]) null);
            fail("Expecting exception: Error");
        } catch (Error e) {
            //
            // Unknown precedence for <unknown=-2923> (type -2923)
            //
            verifyException("com.google.javascript.jscomp.NodeUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = new Node((-1709), (-1709), (-1709));
        int[] intArray0 = new int[0];
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0, intArray0);
            fail("Expecting exception: Error");
        } catch (Error e) {
            //
            // Unknown precedence for <unknown=-1709> (type -1709)
            //
            verifyException("com.google.javascript.jscomp.NodeUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = new Node((-1709));
        int[] intArray0 = new int[1];
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0, intArray0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.CodeGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addAllSiblings((Node) null);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        String string0 = CodeGenerator.jsString("e'9D:yQ.d;=o", (CharsetEncoder) null);
        assertEquals("\"e'9D:yQ.d;=o\"", string0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        String string0 = CodeGenerator.jsString("\"", (CharsetEncoder) null);
        assertEquals("'\"'", string0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("\n\nSubtree2: ");
        assertEquals("\"\\n\\nSubtree2: \"", string0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("}2<V/`L'(*]$@J/@i(v");
        assertEquals("/}2<V/`L'(*]$@J/@i(v/", string0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("u2%</scripta");
        assertEquals("/u2%<\\/scripta/", string0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("]>$\"");
        assertEquals("/]>$\"/", string0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("-->7z^-");
        assertEquals("\"--\\>7z^-\"", string0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("L]>Ww");
        assertEquals("\"L]>Ww\"", string0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        String string0 = CodeGenerator.regexpEscape("L]e(y^RI+KJ", charsetEncoder0);
        assertEquals("/L]e(y^RI+KJ/", string0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("continue");
        assertEquals("continue", string0);
    }
}
