/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 18:05:29 GMT 2024
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ValueNode;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class StringArrayDeserializer_ESTest extends StringArrayDeserializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer();
        // Undeclared exception!
        try {
            stringArrayDeserializer0.deserializeWithType(jsonParser0, deserializationContext0, (TypeDeserializer) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer();
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        // Undeclared exception!
        try {
            stringArrayDeserializer0.deserialize(jsonParser0, deserializationContext0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonDeserializer<InputStream> jsonDeserializer0 = (JsonDeserializer<InputStream>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class), any(com.fasterxml.jackson.databind.DeserializationContext.class));
        StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer(jsonDeserializer0);
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(true);
        ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
        JsonParser jsonParser0 = arrayNode0.traverse((ObjectCodec) objectMapper0);
        String[] stringArray0 = stringArrayDeserializer0._deserializeCustom(jsonParser0, defaultDeserializationContext_Impl0);
        assertEquals(4, jsonParser0.getCurrentTokenId());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonDeserializer<InputStream> jsonDeserializer0 = (JsonDeserializer<InputStream>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class), any(com.fasterxml.jackson.databind.DeserializationContext.class));
        StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer(jsonDeserializer0);
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(true);
        ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
        JsonParser jsonParser0 = arrayNode0.traverse((ObjectCodec) objectMapper0);
        String[] stringArray0 = stringArrayDeserializer0._deserializeCustom(jsonParser0, defaultDeserializationContext_Impl0);
        assertEquals(1, stringArray0.length);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer();
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(bufferRecycler0);
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(true);
        ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
        ArrayNode arrayNode0 = objectNode0.putArray("JSON");
        ValueNode valueNode0 = arrayNode0.numberNode((Float) null);
        JsonParser jsonParser0 = objectReader0.treeAsTokens(valueNode0);
        // Undeclared exception!
        try {
            stringArrayDeserializer0._deserializeCustom(jsonParser0, deserializationContext0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser((char[]) null, 3, 0);
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonDeserializer<Integer> jsonDeserializer0 = (JsonDeserializer<Integer>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null, (Object) null, (Object) null, (Object) null, (Object) null).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class), any(com.fasterxml.jackson.databind.DeserializationContext.class));
        StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer(jsonDeserializer0);
        // Undeclared exception!
        stringArrayDeserializer0._deserializeCustom(jsonParser0, defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        JsonParser jsonParser0 = jsonFactory0.createParser("\"u=,IM3n<VGk}P'");
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        jsonParser0.nextValue();
        StringArrayDeserializer stringArrayDeserializer0 = new StringArrayDeserializer();
        // Undeclared exception!
        try {
            stringArrayDeserializer0.deserialize(jsonParser0, deserializationContext0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }
}
