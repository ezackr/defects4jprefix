/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 23:03:06 GMT 2023
 */
package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.impl.AttributePropertyWriter;
import java.io.IOException;
import java.util.List;
import org.junit.runner.RunWith;

public class JacksonAnnotationIntrospectorTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        StdTypeResolverBuilder stdTypeResolverBuilder0 = jacksonAnnotationIntrospector0._constructNoTypeResolverBuilder();
        assertFalse(stdTypeResolverBuilder0.isTypeIdVisible());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        ObjectMapper objectMapper0 = new ObjectMapper();
        try {
            objectMapper0.writeValueAsString(basicBeanDescription0);
            fail("Expecting exception: IOException");
        } catch (IOException e) {
            //
            // No serializer found for class com.fasterxml.jackson.databind.introspect.AnnotationMap and no properties discovered to create BeanSerializer (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) ) (through reference chain: com.fasterxml.jackson.databind.introspect.BasicBeanDescription[\"classInfo\"]->com.fasterxml.jackson.databind.introspect.AnnotatedClass[\"annotations\"])
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        Version version0 = jacksonAnnotationIntrospector0.version();
        assertEquals("jackson-databind", version0.getArtifactId());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        StdTypeResolverBuilder stdTypeResolverBuilder0 = jacksonAnnotationIntrospector0._constructStdTypeResolverBuilder();
        assertFalse(stdTypeResolverBuilder0.isTypeIdVisible());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        Object object0 = jacksonAnnotationIntrospector0.readResolve();
        assertSame(jacksonAnnotationIntrospector0, object0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        jacksonAnnotationIntrospector0._annotationsInside = null;
        Object object0 = jacksonAnnotationIntrospector0.readResolve();
        assertSame(object0, jacksonAnnotationIntrospector0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        JsonInclude.Include jsonInclude_Include0 = JsonInclude.Include.USE_DEFAULTS;
        String string0 = jacksonAnnotationIntrospector0.findEnumValue(jsonInclude_Include0);
        assertEquals("USE_DEFAULTS", string0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        JsonInclude.Include jsonInclude_Include0 = JsonInclude.Include.NON_NULL;
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(jsonInclude_Include0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        PropertyName propertyName0 = jacksonAnnotationIntrospector0.findRootName(annotatedClass0);
        assertNull(propertyName0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        String[] stringArray0 = jacksonAnnotationIntrospector0.findPropertiesToIgnore((Annotated) annotatedClass0);
        assertNull(stringArray0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        String string0 = jacksonAnnotationIntrospector0.findClassDescription(annotatedClass0);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        VisibilityChecker<?> visibilityChecker0 = objectMapper0.getVisibilityChecker();
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(visibilityChecker0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        List<NamedType> list0 = jacksonAnnotationIntrospector0.findSubtypes(annotatedClass0);
        assertNull(list0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        String string0 = jacksonAnnotationIntrospector0.findTypeName(annotatedClass0);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        ObjectIdInfo objectIdInfo0 = jacksonAnnotationIntrospector0.findObjectReferenceInfo(annotatedClass0, (ObjectIdInfo) null);
        assertNull(objectIdInfo0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        Object object0 = jacksonAnnotationIntrospector0.findKeySerializer(annotatedClass0);
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        JsonInclude.Include jsonInclude_Include0 = JsonInclude.Include.NON_EMPTY;
        JsonInclude.Include jsonInclude_Include1 = jacksonAnnotationIntrospector0.findSerializationInclusion(annotatedClass0, jsonInclude_Include0);
        assertEquals(JsonInclude.Include.NON_EMPTY, jsonInclude_Include1);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        JsonInclude.Include jsonInclude_Include0 = JsonInclude.Include.NON_NULL;
        JsonInclude.Include jsonInclude_Include1 = jacksonAnnotationIntrospector0.findSerializationInclusionForContent(annotatedClass0, jsonInclude_Include0);
        assertSame(jsonInclude_Include0, jsonInclude_Include1);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.LONG_DESC;
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        Class<?> class0 = jacksonAnnotationIntrospector0.findSerializationKeyType(annotatedClass0, (JavaType) null);
        assertNull(class0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        JsonAppend.Attr jsonAppend_Attr0 = mock(JsonAppend.Attr.class, new ViolatedAssumptionAnswer());
        doReturn("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector").when(jsonAppend_Attr0).propName();
        doReturn("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector").when(jsonAppend_Attr0).propNamespace();
        doReturn(false).when(jsonAppend_Attr0).required();
        doReturn("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector").when(jsonAppend_Attr0).value();
        // Undeclared exception!
        try {
            jacksonAnnotationIntrospector0._constructVirtualProperty(jsonAppend_Attr0, (MapperConfig<?>) null, (AnnotatedClass) null, (JavaType) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        JsonAppend.Attr jsonAppend_Attr0 = mock(JsonAppend.Attr.class, new ViolatedAssumptionAnswer());
        doReturn("").when(jsonAppend_Attr0).propName();
        doReturn("").when(jsonAppend_Attr0).propNamespace();
        doReturn(true).when(jsonAppend_Attr0).required();
        doReturn("").when(jsonAppend_Attr0).value();
        // Undeclared exception!
        try {
            jacksonAnnotationIntrospector0._constructVirtualProperty(jsonAppend_Attr0, (MapperConfig<?>) null, (AnnotatedClass) null, (JavaType) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        Class<AnnotatedField> class0 = AnnotatedField.class;
        AnnotatedClass annotatedClass0 = AnnotatedClass.constructWithoutSuperTypes((Class<?>) class0, (MapperConfig<?>) null);
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        JsonAppend.Prop jsonAppend_Prop0 = mock(JsonAppend.Prop.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(jsonAppend_Prop0).name();
        doReturn((String) null).when(jsonAppend_Prop0).namespace();
        doReturn(false).when(jsonAppend_Prop0).required();
        // Undeclared exception!
        try {
            jacksonAnnotationIntrospector0._constructVirtualProperty(jsonAppend_Prop0, (MapperConfig<?>) null, annotatedClass0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Class<AnnotatedField> class0 = AnnotatedField.class;
        AnnotatedClass annotatedClass0 = AnnotatedClass.constructWithoutSuperTypes((Class<?>) class0, (MapperConfig<?>) null);
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        JsonAppend.Prop jsonAppend_Prop0 = mock(JsonAppend.Prop.class, new ViolatedAssumptionAnswer());
        doReturn("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector").when(jsonAppend_Prop0).name();
        doReturn("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector").when(jsonAppend_Prop0).namespace();
        doReturn(true).when(jsonAppend_Prop0).required();
        doReturn((Class) null).when(jsonAppend_Prop0).type();
        // Undeclared exception!
        try {
            jacksonAnnotationIntrospector0._constructVirtualProperty(jsonAppend_Prop0, (MapperConfig<?>) null, annotatedClass0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.BOOLEAN_DESC;
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectReader objectReader0 = objectMapper0.readerForUpdating(beanSerializerBuilder0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        BasicBeanDescription basicBeanDescription0 = BasicClassIntrospector.INT_DESC;
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder(basicBeanDescription0);
        AnnotatedClass annotatedClass0 = beanSerializerBuilder0.getClassInfo();
        JsonPOJOBuilder.Value jsonPOJOBuilder_Value0 = jacksonAnnotationIntrospector0.findPOJOBuilderConfig(annotatedClass0);
        assertNull(jsonPOJOBuilder_Value0);
    }

    @Test(timeout = 4000)
    public void test2525() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        jacksonAnnotationIntrospector0.setConstructorPropertiesImpliesCreator(false);
        ObjectMapper objectMapper1 = objectMapper0.setAnnotationIntrospectors(jacksonAnnotationIntrospector0, jacksonAnnotationIntrospector0);
        ObjectReader objectReader0 = objectMapper1.readerForUpdating(objectMapper0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test2626() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        Class<?> class0 = jacksonAnnotationIntrospector0._classIfExplicit((Class<?>) null, (Class<?>) null);
        assertNull(class0);
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        Class<Object> class0 = Object.class;
        Class<?> class1 = jacksonAnnotationIntrospector0._classIfExplicit(class0, class0);
        assertNull(class1);
    }

    @Test(timeout = 4000)
    public void test2828() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        Class<Object> class0 = Object.class;
        Class<AttributePropertyWriter> class1 = AttributePropertyWriter.class;
        Class<?> class2 = jacksonAnnotationIntrospector0._classIfExplicit(class0, class1);
        assertNotNull(class2);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        Class<Object> class0 = Object.class;
        Class<AttributePropertyWriter> class1 = AttributePropertyWriter.class;
        Class<?> class2 = jacksonAnnotationIntrospector0._classIfExplicit(class0, class1);
        assertEquals("class java.lang.Object", class2.toString());
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        PropertyName propertyName0 = jacksonAnnotationIntrospector0._propertyName("(c6vME)2L^*vZ3", (String) null);
        assertEquals("(c6vME)2L^*vZ3", propertyName0.getSimpleName());
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        PropertyName propertyName0 = jacksonAnnotationIntrospector0._propertyName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$1", "");
        assertFalse(propertyName0.hasNamespace());
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        PropertyName propertyName0 = jacksonAnnotationIntrospector0._propertyName("com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector$1", "");
        assertFalse(propertyName0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        JacksonAnnotationIntrospector jacksonAnnotationIntrospector0 = new JacksonAnnotationIntrospector();
        AnnotationMap annotationMap0 = new AnnotationMap();
        AnnotatedParameter annotatedParameter0 = new AnnotatedParameter((AnnotatedWithParams) null, (JavaType) null, annotationMap0, 2109);
        PropertyName propertyName0 = jacksonAnnotationIntrospector0._findConstructorName(annotatedParameter0);
        assertNull(propertyName0);
    }
}
