/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 23:01:55 GMT 2024
 */
package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.util.RawValue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class POJONode_ESTest extends POJONode_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Object object0 = new Object();
        POJONode pOJONode0 = new POJONode(object0);
        byte[] byteArray0 = pOJONode0.binaryValue();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BinaryNode binaryNode0 = BinaryNode.EMPTY_BINARY_NODE;
        POJONode pOJONode0 = new POJONode(binaryNode0);
        JsonToken jsonToken0 = pOJONode0.asToken();
        jsonToken0.isStructStart();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Integer integer0 = new Integer(0);
        POJONode pOJONode0 = new POJONode(integer0);
        Object object0 = pOJONode0.getPojo();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        TextNode textNode0 = TextNode.EMPTY_STRING_NODE;
        POJONode pOJONode0 = new POJONode(textNode0);
        pOJONode0.hashCode();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        MissingNode missingNode0 = MissingNode.getInstance();
        POJONode pOJONode0 = new POJONode(missingNode0);
        JsonNodeType jsonNodeType0 = pOJONode0.getNodeType();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        TextNode textNode0 = TextNode.EMPTY_STRING_NODE;
        POJONode pOJONode0 = new POJONode(textNode0);
        String string0 = pOJONode0.asText();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        POJONode pOJONode0 = new POJONode((Object) null);
        String string0 = pOJONode0.asText();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        POJONode pOJONode0 = new POJONode("YGC  I0gc_4");
        String string0 = pOJONode0.asText("YGC  I0gc_4");
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        POJONode pOJONode0 = new POJONode((Object) null);
        String string0 = pOJONode0.asText((String) null);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        POJONode pOJONode0 = new POJONode((Object) null);
        boolean boolean0 = pOJONode0.asBoolean(true);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Boolean boolean0 = new Boolean(false);
        POJONode pOJONode0 = new POJONode(boolean0);
        boolean boolean1 = pOJONode0.asBoolean(false);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        TextNode textNode0 = TextNode.EMPTY_STRING_NODE;
        POJONode pOJONode0 = new POJONode(textNode0);
        boolean boolean0 = pOJONode0.asBoolean();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        POJONode pOJONode0 = new POJONode((Object) null);
        int int0 = pOJONode0.asInt();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Float float0 = new Float((-25.059322F));
        POJONode pOJONode0 = new POJONode(float0);
        int int0 = pOJONode0.asInt();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        MissingNode missingNode0 = new MissingNode();
        POJONode pOJONode0 = new POJONode(missingNode0);
        long long0 = pOJONode0.asLong((-312L));
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Float float0 = new Float(1877.462F);
        POJONode pOJONode0 = new POJONode(float0);
        long long0 = pOJONode0.asLong();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Object object0 = new Object();
        POJONode pOJONode0 = new POJONode(object0);
        double double0 = pOJONode0.asDouble();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Long long0 = new Long(1269L);
        POJONode pOJONode0 = new POJONode(long0);
        double double0 = pOJONode0.asDouble();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        POJONode pOJONode0 = new POJONode("YGC  I0gc_4");
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        pOJONode0.serialize((JsonGenerator) null, defaultSerializerProvider_Impl0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        POJONode pOJONode0 = new POJONode((Object) null);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        pOJONode0.serialize((JsonGenerator) null, defaultSerializerProvider_Impl0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        TextNode textNode0 = TextNode.EMPTY_STRING_NODE;
        POJONode pOJONode0 = new POJONode(textNode0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        pOJONode0.serialize((JsonGenerator) null, defaultSerializerProvider_Impl0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        POJONode pOJONode0 = new POJONode((Object) null);
        boolean boolean0 = pOJONode0.equals((Object) pOJONode0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        POJONode pOJONode0 = new POJONode((Object) null);
        POJONode pOJONode1 = new POJONode(pOJONode0);
        boolean boolean0 = pOJONode0.equals((Object) pOJONode1);
        pOJONode1.equals((Object) pOJONode0);
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        POJONode pOJONode0 = new POJONode((Object) null);
        POJONode pOJONode1 = new POJONode(pOJONode0);
        boolean boolean0 = pOJONode0.equals((Object) pOJONode1);
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        TextNode textNode0 = TextNode.EMPTY_STRING_NODE;
        POJONode pOJONode0 = new POJONode(textNode0);
        boolean boolean0 = pOJONode0.equals((Object) textNode0);
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        POJONode pOJONode0 = new POJONode((Object) null);
        POJONode pOJONode1 = new POJONode(pOJONode0);
        boolean boolean0 = pOJONode1.equals((Object) pOJONode0);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        POJONode pOJONode0 = new POJONode((Object) null);
        boolean boolean0 = pOJONode0._pojoEquals(pOJONode0);
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        Object object0 = new Object();
        POJONode pOJONode0 = new POJONode(object0);
        String string0 = pOJONode0.toString();
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        RawValue rawValue0 = new RawValue((String) null);
        POJONode pOJONode0 = new POJONode(rawValue0);
        String string0 = pOJONode0.toString();
    }
}
