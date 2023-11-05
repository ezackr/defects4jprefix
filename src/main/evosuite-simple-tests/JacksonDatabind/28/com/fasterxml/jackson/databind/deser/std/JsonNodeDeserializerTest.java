/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 17:46:30 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.runner.RunWith;

public class JsonNodeDeserializerTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Class<ArrayNode> class0 = ArrayNode.class;
        JsonDeserializer<? extends JsonNode> jsonDeserializer0 = JsonNodeDeserializer.getDeserializer(class0);
        assertTrue(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        JsonNodeDeserializer.ObjectDeserializer jsonNodeDeserializer_ObjectDeserializer0 = new JsonNodeDeserializer.ObjectDeserializer();
        assertTrue(jsonNodeDeserializer_ObjectDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        JsonNodeDeserializer jsonNodeDeserializer0 = new JsonNodeDeserializer();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonNode jsonNode0 = jsonNodeDeserializer0.getNullValue((DeserializationContext) defaultDeserializationContext_Impl0);
        assertFalse(jsonNode0.isShort());
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        JsonNodeDeserializer jsonNodeDeserializer0 = new JsonNodeDeserializer();
        JsonNode jsonNode0 = jsonNodeDeserializer0.getNullValue();
        assertFalse(jsonNode0.isInt());
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Class<ObjectNode> class0 = ObjectNode.class;
        JsonDeserializer<? extends JsonNode> jsonDeserializer0 = JsonNodeDeserializer.getDeserializer(class0);
        assertTrue(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        Class<String> class0 = String.class;
        JsonDeserializer<? extends JsonNode> jsonDeserializer0 = JsonNodeDeserializer.getDeserializer(class0);
        assertTrue(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        JsonNodeDeserializer jsonNodeDeserializer0 = new JsonNodeDeserializer();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        TokenFilter tokenFilter0 = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate filteringParserDelegate0 = new FilteringParserDelegate((JsonParser) null, tokenFilter0, true, true);
        // Undeclared exception!
        try {
            jsonNodeDeserializer0.deserialize((JsonParser) filteringParserDelegate0, (DeserializationContext) defaultDeserializationContext_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        TokenFilter tokenFilter0 = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate filteringParserDelegate0 = new FilteringParserDelegate((JsonParser) null, tokenFilter0, true, true);
        JsonNodeDeserializer.ObjectDeserializer jsonNodeDeserializer_ObjectDeserializer0 = JsonNodeDeserializer.ObjectDeserializer.getInstance();
        // Undeclared exception!
        try {
            jsonNodeDeserializer_ObjectDeserializer0.deserialize((JsonParser) filteringParserDelegate0, (DeserializationContext) defaultDeserializationContext_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        TokenFilter tokenFilter0 = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate filteringParserDelegate0 = new FilteringParserDelegate((JsonParser) null, tokenFilter0, false, false);
        JsonNodeDeserializer.ArrayDeserializer jsonNodeDeserializer_ArrayDeserializer0 = new JsonNodeDeserializer.ArrayDeserializer();
        // Undeclared exception!
        try {
            jsonNodeDeserializer_ArrayDeserializer0.deserialize((JsonParser) filteringParserDelegate0, (DeserializationContext) defaultDeserializationContext_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
