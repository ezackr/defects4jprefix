/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 00:38:45 GMT 2024
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class StringCollectionDeserializer_ESTest extends StringCollectionDeserializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, (JsonDeserializer<?>) null, valueInstantiator_Base0);
        // Undeclared exception!
        try {
            stringCollectionDeserializer0.findBackReference("");
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Cannot handle managed/back reference '': type: container deserializer of type com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer returned null for 'getContentDeserializer()'
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, (JsonDeserializer<?>) null, valueInstantiator_Base0);
        // Undeclared exception!
        try {
            stringCollectionDeserializer0.getEmptyValue((DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, (JsonDeserializer<?>) null, valueInstantiator_Base0);
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.withExactBigDecimals(true);
        ArrayNode arrayNode0 = jsonNodeFactory0.arrayNode();
        JsonParser jsonParser0 = arrayNode0.traverse();
        // Undeclared exception!
        try {
            stringCollectionDeserializer0.deserializeWithType(jsonParser0, (DeserializationContext) null, (TypeDeserializer) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, (JsonDeserializer<?>) null, valueInstantiator_Base0);
        Boolean boolean0 = Boolean.valueOf(true);
        StringCollectionDeserializer stringCollectionDeserializer1 = stringCollectionDeserializer0.withResolved((JsonDeserializer<?>) null, (JsonDeserializer<?>) null, (NullValueProvider) null, boolean0);
        assertNotSame(stringCollectionDeserializer1, stringCollectionDeserializer0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<BasicBeanDescription> class0 = BasicBeanDescription.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        Class<BooleanNode> class0 = BooleanNode.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 80);
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, fromStringDeserializer_Std0, valueInstantiator_Base0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        StringCollectionDeserializer stringCollectionDeserializer1 = new StringCollectionDeserializer(javaType0, stringCollectionDeserializer0, valueInstantiator_Base0);
        assertFalse(stringCollectionDeserializer1.isCachable());
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        Class<BooleanNode> class0 = BooleanNode.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 80);
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, fromStringDeserializer_Std0, valueInstantiator_Base0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        StringCollectionDeserializer stringCollectionDeserializer1 = new StringCollectionDeserializer(javaType0, stringCollectionDeserializer0, valueInstantiator_Base0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonDeserializer<?> jsonDeserializer0 = stringCollectionDeserializer1.createContextual(defaultDeserializationContext_Impl0, beanProperty_Bogus0);
        assertTrue(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        Class<SimpleModule> class0 = SimpleModule.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 1087);
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, fromStringDeserializer_Std0, valueInstantiator_Base0);
        StringCollectionDeserializer stringCollectionDeserializer1 = stringCollectionDeserializer0.withResolved(fromStringDeserializer_Std0, fromStringDeserializer_Std0, fromStringDeserializer_Std0, (Boolean) null);
        assertNotSame(stringCollectionDeserializer1, stringCollectionDeserializer0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        Class<BooleanNode> class0 = BooleanNode.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 102);
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, fromStringDeserializer_Std0, valueInstantiator_Base0);
        boolean boolean0 = stringCollectionDeserializer0.isCachable();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        JsonDeserializer<ObjectIdResolver> jsonDeserializer0 = (JsonDeserializer<ObjectIdResolver>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer((JavaType) null, (ValueInstantiator) null, jsonDeserializer0, (JsonDeserializer<?>) null, jsonDeserializer0, (Boolean) null);
        boolean boolean0 = stringCollectionDeserializer0.isCachable();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer((JavaType) null, (JsonDeserializer<?>) null, (ValueInstantiator) null);
        // Undeclared exception!
        try {
            stringCollectionDeserializer0.createContextual((DeserializationContext) null, (BeanProperty) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer((JavaType) null, (JsonDeserializer<?>) null, (ValueInstantiator) null);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        Boolean boolean0 = Boolean.TRUE;
        StringCollectionDeserializer stringCollectionDeserializer1 = new StringCollectionDeserializer((JavaType) null, (ValueInstantiator) null, stringCollectionDeserializer0, stringCollectionDeserializer0, stringCollectionDeserializer0, boolean0);
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        // Undeclared exception!
        try {
            stringCollectionDeserializer1.deserialize(jsonParser0, (DeserializationContext) defaultDeserializationContext_Impl0, (Collection<String>) linkedHashSet0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        Class<BooleanNode> class0 = BooleanNode.class;
        FromStringDeserializer.Std fromStringDeserializer_Std0 = new FromStringDeserializer.Std(class0, 102);
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("");
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, valueInstantiator_Base0, fromStringDeserializer_Std0, (JsonDeserializer<?>) null, (NullValueProvider) null, (Boolean) null);
        // Undeclared exception!
        try {
            stringCollectionDeserializer0.deserialize(jsonParser0, (DeserializationContext) defaultDeserializationContext_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer((JavaType) null, (JsonDeserializer<?>) null, (ValueInstantiator) null);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        // Undeclared exception!
        try {
            stringCollectionDeserializer0.deserialize(jsonParser0, (DeserializationContext) defaultDeserializationContext_Impl0, (Collection<String>) linkedHashSet0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        Boolean boolean0 = Boolean.FALSE;
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, valueInstantiator_Base0, (JsonDeserializer<?>) null, (JsonDeserializer<?>) null, (NullValueProvider) null, boolean0);
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        // Undeclared exception!
        try {
            stringCollectionDeserializer0.deserialize(jsonParser0, (DeserializationContext) defaultDeserializationContext_Impl0, (Collection<String>) linkedHashSet0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(javaType0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser("JSON");
        Boolean boolean0 = Boolean.TRUE;
        StringCollectionDeserializer stringCollectionDeserializer0 = new StringCollectionDeserializer(javaType0, valueInstantiator_Base0, (JsonDeserializer<?>) null, (JsonDeserializer<?>) null, (NullValueProvider) null, boolean0);
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        // Undeclared exception!
        try {
            stringCollectionDeserializer0.deserialize(jsonParser0, (DeserializationContext) defaultDeserializationContext_Impl0, (Collection<String>) linkedHashSet0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }
}
