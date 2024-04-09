/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 18:45:22 GMT 2024
 */
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.File;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BeanSerializerBase_ESTest extends BeanSerializerBase_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        StdArraySerializers.DoubleArraySerializer stdArraySerializers_DoubleArraySerializer0 = new StdArraySerializers.DoubleArraySerializer();
        JavaType javaType0 = stdArraySerializers_DoubleArraySerializer0.getContentType();
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(javaType0);
        JsonSerializer<Object> jsonSerializer0 = beanSerializer0.unwrappingSerializer((NameTransformer) null);
        jsonSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MockFile mockFile0 = new MockFile("com.fastexml.jackson.datAbind.ser.std.CBllectiomSerializer");
        SerializationFeature serializationFeature0 = SerializationFeature.FAIL_ON_SELF_REFERENCES;
        SerializationFeature[] serializationFeatureArray0 = new SerializationFeature[0];
        ObjectWriter objectWriter0 = objectMapper0.writer(serializationFeature0, serializationFeatureArray0);
        objectMapper0.writeValue((File) mockFile0, (Object) objectWriter0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<NamedType> class0 = NamedType.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        BeanPropertyWriter[] beanPropertyWriterArray0 = new BeanPropertyWriter[0];
        BeanSerializer beanSerializer0 = new BeanSerializer(simpleType0, (BeanSerializerBuilder) null, beanPropertyWriterArray0, beanPropertyWriterArray0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProvider();
        beanSerializer0.resolve(serializerProvider0);
        beanSerializer0.usesObjectId();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        StdArraySerializers.DoubleArraySerializer stdArraySerializers_DoubleArraySerializer0 = new StdArraySerializers.DoubleArraySerializer();
        JavaType javaType0 = stdArraySerializers_DoubleArraySerializer0.getContentType();
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(javaType0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        MockFile mockFile0 = new MockFile("com.fasterxml.jackson.datAbind.ser.std.CBllectiomSerializer");
        JsonInclude.Include jsonInclude_Include0 = JsonInclude.Include.NON_EMPTY;
        objectMapper0.setSerializationInclusion(jsonInclude_Include0);
        objectMapper0.writeValue((File) mockFile0, (Object) beanSerializer0);
        mockFile0.length();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MockFile mockFile0 = new MockFile("com.fastexml.jackson.datAbind.ser.std.CBllectiomSerializer");
        SerializationFeature serializationFeature0 = SerializationFeature.FAIL_ON_SELF_REFERENCES;
        SerializationFeature[] serializationFeatureArray0 = new SerializationFeature[0];
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[7];
        MapperFeature mapperFeature0 = MapperFeature.DEFAULT_VIEW_INCLUSION;
        mapperFeatureArray0[0] = mapperFeature0;
        mapperFeatureArray0[1] = mapperFeature0;
        mapperFeatureArray0[2] = mapperFeature0;
        MapperFeature mapperFeature1 = MapperFeature.USE_STATIC_TYPING;
        mapperFeatureArray0[3] = mapperFeature0;
        mapperFeatureArray0[4] = mapperFeature0;
        mapperFeatureArray0[5] = mapperFeatureArray0[3];
        mapperFeatureArray0[6] = mapperFeature1;
        objectMapper0.enable(mapperFeatureArray0);
        ObjectWriter objectWriter0 = objectMapper0.writer(serializationFeature0, serializationFeatureArray0);
        objectMapper0.writeValue((File) mockFile0, (Object) objectWriter0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<EnumSetSerializer> class1 = EnumSetSerializer.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class0, class1);
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(mapType0);
        boolean boolean0 = beanSerializer0.usesObjectId();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        StdArraySerializers.BooleanArraySerializer stdArraySerializers_BooleanArraySerializer0 = new StdArraySerializers.BooleanArraySerializer();
        JavaType javaType0 = stdArraySerializers_BooleanArraySerializer0.getContentType();
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(javaType0);
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        ObjectIdGenerator<StdArraySerializers.FloatArraySerializer> objectIdGenerator0 = (ObjectIdGenerator<StdArraySerializers.FloatArraySerializer>) mock(ObjectIdGenerator.class, new ViolatedAssumptionAnswer());
        ObjectIdWriter objectIdWriter0 = ObjectIdWriter.construct(javaType0, propertyName0, objectIdGenerator0, true);
        BeanSerializerBase beanSerializerBase0 = beanSerializer0.withObjectIdWriter(objectIdWriter0);
        boolean boolean0 = beanSerializerBase0.usesObjectId();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(simpleType0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        AsWrapperTypeSerializer asWrapperTypeSerializer0 = new AsWrapperTypeSerializer(classNameIdResolver0, (BeanProperty) null);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonFactory jsonFactory0 = new JsonFactory();
        MockFileWriter mockFileWriter0 = new MockFileWriter("JSON");
        JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((Writer) mockFileWriter0);
        beanSerializer0.serializeWithType(classNameIdResolver0, jsonGenerator0, defaultSerializerProvider_Impl0, asWrapperTypeSerializer0);
        jsonGenerator0.canWriteBinaryNatively();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        StdArraySerializers.DoubleArraySerializer stdArraySerializers_DoubleArraySerializer0 = new StdArraySerializers.DoubleArraySerializer();
        JavaType javaType0 = stdArraySerializers_DoubleArraySerializer0.getContentType();
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(javaType0);
        PropertyName propertyName0 = BeanSerializerBase.NAME_FOR_OBJECT_REF;
        ObjectIdGenerator<NamedType> objectIdGenerator0 = (ObjectIdGenerator<NamedType>) mock(ObjectIdGenerator.class, new ViolatedAssumptionAnswer());
        ObjectIdWriter objectIdWriter0 = ObjectIdWriter.construct(javaType0, propertyName0, objectIdGenerator0, false);
        BeanSerializerBase beanSerializerBase0 = beanSerializer0.withObjectIdWriter(objectIdWriter0);
        JsonFactory jsonFactory0 = new JsonFactory();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        MockFileWriter mockFileWriter0 = new MockFileWriter("JSON");
        JsonGenerator jsonGenerator0 = jsonFactory0.createGenerator((Writer) mockFileWriter0);
        beanSerializerBase0.serializeWithType(stdArraySerializers_DoubleArraySerializer0, jsonGenerator0, defaultSerializerProvider_Impl0, (TypeSerializer) null);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        StdArraySerializers.DoubleArraySerializer stdArraySerializers_DoubleArraySerializer0 = new StdArraySerializers.DoubleArraySerializer();
        JavaType javaType0 = stdArraySerializers_DoubleArraySerializer0.getContentType();
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(javaType0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        ((BeanSerializerBase) beanSerializer0).serializeFieldsFiltered((Object) null, (JsonGenerator) null, defaultSerializerProvider_Impl0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(simpleType0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonNode jsonNode0 = beanSerializer0.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) simpleType0);
        jsonNode0.size();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(simpleType0);
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        beanSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, simpleType0);
        simpleType0.isInterface();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        StdArraySerializers.DoubleArraySerializer stdArraySerializers_DoubleArraySerializer0 = new StdArraySerializers.DoubleArraySerializer();
        JavaType javaType0 = stdArraySerializers_DoubleArraySerializer0.getContentType();
        BeanSerializer beanSerializer0 = BeanSerializer.createDummy(javaType0);
        beanSerializer0.acceptJsonFormatVisitor((JsonFormatVisitorWrapper) null, javaType0);
        javaType0.isFinal();
    }
}
