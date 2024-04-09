/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 11:15:24 GMT 2024
 */
package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PropertyPointer_ESTest extends PropertyPointer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Class<String> class0 = String.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        beanPropertyPointer0.setPropertyIndex(0);
        beanPropertyPointer0.getLength();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        nullPropertyPointer0.compareChildNodePointers((NodePointer) null, (NodePointer) null);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Class<Locale> class0 = Locale.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        QName qName0 = beanPropertyPointer0.getName();
        beanPropertyPointer0.createChild((JXPathContext) null, qName0, 923, (Object) class0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPropertyPointer0);
        beanPropertyPointer0.compareTo(nullPropertyPointer0);
        nullPropertyPointer0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPropertyPointer0);
        beanPropertyPointer0.compareTo(nullPropertyPointer0);
        beanPropertyPointer0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Class<VariablePointer> class0 = VariablePointer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        beanPropertyPointer0.bean = (Object) nullPropertyPointer0;
        nullPropertyPointer0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Class<VariablePointer> class0 = VariablePointer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        beanPropertyPointer0.bean = (Object) nullPropertyPointer0;
        beanPropertyPointer0.setPropertyIndex(1);
        boolean boolean0 = beanPropertyPointer0.isLeaf();
        beanPropertyPointer0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        Class<VariablePointer> class0 = VariablePointer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        beanPropertyPointer0.bean = (Object) nullPropertyPointer0;
        beanPropertyPointer0.setPropertyIndex(1);
        boolean boolean0 = beanPropertyPointer0.isLeaf();
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        Class<NodePointer> class0 = NodePointer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
        beanPropertyPointer0.setPropertyIndex(6);
        boolean boolean0 = beanPropertyPointer0.isActual();
        beanPropertyPointer0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        Class<NodePointer> class0 = NodePointer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
        beanPropertyPointer0.setPropertyIndex(6);
        boolean boolean0 = beanPropertyPointer0.isActual();
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        Class<Object> class0 = Object.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        boolean boolean0 = beanPropertyPointer0.isActual();
        beanPropertyPointer0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test0611() throws Throwable {
        Class<Object> class0 = Object.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        boolean boolean0 = beanPropertyPointer0.isActual();
    }

    @Test(timeout = 4000)
    public void test0712() throws Throwable {
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
        beanPropertyPointer0.createPath((JXPathContext) null, (Object) null);
    }

    @Test(timeout = 4000)
    public void test0813() throws Throwable {
        Class<Integer> class0 = Integer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        QName qName0 = beanPropertyPointer0.getName();
        beanPropertyPointer0.createChild((JXPathContext) null, qName0, (-925), (Object) qName0);
    }

    @Test(timeout = 4000)
    public void test0914() throws Throwable {
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
        beanPropertyPointer0.createChild((JXPathContext) null, (QName) null, (-2147483647), (Object) null);
    }

    @Test(timeout = 4000)
    public void test1015() throws Throwable {
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
        beanPropertyPointer0.createChild((JXPathContext) null, (QName) null, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test1116() throws Throwable {
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
        QName qName0 = new QName("<<unknown namespace>>");
        beanPropertyPointer0.createChild((JXPathContext) null, qName0, (-2147483647));
    }

    @Test(timeout = 4000)
    public void test1217() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer0);
    }

    @Test(timeout = 4000)
    public void test1218() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer0);
        nullPropertyPointer0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test1319() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer0);
        boolean boolean0 = nullPropertyPointer1.equals(nullPropertyPointer0);
    }

    @Test(timeout = 4000)
    public void test1320() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer0);
        boolean boolean0 = nullPropertyPointer1.equals(nullPropertyPointer0);
        nullPropertyPointer1.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test1421() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer0);
        boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
    }

    @Test(timeout = 4000)
    public void test1422() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer(nullPropertyPointer0);
        boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
        nullPropertyPointer1.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test1523() throws Throwable {
        Class<Object> class0 = Object.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        BeanPropertyPointer beanPropertyPointer1 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
        BeanPropertyPointer beanPropertyPointer2 = new BeanPropertyPointer(beanPropertyPointer0, jXPathBasicBeanInfo0);
        boolean boolean0 = beanPropertyPointer1.equals(beanPropertyPointer2);
        beanPropertyPointer2.equals((Object) beanPropertyPointer0);
    }

    @Test(timeout = 4000)
    public void test1524() throws Throwable {
        Class<Object> class0 = Object.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        BeanPropertyPointer beanPropertyPointer1 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
        BeanPropertyPointer beanPropertyPointer2 = new BeanPropertyPointer(beanPropertyPointer0, jXPathBasicBeanInfo0);
        boolean boolean0 = beanPropertyPointer1.equals(beanPropertyPointer2);
    }

    @Test(timeout = 4000)
    public void test1525() throws Throwable {
        Class<Object> class0 = Object.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        BeanPropertyPointer beanPropertyPointer1 = new BeanPropertyPointer(nullPropertyPointer0, jXPathBasicBeanInfo0);
        BeanPropertyPointer beanPropertyPointer2 = new BeanPropertyPointer(beanPropertyPointer0, jXPathBasicBeanInfo0);
        boolean boolean0 = beanPropertyPointer1.equals(beanPropertyPointer2);
        beanPropertyPointer2.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test1626() throws Throwable {
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
        beanPropertyPointer0.setPropertyIndex(1);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = beanPropertyPointer0.equals(nullPropertyPointer0);
        nullPropertyPointer0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test1627() throws Throwable {
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
        beanPropertyPointer0.setPropertyIndex(1);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = beanPropertyPointer0.equals(nullPropertyPointer0);
        beanPropertyPointer0.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test1628() throws Throwable {
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, (JXPathBeanInfo) null);
        beanPropertyPointer0.setPropertyIndex(1);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = beanPropertyPointer0.equals(nullPropertyPointer0);
    }

    @Test(timeout = 4000)
    public void test1729() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
        nullPropertyPointer1.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test1730() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
    }

    @Test(timeout = 4000)
    public void test1831() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        nullPropertyPointer0.setIndex(29);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
        nullPropertyPointer1.getPropertyIndex();
    }

    @Test(timeout = 4000)
    public void test1832() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        nullPropertyPointer0.setIndex(29);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
    }

    @Test(timeout = 4000)
    public void test1833() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        nullPropertyPointer0.setIndex(29);
        NullPropertyPointer nullPropertyPointer1 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.equals(nullPropertyPointer1);
        nullPropertyPointer1.equals((Object) nullPropertyPointer0);
    }

    @Test(timeout = 4000)
    public void test1934() throws Throwable {
        Class<Integer> class0 = Integer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        beanPropertyPointer0.setIndex((-445));
        BeanPropertyPointer beanPropertyPointer1 = (BeanPropertyPointer) beanPropertyPointer0.clone();
        boolean boolean0 = beanPropertyPointer0.equals(beanPropertyPointer1);
    }

    @Test(timeout = 4000)
    public void test1935() throws Throwable {
        Class<Integer> class0 = Integer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
        BeanPropertyPointer beanPropertyPointer0 = new BeanPropertyPointer((NodePointer) null, jXPathBasicBeanInfo0);
        beanPropertyPointer0.setIndex((-445));
        BeanPropertyPointer beanPropertyPointer1 = (BeanPropertyPointer) beanPropertyPointer0.clone();
        boolean boolean0 = beanPropertyPointer0.equals(beanPropertyPointer1);
        beanPropertyPointer1.getPropertyIndex();
    }
}
