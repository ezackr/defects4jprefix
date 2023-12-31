/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 17:49:11 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.time.format.TextStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ExternalTypeHandler_ESTest extends ExternalTypeHandler_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        JsonTypeInfo.As jsonTypeInfo_As0 = JsonTypeInfo.As.EXISTING_PROPERTY;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "zEl_ng'.?A<5&T; .?%M", false, class0, jsonTypeInfo_As0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 2972, classNameIdResolver0, (PropertyMetadata) null);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        ExternalTypeHandler externalTypeHandler1 = new ExternalTypeHandler(externalTypeHandler0);
        SettableBeanProperty[] settableBeanPropertyArray0 = new SettableBeanProperty[2];
        settableBeanPropertyArray0[0] = (SettableBeanProperty) creatorProperty0;
        settableBeanPropertyArray0[1] = (SettableBeanProperty) creatorProperty0;
        PropertyBasedCreator propertyBasedCreator0 = new PropertyBasedCreator((ValueInstantiator) null, settableBeanPropertyArray0);
        externalTypeHandler1.complete((JsonParser) null, (DeserializationContext) null, (PropertyValueBuffer) null, propertyBasedCreator0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        ExternalTypeHandler externalTypeHandler1 = externalTypeHandler0.start();
        externalTypeHandler1.equals((Object) externalTypeHandler0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        externalTypeHandler0._deserialize((JsonParser) null, (DeserializationContext) null, 1033, "");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        externalTypeHandler0._deserializeAndSet((JsonParser) null, (DeserializationContext) null, externalTypeHandler_Builder0, (-1296), "vVA");
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        boolean boolean0 = externalTypeHandler0.handleTypePropertyValue((JsonParser) null, (DeserializationContext) null, "", "");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        JsonTypeInfo.As jsonTypeInfo_As0 = JsonTypeInfo.As.WRAPPER_ARRAY;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "zEl_ng'.?A<5&T; .?%M", false, class0, jsonTypeInfo_As0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 0, typeFactory0, (PropertyMetadata) null);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        boolean boolean0 = externalTypeHandler0.handleTypePropertyValue((JsonParser) null, (DeserializationContext) null, "", annotationMap0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        JsonTypeInfo.As jsonTypeInfo_As0 = JsonTypeInfo.As.WRAPPER_ARRAY;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "Missing property '%s' for external type id '%s'", false, class0, jsonTypeInfo_As0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyName propertyName0 = new PropertyName("Missing property '%s' for external type id '%s'", "Missing property '%s' for external type id '%s'");
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 0, class0, (PropertyMetadata) null);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser((char[]) null, 0, 0);
        externalTypeHandler0.handleTypePropertyValue(jsonParser0, (DeserializationContext) null, "Missing property '%s' for external type id '%s'", (Object) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        JsonTypeInfo.As jsonTypeInfo_As0 = JsonTypeInfo.As.WRAPPER_ARRAY;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "Missing property '%s' for external type id '%s'", true, class0, jsonTypeInfo_As0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyName propertyName0 = new PropertyName("Missing property '%s' for external type id '%s'", "Missing property '%s' for external type id '%s'");
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, (-30), class0, (PropertyMetadata) null);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser((char[]) null, (-30), (-30));
        ExternalTypeHandler externalTypeHandler1 = new ExternalTypeHandler(externalTypeHandler0);
        boolean boolean0 = externalTypeHandler1.handleTypePropertyValue(jsonParser0, (DeserializationContext) null, "Missing property '%s' for external type id '%s'", externalTypeHandler_Builder0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        boolean boolean0 = externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "ui", "ui");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        JsonTypeInfo.As jsonTypeInfo_As0 = JsonTypeInfo.As.EXTERNAL_PROPERTY;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "zEl_ng'.?A<5&T; .?%M", false, class0, jsonTypeInfo_As0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyName propertyName0 = PropertyName.NO_NAME;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 30, simpleType0, (PropertyMetadata) null);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "", (Object) null);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        JsonTypeInfo.As jsonTypeInfo_As0 = JsonTypeInfo.As.WRAPPER_ARRAY;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "|E)(]", true, class0, jsonTypeInfo_As0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyName propertyName0 = new PropertyName("|E)(]");
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, (-742), class0, (PropertyMetadata) null);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser((char[]) null, (-742), (-742));
        ExternalTypeHandler externalTypeHandler1 = new ExternalTypeHandler(externalTypeHandler0);
        boolean boolean0 = externalTypeHandler1.handlePropertyValue(jsonParser0, (DeserializationContext) null, "|E)(]", (Object) null);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        JsonTypeInfo.As jsonTypeInfo_As0 = JsonTypeInfo.As.WRAPPER_ARRAY;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "|E)(]", true, class0, jsonTypeInfo_As0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyName propertyName0 = new PropertyName("|E)(]");
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, (-742), class0, (PropertyMetadata) null);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        JsonFactory jsonFactory0 = new JsonFactory();
        JsonParser jsonParser0 = jsonFactory0.createParser((char[]) null, (-742), (-742));
        ExternalTypeHandler externalTypeHandler1 = new ExternalTypeHandler(externalTypeHandler0);
        boolean boolean0 = externalTypeHandler1.handlePropertyValue(jsonParser0, (DeserializationContext) null, "|E)(]", simpleType0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        JsonTypeInfo.As jsonTypeInfo_As0 = JsonTypeInfo.As.EXISTING_PROPERTY;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "zEl_ng'.?A<5&T; .?%M", false, class0, jsonTypeInfo_As0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 2972, classNameIdResolver0, (PropertyMetadata) null);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        ExternalTypeHandler externalTypeHandler1 = new ExternalTypeHandler(externalTypeHandler0);
        Object object0 = externalTypeHandler1.complete((JsonParser) null, (DeserializationContext) null, (Object) null);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Class<TypeIdResolver> class0 = TypeIdResolver.class;
        SimpleType simpleType0 = SimpleType.construct(class0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        ClassNameIdResolver classNameIdResolver0 = new ClassNameIdResolver(simpleType0, typeFactory0);
        Class<TextStyle> class1 = TextStyle.class;
        JsonTypeInfo.As jsonTypeInfo_As0 = JsonTypeInfo.As.EXISTING_PROPERTY;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer(simpleType0, classNameIdResolver0, "zEl_ng'.?A<5&T; .?%M", false, class1, jsonTypeInfo_As0);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyName propertyName0 = new PropertyName("<V\"a[#g\"B*qJ@s)j", "");
        ObjectIdGenerators.UUIDGenerator objectIdGenerators_UUIDGenerator0 = new ObjectIdGenerators.UUIDGenerator();
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, simpleType0, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 0, objectIdGenerators_UUIDGenerator0, (PropertyMetadata) null);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder();
        JsonLocationInstantiator jsonLocationInstantiator0 = new JsonLocationInstantiator();
        SettableBeanProperty[] settableBeanPropertyArray0 = new SettableBeanProperty[0];
        PropertyBasedCreator propertyBasedCreator0 = new PropertyBasedCreator(jsonLocationInstantiator0, settableBeanPropertyArray0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build();
        ExternalTypeHandler externalTypeHandler1 = new ExternalTypeHandler(externalTypeHandler0);
        externalTypeHandler1.complete((JsonParser) null, (DeserializationContext) null, (PropertyValueBuffer) null, propertyBasedCreator0);
    }
}
