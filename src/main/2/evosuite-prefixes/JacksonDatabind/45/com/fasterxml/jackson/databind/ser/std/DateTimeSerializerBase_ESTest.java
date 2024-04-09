/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:16:34 GMT 2024
 */
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotationMap;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.SqlDateSerializer;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.text.MockDateFormat;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class DateTimeSerializerBase_ESTest extends DateTimeSerializerBase_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        DateSerializer dateSerializer0 = new DateSerializer();
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        dateSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        DateSerializer dateSerializer0 = new DateSerializer();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonSerializer<?> jsonSerializer0 = defaultSerializerProvider_Impl0.handleSecondaryContextualization(dateSerializer0, (BeanProperty) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        DateSerializer dateSerializer0 = new DateSerializer();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JavaType[] javaTypeArray0 = new JavaType[2];
        AnnotationMap annotationMap0 = new AnnotationMap();
        PropertyMetadata propertyMetadata0 = PropertyMetadata.STD_REQUIRED_OR_OPTIONAL;
        PropertyName propertyName0 = PropertyName.NO_NAME;
        CreatorProperty creatorProperty0 = new CreatorProperty(propertyName0, javaTypeArray0[0], propertyName0, (TypeDeserializer) null, annotationMap0, (AnnotatedParameter) null, 2147136937, annotationMap0, propertyMetadata0);
        defaultSerializerProvider_Impl0.handleSecondaryContextualization(dateSerializer0, creatorProperty0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        DateSerializer dateSerializer0 = DateSerializer.instance;
        boolean boolean0 = dateSerializer0.isEmpty((Date) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        DateSerializer dateSerializer0 = new DateSerializer();
        MockDate mockDate0 = new MockDate(2, 2, 2);
        boolean boolean0 = dateSerializer0.isEmpty((Date) mockDate0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CalendarSerializer calendarSerializer0 = CalendarSerializer.instance;
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar((-2145329701), (-2145329701), (-2145329701), (-2145329701), (-2145329701));
        boolean boolean0 = calendarSerializer0.isEmpty((Calendar) mockGregorianCalendar0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        DateSerializer dateSerializer0 = new DateSerializer();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        boolean boolean0 = dateSerializer0.isEmpty((SerializerProvider) defaultSerializerProvider_Impl0, (Date) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        DateSerializer dateSerializer0 = DateSerializer.instance;
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        MockDate mockDate0 = new MockDate();
        boolean boolean0 = dateSerializer0.isEmpty((SerializerProvider) defaultSerializerProvider_Impl0, (Date) mockDate0);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        java.sql.Date date0 = new java.sql.Date(0L);
        SqlDateSerializer sqlDateSerializer0 = new SqlDateSerializer();
        boolean boolean0 = sqlDateSerializer0.isEmpty((SerializerProvider) defaultSerializerProvider_Impl0, date0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        DateSerializer dateSerializer0 = new DateSerializer();
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Class<ObjectNode> class0 = ObjectNode.class;
        DateFormat dateFormat0 = MockDateFormat.getDateInstance();
        DateSerializer dateSerializer1 = dateSerializer0.withFormat((Boolean) null, dateFormat0);
        JsonNode jsonNode0 = dateSerializer1.getSchema((SerializerProvider) defaultSerializerProvider_Impl0, (Type) class0);
        jsonNode0.size();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper((JsonFactory) null);
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        DateSerializer dateSerializer0 = DateSerializer.instance;
        Class<Object> class0 = Object.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        JsonNode jsonNode0 = dateSerializer0.getSchema(serializerProvider0, (Type) simpleType0);
        jsonNode0.size();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        Boolean boolean0 = Boolean.FALSE;
        DateFormat dateFormat0 = MockDateFormat.getInstance();
        DateSerializer dateSerializer0 = new DateSerializer(boolean0, dateFormat0);
        boolean boolean1 = dateSerializer0._asTimestamp(defaultSerializerProvider_Impl0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        SqlDateSerializer sqlDateSerializer0 = new SqlDateSerializer();
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        MapType mapType0 = typeFactory0.constructRawMapType(class0);
        sqlDateSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, mapType0);
        sqlDateSerializer0.isUnwrappingSerializer();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Boolean boolean0 = Boolean.TRUE;
        SqlDateSerializer sqlDateSerializer0 = new SqlDateSerializer(boolean0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base(defaultSerializerProvider_Impl0);
        sqlDateSerializer0.acceptJsonFormatVisitor(jsonFormatVisitorWrapper_Base0, (JavaType) null);
        sqlDateSerializer0.isUnwrappingSerializer();
    }
}
