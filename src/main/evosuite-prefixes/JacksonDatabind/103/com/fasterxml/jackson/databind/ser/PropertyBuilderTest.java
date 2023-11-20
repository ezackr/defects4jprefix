/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:00:06 GMT 2023
 */
package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.PropertyBuilder;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import org.junit.runner.RunWith;

public class PropertyBuilderTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
        RootNameLookup rootNameLookup0 = new RootNameLookup();
        ConfigOverrides configOverrides0 = new ConfigOverrides();
        SerializationConfig serializationConfig0 = new SerializationConfig((BaseSettings) null, stdSubtypeResolver0, (SimpleMixInResolver) null, rootNameLookup0, configOverrides0);
        BasicClassIntrospector basicClassIntrospector0 = new BasicClassIntrospector();
        DeserializationConfig deserializationConfig0 = new DeserializationConfig((BaseSettings) null, stdSubtypeResolver0, (SimpleMixInResolver) null, rootNameLookup0, configOverrides0);
        Class<String> class0 = String.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        BasicBeanDescription basicBeanDescription0 = basicClassIntrospector0.forDeserialization(deserializationConfig0, simpleType0, (ClassIntrospector.MixInResolver) null);
        PropertyBuilder propertyBuilder0 = null;
        propertyBuilder0 = new PropertyBuilder(serializationConfig0, basicBeanDescription0);
    }
}
