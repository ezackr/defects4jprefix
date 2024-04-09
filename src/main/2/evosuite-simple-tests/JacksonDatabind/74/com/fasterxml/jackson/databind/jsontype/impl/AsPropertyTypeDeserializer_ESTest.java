/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 21:56:25 GMT 2024
 */
package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class AsPropertyTypeDeserializer_ESTest extends AsPropertyTypeDeserializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Class<MinimalClassNameIdResolver> class0 = MinimalClassNameIdResolver.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        CollectionLikeType collectionLikeType0 = CollectionLikeType.upgradeFrom(simpleType0, simpleType0);
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(collectionLikeType0, (TypeIdResolver) null, "]0B(pEQ,?bi*Ngr", true, simpleType0);
        JsonTypeInfo.As jsonTypeInfo_As0 = asPropertyTypeDeserializer0.getTypeInclusion();
        assertEquals(JsonTypeInfo.As.PROPERTY, jsonTypeInfo_As0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer((JavaType) null, (TypeIdResolver) null, "$V$/", false, (JavaType) null);
        PropertyName propertyName0 = PropertyName.construct("$V$/", "$V$/");
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 0, (Object) null, propertyMetadata0);
        assertFalse(creatorProperty0.isVirtual());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        MinimalClassNameIdResolver minimalClassNameIdResolver0 = new MinimalClassNameIdResolver(javaType0, (TypeFactory) null);
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(javaType0, minimalClassNameIdResolver0, "_JvV:\"d+j_.TZ+ 8", true, javaType0);
        TypeDeserializer typeDeserializer0 = asPropertyTypeDeserializer0.forProperty((BeanProperty) null);
        assertSame(typeDeserializer0, asPropertyTypeDeserializer0);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ArrayNode arrayNode0 = new ArrayNode(jsonNodeFactory0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonParser jsonParser0 = arrayNode0.traverse();
        JavaType javaType0 = TypeFactory.unknownType();
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(javaType0, (TypeIdResolver) null, "' that is to contain type id  (for class ", true, (JavaType) null);
        asPropertyTypeDeserializer0.deserializeTypedFromObject(jsonParser0, defaultDeserializationContext_Impl0);
        assertEquals(0, jsonParser0.getCurrentTokenId());
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ArrayNode arrayNode0 = new ArrayNode(jsonNodeFactory0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonParser jsonParser0 = arrayNode0.traverse();
        JavaType javaType0 = TypeFactory.unknownType();
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(javaType0, (TypeIdResolver) null, "' that is to contain type id  (for class ", true, (JavaType) null);
        asPropertyTypeDeserializer0.deserializeTypedFromObject(jsonParser0, defaultDeserializationContext_Impl0);
        assertEquals(0, jsonParser0.currentTokenId());
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ArrayNode arrayNode0 = new ArrayNode(jsonNodeFactory0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
        ConfigOverrides configOverrides0 = new ConfigOverrides();
        RootNameLookup rootNameLookup0 = new RootNameLookup();
        DeserializationConfig deserializationConfig0 = new DeserializationConfig((BaseSettings) null, stdSubtypeResolver0, (SimpleMixInResolver) null, rootNameLookup0, configOverrides0);
        InjectableValues.Std injectableValues_Std0 = new InjectableValues.Std();
        JsonParser jsonParser0 = arrayNode0.traverse();
        DefaultDeserializationContext defaultDeserializationContext0 = defaultDeserializationContext_Impl0.createInstance(deserializationConfig0, jsonParser0, injectableValues_Std0);
        JavaType javaType0 = TypeFactory.unknownType();
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(javaType0, (TypeIdResolver) null, "' that is to contain type id  (for class ", true, (JavaType) null);
        try {
            asPropertyTypeDeserializer0.deserializeTypedFromObject(jsonParser0, defaultDeserializationContext0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Unexpected token (null), expected FIELD_NAME: missing property '' that is to contain type id  (for class ' that is to contain type id  (for class java.lang.Object)
            //  at [Source: java.lang.String@0000000012; line: -1, column: -1]
            //
            verifyException("com.fasterxml.jackson.databind.JsonMappingException", e);
        }
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
        JsonParser jsonParser0 = arrayNode0.traverse();
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer((JavaType) null, (TypeIdResolver) null, "com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer", true, (JavaType) null);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        TokenBuffer tokenBuffer0 = new TokenBuffer(jsonParser0);
        Object object0 = asPropertyTypeDeserializer0._deserializeTypedUsingDefaultImpl(jsonParser0, defaultDeserializationContext_Impl0, tokenBuffer0);
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ArrayNode arrayNode0 = new ArrayNode(jsonNodeFactory0);
        JsonParser jsonParser0 = arrayNode0.traverse();
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(javaType0, (TypeIdResolver) null, (String) null, false, javaType0);
        // Undeclared exception!
        try {
            asPropertyTypeDeserializer0.deserializeTypedFromAny(jsonParser0, (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", e);
        }
    }

    @Test(timeout = 4000)
    public void test78() throws Throwable {
        JsonNodeFactory jsonNodeFactory0 = new JsonNodeFactory(true);
        ArrayNode arrayNode0 = new ArrayNode(jsonNodeFactory0, 0);
        JsonParser jsonParser0 = arrayNode0.traverse();
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer((JavaType) null, (TypeIdResolver) null, "JSON", true, (JavaType) null);
        TokenFilter tokenFilter0 = TokenFilter.INCLUDE_ALL;
        FilteringParserDelegate filteringParserDelegate0 = new FilteringParserDelegate(jsonParser0, tokenFilter0, false, false);
        filteringParserDelegate0.nextBooleanValue();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory((DeserializerFactoryConfig) null);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        // Undeclared exception!
        try {
            asPropertyTypeDeserializer0.deserializeTypedFromAny(filteringParserDelegate0, defaultDeserializationContext_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase", e);
        }
    }
}
