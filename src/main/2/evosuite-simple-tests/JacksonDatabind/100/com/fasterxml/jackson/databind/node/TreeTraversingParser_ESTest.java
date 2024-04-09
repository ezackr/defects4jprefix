/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 23:07:29 GMT 2024
 */
package com.fasterxml.jackson.databind.node;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.DecimalNode;
import com.fasterxml.jackson.databind.node.FloatNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.NumericNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TreeTraversingParser_ESTest extends TreeTraversingParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        LongNode longNode0 = new LongNode((-13L));
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(longNode0);
        treeTraversingParser0.setCodec((ObjectCodec) null);
        assertEquals(0, treeTraversingParser0.getCurrentTokenId());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        NullNode nullNode0 = new NullNode();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        FilteringParserDelegate filteringParserDelegate0 = new FilteringParserDelegate(treeTraversingParser0, (TokenFilter) null, true, false);
        Version version0 = filteringParserDelegate0.version();
        assertFalse(version0.isUnknownVersion());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        NullNode nullNode0 = NullNode.instance;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        try {
            treeTraversingParser0.getFloatValue();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Current token (VALUE_NULL) not numeric, cannot use numeric value accessors
            //  at [Source: UNKNOWN; line: -1, column: -1]
            //
            verifyException("com.fasterxml.jackson.core.JsonParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        NullNode nullNode0 = NullNode.getInstance();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        try {
            treeTraversingParser0.getNumberValue();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Current token (VALUE_NULL) not numeric, cannot use numeric value accessors
            //  at [Source: UNKNOWN; line: -1, column: -1]
            //
            verifyException("com.fasterxml.jackson.core.JsonParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        MissingNode missingNode0 = new MissingNode();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(missingNode0);
        ObjectCodec objectCodec0 = treeTraversingParser0.getCodec();
        assertNull(objectCodec0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        LongNode longNode0 = new LongNode(24L);
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(longNode0);
        boolean boolean0 = treeTraversingParser0.hasTextCharacters();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        NullNode nullNode0 = NullNode.instance;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        // Undeclared exception!
        try {
            treeTraversingParser0.getTextLength();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.node.TreeTraversingParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        FloatNode floatNode0 = new FloatNode((-2492.836F));
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(floatNode0);
        int int0 = treeTraversingParser0.getTextOffset();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        BooleanNode booleanNode0 = BooleanNode.getTrue();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(booleanNode0);
        boolean boolean0 = treeTraversingParser0.isClosed();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        NullNode nullNode0 = NullNode.getInstance();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        try {
            treeTraversingParser0.getBigIntegerValue();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Current token (VALUE_NULL) not numeric, cannot use numeric value accessors
            //  at [Source: UNKNOWN; line: -1, column: -1]
            //
            verifyException("com.fasterxml.jackson.core.JsonParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        BooleanNode booleanNode0 = BooleanNode.getFalse();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(booleanNode0);
        Object object0 = treeTraversingParser0.getCurrentValue();
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        NullNode nullNode0 = NullNode.getInstance();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        // Undeclared exception!
        try {
            treeTraversingParser0._handleEOF();
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // Internal error: this code path should never get executed
            //
            verifyException("com.fasterxml.jackson.core.util.VersionUtil", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = new JsonNodeFactory(false);
        Vector<JsonNode> vector0 = new Vector<JsonNode>();
        ArrayNode arrayNode0 = new ArrayNode(jsonNodeFactory0, vector0);
        NumericNode numericNode0 = arrayNode0.numberNode((byte) (-122));
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(numericNode0);
        JsonLocation jsonLocation0 = treeTraversingParser0.getTokenLocation();
        assertEquals(500, JsonLocation.MAX_CONTENT_SNIPPET);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BooleanNode booleanNode0 = BooleanNode.FALSE;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(booleanNode0);
        try {
            treeTraversingParser0.getByteValue();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Current token (VALUE_FALSE) not numeric, cannot use numeric value accessors
            //  at [Source: UNKNOWN; line: -1, column: -1]
            //
            verifyException("com.fasterxml.jackson.core.JsonParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        NullNode nullNode0 = NullNode.getInstance();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        // Undeclared exception!
        try {
            treeTraversingParser0.getTextCharacters();
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.node.TreeTraversingParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        NullNode nullNode0 = new NullNode();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        try {
            treeTraversingParser0.getDecimalValue();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Current token (VALUE_NULL) not numeric, cannot use numeric value accessors
            //  at [Source: UNKNOWN; line: -1, column: -1]
            //
            verifyException("com.fasterxml.jackson.core.JsonParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        BinaryNode binaryNode0 = BinaryNode.EMPTY_BINARY_NODE;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(binaryNode0);
        try {
            treeTraversingParser0.getLongValue();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Current token (VALUE_EMBEDDED_OBJECT) not numeric, cannot use numeric value accessors
            //  at [Source: UNKNOWN; line: -1, column: -1]
            //
            verifyException("com.fasterxml.jackson.core.JsonParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        BooleanNode booleanNode0 = BooleanNode.FALSE;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(booleanNode0);
        try {
            treeTraversingParser0.getDoubleValue();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Current token (VALUE_FALSE) not numeric, cannot use numeric value accessors
            //  at [Source: UNKNOWN; line: -1, column: -1]
            //
            verifyException("com.fasterxml.jackson.core.JsonParser", e);
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(arrayNode0);
        JsonParser jsonParser0 = treeTraversingParser0.skipChildren();
        assertFalse(jsonParser0.hasCurrentToken());
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(objectNode0);
        treeTraversingParser0.nextToken();
        treeTraversingParser0.skipChildren();
        assertEquals(2, treeTraversingParser0.currentTokenId());
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        NullNode nullNode0 = NullNode.getInstance();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        treeTraversingParser0.close();
        treeTraversingParser0.close();
        assertTrue(treeTraversingParser0.isClosed());
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        DecimalNode decimalNode0 = DecimalNode.ZERO;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(decimalNode0);
        treeTraversingParser0.nextToken();
        treeTraversingParser0.getText();
        assertTrue(treeTraversingParser0.hasCurrentToken());
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        DecimalNode decimalNode0 = DecimalNode.ZERO;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(decimalNode0);
        JsonToken jsonToken0 = JsonToken.FIELD_NAME;
        treeTraversingParser0._nextToken = jsonToken0;
        treeTraversingParser0.nextToken();
        String string0 = treeTraversingParser0.getText();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        NullNode nullNode0 = NullNode.instance;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        treeTraversingParser0._startContainer = true;
        treeTraversingParser0.nextToken();
        assertEquals(4, treeTraversingParser0.currentTokenId());
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        NullNode nullNode0 = NullNode.instance;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        treeTraversingParser0.close();
        treeTraversingParser0.nextToken();
        assertTrue(treeTraversingParser0.isClosed());
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        BinaryNode binaryNode0 = BinaryNode.EMPTY_BINARY_NODE;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(binaryNode0);
        treeTraversingParser0.nextTextValue();
        treeTraversingParser0.nextToken();
        treeTraversingParser0.currentName();
        assertFalse(treeTraversingParser0.hasCurrentToken());
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(arrayNode0);
        treeTraversingParser0.nextToken();
        treeTraversingParser0.skipChildren();
        assertEquals(JsonToken.END_ARRAY, treeTraversingParser0.getCurrentToken());
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        NullNode nullNode0 = NullNode.instance;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        String string0 = treeTraversingParser0.getCurrentName();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        NullNode nullNode0 = NullNode.getInstance();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        treeTraversingParser0.close();
        treeTraversingParser0.overrideCurrentName("");
        assertTrue(treeTraversingParser0.isClosed());
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        NullNode nullNode0 = NullNode.getInstance();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        treeTraversingParser0.overrideCurrentName("");
        assertEquals(0, treeTraversingParser0.getCurrentTokenId());
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        NullNode nullNode0 = new NullNode();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        treeTraversingParser0.close();
        String string0 = treeTraversingParser0.getText();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        BinaryNode binaryNode0 = BinaryNode.EMPTY_BINARY_NODE;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(binaryNode0);
        treeTraversingParser0.nextValue();
        treeTraversingParser0.getText();
        assertEquals(12, treeTraversingParser0.getCurrentTokenId());
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        TextNode textNode0 = TextNode.EMPTY_STRING_NODE;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(textNode0);
        treeTraversingParser0.nextToken();
        treeTraversingParser0.getText();
        assertEquals(6, treeTraversingParser0.currentTokenId());
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        LongNode longNode0 = new LongNode(24L);
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(longNode0);
        treeTraversingParser0.nextToken();
        treeTraversingParser0.getText();
        assertEquals(7, treeTraversingParser0.getCurrentTokenId());
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        NullNode nullNode0 = NullNode.getInstance();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        treeTraversingParser0.nextToken();
        treeTraversingParser0.getText();
        assertEquals(11, treeTraversingParser0.currentTokenId());
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        NullNode nullNode0 = NullNode.getInstance();
        POJONode pOJONode0 = new POJONode(nullNode0);
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(pOJONode0);
        treeTraversingParser0.nextToken();
        treeTraversingParser0.getText();
        assertEquals(12, treeTraversingParser0.getCurrentTokenId());
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        DecimalNode decimalNode0 = DecimalNode.ZERO;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(decimalNode0);
        JsonParser.NumberType jsonParser_NumberType0 = treeTraversingParser0.getNumberType();
        assertEquals(JsonParser.NumberType.BIG_DECIMAL, jsonParser_NumberType0);
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        NullNode nullNode0 = NullNode.getInstance();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        treeTraversingParser0.close();
        Object object0 = treeTraversingParser0.getEmbeddedObject();
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        NullNode nullNode0 = NullNode.instance;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        Object object0 = treeTraversingParser0.getEmbeddedObject();
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        NullNode nullNode0 = NullNode.instance;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        treeTraversingParser0.nextToken();
        treeTraversingParser0.nextToken();
        Object object0 = treeTraversingParser0.getEmbeddedObject();
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test4040() throws Throwable {
        BinaryNode binaryNode0 = BinaryNode.EMPTY_BINARY_NODE;
        POJONode pOJONode0 = new POJONode(binaryNode0);
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(pOJONode0);
        BinaryNode binaryNode1 = (BinaryNode) treeTraversingParser0.getEmbeddedObject();
        assertFalse(binaryNode1.booleanValue());
    }

    @Test(timeout = 4000)
    public void test4141() throws Throwable {
        BinaryNode binaryNode0 = BinaryNode.EMPTY_BINARY_NODE;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(binaryNode0);
        Object object0 = treeTraversingParser0.getEmbeddedObject();
        assertNotNull(object0);
    }

    @Test(timeout = 4000)
    public void test4242() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        Stack<JsonNode> stack0 = new Stack<JsonNode>();
        ArrayNode arrayNode0 = new ArrayNode(jsonNodeFactory0, stack0);
        NumericNode numericNode0 = arrayNode0.numberNode((byte) (-25));
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(numericNode0);
        treeTraversingParser0.close();
        boolean boolean0 = treeTraversingParser0.isNaN();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4343() throws Throwable {
        DecimalNode decimalNode0 = DecimalNode.ZERO;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(decimalNode0);
        boolean boolean0 = treeTraversingParser0.isNaN();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4444() throws Throwable {
        BooleanNode booleanNode0 = BooleanNode.getTrue();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(booleanNode0);
        boolean boolean0 = treeTraversingParser0.isNaN();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4545() throws Throwable {
        BinaryNode binaryNode0 = BinaryNode.EMPTY_BINARY_NODE;
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(binaryNode0);
        treeTraversingParser0.close();
        byte[] byteArray0 = treeTraversingParser0.getBinaryValue();
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test4646() throws Throwable {
        BinaryNode binaryNode0 = BinaryNode.EMPTY_BINARY_NODE;
        POJONode pOJONode0 = new POJONode(binaryNode0);
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(pOJONode0);
        byte[] byteArray0 = treeTraversingParser0.getBinaryValue();
        assertNull(byteArray0);
    }

    @Test(timeout = 4000)
    public void test4747() throws Throwable {
        NullNode nullNode0 = new NullNode();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
        int int0 = treeTraversingParser0.readBinaryValue((Base64Variant) null, (OutputStream) byteArrayBuilder0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test4848() throws Throwable {
        ByteArrayBuilder byteArrayBuilder0 = new ByteArrayBuilder();
        BinaryNode binaryNode0 = new BinaryNode(byteArrayBuilder0.NO_BYTES);
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(binaryNode0);
        int int0 = treeTraversingParser0.readBinaryValue((Base64Variant) null, (OutputStream) byteArrayBuilder0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test4949() throws Throwable {
        NullNode nullNode0 = new NullNode();
        TreeTraversingParser treeTraversingParser0 = new TreeTraversingParser(nullNode0);
        treeTraversingParser0.nextToken();
        treeTraversingParser0.nextToken();
        try {
            treeTraversingParser0.getNumberType();
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Current token (null) not numeric, cannot use numeric value accessors
            //  at [Source: UNKNOWN; line: -1, column: -1]
            //
            verifyException("com.fasterxml.jackson.core.JsonParser", e);
        }
    }
}
