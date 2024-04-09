/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 19:48:50 GMT 2024
 */
package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class AsWrapperTypeDeserializer_ESTest extends AsWrapperTypeDeserializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(javaType0, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(javaType0, classNameIdResolver0, "com.fasterxml.jackson.databind.type.SimpleType", false, class0);
        asWrapperTypeDeserializer0.deserializeTypedFromScalar((JsonParser) null, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(javaType0, typeFactory0);
        Class<String> class0 = String.class;
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(javaType0, classNameIdResolver0, "", true, class0);
        JsonTypeInfo.As jsonTypeInfo_As0 = asWrapperTypeDeserializer0.getTypeInclusion();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(javaType0, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(javaType0, classNameIdResolver0, "com.fasterxml.jackson.databind.type.SimpleType", false, class0);
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("com.fasterxml.jackson.databind.type.SimpleType");
        asWrapperTypeDeserializer0.deserializeTypedFromArray(jsonParser0, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(javaType0, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(javaType0, classNameIdResolver0, "com.fasterxml.jackson.databind.type.SimpleType", false, class0);
        asWrapperTypeDeserializer0.deserializeTypedFromAny((JsonParser) null, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(javaType0, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(javaType0, classNameIdResolver0, "com.fasterxml.jackson.databind.type.SimpleType", false, class0);
        asWrapperTypeDeserializer0.deserializeTypedFromObject((JsonParser) null, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(javaType0, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(javaType0, classNameIdResolver0, "com.fasterxml.jackson.databind.type.SimpleType", true, class0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        PropertyName propertyName0 = PropertyName.construct("com.fasterxml.jackson.databind.type.SimpleType", "JSON");
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, javaType0, propertyName0, asWrapperTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 1, deserializationContext0, propertyMetadata0);
        creatorProperty0.getName();
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Stack> class0 = Stack.class;
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
        MinimalClassNameIdResolver minimalClassNameIdResolver0 = new MinimalClassNameIdResolver(collectionType0, typeFactory0);
        Class<JsonFormat.Shape> class1 = JsonFormat.Shape.class;
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(collectionType0, minimalClassNameIdResolver0, "uh=", false, class1);
        TypeDeserializer typeDeserializer0 = asWrapperTypeDeserializer0.forProperty((BeanProperty) null);
    }
}
