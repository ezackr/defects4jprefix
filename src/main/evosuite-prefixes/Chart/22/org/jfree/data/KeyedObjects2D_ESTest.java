/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 02:33:47 GMT 2023
 */
package org.jfree.data;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jfree.data.KeyedObjects;
import org.jfree.data.KeyedObjects2D;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class KeyedObjects2D_ESTest extends KeyedObjects2D_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.removeObject(comparable0, "'position' out of bounds.");
        Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn("'position' out of bounds.", "", "gU?UC&dXNpi~WAOH!T", "'position' out of bounds.").when(comparable1).toString();
        keyedObjects2D0.setObject((Object) null, comparable1, comparable1);
        Object object0 = keyedObjects2D0.clone();
        boolean boolean0 = keyedObjects2D0.equals(object0);
        keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.removeObject(comparable0, "'position' out of bounds.");
        Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn("'position' out of bounds.", "", "gU?UC&dXNpi~WAOH!T", "'position' out of bounds.").when(comparable1).toString();
        keyedObjects2D0.setObject((Object) null, comparable1, comparable1);
        Object object0 = keyedObjects2D0.clone();
        boolean boolean0 = keyedObjects2D0.equals(object0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<KeyedObjects> comparable0 = (Comparable<KeyedObjects>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        Comparable<String> comparable1 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.setObject(keyedObjects2D0, comparable1, comparable1);
        Comparable<KeyedObjects> comparable2 = (Comparable<KeyedObjects>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.removeObject(comparable0, comparable2);
        keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        KeyedObjects keyedObjects0 = new KeyedObjects();
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.addObject(keyedObjects0, comparable0, comparable0);
        keyedObjects2D0.addObject(keyedObjects2D0, "-JSH\"n", "-JSH\"n");
        keyedObjects2D0.setObject(keyedObjects2D0, "-JSH\"n", "-JSH\"n");
        keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Integer integer0 = Integer.getInteger("", 0);
        keyedObjects2D0.setObject(keyedObjects2D0, integer0, "");
        keyedObjects2D0.setObject("M|F8@(", "M|F8@(", "M|F8@(");
        Comparable comparable0 = keyedObjects2D0.getRowKey(0);
        keyedObjects2D0.getObject((Comparable) comparable0, (Comparable) "M|F8@(");
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(comparable0).toString();
        Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.getObject(comparable0, comparable1);
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        KeyedObjects keyedObjects0 = new KeyedObjects();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.setObject(keyedObjects0, comparable0, comparable1);
        keyedObjects2D0.addObject("", "", "");
        Object object0 = keyedObjects2D0.getObject((Comparable) "", (Comparable) "");
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Integer integer0 = new Integer(0);
        keyedObjects2D0.addObject(integer0, integer0, integer0);
        keyedObjects2D0.removeRow(0);
        keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.addObject("", "", "");
        keyedObjects2D0.removeColumn(0);
        keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Integer integer0 = new Integer(1311);
        keyedObjects2D0.addObject(integer0, integer0, integer0);
        int int0 = keyedObjects2D0.getRowIndex(integer0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.addObject(keyedObjects2D0, comparable0, comparable0);
        int int0 = keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.setObject((Object) null, "M|F8@(", "M|F8@(");
        Comparable comparable0 = keyedObjects2D0.getRowKey(0);
        Object object0 = keyedObjects2D0.getObject((Comparable) comparable0, (Comparable) "M|F8@(");
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.setObject("", "", "");
        Integer integer0 = new Integer(0);
        Comparable comparable0 = keyedObjects2D0.getColumnKey((int) integer0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Integer integer0 = new Integer((-1007));
        keyedObjects2D0.setObject("", "", integer0);
        int int0 = keyedObjects2D0.getColumnIndex(integer0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.removeObject(comparable0, comparable0);
        Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.removeObject(comparable1, "");
        int int0 = keyedObjects2D0.getColumnIndex("");
        keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.removeObject(comparable0, comparable0);
        Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.removeObject(comparable1, "");
        int int0 = keyedObjects2D0.getColumnIndex("");
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.setObject("", "", "");
        int int0 = keyedObjects2D0.getColumnCount();
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.removeRow((-36));
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.removeObject((Comparable) null, comparable0);
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.removeColumn((-1289));
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.getRowKey((-319));
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.getObject(1, 1);
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.getObject((-2815), (-2815));
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.getColumnKey((-507));
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Integer integer0 = new Integer(518);
        keyedObjects2D0.setObject(integer0, integer0, integer0);
        Object object0 = new Object();
        keyedObjects2D0.setObject(object0, integer0, integer0);
        keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.setObject((Object) null, (Comparable) null, (Comparable) null);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.removeObject(comparable0, comparable0);
        Object object0 = new Object();
        Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        Comparable<Object> comparable2 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.addObject(object0, comparable1, comparable2);
        keyedObjects2D0.getObject(0, 0);
        keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.setObject("", "", "");
        Integer integer0 = new Integer(0);
        Object object0 = keyedObjects2D0.getObject((int) integer0, (int) integer0);
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.removeRow(0);
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<KeyedObjects2D> comparable0 = (Comparable<KeyedObjects2D>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        int int0 = keyedObjects2D0.getRowIndex(comparable0);
    }

    @Test(timeout = 4000)
    public void test2930() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Integer integer0 = new Integer(0);
        keyedObjects2D0.getColumnKey((int) integer0);
    }

    @Test(timeout = 4000)
    public void test3031() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.addObject("", "", "");
        KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
        keyedObjects2D1.addObject(keyedObjects2D0, "", "");
        boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
    }

    @Test(timeout = 4000)
    public void test3132() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
        keyedObjects2D1.equals((Object) keyedObjects2D0);
    }

    @Test(timeout = 4000)
    public void test3133() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn("^m\"E/ J").when(comparable0).toString();
        keyedObjects2D1.removeObject(comparable0, comparable0);
        boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
        keyedObjects2D1.equals((Object) keyedObjects2D0);
    }

    @Test(timeout = 4000)
    public void test3134() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn("^m\"E/ J").when(comparable0).toString();
        keyedObjects2D1.removeObject(comparable0, comparable0);
        boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
    }

    @Test(timeout = 4000)
    public void test3235() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
        keyedObjects2D1.equals((Object) keyedObjects2D0);
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(comparable0).toString();
        keyedObjects2D0.addObject(keyedObjects2D1, comparable0, comparable0);
        boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
        keyedObjects2D1.equals((Object) keyedObjects2D0);
    }

    @Test(timeout = 4000)
    public void test3237() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        KeyedObjects2D keyedObjects2D1 = new KeyedObjects2D();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn((String) null).when(comparable0).toString();
        keyedObjects2D0.addObject(keyedObjects2D1, comparable0, comparable0);
        boolean boolean0 = keyedObjects2D0.equals(keyedObjects2D1);
    }

    @Test(timeout = 4000)
    public void test3338() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.setObject("", "", "");
        Comparable comparable0 = keyedObjects2D0.getRowKey(0);
        keyedObjects2D0.removeColumn(comparable0);
        keyedObjects2D0.removeColumn(comparable0);
    }

    @Test(timeout = 4000)
    public void test3439() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.addObject("", "", "");
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.removeObject("", comparable0);
        keyedObjects2D0.getObject(0, 1);
        keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test3540() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.setObject("M|F8@(", "M|F8@(", (Comparable) null);
    }

    @Test(timeout = 4000)
    public void test3641() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.addObject((Object) null, (Comparable) null, (Comparable) null);
    }

    @Test(timeout = 4000)
    public void test3742() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Integer integer0 = new Integer((-1007));
        keyedObjects2D0.setObject("", "", integer0);
        Comparable<Object> comparable0 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn("").when(comparable0).toString();
        keyedObjects2D0.getObject((Comparable) "", (Comparable) comparable0);
    }

    @Test(timeout = 4000)
    public void test3843() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.addObject("", "", "");
        keyedObjects2D0.removeRow((Comparable) "");
        keyedObjects2D0.getObject((Comparable) "", (Comparable) "");
    }

    @Test(timeout = 4000)
    public void test3944() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.setObject("Null'columney argumen", "Null'columney argumen", "Null'columney argumen");
        Comparable comparable0 = keyedObjects2D0.getRowKey(0);
        keyedObjects2D0.getObject((Comparable) comparable0, (Comparable) null);
    }

    @Test(timeout = 4000)
    public void test4045() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.getObject((Comparable) null, comparable0);
    }

    @Test(timeout = 4000)
    public void test4146() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn(") is not recognised.", ") is not recognised.", ") is not recognised.", ") is not recognised.").when(comparable0).toString();
        Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn(") is not recognised.", ") is not recognised.", ") is not recognised.", ") is not recognised.").when(comparable1).toString();
        keyedObjects2D0.setObject(") is not recognised.", comparable1, comparable1);
        keyedObjects2D0.addObject(keyedObjects2D0, comparable0, comparable0);
        Object object0 = keyedObjects2D0.clone();
        boolean boolean0 = keyedObjects2D0.equals(object0);
        keyedObjects2D0.getColumnCount();
    }

    @Test(timeout = 4000)
    public void test4147() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn(") is not recognised.", ") is not recognised.", ") is not recognised.", ") is not recognised.").when(comparable0).toString();
        Comparable<Object> comparable1 = (Comparable<Object>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        doReturn(") is not recognised.", ") is not recognised.", ") is not recognised.", ") is not recognised.").when(comparable1).toString();
        keyedObjects2D0.setObject(") is not recognised.", comparable1, comparable1);
        keyedObjects2D0.addObject(keyedObjects2D0, comparable0, comparable0);
        Object object0 = keyedObjects2D0.clone();
        boolean boolean0 = keyedObjects2D0.equals(object0);
    }

    @Test(timeout = 4000)
    public void test4248() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        int int0 = keyedObjects2D0.getRowCount();
    }

    @Test(timeout = 4000)
    public void test4349() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        List list0 = keyedObjects2D0.getColumnKeys();
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test4450() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.removeRow((Comparable) "");
    }

    @Test(timeout = 4000)
    public void test4551() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        Comparable<String> comparable0 = (Comparable<String>) mock(Comparable.class, new ViolatedAssumptionAnswer());
        keyedObjects2D0.addObject(keyedObjects2D0, comparable0, comparable0);
        keyedObjects2D0.addObject("", "", "");
        keyedObjects2D0.removeColumn(1);
    }

    @Test(timeout = 4000)
    public void test4652() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        int int0 = keyedObjects2D0.getColumnCount();
    }

    @Test(timeout = 4000)
    public void test4753() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.removeColumn(1);
    }

    @Test(timeout = 4000)
    public void test4854() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        int int0 = keyedObjects2D0.getColumnIndex("");
    }

    @Test(timeout = 4000)
    public void test4955() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        keyedObjects2D0.getRowKey(1027);
    }

    @Test(timeout = 4000)
    public void test5056() throws Throwable {
        KeyedObjects2D keyedObjects2D0 = new KeyedObjects2D();
        List list0 = keyedObjects2D0.getRowKeys();
        boolean boolean0 = keyedObjects2D0.equals(list0);
    }
}
