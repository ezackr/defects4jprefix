/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 00:01:02 GMT 2023
 */
package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.annotation.Annotation;
import org.junit.runner.RunWith;

public class SubTypeValidatorTest {

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        JavaType javaType0 = TypeFactory.unknownType();
        SubTypeValidator subTypeValidator0 = SubTypeValidator.instance();
        subTypeValidator0.validateSubType((DeserializationContext) null, javaType0);
        assertFalse(javaType0.isCollectionLikeType());
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        SubTypeValidator subTypeValidator0 = SubTypeValidator.instance();
        Class<Annotation> class0 = Annotation.class;
        SimpleType simpleType0 = SimpleType.constructUnsafe(class0);
        subTypeValidator0.validateSubType((DeserializationContext) null, simpleType0);
        assertFalse(simpleType0.isFinal());
    }
}
