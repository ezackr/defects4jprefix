/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 21:52:18 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class StdKeyDeserializer_ESTest extends StdKeyDeserializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<Calendar> class0 = Calendar.class;
        JsonDeserializer<Boolean> jsonDeserializer0 = (JsonDeserializer<Boolean>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, jsonDeserializer0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Object object0 = stdKeyDeserializer_DelegatingKD0.deserializeKey((String) null, defaultDeserializationContext_Impl0);
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        FromStringDeserializer<Boolean> fromStringDeserializer0 = (FromStringDeserializer<Boolean>) mock(FromStringDeserializer.class, new ViolatedAssumptionAnswer());
        Class<Calendar> class0 = Calendar.class;
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, fromStringDeserializer0);
        Class<?> class1 = stdKeyDeserializer_DelegatingKD0.getKeyClass();
        assertFalse(class1.isEnum());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<Short> class0 = Short.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        assertNotNull(stdKeyDeserializer0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Class<Short> class0 = Short.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Object object0 = stdKeyDeserializer0.deserializeKey("3", (DeserializationContext) null);
        assertEquals((short) 3, object0);
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Class<Short> class0 = Short.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Object object0 = stdKeyDeserializer0.deserializeKey("3", (DeserializationContext) null);
        assertNotNull(object0);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Class<Long> class0 = Long.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        // Undeclared exception!
        try {
            stdKeyDeserializer0.deserializeKey("_", (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Class<Double> class0 = Double.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        try {
            stdKeyDeserializer0._parse("", (DeserializationContext) null);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Class<Locale> class0 = Locale.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        Class<?> class1 = stdKeyDeserializer_StringKD0.getKeyClass();
        assertNotNull(class1);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        Class<Locale> class0 = Locale.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        Class<?> class1 = stdKeyDeserializer_StringKD0.getKeyClass();
        assertEquals("class java.util.Locale", class1.toString());
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        Class<Object> class0 = Object.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Object object0 = stdKeyDeserializer0.deserializeKey("ksmN58hcP(D+g@", (DeserializationContext) null);
        assertEquals("ksmN58hcP(D+g@", object0);
    }

    @Test(timeout = 4000)
    public void test0710() throws Throwable {
        StdKeyDeserializer.EnumKD stdKeyDeserializer_EnumKD0 = null;
        try {
            stdKeyDeserializer_EnumKD0 = new StdKeyDeserializer.EnumKD((EnumResolver) null, (AnnotatedMethod) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD", e);
        }
    }

    @Test(timeout = 4000)
    public void test0811() throws Throwable {
        StdKeyDeserializer.StringCtorKeyDeserializer stdKeyDeserializer_StringCtorKeyDeserializer0 = null;
        try {
            stdKeyDeserializer_StringCtorKeyDeserializer0 = new StdKeyDeserializer.StringCtorKeyDeserializer((Constructor<?>) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        StdKeyDeserializer.StringFactoryKeyDeserializer stdKeyDeserializer_StringFactoryKeyDeserializer0 = null;
        try {
            stdKeyDeserializer_StringFactoryKeyDeserializer0 = new StdKeyDeserializer.StringFactoryKeyDeserializer((Method) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        Class<String> class0 = String.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = (StdKeyDeserializer.StringKD) StdKeyDeserializer.forType(class0);
        try {
            stdKeyDeserializer_StringKD0._parse("ksN58hcP(D+@", (DeserializationContext) null);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Internal error: unknown key type class java.lang.String
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        Class<UUID> class0 = UUID.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        UUID uUID0 = (UUID) stdKeyDeserializer0._parse("PvTdM", (DeserializationContext) null);
        assertEquals(16793600L, uUID0.getMostSignificantBits());
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        Class<Integer> class0 = Integer.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        try {
            stdKeyDeserializer0._parse("", (DeserializationContext) null);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
            //
            // For input string: \"\"
            //
            verifyException("java.lang.NumberFormatException", e);
        }
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        Class<Date> class0 = Date.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        // Undeclared exception!
        try {
            stdKeyDeserializer0.deserializeKey("$8v=/zf`gx6]", (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        Class<Calendar> class0 = Calendar.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        try {
            stdKeyDeserializer0._parse("", (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        Class<Boolean> class0 = Boolean.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Object object0 = stdKeyDeserializer0.deserializeKey("false", (DeserializationContext) null);
        assertEquals(false, object0);
    }

    @Test(timeout = 4000)
    public void test1519() throws Throwable {
        Class<Boolean> class0 = Boolean.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Object object0 = stdKeyDeserializer0.deserializeKey("false", (DeserializationContext) null);
        assertNotNull(object0);
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        Class<Byte> class0 = Byte.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        assertNotNull(stdKeyDeserializer0);
    }

    @Test(timeout = 4000)
    public void test1621() throws Throwable {
        Class<Byte> class0 = Byte.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Object object0 = stdKeyDeserializer0.deserializeKey("9", (DeserializationContext) null);
        assertNotNull(object0);
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        Class<Byte> class0 = Byte.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Object object0 = stdKeyDeserializer0.deserializeKey("9", (DeserializationContext) null);
        assertEquals((byte) 9, object0);
    }

    @Test(timeout = 4000)
    public void test1723() throws Throwable {
        Class<Character> class0 = Character.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Object object0 = stdKeyDeserializer0._parse("v", (DeserializationContext) null);
        assertEquals('v', object0);
    }

    @Test(timeout = 4000)
    public void test1824() throws Throwable {
        Class<Float> class0 = Float.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        try {
            stdKeyDeserializer0._parse("", (DeserializationContext) null);
            fail("Expecting exception: NumberFormatException");
        } catch (NumberFormatException e) {
        }
    }

    @Test(timeout = 4000)
    public void test1925() throws Throwable {
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        assertNull(stdKeyDeserializer0);
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        Class<URI> class0 = URI.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        URI uRI0 = (URI) stdKeyDeserializer0.deserializeKey("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", (DeserializationContext) null);
        assertEquals("com.fasterxml.jackson.databind.introspect.POJOPropertyBuilder$Linked", uRI0.getRawPath());
    }

    @Test(timeout = 4000)
    public void test2127() throws Throwable {
        Class<URL> class0 = URL.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        try {
            stdKeyDeserializer0._parse("ksmN58hcP(D+g@", (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test2228() throws Throwable {
        Class<Locale> class0 = Locale.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Locale locale0 = (Locale) stdKeyDeserializer0.deserializeKey("o", (DeserializationContext) null);
        assertEquals("", locale0.getCountry());
    }

    @Test(timeout = 4000)
    public void test2329() throws Throwable {
        Class<Currency> class0 = Currency.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Object object0 = stdKeyDeserializer0.deserializeKey((String) null, (DeserializationContext) null);
        assertNull(object0);
    }

    @Test(timeout = 4000)
    public void test2430() throws Throwable {
        Class<URL> class0 = URL.class;
        FromStringDeserializer<ObjectIdResolver> fromStringDeserializer0 = (FromStringDeserializer<ObjectIdResolver>) mock(FromStringDeserializer.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(fromStringDeserializer0)._deserialize(anyString(), any(com.fasterxml.jackson.databind.DeserializationContext.class));
        StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer(16, class0, fromStringDeserializer0);
        // Undeclared exception!
        try {
            stdKeyDeserializer0.deserializeKey("9", (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test2531() throws Throwable {
        Class<Float> class0 = Float.class;
        FromStringDeserializer<Float> fromStringDeserializer0 = (FromStringDeserializer<Float>) mock(FromStringDeserializer.class, new ViolatedAssumptionAnswer());
        StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer(15, class0, fromStringDeserializer0);
        // Undeclared exception!
        try {
            stdKeyDeserializer0.deserializeKey("overflow, value can not be represented as 16-bit value", (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test2632() throws Throwable {
        Class<Boolean> class0 = Boolean.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        Object object0 = stdKeyDeserializer0._parse("true", (DeserializationContext) null);
        assertEquals(true, object0);
    }

    @Test(timeout = 4000)
    public void test2733() throws Throwable {
        Class<Boolean> class0 = Boolean.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        // Undeclared exception!
        try {
            stdKeyDeserializer0.deserializeKey("Short", (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test2834() throws Throwable {
        Class<Character> class0 = Character.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        try {
            stdKeyDeserializer0._parse("", (DeserializationContext) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer", e);
        }
    }

    @Test(timeout = 4000)
    public void test2935() throws Throwable {
        Class<Calendar> class0 = Calendar.class;
        Boolean boolean0 = new Boolean("SD.i|cvXY_8");
        JsonDeserializer<Boolean> jsonDeserializer0 = (JsonDeserializer<Boolean>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        doReturn(boolean0).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class), any(com.fasterxml.jackson.databind.DeserializationContext.class));
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, jsonDeserializer0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        Object object0 = stdKeyDeserializer_DelegatingKD0.deserializeKey("n7{>J#A%Cur/SO{A=", defaultDeserializationContext_Impl0);
        assertEquals(false, object0);
    }

    @Test(timeout = 4000)
    public void test3036() throws Throwable {
        Class<Calendar> class0 = Calendar.class;
        JsonDeserializer<Boolean> jsonDeserializer0 = (JsonDeserializer<Boolean>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        doReturn((Boolean) null).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class), any(com.fasterxml.jackson.databind.DeserializationContext.class));
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, jsonDeserializer0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        // Undeclared exception!
        try {
            stdKeyDeserializer_DelegatingKD0.deserializeKey("n7{>J#A%Cur/SO{A=", defaultDeserializationContext_Impl0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("com.fasterxml.jackson.databind.DeserializationContext", e);
        }
    }
}
