/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 04:54:45 GMT 2023
 */
package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.PlaceholderForType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.CharBuffer;
import java.time.format.FormatStyle;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.junit.runner.RunWith;

public class BasicBeanDescriptionTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(basicBeanDescription0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
        AnnotatedMethod annotatedMethod0 = basicBeanDescription0.findMethod("; expected Class<Converter>", (Class<?>[]) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        TypeBindings typeBindings0 = basicBeanDescription0.bindingsForBeanType();
        typeBindings0.size();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        PlaceholderForType placeholderForType0 = new PlaceholderForType((-3317));
        Class<CreatorProperty> class0 = CreatorProperty.class;
        LinkedList<JavaType> linkedList0 = new LinkedList<JavaType>();
        Class<ClassKey> class1 = ClassKey.class;
        Class<Object> class2 = Object.class;
        AnnotationCollector.OneAnnotation annotationCollector_OneAnnotation0 = new AnnotationCollector.OneAnnotation(class2, (Annotation) null);
        TypeBindings typeBindings0 = TypeBindings.emptyBindings();
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        AnnotatedClass annotatedClass0 = new AnnotatedClass(placeholderForType0, class0, linkedList0, class1, annotationCollector_OneAnnotation0, typeBindings0, annotationIntrospector0, (ClassIntrospector.MixInResolver) null, typeFactory0);
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forOtherUse((MapperConfig<?>) null, placeholderForType0, annotatedClass0);
        basicBeanDescription0.findClassDescription();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        boolean boolean0 = basicBeanDescription0.removeProperty("3=bHLgbxuVR|");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        boolean boolean0 = basicBeanDescription0.hasProperty((PropertyName) null);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        AnnotatedMethod annotatedMethod0 = basicBeanDescription0.findJsonValueMethod();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
        Set<String> set0 = basicBeanDescription0.getIgnoredPropertyNames();
        LinkedHashMap<String, AnnotatedField> linkedHashMap0 = basicBeanDescription0._findPropertyFields(set0, false);
        linkedHashMap0.size();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Class<AnnotatedField> class0 = AnnotatedField.class;
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
        basicBeanDescription0.resolveType(class0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
        JavaType javaType0 = basicBeanDescription0.resolveType((Type) null);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        AnnotatedMember annotatedMember0 = basicBeanDescription0.findAnySetterAccessor();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        Map<Object, AnnotatedMember> map0 = basicBeanDescription0.findInjectables();
        map0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        Object object0 = basicBeanDescription0.instantiateBean(true);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
        basicBeanDescription0.findExpectedFormat((JsonFormat.Value) null);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
        ObjectMapper objectMapper1 = objectMapper0.setAnnotationIntrospectors(annotationIntrospector0, annotationIntrospector0);
        Class<CharBuffer> class0 = CharBuffer.class;
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        objectMapper0.acceptJsonFormatVisitor((Class<?>) class0, (JsonFormatVisitorWrapper) jsonFormatVisitorWrapper_Base0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
        Class<AnnotatedField> class0 = AnnotatedField.class;
        basicBeanDescription0.findDefaultViews();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        Class<AnnotatedField> class0 = AnnotatedField.class;
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[5];
        MapperFeature mapperFeature0 = MapperFeature.SORT_PROPERTIES_ALPHABETICALLY;
        mapperFeatureArray0[0] = mapperFeature0;
        mapperFeatureArray0[1] = mapperFeature0;
        mapperFeatureArray0[2] = mapperFeatureArray0[0];
        MapperFeature mapperFeature1 = MapperFeature.DEFAULT_VIEW_INCLUSION;
        mapperFeatureArray0[3] = mapperFeature1;
        mapperFeatureArray0[4] = mapperFeature1;
        ObjectMapper objectMapper1 = objectMapper0.disable(mapperFeatureArray0);
        objectMapper0.acceptJsonFormatVisitor((Class<?>) class0, (JsonFormatVisitorWrapper) jsonFormatVisitorWrapper_Base0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        JsonInclude.Value jsonInclude_Value0 = basicBeanDescription0.findPropertyInclusion((JsonInclude.Value) null);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
        AnnotatedMember annotatedMember0 = basicBeanDescription0.findAnyGetter();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
        Map<String, AnnotatedMember> map0 = basicBeanDescription0.findBackReferenceProperties();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        Class<FormatStyle> class0 = FormatStyle.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.readerFor((JavaType) simpleType0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
        Constructor<?> constructor0 = basicBeanDescription0.findSingleArgConstructor((Class<?>[]) null);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
        Method method0 = basicBeanDescription0.findFactoryMethod((Class<?>[]) null);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
        JsonPOJOBuilder.Value jsonPOJOBuilder_Value0 = basicBeanDescription0.findPOJOBuilderConfig();
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.STRING_DESC;
        String string0 = basicBeanDescription0.findClassDescription();
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        HashSet<String> hashSet0 = new HashSet<String>();
        LinkedHashMap<String, AnnotatedField> linkedHashMap0 = basicBeanDescription0._findPropertyFields(hashSet0, false);
        linkedHashMap0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        basicBeanDescription0._createConverter(basicBeanDescription0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        Class<AnnotatedField> class0 = AnnotatedField.class;
        basicBeanDescription0._createConverter(class0);
    }
}
