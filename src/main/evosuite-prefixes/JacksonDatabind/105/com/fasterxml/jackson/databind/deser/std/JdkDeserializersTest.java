/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 00:29:31 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.JdkDeserializers;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.runner.RunWith;

public class JdkDeserializersTest {

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Class<Object> class0 = Object.class;
        JsonDeserializer<?> jsonDeserializer0 = JdkDeserializers.find(class0, "/D8k&k#p6sZ]");
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        Class<AtomicBoolean> class0 = AtomicBoolean.class;
        JsonDeserializer<?> jsonDeserializer0 = JdkDeserializers.find(class0, "com.fasterxml.jackson.databind.JavaType");
        jsonDeserializer0.isCachable();
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        Class<UUID> class0 = UUID.class;
        JsonDeserializer<?> jsonDeserializer0 = JdkDeserializers.find(class0, "com.fasterxml.jackson.databind.JavaType");
        jsonDeserializer0.getNullAccessPattern();
    }

    @Test(timeout = 4000)
    public void test43() throws Throwable {
        Class<StackTraceElement> class0 = StackTraceElement.class;
        JsonDeserializer<?> jsonDeserializer0 = JdkDeserializers.find(class0, "com.fasterxml.jackson.databind.JavaType");
        jsonDeserializer0.isCachable();
    }

    @Test(timeout = 4000)
    public void test54() throws Throwable {
        Class<ByteBuffer> class0 = ByteBuffer.class;
        JsonDeserializer<?> jsonDeserializer0 = JdkDeserializers.find(class0, "com.fasterxml.jackson.databind.JavaType");
        jsonDeserializer0.isCachable();
    }

    @Test(timeout = 4000)
    public void test65() throws Throwable {
        Class<Integer> class0 = Integer.class;
        JsonDeserializer<?> jsonDeserializer0 = JdkDeserializers.find(class0, "com.fasterxml.jackson.databind.JavaType");
    }
}
