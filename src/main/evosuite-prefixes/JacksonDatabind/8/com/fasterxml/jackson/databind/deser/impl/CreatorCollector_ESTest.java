/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 16:39:17 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class CreatorCollector_ESTest extends CreatorCollector_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, true);
        creatorCollector0.addLongCreator((AnnotatedWithParams) null, true);
        creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, true);
        creatorCollector0.addLongCreator((AnnotatedWithParams) null);
        creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, false);
        creatorCollector0.verifyNonDup((AnnotatedWithParams) null, 1039);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, true);
        creatorCollector0.addIntCreator((AnnotatedWithParams) null);
        creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Object> class0 = Object.class;
        ObjectReader objectReader0 = objectMapper0.reader((Class<?>) class0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, false);
        creatorCollector0.addDelegatingCreator((AnnotatedWithParams) null, (CreatorProperty[]) null);
        creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, true);
        creatorCollector0.addBooleanCreator((AnnotatedWithParams) null);
        creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, false);
        creatorCollector0.addStringCreator((AnnotatedWithParams) null);
        creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, true);
        creatorCollector0.addDoubleCreator((AnnotatedWithParams) null);
        creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, true);
        creatorCollector0.addDoubleCreator((AnnotatedWithParams) null, true);
        creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature mapperFeature0 = MapperFeature.AUTO_DETECT_CREATORS;
        objectMapper0.configure(mapperFeature0, false);
        Class<Object> class0 = Object.class;
        ObjectReader objectReader0 = objectMapper0.reader((Class<?>) class0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        CreatorCollector.Vanilla creatorCollector_Vanilla0 = new CreatorCollector.Vanilla(9);
        boolean boolean0 = creatorCollector_Vanilla0.canInstantiate();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Annotation> class0 = Annotation.class;
        ObjectReader objectReader0 = objectMapper0.reader((Class<?>) class0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, false);
        CreatorProperty[] creatorPropertyArray0 = new CreatorProperty[0];
        creatorCollector0.addPropertyCreator((AnnotatedWithParams) null, creatorPropertyArray0);
        creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        PropertyName propertyName0 = new PropertyName("", "");
        AnnotationMap annotationMap0 = new AnnotationMap();
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, true);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        LinkedHashMap<Integer, Annotation> linkedHashMap0 = new LinkedHashMap<Integer, Annotation>();
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, 2963, linkedHashMap0, propertyMetadata0);
        CreatorProperty[] creatorPropertyArray0 = new CreatorProperty[3];
        creatorPropertyArray0[0] = creatorProperty0;
        creatorPropertyArray0[1] = creatorProperty0;
        creatorPropertyArray0[2] = creatorProperty0;
        creatorCollector0.addPropertyCreator((AnnotatedWithParams) null, creatorPropertyArray0);
        creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        PropertyName propertyName0 = new PropertyName("*#@UUfz<Zl", "QU^-");
        AnnotationMap annotationMap0 = new AnnotationMap();
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, true);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        LinkedHashMap<Integer, Annotation> linkedHashMap0 = new LinkedHashMap<Integer, Annotation>();
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, 2963, linkedHashMap0, propertyMetadata0);
        CreatorProperty[] creatorPropertyArray0 = new CreatorProperty[3];
        creatorPropertyArray0[0] = creatorProperty0;
        creatorCollector0.addPropertyCreator((AnnotatedWithParams) null, creatorPropertyArray0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, false);
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, 126, (Object) null, propertyMetadata0);
        CreatorProperty[] creatorPropertyArray0 = new CreatorProperty[9];
        creatorPropertyArray0[0] = creatorProperty0;
        creatorPropertyArray0[1] = creatorProperty0;
        creatorCollector0.addPropertyCreator((AnnotatedWithParams) null, creatorPropertyArray0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedMethod) null).when(pOJOPropertiesCollector0).getAnySetterMethod();
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((Set) null).when(pOJOPropertiesCollector0).getIgnoredPropertyNames();
        doReturn((Map) null).when(pOJOPropertiesCollector0).getInjectables();
        doReturn((AnnotatedMethod) null).when(pOJOPropertiesCollector0).getJsonValueMethod();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((List) null).when(pOJOPropertiesCollector0).getProperties();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        CreatorCollector creatorCollector0 = new CreatorCollector(basicBeanDescription0, true);
        Class<Long> class0 = Long.TYPE;
        AnnotationMap annotationMap0 = new AnnotationMap();
        AnnotatedParameter annotatedParameter0 = new AnnotatedParameter((AnnotatedWithParams) null, class0, annotationMap0, (-4654));
        creatorCollector0.addIncompeteParameter(annotatedParameter0);
        creatorCollector0.addIncompeteParameter(annotatedParameter0);
        annotatedParameter0.getName();
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        CreatorCollector creatorCollector0 = new CreatorCollector((BeanDescription) null, false);
        Class<Module> class0 = Module.class;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        AnnotatedClass annotatedClass0 = AnnotatedClass.construct(class0, annotationIntrospector0, (ClassIntrospector.MixInResolver) null);
        AnnotatedConstructor annotatedConstructor0 = annotatedClass0.getDefaultConstructor();
        creatorCollector0.setDefaultCreator(annotatedConstructor0);
        boolean boolean0 = creatorCollector0.hasDefaultCreator();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        CreatorCollector.Vanilla creatorCollector_Vanilla0 = new CreatorCollector.Vanilla(1);
        ArrayList<AnnotatedConstructor> arrayList0 = new ArrayList<AnnotatedConstructor>();
        creatorCollector_Vanilla0.createUsingDelegate(defaultDeserializationContext_Impl0, arrayList0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        CreatorCollector.Vanilla creatorCollector_Vanilla0 = new CreatorCollector.Vanilla(3);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        creatorCollector_Vanilla0.createFromDouble(defaultDeserializationContext_Impl0, 3);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        CreatorCollector.Vanilla creatorCollector_Vanilla0 = new CreatorCollector.Vanilla(2);
        creatorCollector_Vanilla0.createFromDouble(defaultDeserializationContext_Impl0, 3);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        CreatorCollector.Vanilla creatorCollector_Vanilla0 = new CreatorCollector.Vanilla(0);
        String string0 = creatorCollector_Vanilla0.getValueTypeDesc();
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        CreatorCollector.Vanilla creatorCollector_Vanilla0 = new CreatorCollector.Vanilla(1);
        ArrayList arrayList0 = (ArrayList) creatorCollector_Vanilla0.createUsingDefault(deserializationContext0);
        arrayList0.size();
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        CreatorCollector.Vanilla creatorCollector_Vanilla0 = new CreatorCollector.Vanilla(2);
        ObjectMapper objectMapper0 = new ObjectMapper();
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        LinkedHashMap linkedHashMap0 = (LinkedHashMap) creatorCollector_Vanilla0.createUsingDefault(deserializationContext0);
        linkedHashMap0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        CreatorCollector.Vanilla creatorCollector_Vanilla0 = new CreatorCollector.Vanilla(3);
        ObjectMapper objectMapper0 = new ObjectMapper();
        DeserializationContext deserializationContext0 = objectMapper0.getDeserializationContext();
        HashMap hashMap0 = (HashMap) creatorCollector_Vanilla0.createUsingDefault(deserializationContext0);
        hashMap0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        CreatorCollector.Vanilla creatorCollector_Vanilla0 = new CreatorCollector.Vanilla((-1584));
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        creatorCollector_Vanilla0.createUsingDefault(defaultDeserializationContext_Impl0);
    }
}
