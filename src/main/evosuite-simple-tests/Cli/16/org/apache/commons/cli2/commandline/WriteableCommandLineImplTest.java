/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 23:13:13 GMT 2023
 */
package org.apache.commons.cli2.commandline;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.option.SourceDestArgument;
import org.apache.commons.cli2.validation.DateValidator;
import org.apache.commons.cli2.validation.NumberValidator;
import org.apache.commons.cli2.validation.Validator;
import org.junit.runner.RunWith;

public class WriteableCommandLineImplTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        String string0 = writeableCommandLineImpl0.getProperty("-D");
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        Set set0 = writeableCommandLineImpl0.getOptionTriggers();
        assertEquals(0, set0.size());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        NumberValidator numberValidator0 = NumberValidator.getPercentInstance();
        LinkedList<DefaultOption> linkedList0 = new LinkedList<DefaultOption>();
        ArgumentImpl argumentImpl0 = new ArgumentImpl("Passes properties and values to the application", "Passes properties and values to the application", 0, 0, 'e', 'e', numberValidator0, "Passes properties and values to the application", linkedList0, 'e');
        SourceDestArgument sourceDestArgument0 = new SourceDestArgument(argumentImpl0, argumentImpl0, '\u0000', 'z', "Passes properties and values to the application", linkedList0);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(sourceDestArgument0, linkedList0);
        writeableCommandLineImpl0.addProperty("--", "--");
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        writeableCommandLineImpl0.addProperty((Option) propertyOption0, "Passes properties and values to the application", "Passes properties and values to the application");
        assertEquals("-D", propertyOption0.getPreferredName());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        Set set0 = writeableCommandLineImpl0.getProperties();
        assertEquals(0, set0.size());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        int int0 = writeableCommandLineImpl0.getOptionCount((Option) propertyOption0);
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getNormalised();
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addValue(propertyOption0, propertyOption0);
        writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
        assertEquals(0, linkedList0.size());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        DateValidator dateValidator0 = DateValidator.getDateInstance();
        LinkedList<ArgumentImpl> linkedList0 = new LinkedList<ArgumentImpl>();
        ArgumentImpl argumentImpl0 = new ArgumentImpl((String) null, (String) null, 0, 34, 'j', 'j', dateValidator0, "", linkedList0, 0);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(argumentImpl0, linkedList0);
        writeableCommandLineImpl0.addSwitch(argumentImpl0, true);
        // Undeclared exception!
        try {
            writeableCommandLineImpl0.addSwitch(argumentImpl0, false);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Switch already set.
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<DefaultOption> linkedList0 = new LinkedList<DefaultOption>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addSwitch(propertyOption0, false);
        Boolean boolean0 = Boolean.FALSE;
        Boolean boolean1 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0, boolean0);
        assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<DefaultOption> linkedList0 = new LinkedList<DefaultOption>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addSwitch(propertyOption0, false);
        Boolean boolean0 = Boolean.FALSE;
        Boolean boolean1 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0, boolean0);
        assertNotNull(boolean1);
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        boolean boolean0 = writeableCommandLineImpl0.hasOption("Passes properties and values to the application");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        DateValidator dateValidator0 = DateValidator.getDateTimeInstance();
        LinkedList<Properties> linkedList0 = new LinkedList<Properties>();
        ArgumentImpl argumentImpl0 = new ArgumentImpl((String) null, ",C", (-2665), (-2665), 'r', 'S', dateValidator0, (String) null, linkedList0, (-2665));
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(argumentImpl0, linkedList0);
        Integer integer0 = new Integer((-2665));
        writeableCommandLineImpl0.addValue(argumentImpl0, integer0);
        boolean boolean0 = writeableCommandLineImpl0.hasOption((Option) argumentImpl0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) null);
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        ArgumentImpl argumentImpl0 = new ArgumentImpl("Passes properties and values to the application", "-D", (-24668197), (-24668197), 'r', 'r', (Validator) null, "Passes properties and values to the application", linkedList0, (-24668197));
        List list0 = writeableCommandLineImpl0.getValues((Option) argumentImpl0, (List) linkedList0);
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test1314() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) propertyOption0);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) linkedList0);
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test1415() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.setDefaultValues(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) linkedList0);
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1516() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) propertyOption0);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) linkedList0);
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test1617() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) propertyOption0);
        linkedList0.add((Object) propertyOption0);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) linkedList0);
        assertEquals(2, list0.size());
    }

    @Test(timeout = 4000)
    public void test1718() throws Throwable {
        NumberValidator numberValidator0 = NumberValidator.getPercentInstance();
        LinkedList<DefaultOption> linkedList0 = new LinkedList<DefaultOption>();
        ArgumentImpl argumentImpl0 = new ArgumentImpl("Passes properties and values to the application", "Passes properties and values to the application", 5, 5, 'f', 'f', numberValidator0, "Passes properties and values to the application", linkedList0, 'f');
        SourceDestArgument sourceDestArgument0 = new SourceDestArgument(argumentImpl0, argumentImpl0, 'f', '\u0000', "Passes properties and values to the application", linkedList0);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(sourceDestArgument0, linkedList0);
        writeableCommandLineImpl0.addValue(sourceDestArgument0, numberValidator0);
        List list0 = writeableCommandLineImpl0.getUndefaultedValues(sourceDestArgument0);
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test1819() throws Throwable {
        NumberValidator numberValidator0 = NumberValidator.getPercentInstance();
        LinkedList<DefaultOption> linkedList0 = new LinkedList<DefaultOption>();
        ArgumentImpl argumentImpl0 = new ArgumentImpl("Passes properties and values to the application", "Passes properties and values to the application", 0, 0, 'e', 'e', numberValidator0, "Passes properties and values to the application", linkedList0, 'e');
        SourceDestArgument sourceDestArgument0 = new SourceDestArgument(argumentImpl0, argumentImpl0, 'e', '\u0000', "Passes properties and values to the application", linkedList0);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(sourceDestArgument0, linkedList0);
        List list0 = writeableCommandLineImpl0.getUndefaultedValues(sourceDestArgument0);
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<DefaultOption> linkedList0 = new LinkedList<DefaultOption>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        Boolean boolean0 = Boolean.FALSE;
        Boolean boolean1 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0, boolean0);
        assertFalse(boolean1);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        Boolean boolean0 = writeableCommandLineImpl0.getSwitch("-D");
        assertNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addProperty((Option) propertyOption0, "-D", "Passes properties and values to the application");
        String string0 = writeableCommandLineImpl0.getProperty("-D");
        assertEquals("Passes properties and values to the application", string0);
    }

    @Test(timeout = 4000)
    public void test2123() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addProperty((Option) propertyOption0, "-D", "Passes properties and values to the application");
        String string0 = writeableCommandLineImpl0.getProperty("-D");
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test2224() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addProperty((Option) propertyOption0, "Argument.too.few.defaults", "-D");
        Set set0 = writeableCommandLineImpl0.getProperties((Option) propertyOption0);
        assertFalse(set0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test2325() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("Passes properties and values to the application");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2426() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("-D");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2527() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) "Passes properties and values to the application");
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        String string0 = writeableCommandLineImpl0.toString();
        assertEquals("\"Passes properties and values to the application\"", string0);
    }

    @Test(timeout = 4000)
    public void test2628() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) "org.apache.commons.cli2.option.SourceDestArgument");
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        String string0 = writeableCommandLineImpl0.toString();
        assertEquals("org.apache.commons.cli2.option.SourceDestArgument", string0);
    }

    @Test(timeout = 4000)
    public void test2729() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) "org.apache.commons.cli2.option.SourceDestArgument");
        Properties properties0 = new Properties();
        linkedList0.add((Object) properties0);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        // Undeclared exception!
        try {
            writeableCommandLineImpl0.toString();
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // java.util.Properties cannot be cast to java.lang.String
        }
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        writeableCommandLineImpl0.setDefaultValues(propertyOption0, (List) null);
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        Boolean boolean0 = Boolean.TRUE;
        writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, boolean0);
        assertEquals("Passes properties and values to the application", propertyOption0.getDescription());
    }

    @Test(timeout = 4000)
    public void test3032() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, (Boolean) null);
        assertEquals("Passes properties and values to the application", propertyOption0.getDescription());
    }
}
