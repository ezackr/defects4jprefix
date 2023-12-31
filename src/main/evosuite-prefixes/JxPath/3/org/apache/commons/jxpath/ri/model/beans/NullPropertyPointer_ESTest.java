/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:01:16 GMT 2023
 */
package org.apache.commons.jxpath.ri.model.beans;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathBasicBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.Variables;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPointer;
import org.apache.commons.jxpath.ri.model.beans.NullPropertyPointer;
import org.apache.commons.jxpath.ri.model.beans.PropertyPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class NullPropertyPointer_ESTest extends NullPropertyPointer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("Hc+g{@d?-~EB", "Hc+g{@d?-~EB");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        Locale locale0 = Locale.GERMAN;
        nullPropertyPointer0.setIndex(62);
        nullPropertyPointer0.createPath((JXPathContext) null, (Object) locale0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
        NullPropertyPointer nullPropertyPointer0 = (NullPropertyPointer) nullPointer0.getPropertyPointer();
        nullPropertyPointer0.setNameAttributeValue((String) null);
        String string0 = nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        QName qName0 = new QName("", "");
        Locale locale0 = Locale.FRANCE;
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        QName qName0 = new QName("", "");
        Locale locale0 = Locale.FRANCE;
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.setNameAttributeValue("");
        String string0 = nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("Hc+g{@d?-~EB", "Hc+g{@d?-~EB");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) "<<unknown namespace>>");
        Locale locale0 = Locale.UK;
        Class<String> class0 = String.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
        BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, locale0, jXPathBasicBeanInfo0);
        variablePointer0.createPath(jXPathContext0, (Object) beanPointer0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        nullPropertyPointer0.createPath(jXPathContext0, (Object) locale0);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        QName qName0 = new QName("key", "key");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) null, locale_FilteringMode0);
        NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, list0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
        nullPropertyPointer0.createPath(jXPathContext0);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        QName qName0 = new QName(",x\"81.k Vy6B,");
        LinkedList<String> linkedList0 = new LinkedList<String>();
        Locale locale0 = Locale.forLanguageTag(",x\"81.k Vy6B,");
        NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, linkedList0, locale0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
        nullPropertyPointer0.createPath(jXPathContext0);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("Cannot set property ");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) variablePointer0);
        Class<Object> class0 = Object.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
        BeanPointer beanPointer0 = new BeanPointer(variablePointer0, qName0, variablePointer0, jXPathBasicBeanInfo0);
        variablePointer0.setValue(beanPointer0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        variablePointer0.setAttribute(true);
        nullPropertyPointer0.createPath(jXPathContext0);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        QName qName0 = new QName("' for pach: ", "' for pach: ");
        Locale locale0 = new Locale("' for pach: ", "1]])jgJQK%L4_W>Q");
        NullPointer nullPointer0 = new NullPointer(locale0, "1]])jgJQK%L4_W>Q");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
        Variables variables0 = jXPathContext0.getVariables();
        VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        Class<Integer> class0 = Integer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
        BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
        variablePointer0.setValue(beanPointer0);
        nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE, (Object) beanPointer0);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("namespace::", "\"<=\"");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Locale locale0 = Locale.ROOT;
        Set<String> set0 = locale0.getUnicodeLocaleKeys();
        List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
        NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, list0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPropertyPointer0);
        NodePointer nodePointer1 = nullPropertyPointer0.createChild(jXPathContext0, qName0, 0);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("namespace::", "\"<=\"");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Locale locale0 = Locale.ROOT;
        Set<String> set0 = locale0.getUnicodeLocaleKeys();
        List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
        NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, list0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nodePointer0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPropertyPointer0);
        NodePointer nodePointer1 = nullPropertyPointer0.createChild(jXPathContext0, qName0, 0);
        nodePointer1.isContainer();
    }

    @Test(timeout = 4000)
    public void test0911() throws Throwable {
        QName qName0 = new QName("' for pach: ", "' for pach: ");
        Locale locale0 = new Locale("' for pach: ", "1]])jgJQK%L4_W>Q");
        NullPointer nullPointer0 = new NullPointer(locale0, "1]])jgJQK%L4_W>Q");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
        Variables variables0 = jXPathContext0.getVariables();
        VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        Class<Integer> class0 = Integer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
        BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
        variablePointer0.setValue(beanPointer0);
        nullPropertyPointer0.createChild(jXPathContext0, qName0, Integer.MIN_VALUE);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        nullPropertyPointer0.setNameAttributeValue(", path does not match a changeable location");
        nullPropertyPointer0.setValue((Object) null);
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName(":)9Fsh1-#qOXattc", "#O~Ht,ic2+0~x.pW");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        NodePointer nodePointer0 = NodePointer.newChildNodePointer(variablePointer0, qName0, ":)9Fsh1-#qOXattc");
        NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Locale locale0 = Locale.ITALY;
        variablePointer0.setIndex((-2576));
        Set<String> set0 = locale0.getUnicodeLocaleKeys();
        Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
        List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
        nullPropertyPointer0.setValue(list0);
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        Locale locale0 = Locale.ITALY;
        NullPointer nullPointer0 = new NullPointer(locale0, "!0:6qMH");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
        QName qName0 = new QName("&apos;", "<<unknown namespace>>");
        Class<BeanPointer> class0 = BeanPointer.class;
        Class<Object> class1 = Object.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
        BeanPointer beanPointer0 = new BeanPointer(qName0, nullPointer0, jXPathBasicBeanInfo0, locale0);
        nullPropertyPointer0.createPath(jXPathContext0, (Object) beanPointer0);
    }

    @Test(timeout = 4000)
    public void test1315() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
        nullPropertyPointer0.createPath(jXPathContext0, (Object) jXPathContext0);
    }

    @Test(timeout = 4000)
    public void test1416() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        Locale locale0 = Locale.forLanguageTag("<<unknown namespace>>");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
        basicVariables0.declareVariable("", (Object) null);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        nullPropertyPointer0.createPath(jXPathContext0);
    }

    @Test(timeout = 4000)
    public void test1517() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.createPath((JXPathContext) null);
    }

    @Test(timeout = 4000)
    public void test1618() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
        nullPropertyPointer0.createPath(jXPathContext0);
    }

    @Test(timeout = 4000)
    public void test1719() throws Throwable {
        QName qName0 = new QName("' for path: ", "");
        Locale locale0 = new Locale("", "1]])jgJQK%L4_W>Q");
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
        Variables variables0 = jXPathContext0.getVariables();
        VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        Class<Integer> class0 = Integer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
        BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
        variablePointer0.setValue(beanPointer0);
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 91, (Object) nullPointer0);
    }

    @Test(timeout = 4000)
    public void test1820() throws Throwable {
        QName qName0 = new QName("' for pach: ", "' for pach: ");
        Locale locale0 = new Locale("' for pach: ", "1]])jgJQK%L4_W>Q");
        NullPointer nullPointer0 = new NullPointer(locale0, "1]])jgJQK%L4_W>Q");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
        Variables variables0 = jXPathContext0.getVariables();
        VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        Class<Integer> class0 = Integer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
        BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
        variablePointer0.setValue(beanPointer0);
        nullPropertyPointer0.createChild(jXPathContext0, qName0, (-889), (Object) null);
    }

    @Test(timeout = 4000)
    public void test1921() throws Throwable {
        NullPointer nullPointer0 = new NullPointer((Locale) null, "org.apache.commons.jxpath.JXPathInvalidAccessException");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        QName qName0 = new QName("");
        nullPropertyPointer0.createChild((JXPathContext) null, qName0, Integer.MIN_VALUE, (Object) "org.apache.commons.jxpath.JXPathInvalidAccessException");
    }

    @Test(timeout = 4000)
    public void test2022() throws Throwable {
        QName qName0 = new QName("$");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        NullPointer nullPointer0 = new NullPointer(variablePointer0, qName0);
        Class<Integer> class0 = Integer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0);
        Locale locale0 = Locale.CHINA;
        BeanPointer beanPointer0 = new BeanPointer(qName0, nullPointer0, jXPathBasicBeanInfo0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) beanPointer0);
        nullPropertyPointer0.createChild(jXPathContext0, qName0, 71, (Object) nullPointer0);
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        QName qName0 = new QName("' for pach: ", "' for pach: ");
        Locale locale0 = new Locale("' for pach: ", "1]])jgJQK%L4_W>Q");
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
        Variables variables0 = jXPathContext0.getVariables();
        VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        Class<Integer> class0 = Integer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, false);
        BeanPointer beanPointer0 = new BeanPointer(qName0, (Object) null, jXPathBasicBeanInfo0, locale0);
        variablePointer0.setValue(beanPointer0);
        nullPropertyPointer0.createChild(jXPathContext0, qName0, (-31));
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        QName qName0 = new QName("MhFw]fUdY$V{;", "MhFw]fUdY$V{;");
        Locale locale0 = Locale.GERMAN;
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
        propertyPointer0.createChild(jXPathContext0, (QName) null, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        QName qName0 = new QName("Factory could not create object path: ");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) ":X^%K\"LVYQV^VRp");
        nullPropertyPointer0.createChild(jXPathContext0, qName0, (-971));
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
        String string0 = nullPropertyPointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        String string0 = nullPropertyPointer0.asPath();
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test2529() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        String string0 = nullPropertyPointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test2630() throws Throwable {
        QName qName0 = new QName("", "");
        VariablePointer variablePointer0 = new VariablePointer(qName0);
        Class<NullPointer> class0 = NullPointer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, true);
        BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, qName0, (Object) null, jXPathBasicBeanInfo0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((JXPathContext) null, (Object) variablePointer0);
        nullPropertyPointer0.createPath(jXPathContext0);
    }

    @Test(timeout = 4000)
    public void test2731() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        Locale locale0 = Locale.forLanguageTag("<<unknown namespace>>");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) locale0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        nullPropertyPointer0.createPath(jXPathContext0);
    }

    @Test(timeout = 4000)
    public void test2832() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, (String) null);
        PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
        ((NullPropertyPointer) propertyPointer0).getValuePointer();
        propertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test2933() throws Throwable {
        QName qName0 = new QName("", "");
        Locale locale0 = Locale.FRANCE;
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        QName qName1 = nullPropertyPointer0.getName();
        qName1.getName();
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        QName qName0 = new QName("", "");
        Locale locale0 = Locale.FRANCE;
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        String string0 = nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test3135() throws Throwable {
        QName qName0 = new QName("&apos;", "&apos;");
        Locale locale0 = Locale.FRANCE;
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.setNameAttributeValue("V'm");
        nullPropertyPointer0.setValue("&apos;");
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.setIndex(0);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test3237() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.setIndex(0);
        nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
        String string0 = nullPropertyPointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test3338() throws Throwable {
        QName qName0 = new QName("");
        Locale locale0 = Locale.FRANCE;
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.setNameAttributeValue("\".\"");
        nullPropertyPointer0.setValue("");
    }

    @Test(timeout = 4000)
    public void test3439() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, "pV1:*J");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.isCollection();
    }

    @Test(timeout = 4000)
    public void test3440() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, "pV1:*J");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.setIndex(0);
        boolean boolean0 = nullPropertyPointer0.isCollection();
    }

    @Test(timeout = 4000)
    public void test3541() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        boolean boolean0 = nullPropertyPointer0.isCollection();
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test3542() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        boolean boolean0 = nullPropertyPointer0.isCollection();
    }

    @Test(timeout = 4000)
    public void test3643() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName(".s+EL;tg^");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        NodePointer nodePointer0 = variablePointer0.createPath((JXPathContext) null, (Object) ".s+EL;tg^");
        NullPointer nullPointer0 = new NullPointer(nodePointer0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        nullPropertyPointer0.createPath((JXPathContext) null, (Object) ".s+EL;tg^");
    }

    @Test(timeout = 4000)
    public void test3744() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("Hc+g{@d?-~EB", "Hc+g{@d?-~EB");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        Locale locale0 = Locale.GERMAN;
        nullPropertyPointer0.setAttribute(true);
        NullPointer nullPointer0 = new NullPointer(locale0, "<<unknown namespace>>");
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
        nullPropertyPointer0.createPath(jXPathContext0, (Object) locale0);
    }

    @Test(timeout = 4000)
    public void test3845() throws Throwable {
        Locale locale0 = Locale.ROOT;
        Class<NullPointer> class0 = NullPointer.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class0);
        BeanPointer beanPointer0 = new BeanPointer((NodePointer) null, (QName) null, locale0, jXPathBasicBeanInfo0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) null);
        nullPropertyPointer0.createChild(jXPathContext0, (QName) null, Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test3946() throws Throwable {
        QName qName0 = new QName("zhFN>#O<r25n <Jd_");
        Class<Object> class0 = Object.class;
        Class<String> class1 = String.class;
        JXPathBasicBeanInfo jXPathBasicBeanInfo0 = new JXPathBasicBeanInfo(class0, class1);
        Locale locale0 = Locale.ITALY;
        BeanPointer beanPointer0 = new BeanPointer(qName0, qName0, jXPathBasicBeanInfo0, locale0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(beanPointer0);
        nullPropertyPointer0.setAttribute(true);
        nullPropertyPointer0.createPath((JXPathContext) null);
    }

    @Test(timeout = 4000)
    public void test4047() throws Throwable {
        Locale locale0 = Locale.UK;
        NullPointer nullPointer0 = new NullPointer(locale0, "u{vZ\"jVhPW");
        PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(propertyPointer0);
        nullPropertyPointer0.setValue((Object) null);
    }

    @Test(timeout = 4000)
    public void test4148() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        boolean boolean0 = nullPropertyPointer0.isActualProperty();
    }

    @Test(timeout = 4000)
    public void test4149() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        boolean boolean0 = nullPropertyPointer0.isActualProperty();
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test4250() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        int int0 = nullPropertyPointer0.getPropertyCount();
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test4251() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        int int0 = nullPropertyPointer0.getPropertyCount();
    }

    @Test(timeout = 4000)
    public void test4352() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("*8$rjbJ", "0Upf-4=\"dp'Plkb0.");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        int int0 = nullPropertyPointer0.getLength();
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test4353() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("*8$rjbJ", "0Upf-4=\"dp'Plkb0.");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        int int0 = nullPropertyPointer0.getLength();
    }

    @Test(timeout = 4000)
    public void test4454() throws Throwable {
        BasicVariables basicVariables0 = new BasicVariables();
        QName qName0 = new QName("Cannot set property ");
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        nullPropertyPointer0.setPropertyIndex(Integer.MIN_VALUE);
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test4555() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        boolean boolean0 = nullPropertyPointer0.isActual();
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test4556() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        boolean boolean0 = nullPropertyPointer0.isActual();
    }

    @Test(timeout = 4000)
    public void test4657() throws Throwable {
        QName qName0 = new QName("' for pach: ", "' for pach: ");
        Locale locale0 = new Locale("' for pach: ", "1]])jgJQK%L4_W>Q");
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
        Variables variables0 = jXPathContext0.getVariables();
        VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        nullPropertyPointer0.createChild(jXPathContext0, qName0, (-31));
    }

    @Test(timeout = 4000)
    public void test4758() throws Throwable {
        QName qName0 = new QName("' for pach: ", "' for pach: ");
        Locale locale0 = new Locale("' for pach: ", "1]])jgJQK%L4_W>Q");
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        JXPathContext jXPathContext0 = JXPathContext.newContext((Object) nullPointer0);
        Variables variables0 = jXPathContext0.getVariables();
        VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        nullPropertyPointer0.getBaseValue();
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test4859() throws Throwable {
        QName qName0 = new QName("Ii|nk8rVVhr");
        Locale locale0 = Locale.GERMANY;
        NullPointer nullPointer0 = new NullPointer(qName0, locale0);
        PropertyPointer propertyPointer0 = nullPointer0.getPropertyPointer();
        propertyPointer0.getImmediateNode();
        propertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test4960() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        String[] stringArray0 = nullPropertyPointer0.getPropertyNames();
    }

    @Test(timeout = 4000)
    public void test4961() throws Throwable {
        Locale locale0 = Locale.CANADA;
        NullPointer nullPointer0 = new NullPointer(locale0, ":Xv");
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(nullPointer0);
        String[] stringArray0 = nullPropertyPointer0.getPropertyNames();
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test5062() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        nullPropertyPointer0.setPropertyName("<<unknown namespace>>");
        nullPropertyPointer0.getIndex();
    }

    @Test(timeout = 4000)
    public void test5163() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        nullPropertyPointer0.setNameAttributeValue("<<unknown namespace>>");
        nullPropertyPointer0.asPath();
    }

    @Test(timeout = 4000)
    public void test5264() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.isLeaf();
    }

    @Test(timeout = 4000)
    public void test5265() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.isLeaf();
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test5366() throws Throwable {
        Object object0 = new Object();
        JXPathContext jXPathContext0 = JXPathContext.newContext(object0);
        Variables variables0 = jXPathContext0.getVariables();
        QName qName0 = new QName("[@name='", "[@name='");
        VariablePointer variablePointer0 = new VariablePointer(variables0, qName0);
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer(variablePointer0);
        nullPropertyPointer0.createChild(jXPathContext0, qName0, (-1380), (Object) null);
    }

    @Test(timeout = 4000)
    public void test5467() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.isContainer();
        nullPropertyPointer0.getPropertyName();
    }

    @Test(timeout = 4000)
    public void test5468() throws Throwable {
        NullPropertyPointer nullPropertyPointer0 = new NullPropertyPointer((NodePointer) null);
        boolean boolean0 = nullPropertyPointer0.isContainer();
    }
}
