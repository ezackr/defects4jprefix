/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 17:38:17 GMT 2023
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BasicDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.module.SimpleAbstractTypeResolver;
import com.fasterxml.jackson.databind.module.SimpleDeserializers;
import com.fasterxml.jackson.databind.module.SimpleValueInstantiators;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.sql.BatchUpdateException;
import java.sql.SQLClientInfoException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLNonTransientException;
import java.sql.SQLSyntaxErrorException;
import java.util.EnumSet;
import java.util.Vector;
import org.junit.runner.RunWith;

public class BasicDeserializerFactoryTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        SimpleDeserializers simpleDeserializers0 = new SimpleDeserializers();
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withAdditionalDeserializers(simpleDeserializers0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        beanDeserializerFactory0.withDeserializerModifier((BeanDeserializerModifier) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<ObjectIdResolver> class0 = ObjectIdResolver.class;
        objectMapper0.convertValue((Object) beanDeserializerFactory0, class0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        SimpleValueInstantiators simpleValueInstantiators0 = new SimpleValueInstantiators();
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withValueInstantiators(simpleValueInstantiators0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        StdKeyDeserializers stdKeyDeserializers0 = new StdKeyDeserializers();
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withAdditionalKeyDeserializers(stdKeyDeserializers0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        SimpleAbstractTypeResolver simpleAbstractTypeResolver0 = new SimpleAbstractTypeResolver();
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withAbstractTypeResolver(simpleAbstractTypeResolver0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<JsonLocation> class0 = JsonLocation.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<ObjectIdResolver> class0 = ObjectIdResolver.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<TokenBuffer> class0 = TokenBuffer.class;
        beanDeserializerFactory0._valueInstantiatorInstance((DeserializationConfig) null, (Annotated) null, class0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        ValueInstantiator valueInstantiator0 = beanDeserializerFactory0._valueInstantiatorInstance((DeserializationConfig) null, (Annotated) null, (Object) null);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        PropertyName propertyName0 = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        beanDeserializerFactory0._valueInstantiatorInstance((DeserializationConfig) null, (Annotated) null, propertyName0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        PropertyName propertyName0 = BeanDeserializerBase.TEMP_PROPERTY_NAME;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        POJOPropertyBuilder pOJOPropertyBuilder0 = new POJOPropertyBuilder(propertyName0, annotationIntrospector0, true);
        pOJOPropertyBuilder0.addSetter((AnnotatedMethod) null, propertyName0, true, true, true);
        boolean boolean0 = beanDeserializerFactory0._checkIfCreatorPropertyBased(annotationIntrospector0, (AnnotatedWithParams) null, pOJOPropertyBuilder0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        POJOPropertyBuilder pOJOPropertyBuilder0 = new POJOPropertyBuilder((PropertyName) null, annotationIntrospector0, true);
        Class<SQLSyntaxErrorException> class0 = SQLSyntaxErrorException.class;
        AnnotatedClass annotatedClass0 = AnnotatedClass.constructWithoutSuperTypes(class0, annotationIntrospector0, (ClassIntrospector.MixInResolver) null);
        AnnotatedConstructor annotatedConstructor0 = annotatedClass0.getDefaultConstructor();
        boolean boolean0 = beanDeserializerFactory0._checkIfCreatorPropertyBased(annotationIntrospector0, annotatedConstructor0, pOJOPropertyBuilder0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        PropertyName propertyName0 = BasicDeserializerFactory.UNWRAPPED_CREATOR_PARAM_NAME;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        POJOPropertyBuilder pOJOPropertyBuilder0 = new POJOPropertyBuilder(propertyName0, annotationIntrospector0, false);
        Class<SQLSyntaxErrorException> class0 = SQLSyntaxErrorException.class;
        SimpleMixInResolver simpleMixInResolver0 = new SimpleMixInResolver((ClassIntrospector.MixInResolver) null);
        AnnotatedClass annotatedClass0 = AnnotatedClass.constructWithoutSuperTypes(class0, annotationIntrospector0, simpleMixInResolver0);
        AnnotatedConstructor annotatedConstructor0 = annotatedClass0.getDefaultConstructor();
        boolean boolean0 = beanDeserializerFactory0._checkIfCreatorPropertyBased(annotationIntrospector0, annotatedConstructor0, pOJOPropertyBuilder0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        POJOPropertyBuilder pOJOPropertyBuilder0 = new POJOPropertyBuilder(propertyName0, annotationIntrospector0, false);
        Class<SQLSyntaxErrorException> class0 = SQLSyntaxErrorException.class;
        SimpleMixInResolver simpleMixInResolver0 = new SimpleMixInResolver((ClassIntrospector.MixInResolver) null);
        AnnotatedClass annotatedClass0 = AnnotatedClass.constructWithoutSuperTypes(class0, annotationIntrospector0, simpleMixInResolver0);
        AnnotatedConstructor annotatedConstructor0 = annotatedClass0.getDefaultConstructor();
        boolean boolean0 = beanDeserializerFactory0._checkIfCreatorPropertyBased(annotationIntrospector0, annotatedConstructor0, pOJOPropertyBuilder0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        PropertyName propertyName0 = BasicDeserializerFactory.UNWRAPPED_CREATOR_PARAM_NAME;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        POJOPropertyBuilder pOJOPropertyBuilder0 = new POJOPropertyBuilder(propertyName0, annotationIntrospector0, false);
        Class<SQLSyntaxErrorException> class0 = SQLSyntaxErrorException.class;
        SimpleMixInResolver simpleMixInResolver0 = new SimpleMixInResolver((ClassIntrospector.MixInResolver) null);
        AnnotatedClass annotatedClass0 = AnnotatedClass.constructWithoutSuperTypes(class0, annotationIntrospector0, simpleMixInResolver0);
        pOJOPropertyBuilder0.addField((AnnotatedField) null, propertyName0, false, true, true);
        AnnotatedConstructor annotatedConstructor0 = annotatedClass0.getDefaultConstructor();
        boolean boolean0 = beanDeserializerFactory0._checkIfCreatorPropertyBased(annotationIntrospector0, annotatedConstructor0, pOJOPropertyBuilder0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<SQLClientInfoException> class0 = SQLClientInfoException.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        PropertyName propertyName0 = beanDeserializerFactory0._findParamName((AnnotatedParameter) null, annotationIntrospector0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotationMap annotationMap0 = new AnnotationMap();
        Class<Byte> class0 = Byte.TYPE;
        AnnotatedParameter annotatedParameter0 = new AnnotatedParameter((AnnotatedWithParams) null, class0, annotationMap0, (-1251));
        PropertyName propertyName0 = beanDeserializerFactory0._findParamName(annotatedParameter0, (AnnotationIntrospector) null);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        PropertyName propertyName0 = beanDeserializerFactory0._findImplicitParamName((AnnotatedParameter) null, annotationIntrospector0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        PropertyName propertyName0 = beanDeserializerFactory0._findExplicitParamName((AnnotatedParameter) null, annotationIntrospector0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<Byte> class0 = Byte.TYPE;
        AnnotationMap annotationMap0 = new AnnotationMap();
        AnnotatedParameter annotatedParameter0 = new AnnotatedParameter((AnnotatedWithParams) null, class0, annotationMap0, 1);
        PropertyName propertyName0 = beanDeserializerFactory0._findExplicitParamName(annotatedParameter0, (AnnotationIntrospector) null);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        AnnotationMap annotationMap0 = new AnnotationMap();
        Class<Byte> class0 = Byte.TYPE;
        AnnotatedParameter annotatedParameter0 = new AnnotatedParameter((AnnotatedWithParams) null, class0, annotationMap0, (-20));
        PropertyName propertyName0 = beanDeserializerFactory0._findExplicitParamName(annotatedParameter0, annotationIntrospector0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        boolean boolean0 = beanDeserializerFactory0._hasExplicitParamName((AnnotatedParameter) null, annotationIntrospector0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotationMap annotationMap0 = new AnnotationMap();
        Class<Byte> class0 = Byte.TYPE;
        AnnotatedParameter annotatedParameter0 = new AnnotatedParameter((AnnotatedWithParams) null, class0, annotationMap0, (-1251));
        boolean boolean0 = beanDeserializerFactory0._hasExplicitParamName(annotatedParameter0, (AnnotationIntrospector) null);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        AnnotationMap annotationMap0 = new AnnotationMap();
        Class<Byte> class0 = Byte.TYPE;
        AnnotatedParameter annotatedParameter0 = new AnnotatedParameter((AnnotatedWithParams) null, class0, annotationMap0, 677);
        boolean boolean0 = beanDeserializerFactory0._hasExplicitParamName(annotatedParameter0, annotationIntrospector0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<BatchUpdateException> class0 = BatchUpdateException.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        objectMapper0.enableDefaultTyping();
        Class<BuilderBasedDeserializer> class0 = BuilderBasedDeserializer.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<EnumSet> class0 = EnumSet.class;
        Class<SQLIntegrityConstraintViolationException> class1 = SQLIntegrityConstraintViolationException.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class1);
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) collectionType0);
    }

    @Test(timeout = 4000)
    public void test2929() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Vector> class0 = Vector.class;
        CollectionType collectionType0 = typeFactory0.constructCollectionType(class0, class0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) collectionType0);
    }

    @Test(timeout = 4000)
    public void test3030() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<BasicBeanDescription> class0 = BasicBeanDescription.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test3131() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<SQLClientInfoException> class0 = SQLClientInfoException.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        CollectionType collectionType0 = beanDeserializerFactory0._mapAbstractCollectionType(simpleType0, (DeserializationConfig) null);
    }

    @Test(timeout = 4000)
    public void test3232() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<TokenBuffer> class0 = TokenBuffer.class;
        CollectionLikeType collectionLikeType0 = typeFactory0.constructRawCollectionLikeType(class0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) collectionLikeType0);
    }

    @Test(timeout = 4000)
    public void test3333() throws Throwable {
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<SQLNonTransientException> class0 = SQLNonTransientException.class;
        MapLikeType mapLikeType0 = typeFactory0.constructRawMapLikeType(class0);
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) mapLikeType0);
    }

    @Test(timeout = 4000)
    public void test3434() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<BigIntegerNode> class0 = BigIntegerNode.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test3535() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<Double> class0 = Double.class;
        Class<NullNode> class1 = NullNode.class;
        SimpleType simpleType0 = (SimpleType) TypeBindings.UNBOUND;
        CollectionType collectionType0 = CollectionType.construct(class1, simpleType0);
        ReferenceType referenceType0 = ReferenceType.construct((Class<?>) class0, (JavaType) collectionType0, (Object) defaultDeserializationContext_Impl0, (Object) class0);
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) referenceType0);
    }

    @Test(timeout = 4000)
    public void test3636() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<TokenBuffer> class0 = TokenBuffer.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
    }

    @Test(timeout = 4000)
    public void test3737() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<SQLInvalidAuthorizationSpecException> class0 = SQLInvalidAuthorizationSpecException.class;
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        JavaType javaType0 = objectMapper0.constructType(class0);
        beanDeserializerFactory0.resolveType((DeserializationContext) null, (BeanDescription) null, javaType0, (AnnotatedMember) null);
    }

    @Test(timeout = 4000)
    public void test3838() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        Class<JsonLocation> class0 = JsonLocation.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        beanDeserializerFactory0._findJsonValueFor((DeserializationConfig) null, simpleType0);
    }

    @Test(timeout = 4000)
    public void test3939() throws Throwable {
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        AnnotatedMethod annotatedMethod0 = beanDeserializerFactory0._findJsonValueFor((DeserializationConfig) null, (JavaType) null);
    }
}
