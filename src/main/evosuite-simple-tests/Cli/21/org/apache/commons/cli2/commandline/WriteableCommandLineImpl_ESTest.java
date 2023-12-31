/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 23:31:51 GMT 2023
 */
package org.apache.commons.cli2.commandline;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.Command;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.validation.FileValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class WriteableCommandLineImpl_ESTest extends WriteableCommandLineImpl_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        String string0 = writeableCommandLineImpl0.getProperty("-D");
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        Set set0 = writeableCommandLineImpl0.getOptionTriggers();
        assertEquals(0, set0.size());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addProperty("Passes properties and values to the application", "-D");
        writeableCommandLineImpl0.addProperty((Option) propertyOption0, "Passes properties and values to the application", "Passes properties and values to the application");
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        Set set0 = writeableCommandLineImpl0.getProperties();
        assertTrue(set0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getNormalised();
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        LinkedList linkedList1 = (LinkedList) writeableCommandLineImpl0.getValue("-D", (Object) linkedList0);
        assertEquals(0, linkedList1.size());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addOption(propertyOption0);
        List list0 = writeableCommandLineImpl0.getOptions();
        writeableCommandLineImpl0.addValue(propertyOption0, propertyOption0);
        List list1 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) list0);
        assertEquals(1, list1.size());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        propertyOption0.setParent(propertyOption0);
        writeableCommandLineImpl0.addSwitch(propertyOption0, true);
        assertEquals("Passes properties and values to the application", propertyOption0.getDescription());
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        FileValidator fileValidator0 = new FileValidator();
        LinkedList<String> linkedList1 = new LinkedList<String>();
        ArgumentImpl argumentImpl0 = new ArgumentImpl("Passes properties and values to the application", "Passes properties and values to the application", (-2915), (-2915), 'q', 'q', fileValidator0, "Passes properties and values to the application", linkedList1, (-2915));
        writeableCommandLineImpl0.addValue(argumentImpl0, argumentImpl0);
        assertEquals("Passes properties and values to the application", argumentImpl0.getDescription());
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addSwitch(propertyOption0, true);
        // Undeclared exception!
        try {
            writeableCommandLineImpl0.addSwitch(propertyOption0, true);
            fail("Expecting exception: IllegalStateException");
        } catch (IllegalStateException e) {
            //
            // Switch already set.
            //
            verifyException("org.apache.commons.cli2.commandline.WriteableCommandLineImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        LinkedList<Command> linkedList0 = new LinkedList<Command>();
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addSwitch(propertyOption0, false);
        assertFalse(propertyOption0.isRequired());
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        boolean boolean0 = writeableCommandLineImpl0.hasOption("-D");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addOption(propertyOption0);
        boolean boolean0 = writeableCommandLineImpl0.hasOption("-D");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) null);
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) linkedList0);
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.setDefaultValues(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) linkedList0);
        assertEquals(0, list0.size());
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addValue(propertyOption0, (Object) null);
        List list0 = writeableCommandLineImpl0.getUndefaultedValues(propertyOption0);
        assertEquals(1, list0.size());
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getUndefaultedValues(propertyOption0);
        assertTrue(list0.isEmpty());
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        writeableCommandLineImpl0.addSwitch(propertyOption0, true);
        Boolean boolean0 = new Boolean(true);
        Boolean boolean1 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0, boolean0);
        assertNotNull(boolean1);
    }

    @Test(timeout = 4000)
    public void test1920() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        writeableCommandLineImpl0.addSwitch(propertyOption0, true);
        Boolean boolean0 = new Boolean(true);
        Boolean boolean1 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0, boolean0);
        assertTrue(boolean1);
    }

    @Test(timeout = 4000)
    public void test2021() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        Boolean boolean0 = writeableCommandLineImpl0.getSwitch("Passes properties and values to the application");
        assertNull(boolean0);
    }

    @Test(timeout = 4000)
    public void test2122() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addProperty((Option) propertyOption0, "Passes properties and values to the application", "Passes properties and values to the application");
        String string0 = writeableCommandLineImpl0.getProperty("Passes properties and values to the application");
        assertEquals("Passes properties and values to the application", string0);
    }

    @Test(timeout = 4000)
    public void test2223() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addProperty((Option) propertyOption0, "-D", "-D");
        Set set0 = writeableCommandLineImpl0.getProperties((Option) propertyOption0);
        assertEquals(1, set0.size());
    }

    @Test(timeout = 4000)
    public void test2324() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("Passes properties and values to the application");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test2425() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("-D");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test2526() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        linkedList0.add("Passes properties and values to the application");
        linkedList0.add("-D");
        String string0 = writeableCommandLineImpl0.toString();
        assertEquals("\"Passes properties and values to the application\" -D", string0);
    }

    @Test(timeout = 4000)
    public void test2627() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        writeableCommandLineImpl0.setDefaultValues(propertyOption0, (List) null);
        assertFalse(propertyOption0.isRequired());
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        Boolean boolean0 = new Boolean("-D");
        writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, boolean0);
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, (Boolean) null);
        assertEquals(68, propertyOption0.getId());
    }
}
