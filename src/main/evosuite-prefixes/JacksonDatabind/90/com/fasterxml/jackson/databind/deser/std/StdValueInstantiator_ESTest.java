/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 04:15:33 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLTimeoutException;
import java.sql.SQLTransientException;
import java.sql.SQLWarning;
import java.time.chrono.ChronoLocalDate;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class StdValueInstantiator_ESTest extends StdValueInstantiator_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<JsonMappingException> class0 = JsonMappingException.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.getDelegateType((DeserializationConfig) null);
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(jsonFactory0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.createUsingArrayDelegate((DeserializationContext) null, (Object) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.getDelegateCreator();
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Class<JsonMappingException> class0 = JsonMappingException.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.getArrayDelegateCreator();
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Class<Integer> class0 = Integer.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.createFromInt((DeserializationContext) null, 0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<TextNode> class0 = TextNode.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        StdValueInstantiator stdValueInstantiator1 = new StdValueInstantiator(stdValueInstantiator0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Map> class1 = Map.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class1);
        stdValueInstantiator1._arrayDelegateType = (JavaType) mapType0;
        boolean boolean0 = stdValueInstantiator1.canCreateUsingArrayDelegate();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<ExceptionInInitializerError> class0 = ExceptionInInitializerError.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, simpleType0);
        stdValueInstantiator0.getArrayDelegateType((DeserializationConfig) null);
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Class<String> class0 = String.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.getDefaultCreator();
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<ClassNameIdResolver> class0 = ClassNameIdResolver.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.getWithArgsCreator();
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, (Class<?>) null);
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, (JavaType) null);
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        PlaceholderForType placeholderForType0 = new PlaceholderForType(0);
        stdValueInstantiator0._delegateType = (JavaType) placeholderForType0;
        boolean boolean0 = stdValueInstantiator0.canInstantiate();
        stdValueInstantiator0.canCreateUsingDelegate();
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        PlaceholderForType placeholderForType0 = new PlaceholderForType(0);
        stdValueInstantiator0._delegateType = (JavaType) placeholderForType0;
        boolean boolean0 = stdValueInstantiator0.canInstantiate();
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        Class<Integer> class0 = Integer.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.createUsingDefault((DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        Class<Integer> class0 = Integer.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.createFromObjectWith((DeserializationContext) null, (Object[]) null);
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        Class<TextNode> class0 = TextNode.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.createUsingDelegate((DeserializationContext) null, class0);
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        Class<Integer> class0 = Integer.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.createFromString((DeserializationContext) null, "(\"spIJQE,");
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        Class<MapType> class0 = MapType.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.createFromLong((DeserializationContext) null, 0L);
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.createFromDouble((DeserializationContext) null, (-20.614495));
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        Class<MapType> class0 = MapType.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        stdValueInstantiator0.createFromBoolean((DeserializationContext) null, false);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        Class<JsonMappingException> class0 = JsonMappingException.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException();
        JsonMappingException jsonMappingException0 = stdValueInstantiator0.wrapException(sQLTimeoutException0);
        JsonMappingException jsonMappingException1 = stdValueInstantiator0.wrapException(jsonMappingException0);
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        Class<JsonMappingException> class0 = JsonMappingException.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        SQLTimeoutException sQLTimeoutException0 = new SQLTimeoutException();
        JsonMappingException jsonMappingException0 = stdValueInstantiator0.wrapException(sQLTimeoutException0);
        JsonMappingException jsonMappingException1 = stdValueInstantiator0.wrapException(jsonMappingException0);
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        Class<Integer> class0 = Integer.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException();
        JsonMappingException jsonMappingException0 = stdValueInstantiator0.unwrapAndWrapException(defaultDeserializationContext_Impl0, sQLFeatureNotSupportedException0);
        JsonMappingException jsonMappingException1 = stdValueInstantiator0.unwrapAndWrapException(defaultDeserializationContext_Impl0, jsonMappingException0);
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        Class<Integer> class0 = Integer.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        SQLFeatureNotSupportedException sQLFeatureNotSupportedException0 = new SQLFeatureNotSupportedException();
        JsonMappingException jsonMappingException0 = stdValueInstantiator0.unwrapAndWrapException(defaultDeserializationContext_Impl0, sQLFeatureNotSupportedException0);
        JsonMappingException jsonMappingException1 = stdValueInstantiator0.unwrapAndWrapException(defaultDeserializationContext_Impl0, jsonMappingException0);
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        Class<ExceptionInInitializerError> class0 = ExceptionInInitializerError.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        ExceptionInInitializerError exceptionInInitializerError0 = new ExceptionInInitializerError();
        stdValueInstantiator0.rewrapCtorProblem((DeserializationContext) null, exceptionInInitializerError0);
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        Class<JsonMappingException> class0 = JsonMappingException.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        JsonMappingException jsonMappingException0 = JsonMappingException.from((JsonGenerator) null, "B9h");
        stdValueInstantiator0.wrapAsJsonMappingException((DeserializationContext) null, jsonMappingException0);
        stdValueInstantiator0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        Class<ClassNameIdResolver> class0 = ClassNameIdResolver.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        SQLTransientException sQLTransientException0 = new SQLTransientException();
        stdValueInstantiator0.rewrapCtorProblem((DeserializationContext) null, sQLTransientException0);
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        Class<InvocationTargetException> class0 = InvocationTargetException.class;
        StdValueInstantiator stdValueInstantiator0 = new StdValueInstantiator((DeserializationConfig) null, class0);
        SQLWarning sQLWarning0 = new SQLWarning();
        InvocationTargetException invocationTargetException0 = new InvocationTargetException(sQLWarning0, "h`{yoTw[~ZSNyQlGw_");
        stdValueInstantiator0.rewrapCtorProblem((DeserializationContext) null, invocationTargetException0);
    }
}
