/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 22:38:43 GMT 2024
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import java.net.Proxy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ValueInstantiator_ESTest extends ValueInstantiator_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        AnnotatedWithParams annotatedWithParams0 = valueInstantiator_Base0.getWithArgsCreator();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<Object> class0 = Object.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        valueInstantiator_Base0.createUsingDefault((DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        valueInstantiator_Base0.createFromInt((DeserializationContext) null, (-584));
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        boolean boolean0 = valueInstantiator_Base0.canInstantiate();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Class<Object> class0 = Object.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        valueInstantiator_Base0.createFromDouble((DeserializationContext) null, (-339.802184441995));
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Class<BuilderBasedDeserializer> class0 = BuilderBasedDeserializer.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        valueInstantiator_Base0.createUsingDelegate((DeserializationContext) null, class0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        AnnotatedWithParams annotatedWithParams0 = valueInstantiator_Base0.getDelegateCreator();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        JavaType javaType0 = valueInstantiator_Base0.getDelegateType((DeserializationConfig) null);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        valueInstantiator_Base0.createFromObjectWith((DeserializationContext) null, (SettableBeanProperty[]) null, (PropertyValueBuffer) null);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<Object> class0 = Object.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        JavaType javaType0 = valueInstantiator_Base0.getArrayDelegateType((DeserializationConfig) null);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        AnnotatedParameter annotatedParameter0 = valueInstantiator_Base0.getIncompleteParameter();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        AnnotatedWithParams annotatedWithParams0 = valueInstantiator_Base0.getArrayDelegateCreator();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Class<BuilderBasedDeserializer> class0 = BuilderBasedDeserializer.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        valueInstantiator_Base0.createFromString((DeserializationContext) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Class<Proxy.Type> class0 = Proxy.Type.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        Object[] objectArray0 = new Object[0];
        valueInstantiator_Base0.createFromObjectWith((DeserializationContext) null, objectArray0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Class<Proxy.Type> class0 = Proxy.Type.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        valueInstantiator_Base0.createUsingArrayDelegate((DeserializationContext) null, (Object) null);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Class<BigIntegerNode> class0 = BigIntegerNode.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        SettableBeanProperty[] settableBeanPropertyArray0 = valueInstantiator_Base0.getFromObjectArguments((DeserializationConfig) null);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        boolean boolean0 = valueInstantiator_Base0.canCreateUsingArrayDelegate();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        valueInstantiator_Base0.createFromBoolean((DeserializationContext) null, false);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        valueInstantiator_Base0.createFromLong((DeserializationContext) null, (-1492L));
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Class<SettableBeanProperty> class0 = SettableBeanProperty.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        String string0 = valueInstantiator_Base0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        ValueInstantiator.Base valueInstantiator_Base0 = null;
        valueInstantiator_Base0 = new ValueInstantiator.Base((JavaType) null);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        valueInstantiator_Base0._createFromStringFallbacks((DeserializationContext) null, " [truncated]");
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Class<String> class0 = String.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        valueInstantiator_Base0._createFromStringFallbacks(defaultDeserializationContext_Impl0, "");
    }
}
