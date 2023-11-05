/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 00:40:30 GMT 2023
 */
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.JsonGeneratorDelegate;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.junit.runner.RunWith;

public class NumberSerializerTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<BigInteger> class0 = BigInteger.class;
        NumberSerializer numberSerializer0 = new NumberSerializer(class0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonNode jsonNode0 = numberSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) class0);
        assertEquals(1, jsonNode0.size());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        JsonSerializer<?> jsonSerializer0 = numberSerializer0.createContextual(defaultSerializerProvider_Impl0, beanProperty_Bogus0);
        assertFalse(jsonSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        BigInteger bigInteger0 = BigInteger.ONE;
        // Undeclared exception!
        try {
            numberSerializer0.serialize((Number) bigInteger0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        BigDecimal bigDecimal0 = BigDecimal.ONE;
        // Undeclared exception!
        try {
            numberSerializer0.serialize((Number) bigDecimal0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        Float float0 = new Float(1559.221);
        // Undeclared exception!
        try {
            numberSerializer0.instance.serialize((Number) float0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        Long long0 = new Long(2840L);
        // Undeclared exception!
        try {
            numberSerializer0.instance.serialize((Number) long0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        Double double0 = new Double(1319.9322534);
        JsonGeneratorDelegate jsonGeneratorDelegate0 = new JsonGeneratorDelegate((JsonGenerator) null, true);
        // Undeclared exception!
        try {
            numberSerializer0.instance.serialize((Number) double0, (JsonGenerator) jsonGeneratorDelegate0, (SerializerProvider) defaultSerializerProvider_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        JsonGeneratorDelegate jsonGeneratorDelegate0 = new JsonGeneratorDelegate((JsonGenerator) null);
        // Undeclared exception!
        try {
            numberSerializer0.serialize((Number) null, (JsonGenerator) jsonGeneratorDelegate0, (SerializerProvider) defaultSerializerProvider_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        // Undeclared exception!
        try {
            numberSerializer0.serialize((Number) 2, (JsonGenerator) null, (SerializerProvider) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null);
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        // Undeclared exception!
        try {
            numberSerializer0.serialize((Number) (byte) 0, (JsonGenerator) null, serializerProvider0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        Short short0 = Short.valueOf((short) 1);
        // Undeclared exception!
        try {
            numberSerializer0.instance.serialize((Number) short0, (JsonGenerator) null, (SerializerProvider) defaultSerializerProvider_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Class<BigInteger> class0 = BigInteger.class;
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonNode jsonNode0 = numberSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) class0);
        assertEquals(1, jsonNode0.size());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        Class<BigDecimal> class0 = BigDecimal.class;
        NumberSerializer numberSerializer0 = new NumberSerializer(class0);
        numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
        assertFalse(numberSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Class<BigInteger> class0 = BigInteger.class;
        NumberSerializer numberSerializer0 = new NumberSerializer(class0);
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base(defaultSerializerProvider_Impl0);
        numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
        assertFalse(numberSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        NumberSerializer numberSerializer0 = NumberSerializer.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base(defaultSerializerProvider_Impl0);
        numberSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
        assertFalse(numberSerializer0.isUnwrappingSerializer());
    }
}
