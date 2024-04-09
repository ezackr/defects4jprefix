/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 14:47:46 GMT 2024
 */
package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.lang.WordUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class WordUtils_ESTest extends WordUtils_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        String string0 = WordUtils.capitalize("");
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        String string0 = WordUtils.capitalizeFully("");
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        String string0 = WordUtils.initials("");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        String string0 = WordUtils.wrap((String) null, 1048);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        WordUtils wordUtils0 = new WordUtils();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        String string0 = WordUtils.wrap("7KJ,.bH/A@L,UD5xLc:", 0);
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        String string0 = WordUtils.wrap(";%! o", (-2864), ";%! o", true);
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        String string0 = WordUtils.wrap("\"hvkLo1Gu@F/3z&", 2620);
    }

    @Test(timeout = 4000)
    public void test0810() throws Throwable {
        String string0 = WordUtils.wrap(" ,", (-658));
    }

    @Test(timeout = 4000)
    public void test0912() throws Throwable {
        String string0 = WordUtils.wrap(";%! o", (-2889), ";%! o", false);
    }

    @Test(timeout = 4000)
    public void test1013() throws Throwable {
        char[] charArray0 = new char[10];
        String string0 = WordUtils.capitalizeFully("java.home", charArray0);
    }

    @Test(timeout = 4000)
    public void test1114() throws Throwable {
        String string0 = WordUtils.capitalize((String) null);
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        char[] charArray0 = new char[0];
        String string0 = WordUtils.capitalize(" zB&", charArray0);
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        String string0 = WordUtils.capitalize("Cac OS X");
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        String string0 = WordUtils.capitalizeFully((String) null);
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        char[] charArray0 = new char[0];
        String string0 = WordUtils.capitalizeFully("7KJ,.bH/A@L,UD5xLc:", charArray0);
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        char[] charArray0 = new char[0];
        String string0 = WordUtils.uncapitalize("T$+p", charArray0);
    }

    @Test(timeout = 4000)
    public void test1720() throws Throwable {
        String string0 = WordUtils.uncapitalize((String) null);
    }

    @Test(timeout = 4000)
    public void test1821() throws Throwable {
        String string0 = WordUtils.uncapitalize("");
    }

    @Test(timeout = 4000)
    public void test1922() throws Throwable {
        String string0 = WordUtils.swapCase((String) null);
    }

    @Test(timeout = 4000)
    public void test2023() throws Throwable {
        String string0 = WordUtils.swapCase("cQC|40!,Z2D`'!A0{");
    }

    @Test(timeout = 4000)
    public void test2124() throws Throwable {
        String string0 = WordUtils.swapCase("");
    }

    @Test(timeout = 4000)
    public void test2225() throws Throwable {
        String string0 = WordUtils.swapCase("os.name");
    }

    @Test(timeout = 4000)
    public void test2326() throws Throwable {
        String string0 = WordUtils.initials((String) null);
    }

    @Test(timeout = 4000)
    public void test2427() throws Throwable {
        String string0 = WordUtils.initials("A M%j=>$");
    }

    @Test(timeout = 4000)
    public void test2528() throws Throwable {
        char[] charArray0 = new char[0];
        String string0 = WordUtils.initials("os.name", charArray0);
    }

    @Test(timeout = 4000)
    public void test2629() throws Throwable {
        char[] charArray0 = new char[3];
        String string0 = WordUtils.initials("os.name", charArray0);
    }

    @Test(timeout = 4000)
    public void test2730() throws Throwable {
        char[] charArray0 = new char[1];
        charArray0[0] = 'l';
        String string0 = WordUtils.uncapitalize("java.library.path", charArray0);
    }

    @Test(timeout = 4000)
    public void test2831() throws Throwable {
        String string0 = WordUtils.abbreviate(" ", (-1), (-1), "");
    }

    @Test(timeout = 4000)
    public void test2933() throws Throwable {
        String string0 = WordUtils.abbreviate((String) null, 1048, 1048, (String) null);
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        String string0 = WordUtils.abbreviate("", (-618), (-618), "");
    }

    @Test(timeout = 4000)
    public void test3135() throws Throwable {
        String string0 = WordUtils.abbreviate("HP-UX", 1, 1, "HP-UX");
    }

    @Test(timeout = 4000)
    public void test3236() throws Throwable {
        WordUtils.abbreviate("\"hvkLo1Gu@F/3z&", 2592, 2592, "\"hvkLo1Gu@F/3z&");
    }

    @Test(timeout = 4000)
    public void test3337() throws Throwable {
        String string0 = WordUtils.abbreviate("HP-UX", 5, 5, "HP-UX");
    }

    @Test(timeout = 4000)
    public void test3438() throws Throwable {
        WordUtils.abbreviate(" ", (-618), (-618), " ");
    }
}
