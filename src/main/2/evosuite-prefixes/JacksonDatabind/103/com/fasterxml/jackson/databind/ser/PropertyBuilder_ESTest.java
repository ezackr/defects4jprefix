/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 23:54:33 GMT 2024
 */
package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.ser.PropertyBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.lang.reflect.Type;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PropertyBuilder_ESTest extends PropertyBuilder_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        StdSubtypeResolver stdSubtypeResolver0 = new StdSubtypeResolver();
        SimpleMixInResolver simpleMixInResolver0 = new SimpleMixInResolver((ClassIntrospector.MixInResolver) null);
        RootNameLookup rootNameLookup0 = new RootNameLookup();
        ConfigOverrides configOverrides0 = new ConfigOverrides();
        SerializationConfig serializationConfig0 = new SerializationConfig((BaseSettings) null, stdSubtypeResolver0, simpleMixInResolver0, rootNameLookup0, configOverrides0);
        BasicClassIntrospector basicClassIntrospector0 = new BasicClassIntrospector();
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<Long> class0 = Long.TYPE;
        JavaType javaType0 = typeFactory0.constructType((Type) class0);
        BasicBeanDescription basicBeanDescription0 = basicClassIntrospector0.forSerialization(serializationConfig0, javaType0, serializationConfig0);
        PropertyBuilder propertyBuilder0 = null;
        propertyBuilder0 = new PropertyBuilder(serializationConfig0, basicBeanDescription0);
    }
}
