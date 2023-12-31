/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 03:46:50 GMT 2023
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
        Node node0 = new Node(51);
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator0.addList(node0, false, codeGenerator_Context0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Node node0 = Node.newNumber((-1.0));
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addArrayList(node0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("6M4<!-->]%+");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("onRange\u00120\n\u0007options\u0018\u0007 \u0001(\u000B2\u001F.google.protobuf.MessageOptions\u001A,\n\u000EExtensionRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000B\n\u0003end\u0018\u0002 \u0001(\u0005\"\u0094\u0005\n\u0014FieldDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000E\n\u0006number\u0018\u0003 \u0001(\u0005\u0012:\n\u0005label\u0018\u0004 \u0001(\u000E2+.google.protobuf.FieldDescriptorProto.Label\u00128\n\u0004type\u0018\u0005 \u0001(\u000E2*.google.protobuf.FieldDescriptorProto.Type\u0012\u0011\n\ttype_name\u0018\u0006 \u0001(\t\u0012\u0010\n\bextendee\u0018\u0002 \u0001(\t\u0012\u0015\n\rdefault_value\u0018\u0007 \u0001(\t\u0012.\n\u0007options\u0018\b \u0001(\u000B2\u001D.google.protobuf.FieldOptions\"\u00B6\u0002\n\u0004Type\u0012\u000F\n\u000BTYP");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.tagAsStrict();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addCaseBody((Node) null);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Node node0 = new Node((-3311));
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addAllSiblings(node0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Node node0 = Node.newNumber(2.0);
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addList(node0, false);
    }

    @Test(timeout = 4000)
    public void test108() throws Throwable {
        Node node0 = new Node(85);
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        codeGenerator0.addList(node0);
    }

    @Test(timeout = 4000)
    public void test119() throws Throwable {
        Node node0 = Node.newNumber((-1193.2049));
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator0.addLeftExpr(node0, 9, codeGenerator_Context0);
    }

    @Test(timeout = 4000)
    public void test1510() throws Throwable {
        Charset charset0 = Charset.forName("default");
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        String string0 = CodeGenerator.jsString("onRange\u00120\n\u0007optons\u0018\u0007 \u0001(\u000B2\u001F.google.protobuf.MessageOptions\u001A,\n\u000EExtensio_Range\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000B\n>end\u0018\u0002 \u0001(y\"\u0094\u0005\n\u0014FieldDescmiptor~roto\u0012\f\n\u0004name\u0018\u0001\u0001(\t\u0012\u000E\n\u0006number\u0018 \u0001\u0005\u0012:\n\u0005label\u0018\u0004 \u0001(\u000E2+.go'gle.protobuf.FieldDescrSptorProto.Label\u00128\n\u0004type\u0018H \u0001(\u000E2*.google.protobufBFieldDMscriptorProto.Type\u0012\u0011\ttyZe_name\u0018\u0006 \u0001(\t\u0012\u0010\nHextendee\u0018\u0002 \u0001(\t\u0015\n\rdefault_value\u0018\u0007 \u0001(\t\u0012\n\u0007options\u0018\b 6\u000B2\u001D.google.protobuf.FieldBptions\"\u00B6\u0002\n\u0004TypE\u0012\u000F\n\u000BTYP", charsetEncoder0);
    }

    @Test(timeout = 4000)
    public void test1611() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        String string0 = CodeGenerator.jsString("iam GU*+0'Zh\"F=TLR", charsetEncoder0);
    }

    @Test(timeout = 4000)
    public void test1712() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("~>sM`;26gClq@:");
    }

    @Test(timeout = 4000)
    public void test1813() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("LJjc->}.+(s'\"\"[");
    }

    @Test(timeout = 4000)
    public void test1914() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("K^^T&TY]]>eP*S");
    }

    @Test(timeout = 4000)
    public void test2015() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("@$qpaU:3&u]>,-yOuKv");
    }

    @Test(timeout = 4000)
    public void test2116() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("</script-t^1:{`^lt");
    }

    @Test(timeout = 4000)
    public void test2217() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("OPN'p(xBa,fMyp\"/7`<");
    }

    @Test(timeout = 4000)
    public void test2318() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("onRange\u00120\n\u0007options\u0018\u0007 \u0001(\u000B2\u001F.google.protobuf.MessageOptions\u001A,\n\u000EExtensionRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000B\n\u0003end\u0018\u0002 \u0001(\u0005\"\u0094\u0005\n\u0014FieldDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000E\n\u0006number\u0018\u0003 \u0001(\u0005\u0012:\n\u0005label\u0018\u0004 \u0001(\u000E2+.google.protobuf.FieldDescriptorProto.Label\u00128\n\u0004type\u0018\u0005 \u0001(\u000E2*.google.protobuf.FieldDescriptorProto.Type\u0012\u0011\n\ttype_name\u0018\u0006 \u0001(\t\u0012\u0010\n\bextendee\u0018\u0002 \u0001(\t\u0012\u0015\n\rdefault_value\u0018\u0007 \u0001(\t\u0012.\n\u0007options\u0018\b \u0001(\u000B2\u001D.google.protobuf.FieldOptions\"\u00B6\u0002\n\u0004Type\u0012\u000F\n\u000BTYP");
    }

    @Test(timeout = 4000)
    public void test2419() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("some");
    }
}
