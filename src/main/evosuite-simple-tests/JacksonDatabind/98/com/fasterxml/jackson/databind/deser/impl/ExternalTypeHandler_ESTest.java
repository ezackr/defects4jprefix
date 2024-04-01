/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 00:13:12 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.impl.AsExternalTypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.AsPropertyTypeDeserializer;
import com.fasterxml.jackson.databind.node.FloatNode;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ExternalTypeHandler_ESTest extends ExternalTypeHandler_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build((BeanPropertyMap) null);
        boolean boolean0 = externalTypeHandler0.handleTypePropertyValue((JsonParser) null, (DeserializationContext) null, ".&u;>?", (Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer((JavaType) null, (TypeIdResolver) null, "CLASS", false, (JavaType) null);
        AnnotationMap annotationMap0 = new AnnotationMap();
        Class<FloatNode> class0 = FloatNode.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        PropertyName propertyName0 = PropertyName.construct("com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator");
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asExternalTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, (-18), valueInstantiator_Base0, propertyMetadata0);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asExternalTypeDeserializer0);
        HashSet<SettableBeanProperty> hashSet0 = new HashSet<SettableBeanProperty>();
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        BeanPropertyMap beanPropertyMap0 = BeanPropertyMap.construct((Collection<SettableBeanProperty>) hashSet0, false, (Map<String, List<PropertyName>>) hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        // Undeclared exception!
        try {
            externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator", (Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.util.TokenBuffer", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer((JavaType) null, (TypeIdResolver) null, "com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator", true, (JavaType) null);
        AnnotationMap annotationMap0 = new AnnotationMap();
        Class<FloatNode> class0 = FloatNode.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        PropertyName propertyName0 = PropertyName.construct("com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator");
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asExternalTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, (-38), valueInstantiator_Base0, propertyMetadata0);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asExternalTypeDeserializer0);
        HashSet<SettableBeanProperty> hashSet0 = new HashSet<SettableBeanProperty>();
        hashSet0.add(creatorProperty0);
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        BeanPropertyMap beanPropertyMap0 = BeanPropertyMap.construct((Collection<SettableBeanProperty>) hashSet0, true, (Map<String, List<PropertyName>>) hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        assertNotNull(externalTypeHandler0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder((JavaType) null);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build((BeanPropertyMap) null);
        ExternalTypeHandler externalTypeHandler1 = externalTypeHandler0.start();
        assertNotSame(externalTypeHandler0, externalTypeHandler1);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = new ExternalTypeHandler.Builder((JavaType) null);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build((BeanPropertyMap) null);
        PropertyName propertyName0 = PropertyName.NO_NAME;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer((JavaType) null, (TypeIdResolver) null, "com.fasterxml.jakson.uatabnd.jscntype.impl.SubvyeValidator", false, (JavaType) null);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 583, asPropertyTypeDeserializer0, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        // Undeclared exception!
        try {
            externalTypeHandler0.handleTypePropertyValue((JsonParser) null, (DeserializationContext) null, "com.fasterxml.jakson.uatabnd.jscntype.impl.SubvyeValidator", "com.fasterxml.jakson.uatabnd.jscntype.impl.SubvyeValidator");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build((BeanPropertyMap) null);
        boolean boolean0 = externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "#TSE8extK/", (Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer((JavaType) null, (TypeIdResolver) null, "com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator", true, (JavaType) null);
        AnnotationMap annotationMap0 = new AnnotationMap();
        Class<FloatNode> class0 = FloatNode.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        PropertyName propertyName0 = PropertyName.construct("com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator");
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asExternalTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, (-38), valueInstantiator_Base0, propertyMetadata0);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asExternalTypeDeserializer0);
        HashSet<SettableBeanProperty> hashSet0 = new HashSet<SettableBeanProperty>();
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        BeanPropertyMap beanPropertyMap0 = BeanPropertyMap.construct((Collection<SettableBeanProperty>) hashSet0, true, (Map<String, List<PropertyName>>) hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        // Undeclared exception!
        try {
            externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator", hashMap0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer((JavaType) null, (TypeIdResolver) null, "CLASS", false, (JavaType) null);
        AnnotationMap annotationMap0 = new AnnotationMap();
        Class<FloatNode> class0 = FloatNode.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        PropertyName propertyName0 = PropertyName.construct("com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator", "com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator");
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asExternalTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, (-18), valueInstantiator_Base0, propertyMetadata0);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asExternalTypeDeserializer0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asExternalTypeDeserializer0);
        HashSet<SettableBeanProperty> hashSet0 = new HashSet<SettableBeanProperty>();
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        BeanPropertyMap beanPropertyMap0 = BeanPropertyMap.construct((Collection<SettableBeanProperty>) hashSet0, false, (Map<String, List<PropertyName>>) hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        // Undeclared exception!
        try {
            externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator", (Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.util.TokenBuffer", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer((JavaType) null, (TypeIdResolver) null, "com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator", true, (JavaType) null);
        AnnotationMap annotationMap0 = new AnnotationMap();
        Class<FloatNode> class0 = FloatNode.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_OPTIONAL;
        PropertyName propertyName0 = PropertyName.NO_NAME;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asExternalTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, (-38), valueInstantiator_Base0, propertyMetadata0);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asExternalTypeDeserializer0);
        HashSet<SettableBeanProperty> hashSet0 = new HashSet<SettableBeanProperty>();
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        BeanPropertyMap beanPropertyMap0 = BeanPropertyMap.construct((Collection<SettableBeanProperty>) hashSet0, true, (Map<String, List<PropertyName>>) hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        // Undeclared exception!
        try {
            externalTypeHandler0.handlePropertyValue((JsonParser) null, (DeserializationContext) null, "com.fasterxml.jackson.databind.jsontype.impl.SubTyeValidator", (Object) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", e);
        }
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer((JavaType) null, (TypeIdResolver) null, "", true, (JavaType) null);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 618, (Object) null, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        TreeSet<SettableBeanProperty> treeSet0 = new TreeSet<SettableBeanProperty>();
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        BeanPropertyMap beanPropertyMap0 = new BeanPropertyMap(true, treeSet0, hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        ExternalTypeHandler externalTypeHandler1 = new ExternalTypeHandler(externalTypeHandler0);
        Object object0 = externalTypeHandler1.complete((JsonParser) null, (DeserializationContext) null, (Object) asPropertyTypeDeserializer0);
        assertSame(asPropertyTypeDeserializer0, object0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        PropertyName propertyName0 = PropertyName.USE_DEFAULT;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer0 = new AsPropertyTypeDeserializer((JavaType) null, (TypeIdResolver) null, "", false, (JavaType) null);
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asPropertyTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, 618, (Object) null, propertyMetadata0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asPropertyTypeDeserializer0);
        TreeSet<SettableBeanProperty> treeSet0 = new TreeSet<SettableBeanProperty>();
        HashMap<String, List<PropertyName>> hashMap0 = new HashMap<String, List<PropertyName>>();
        BeanPropertyMap beanPropertyMap0 = new BeanPropertyMap(false, treeSet0, hashMap0);
        ExternalTypeHandler externalTypeHandler0 = externalTypeHandler_Builder0.build(beanPropertyMap0);
        ExternalTypeHandler externalTypeHandler1 = new ExternalTypeHandler(externalTypeHandler0);
        // Undeclared exception!
        try {
            externalTypeHandler1.complete((JsonParser) null, (DeserializationContext) null, (PropertyValueBuffer) null, (PropertyBasedCreator) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        AsExternalTypeDeserializer asExternalTypeDeserializer0 = new AsExternalTypeDeserializer((JavaType) null, (TypeIdResolver) null, "mSj4}", true, (JavaType) null);
        AnnotationMap annotationMap0 = new AnnotationMap();
        Class<FloatNode> class0 = FloatNode.class;
        ValueInstantiator.Base valueInstantiator_Base0 = new ValueInstantiator.Base(class0);
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED;
        PropertyName propertyName0 = PropertyName.construct("mSj4}", "mSj4}");
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, (JavaType) null, propertyName0, asExternalTypeDeserializer0, annotationMap0, (AnnotatedParameter) null, (-18), valueInstantiator_Base0, propertyMetadata0);
        ExternalTypeHandler.Builder externalTypeHandler_Builder0 = ExternalTypeHandler.builder((JavaType) null);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asExternalTypeDeserializer0);
        externalTypeHandler_Builder0.addExternal(creatorProperty0, asExternalTypeDeserializer0);
        assertTrue(creatorProperty0.isRequired());
    }
}
