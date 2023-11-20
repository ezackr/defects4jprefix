/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:10:51 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import java.io.PipedInputStream;
import org.junit.runner.RunWith;

public class MethodPropertyTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        JsonDeserializer<Class<PipedInputStream>> jsonDeserializer0 = (JsonDeserializer<Class<PipedInputStream>>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        MethodProperty methodProperty0 = null;
        methodProperty0 = new MethodProperty((MethodProperty) null, jsonDeserializer0, jsonDeserializer0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        PropertyName propertyName0 = new PropertyName("I~n,Z!a_V>|!M!-");
        MethodProperty methodProperty0 = null;
        methodProperty0 = new MethodProperty((MethodProperty) null, propertyName0);
    }
}
