/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 04:09:57 GMT 2023
 */
package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ObjectIdInfo_ESTest extends ObjectIdInfo_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("=y/|p", class0, class0);
        Class<? extends ObjectIdGenerator<?>> class1 = objectIdInfo0.getGeneratorType();
        assertNotNull(class1);
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("=y/|p", class0, class0);
        Class<? extends ObjectIdGenerator<?>> class1 = objectIdInfo0.getGeneratorType();
        assertFalse(objectIdInfo0.getAlwaysAsId());
    }

    @Test(timeout = 4000)
    public void test002() throws Throwable {
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("=y/|p", class0, class0);
        Class<? extends ObjectIdGenerator<?>> class1 = objectIdInfo0.getGeneratorType();
        assertEquals(9, class1.getModifiers());
    }

    @Test(timeout = 4000)
    public void test013() throws Throwable {
        PropertyName propertyName0 = PropertyName.NO_NAME;
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo(propertyName0, class0, class0);
        assertFalse(objectIdInfo0.getAlwaysAsId());
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo((PropertyName) null, class0, class0, (Class<? extends ObjectIdResolver>) null);
        String string0 = objectIdInfo0.toString();
        assertEquals("ObjectIdInfo: propName=null, scope=com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator, generatorType=com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator, alwaysAsId=false", string0);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Class<ObjectIdGenerators.UUIDGenerator> class0 = ObjectIdGenerators.UUIDGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("e#", class0, class0);
        Class<? extends ObjectIdResolver> class1 = objectIdInfo0.getResolverType();
        assertFalse(objectIdInfo0.getAlwaysAsId());
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        Class<ObjectIdGenerators.UUIDGenerator> class0 = ObjectIdGenerators.UUIDGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("e#", class0, class0);
        Class<? extends ObjectIdResolver> class1 = objectIdInfo0.getResolverType();
        assertNotNull(class1);
    }

    @Test(timeout = 4000)
    public void test037() throws Throwable {
        Class<ObjectIdGenerators.UUIDGenerator> class0 = ObjectIdGenerators.UUIDGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("e#", class0, class0);
        Class<? extends ObjectIdResolver> class1 = objectIdInfo0.getResolverType();
        assertEquals(1, class1.getModifiers());
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        Class<Integer> class0 = Integer.class;
        Class<ObjectIdGenerators.IntSequenceGenerator> class1 = ObjectIdGenerators.IntSequenceGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo(", scope=", class0, class1);
        boolean boolean0 = objectIdInfo0.getAlwaysAsId();
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("&`", class0, class0);
        PropertyName propertyName0 = objectIdInfo0.getPropertyName();
        assertFalse(objectIdInfo0.getAlwaysAsId());
    }

    @Test(timeout = 4000)
    public void test0510() throws Throwable {
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("&`", class0, class0);
        PropertyName propertyName0 = objectIdInfo0.getPropertyName();
        assertNotNull(propertyName0);
    }

    @Test(timeout = 4000)
    public void test0611() throws Throwable {
        Class<Object> class0 = Object.class;
        Class<ObjectIdGenerators.StringIdGenerator> class1 = ObjectIdGenerators.StringIdGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("c-i4A]Q", class0, class1);
        Class<?> class2 = objectIdInfo0.getScope();
        assertEquals("class java.lang.Object", class2.toString());
    }

    @Test(timeout = 4000)
    public void test0612() throws Throwable {
        Class<Object> class0 = Object.class;
        Class<ObjectIdGenerators.StringIdGenerator> class1 = ObjectIdGenerators.StringIdGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("c-i4A]Q", class0, class1);
        Class<?> class2 = objectIdInfo0.getScope();
        assertNotNull(class2);
    }

    @Test(timeout = 4000)
    public void test0613() throws Throwable {
        Class<Object> class0 = Object.class;
        Class<ObjectIdGenerators.StringIdGenerator> class1 = ObjectIdGenerators.StringIdGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("c-i4A]Q", class0, class1);
        Class<?> class2 = objectIdInfo0.getScope();
        assertFalse(objectIdInfo0.getAlwaysAsId());
    }

    @Test(timeout = 4000)
    public void test0714() throws Throwable {
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("YaOwYg3'qp~Rjb>g8f", class0, class0);
        ObjectIdInfo objectIdInfo1 = objectIdInfo0.withAlwaysAsId(true);
        assertFalse(objectIdInfo0.getAlwaysAsId());
    }

    @Test(timeout = 4000)
    public void test0715() throws Throwable {
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("YaOwYg3'qp~Rjb>g8f", class0, class0);
        ObjectIdInfo objectIdInfo1 = objectIdInfo0.withAlwaysAsId(true);
        assertTrue(objectIdInfo1.getAlwaysAsId());
    }

    @Test(timeout = 4000)
    public void test0816() throws Throwable {
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("zL", class0, class0);
        ObjectIdInfo objectIdInfo1 = objectIdInfo0.withAlwaysAsId(false);
        assertSame(objectIdInfo1, objectIdInfo0);
    }

    @Test(timeout = 4000)
    public void test0917() throws Throwable {
        Class<ObjectIdGenerators.StringIdGenerator> class0 = ObjectIdGenerators.StringIdGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap", (Class<?>) null, class0);
        String string0 = objectIdInfo0.toString();
        assertEquals("ObjectIdInfo: propName=com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap, scope=null, generatorType=com.fasterxml.jackson.annotation.ObjectIdGenerators$StringIdGenerator, alwaysAsId=false", string0);
    }

    @Test(timeout = 4000)
    public void test1018() throws Throwable {
        Class<ObjectIdGenerators.IntSequenceGenerator> class0 = ObjectIdGenerators.IntSequenceGenerator.class;
        ObjectIdInfo objectIdInfo0 = new ObjectIdInfo("]HL]6td", class0, (Class<? extends ObjectIdGenerator<?>>) null);
        String string0 = objectIdInfo0.toString();
        assertEquals("ObjectIdInfo: propName=]HL]6td, scope=com.fasterxml.jackson.annotation.ObjectIdGenerators$IntSequenceGenerator, generatorType=null, alwaysAsId=false", string0);
    }
}
