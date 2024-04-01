/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 04:35:46 GMT 2023
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import java.math.RoundingMode;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BeanDeserializerFactory_ESTest extends BeanDeserializerFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withConfig(deserializerFactoryConfig0);
        assertSame(deserializerFactory0, beanDeserializerFactory0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        Class<PropertyBasedObjectIdGenerator> class0 = PropertyBasedObjectIdGenerator.class;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.instance.createBuilderBasedDeserializer(defaultDeserializationContext_Impl0, (JavaType) null, basicBeanDescription0, class0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        BeanDeserializerBuilder beanDeserializerBuilder0 = new BeanDeserializerBuilder((BeanDescription) null, defaultDeserializationContext_Impl0);
        // Undeclared exception!
        try {
            beanDeserializerFactory0.addReferenceProperties(defaultDeserializationContext_Impl0, (BeanDescription) null, beanDeserializerBuilder0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withConfig(deserializerFactoryConfig0);
        assertNotSame(deserializerFactory0, beanDeserializerFactory0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Boolean boolean0 = Boolean.TRUE;
        ObjectMapper objectMapper1 = objectMapper0.setDefaultMergeable(boolean0);
        Class<AnnotatedField> class0 = AnnotatedField.class;
        ObjectReader objectReader0 = objectMapper1.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature mapperFeature0 = MapperFeature.USE_GETTERS_AS_SETTERS;
        objectMapper0.configure(mapperFeature0, false);
        Class<Throwable> class0 = Throwable.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[7];
        MapperFeature mapperFeature0 = MapperFeature.REQUIRE_SETTERS_FOR_GETTERS;
        mapperFeatureArray0[0] = mapperFeature0;
        MapperFeature mapperFeature1 = MapperFeature.AUTO_DETECT_GETTERS;
        mapperFeatureArray0[1] = mapperFeature1;
        mapperFeatureArray0[2] = mapperFeature1;
        mapperFeatureArray0[3] = mapperFeatureArray0[2];
        mapperFeatureArray0[4] = mapperFeature0;
        mapperFeatureArray0[5] = mapperFeature1;
        mapperFeatureArray0[6] = mapperFeature0;
        objectMapper0.disable(mapperFeatureArray0);
        Class<CreatorProperty> class0 = CreatorProperty.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<BeanDeserializer> class0 = BeanDeserializer.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((Map) null).when(pOJOPropertiesCollector0).getInjectables();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        beanDeserializerFactory0.addInjectables(defaultDeserializationContext_Impl0, basicBeanDescription0, (BeanDeserializerBuilder) null);
        assertEquals(0, defaultDeserializationContext_Impl0.getDeserializationFeatures());
    }

    @Test(timeout = 4000)
    public void test99() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<RoundingMode> class0 = RoundingMode.class;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.isPotentialBeanType(class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Cannot deserialize Class java.math.RoundingMode (of type enum) as a Bean
            //
            verifyException("com.fasterxml.jackson.databind.deser.BeanDeserializerFactory", e);
        }
    }
}
