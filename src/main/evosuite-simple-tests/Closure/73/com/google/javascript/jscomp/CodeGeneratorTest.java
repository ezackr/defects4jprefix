/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 03:35:00 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.CodeConsumer;
import com.google.javascript.jscomp.CodeGenerator;
import com.google.javascript.rhino.Node;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.junit.runner.RunWith;

public class CodeGeneratorTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Node node0 = new Node(51, 51, 51);
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0, true, codeGenerator_Context0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = Node.newNumber(Double.NaN);
        // Undeclared exception!
        try {
            codeGenerator0.addArrayList(node0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String string0 = CodeGenerator.regexpEscape("<!-->VLj:'");
        assertEquals("/<\\!--\\>VLj:'/", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012\u001C\n\u0014experimental_map_key\u0018\t \u0001(\t\u0012C\n\u0014uninterpreted_option\u0018\u00E7\u0007 \u0003(\u000B2$.google.protobuf.UninterpretedOption\"/\n\u0005CType\u0012\n\n\u0006STRING\u0010\u0000\u0012\b\n\u0004CORD\u0010\u0001\u0012\u0010\n\fSTRING_PIECE\u0010\u0002*\t\b\u00E8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"]\n\u000BEnumOptions\u0012C\n\u0014uninterpreted_option\u0018\u00E7\u0007 \u0003(\u000B2$.google.protobuf.UninterpretedOption*\t\b\u00E8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"b\n\u0010EnumValueOptions\u0012C\n\u0014uninterpreted_option\u0018\u00E7\u0007 \u0003(\u000B2$.google.protobuf.UninterpretedOption*\t\b\u00E8\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"`\n\u000EServiceOptions\u0012C\n");
        assertEquals("\"\\n\\ndeprecated\\u0018\\u0003 \\u0001(\\u0008:\\u0005false\\u0012\\u001c\\n\\u0014experimental_map_key\\u0018\\t \\u0001(\\t\\u0012C\\n\\u0014uninterpreted_option\\u0018\\u00e7\\u0007 \\u0003(\\u000b2$.google.protobuf.UninterpretedOption\\\"/\\n\\u0005CType\\u0012\\n\\n\\u0006STRING\\u0010\\0\\u0012\\u0008\\n\\u0004CORD\\u0010\\u0001\\u0012\\u0010\\n\\u000cSTRING_PIECE\\u0010\\u0002*\\t\\u0008\\u00e8\\u0007\\u0010\\u0080\\u0080\\u0080\\u0080\\u0002\\\"]\\n\\u000bEnumOptions\\u0012C\\n\\u0014uninterpreted_option\\u0018\\u00e7\\u0007 \\u0003(\\u000b2$.google.protobuf.UninterpretedOption*\\t\\u0008\\u00e8\\u0007\\u0010\\u0080\\u0080\\u0080\\u0080\\u0002\\\"b\\n\\u0010EnumValueOptions\\u0012C\\n\\u0014uninterpreted_option\\u0018\\u00e7\\u0007 \\u0003(\\u000b2$.google.protobuf.UninterpretedOption*\\t\\u0008\\u00e8\\u0007\\u0010\\u0080\\u0080\\u0080\\u0080\\u0002\\\"`\\n\\u000eServiceOptions\\u0012C\\n\"", string0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        // Undeclared exception!
        try {
            codeGenerator0.tagAsStrict();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        // Undeclared exception!
        try {
            codeGenerator0.addCaseBody((Node) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test096() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("4");
        assertEquals(4.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test107() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber(")");
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test118() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("0|GI<!--s|");
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test129() throws Throwable {
        double double0 = CodeGenerator.getSimpleNumber("");
        assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test1310() throws Throwable {
        Node node0 = Node.newString("<!--8Yt2z5W^h");
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        // Undeclared exception!
        try {
            codeGenerator0.addExpr(node0, 25);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1411() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = Node.newNumber(2237.52844996644);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0, true, codeGenerator_Context0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1512() throws Throwable {
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        Node node0 = Node.newNumber(1842.2608345);
        CodeGenerator.Context codeGenerator_Context0 = CodeGenerator.Context.PRESERVE_BLOCK;
        // Undeclared exception!
        try {
            codeGenerator0.addList(node0, false, codeGenerator_Context0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1713() throws Throwable {
        Node node0 = Node.newString("<!--?OkJL_");
        CodeGenerator codeGenerator0 = new CodeGenerator((CodeConsumer) null);
        // Undeclared exception!
        try {
            codeGenerator0.addAllSiblings(node0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1814() throws Throwable {
        String string0 = CodeGenerator.jsString("R|]7'^]>y(k7qFnk_", (CharsetEncoder) null);
        assertEquals("\"R|]7'^]>y(k7qFnk_\"", string0);
    }

    @Test(timeout = 4000)
    public void test1915() throws Throwable {
        String string0 = CodeGenerator.jsString("ts\",>mt", (CharsetEncoder) null);
        assertEquals("'ts\",>mt'", string0);
    }

    @Test(timeout = 4000)
    public void test2016() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("\t\n\u000B\f\r \u0085\u1680\u2028\u2029\u205F\u3000\u00A0\u180E\u202F");
        assertEquals("\"\\t\\n\\u000b\\u000c\\r \\u0085\\u1680\\u2028\\u2029\\u205f\\u3000\\u00a0\\u180e\\u202f\"", string0);
    }

    @Test(timeout = 4000)
    public void test2117() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("\u0003i<!--");
        assertEquals("\"\\u0003i<\\!--\"", string0);
    }

    @Test(timeout = 4000)
    public void test2218() throws Throwable {
        String string0 = CodeGenerator.jsString("[>ativeI coM]\n", (CharsetEncoder) null);
        assertEquals("\"[>ativeI coM]\\n\"", string0);
    }

    @Test(timeout = 4000)
    public void test2319() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("<!->VLj:'");
        assertEquals("\"<!->VLj:'\"", string0);
    }

    @Test(timeout = 4000)
    public void test2420() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("^@]]>");
        assertEquals("\"^@]]\\>\"", string0);
    }

    @Test(timeout = 4000)
    public void test2521() throws Throwable {
        String string0 = CodeGenerator.escapeToDoubleQuotedJsString("&:></script");
        assertEquals("\"&:><\\/script\"", string0);
    }

    @Test(timeout = 4000)
    public void test2622() throws Throwable {
        Charset charset0 = Charset.defaultCharset();
        CharsetEncoder charsetEncoder0 = charset0.newEncoder();
        String string0 = CodeGenerator.regexpEscape("a+/G+|vq", charsetEncoder0);
        assertEquals("/a+/G+|vq/", string0);
    }

    @Test(timeout = 4000)
    public void test2723() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("\t\n\u000B\f\r \u0085\u1680\u2028\u2029\u205F\u3000\u00A0\u180Esq\u202F");
        assertEquals("\\u0009\\u000a\\u000b\\u000c\\u000d \\u0085\\u1680\\u2028\\u2029\\u205f\\u3000\\u00a0\\u180esq\\u202f", string0);
    }

    @Test(timeout = 4000)
    public void test2824() throws Throwable {
        String string0 = CodeGenerator.identifierEscape("p");
        assertEquals("p", string0);
    }
}
