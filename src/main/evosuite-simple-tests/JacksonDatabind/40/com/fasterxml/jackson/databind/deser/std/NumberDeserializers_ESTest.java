/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 18:19:39 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8StreamJsonParser;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.NumberDeserializers;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class NumberDeserializers_ESTest extends NumberDeserializers_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<Long> class0 = Long.class;
        NumberDeserializers.LongDeserializer numberDeserializers_LongDeserializer0 = new NumberDeserializers.LongDeserializer(class0, (Long) null);
        assertTrue(numberDeserializers_LongDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<Long> class0 = Long.class;
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Integer> class0 = Integer.class;
        MappingIterator<Integer> mappingIterator0 = objectMapper0.readValues((JsonParser) null, class0);
        assertNotNull(mappingIterator0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<Integer> class0 = Integer.class;
        Integer integer0 = new Integer((-815));
        NumberDeserializers.IntegerDeserializer numberDeserializers_IntegerDeserializer0 = new NumberDeserializers.IntegerDeserializer(class0, integer0);
        assertTrue(numberDeserializers_IntegerDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        NumberDeserializers numberDeserializers0 = new NumberDeserializers();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Class<Character> class0 = Character.class;
        Character character0 = new Character('z');
        NumberDeserializers.CharacterDeserializer numberDeserializers_CharacterDeserializer0 = new NumberDeserializers.CharacterDeserializer(class0, character0);
        assertFalse(numberDeserializers_CharacterDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<Short> class0 = Short.class;
        Short short0 = new Short((short) (-1610));
        NumberDeserializers.ShortDeserializer numberDeserializers_ShortDeserializer0 = new NumberDeserializers.ShortDeserializer(class0, short0);
        IOContext iOContext0 = new IOContext((BufferRecycler) null, "7HSCqb)rF(1<ghv", true);
        byte[] byteArray0 = new byte[6];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (byte) 118);
        JsonFactory jsonFactory0 = new JsonFactory();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0, (DefaultSerializerProvider) null, defaultDeserializationContext_Impl0);
        ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = ByteQuadsCanonicalizer.createRoot();
        UTF8StreamJsonParser uTF8StreamJsonParser0 = new UTF8StreamJsonParser(iOContext0, 0, byteArrayInputStream0, objectMapper0, byteQuadsCanonicalizer0, byteArray0, (byte) 0, (byte) (-55), false);
        try {
            numberDeserializers_ShortDeserializer0.deserialize((JsonParser) uTF8StreamJsonParser0, (DeserializationContext) defaultDeserializationContext_Impl0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Can not deserialize instance of java.lang.Short out of null token
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<Byte> class0 = Byte.class;
        Byte byte0 = new Byte((byte) (-34));
        NumberDeserializers.ByteDeserializer numberDeserializers_ByteDeserializer0 = new NumberDeserializers.ByteDeserializer(class0, byte0);
        assertFalse(numberDeserializers_ByteDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        NumberDeserializers.ByteDeserializer numberDeserializers_ByteDeserializer0 = NumberDeserializers.ByteDeserializer.primitiveInstance;
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        try {
            numberDeserializers_ByteDeserializer0.deserialize(jsonParser0, (DeserializationContext) defaultDeserializationContext_Impl0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Can not deserialize instance of byte out of null token
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        NumberDeserializers.BooleanDeserializer numberDeserializers_BooleanDeserializer0 = NumberDeserializers.BooleanDeserializer.primitiveInstance;
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, numberDeserializers_BooleanDeserializer0, true);
        PipedReader pipedReader0 = new PipedReader();
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 3923, pipedReader0, (ObjectCodec) null, charsToNameCanonicalizer0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        try {
            numberDeserializers_BooleanDeserializer0.deserializeWithType(readerBasedJsonParser0, defaultDeserializationContext_Impl0, (TypeDeserializer) null);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Can not deserialize instance of boolean out of null token
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Boolean boolean0 = Boolean.valueOf(false);
        Class<Boolean> class0 = Boolean.class;
        NumberDeserializers.BooleanDeserializer numberDeserializers_BooleanDeserializer0 = new NumberDeserializers.BooleanDeserializer(class0, boolean0);
        assertFalse(numberDeserializers_BooleanDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        NumberDeserializers.BooleanDeserializer numberDeserializers_BooleanDeserializer0 = NumberDeserializers.BooleanDeserializer.primitiveInstance;
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(false);
        ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
        JsonFactory jsonFactory0 = new JsonFactory((ObjectCodec) null);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0, defaultSerializerProvider_Impl0, (DefaultDeserializationContext) null);
        JsonParser jsonParser0 = arrayNode0.traverse((ObjectCodec) objectMapper0);
        TokenFilter tokenFilter0 = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate filteringParserDelegate0 = new FilteringParserDelegate(jsonParser0, tokenFilter0, false, false);
        // Undeclared exception!
        try {
            numberDeserializers_BooleanDeserializer0.deserialize((JsonParser) filteringParserDelegate0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Class<Float> class0 = Float.class;
        Float float0 = new Float(Double.NEGATIVE_INFINITY);
        NumberDeserializers.FloatDeserializer numberDeserializers_FloatDeserializer0 = new NumberDeserializers.FloatDeserializer(class0, float0);
        assertFalse(numberDeserializers_FloatDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        NumberDeserializers.FloatDeserializer numberDeserializers_FloatDeserializer0 = NumberDeserializers.FloatDeserializer.primitiveInstance;
        JsonFactory jsonFactory0 = new JsonFactory();
        byte[] byteArray0 = new byte[5];
        byteArray0[1] = (byte) 89;
        byteArray0[2] = (byte) 74;
        JsonParser jsonParser0 = jsonFactory0.createParser(byteArray0);
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        try {
            numberDeserializers_FloatDeserializer0.deserialize(jsonParser0, (DeserializationContext) defaultDeserializationContext_Impl0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Can not deserialize instance of float out of null token
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Class<Double> class0 = Double.class;
        Double double0 = new Double((-3799.436));
        NumberDeserializers.DoubleDeserializer numberDeserializers_DoubleDeserializer0 = new NumberDeserializers.DoubleDeserializer(class0, double0);
        assertFalse(numberDeserializers_DoubleDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        NumberDeserializers.DoubleDeserializer numberDeserializers_DoubleDeserializer0 = NumberDeserializers.DoubleDeserializer.wrapperInstance;
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        IOContext iOContext0 = new IOContext(bufferRecycler0, bufferRecycler0, true);
        PipedWriter pipedWriter0 = new PipedWriter();
        PipedReader pipedReader0 = new PipedReader(pipedWriter0);
        CharsToNameCanonicalizer charsToNameCanonicalizer0 = CharsToNameCanonicalizer.createRoot();
        char[] charArray0 = new char[2];
        ReaderBasedJsonParser readerBasedJsonParser0 = new ReaderBasedJsonParser(iOContext0, 0, pipedReader0, objectMapper0, charsToNameCanonicalizer0, charArray0, 0, 1, true);
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        try {
            numberDeserializers_DoubleDeserializer0.deserialize((JsonParser) readerBasedJsonParser0, (DeserializationContext) defaultDeserializationContext_Impl0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Can not deserialize instance of java.lang.Double out of null token
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper();
        NumberDeserializers.DoubleDeserializer numberDeserializers_DoubleDeserializer0 = NumberDeserializers.DoubleDeserializer.wrapperInstance;
        byte[] byteArray0 = new byte[9];
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1970, (byte) 5);
        JsonParser jsonParser0 = jsonFactory0.createParser((InputStream) byteArrayInputStream0);
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        try {
            numberDeserializers_DoubleDeserializer0.deserializeWithType(jsonParser0, deserializationContext0, (TypeDeserializer) null);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Can not deserialize instance of java.lang.Double out of null token
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Class<Float> class0 = Float.TYPE;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "JSON");
        assertFalse(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "JSON");
        assertTrue(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Class<Boolean> class0 = Boolean.TYPE;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "JSON");
        assertFalse(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Class<Long> class0 = Long.TYPE;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "JSON");
        assertTrue(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Class<Double> class0 = Double.TYPE;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "com.fasterxml.jackson.databind.deser.std.NumberDeserializers$ShortDeserializer");
        assertFalse(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Class<Character> class0 = Character.TYPE;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "JSON");
        assertFalse(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        Class<Byte> class0 = Byte.TYPE;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "JSON");
        assertFalse(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Class<Short> class0 = Short.TYPE;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "JSON");
        assertFalse(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        Class<Float> class0 = Float.class;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "JSON");
        assertNull(jsonDeserializer0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Boolean> class0 = Boolean.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        Class<BigDecimal> class0 = BigDecimal.class;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "java.math.BigInteger");
        assertFalse(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        Class<BigDecimal> class0 = BigDecimal.class;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "java.math.BigInteger");
        assertNotNull(jsonDeserializer0);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        Class<Double> class0 = Double.class;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "java.math.BigInteger");
        assertNotNull(jsonDeserializer0);
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        Class<Double> class0 = Double.class;
        JsonDeserializer<?> jsonDeserializer0 = NumberDeserializers.find(class0, "java.math.BigInteger");
        assertFalse(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Character> class0 = Character.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Byte> class0 = Byte.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Short> class0 = Short.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test3234() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Float> class0 = Float.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test3335() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Object> class0 = Object.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test3436() throws Throwable {
        Class<String> class0 = String.class;
        // Undeclared exception!
        try {
            NumberDeserializers.find(class0, "java.math.BigInteger");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Internal error: can't find deserializer for java.lang.String
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.NumberDeserializers", e);
        }
    }

    @Test(timeout = 4000)
    public void test3537() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        Class<BigInteger> class0 = BigInteger.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test3638() throws Throwable {
        NumberDeserializers.CharacterDeserializer numberDeserializers_CharacterDeserializer0 = NumberDeserializers.CharacterDeserializer.wrapperInstance;
        Character character0 = numberDeserializers_CharacterDeserializer0.getNullValue((DeserializationContext) null);
        assertNull(character0);
    }

    @Test(timeout = 4000)
    public void test3739() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        NumberDeserializers.IntegerDeserializer numberDeserializers_IntegerDeserializer0 = NumberDeserializers.IntegerDeserializer.primitiveInstance;
        Integer integer0 = numberDeserializers_IntegerDeserializer0.getNullValue((DeserializationContext) defaultDeserializationContext_Impl0);
        assertEquals(0, (int) integer0);
    }

    @Test(timeout = 4000)
    public void test3840() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        NumberDeserializers.CharacterDeserializer numberDeserializers_CharacterDeserializer0 = NumberDeserializers.CharacterDeserializer.primitiveInstance;
        // Undeclared exception!
        try {
            numberDeserializers_CharacterDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$CharacterDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test3941() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        NumberDeserializers.IntegerDeserializer numberDeserializers_IntegerDeserializer0 = NumberDeserializers.IntegerDeserializer.wrapperInstance;
        // Undeclared exception!
        try {
            numberDeserializers_IntegerDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test4042() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        NumberDeserializers.IntegerDeserializer numberDeserializers_IntegerDeserializer0 = NumberDeserializers.IntegerDeserializer.wrapperInstance;
        // Undeclared exception!
        try {
            numberDeserializers_IntegerDeserializer0.deserializeWithType(jsonParser0, (DeserializationContext) null, (TypeDeserializer) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test4143() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        NumberDeserializers.LongDeserializer numberDeserializers_LongDeserializer0 = NumberDeserializers.LongDeserializer.wrapperInstance;
        // Undeclared exception!
        try {
            numberDeserializers_LongDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test4244() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        NumberDeserializers.NumberDeserializer numberDeserializers_NumberDeserializer0 = NumberDeserializers.NumberDeserializer.instance;
        // Undeclared exception!
        try {
            numberDeserializers_NumberDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test4345() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        NumberDeserializers.NumberDeserializer numberDeserializers_NumberDeserializer0 = new NumberDeserializers.NumberDeserializer();
        // Undeclared exception!
        try {
            numberDeserializers_NumberDeserializer0.deserializeWithType(jsonParser0, (DeserializationContext) null, (TypeDeserializer) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test4446() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        NumberDeserializers.BigIntegerDeserializer numberDeserializers_BigIntegerDeserializer0 = new NumberDeserializers.BigIntegerDeserializer();
        // Undeclared exception!
        try {
            numberDeserializers_BigIntegerDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigIntegerDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test4547() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        NumberDeserializers.BigDecimalDeserializer numberDeserializers_BigDecimalDeserializer0 = new NumberDeserializers.BigDecimalDeserializer();
        // Undeclared exception!
        try {
            numberDeserializers_BigDecimalDeserializer0.deserialize(jsonParser0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BigDecimalDeserializer", e);
        }
    }
}
