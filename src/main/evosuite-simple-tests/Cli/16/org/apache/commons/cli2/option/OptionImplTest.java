/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 21:42:16 GMT 2023
 */
package org.apache.commons.cli2.option;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZoneId;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import org.apache.commons.cli2.Argument;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.WriteableCommandLine;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.Command;
import org.apache.commons.cli2.option.DefaultOption;
import org.apache.commons.cli2.option.GroupImpl;
import org.apache.commons.cli2.option.PropertyOption;
import org.junit.runner.RunWith;

public class OptionImplTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        LinkedHashSet<Command> linkedHashSet0 = new LinkedHashSet<Command>();
        LinkedList<Command> linkedList0 = new LinkedList<Command>();
        GroupImpl groupImpl0 = new GroupImpl(linkedList0, "-D", "Passes properties and values to the application", 37, 37);
        Command command0 = new Command("-D", "-D", linkedHashSet0, true, (Argument) null, groupImpl0, 37);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
        try {
            command0.validate(writeableCommandLineImpl0);
            fail("Expecting exception: Exception");
        } catch (Exception e) {
            //
            // Missing required option -D
        }
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        propertyOption0.defaults((WriteableCommandLine) null);
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        propertyOption0.toString();
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        propertyOption0.toString();
        assertFalse(propertyOption0.isRequired());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        ListIterator<Integer> listIterator0 = linkedList0.listIterator();
        boolean boolean0 = propertyOption0.canProcess((WriteableCommandLine) null, listIterator0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        Integer integer0 = new Integer(60);
        linkedList0.add(integer0);
        ListIterator<Integer> listIterator0 = linkedList0.listIterator();
        // Undeclared exception!
        try {
            propertyOption0.canProcess((WriteableCommandLine) null, listIterator0);
            fail("Expecting exception: ClassCastException");
        } catch (ClassCastException e) {
            //
            // java.lang.Integer cannot be cast to java.lang.String
        }
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        boolean boolean0 = propertyOption0.equals("Passes properties and values to the application");
        assertFalse(propertyOption0.isRequired());
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        boolean boolean0 = propertyOption0.equals("Passes properties and values to the application");
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        boolean boolean0 = propertyOption0.equals("Passes properties and values to the application");
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        PropertyOption propertyOption1 = new PropertyOption("Passes properties and values to the application", "Passes properties and values to the application", 404);
        boolean boolean0 = propertyOption0.equals(propertyOption1);
        assertEquals(404, propertyOption1.getId());
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        PropertyOption propertyOption1 = new PropertyOption("Passes properties and values to the application", "Passes properties and values to the application", 404);
        boolean boolean0 = propertyOption0.equals(propertyOption1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test0611() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        PropertyOption propertyOption1 = new PropertyOption("Passes properties and values to the application", "Passes properties and values to the application", 404);
        boolean boolean0 = propertyOption0.equals(propertyOption1);
        assertFalse(propertyOption1.isRequired());
    }

    @Test(timeout = 4000)
    public void test0712() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption((String) null, (String) null, 15);
        PropertyOption propertyOption1 = new PropertyOption("-D", (String) null, 15);
        boolean boolean0 = propertyOption1.equals(propertyOption0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test0713() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption((String) null, (String) null, 15);
        PropertyOption propertyOption1 = new PropertyOption("-D", (String) null, 15);
        boolean boolean0 = propertyOption1.equals(propertyOption0);
        assertEquals(15, propertyOption1.getId());
    }

    @Test(timeout = 4000)
    public void test0714() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption((String) null, (String) null, 15);
        PropertyOption propertyOption1 = new PropertyOption("-D", (String) null, 15);
        boolean boolean0 = propertyOption1.equals(propertyOption0);
        assertFalse(propertyOption1.isRequired());
    }

    @Test(timeout = 4000)
    public void test0815() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        PropertyOption propertyOption1 = new PropertyOption("-D", "-D", 68);
        boolean boolean0 = propertyOption0.equals(propertyOption1);
        assertEquals(68, propertyOption1.getId());
    }

    @Test(timeout = 4000)
    public void test0816() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        PropertyOption propertyOption1 = new PropertyOption("-D", "-D", 68);
        boolean boolean0 = propertyOption0.equals(propertyOption1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test0817() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        PropertyOption propertyOption1 = new PropertyOption("-D", "-D", 68);
        boolean boolean0 = propertyOption0.equals(propertyOption1);
        assertFalse(propertyOption1.isRequired());
    }

    @Test(timeout = 4000)
    public void test0918() throws Throwable {
        LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
        PropertyOption propertyOption0 = new PropertyOption("G", "G", 0);
        GroupImpl groupImpl0 = new GroupImpl(linkedList0, "G", "G", 0, 0);
        boolean boolean0 = propertyOption0.equals(groupImpl0);
        assertEquals(0, groupImpl0.getId());
    }

    @Test(timeout = 4000)
    public void test0919() throws Throwable {
        LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
        PropertyOption propertyOption0 = new PropertyOption("G", "G", 0);
        GroupImpl groupImpl0 = new GroupImpl(linkedList0, "G", "G", 0, 0);
        boolean boolean0 = propertyOption0.equals(groupImpl0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test0920() throws Throwable {
        LinkedList<PropertyOption> linkedList0 = new LinkedList<PropertyOption>();
        PropertyOption propertyOption0 = new PropertyOption("G", "G", 0);
        GroupImpl groupImpl0 = new GroupImpl(linkedList0, "G", "G", 0, 0);
        boolean boolean0 = propertyOption0.equals(groupImpl0);
        assertFalse(propertyOption0.isRequired());
    }

    @Test(timeout = 4000)
    public void test1021() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption((String) null, (String) null, 15);
        boolean boolean0 = propertyOption0.equals(propertyOption0);
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test1022() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption((String) null, (String) null, 15);
        boolean boolean0 = propertyOption0.equals(propertyOption0);
        assertEquals(15, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test1023() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption((String) null, (String) null, 15);
        boolean boolean0 = propertyOption0.equals(propertyOption0);
        assertFalse(propertyOption0.isRequired());
    }

    @Test(timeout = 4000)
    public void test1124() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        PropertyOption propertyOption1 = new PropertyOption((String) null, (String) null, 68);
        boolean boolean0 = propertyOption1.equals(propertyOption0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1125() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        PropertyOption propertyOption1 = new PropertyOption((String) null, (String) null, 68);
        boolean boolean0 = propertyOption1.equals(propertyOption0);
        assertEquals(68, propertyOption1.getId());
    }

    @Test(timeout = 4000)
    public void test1126() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        PropertyOption propertyOption1 = new PropertyOption((String) null, (String) null, 68);
        boolean boolean0 = propertyOption1.equals(propertyOption0);
        assertFalse(propertyOption1.isRequired());
    }

    @Test(timeout = 4000)
    public void test1227() throws Throwable {
        LinkedList<DefaultOption> linkedList0 = new LinkedList<DefaultOption>();
        GroupImpl groupImpl0 = new GroupImpl(linkedList0, (String) null, (String) null, 1116, 1116);
        groupImpl0.hashCode();
        assertEquals(0, groupImpl0.getId());
    }

    @Test(timeout = 4000)
    public void test1328() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        propertyOption0.hashCode();
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test1429() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        Option option0 = propertyOption0.findOption("Passes properties and values to the application");
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test1430() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        Option option0 = propertyOption0.findOption("Passes properties and values to the application");
        assertFalse(propertyOption0.isRequired());
    }

    @Test(timeout = 4000)
    public void test1431() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        Option option0 = propertyOption0.findOption("Passes properties and values to the application");
        assertNull(option0);
    }

    @Test(timeout = 4000)
    public void test1532() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        Option option0 = propertyOption0.findOption("-D");
        assertNotNull(option0);
    }

    @Test(timeout = 4000)
    public void test1533() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        Option option0 = propertyOption0.findOption("-D");
        assertEquals(68, option0.getId());
    }

    @Test(timeout = 4000)
    public void test1534() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        Option option0 = propertyOption0.findOption("-D");
        assertFalse(option0.isRequired());
    }

    @Test(timeout = 4000)
    public void test1635() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        Set<String> set0 = ZoneId.getAvailableZoneIds();
        // Undeclared exception!
        try {
            propertyOption0.checkPrefixes(set0);
            fail("Expecting exception: IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            //
            // Trigger -D must be prefixed with a value from java.util.HashSet@0000000003
        }
    }

    @Test(timeout = 4000)
    public void test1736() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedHashSet<ArgumentImpl> linkedHashSet0 = new LinkedHashSet<ArgumentImpl>();
        propertyOption0.checkPrefixes(linkedHashSet0);
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test1737() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedHashSet<ArgumentImpl> linkedHashSet0 = new LinkedHashSet<ArgumentImpl>();
        propertyOption0.checkPrefixes(linkedHashSet0);
        assertFalse(propertyOption0.isRequired());
    }

    @Test(timeout = 4000)
    public void test1838() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        linkedHashSet0.add("-D");
        propertyOption0.checkPrefixes(linkedHashSet0);
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test1839() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        linkedHashSet0.add("-D");
        propertyOption0.checkPrefixes(linkedHashSet0);
        assertFalse(propertyOption0.isRequired());
    }
}
