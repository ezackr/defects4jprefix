/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 18:20:16 GMT 2024
 */
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.io.File;
import java.lang.reflect.Type;
import java.time.temporal.ChronoField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class StdKeySerializer_ESTest extends StdKeySerializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        StdKeySerializer stdKeySerializer0 = new StdKeySerializer();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        Object object0 = new Object();
        ChronoField chronoField0 = ChronoField.YEAR;
        ArrayType arrayType0 = ArrayType.construct(simpleType0, object0, chronoField0);
        JsonNode jsonNode0 = stdKeySerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) arrayType0);
        jsonNode0.isLong();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        StdKeySerializer stdKeySerializer0 = new StdKeySerializer();
        Class<Integer> class0 = Integer.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        stdKeySerializer0.acceptJsonFormatVisitor((JsonFormatVisitorWrapper) null, simpleType0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        StdKeySerializer stdKeySerializer0 = new StdKeySerializer();
        Object object0 = new Object();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
        MockFile mockFile0 = new MockFile("JSON", "JSON");
        JsonEncoding jsonEncoding0 = JsonEncoding.UTF32_BE;
        WriterBasedJsonGenerator writerBasedJsonGenerator0 = (WriterBasedJsonGenerator) jsonFactory0.createGenerator((File) mockFile0, jsonEncoding0);
        stdKeySerializer0.serialize(object0, writerBasedJsonGenerator0, defaultSerializerProvider_Impl0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        StdKeySerializer stdKeySerializer0 = new StdKeySerializer();
        JsonFactory jsonFactory0 = new JsonFactory();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        MockFile mockFile0 = new MockFile((String) null, "G^Z}fA^/m`,ky7:E2_");
        JsonEncoding jsonEncoding0 = JsonEncoding.UTF32_BE;
        JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((File) mockFile0, jsonEncoding0);
        MockDate mockDate0 = new MockDate(56319);
        stdKeySerializer0.serialize(mockDate0, jsonGenerator0, defaultSerializerProvider_Impl0);
    }
}
