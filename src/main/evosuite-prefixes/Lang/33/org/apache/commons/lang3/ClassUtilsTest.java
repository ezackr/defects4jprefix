/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 01:59:40 GMT 2023
 */
package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.lang3.ClassUtils;
import org.junit.runner.RunWith;

public class ClassUtilsTest {

    @Test(timeout = 4000)
    public void test0000() throws Throwable {
        ClassUtils.getClass("Object[]", true);
    }

    @Test(timeout = 4000)
    public void test0011() throws Throwable {
        String string0 = ClassUtils.getShortClassName("[:*|3>z24");
    }

    @Test(timeout = 4000)
    public void test0022() throws Throwable {
        Class<Integer> class0 = Integer.class;
        List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
        List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
        List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
    }

    @Test(timeout = 4000)
    public void test0023() throws Throwable {
        Class<Integer> class0 = Integer.class;
        List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
        List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
        List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
        list2.equals((Object) list0);
    }

    @Test(timeout = 4000)
    public void test0024() throws Throwable {
        Class<Integer> class0 = Integer.class;
        List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
        List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
        List<Class<?>> list2 = ClassUtils.convertClassNamesToClasses(list1);
        list2.size();
    }

    @Test(timeout = 4000)
    public void test0035() throws Throwable {
        Class<ClassUtils> class0 = ClassUtils.class;
        Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
    }

    @Test(timeout = 4000)
    public void test0046() throws Throwable {
        Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 9);
        Class<String> class0 = String.class;
        classArray0[0] = class0;
        classArray0[1] = classArray0[0];
        classArray0[2] = classArray0[0];
        classArray0[3] = classArray0[1];
        classArray0[4] = classArray0[0];
        classArray0[5] = class0;
        classArray0[6] = class0;
        classArray0[7] = classArray0[4];
        classArray0[8] = classArray0[1];
        boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0);
    }

    @Test(timeout = 4000)
    public void test0057() throws Throwable {
        String string0 = ClassUtils.getShortClassName((Object) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test0068() throws Throwable {
        String string0 = ClassUtils.getShortClassName((Object) null, "");
    }

    @Test(timeout = 4000)
    public void test0079() throws Throwable {
        String string0 = ClassUtils.getShortCanonicalName((Object) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test00810() throws Throwable {
        String string0 = ClassUtils.getShortCanonicalName((Object) null, "");
    }

    @Test(timeout = 4000)
    public void test00911() throws Throwable {
        String string0 = ClassUtils.getPackageName((Object) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test01012() throws Throwable {
        String string0 = ClassUtils.getPackageName((Object) null, "");
    }

    @Test(timeout = 4000)
    public void test01113() throws Throwable {
        Class<Boolean> class0 = Boolean.class;
        String string0 = ClassUtils.getPackageName(class0);
    }

    @Test(timeout = 4000)
    public void test01214() throws Throwable {
        String string0 = ClassUtils.getPackageCanonicalName("'; the SystemUtils property value will default to null.");
    }

    @Test(timeout = 4000)
    public void test01315() throws Throwable {
        Class<Object> class0 = Object.class;
        String string0 = ClassUtils.getPackageCanonicalName(class0);
    }

    @Test(timeout = 4000)
    public void test01416() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("byte", true);
        class0.isInterface();
    }

    @Test(timeout = 4000)
    public void test01517() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("[D", false);
        class0.isPrimitive();
    }

    @Test(timeout = 4000)
    public void test01618() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("java.text.Normalizer$Form");
        class0.isInterface();
    }

    @Test(timeout = 4000)
    public void test01719() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        Class<?> class0 = ClassUtils.getClass(classLoader0, "java.util.prefs.PreferencesFactory", true);
        class0.isInterface();
    }

    @Test(timeout = 4000)
    public void test01820() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        Class<?> class0 = ClassUtils.getClass(classLoader0, "char");
        class0.isEnum();
    }

    @Test(timeout = 4000)
    public void test01921() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        Class<?> class0 = ClassUtils.getClass(classLoader0, "java.util.prefs.PreferencesFactory");
        class0.toString();
    }

    @Test(timeout = 4000)
    public void test02022() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        Class<?> class0 = ClassUtils.getClass(classLoader0, "java.text.Normalizer$Form");
        class0.isInterface();
    }

    @Test(timeout = 4000)
    public void test02123() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        Class<?> class0 = ClassUtils.getClass(classLoader0, "[D");
        class0.isSynthetic();
    }

    @Test(timeout = 4000)
    public void test02224() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("long");
        List<Class<?>> list0 = ClassUtils.getAllInterfaces(class0);
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test02325() throws Throwable {
        Class<Object> class0 = Object.class;
        List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
        List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
        list1.size();
    }

    @Test(timeout = 4000)
    public void test02426() throws Throwable {
        Object[] objectArray0 = new Object[6];
        ClassUtils.toClass(objectArray0);
    }

    @Test(timeout = 4000)
    public void test02527() throws Throwable {
        ClassUtils.getShortClassName("[");
    }

    @Test(timeout = 4000)
    public void test02628() throws Throwable {
        Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 5);
        Class<Object> class0 = Object.class;
        ClassUtils.getPublicMethod(class0, (String) null, classArray0);
    }

    @Test(timeout = 4000)
    public void test02729() throws Throwable {
        Class<Character>[] classArray0 = (Class<Character>[]) Array.newInstance(Class.class, 5);
        Class<ClassUtils> class0 = ClassUtils.class;
        ClassUtils.getPublicMethod(class0, "*6m?M%s)uy{", classArray0);
    }

    @Test(timeout = 4000)
    public void test02830() throws Throwable {
        ClassUtils.getPackageName("[[");
    }

    @Test(timeout = 4000)
    public void test02931() throws Throwable {
        ClassUtils.getPackageCanonicalName("[java.lang");
    }

    @Test(timeout = 4000)
    public void test03032() throws Throwable {
        ClassUtils.getClass((String) null);
    }

    @Test(timeout = 4000)
    public void test03133() throws Throwable {
        ClassUtils.getClass("The stripAccents(String) method is not supported until Java 1.6");
    }

    @Test(timeout = 4000)
    public void test03234() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        ClassUtils.getClass(classLoader0, (String) null, false);
    }

    @Test(timeout = 4000)
    public void test03335() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        ClassUtils.getClass(classLoader0, (String) null);
    }

    @Test(timeout = 4000)
    public void test03436() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        Class<?> class0 = ClassUtils.getClass(classLoader0, "long", true);
        class0.getModifiers();
    }

    @Test(timeout = 4000)
    public void test03537() throws Throwable {
        Class<?> class0 = ClassUtils.primitiveToWrapper((Class<?>) null);
    }

    @Test(timeout = 4000)
    public void test03638() throws Throwable {
        Class<Byte> class0 = Byte.TYPE;
        Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
        class1.getModifiers();
    }

    @Test(timeout = 4000)
    public void test03739() throws Throwable {
        Class<Byte> class0 = Byte.TYPE;
        Class<Integer> class1 = Integer.class;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
    }

    @Test(timeout = 4000)
    public void test03840() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class0, true);
    }

    @Test(timeout = 4000)
    public void test03941() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        Class<String> class1 = String.class;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, true);
    }

    @Test(timeout = 4000)
    public void test04042() throws Throwable {
        Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 5);
        Class<Double> class0 = Double.class;
        boolean boolean0 = ClassUtils.isAssignable(classArray0[1], class0, true);
    }

    @Test(timeout = 4000)
    public void test04143() throws Throwable {
        Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 2);
        Class<Integer> class0 = Integer.class;
        boolean boolean0 = ClassUtils.isAssignable(class0, classArray0[0], false);
    }

    @Test(timeout = 4000)
    public void test04244() throws Throwable {
        Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 5);
        boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray0, true);
    }

    @Test(timeout = 4000)
    public void test04345() throws Throwable {
        Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 9);
        boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, classArray0, false);
    }

    @Test(timeout = 4000)
    public void test04446() throws Throwable {
        String string0 = ClassUtils.getPackageName("[[L");
    }

    @Test(timeout = 4000)
    public void test04547() throws Throwable {
        String string0 = ClassUtils.getPackageName("L;");
    }

    @Test(timeout = 4000)
    public void test04648() throws Throwable {
        String string0 = ClassUtils.getShortClassName("org.apache.commons.lang3.builder.ToStringStyle$ShortPrefixToStringStyle");
    }

    @Test(timeout = 4000)
    public void test04749() throws Throwable {
        Class<Byte> class0 = Byte.class;
        String string0 = ClassUtils.getShortClassName(class0);
    }

    @Test(timeout = 4000)
    public void test04850() throws Throwable {
        String string0 = ClassUtils.getShortCanonicalName("[");
    }

    @Test(timeout = 4000)
    public void test04951() throws Throwable {
        String string0 = ClassUtils.getPackageCanonicalName("[L");
    }

    @Test(timeout = 4000)
    public void test05052() throws Throwable {
        ClassUtils.getShortCanonicalName("[]");
    }

    @Test(timeout = 4000)
    public void test05153() throws Throwable {
        String string0 = ClassUtils.getShortCanonicalName((String) null);
    }

    @Test(timeout = 4000)
    public void test05254() throws Throwable {
        Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 7);
        String string0 = ClassUtils.getPackageCanonicalName(classArray0[2]);
    }

    @Test(timeout = 4000)
    public void test05355() throws Throwable {
        String string0 = ClassUtils.getPackageCanonicalName((Object) null, "PreferencesFactory");
    }

    @Test(timeout = 4000)
    public void test05456() throws Throwable {
        String string0 = ClassUtils.getPackageCanonicalName((Object) ":*|3>z24", "52)3");
    }

    @Test(timeout = 4000)
    public void test05557() throws Throwable {
        String string0 = ClassUtils.getShortCanonicalName((Class<?>) null);
    }

    @Test(timeout = 4000)
    public void test05658() throws Throwable {
        Class<?> class0 = ClassUtils.getClass("boolean");
        String string0 = ClassUtils.getShortCanonicalName(class0);
    }

    @Test(timeout = 4000)
    public void test05759() throws Throwable {
        String string0 = ClassUtils.getShortCanonicalName((Object) null, "S4");
    }

    @Test(timeout = 4000)
    public void test05860() throws Throwable {
        Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 5);
        Class<Double> class0 = Double.class;
        classArray0[0] = class0;
        classArray0[2] = classArray0[0];
        String string0 = ClassUtils.getShortCanonicalName((Object) classArray0[2], "");
    }

    @Test(timeout = 4000)
    public void test05961() throws Throwable {
        Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 0);
        Class<?>[] classArray1 = ClassUtils.toClass(classArray0);
    }

    @Test(timeout = 4000)
    public void test06062() throws Throwable {
        Class<?>[] classArray0 = ClassUtils.toClass((Object[]) null);
    }

    @Test(timeout = 4000)
    public void test06163() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        ClassUtils.getClass(classLoader0, "[]", true);
    }

    @Test(timeout = 4000)
    public void test06264() throws Throwable {
        ClassUtils.getClass((String) null, false);
    }

    @Test(timeout = 4000)
    public void test06365() throws Throwable {
        boolean boolean0 = ClassUtils.isInnerClass((Class<?>) null);
    }

    @Test(timeout = 4000)
    public void test06466() throws Throwable {
        Class<String> class0 = String.class;
        boolean boolean0 = ClassUtils.isInnerClass(class0);
    }

    @Test(timeout = 4000)
    public void test06567() throws Throwable {
        Class<ClassUtils>[] classArray0 = (Class<ClassUtils>[]) Array.newInstance(Class.class, 0);
        Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
    }

    @Test(timeout = 4000)
    public void test06668() throws Throwable {
        Class<?>[] classArray0 = ClassUtils.wrappersToPrimitives((Class<?>[]) null);
    }

    @Test(timeout = 4000)
    public void test06769() throws Throwable {
        Class<Short>[] classArray0 = (Class<Short>[]) Array.newInstance(Class.class, 0);
        Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
    }

    @Test(timeout = 4000)
    public void test06870() throws Throwable {
        Class<?>[] classArray0 = ClassUtils.primitivesToWrappers((Class<?>[]) null);
    }

    @Test(timeout = 4000)
    public void test06971() throws Throwable {
        Class<String> class0 = String.class;
        Class<?> class1 = ClassUtils.primitiveToWrapper(class0);
        class1.toString();
    }

    @Test(timeout = 4000)
    public void test07072() throws Throwable {
        Class<Double>[] classArray0 = (Class<Double>[]) Array.newInstance(Class.class, 5);
        Class<?>[] classArray1 = ClassUtils.primitivesToWrappers(classArray0);
    }

    @Test(timeout = 4000)
    public void test07173() throws Throwable {
        Class<Double> class0 = Double.TYPE;
        Class<Long> class1 = Long.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
    }

    @Test(timeout = 4000)
    public void test07274() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        Class<Byte> class1 = Byte.TYPE;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1);
    }

    @Test(timeout = 4000)
    public void test07375() throws Throwable {
        Class<Double> class0 = Double.TYPE;
        Class<Long> class1 = Long.class;
        boolean boolean0 = ClassUtils.isAssignable(class0, class1, false);
    }

    @Test(timeout = 4000)
    public void test07476() throws Throwable {
        Class<Byte> class0 = Byte.TYPE;
        Class<Float> class1 = Float.class;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
    }

    @Test(timeout = 4000)
    public void test07577() throws Throwable {
        Class<Integer> class0 = Integer.class;
        Class<?> class1 = ClassUtils.wrapperToPrimitive(class0);
        boolean boolean0 = ClassUtils.isAssignable(class1, class0);
    }

    @Test(timeout = 4000)
    public void test07678() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        boolean boolean0 = ClassUtils.isAssignable((Class<?>) null, class0);
    }

    @Test(timeout = 4000)
    public void test07779() throws Throwable {
        Class<Object> class0 = Object.class;
        Object[] objectArray0 = new Object[6];
        objectArray0[0] = (Object) "Object";
        objectArray0[1] = (Object) "\":d*gb";
        objectArray0[2] = (Object) class0;
        objectArray0[3] = (Object) "Object";
        objectArray0[4] = (Object) "\":d*gb";
        objectArray0[5] = objectArray0[0];
        Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
        Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
    }

    @Test(timeout = 4000)
    public void test07780() throws Throwable {
        Class<Object> class0 = Object.class;
        Object[] objectArray0 = new Object[6];
        objectArray0[0] = (Object) "Object";
        objectArray0[1] = (Object) "\":d*gb";
        objectArray0[2] = (Object) class0;
        objectArray0[3] = (Object) "Object";
        objectArray0[4] = (Object) "\":d*gb";
        objectArray0[5] = objectArray0[0];
        Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
        Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
        boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0, false);
    }

    @Test(timeout = 4000)
    public void test07781() throws Throwable {
        Class<Object> class0 = Object.class;
        Object[] objectArray0 = new Object[6];
        objectArray0[0] = (Object) "Object";
        objectArray0[1] = (Object) "\":d*gb";
        objectArray0[2] = (Object) class0;
        objectArray0[3] = (Object) "Object";
        objectArray0[4] = (Object) "\":d*gb";
        objectArray0[5] = objectArray0[0];
        Class<?>[] classArray0 = ClassUtils.toClass(objectArray0);
        Class<?>[] classArray1 = ClassUtils.wrappersToPrimitives(classArray0);
        boolean boolean0 = ClassUtils.isAssignable(classArray1, classArray0, false);
    }

    @Test(timeout = 4000)
    public void test07882() throws Throwable {
        boolean boolean0 = ClassUtils.isAssignable((Class<?>[]) null, (Class<?>[]) null, false);
    }

    @Test(timeout = 4000)
    public void test07983() throws Throwable {
        Class<String>[] classArray0 = (Class<String>[]) Array.newInstance(Class.class, 5);
        Class<Boolean>[] classArray1 = (Class<Boolean>[]) Array.newInstance(Class.class, 2);
        boolean boolean0 = ClassUtils.isAssignable(classArray0, classArray1);
    }

    @Test(timeout = 4000)
    public void test08084() throws Throwable {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        linkedList0.add((String) null);
        List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
        List<String> list1 = ClassUtils.convertClassesToClassNames(list0);
        list1.isEmpty();
    }

    @Test(timeout = 4000)
    public void test08185() throws Throwable {
        List<String> list0 = ClassUtils.convertClassesToClassNames((List<Class<?>>) null);
    }

    @Test(timeout = 4000)
    public void test08286() throws Throwable {
        List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses((List<String>) null);
    }

    @Test(timeout = 4000)
    public void test08387() throws Throwable {
        LinkedList<String> linkedList0 = new LinkedList<String>();
        List<Class<?>> list0 = ClassUtils.convertClassNamesToClasses(linkedList0);
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test08488() throws Throwable {
        List<Class<?>> list0 = ClassUtils.getAllInterfaces((Class<?>) null);
    }

    @Test(timeout = 4000)
    public void test08589() throws Throwable {
        List<Class<?>> list0 = ClassUtils.getAllSuperclasses((Class<?>) null);
    }

    @Test(timeout = 4000)
    public void test08690() throws Throwable {
        Class<Byte> class0 = Byte.class;
        List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test08691() throws Throwable {
        Class<Byte> class0 = Byte.class;
        List<Class<?>> list0 = ClassUtils.getAllSuperclasses(class0);
    }

    @Test(timeout = 4000)
    public void test08792() throws Throwable {
        String string0 = ClassUtils.getPackageName("[java.lang.Long");
    }

    @Test(timeout = 4000)
    public void test08893() throws Throwable {
        String string0 = ClassUtils.getPackageName("");
    }

    @Test(timeout = 4000)
    public void test08994() throws Throwable {
        String string0 = ClassUtils.getPackageName((String) null);
    }

    @Test(timeout = 4000)
    public void test09095() throws Throwable {
        String string0 = ClassUtils.getPackageName((Class<?>) null);
    }

    @Test(timeout = 4000)
    public void test09196() throws Throwable {
        String string0 = ClassUtils.getPackageName((Object) null, "(");
    }

    @Test(timeout = 4000)
    public void test09297() throws Throwable {
        Class<Integer> class0 = Integer.TYPE;
        String string0 = ClassUtils.getPackageName((Object) class0, ",");
    }

    @Test(timeout = 4000)
    public void test09398() throws Throwable {
        String string0 = ClassUtils.getShortClassName("D");
    }

    @Test(timeout = 4000)
    public void test09499() throws Throwable {
        String string0 = ClassUtils.getShortClassName("[L");
    }

    @Test(timeout = 4000)
    public void test095100() throws Throwable {
        String string0 = ClassUtils.getShortClassName("");
    }

    @Test(timeout = 4000)
    public void test096101() throws Throwable {
        String string0 = ClassUtils.getShortClassName((String) null);
    }

    @Test(timeout = 4000)
    public void test097102() throws Throwable {
        String string0 = ClassUtils.getShortClassName((Class<?>) null);
    }

    @Test(timeout = 4000)
    public void test098103() throws Throwable {
        String string0 = ClassUtils.getShortClassName((Object) null, "[java.lang.Long");
    }

    @Test(timeout = 4000)
    public void test099104() throws Throwable {
        Object object0 = new Object();
        String string0 = ClassUtils.getShortClassName(object0, "");
    }

    @Test(timeout = 4000)
    public void test100105() throws Throwable {
        ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
        ClassUtils.getClass(classLoader0, "$");
    }

    @Test(timeout = 4000)
    public void test101106() throws Throwable {
        ClassUtils classUtils0 = new ClassUtils();
    }

    @Test(timeout = 4000)
    public void test102107() throws Throwable {
        Class<Long> class0 = Long.TYPE;
        Class<Object> class1 = Object.class;
        boolean boolean0 = ClassUtils.isAssignable(class1, class0, true);
    }
}
