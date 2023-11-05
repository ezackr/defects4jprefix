/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 23:58:23 GMT 2023
 */
package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.HashMap;
import org.junit.runner.RunWith;

public class SubTypeValidatorTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        SubTypeValidator subTypeValidator0 = new SubTypeValidator();
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        TypeFactory typeFactory0 = TypeFactory.defaultInstance();
        Class<HashMap> class0 = HashMap.class;
        Class<Object> class1 = Object.class;
        MapType mapType0 = typeFactory0.constructMapType(class0, class0, class1);
        subTypeValidator0.validateSubType(defaultDeserializationContext_Impl0, mapType0);
        assertFalse(mapType0.isEnumType());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        SubTypeValidator subTypeValidator0 = SubTypeValidator.instance();
        assertNotNull(subTypeValidator0);
    }
}
