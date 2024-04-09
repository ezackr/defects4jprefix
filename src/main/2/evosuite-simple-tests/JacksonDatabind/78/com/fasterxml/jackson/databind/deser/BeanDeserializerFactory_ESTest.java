/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 22:07:07 GMT 2024
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.AbstractDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.type.SimpleType;
import java.lang.reflect.Field;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BeanDeserializerFactory_ESTest extends BeanDeserializerFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<Boolean> class0 = Boolean.class;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.createBuilderBasedDeserializer(defaultDeserializationContext_Impl0, (JavaType) null, (BeanDescription) null, class0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withConfig((DeserializerFactoryConfig) null);
        assertNotSame(deserializerFactory0, beanDeserializerFactory0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory((DeserializerFactoryConfig) null);
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withConfig((DeserializerFactoryConfig) null);
        assertSame(deserializerFactory0, beanDeserializerFactory0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Throwable> class0 = Throwable.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<AbstractDeserializer> class0 = AbstractDeserializer.class;
        PropertyAccessor propertyAccessor0 = PropertyAccessor.ALL;
        JsonAutoDetect.Visibility jsonAutoDetect_Visibility0 = JsonAutoDetect.Visibility.NON_PRIVATE;
        objectMapper0.setVisibility(propertyAccessor0, jsonAutoDetect_Visibility0);
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        DeserializerFactoryConfig deserializerFactoryConfig1 = deserializerFactoryConfig0.withAbstractTypeResolver(simpleAbstractTypeResolver0);
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig1);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JavaType javaType0 = beanDeserializerFactory0.materializeAbstractType(defaultDeserializationContext_Impl0, (JavaType) null, (BeanDescription) null);
        assertNull(javaType0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<AbstractDeserializer> class0 = AbstractDeserializer.class;
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[6];
        MapperFeature mapperFeature0 = MapperFeature.USE_GETTERS_AS_SETTERS;
        mapperFeatureArray0[0] = mapperFeature0;
        mapperFeatureArray0[1] = mapperFeature0;
        mapperFeatureArray0[2] = mapperFeature0;
        mapperFeatureArray0[3] = mapperFeatureArray0[0];
        mapperFeatureArray0[4] = mapperFeatureArray0[0];
        mapperFeatureArray0[5] = mapperFeatureArray0[2];
        objectMapper0.disable(mapperFeatureArray0);
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[3];
        MapperFeature mapperFeature0 = MapperFeature.INFER_PROPERTY_MUTATORS;
        mapperFeatureArray0[0] = mapperFeature0;
        MapperFeature mapperFeature1 = MapperFeature.AUTO_DETECT_GETTERS;
        mapperFeatureArray0[1] = mapperFeature1;
        mapperFeatureArray0[2] = mapperFeature1;
        objectMapper0.disable(mapperFeatureArray0);
        Class<POJOPropertyBuilder> class0 = POJOPropertyBuilder.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<Integer> class0 = Integer.TYPE;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        BasicClassIntrospector basicClassIntrospector0 = new BasicClassIntrospector();
        BasicBeanDescription basicBeanDescription0 = basicClassIntrospector0.forDeserialization((DeserializationConfig) null, simpleType0, (ClassIntrospector.MixInResolver) null);
        BeanDeserializerBuilder beanDeserializerBuilder0 = new BeanDeserializerBuilder(basicBeanDescription0, (DeserializationConfig) null);
        beanDeserializerFactory0.addInjectables(defaultDeserializationContext_Impl0, basicBeanDescription0, beanDeserializerBuilder0);
        assertEquals(0, defaultDeserializationContext_Impl0.getDeserializationFeatures());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        AnnotatedField annotatedField0 = new AnnotatedField((TypeResolutionContext) null, (Field) null, annotationMap0);
        // Undeclared exception!
        try {
            beanDeserializerFactory0.constructAnySetter(defaultDeserializationContext_Impl0, (BeanDescription) null, annotatedField0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.introspect.AnnotatedField", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.constructAnySetter((DeserializationContext) null, (BeanDescription) null, (AnnotatedMember) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<Boolean> class0 = Boolean.TYPE;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.isPotentialBeanType(class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not deserialize Class boolean (of type primitive) as a Bean
            //
            verifyException("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", e);
        }
    }
}
