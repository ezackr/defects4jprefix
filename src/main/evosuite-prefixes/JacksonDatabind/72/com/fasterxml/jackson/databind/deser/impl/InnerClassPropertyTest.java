/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 22:44:12 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.time.chrono.ChronoLocalDate;
import org.junit.runner.RunWith;

public class InnerClassPropertyTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, (-9999), propertyMetadata0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        JsonFactory jsonFactory0 = new JsonFactory();
        StringReader stringReader0 = new StringReader("JSON");
        JsonParser jsonParser0 = jsonFactory0.createParser((Reader) stringReader0);
        innerClassProperty0.deserializeAndSet(jsonParser0, (DeserializationContext) null, (Object) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, (-5), annotationMap0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        JsonFactory jsonFactory0 = new JsonFactory();
        StringReader stringReader0 = new StringReader("JSON");
        JsonParser jsonParser0 = jsonFactory0.createParser((Reader) stringReader0);
        innerClassProperty0.deserializeSetAndReturn(jsonParser0, (DeserializationContext) null, (Object) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        PropertyName propertyName0 = new PropertyName("");
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        ReferenceType referenceType0 = ReferenceType.upgradeFrom(simpleType0, simpleType0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        AnnotatedParameter annotatedParameter0 = new AnnotatedParameter((AnnotatedWithParams) null, referenceType0, annotationMap0, 789);
        Integer integer0 = new Integer(789);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.construct(false, "", integer0, "V1");
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, referenceType0, propertyName0, (TypeDeserializer) null, annotationMap0, annotatedParameter0, 789, annotatedParameter0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        int int0 = innerClassProperty0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        Class<Integer> class0 = Integer.TYPE;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, (-1), (Object) null, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        innerClassProperty0.set(annotationMap0, propertyName0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, 0, propertyMetadata0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        innerClassProperty0.assignIndex(0);
        innerClassProperty0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, 0, propertyMetadata0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        Class<Annotation> class1 = Annotation.class;
        Annotation annotation0 = innerClassProperty0.getAnnotation(class1);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, 0, class0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        innerClassProperty0.setAndReturn(simpleType0, creatorProperty0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, (-2711), class0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        InnerClassProperty innerClassProperty1 = innerClassProperty0.withValueDeserializer((JsonDeserializer<?>) null);
        innerClassProperty1.hasValueTypeDeserializer();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, 4157, class0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        innerClassProperty0.readResolve();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, 4142, class0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        InnerClassProperty innerClassProperty1 = innerClassProperty0.withName(propertyName0);
        innerClassProperty1.isRequired();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        PropertyName propertyName0 = new PropertyName("");
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        ReferenceType referenceType0 = ReferenceType.upgradeFrom(simpleType0, simpleType0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        AnnotatedParameter annotatedParameter0 = new AnnotatedParameter((AnnotatedWithParams) null, referenceType0, annotationMap0, 799);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, referenceType0, propertyName0, (TypeDeserializer) null, annotationMap0, annotatedParameter0, 799, annotatedParameter0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        AnnotatedMember annotatedMember0 = innerClassProperty0.getMember();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        PropertyName propertyName0 = PropertyName.NO_NAME;
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        Class<InputStream> class1 = InputStream.class;
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer(simpleType0, classNameIdResolver0, "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", true, class1);
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, asWrapperTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, (-65281), "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer", propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        JsonFactory jsonFactory0 = new JsonFactory();
        StringReader stringReader0 = new StringReader("com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer");
        JsonParser jsonParser0 = jsonFactory0.createParser((Reader) stringReader0);
        innerClassProperty0.deserializeAndSet(jsonParser0, (DeserializationContext) null, propertyMetadata0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        Class<ChronoLocalDate> class0 = ChronoLocalDate.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, 4157, class0, propertyMetadata0);
        InnerClassProperty innerClassProperty0 = new InnerClassProperty(creatorProperty0, (Constructor<?>) null);
        innerClassProperty0.writeReplace();
    }
}
