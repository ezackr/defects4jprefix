/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 13:54:45 GMT 2024
 */
package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.ClassUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class ClassUtils_ESTest extends ClassUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("java.util.prefs.PreferencesFactory[]", true);
        boolean boolean0 = ClassUtils.isAssignable(class0, class0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Class<Float> class0 = Float.TYPE;
        Class<Short> class1 = Short.class;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String string0 = ClassUtils.getPackageCanonicalName("[");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        try {
            ClassUtils.getClass("$");
            fail("Expecting exception: ClassNotFoundException");
        } catch (ClassNotFoundException e) {
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("java.util.prefs.PreferencesFactory[]", true);
        String string0 = ClassUtils.getShortCanonicalName(class0);
        assertEquals("PreferencesFactory[]", string0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        ClassUtils classUtils0 = new ClassUtils();
        String string0 = ClassUtils.getPackageName((Object) classUtils0, "$");
        assertEquals("org.apache.commons.lang3", string0);
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        try {
            ClassUtils.getClass(classLoader0, ".");
            fail("Expecting exception: ClassNotFoundException");
        } catch (ClassNotFoundException e) {
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        String string0 = ClassUtils.getShortClassName((Object) "", "");
        assertEquals("String", string0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        String string0 = ClassUtils.getShortClassName((Object) null, "$");
        assertEquals("$", string0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        String string0 = ClassUtils.getShortClassName((Class<?>) null);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        String string0 = ClassUtils.getShortCanonicalName((String) null);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        String string0 = ClassUtils.getShortClassName("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("java.util.prefs.PreferencesFactory[]", true);
        String string0 = ClassUtils.getShortClassName(class0);
        assertEquals("PreferencesFactory[]", string0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        String string0 = ClassUtils.getShortClassName("[String");
        assertEquals("String[]", string0);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        String string0 = ClassUtils.getShortClassName("[L");
        assertEquals("L[]", string0);
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        String string0 = ClassUtils.getShortClassName("J");
        assertEquals("long", string0);
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        String string0 = ClassUtils.getShortClassName("vlkYEEfI]*c@.$$");
        assertEquals("..", string0);
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        String string0 = ClassUtils.getPackageName((Object) null, "m0");
        assertEquals("m0", string0);
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        String string0 = ClassUtils.getPackageName((Class<?>) null);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        String string0 = ClassUtils.getPackageName((String) null);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        String string0 = ClassUtils.getPackageName("");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("java.util.prefs.PreferencesFactory[]", true);
        String string0 = ClassUtils.getPackageName(class0);
        assertEquals("java.util.prefs", string0);
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        String string0 = ClassUtils.getPackageName("LINUX");
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test2424() throws Throwable {
        Class<Short> class0 = Short.class;
        List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
        assertNotNull(list0);
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        Class<Short> class0 = Short.class;
        List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
        assertEquals(2, list0.size());
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
        assertNull(list0);
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        Class<Short> class0 = Short.class;
        List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
        List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
        assertEquals(2, list1.size());
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        Class<Short> class0 = Short.class;
        List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
        List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
        assertNotNull(list1);
    }

    @Test(timeout = 4000)
    public void test2729() throws Throwable {
        List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
        assertNull(list0);
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
        assertNull(list0);
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("$");
        List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
        List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
        assertNotNull(list1);
    }

    @Test(timeout = 4000)
    public void test2932() throws Throwable {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add("$");
        List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
        List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
        assertFalse(list1.isEmpty());
    }

    @Test(timeout = 4000)
    public void test3033() throws Throwable {
        List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
        assertNull(list0);
    }

    @Test(timeout = 4000)
    public void test3134() throws Throwable {
        Class<Character>[] classArray0 = (Class<Character>[]) Array.newInstance(Class.class, 8);
        Class<Object>[] classArray1 = (Class<Object>[]) Array.newInstance(Class.class, 4);
        boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3235() throws Throwable {
        Class<ClassUtils>[] classArray0 = (Class<ClassUtils>[]) Array.newInstance(Class.class, 0);
        boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3336() throws Throwable {
        Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 9);
        boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, false);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3437() throws Throwable {
        Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 1);
        Class<Double> class0 = Double.class;
        classArray0[0] = class0;
        boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3538() throws Throwable {
        Class<Long> class0 = Long.class;
        boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, false);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3639() throws Throwable {
        Class<Short> class0 = Short.TYPE;
        boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0, true);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test3740() throws Throwable {
        Class<Long> class0 = Long.TYPE;
        Class<Float> class1 = Float.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3841() throws Throwable {
        Class<Byte> class0 = Byte.TYPE;
        Class<Double> class1 = Double.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test3942() throws Throwable {
        Class<Character> class0 = Character.class;
        Class<Short> class1 = Short.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4043() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        Class<ClassUtils> class1 = ClassUtils.class;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4144() throws Throwable {
        Class<Short> class0 = Short.TYPE;
        Class<ClassUtils> class1 = ClassUtils.class;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4245() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        Class<Float> class1 = Float.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test4346() throws Throwable {
        Class<Long> class0 = Long.TYPE;
        Class<Integer> class1 = Integer.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test4447() throws Throwable {
        Class<Double> class0 = Double.TYPE;
        Class<Integer> class1 = Integer.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test4548() throws Throwable {
        Class<Character> class0 = Character.TYPE;
        Class<Integer> class1 = Integer.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4649() throws Throwable {
        Class<Long> class0 = Long.TYPE;
        Class<Double> class1 = Double.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test4750() throws Throwable {
        Class<Long> class0 = Long.class;
        Class<Integer> class1 = Integer.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4851() throws Throwable {
        Class<Short> class0 = Short.TYPE;
        Class<Boolean> class1 = Boolean.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test4952() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        Class<Double> class1 = Double.class;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5053() throws Throwable {
        Class<Float> class0 = Float.TYPE;
        Class<Integer> class1 = Integer.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5154() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        Class<Character> class1 = Character.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5255() throws Throwable {
        Class<Long> class0 = Long.TYPE;
        Class<Character> class1 = Character.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, false);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5356() throws Throwable {
        Class<Character> class0 = Character.TYPE;
        Class<Double> class1 = Double.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5457() throws Throwable {
        Class<Character> class0 = Character.TYPE;
        Class<Float> class1 = Float.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5558() throws Throwable {
        Class<Character> class0 = Character.TYPE;
        Class<Short> class1 = Short.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5659() throws Throwable {
        Class<Short> class0 = Short.TYPE;
        Class<Integer> class1 = Integer.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5760() throws Throwable {
        Class<Long> class0 = Long.TYPE;
        Class<Short> class1 = Short.class;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5861() throws Throwable {
        Class<Short> class0 = Short.TYPE;
        Class<Double> class1 = Double.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test5962() throws Throwable {
        Class<Character> class0 = Character.TYPE;
        Class<Short> class1 = Short.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test6063() throws Throwable {
        Class<Short> class0 = Short.TYPE;
        Class<Byte> class1 = Byte.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test6164() throws Throwable {
        Class<Byte> class0 = Byte.TYPE;
        Class<Integer> class1 = Integer.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test6265() throws Throwable {
        Class<Byte> class0 = Byte.TYPE;
        Class<Long> class1 = Long.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test6366() throws Throwable {
        Class<Byte> class0 = Byte.TYPE;
        Class<Float> class1 = Float.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test6467() throws Throwable {
        Class<Byte> class0 = Byte.TYPE;
        Class<Character> class1 = Character.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test6568() throws Throwable {
        Class<ClassUtils>[] classArray0 = (Class<ClassUtils>[]) Array.newInstance(Class.class, 3);
        Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
        assertEquals(3, classArray1.length);
    }

    @Test(timeout = 4000)
    public void test6669() throws Throwable {
        Class<Byte> class0 = Byte.class;
        Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
        assertEquals("class java.lang.Byte", class1.toString());
    }

    @Test(timeout = 4000)
    public void test6770() throws Throwable {
        Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
        assertNull(classArray0);
    }

    @Test(timeout = 4000)
    public void test6871() throws Throwable {
        Class<Boolean>[] classArray0 = (Class<Boolean>[]) Array.newInstance(Class.class, 0);
        Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
        assertEquals(0, classArray1.length);
    }

    @Test(timeout = 4000)
    public void test6972() throws Throwable {
        Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 9);
        Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
        assertEquals(9, classArray1.length);
    }

    @Test(timeout = 4000)
    public void test7073() throws Throwable {
        Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
        assertNull(classArray0);
    }

    @Test(timeout = 4000)
    public void test7174() throws Throwable {
        Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 0);
        Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
        assertEquals(0, classArray1.length);
    }

    @Test(timeout = 4000)
    public void test7275() throws Throwable {
        Class<Object> class0 = Object.class;
        boolean boolean0 = ClassUtils.isInnerClass(class0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test7376() throws Throwable {
        boolean boolean0 = ClassUtils.isInnerClass((Class<?>) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test7477() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("org.apache.commons.lang3.builder.ToStringStyle$MultiLineToStringStyle", true);
        boolean boolean0 = ClassUtils.isInnerClass(class0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test7578() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("char", true);
        assertFalse(class0.isAnnotation());
    }

    @Test(timeout = 4000)
    public void test7679() throws Throwable {
        // Undeclared exception!
        try {
            ClassUtils.getClass((String) null, true);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // className must not be null.
            //
            verifyException("org.apache.commons.lang3.ClassUtils", e);
        }
    }

    @Test(timeout = 4000)
    public void test7780() throws Throwable {
        Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
        assertNull(classArray0);
    }

    @Test(timeout = 4000)
    public void test7881() throws Throwable {
        Object[] objectArray0 = new Object[0];
        Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
        assertEquals(0, classArray0.length);
    }

    @Test(timeout = 4000)
    public void test7982() throws Throwable {
        Class<Boolean> class0 = Boolean.TYPE;
        Object[] objectArray0 = new Object[1];
        objectArray0[0] = (Object) class0;
        Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
        assertEquals(1, classArray0.length);
    }

    @Test(timeout = 4000)
    public void test8083() throws Throwable {
        Object object0 = new Object();
        String string0 = ClassUtils.getShortCanonicalName(object0, ".");
        assertEquals("Object", string0);
    }

    @Test(timeout = 4000)
    public void test8184() throws Throwable {
        String string0 = ClassUtils.getShortCanonicalName((Object) null, ".");
        assertEquals(".", string0);
    }

    @Test(timeout = 4000)
    public void test8285() throws Throwable {
        String string0 = ClassUtils.getShortCanonicalName((Class<?>) null);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test8386() throws Throwable {
        String string0 = ClassUtils.getPackageCanonicalName((Object) "ArrayandelementcLnotbot@benull", "ArrayandelementcLnotbot@benull");
        assertEquals("java.lang", string0);
    }

    @Test(timeout = 4000)
    public void test8487() throws Throwable {
        String string0 = ClassUtils.getPackageCanonicalName((Object) null, "$");
        assertEquals("$", string0);
    }

    @Test(timeout = 4000)
    public void test8588() throws Throwable {
        Class<Object> class0 = Object.class;
        String string0 = ClassUtils.getPackageCanonicalName(class0);
        assertEquals("java.lang", string0);
    }

    @Test(timeout = 4000)
    public void test8689() throws Throwable {
        String string0 = ClassUtils.getPackageCanonicalName((Class<?>) null);
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test8790() throws Throwable {
        String string0 = ClassUtils.getShortCanonicalName("[[[Ljava.util.prefs.PreferencesFactory;[]");
        assertEquals("PreferencesFactory;[][][][]", string0);
    }

    @Test(timeout = 4000)
    public void test8891() throws Throwable {
        // Undeclared exception!
        try {
            ClassUtils.getShortCanonicalName("[]");
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}
