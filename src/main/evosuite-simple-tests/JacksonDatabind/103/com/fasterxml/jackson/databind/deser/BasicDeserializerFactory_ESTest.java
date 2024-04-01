/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 04:33:00 GMT 2023
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.filter.FilteringParserDelegate;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleValueInstantiators;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.ValueNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.BatchUpdateException;
import java.sql.SQLClientInfoException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLSyntaxErrorException;
import java.sql.SQLTransientConnectionException;
import java.util.EnumSet;
import java.util.PriorityQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class BasicDeserializerFactory_ESTest extends BasicDeserializerFactory_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.withAdditionalDeserializers((Deserializers) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Cannot pass null Deserializers
            //
            verifyException("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", e);
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.withDeserializerModifier((BeanDeserializerModifier) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Cannot pass null modifier
            //
            verifyException("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<EnumSet> class0 = EnumSet.class;
        CollectionType collectionType0 = typeFactory0.constructRawCollectionType(class0);
        // Undeclared exception!
        try {
            beanDeserializerFactory0.resolveType(defaultDeserializationContext_Impl0, (BeanDescription) null, collectionType0, (AnnotatedMember) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        ObjectMapper objectMapper0 = new ObjectMapper();
        try {
            objectMapper0.valueToTree((Object) beanDeserializerFactory0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // No serializer found for class com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: com.fasterxml.jackson.databind.deser.BeanDeserializerFactory[\"factoryConfig\"])
            //
            verifyException("com.fasterxml.jackson.databind.ObjectMapper", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        JavaType javaType0 = TypeFactory.unknownType();
        // Undeclared exception!
        try {
            beanDeserializerFactory0._findJsonValueFor((DeserializationConfig) null, javaType0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        SimpleValueInstantiators simpleValueInstantiators0 = new SimpleValueInstantiators();
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withValueInstantiators(simpleValueInstantiators0);
        assertNotSame(beanDeserializerFactory0, deserializerFactory0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        // Undeclared exception!
        try {
            beanDeserializerFactory0._reportUnwrappedCreatorProperty(defaultDeserializationContext_Impl0, basicBeanDescription0, (AnnotatedParameter) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.withAdditionalKeyDeserializers((KeyDeserializers) null);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Cannot pass null KeyDeserializers
            //
            verifyException("com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withAbstractTypeResolver(simpleAbstractTypeResolver0);
        assertNotSame(beanDeserializerFactory0, deserializerFactory0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        DeserializerFactoryConfig deserializerFactoryConfig1 = deserializerFactoryConfig0.withAbstractTypeResolver(simpleAbstractTypeResolver0);
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig1);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        Class<FilteringParserDelegate> class0 = FilteringParserDelegate.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null, defaultSerializerProvider_Impl0, (DefaultDeserializationContext) null);
        Class<JsonLocation> class0 = JsonLocation.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        SimpleValueInstantiators simpleValueInstantiators0 = new SimpleValueInstantiators();
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        DeserializerFactoryConfig deserializerFactoryConfig1 = deserializerFactoryConfig0.withValueInstantiators(simpleValueInstantiators0);
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig1);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        Class<FilteringParserDelegate> class0 = FilteringParserDelegate.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<JsonLocation> class0 = JsonLocation.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        ValueInstantiator valueInstantiator0 = beanDeserializerFactory0._valueInstantiatorInstance((DeserializationConfig) null, (Annotated) null, valueInstantiator_Base0);
        assertFalse(valueInstantiator0.canCreateFromBoolean());
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        ValueInstantiator valueInstantiator0 = beanDeserializerFactory0._valueInstantiatorInstance((DeserializationConfig) null, (Annotated) null, (Object) null);
        assertNull(valueInstantiator0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        // Undeclared exception!
        try {
            beanDeserializerFactory0._valueInstantiatorInstance((DeserializationConfig) null, (Annotated) null, beanDeserializerFactory0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // AnnotationIntrospector returned key deserializer definition of type com.fasterxml.jackson.databind.deser.BeanDeserializerFactory; expected type KeyDeserializer or Class<KeyDeserializer> instead
            //
            verifyException("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<SQLInvalidAuthorizationSpecException> class0 = SQLInvalidAuthorizationSpecException.class;
        // Undeclared exception!
        try {
            beanDeserializerFactory0._valueInstantiatorInstance((DeserializationConfig) null, (Annotated) null, class0);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // AnnotationIntrospector returned Class java.sql.SQLInvalidAuthorizationSpecException; expected Class<ValueInstantiator>
            //
            verifyException("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[4];
        MapperFeature mapperFeature0 = MapperFeature.USE_BASE_TYPE_AS_DEFAULT_IMPL;
        mapperFeatureArray0[0] = mapperFeature0;
        MapperFeature mapperFeature1 = MapperFeature.AUTO_DETECT_CREATORS;
        mapperFeatureArray0[1] = mapperFeature1;
        mapperFeatureArray0[2] = mapperFeatureArray0[0];
        mapperFeatureArray0[3] = mapperFeatureArray0[1];
        ObjectMapper objectMapper1 = objectMapper0.disable(mapperFeatureArray0);
        Class<POJOPropertyBuilder> class0 = POJOPropertyBuilder.class;
        ObjectReader objectReader0 = objectMapper1.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<SQLClientInfoException> class0 = SQLClientInfoException.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<BatchUpdateException> class0 = BatchUpdateException.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectMapper.DefaultTyping objectMapper_DefaultTyping0 = ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE;
        objectMapper0.enableDefaultTyping(objectMapper_DefaultTyping0);
        Class<BuilderBasedDeserializer> class0 = BuilderBasedDeserializer.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.reader();
        TypeFactory typeFactory0 = objectReader0.getTypeFactory();
        Class<PriorityQueue> class0 = PriorityQueue.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
        ObjectReader objectReader1 = objectReader0.forType((JavaType) collectionType0);
        assertNotSame(objectReader1, objectReader0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null);
        Class<BasicBeanDescription> class0 = BasicBeanDescription.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        JavaType javaType0 = beanProperty_Bogus0.getType();
        CollectionType collectionType0 = beanDeserializerFactory0._mapAbstractCollectionType(javaType0, (DeserializationConfig) null);
        assertNull(collectionType0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<AnnotatedMethod> class0 = AnnotatedMethod.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        PlaceholderForType placeholderForType0 = new PlaceholderForType((-526));
        JavaType[] javaTypeArray0 = new JavaType[1];
        javaTypeArray0[0] = (JavaType) placeholderForType0;
        CollectionLikeType collectionLikeType0 = CollectionLikeType.construct((Class<?>) class0, (TypeBindings) null, (JavaType) placeholderForType0, javaTypeArray0, javaTypeArray0[0]);
        ObjectReader objectReader1 = objectReader0.forType((JavaType) collectionLikeType0);
        assertNotSame(objectReader1, objectReader0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Class<SQLTransientConnectionException> class0 = SQLTransientConnectionException.class;
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        ResolvedRecursiveType resolvedRecursiveType0 = new ResolvedRecursiveType(class0, typeBindings0);
        Class<SQLSyntaxErrorException> class1 = SQLSyntaxErrorException.class;
        JavaType[] javaTypeArray0 = new JavaType[9];
        javaTypeArray0[2] = (JavaType) resolvedRecursiveType0;
        javaTypeArray0[3] = (JavaType) resolvedRecursiveType0;
        MapType mapType0 = MapType.construct((Class<?>) class1, typeBindings0, (JavaType) resolvedRecursiveType0, javaTypeArray0, javaTypeArray0[3], javaTypeArray0[2]);
        // Undeclared exception!
        try {
            beanDeserializerFactory0.createMapLikeDeserializer(defaultDeserializationContext_Impl0, mapType0, (BeanDescription) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<DoubleNode> class0 = DoubleNode.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<AnnotatedMethod> class0 = AnnotatedMethod.class;
        ObjectReader objectReader0 = objectMapper0.reader();
        TypeFactory typeFactory0 = objectReader0.getTypeFactory();
        JsonNodeFactory jsonNodeFactory0 = JsonNodeFactory.instance;
        ObjectNode objectNode0 = new ObjectNode(jsonNodeFactory0);
        ArrayNode arrayNode0 = objectNode0.withArray("java.com.fasterxml.jackson.databind.jsontype.TypeIdResolver");
        ValueNode valueNode0 = arrayNode0.numberNode((Integer) null);
        JsonParser jsonParser0 = objectReader0.treeAsTokens(valueNode0);
        JavaType[] javaTypeArray0 = new JavaType[1];
        ArrayType arrayType0 = typeFactory0.constructArrayType(class0);
        javaTypeArray0[0] = (JavaType) arrayType0;
        ReferenceType referenceType0 = ReferenceType.upgradeFrom(arrayType0, javaTypeArray0[0]);
        try {
            objectReader0.readValues(jsonParser0, (JavaType) referenceType0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // Cannot find a Value deserializer for abstract type [reference type, class [Lcom.fasterxml.jackson.databind.introspect.AnnotatedMethod;<[Lcom.fasterxml.jackson.databind.introspect.AnnotatedMethod;><[array type, component type: [simple type, class com.fasterxml.jackson.databind.introspect.AnnotatedMethod]]>]
            //  at [Source: UNKNOWN; line: -1, column: -1]
            //
            verifyException("com.fasterxml.jackson.databind.exc.InvalidDefinitionException", e);
        }
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<TokenBuffer> class0 = TokenBuffer.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        SimpleDeserializers simpleDeserializers0 = new SimpleDeserializers();
        DeserializerFactoryConfig deserializerFactoryConfig1 = deserializerFactoryConfig0.withAdditionalDeserializers(simpleDeserializers0);
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig1);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        Class<FilteringParserDelegate> class0 = FilteringParserDelegate.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        SimpleDeserializers simpleDeserializers0 = new SimpleDeserializers();
        DeserializerFactoryConfig deserializerFactoryConfig1 = deserializerFactoryConfig0.withAdditionalDeserializers(simpleDeserializers0);
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig1);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        JsonFactory jsonFactory0 = new JsonFactory();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0, defaultSerializerProvider_Impl0, defaultDeserializationContext_Impl0);
        Class<SQLIntegrityConstraintViolationException> class0 = SQLIntegrityConstraintViolationException.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotationMap annotationMap0 = new AnnotationMap();
        AnnotatedField annotatedField0 = new AnnotatedField((TypeResolutionContext) null, (Field) null, annotationMap0);
        Class<POJONode> class0 = POJONode.class;
        // Undeclared exception!
        try {
            beanDeserializerFactory0.constructEnumResolver(class0, (DeserializationConfig) null, annotatedField0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.BasicDeserializerFactory", e);
        }
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotatedMethod annotatedMethod0 = beanDeserializerFactory0._findJsonValueFor((DeserializationConfig) null, (JavaType) null);
        assertNull(annotatedMethod0);
    }
}
