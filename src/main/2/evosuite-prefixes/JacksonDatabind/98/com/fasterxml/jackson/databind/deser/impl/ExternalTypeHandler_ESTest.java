/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 23:04:37 GMT 2024
 */
package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.jsontype.impl.AsWrapperTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ExternalTypeHandler_ESTest extends ExternalTypeHandler_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        PropertyName propertyName0 = PropertyName.NO_NAME;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver((JavaType) null, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer((JavaType) null, classNameIdResolver0, "com.fasterxml.jackson.databind.deser.umpl.ExternalTypeHandler$ExtTypedProperty", false, (JavaType) null);
        Class<Annotation> class0 = Annotation.class;
        Class<InputStream> class1 = InputStream.class;
        AnnotationCollector.TwoAnnotations annotationCollector_TwoAnnotations0 = new AnnotationCollector.TwoAnnotations(class0, (Annotation) null, class1, (Annotation) null);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asWrapperTypeDeserializer0, annotationCollector_TwoAnnotations0, (AnnotatedParameter) null, (-4101), (Object) null, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        ArrayDeque<SettableBeanProperty> arrayDeque0 = new ArrayDeque<SettableBeanProperty>();
        BeanPropertyMap beanPropertyMap0 = new BeanPropertyMap(false, arrayDeque0, hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "", "");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        PropertyName propertyName0 = PropertyName.construct((String) null);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver((JavaType) null, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer((JavaType) null, classNameIdResolver0, (String) null, false, (JavaType) null);
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        Class<Annotation> class0 = Annotation.class;
        AnnotationCollector.TwoAnnotations annotationCollector_TwoAnnotations0 = new AnnotationCollector.TwoAnnotations(class0, (Annotation) null, class0, (Annotation) null);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asWrapperTypeDeserializer0, annotationCollector_TwoAnnotations0, (AnnotatedParameter) null, 2938, beanProperty_Bogus0, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        Stack<SettableBeanProperty> stack0 = new Stack<SettableBeanProperty>();
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        stack0.add((SettableBeanProperty) creatorProperty0);
        BeanPropertyMap beanPropertyMap0 = new BeanPropertyMap(false, stack0, hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build((BeanPropertyMap) null);
        ExternalTypeHandler externalTypeHandler1 = externalTypeHandler0.start();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver((JavaType) null, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer((JavaType) null, classNameIdResolver0, "com.fasterxml.jackson.databind.deser.umpl.ExternalTypeHandler$ExtTypedProperty", false, (JavaType) null);
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        Class<Annotation> class0 = Annotation.class;
        Class<InputStream> class1 = InputStream.class;
        AnnotationCollector.TwoAnnotations annotationCollector_TwoAnnotations0 = new AnnotationCollector.TwoAnnotations(class0, (Annotation) null, class1, (Annotation) null);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asWrapperTypeDeserializer0, annotationCollector_TwoAnnotations0, (AnnotatedParameter) null, (-4094), (Object) null, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        ArrayDeque<SettableBeanProperty> arrayDeque0 = new ArrayDeque<SettableBeanProperty>();
        BeanPropertyMap beanPropertyMap0 = new BeanPropertyMap(false, arrayDeque0, hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        BufferRecycler bufferRecycler0 = new BufferRecycler();
        IOContext iOContext0 = new IOContext(bufferRecycler0, annotationCollector_TwoAnnotations0, false);
        FileDescriptor fileDescriptor0 = new FileDescriptor();
        MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
        DataInputStream dataInputStream0 = new DataInputStream(mockFileInputStream0);
        ByteQuadsCanonicalizer byteQuadsCanonicalizer0 = ByteQuadsCanonicalizer.createRoot();
        UTF8DataInputJsonParser uTF8DataInputJsonParser0 = new UTF8DataInputJsonParser(iOContext0, 1, dataInputStream0, (ObjectCodec) null, byteQuadsCanonicalizer0, 0);
        externalTypeHandler0.handleTypePropertyValue(uTF8DataInputJsonParser0, (DeserializationContext) null, "com.fasterxml.jackson.databind.deser.umpl.ExternalTypeHandler$ExtTypedProperty", beanProperty_Bogus0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build((BeanPropertyMap) null);
        boolean boolean0 = externalTypeHandler0.handleTypePropertyValue((JsonParser) null, (DeserializationContext) null, "", externalTypeHandler_Builder0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build((BeanPropertyMap) null);
        boolean boolean0 = externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "", (Object) null);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        PropertyName propertyName0 = PropertyName.construct((String) null);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver((JavaType) null, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer((JavaType) null, classNameIdResolver0, (String) null, true, (JavaType) null);
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        Class<Annotation> class0 = Annotation.class;
        AnnotationCollector.TwoAnnotations annotationCollector_TwoAnnotations0 = new AnnotationCollector.TwoAnnotations(class0, (Annotation) null, class0, (Annotation) null);
        PropertyMetadata propertyMetadata0 = beanProperty_Bogus0.getMetadata();
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asWrapperTypeDeserializer0, annotationCollector_TwoAnnotations0, (AnnotatedParameter) null, 2938, beanProperty_Bogus0, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        Stack<SettableBeanProperty> stack0 = new Stack<SettableBeanProperty>();
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        BeanPropertyMap beanPropertyMap0 = new BeanPropertyMap(true, stack0, hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "", (Object) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        PropertyName propertyName0 = PropertyName.NO_NAME;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver((JavaType) null, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer((JavaType) null, classNameIdResolver0, "com.fasterxml.jackson.databind.deser.umpl.ExternalTypeHandler$ExtTypedProperty", false, (JavaType) null);
        Class<Annotation> class0 = Annotation.class;
        Class<InputStream> class1 = InputStream.class;
        AnnotationCollector.TwoAnnotations annotationCollector_TwoAnnotations0 = new AnnotationCollector.TwoAnnotations(class0, (Annotation) null, class1, (Annotation) null);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asWrapperTypeDeserializer0, annotationCollector_TwoAnnotations0, (AnnotatedParameter) null, (-4101), (Object) null, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        ArrayDeque<SettableBeanProperty> arrayDeque0 = new ArrayDeque<SettableBeanProperty>();
        BeanPropertyMap beanPropertyMap0 = new BeanPropertyMap(false, arrayDeque0, hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "", "");
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder((JavaType) null);
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver((JavaType) null, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer((JavaType) null, classNameIdResolver0, "com.fasterxml.a%ksoAdataKind.deser.umpl.ExternalTpeHandler$,xtT?peRProperty", false, (JavaType) null);
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        Class<Annotation> class0 = Annotation.class;
        Class<InputStream> class1 = InputStream.class;
        AnnotationCollector.TwoAnnotations annotationCollector_TwoAnnotations0 = new AnnotationCollector.TwoAnnotations(class0, (Annotation) null, class1, (Annotation) null);
        PropertyMetadata propertyMetadata0 = beanProperty_Bogus0.getMetadata();
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asWrapperTypeDeserializer0, annotationCollector_TwoAnnotations0, (AnnotatedParameter) null, (-4081), (Object) null, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        ArrayDeque<SettableBeanProperty> arrayDeque0 = new ArrayDeque<SettableBeanProperty>();
        BeanPropertyMap beanPropertyMap0 = new BeanPropertyMap(false, arrayDeque0, hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "com.fasterxml.a%ksoAdataKind.deser.umpl.ExternalTpeHandler$,xtT?peRProperty", (Object) null);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder((JavaType) null);
        PropertyName propertyName0 = new PropertyName((String) null);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver((JavaType) null, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer((JavaType) null, classNameIdResolver0, (String) null, true, (JavaType) null);
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        Class<Annotation> class0 = Annotation.class;
        AnnotationCollector.TwoAnnotations annotationCollector_TwoAnnotations0 = new AnnotationCollector.TwoAnnotations(class0, (Annotation) null, class0, (Annotation) null);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asWrapperTypeDeserializer0, annotationCollector_TwoAnnotations0, (AnnotatedParameter) null, 2963, beanProperty_Bogus0, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        Stack<SettableBeanProperty> stack0 = new Stack<SettableBeanProperty>();
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        BeanPropertyMap beanPropertyMap0 = new BeanPropertyMap(true, stack0, hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        ExternalTypeHandler externalTypeHandler1 = new ExternalTypeHandler(externalTypeHandler0);
        Object object0 = externalTypeHandler1.complete((JsonParser) null, (DeserializationContext) null, (Object) creatorProperty0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        PropertyName propertyName0 = PropertyName.construct((String) null);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver((JavaType) null, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer((JavaType) null, classNameIdResolver0, (String) null, true, (JavaType) null);
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        Class<Annotation> class0 = Annotation.class;
        AnnotationCollector.TwoAnnotations annotationCollector_TwoAnnotations0 = new AnnotationCollector.TwoAnnotations(class0, (Annotation) null, class0, (Annotation) null);
        PropertyMetadata propertyMetadata0 = beanProperty_Bogus0.getMetadata();
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asWrapperTypeDeserializer0, annotationCollector_TwoAnnotations0, (AnnotatedParameter) null, 2938, beanProperty_Bogus0, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        Stack<SettableBeanProperty> stack0 = new Stack<SettableBeanProperty>();
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        BeanPropertyMap beanPropertyMap0 = new BeanPropertyMap(true, stack0, hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        ExternalTypeHandler externalTypeHandler1 = new ExternalTypeHandler(externalTypeHandler0);
        externalTypeHandler1.complete((JsonParser) null, (DeserializationContext) null, (PropertyValueBuffer) null, (PropertyBasedCreator) null);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        PropertyName propertyName0 = PropertyName.construct((String) null);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver((JavaType) null, typeFactory0);
        AsWrapperTypeDeserializer asWrapperTypeDeserializer0 = new AsWrapperTypeDeserializer((JavaType) null, classNameIdResolver0, (String) null, true, (JavaType) null);
        BeanProperty.Bogus beanProperty_Bogus0 = new BeanProperty.Bogus();
        Class<Annotation> class0 = Annotation.class;
        AnnotationCollector.TwoAnnotations annotationCollector_TwoAnnotations0 = new AnnotationCollector.TwoAnnotations(class0, (Annotation) null, class0, (Annotation) null);
        PropertyMetadata propertyMetadata0 = beanProperty_Bogus0.getMetadata();
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asWrapperTypeDeserializer0, annotationCollector_TwoAnnotations0, (AnnotatedParameter) null, 2938, beanProperty_Bogus0, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asWrapperTypeDeserializer0);
        creatorProperty0.isRequired();
    }
}
