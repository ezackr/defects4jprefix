/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 19:05:20 GMT 2024
 */
package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeSerializer;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RawValue;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Time;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BasicSerializerFactory_ESTest extends BasicSerializerFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        beanSerializerFactory0.buildIteratorSerializer((SerializationConfig) null, (JavaType) null, (BeanDescription) null, false, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        beanSerializerFactory0.withSerializerModifier((BeanSerializerModifier) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        beanSerializerFactory0.findFilterId((SerializationConfig) null, (BeanDescription) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        beanSerializerFactory0.buildMapEntrySerializer((SerializationConfig) null, (JavaType) null, (BeanDescription) null, true, (JavaType) null, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Serializers.Base serializers_Base0 = new Serializers.Base();
        SerializerFactory serializerFactory0 = beanSerializerFactory0.withAdditionalSerializers(serializers_Base0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        BeanPropertyWriter beanPropertyWriter0 = new BeanPropertyWriter();
        AsExistingPropertyTypeSerializer asExistingPropertyTypeSerializer0 = new AsExistingPropertyTypeSerializer((TypeIdResolver) null, beanPropertyWriter0, "fa&U7nng");
        ContainerSerializer<?> containerSerializer0 = beanSerializerFactory0.buildIndexedListSerializer(simpleType0, false, asExistingPropertyTypeSerializer0, (JsonSerializer<Object>) null);
        containerSerializer0.usesObjectId();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        beanSerializerFactory0.buildIterableSerializer((SerializationConfig) null, (JavaType) null, (BeanDescription) null, true, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        SerializerFactoryConfig serializerFactoryConfig0 = new SerializerFactoryConfig();
        BeanSerializerFactory beanSerializerFactory0 = new BeanSerializerFactory(serializerFactoryConfig0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        ObjectMapper objectMapper0 = new ObjectMapper();
        ContextAttributes contextAttributes0 = ContextAttributes.Impl.getEmpty();
        ObjectReader objectReader0 = objectMapper0.reader(contextAttributes0);
        TypeFactory typeFactory0 = objectReader0.getTypeFactory();
        Class<Charset> class0 = Charset.class;
        JavaType javaType0 = typeFactory0.constructType((Type) class0, (Class<?>) class0);
        JavaType javaType1 = typeFactory0.constructReferenceType(class0, javaType0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((AnnotatedMethod) null).when(pOJOPropertiesCollector0).getJsonValueMethod();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0._createSerializer2(defaultSerializerProvider_Impl0, javaType1, basicBeanDescription0, false);
        jsonSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<SQLException> class0 = SQLException.class;
        boolean boolean0 = beanSerializerFactory0.isIndexedList(class0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SerializerFactoryConfig serializerFactoryConfig0 = beanSerializerFactory0.getFactoryConfig();
        serializerFactoryConfig0.hasSerializers();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Map> class0 = Map.class;
        Class<ArrayType> class1 = ArrayType.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class0);
        ContainerSerializer<?> containerSerializer0 = beanSerializerFactory0.buildCollectionSerializer(mapType0, false, (TypeSerializer) null, defaultSerializerProvider_Impl0.DEFAULT_NULL_KEY_SERIALIZER);
        containerSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Serializers.Base serializers_Base0 = new Serializers.Base();
        SerializerFactory serializerFactory0 = beanSerializerFactory0.withAdditionalKeySerializers(serializers_Base0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<Float> class0 = Float.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.buildEnumSetSerializer(simpleType0);
        jsonSerializer0.usesObjectId();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = new BeanSerializerFactory((SerializerFactoryConfig) null);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((AnnotatedMethod) null).when(pOJOPropertiesCollector0).getJsonValueMethod();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        beanSerializerFactory0._createSerializer2(defaultSerializerProvider_Impl0, simpleType0, basicBeanDescription0, true);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        HashMap<Object, AnnotatedMember> hashMap0 = new HashMap<Object, AnnotatedMember>();
        Class<BigInteger> class0 = BigInteger.class;
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) simpleType0, (Object) null, (Object) hashMap0);
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.findSerializerByLookup(referenceType0, (SerializationConfig) null, basicBeanDescription0, false);
        jsonSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        HashMap<Object, AnnotatedMember> hashMap0 = new HashMap<Object, AnnotatedMember>();
        Class<Time> class0 = Time.class;
        Time time0 = new Time(0L);
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) simpleType0, (Object) time0, (Object) hashMap0);
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.findSerializerByLookup(referenceType0, (SerializationConfig) null, basicBeanDescription0, true);
        jsonSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<BinaryNode> class0 = BinaryNode.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0._createSerializer2(defaultSerializerProvider_Impl0, javaType0, (BeanDescription) null, false);
        jsonSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<BigInteger> class0 = BigInteger.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.findSerializerByPrimaryType(defaultSerializerProvider_Impl0, simpleType0, basicBeanDescription0, true);
        jsonSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.findSerializerByAddonType((SerializationConfig) null, simpleType0, (BeanDescription) null, false);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<BinaryNode> class0 = BinaryNode.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        beanSerializerFactory0.findSerializerByAddonType((SerializationConfig) null, javaType0, (BeanDescription) null, true);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<StringBuilder> class0 = StringBuilder.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.findSerializerByAddonType((SerializationConfig) null, simpleType0, (BeanDescription) null, true);
        jsonSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        beanSerializerFactory0.buildContainerSerializer(defaultSerializerProvider_Impl0, (JavaType) null, (BeanDescription) null, true);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<BinaryNode> class0 = BinaryNode.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        beanSerializerFactory0.buildContainerSerializer(defaultSerializerProvider_Impl0, javaType0, (BeanDescription) null, false);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Map> class0 = Map.class;
        Class<SQLFeatureNotSupportedException> class1 = SQLFeatureNotSupportedException.class;
        Class<MapType> class2 = MapType.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class1, class2);
        MapType mapType1 = mapType0.withStaticTyping();
        beanSerializerFactory0.buildContainerSerializer(defaultSerializerProvider_Impl0, mapType1, (BeanDescription) null, false);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Map> class0 = Map.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        MapType mapType1 = mapType0.withStaticTyping();
        beanSerializerFactory0.buildContainerSerializer(defaultSerializerProvider_Impl0, mapType1, (BeanDescription) null, false);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<InetAddress> class0 = InetAddress.class;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        AnnotationIntrospector annotationIntrospector1 = AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector0);
        AnnotatedClass annotatedClass0 = AnnotatedClass.construct(class0, annotationIntrospector1, (ClassIntrospector.MixInResolver) null);
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forOtherUse((MapperConfig<?>) null, (JavaType) null, annotatedClass0);
        Object object0 = beanSerializerFactory0.findSuppressableContentValue((SerializationConfig) null, (JavaType) null, basicBeanDescription0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<SimpleType> class0 = SimpleType.class;
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        JsonSerializer<?> jsonSerializer0 = beanSerializerFactory0.buildArraySerializer((SerializationConfig) null, arrayType0, (BeanDescription) null, false, (TypeSerializer) null, (JsonSerializer<Object>) null);
        jsonSerializer0.usesObjectId();
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<InetAddress> class0 = InetAddress.class;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        AnnotationIntrospector annotationIntrospector1 = AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector0);
        AnnotatedClass annotatedClass0 = AnnotatedClass.construct(class0, annotationIntrospector1, (ClassIntrospector.MixInResolver) null);
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forOtherUse((MapperConfig<?>) null, (JavaType) null, annotatedClass0);
        beanSerializerFactory0.buildEnumSerializer((SerializationConfig) null, (JavaType) null, basicBeanDescription0);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        beanSerializerFactory0.usesStaticTyping((SerializationConfig) null, (BeanDescription) null, (TypeSerializer) null);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        BeanPropertyWriter beanPropertyWriter0 = new BeanPropertyWriter();
        AsWrapperTypeSerializer asWrapperTypeSerializer0 = new AsWrapperTypeSerializer((TypeIdResolver) null, beanPropertyWriter0);
        boolean boolean0 = beanSerializerFactory0.usesStaticTyping((SerializationConfig) null, (BeanDescription) null, asWrapperTypeSerializer0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<Date> class0 = Date.class;
        Class<?> class1 = beanSerializerFactory0._verifyAsClass(class0, "7l", class0);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<Date> class0 = Date.class;
        Class<?> class1 = beanSerializerFactory0._verifyAsClass((Object) null, "4|", class0);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<Date> class0 = Date.class;
        beanSerializerFactory0._verifyAsClass(",-n;", ",-n;", class0);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        Class<RawValue> class0 = RawValue.class;
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<Date> class1 = Date.class;
        Class<?> class2 = beanSerializerFactory0._verifyAsClass(class0, ",-n;", class1);
        class2.toString();
    }

    @Test(timeout = 4000)
    public void test3435() throws Throwable {
        Class<RawValue> class0 = RawValue.class;
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        Class<Date> class1 = Date.class;
        Class<?> class2 = beanSerializerFactory0._verifyAsClass(class0, ",-n;", class1);
    }
}
