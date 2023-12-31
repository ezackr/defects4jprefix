/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 03:35:05 GMT 2023
 */
package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.MinimalClassNameIdResolver;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class TypeDeserializerBase_ESTest extends TypeDeserializerBase_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<String> class0 = String.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        MinimalClassNameIdResolver minimalClassNameIdResolver0 = new MinimalClassNameIdResolver(simpleType0, typeFactory0);
        Class<BuilderBasedDeserializer> class1 = BuilderBasedDeserializer.class;
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(simpleType0, minimalClassNameIdResolver0, "", true, class1);
        String string0 = asWrapperTypeDeserializer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        MinimalClassNameIdResolver minimalClassNameIdResolver0 = new MinimalClassNameIdResolver(simpleType0, typeFactory0);
        Class<JsonDeserializer> class0 = JsonDeserializer.class;
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(simpleType0, minimalClassNameIdResolver0, "bz` $Py7gS9R.$", true, class0);
        TypeIdResolver typeIdResolver0 = asWrapperTypeDeserializer0.getTypeIdResolver();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        Class<String> class0 = String.class;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "", true, class0);
        String string0 = asPropertyTypeDeserializer0.toString();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        Class<BeanDeserializer> class0 = BeanDeserializer.class;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "", true, class0);
        String string0 = asPropertyTypeDeserializer0.baseTypeName();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        Class<Integer> class0 = Integer.class;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, (TypeIdResolver) null, (String) null, false, class0);
        asPropertyTypeDeserializer0._deserializeWithNativeTypeId((JsonParser) null, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = null;
        asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer((AsPropertyTypeDeserializer) null, (BeanProperty) null);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(simpleType0, (TypeIdResolver) null, "|cv?f<-8ayer 8>$698:", false, (Class<?>) null);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        asWrapperTypeDeserializer0._deserializeWithNativeTypeId((JsonParser) null, defaultDeserializationContext_Impl0, (Object) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        MinimalClassNameIdResolver minimalClassNameIdResolver0 = new MinimalClassNameIdResolver(simpleType0, typeFactory0);
        Class<ArrayNode> class0 = ArrayNode.class;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, minimalClassNameIdResolver0, "}YkUL?*(", false, class0);
        Class<?> class1 = asPropertyTypeDeserializer0.getDefaultImpl();
        class1.toString();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        MinimalClassNameIdResolver minimalClassNameIdResolver0 = new MinimalClassNameIdResolver(simpleType0, typeFactory0);
        Class<ArrayNode> class0 = ArrayNode.class;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, minimalClassNameIdResolver0, "}YkUL?*(", false, class0);
        Class<?> class1 = asPropertyTypeDeserializer0.getDefaultImpl();
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(simpleType0, classNameIdResolver0, "@J", false, (Class<?>) null);
        Class<?> class0 = asWrapperTypeDeserializer0.getDefaultImpl();
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(simpleType0, (TypeIdResolver) null, "", false, (Class<?>) null);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        asWrapperTypeDeserializer0._deserializeWithNativeTypeId((JsonParser) null, defaultDeserializationContext_Impl0, "");
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        Class<JsonDeserializer> class0 = JsonDeserializer.class;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, (TypeIdResolver) null, "", false, class0);
        asPropertyTypeDeserializer0._findDefaultImplDeserializer((DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        Class<JsonDeserializer> class0 = JsonDeserializer.class;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, (TypeIdResolver) null, "", false, class0);
        CoreXMLDeserializers.Std coreXMLDeserializers_Std0 = new CoreXMLDeserializers.Std(class0, 4);
        asPropertyTypeDeserializer0._defaultImplDeserializer = (JsonDeserializer<Object>) coreXMLDeserializers_Std0;
        JsonDeserializer<Object> jsonDeserializer0 = asPropertyTypeDeserializer0._findDefaultImplDeserializer((DeserializationContext) null);
        jsonDeserializer0.isCachable();
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(simpleType0, (TypeIdResolver) null, "I", false, (Class<?>) null);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        asWrapperTypeDeserializer0._deserializeWithNativeTypeId((JsonParser) null, defaultDeserializationContext_Impl0, defaultDeserializationContext_Impl0);
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        Class<MinimalClassNameIdResolver> class0 = MinimalClassNameIdResolver.class;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, (TypeIdResolver) null, (String) null, true, class0);
        asPropertyTypeDeserializer0._handleUnknownTypeId((DeserializationContext) null, (String) null, (TypeIdResolver) null, simpleType0);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        MinimalClassNameIdResolver minimalClassNameIdResolver0 = new MinimalClassNameIdResolver(simpleType0, typeFactory0);
        Class<String> class0 = String.class;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, minimalClassNameIdResolver0, "?", false, class0);
        asPropertyTypeDeserializer0._handleUnknownTypeId((DeserializationContext) null, "?", minimalClassNameIdResolver0, simpleType0);
    }
}
