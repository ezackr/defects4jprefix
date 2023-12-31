/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 31 04:19:19 GMT 2023
 */
package org.apache.commons.collections4.map;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.BiFunction;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.functors.ConstantFactory;
import org.apache.commons.collections4.map.MultiValueMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class MultiValueMap_ESTest extends MultiValueMap_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        MultiValueMap<String, LinkedList<Object>> multiValueMap0 = new MultiValueMap<String, LinkedList<Object>>();
        ArrayList<LinkedList<String>> arrayList0 = new ArrayList<LinkedList<String>>();
        ConstantFactory<Collection<LinkedList<String>>> constantFactory0 = new ConstantFactory<Collection<LinkedList<String>>>(arrayList0);
        MultiValueMap<String, LinkedList<String>> multiValueMap1 = MultiValueMap.multiValueMap((Map<String, ? super Collection<LinkedList<String>>>) multiValueMap0, (Factory<Collection<LinkedList<String>>>) constantFactory0);
        BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
        Object object0 = multiValueMap1.merge(null, arrayList0, biFunction0);
        multiValueMap1.isEmpty();
    }

    @Test(timeout = 4000)
    public void test001() throws Throwable {
        MultiValueMap<String, LinkedList<Object>> multiValueMap0 = new MultiValueMap<String, LinkedList<Object>>();
        ArrayList<LinkedList<String>> arrayList0 = new ArrayList<LinkedList<String>>();
        ConstantFactory<Collection<LinkedList<String>>> constantFactory0 = new ConstantFactory<Collection<LinkedList<String>>>(arrayList0);
        MultiValueMap<String, LinkedList<String>> multiValueMap1 = MultiValueMap.multiValueMap((Map<String, ? super Collection<LinkedList<String>>>) multiValueMap0, (Factory<Collection<LinkedList<String>>>) constantFactory0);
        BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
        Object object0 = multiValueMap1.merge(null, arrayList0, biFunction0);
        boolean boolean0 = multiValueMap0.removeMapping((Object) null, object0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        MultiValueMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> multiValueMap0 = new MultiValueMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>>();
        MultiValueMap<Integer, LinkedList<Object>> multiValueMap1 = MultiValueMap.multiValueMap((Map<Integer, ? super Collection<LinkedList<Object>>>) multiValueMap0);
        Iterator<Map.Entry<Integer, LinkedList<Object>>> iterator0 = (Iterator<Map.Entry<Integer, LinkedList<Object>>>) multiValueMap1.iterator();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        MultiValueMap<Collection<Integer>, ConstantFactory<String>> multiValueMap0 = new MultiValueMap<Collection<Integer>, ConstantFactory<String>>();
        multiValueMap0.clear();
        multiValueMap0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        MultiValueMap<String, Integer> multiValueMap0 = new MultiValueMap<String, Integer>();
        multiValueMap0.put("P", "P");
        MultiValueMap<String, String> multiValueMap1 = MultiValueMap.multiValueMap((Map<String, ? super Collection<String>>) multiValueMap0);
        boolean boolean0 = multiValueMap1.containsValue((Object) "P");
        multiValueMap0.size();
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        MultiValueMap<String, Integer> multiValueMap0 = new MultiValueMap<String, Integer>();
        multiValueMap0.put("P", "P");
        MultiValueMap<String, String> multiValueMap1 = MultiValueMap.multiValueMap((Map<String, ? super Collection<String>>) multiValueMap0);
        boolean boolean0 = multiValueMap1.containsValue((Object) "P");
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        MultiValueMap<Collection<Object>, Object> multiValueMap0 = new MultiValueMap<Collection<Object>, Object>();
        MultiValueMap<ConstantFactory<Object>, Collection<Object>> multiValueMap1 = new MultiValueMap<ConstantFactory<Object>, Collection<Object>>();
        Collection<Object> collection0 = multiValueMap1.values();
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        MultiValueMap<Collection<Object>, Object> multiValueMap0 = new MultiValueMap<Collection<Object>, Object>();
        MultiValueMap<ConstantFactory<Object>, Collection<Object>> multiValueMap1 = new MultiValueMap<ConstantFactory<Object>, Collection<Object>>();
        Collection<Object> collection0 = multiValueMap1.values();
        boolean boolean0 = multiValueMap0.putAll(collection0, collection0);
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        MultiValueMap<Collection<Object>, Object> multiValueMap0 = new MultiValueMap<Collection<Object>, Object>();
        ArrayList<String> arrayList0 = new ArrayList<String>();
        arrayList0.add("PrototypeCloneFactory: The clone method must exist and be public ");
        LinkedList<String> linkedList0 = new LinkedList<String>(arrayList0);
        Factory<Collection<String>> factory0 = ConstantFactory.constantFactory((Collection<String>) linkedList0);
        MultiValueMap<Collection<Object>, String> multiValueMap1 = new MultiValueMap<Collection<Object>, String>((Map<Collection<Object>, ? super Collection<String>>) multiValueMap0, factory0);
        ArrayList<Object> arrayList1 = new ArrayList<Object>();
        multiValueMap1.putAll((Collection<Object>) arrayList1, (Collection<String>) arrayList0);
        multiValueMap1.iterator((Object) arrayList1);
        arrayList0.size();
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        MultiValueMap<Collection<Object>, Object> multiValueMap0 = new MultiValueMap<Collection<Object>, Object>();
        ArrayList<String> arrayList0 = new ArrayList<String>();
        arrayList0.add("PrototypeCloneFactory: The clone method must exist and be public ");
        LinkedList<String> linkedList0 = new LinkedList<String>(arrayList0);
        Factory<Collection<String>> factory0 = ConstantFactory.constantFactory((Collection<String>) linkedList0);
        MultiValueMap<Collection<Object>, String> multiValueMap1 = new MultiValueMap<Collection<Object>, String>((Map<Collection<Object>, ? super Collection<String>>) multiValueMap0, factory0);
        ArrayList<Object> arrayList1 = new ArrayList<Object>();
        multiValueMap1.putAll((Collection<Object>) arrayList1, (Collection<String>) arrayList0);
        multiValueMap1.iterator((Object) arrayList1);
        multiValueMap0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        MultiValueMap<Collection<Integer>, Object> multiValueMap0 = new MultiValueMap<Collection<Integer>, Object>();
        MultiValueMap<Collection<Integer>, AbstractMap.SimpleEntry<ArrayList<String>, Object>> multiValueMap1 = MultiValueMap.multiValueMap((Map<Collection<Integer>, ? super Collection<AbstractMap.SimpleEntry<ArrayList<String>, Object>>>) multiValueMap0);
        ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
        multiValueMap0.putIfAbsent(arrayList0, multiValueMap1);
        MultiValueMap<Collection<Integer>, LinkedList<Object>> multiValueMap2 = MultiValueMap.multiValueMap((Map<Collection<Integer>, ? super Collection<LinkedList<Object>>>) multiValueMap0);
        int int0 = multiValueMap2.totalSize();
        multiValueMap0.size();
    }

    @Test(timeout = 4000)
    public void test0611() throws Throwable {
        MultiValueMap<Collection<Integer>, Object> multiValueMap0 = new MultiValueMap<Collection<Integer>, Object>();
        MultiValueMap<Collection<Integer>, AbstractMap.SimpleEntry<ArrayList<String>, Object>> multiValueMap1 = MultiValueMap.multiValueMap((Map<Collection<Integer>, ? super Collection<AbstractMap.SimpleEntry<ArrayList<String>, Object>>>) multiValueMap0);
        ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
        multiValueMap0.putIfAbsent(arrayList0, multiValueMap1);
        MultiValueMap<Collection<Integer>, LinkedList<Object>> multiValueMap2 = MultiValueMap.multiValueMap((Map<Collection<Integer>, ? super Collection<LinkedList<Object>>>) multiValueMap0);
        int int0 = multiValueMap2.totalSize();
    }

    @Test(timeout = 4000)
    public void test0712() throws Throwable {
        MultiValueMap<String, Object> multiValueMap0 = new MultiValueMap<String, Object>();
        MultiValueMap.multiValueMap((Map<String, ? super Collection<Integer>>) multiValueMap0, (Factory<Collection<Integer>>) null);
    }

    @Test(timeout = 4000)
    public void test0813() throws Throwable {
        HashMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Collection<Object>> hashMap0 = new HashMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Collection<Object>>();
        MultiValueMap<AbstractMap.SimpleImmutableEntry<Object, Object>, Object> multiValueMap0 = MultiValueMap.multiValueMap((Map<AbstractMap.SimpleImmutableEntry<Object, Object>, ? super Collection<Object>>) hashMap0);
        boolean boolean0 = multiValueMap0.removeMapping((Object) null, (Object) null);
    }

    @Test(timeout = 4000)
    public void test0914() throws Throwable {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        Integer integer0 = new Integer((-1437));
        linkedList0.add(integer0);
        MultiValueMap<String, Integer> multiValueMap0 = new MultiValueMap<String, Integer>();
        multiValueMap0.putAll("h$M.mL6!(<I{hV", (Collection<Integer>) linkedList0);
        MultiValueMap<String, String> multiValueMap1 = MultiValueMap.multiValueMap((Map<String, ? super Collection<String>>) multiValueMap0);
        LinkedList<Object> linkedList1 = new LinkedList<Object>();
        boolean boolean0 = multiValueMap1.removeMapping("h$M.mL6!(<I{hV", linkedList1);
        multiValueMap0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test0915() throws Throwable {
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        Integer integer0 = new Integer((-1437));
        linkedList0.add(integer0);
        MultiValueMap<String, Integer> multiValueMap0 = new MultiValueMap<String, Integer>();
        multiValueMap0.putAll("h$M.mL6!(<I{hV", (Collection<Integer>) linkedList0);
        MultiValueMap<String, String> multiValueMap1 = MultiValueMap.multiValueMap((Map<String, ? super Collection<String>>) multiValueMap0);
        LinkedList<Object> linkedList1 = new LinkedList<Object>();
        boolean boolean0 = multiValueMap1.removeMapping("h$M.mL6!(<I{hV", linkedList1);
    }

    @Test(timeout = 4000)
    public void test1016() throws Throwable {
        MultiValueMap<HashMap<Object, Integer>, String> multiValueMap0 = new MultiValueMap<HashMap<Object, Integer>, String>();
        HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
        multiValueMap0.putIfAbsent(hashMap0, hashMap0);
        boolean boolean0 = multiValueMap0.containsValue((Object) multiValueMap0);
        multiValueMap0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1017() throws Throwable {
        MultiValueMap<HashMap<Object, Integer>, String> multiValueMap0 = new MultiValueMap<HashMap<Object, Integer>, String>();
        HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
        multiValueMap0.putIfAbsent(hashMap0, hashMap0);
        boolean boolean0 = multiValueMap0.containsValue((Object) multiValueMap0);
    }

    @Test(timeout = 4000)
    public void test1118() throws Throwable {
        MultiValueMap<String, Object> multiValueMap0 = new MultiValueMap<String, Object>();
        multiValueMap0.put((String) null, (Object) null);
        MultiValueMap<String, ConstantFactory<String>> multiValueMap1 = MultiValueMap.multiValueMap((Map<String, ? super Collection<ConstantFactory<String>>>) multiValueMap0);
        multiValueMap1.put((String) null, (Object) null);
        multiValueMap0.size();
    }

    @Test(timeout = 4000)
    public void test1119() throws Throwable {
        MultiValueMap<String, Object> multiValueMap0 = new MultiValueMap<String, Object>();
        multiValueMap0.put((String) null, (Object) null);
        MultiValueMap<String, ConstantFactory<String>> multiValueMap1 = MultiValueMap.multiValueMap((Map<String, ? super Collection<ConstantFactory<String>>>) multiValueMap0);
        multiValueMap1.put((String) null, (Object) null);
        multiValueMap0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1220() throws Throwable {
        MultiValueMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>> multiValueMap0 = new MultiValueMap<Integer, AbstractMap.SimpleImmutableEntry<String, Object>>();
        MultiValueMap<Integer, LinkedList<Object>> multiValueMap1 = MultiValueMap.multiValueMap((Map<Integer, ? super Collection<LinkedList<Object>>>) multiValueMap0);
        Integer integer0 = new Integer(706);
        ArrayList<String> arrayList0 = new ArrayList<String>();
        multiValueMap1.putIfAbsent(integer0, arrayList0);
        multiValueMap1.putAll((Map<? extends Integer, ?>) multiValueMap0);
        multiValueMap1.size();
    }

    @Test(timeout = 4000)
    public void test1321() throws Throwable {
        MultiValueMap<String, LinkedList<Object>> multiValueMap0 = new MultiValueMap<String, LinkedList<Object>>();
        HashMap<String, String> hashMap0 = new HashMap<String, String>();
        hashMap0.put((String) null, "The collection must not be null");
        multiValueMap0.putAll((Map<? extends String, ?>) hashMap0);
        multiValueMap0.size();
    }

    @Test(timeout = 4000)
    public void test1422() throws Throwable {
        MultiValueMap<Integer, ConstantFactory<String>> multiValueMap0 = new MultiValueMap<Integer, ConstantFactory<String>>();
        Collection<Object> collection0 = multiValueMap0.values();
        Collection<Object> collection1 = multiValueMap0.values();
    }

    @Test(timeout = 4000)
    public void test1523() throws Throwable {
        MultiValueMap<String, AbstractMap.SimpleEntry<Integer, Object>> multiValueMap0 = new MultiValueMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
        MultiValueMap<HashMap<Object, String>, ArrayList<String>> multiValueMap1 = new MultiValueMap<HashMap<Object, String>, ArrayList<String>>();
        HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
        multiValueMap1.putIfAbsent(hashMap0, hashMap0);
        Object object0 = new Object();
        boolean boolean0 = multiValueMap1.containsValue((Object) multiValueMap0, object0);
        multiValueMap1.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1524() throws Throwable {
        MultiValueMap<String, AbstractMap.SimpleEntry<Integer, Object>> multiValueMap0 = new MultiValueMap<String, AbstractMap.SimpleEntry<Integer, Object>>();
        MultiValueMap<HashMap<Object, String>, ArrayList<String>> multiValueMap1 = new MultiValueMap<HashMap<Object, String>, ArrayList<String>>();
        HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
        multiValueMap1.putIfAbsent(hashMap0, hashMap0);
        Object object0 = new Object();
        boolean boolean0 = multiValueMap1.containsValue((Object) multiValueMap0, object0);
    }

    @Test(timeout = 4000)
    public void test1625() throws Throwable {
        MultiValueMap<Collection<Object>, Object> multiValueMap0 = new MultiValueMap<Collection<Object>, Object>();
        ArrayList<String> arrayList0 = new ArrayList<String>();
        LinkedList<String> linkedList0 = new LinkedList<String>(arrayList0);
        Factory<Collection<String>> factory0 = ConstantFactory.constantFactory((Collection<String>) linkedList0);
        MultiValueMap<Collection<Object>, String> multiValueMap1 = new MultiValueMap<Collection<Object>, String>((Map<Collection<Object>, ? super Collection<String>>) multiValueMap0, factory0);
        Integer integer0 = new Integer((-851));
        boolean boolean0 = multiValueMap0.containsValue((Object) multiValueMap1, (Object) integer0);
    }

    @Test(timeout = 4000)
    public void test1726() throws Throwable {
        MultiValueMap<HashMap<Object, String>, ArrayList<String>> multiValueMap0 = new MultiValueMap<HashMap<Object, String>, ArrayList<String>>();
        HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
        Object object0 = multiValueMap0.putIfAbsent(hashMap0, hashMap0);
        boolean boolean0 = multiValueMap0.containsValue(object0, (Object) hashMap0);
        multiValueMap0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1727() throws Throwable {
        MultiValueMap<HashMap<Object, String>, ArrayList<String>> multiValueMap0 = new MultiValueMap<HashMap<Object, String>, ArrayList<String>>();
        HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
        Object object0 = multiValueMap0.putIfAbsent(hashMap0, hashMap0);
        boolean boolean0 = multiValueMap0.containsValue(object0, (Object) hashMap0);
    }

    @Test(timeout = 4000)
    public void test1828() throws Throwable {
        MultiValueMap<String, Integer> multiValueMap0 = new MultiValueMap<String, Integer>();
        multiValueMap0.put("P", "P");
        int int0 = multiValueMap0.size((Object) "P");
        multiValueMap0.size();
    }

    @Test(timeout = 4000)
    public void test1829() throws Throwable {
        MultiValueMap<String, Integer> multiValueMap0 = new MultiValueMap<String, Integer>();
        multiValueMap0.put("P", "P");
        int int0 = multiValueMap0.size((Object) "P");
    }

    @Test(timeout = 4000)
    public void test1930() throws Throwable {
        MultiValueMap<LinkedList<String>, String> multiValueMap0 = new MultiValueMap<LinkedList<String>, String>();
        MultiValueMap<LinkedList<String>, Integer> multiValueMap1 = MultiValueMap.multiValueMap((Map<LinkedList<String>, ? super Collection<Integer>>) multiValueMap0);
        int int0 = multiValueMap1.size((Object) multiValueMap0);
    }

    @Test(timeout = 4000)
    public void test2031() throws Throwable {
        MultiValueMap<String, LinkedList<Object>> multiValueMap0 = new MultiValueMap<String, LinkedList<Object>>();
        boolean boolean0 = multiValueMap0.putAll("MV9uE[/u:72W", (Collection<LinkedList<Object>>) null);
    }

    @Test(timeout = 4000)
    public void test2132() throws Throwable {
        HashMap<LinkedList<Object>, Object> hashMap0 = new HashMap<LinkedList<Object>, Object>();
        MultiValueMap<LinkedList<Object>, Object> multiValueMap0 = MultiValueMap.multiValueMap((Map<LinkedList<Object>, ? super Collection<Object>>) hashMap0);
        Iterator<Object> iterator0 = multiValueMap0.iterator((Object) hashMap0);
    }
}
