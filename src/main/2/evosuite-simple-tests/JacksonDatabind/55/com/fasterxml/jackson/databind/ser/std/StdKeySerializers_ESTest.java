/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 20:49:35 GMT 2024
 */
package com.fasterxml.jackson.databind.ser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class StdKeySerializers_ESTest extends StdKeySerializers_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getDefault();
        assertFalse(jsonSerializer0.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializationFeature serializationFeature0 = SerializationFeature.WRITE_ENUMS_USING_TO_STRING;
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        // Undeclared exception!
        try {
            stdKeySerializers_Dynamic0.serialize(serializationFeature0, (JsonGenerator) null, serializerProvider0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic1 = (StdKeySerializers.Dynamic) stdKeySerializers_Dynamic0.readResolve();
        assertFalse(stdKeySerializers_Dynamic1.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        StdKeySerializers.StringKeySerializer stdKeySerializers_StringKeySerializer0 = new StdKeySerializers.StringKeySerializer();
        assertFalse(stdKeySerializers_StringKeySerializer0.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        // Undeclared exception!
        try {
            stdKeySerializers_Dynamic0.serialize("", (JsonGenerator) null, serializerProvider0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, (Class<?>) null, true);
        assertFalse(jsonSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<Object> class0 = Object.class;
        JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, false);
        assertFalse(jsonSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<Float> class0 = Float.TYPE;
        JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, false);
        assertFalse(jsonSerializer0.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Class<Byte> class0 = Byte.class;
        JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, true);
        assertFalse(jsonSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        Class<Long> class0 = Long.TYPE;
        // Undeclared exception!
        try {
            stdKeySerializers_Dynamic0.serialize(class0, (JsonGenerator) null, serializerProvider0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default", e);
        }
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        MockDate mockDate0 = new MockDate();
        // Undeclared exception!
        try {
            stdKeySerializers_Dynamic0.serialize(mockDate0, (JsonGenerator) null, serializerProvider0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.SerializerProvider", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar();
        // Undeclared exception!
        try {
            stdKeySerializers_Dynamic0.serialize(mockGregorianCalendar0, (JsonGenerator) null, serializerProvider0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.SerializerProvider", e);
        }
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        UUID uUID0 = MockUUID.randomUUID();
        // Undeclared exception!
        try {
            stdKeySerializers_Dynamic0.serialize(uUID0, (JsonGenerator) null, serializerProvider0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default", e);
        }
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getStdKeySerializer((SerializationConfig) null, class0, true);
        assertFalse(jsonSerializer0.isUnwrappingSerializer());
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        JsonSerializer<Object> jsonSerializer0 = StdKeySerializers.getFallbackKeySerializer((SerializationConfig) null, (Class<?>) null);
        assertFalse(jsonSerializer0.usesObjectId());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        // Undeclared exception!
        try {
            stdKeySerializers_Dynamic0.serialize(objectMapper0, (JsonGenerator) null, serializerProvider0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Class<Float> class0 = Float.class;
        StdKeySerializers.Default stdKeySerializers_Default0 = new StdKeySerializers.Default((-463), class0);
        DefaultSerializerProvider.Impl defaultSerializerProvider_Impl0 = new DefaultSerializerProvider.Impl();
        // Undeclared exception!
        try {
            stdKeySerializers_Default0.serialize(class0, (JsonGenerator) null, defaultSerializerProvider_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default", e);
        }
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializationFeature serializationFeature0 = SerializationFeature.WRITE_ENUMS_USING_TO_STRING;
        SerializationFeature[] serializationFeatureArray0 = new SerializationFeature[8];
        serializationFeatureArray0[0] = serializationFeature0;
        serializationFeatureArray0[1] = serializationFeature0;
        serializationFeatureArray0[2] = serializationFeature0;
        serializationFeatureArray0[3] = serializationFeature0;
        serializationFeatureArray0[4] = serializationFeature0;
        serializationFeatureArray0[5] = serializationFeature0;
        serializationFeatureArray0[6] = serializationFeature0;
        serializationFeatureArray0[7] = serializationFeature0;
        ObjectMapper objectMapper1 = objectMapper0.enable(serializationFeature0, serializationFeatureArray0);
        SerializerProvider serializerProvider0 = objectMapper1.getSerializerProviderInstance();
        // Undeclared exception!
        try {
            stdKeySerializers_Dynamic0.serialize(serializationFeature0, (JsonGenerator) null, serializerProvider0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.ser.std.StdKeySerializers$Default", e);
        }
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        StdKeySerializers.Dynamic stdKeySerializers_Dynamic0 = new StdKeySerializers.Dynamic();
        ObjectMapper objectMapper0 = new ObjectMapper();
        SerializerProvider serializerProvider0 = objectMapper0.getSerializerProviderInstance();
        serializerProvider0.setDefaultKeySerializer(stdKeySerializers_Dynamic0);
        // Undeclared exception!
        try {
            stdKeySerializers_Dynamic0.serialize(serializerProvider0, (JsonGenerator) null, serializerProvider0);
            fail("Expecting exception: StackOverflowError");
        } catch (StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }
}
