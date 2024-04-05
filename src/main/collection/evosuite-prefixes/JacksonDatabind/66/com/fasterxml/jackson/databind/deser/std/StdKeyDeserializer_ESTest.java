/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 22:09:30 GMT 2023
 */
package com.fasterxml.jackson.databind.deser.std;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.introspect.POJOPropertiesCollector;
import com.fasterxml.jackson.databind.module.SimpleValueInstantiators;
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
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class StdKeyDeserializer_ESTest extends StdKeyDeserializer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<URL> class0 = URL.class;
        StdKeyDeserializer.StringKD.forType(class0);
        Class<String> class1 = String.class;
        FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "\u2029");
        JsonDeserializer<ObjectIdGenerators.StringIdGenerator> jsonDeserializer0 = (JsonDeserializer<ObjectIdGenerators.StringIdGenerator>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class), any(com.fasterxml.jackson.databind.DeserializationContext.class));
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class1, jsonDeserializer0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        stdKeyDeserializer_DelegatingKD0.deserializeKey("unable to parse key as locale", defaultDeserializationContext_Impl0);
        String string0 = "pC?-HY[qvw~v3[";
        DeserializationContext deserializationContext0 = null;
        stdKeyDeserializer_DelegatingKD0.deserializeKey(string0, deserializationContext0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<Character> class0 = Character.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0._parse("", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<Object> class0 = Object.class;
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, (JsonDeserializer<?>) null);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Class<Character> class0 = Character.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        stdKeyDeserializer_StringKD0._parse("", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        FromStringDeserializer<Boolean> fromStringDeserializer0 = (FromStringDeserializer<Boolean>) mock(FromStringDeserializer.class, new ViolatedAssumptionAnswer());
        Class<Calendar> class0 = Calendar.class;
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, fromStringDeserializer0);
        stdKeyDeserializer_DelegatingKD0.getKeyClass();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Class<Double> class0 = Double.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0._parse("", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Class<URI> class0 = URI.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("!PZb4", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Class<Calendar> class0 = Calendar.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("not a valid representation: %s", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Class<Currency> class0 = Currency.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0._parseDouble("idrqM@9`JJr");
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Class<Object> class0 = Object.class;
        StdKeyDeserializer.forType(class0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Class<Long> class0 = Long.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0._parse("", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Class<Character> class0 = Character.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("XeJ", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Class<Byte> class0 = Byte.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("n==C]?{nz<m8PZ", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Class<Integer> class0 = Integer.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("m", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Class<Short> class0 = Short.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Class<UUID> class0 = UUID.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0._parse("3D'uM^A", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Class<String> class0 = String.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey((String) null, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Class<Locale> class0 = Locale.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0._parse("vf?Qd*`9`KeVb_@7", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        Class<Byte> class0 = Byte.TYPE;
        StdKeyDeserializer.forType(class0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        Class<Byte> class0 = Byte.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey((String) null, (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2120() throws Throwable {
        Class<URL> class0 = URL.class;
        StdKeyDeserializer.StringKD.forType(class0);
        Class<String> class1 = String.class;
        JsonDeserializer<ObjectIdGenerators.StringIdGenerator> jsonDeserializer0 = (JsonDeserializer<ObjectIdGenerators.StringIdGenerator>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class1, jsonDeserializer0);
        stdKeyDeserializer_DelegatingKD0.deserializeKey("pC?-HY[qvw~v3[", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2221() throws Throwable {
        Class<Date> class0 = Date.class;
        StdKeyDeserializer.forType(class0);
        Random.setNextRandom(8);
    }

    @Test(timeout = 4000)
    public void test2322() throws Throwable {
        Class<Currency> class0 = Currency.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("n==C]?{nz<m8PZ", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2423() throws Throwable {
        Class<Date> class0 = Date.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("<", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2524() throws Throwable {
        Class<Calendar> class0 = Calendar.class;
        FromStringDeserializer<Double> fromStringDeserializer0 = (FromStringDeserializer<Double>) mock(FromStringDeserializer.class, new ViolatedAssumptionAnswer());
        StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer((-2332), class0, fromStringDeserializer0);
        Boolean boolean0 = new Boolean("SD.i|cvXY_8");
        JsonDeserializer<Boolean> jsonDeserializer0 = (JsonDeserializer<Boolean>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        doReturn(boolean0).when(jsonDeserializer0).deserialize(any(com.fasterxml.jackson.core.JsonParser.class), any(com.fasterxml.jackson.databind.DeserializationContext.class));
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD0 = new StdKeyDeserializer.DelegatingKD(class0, jsonDeserializer0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        ValueInstantiators.Base valueInstantiators_Base0 = new ValueInstantiators.Base();
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withValueInstantiators(valueInstantiators_Base0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(deserializerFactory0);
        DefaultDeserializationContext defaultDeserializationContext0 = defaultDeserializationContext_Impl0.copy();
        stdKeyDeserializer_DelegatingKD0.deserializeKey("n7{>J#A%Cur/SO{A=", defaultDeserializationContext0);
        JsonDeserializer<Integer> jsonDeserializer1 = (JsonDeserializer<Integer>) mock(JsonDeserializer.class, new ViolatedAssumptionAnswer());
        StdKeyDeserializer.DelegatingKD stdKeyDeserializer_DelegatingKD1 = new StdKeyDeserializer.DelegatingKD(class0, jsonDeserializer1);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl1 = new DefaultDeserializationContext.Impl(deserializerFactory0);
        stdKeyDeserializer_DelegatingKD1.deserializeKey((String) null, defaultDeserializationContext_Impl1);
        stdKeyDeserializer0._parse((String) null, (DeserializationContext) null);
        StdKeyDeserializer.forType(class0);
        int int0 = 6;
        Integer integer0 = new Integer(int0);
        String string0 = "";
        stdKeyDeserializer0._parse(string0, defaultDeserializationContext_Impl1);
    }

    @Test(timeout = 4000)
    public void test2625() throws Throwable {
        Class<Locale> class0 = Locale.class;
        StdKeyDeserializer.StringKD stdKeyDeserializer_StringKD0 = StdKeyDeserializer.StringKD.forType(class0);
        stdKeyDeserializer_StringKD0.getKeyClass();
    }

    @Test(timeout = 4000)
    public void test2726() throws Throwable {
        Class<Float> class0 = Float.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0._parse("5", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2827() throws Throwable {
        Class<URL> class0 = URL.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("5", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test2928() throws Throwable {
        Class<URL> class0 = URL.class;
        StdKeyDeserializer.StringKD.forType(class0);
        POJOPropertiesCollector pOJOPropertiesCollector0 = mock(POJOPropertiesCollector.class, new ViolatedAssumptionAnswer());
        doReturn((AnnotatedMethod) null).when(pOJOPropertiesCollector0).getAnySetterMethod();
        doReturn((AnnotatedClass) null).when(pOJOPropertiesCollector0).getClassDef();
        doReturn((MapperConfig) null).when(pOJOPropertiesCollector0).getConfig();
        doReturn((ObjectIdInfo) null).when(pOJOPropertiesCollector0).getObjectIdInfo();
        doReturn((JavaType) null).when(pOJOPropertiesCollector0).getType();
        BasicBeanDescription basicBeanDescription0 = BasicBeanDescription.forDeserialization(pOJOPropertiesCollector0);
        basicBeanDescription0.findAnySetter();
        StdKeyDeserializer.EnumKD stdKeyDeserializer_EnumKD0 = new StdKeyDeserializer.EnumKD((EnumResolver) null, (AnnotatedMethod) null);
        String string0 = "Uw2]";
    }

    @Test(timeout = 4000)
    public void test3029() throws Throwable {
        Class<Locale> class0 = Locale.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("=Bp", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test3130() throws Throwable {
        Class<Long> class0 = Long.class;
        FromStringDeserializer<Currency> fromStringDeserializer0 = (FromStringDeserializer<Currency>) mock(FromStringDeserializer.class, new ViolatedAssumptionAnswer());
        StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer(14, class0, fromStringDeserializer0);
        DeserializationContext deserializationContext0 = null;
        Object object0 = new Object();
        Class<Date> class1 = Date.class;
        StdKeyDeserializer.StringKD.forType(class1);
        StdKeyDeserializer.forType(class1);
        StdKeyDeserializer.StringFactoryKeyDeserializer stdKeyDeserializer_StringFactoryKeyDeserializer0 = new StdKeyDeserializer.StringFactoryKeyDeserializer((Method) null);
        String string0 = "";
        stdKeyDeserializer_StringFactoryKeyDeserializer0._parse(string0, deserializationContext0);
    }

    @Test(timeout = 4000)
    public void test3231() throws Throwable {
        Class<Boolean> class0 = Boolean.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("Z&z.fT,?z!b=?5b*e", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test3332() throws Throwable {
        Class<Integer> class0 = Integer.class;
        FromStringDeserializer<Boolean> fromStringDeserializer0 = (FromStringDeserializer<Boolean>) mock(FromStringDeserializer.class, new ViolatedAssumptionAnswer());
        StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer(11, class0, fromStringDeserializer0);
        Random.setNextRandom(3348);
        StdKeyDeserializer.StringCtorKeyDeserializer stdKeyDeserializer_StringCtorKeyDeserializer0 = new StdKeyDeserializer.StringCtorKeyDeserializer((Constructor<?>) null);
        String string0 = "dH";
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        beanDeserializerFactory0.withConfig(deserializerFactoryConfig0);
    }

    @Test(timeout = 4000)
    public void test3433() throws Throwable {
        Class<Object> class0 = Object.class;
        FromStringDeserializer<ObjectIdResolver> fromStringDeserializer0 = (FromStringDeserializer<ObjectIdResolver>) mock(FromStringDeserializer.class, new ViolatedAssumptionAnswer());
        doReturn((Object) null).when(fromStringDeserializer0)._deserialize(anyString(), any(com.fasterxml.jackson.databind.DeserializationContext.class));
        StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer(9, class0, fromStringDeserializer0);
        stdKeyDeserializer0.deserializeKey("not a valid representation: %s", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test3534() throws Throwable {
        Class<Short> class0 = Short.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("6", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test3635() throws Throwable {
        Class<Character> class0 = Character.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0._parse("6", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test3736() throws Throwable {
        Class<Byte> class0 = Byte.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("6", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test3837() throws Throwable {
        Class<Short> class0 = Short.class;
        StdKeyDeserializer stdKeyDeserializer0 = new StdKeyDeserializer(15, class0);
        stdKeyDeserializer0.deserializeKey("Unrecognized token '", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test3938() throws Throwable {
        Class<Boolean> class0 = Boolean.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        BeanDeserializerFactory beanDeserializerFactory0 = BeanDeserializerFactory.instance;
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(beanDeserializerFactory0);
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withConfig((DeserializerFactoryConfig) null);
        DefaultDeserializationContext defaultDeserializationContext0 = defaultDeserializationContext_Impl0.with(deserializerFactory0);
        stdKeyDeserializer0._parse("true", defaultDeserializationContext0);
        stdKeyDeserializer0.deserializeKey("\b]4b", (DeserializationContext) null);
    }

    @Test(timeout = 4000)
    public void test4039() throws Throwable {
        FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
        Class<Byte> class0 = Byte.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        DeserializerFactoryConfig deserializerFactoryConfig0 = new DeserializerFactoryConfig();
        BeanDeserializerFactory beanDeserializerFactory0 = new BeanDeserializerFactory(deserializerFactoryConfig0);
        Deserializers.Base deserializers_Base0 = new Deserializers.Base();
        DeserializerFactory deserializerFactory0 = beanDeserializerFactory0.withAdditionalDeserializers(deserializers_Base0);
        DefaultDeserializationContext.Impl defaultDeserializationContext_Impl0 = new DefaultDeserializationContext.Impl(deserializerFactory0);
        stdKeyDeserializer0.deserializeKey("2143", defaultDeserializationContext_Impl0);
        String string0 = "3";
    }

    @Test(timeout = 4000)
    public void test4140() throws Throwable {
        FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
        Class<Boolean> class0 = Boolean.class;
        StdKeyDeserializer stdKeyDeserializer0 = StdKeyDeserializer.forType(class0);
        stdKeyDeserializer0.deserializeKey("false", (DeserializationContext) null);
        stdKeyDeserializer0._parse("\b]4b", (DeserializationContext) null);
    }
}
