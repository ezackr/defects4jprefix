/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 22:04:26 GMT 2024
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.ext.CoreXMLDeserializers;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.util.LinkedHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BeanDeserializerFactory_ESTest extends BeanDeserializerFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withConfig((DeserializerFactoryConfig) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<BeanDeserializer> class0 = BeanDeserializer.class;
        beanDeserializerFactory0.instance.createBuilderBasedDeserializer((DeserializationContext) null, (JavaType) null, (BeanDescription) null, class0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory((DeserializerFactoryConfig) null);
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withConfig((DeserializerFactoryConfig) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.reader();
        Class<Throwable> class0 = Throwable.class;
        ObjectReader objectReader1 = objectReader0.forType(class0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[6];
        MapperFeature mapperFeature0 = MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS;
        mapperFeatureArray0[0] = mapperFeature0;
        MapperFeature mapperFeature1 = MapperFeature.USE_GETTERS_AS_SETTERS;
        mapperFeatureArray0[1] = mapperFeature1;
        mapperFeatureArray0[2] = mapperFeature1;
        mapperFeatureArray0[3] = mapperFeature0;
        mapperFeatureArray0[4] = mapperFeatureArray0[1];
        mapperFeatureArray0[5] = mapperFeature1;
        objectMapper0.disable(mapperFeatureArray0);
        Class<CreatorProperty> class0 = CreatorProperty.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[8];
        MapperFeature mapperFeature0 = MapperFeature.DEFAULT_VIEW_INCLUSION;
        mapperFeatureArray0[0] = mapperFeature0;
        mapperFeatureArray0[1] = mapperFeatureArray0[0];
        mapperFeatureArray0[2] = mapperFeatureArray0[1];
        mapperFeatureArray0[3] = mapperFeature0;
        mapperFeatureArray0[4] = mapperFeatureArray0[0];
        mapperFeatureArray0[5] = mapperFeature0;
        mapperFeatureArray0[6] = mapperFeatureArray0[0];
        mapperFeatureArray0[7] = mapperFeatureArray0[1];
        objectMapper0.disable(mapperFeatureArray0);
        Class<CoreXMLDeserializers.Std> class0 = CoreXMLDeserializers.Std.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        LinkedHashMap<Object, AnnotatedMember> linkedHashMap0 = new LinkedHashMap<Object, AnnotatedMember>();
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn(linkedHashMap0).when(pOJOPropertiesCollector0).getInjectables();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
        RootNameLookup rootNameLookup0 = new RootNameLookup();
        DeserializationConfig deserializationConfig0 = new DeserializationConfig((BaseSettings) null, stdSubtypeResolver0, (SimpleMixInResolver) null, rootNameLookup0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.reader();
        NullNode nullNode0 = NullNode.getInstance();
        JsonParser jsonParser0 = objectReader0.treeAsTokens(nullNode0);
        InjectableValues.Std injectableValues_Std0 = new InjectableValues.Std();
        DefaultDeserializationContext defaultDeserializationContext0 = defaultDeserializationContext_Impl0.createInstance(deserializationConfig0, jsonParser0, injectableValues_Std0);
        beanDeserializerFactory0.addInjectables(defaultDeserializationContext0, basicBeanDescription0, (BeanDeserializerBuilder) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        LinkedHashMap<Object, AnnotatedMember> linkedHashMap0 = new LinkedHashMap<Object, AnnotatedMember>();
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn(linkedHashMap0).when(pOJOPropertiesCollector0).getInjectables();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
        RootNameLookup rootNameLookup0 = new RootNameLookup();
        DeserializationConfig deserializationConfig0 = new DeserializationConfig((BaseSettings) null, stdSubtypeResolver0, (SimpleMixInResolver) null, rootNameLookup0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        linkedHashMap0.put(rootNameLookup0, (AnnotatedMember) null);
        ObjectReader objectReader0 = objectMapper0.reader();
        NullNode nullNode0 = NullNode.getInstance();
        JsonParser jsonParser0 = objectReader0.treeAsTokens(nullNode0);
        InjectableValues.Std injectableValues_Std0 = new InjectableValues.Std();
        DefaultDeserializationContext defaultDeserializationContext0 = defaultDeserializationContext_Impl0.createInstance(deserializationConfig0, jsonParser0, injectableValues_Std0);
        beanDeserializerFactory0.addInjectables(defaultDeserializationContext0, basicBeanDescription0, (BeanDeserializerBuilder) null);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
        RootNameLookup rootNameLookup0 = new RootNameLookup();
        DeserializationConfig deserializationConfig0 = new DeserializationConfig((BaseSettings) null, stdSubtypeResolver0, (SimpleMixInResolver) null, rootNameLookup0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.reader();
        NullNode nullNode0 = NullNode.getInstance();
        JsonParser jsonParser0 = objectReader0.treeAsTokens(nullNode0);
        InjectableValues.Std injectableValues_Std0 = new InjectableValues.Std();
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl1 = new DefaultDeserializationContext.Impl(defaultDeserializationContext_Impl0, deserializationConfig0, jsonParser0, injectableValues_Std0);
        beanDeserializerFactory0.constructAnySetter(defaultDeserializationContext_Impl1, basicBeanDescription0, (AnnotatedMethod) null);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        objectMapper0.enableDefaultTyping();
        Class<CreatorProperty> class0 = CreatorProperty.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[8];
        MapperFeature mapperFeature0 = MapperFeature.DEFAULT_VIEW_INCLUSION;
        mapperFeatureArray0[0] = mapperFeature0;
        mapperFeatureArray0[1] = mapperFeatureArray0[0];
        mapperFeatureArray0[2] = mapperFeatureArray0[1];
        mapperFeatureArray0[3] = mapperFeature0;
        mapperFeatureArray0[4] = mapperFeatureArray0[3];
        mapperFeatureArray0[5] = mapperFeatureArray0[0];
        MapperFeature mapperFeature1 = MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS;
        mapperFeatureArray0[6] = mapperFeature1;
        mapperFeatureArray0[7] = mapperFeatureArray0[6];
        objectMapper0.disable(mapperFeatureArray0);
        Class<CoreXMLDeserializers.Std> class0 = CoreXMLDeserializers.Std.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<Integer> class0 = Integer.TYPE;
        beanDeserializerFactory0.isPotentialBeanType(class0);
    }
}
