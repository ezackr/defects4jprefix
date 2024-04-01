/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 23:00:20 GMT 2023
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BeanDeserializerFactory_ESTest extends BeanDeserializerFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory((DeserializerFactoryConfig) null);
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withConfig((DeserializerFactoryConfig) null);
        assertSame(deserializerFactory0, beanDeserializerFactory0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<AnnotatedParameter> class0 = AnnotatedParameter.class;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.instance.createBuilderBasedDeserializer(defaultDeserializationContext_Impl0, (JavaType) null, (BeanDescription) null, class0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withConfig(deserializerFactoryConfig0);
        assertNotSame(deserializerFactory0, beanDeserializerFactory0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MockIOException mockIOException0 = new MockIOException();
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(mockIOException0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Integer> class0 = Integer.TYPE;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructRawCollectionLikeType(class0);
        JsonDeserializer<Object> jsonDeserializer0 = beanDeserializerFactory0.createBeanDeserializer(deserializationContext0, collectionLikeType0, (BeanDescription) null);
        assertTrue(jsonDeserializer0.isCachable());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig deserializerFactoryConfig1 = deserializerFactoryConfig0.withAbstractTypeResolver(simpleAbstractTypeResolver0);
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig1);
        ObjectMapper objectMapper0 = new ObjectMapper();
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Integer> class0 = Integer.TYPE;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructRawCollectionLikeType(class0);
        JavaType javaType0 = beanDeserializerFactory0.materializeAbstractType(deserializationContext0, collectionLikeType0, (BeanDescription) null);
        assertNull(javaType0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[4];
        MapperFeature mapperFeature0 = MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS;
        mapperFeatureArray0[0] = mapperFeature0;
        MapperFeature mapperFeature1 = MapperFeature.USE_GETTERS_AS_SETTERS;
        mapperFeatureArray0[1] = mapperFeature1;
        mapperFeatureArray0[2] = mapperFeatureArray0[1];
        mapperFeatureArray0[3] = mapperFeatureArray0[1];
        objectMapper0.disable(mapperFeatureArray0);
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(defaultSerializerProvider_Impl0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        MapperFeature mapperFeature0 = MapperFeature.AUTO_DETECT_GETTERS;
        objectMapper0.configure(mapperFeature0, false);
        Class<AnnotatedParameter> class0 = AnnotatedParameter.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        NioPathDeserializer nioPathDeserializer0 = new NioPathDeserializer();
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(nioPathDeserializer0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((Map) null).when(pOJOPropertiesCollector0).getInjectables();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        BeanDeserializerBuilder beanDeserializerBuilder0 = beanDeserializerFactory0.constructBeanDeserializerBuilder(defaultDeserializationContext_Impl0, basicBeanDescription0);
        beanDeserializerFactory0.addInjectables(defaultDeserializationContext_Impl0, basicBeanDescription0, beanDeserializerBuilder0);
        assertEquals(0, defaultDeserializationContext_Impl0.getDeserializationFeatures());
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
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        AnnotatedField annotatedField0 = new AnnotatedField((TypeResolutionContext) null, (Field) null, annotationMap0);
        // Undeclared exception!
        try {
            beanDeserializerFactory0.constructAnySetter(defaultDeserializationContext_Impl0, basicBeanDescription0, annotatedField0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.introspect.AnnotatedField", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        PropertyName propertyName0 = new PropertyName("r~J_*S");
        POJOPropertyBuilder pOJOPropertyBuilder0 = new POJOPropertyBuilder((MapperConfig<?>) null, annotationIntrospector0, false, propertyName0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class0 = LinkedList.class;
        Class<String> class1 = String.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class1);
        // Undeclared exception!
        try {
            beanDeserializerFactory0.constructSettableProperty(defaultDeserializationContext_Impl0, basicBeanDescription0, pOJOPropertyBuilder0, collectionType0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<JsonTypeInfo.Id> class0 = JsonTypeInfo.Id.class;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.isPotentialBeanType(class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not deserialize Class com.fasterxml.jackson.annotation.JsonTypeInfo$Id (of type enum) as a Bean
            //
            verifyException("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", e);
        }
    }
}
