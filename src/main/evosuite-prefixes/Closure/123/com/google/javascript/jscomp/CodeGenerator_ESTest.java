/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 05:59:10 GMT 2023
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
        Charset charset0 = Charset.forName("default");
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        String string0 = codeGenerator0.regexpEscape("\u0001X\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\rL\u0000\u2028\u2029\u0000\u0000\u0000\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u3000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u0000E\u0000\u0000\u0000\u1680\u0000\u180E\u0000\u0000\u0000", charsetEncoder0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.tagAsStrict();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("ZHMOsmN?Tc<cSM&");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.addCaseBody((Node) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.regexpEscape("\u0001\u0000\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\r\u0000\u0000\u2028\u2029\u0000\u0000\u0000\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u3000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u0000\u0000\u0000\u0000\u0000\u205F\u1680\u0000\u0000\u180E\u0000\u0000\u0000");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Node node0 = Node.newNumber((-1777.076));
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.addList(node0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.addList((Node) null, false);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("02");
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("(0,");
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("vo/\u0005");
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("4");
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        boolean boolean0 = CodeGenerator.isSimpleNumber("22");
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        Node node0 = new Node(85);
        codeGenerator0.addArrayList(node0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Node node0 = Node.newNumber(0.0);
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Node node0 = new Node(51);
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.addArrayList((Node) null);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.addAllSiblings((Node) null);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Node node0 = Node.newNumber(1528.42799161106);
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        codeGenerator0.addAllSiblings(node0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.regexpEscape("\"eEeu<r");
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        Charset charset0 = Charset.defaultCharset();
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        String string0 = codeGenerator0.regexpEscape("S>W&7Y-+j483x4`!Iu'", charsetEncoder0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("f0xL(zSRxZs=e");
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.regexpEscape("\"$=v5</scripty8<an");
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.regexpEscape("1c?r`u0QS])_=EZQ");
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.regexpEscape(":dP-j}AN 6ugj|&UKn]");
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.regexpEscape("Vzn>xOw#PpUe?Ak");
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        CompilerOptions compilerOptions0 = new CompilerOptions();
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null, compilerOptions0);
        String string0 = codeGenerator0.escapeToDoubleQuotedJsString("Z.eC>*$M!?a9OLW");
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.regexpEscape("<!->t@|o{}W0T)Pd");
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.regexpEscape("<!-->s@|o{}W0T)P@");
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        CodeGenerator codeGenerator0 = CodeGenerator.forCostEstimation((CodeConsumer) null);
        String string0 = codeGenerator0.regexpEscape("J72%]>6Vn0");
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("\u0001X\u00A0\u0000\u0000\u0000\u0000\u0000\u0000\t\n\u000B\f\r\u0000\u0000\u2028\u2029\u0000\u0000\u0000\u0000\u0000\u202F\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000 \u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u3000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0085\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u0000\u0000\u0000\u0000\u0000\u1680\u0000\u180E\u0000\u0000\u0000");
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("");
    }
}
