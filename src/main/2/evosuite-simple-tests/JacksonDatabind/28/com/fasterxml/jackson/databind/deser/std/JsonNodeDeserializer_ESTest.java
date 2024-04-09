/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 19:30:56 GMT 2024
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class JsonNodeDeserializer_ESTest extends JsonNodeDeserializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Class<ArrayNode> class0 = ArrayNode.class;
        JsonDeserializer<? extends JsonNode> jsonDeserializer0 = JsonNodeDeserializer.getDeserializer(class0);
        assertTrue(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        JsonNodeDeserializer jsonNodeDeserializer0 = new JsonNodeDeserializer();
        JsonNode jsonNode0 = jsonNodeDeserializer0.getNullValue((DeserializationContext) null);
        assertFalse(jsonNode0.isFloatingPointNumber());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        JsonNodeDeserializer jsonNodeDeserializer0 = new JsonNodeDeserializer();
        JsonNode jsonNode0 = jsonNodeDeserializer0.getNullValue();
        assertFalse(jsonNode0.isFloatingPointNumber());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Class<ObjectNode> class0 = ObjectNode.class;
        JsonDeserializer<? extends JsonNode> jsonDeserializer0 = JsonNodeDeserializer.getDeserializer(class0);
        assertTrue(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Class<String> class0 = String.class;
        JsonDeserializer<? extends JsonNode> jsonDeserializer0 = JsonNodeDeserializer.getDeserializer(class0);
        assertTrue(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        JsonNodeDeserializer jsonNodeDeserializer0 = new JsonNodeDeserializer();
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        // Undeclared exception!
        try {
            jsonNodeDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        JsonNodeDeserializer.ObjectDeserializer jsonNodeDeserializer_ObjectDeserializer0 = new JsonNodeDeserializer.ObjectDeserializer();
        // Undeclared exception!
        try {
            jsonNodeDeserializer_ObjectDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ObjectDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        JsonNodeDeserializer.ArrayDeserializer jsonNodeDeserializer_ArrayDeserializer0 = new JsonNodeDeserializer.ArrayDeserializer();
        // Undeclared exception!
        try {
            jsonNodeDeserializer_ArrayDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer$ArrayDeserializer", e);
        }
    }
}
