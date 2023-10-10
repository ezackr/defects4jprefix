/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 20:14:40 GMT 2023
 */
package org.apache.commons.cli2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.ZoneId;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.cli2.Option;
import org.apache.commons.cli2.commandline.WriteableCommandLineImpl;
import org.apache.commons.cli2.option.ArgumentImpl;
import org.apache.commons.cli2.option.GroupImpl;
import org.apache.commons.cli2.option.PropertyOption;
import org.apache.commons.cli2.validation.FileValidator;
import org.apache.commons.cli2.validation.NumberValidator;
import org.junit.runner.RunWith;

public class WriteableCommandLineTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption("", "ys9^{n3Z>7e", (-1751));
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Set<String> set0 = ZoneId.getAvailableZoneIds();
        List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, list0);
        boolean boolean0 = writeableCommandLineImpl0.looksLikeOption("`_}");
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        PropertyOption propertyOption0 = PropertyOption.INSTANCE;
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Locale locale0 = Locale.GERMANY;
        Set<String> set0 = locale0.getUnicodeLocaleAttributes();
        Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
        List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, list0);
        writeableCommandLineImpl0.addOption(propertyOption0);
        assertFalse(propertyOption0.isRequired());
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        GroupImpl groupImpl0 = new GroupImpl(linkedList0, "", ", ", 0, (-475), true);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, linkedList0);
        writeableCommandLineImpl0.setDefaultValues(groupImpl0, linkedList0);
        assertEquals(0, groupImpl0.getMinimum());
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        Boolean boolean0 = writeableCommandLineImpl0.getSwitch((Option) propertyOption0);
        writeableCommandLineImpl0.setDefaultSwitch(propertyOption0, boolean0);
        assertEquals(68, propertyOption0.getId());
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        LinkedList<Locale.LanguageRange> linkedList0 = new LinkedList<Locale.LanguageRange>();
        Locale locale0 = Locale.CHINESE;
        Set<String> set0 = locale0.getUnicodeLocaleAttributes();
        Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
        List<String> list0 = Locale.filterTags((List<Locale.LanguageRange>) linkedList0, (Collection<String>) set0, locale_FilteringMode0);
        GroupImpl groupImpl0 = new GroupImpl(list0, "", "", 0, 0, false);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(groupImpl0, list0);
        List list1 = writeableCommandLineImpl0.getUndefaultedValues(groupImpl0);
        assertTrue(list1.isEmpty());
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        NumberValidator numberValidator0 = NumberValidator.getCurrencyInstance();
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        ArgumentImpl argumentImpl0 = new ArgumentImpl("7%cJjYQ=c", "7%cJjYQ=c", 0, 0, '~', 'I', numberValidator0, "", linkedList0, (-1578));
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(argumentImpl0, linkedList0);
        writeableCommandLineImpl0.addValue(argumentImpl0, "");
        assertEquals("7%cJjYQ=c", argumentImpl0.getDescription());
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        writeableCommandLineImpl0.addSwitch(propertyOption0, false);
        assertEquals("Passes properties and values to the application", propertyOption0.getDescription());
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        NumberValidator numberValidator0 = NumberValidator.getIntegerInstance();
        LinkedList<String> linkedList0 = new LinkedList<String>();
        ArgumentImpl argumentImpl0 = new ArgumentImpl("", "", 4804, 4804, 'O', '/', numberValidator0, "'~.E<@[d@=?ZqzS*AK", linkedList0, 4804);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(argumentImpl0, linkedList0);
        writeableCommandLineImpl0.addProperty((Option) argumentImpl0, "'~.E<@[d@=?ZqzS*AK", "");
        assertEquals(4804, argumentImpl0.getMinimum());
    }

    @Test(timeout = 4000)
    public void test098() throws Throwable {
        PropertyOption propertyOption0 = new PropertyOption("", "", (-640));
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(propertyOption0, linkedList0);
        // Undeclared exception!
        try {
            writeableCommandLineImpl0.looksLikeOption((String) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test109() throws Throwable {
        FileValidator fileValidator0 = FileValidator.getExistingFileInstance();
        LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
        ArgumentImpl argumentImpl0 = new ArgumentImpl("", "", 0, 37, '!', '!', fileValidator0, "", linkedList0, 37);
        WriteableCommandLineImpl writeableCommandLineImpl0 = new WriteableCommandLineImpl(argumentImpl0, linkedList0);
        // Undeclared exception!
        try {
            writeableCommandLineImpl0.addOption((Option) null);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }
}
