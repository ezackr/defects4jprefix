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
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.tagAsStrict();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("\u0001\u0000\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\r\u0000\u0000\u2028\u2029\u0000\u0000\u0000\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u3000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u0000\u0000\u0000\u0000\u0000\u205F\u1680\u0000\u0000\u180E\u0000\u0000\u0000");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.addCaseBody((Node) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Node node0 = Node.newNumber(0.0);
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.addAllSiblings(node0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        Node node0 = Node.newNumber((-1.0));
        codeGenerator0.addList(node0, false);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("}\"K:Y&/N%>-A");
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("01");
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("//fo 4?u;E%ICDC");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("object");
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        boolean boolean0 = CodeGenerator.isSimpleNumber("");
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("8");
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        Node node0 = new Node(85);
        codeGenerator0.addList(node0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Node node0 = Node.newNumber(0.0);
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator0.addList(node0, true, codeGenerator_Context0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        Node node0 = Node.newString(51, "S0-> ", 51, 51);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator0.addList(node0, true, codeGenerator_Context0);
    }

    @Test(timeout = 4000)
    public void test1615() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        Node node0 = Node.newNumber((double) 0);
        codeGenerator0.addArrayList(node0);
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.regexpEscape("'/=", charsetEncoder0);
    }

    @Test(timeout = 4000)
    public void test1917() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("s=m-ihe");
    }

    @Test(timeout = 4000)
    public void test2018() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.regexpEscape("3]H9H76k'=VM");
    }

    @Test(timeout = 4000)
    public void test2119() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("8&##;8H*nOd#c");
    }

    @Test(timeout = 4000)
    public void test2220() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.regexpEscape("}VK:}M&/N%>-A");
    }

    @Test(timeout = 4000)
    public void test2321() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.regexpEscape("~>vnr|Tq33:!:{1T;");
    }

    @Test(timeout = 4000)
    public void test2422() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString(" -> ");
    }

    @Test(timeout = 4000)
    public void test2523() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("6]>=J0]S54Epx$");
    }

    @Test(timeout = 4000)
    public void test2624() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("pb2V?-P03D<M@");
    }

    @Test(timeout = 4000)
    public void test2725() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.regexpEscape("</scriptlvyqv^vrplb");
    }

    @Test(timeout = 4000)
    public void test2826() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("<:X^k%K\"LVYQV^VRplB");
    }

    @Test(timeout = 4000)
    public void test2927() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("\u0000\u05BE\u05D0\u05F3\u0600\u0750$\u1E00\u2100i\uFE70\uFF61");
    }

    @Test(timeout = 4000)
    public void test3028() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("in");
    }
}
