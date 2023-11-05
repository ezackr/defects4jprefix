/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 22:18:07 GMT 2023
 */
package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.ext.NioPathDeserializer;
import com.fasterxml.jackson.databind.node.IntNode;
import java.time.ZoneId;
import java.util.Set;
import org.junit.runner.RunWith;

public class BeanDeserializerBaseTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        MapperFeature[] mapperFeatureArray0 = new MapperFeature[4];
        MapperFeature mapperFeature0 = MapperFeature.DEFAULT_VIEW_INCLUSION;
        mapperFeatureArray0[0] = mapperFeature0;
        mapperFeatureArray0[1] = mapperFeature0;
        mapperFeatureArray0[2] = mapperFeature0;
        mapperFeatureArray0[3] = mapperFeatureArray0[0];
        objectMapper0.disable(mapperFeatureArray0);
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        try {
            objectMapper0.convertValue((Object) class0, class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not construct instance of com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator: no String-argument constructor/factory method to deserialize from String value ('com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator')
            //  at [Source: java.lang.String@0000001055; line: -1, column: -1]
        }
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectMapper.DefaultTyping objectMapper_DefaultTyping0 = ObjectMapper.DefaultTyping.NON_FINAL;
        ObjectMapper objectMapper1 = objectMapper0.enableDefaultTyping(objectMapper_DefaultTyping0);
        Class<JsonProcessingException> class0 = JsonProcessingException.class;
        ObjectReader objectReader0 = objectMapper1.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Set<String> set0 = ZoneId.getAvailableZoneIds();
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        try {
            objectMapper0.convertValue((Object) set0, class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not deserialize instance of com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator out of START_ARRAY token
            //  at [Source: java.lang.String@0000000182; line: -1, column: -1]
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        JsonFactory jsonFactory0 = new JsonFactory();
        ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
        Class<CreatorProperty> class0 = CreatorProperty.class;
        ObjectReader objectReader0 = objectMapper0.readerFor(class0);
        assertNotNull(objectReader0);
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        NioPathDeserializer nioPathDeserializer0 = new NioPathDeserializer();
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        try {
            objectMapper0.convertValue((Object) nioPathDeserializer0, class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Unrecognized field \"com.fasterxml.jackson.core.io.SerializedString@0000000311\" (class com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator), not marked as ignorable (0 known properties: ])
            //  at [Source: java.lang.String@0000001387; line: -1, column: -1] (through reference chain: com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator[\"com.fasterxml.jackson.core.io.SerializedString@0000000311\"])
        }
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        ObjectMapper.DefaultTyping objectMapper_DefaultTyping0 = ObjectMapper.DefaultTyping.NON_FINAL;
        objectMapper0.enableDefaultTyping(objectMapper_DefaultTyping0);
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        try {
            objectMapper0.convertValue((Object) objectMapper_DefaultTyping0, class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Class com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping not subtype of [simple type, class com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator]
        }
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Long long0 = new Long(0L);
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        try {
            objectMapper0.convertValue((Object) long0, class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not construct instance of com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator: no long/Long-argument constructor/factory method to deserialize from Number value (0)
            //  at [Source: java.lang.String@0000000414; line: -1, column: -1]
        }
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        ObjectMapper objectMapper0 = new ObjectMapper();
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        IntNode intNode0 = new IntNode(1109);
        try {
            objectMapper0.convertValue((Object) intNode0, class0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Can not construct instance of com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator: no int/Int-argument constructor/factory method to deserialize from Number value (1109)
            //  at [Source: java.lang.String@0000000134; line: -1, column: -1]
        }
    }
}
