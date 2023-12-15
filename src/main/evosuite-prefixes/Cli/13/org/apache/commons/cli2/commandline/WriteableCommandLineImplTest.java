/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 14 23:04:30 GMT 2023
 */
package org.apache.commons.cli2.commandline;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.option.Switch;
import org.apache.commons.cli2.validation.DateValidator;
import org.junit.runner.RunWith;

public class WriteableCommandLineImplTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        String string0 = writeableCommandLineImpl0.getProperty("-D", "Passes properties and values to the application");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        Set set0 = writeableCommandLineImpl0.getOptionTriggers();
        set0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test032() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        Set set0 = writeableCommandLineImpl0.getProperties();
        set0.size();
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        int int0 = writeableCommandLineImpl0.getOptionCount((Option) propertyOption0);
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getNormalised();
        list0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        Object object0 = writeableCommandLineImpl0.getValue("Passes properties and values to the application");
    }

    @Test(timeout = 4000)
    public void test076() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addOption(propertyOption0);
        boolean boolean0 = writeableCommandLineImpl0.hasOption("-D");
    }

    @Test(timeout = 4000)
    public void test087() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
        propertyOption0.isRequired();
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        DateValidator dateValidator0 = DateValidator.getDateInstance();
        ArgumentImpl argumentImpl0 = new ArgumentImpl("Passes properties and values to the application", "Passes properties and values to the application", 1, 1, '#', '#', dateValidator0, "-D", linkedList0, 1);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(argumentImpl0, linkedList0);
        writeableCommandLineImpl0.addValue(argumentImpl0, argumentImpl0);
        argumentImpl0.getMaximum();
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addSwitch(propertyOption0, false);
        writeableCommandLineImpl0.addSwitch(propertyOption0, false);
    }

    @Test(timeout = 4000)
    public void test1110() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        boolean boolean0 = writeableCommandLineImpl0.hasOption("-D");
    }

    @Test(timeout = 4000)
    public void test1211() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addValue(propertyOption0, linkedList0);
        List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) linkedList0);
        list0.size();
    }

    @Test(timeout = 4000)
    public void test1312() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        List list0 = writeableCommandLineImpl0.getValues((Option) propertyOption0, (List) null);
        list0.size();
    }

    @Test(timeout = 4000)
    public void test1413() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption("?", "?", (-30));
        LinkedList<DefaultOption> linkedList0 = new LinkedList<DefaultOption>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addSwitch(propertyOption0, true);
        Boolean boolean0 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0, (Boolean) null);
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption("?", "?", (-30));
        LinkedList<DefaultOption> linkedList0 = new LinkedList<DefaultOption>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addSwitch(propertyOption0, true);
        Boolean boolean0 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0, (Boolean) null);
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        Boolean boolean0 = writeableCommandLineImpl0.getSwitch("Passes properties and values to the application");
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("Passes properties and values to the application");
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("-D");
    }

    @Test(timeout = 4000)
    public void test1818() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        linkedList0.add((Object) "-D");
        String string0 = writeableCommandLineImpl0.toString();
    }

    @Test(timeout = 4000)
    public void test1919() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        linkedList0.add((Object) "Passes properties and values to the application");
        linkedList0.addLast("Passes properties and values to the application");
        String string0 = writeableCommandLineImpl0.toString();
    }

    @Test(timeout = 4000)
    public void test2020() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.setDefaultValues(propertyOption0, linkedList0);
        propertyOption0.getDescription();
    }

    @Test(timeout = 4000)
    public void test2121() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, (List) null);
        writeableCommandLineImpl0.setDefaultValues(propertyOption0, (List) null);
        propertyOption0.getId();
    }

    @Test(timeout = 4000)
    public void test2222() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        Boolean boolean0 = Boolean.TRUE;
        writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, boolean0);
        propertyOption0.getId();
    }

    @Test(timeout = 4000)
    public void test2323() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Switch> linkedList0 = new LinkedList<Switch>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, (Boolean) null);
        propertyOption0.getId();
    }
}
