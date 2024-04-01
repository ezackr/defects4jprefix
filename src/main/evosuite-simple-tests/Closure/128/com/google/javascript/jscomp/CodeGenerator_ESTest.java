/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 06:13:17 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.jscomp.CompilerOptions;
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
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.regexpEscape("<!-->");
        assertEquals("/\\x3c!--\\x3e/", string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        // Undeclared exception!
        try {
            codeGenerator0.tagAsStrict();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.CodeGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("\u0001\u0000\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\r\u0000\u0000\u2028\u2029\u0000\u0000\u0000\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u3000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u0000\u0000\u0000\u0000\u0000\u205F\u1680\u0000\u0000\u180E\u0000\u0000\u0000");
        assertEquals("\"\\u0001\\x00\\u00a0\\x00\\x00\\x00\\x00\\x00\\x00\\t\\n\\x0B\\f\\r\\x00\\x00\\u2028\\u2029\\x00\\x00\\x00\\x00\\x00\\u202f\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00 \\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\u3000\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\x00\\u0085\\u2000\\u2001\\u2002\\u2003\\u2004\\u2005\\u2006\\u2007\\u2008\\u2009\\u200a\\x00\\x00\\x00\\x00\\x00\\u205f\\u1680\\x00\\x00\\u180e\\x00\\x00\\x00\"", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
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
    public void test044() throws Throwable {
        Node node0 = Node.newNumber(0.0);
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
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
    public void test055() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        Node node0 = Node.newNumber((-1.0));
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0, false);
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
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("}\"K:Y&/N%>-A");
        assertEquals("\"}\\\"K:Y\\x26/\\u007fN%\\x3e-A\"", string0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("01");
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("//fo 4?u;E%ICDC");
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("object");
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        boolean boolean0 = CodeGenerator.isSimpleNumber("");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("8");
        assertEquals(8.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
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
    public void test1313() throws Throwable {
        Node node0 = Node.newNumber(0.0);
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
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
    public void test1414() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        Node node0 = Node.newString(51, "S0-> ", 51, 51);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
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
    public void test1515() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.addList((Node) null);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        Node node0 = Node.newNumber((double) 0);
        // Undeclared exception!
        try {
            codeGenerator0.addArrayList(node0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.google.javascript.jscomp.CodeGenerator", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.addAllSiblings((Node) null);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.regexpEscape("'/=", charsetEncoder0);
        assertEquals("/'/=/", string0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("s=m-ihe");
        assertEquals("\"s\\x3dm-ihe\"", string0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.regexpEscape("3]H9H76k'=VM");
        assertEquals("/3]H9H76k'=VM/", string0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("8&##;8H*nOd#c");
        assertEquals("\"8&##;8H\\u007f*nOd#c\"", string0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.regexpEscape("}VK:}M&/N%>-A");
        assertEquals("/}VK:}M&/\\u007fN%>-A/", string0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.regexpEscape("~>vnr|Tq33:!:{1T;");
        assertEquals("/~>vnr|Tq33:!:{1T;/", string0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString(" -> ");
        assertEquals("\" -> \"", string0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("6]>=J0]S54Epx$");
        assertEquals("\"6]>=J0]S54Epx$\"", string0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("pb2V?-P03D<M@");
        assertEquals("\"\\u007fpb2V?-P03D\\x3cM@\"", string0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.regexpEscape("</scriptlvyqv^vrplb");
        assertEquals("/\\x3c/scriptlvy\\u007fqv^vrplb/", string0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("<:X^k%K\"LVYQV^VRplB");
        assertEquals("\"<:X^k%K\\\"LVY\\u007fQV^VRplB\"", string0);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("\u0000\u05BE\u05D0\u05F3\u0600\u0750$\u1E00\u2100i\uFE70\uFF61");
        assertEquals("\\u0000\\u05be\\u05d0\\u05f3\\u0600\\u0750$\\u1e00\\u2100i\\ufe70\\uff61", string0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("in");
        assertEquals("in", string0);
    }
}
