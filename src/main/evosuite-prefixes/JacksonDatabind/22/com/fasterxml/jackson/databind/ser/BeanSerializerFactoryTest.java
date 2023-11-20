/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 03:29:42 GMT 2023
 */
package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.module.SimpleSerializers;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializerBuilder;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Array;
import java.sql.DataTruncation;
import java.sql.SQLClientInfoException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.runner.RunWith;

public class BeanSerializerFactoryTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        BeanPropertyWriter beanPropertyWriter0 = new BeanPropertyWriter();
        Class<ObjectIdGenerators.IntSequenceGenerator>[] classArray0 = (Class<ObjectIdGenerators.IntSequenceGenerator>[]) Array.newInstance(Class.class, 9);
        BeanPropertyWriter beanPropertyWriter1 = beanSerializerFactory0.constructFilteredBeanWriter(beanPropertyWriter0, classArray0);
        beanPropertyWriter1.isUnwrapping();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        SerializerFactoryConfig serializerFactoryConfig0 = new SerializerFactoryConfig();
        BeanSerializerFactory beanSerializerFactory0 = new BeanSerializerFactory(serializerFactoryConfig0);
        SerializerFactory serializerFactory0 = beanSerializerFactory0.withConfig(serializerFactoryConfig0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        Class<IntNode> class0 = IntNode.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<AnnotatedField> class0 = AnnotatedField.class;
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProvider();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<LinkedList> class1 = LinkedList.class;
        Class<BeanSerializer> class2 = BeanSerializer.class;
        SimpleType simpleType0 = SimpleType.construct(class2);
        MapType mapType0 = MapType.construct(class0, simpleType0, simpleType0);
        CollectionType collectionType0 = typeFactory0.constructCollectionType((Class<? extends Collection>) class1, (JavaType) mapType0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((AnnotatedMethod) null).when(pOJOPropertiesCollector0).getJsonValueMethod();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        beanSerializerFactory0._createSerializer2(serializerProvider0, collectionType0, basicBeanDescription0, true);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        DeserializationFeature deserializationFeature0 = DeserializationFeature.UNWRAP_ROOT_VALUE;
        ObjectReader objectReader0 = objectMapper0.reader(deserializationFeature0);
        TypeFactory typeFactory0 = objectReader0.getTypeFactory();
        Class<Integer> class0 = Integer.class;
        Class<POJOPropertyBuilder> class1 = POJOPropertyBuilder.class;
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType(class0, class0, class1);
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProvider();
        JsonFormatVisitorWrapper.Base jsonFormatVisitorWrapper_Base0 = new JsonFormatVisitorWrapper.Base(serializerProvider0);
        objectMapper0.acceptJsonFormatVisitor((JavaType) mapLikeType0, (JsonFormatVisitorWrapper) jsonFormatVisitorWrapper_Base0);
        mapLikeType0.isConcrete();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SimpleSerializers simpleSerializers0 = new SimpleSerializers();
        SerializerFactory serializerFactory0 = beanSerializerFactory0.withAdditionalSerializers(simpleSerializers0);
        ObjectMapper objectMapper1 = objectMapper0.setSerializerFactory(serializerFactory0);
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        Class<DataTruncation> class0 = DataTruncation.class;
        boolean boolean0 = objectMapper1.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        SimpleSerializers simpleSerializers0 = new SimpleSerializers();
        SerializerFactory serializerFactory0 = beanSerializerFactory0.withAdditionalSerializers(simpleSerializers0);
        ObjectMapper objectMapper1 = objectMapper0.setSerializerFactory(serializerFactory0);
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        Class<DataTruncation> class0 = DataTruncation.class;
        boolean boolean0 = objectMapper1.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        Class<JsonGenerator.Feature> class0 = JsonGenerator.Feature.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder((BeanDescription) null);
        BeanSerializerModifier beanSerializerModifier0 = mock(BeanSerializerModifier.class, new ViolatedAssumptionAnswer());
        doReturn((List<BeanPropertyWriter>) null).when(beanSerializerModifier0).changeProperties(any(com.fasterxml.jackson.databind.SerializationConfig.class), any(com.fasterxml.jackson.databind.BeanDescription.class), anyList());
        doReturn((JsonSerializer) null).when(beanSerializerModifier0).modifySerializer(any(com.fasterxml.jackson.databind.SerializationConfig.class), any(com.fasterxml.jackson.databind.BeanDescription.class), any(com.fasterxml.jackson.databind.JsonSerializer.class));
        doReturn((List<BeanPropertyWriter>) null).when(beanSerializerModifier0).orderProperties(any(com.fasterxml.jackson.databind.SerializationConfig.class), any(com.fasterxml.jackson.databind.BeanDescription.class), anyList());
        doReturn(beanSerializerBuilder0).when(beanSerializerModifier0).updateBuilder(any(com.fasterxml.jackson.databind.SerializationConfig.class), any(com.fasterxml.jackson.databind.BeanDescription.class), any(com.fasterxml.jackson.databind.ser.BeanSerializerBuilder.class));
        SerializerFactory serializerFactory0 = beanSerializerFactory0.withSerializerModifier(beanSerializerModifier0);
        objectMapper0.setSerializerFactory(serializerFactory0);
        Class<AnnotatedField> class0 = AnnotatedField.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test079() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        BeanSerializerBuilder beanSerializerBuilder0 = new BeanSerializerBuilder((BeanDescription) null);
        BeanSerializerModifier beanSerializerModifier0 = mock(BeanSerializerModifier.class, new ViolatedAssumptionAnswer());
        doReturn((List<BeanPropertyWriter>) null).when(beanSerializerModifier0).changeProperties(any(com.fasterxml.jackson.databind.SerializationConfig.class), any(com.fasterxml.jackson.databind.BeanDescription.class), anyList());
        doReturn((JsonSerializer) null).when(beanSerializerModifier0).modifySerializer(any(com.fasterxml.jackson.databind.SerializationConfig.class), any(com.fasterxml.jackson.databind.BeanDescription.class), any(com.fasterxml.jackson.databind.JsonSerializer.class));
        doReturn((List<BeanPropertyWriter>) null).when(beanSerializerModifier0).orderProperties(any(com.fasterxml.jackson.databind.SerializationConfig.class), any(com.fasterxml.jackson.databind.BeanDescription.class), anyList());
        doReturn(beanSerializerBuilder0).when(beanSerializerModifier0).updateBuilder(any(com.fasterxml.jackson.databind.SerializationConfig.class), any(com.fasterxml.jackson.databind.BeanDescription.class), any(com.fasterxml.jackson.databind.ser.BeanSerializerBuilder.class));
        SerializerFactory serializerFactory0 = beanSerializerFactory0.withSerializerModifier(beanSerializerModifier0);
        objectMapper0.setSerializerFactory(serializerFactory0);
        Class<AnnotatedField> class0 = AnnotatedField.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
        atomicReference0.toString();
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        Class<WritableObjectId> class0 = WritableObjectId.class;
        SerializerFactoryConfig serializerFactoryConfig0 = new SerializerFactoryConfig();
        BeanSerializerFactory beanSerializerFactory0 = new BeanSerializerFactory(serializerFactoryConfig0);
        SimpleType simpleType0 = SimpleType.construct(class0);
        MapType mapType0 = MapType.construct(class0, simpleType0, simpleType0);
        ArrayType arrayType0 = ArrayType.construct(mapType0, class0, class0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forSerialization(pOJOPropertiesCollector0);
        JsonSerializer<Object> jsonSerializer0 = beanSerializerFactory0.findBeanSerializer((SerializerProvider) null, arrayType0, basicBeanDescription0);
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        Class<JsonGenerator.Feature> class0 = JsonGenerator.Feature.class;
        BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<ObjectIdGenerators.UUIDGenerator> class1 = ObjectIdGenerators.UUIDGenerator.class;
        MapLikeType mapLikeType0 = typeFactory0.constructMapLikeType(class0, class0, class1);
        beanSerializerFactory0.findBeanSerializer((SerializerProvider) null, mapLikeType0, (BeanDescription) null);
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        Class<Object> class0 = Object.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
        atomicReference0.toString();
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        Class<Object> class0 = Object.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        Class<BeanSerializerFactory> class0 = BeanSerializerFactory.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature mapperFeature0 = MapperFeature.AUTO_DETECT_FIELDS;
        MapperFeature mapperFeature1 = MapperFeature.REQUIRE_SETTERS_FOR_GETTERS;
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[8];
        mapperFeatureArray0[0] = mapperFeature1;
        mapperFeatureArray0[1] = mapperFeature1;
        mapperFeatureArray0[2] = mapperFeatureArray0[1];
        mapperFeatureArray0[3] = mapperFeature0;
        mapperFeatureArray0[4] = mapperFeature1;
        mapperFeatureArray0[5] = mapperFeature0;
        mapperFeatureArray0[6] = mapperFeature1;
        mapperFeatureArray0[7] = mapperFeature1;
        objectMapper0.enable(mapperFeatureArray0);
        Class<BeanPropertyWriter> class0 = BeanPropertyWriter.class;
        SQLClientInfoException sQLClientInfoException0 = new SQLClientInfoException();
        MockThrowable mockThrowable0 = new MockThrowable(sQLClientInfoException0);
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>(mockThrowable0);
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[5];
        MapperFeature mapperFeature0 = MapperFeature.USE_ANNOTATIONS;
        mapperFeatureArray0[0] = mapperFeature0;
        mapperFeatureArray0[1] = mapperFeature0;
        MapperFeature mapperFeature1 = MapperFeature.DEFAULT_VIEW_INCLUSION;
        mapperFeatureArray0[2] = mapperFeature1;
        mapperFeatureArray0[3] = mapperFeatureArray0[0];
        mapperFeatureArray0[4] = mapperFeatureArray0[1];
        objectMapper0.disable(mapperFeatureArray0);
        Class<WritableObjectId> class0 = WritableObjectId.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[2];
        MapperFeature mapperFeature0 = MapperFeature.REQUIRE_SETTERS_FOR_GETTERS;
        mapperFeatureArray0[0] = mapperFeature0;
        mapperFeatureArray0[1] = mapperFeature0;
        objectMapper0.enable(mapperFeatureArray0);
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        Class<WritableObjectId> class0 = WritableObjectId.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        objectMapper0.enableDefaultTyping();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        Class<AnnotatedField> class0 = AnnotatedField.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        AtomicReference<Throwable> atomicReference0 = new AtomicReference<Throwable>();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[5];
        MapperFeature mapperFeature0 = MapperFeature.USE_ANNOTATIONS;
        mapperFeatureArray0[0] = mapperFeature0;
        MapperFeature mapperFeature1 = MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS;
        mapperFeatureArray0[1] = mapperFeature1;
        mapperFeatureArray0[2] = mapperFeature0;
        mapperFeatureArray0[3] = mapperFeature1;
        mapperFeatureArray0[4] = mapperFeature0;
        objectMapper0.disable(mapperFeatureArray0);
        Class<WritableObjectId> class0 = WritableObjectId.class;
        boolean boolean0 = objectMapper0.canSerialize(class0, atomicReference0);
    }
}
