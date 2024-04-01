/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 06:02:28 GMT 2023
 */
package org.jsoup.safety;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Cleaner_ESTest extends Cleaner_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Whitelist whitelist0 = Whitelist.basic();
        Cleaner cleaner0 = new Cleaner(whitelist0);
        Document document0 = new Document("");
        Document document1 = cleaner0.clean(document0);
        document1.childNodeSize();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Whitelist whitelist0 = Whitelist.basic();
        Whitelist whitelist1 = whitelist0.addEnforcedAttribute("body", "body", "body");
        Document document0 = Document.createShell("body");
        Cleaner cleaner0 = new Cleaner(whitelist1);
        Document document1 = cleaner0.clean(document0);
        boolean boolean0 = cleaner0.isValid(document1);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Whitelist whitelist0 = Whitelist.none();
        Whitelist whitelist1 = whitelist0.addEnforcedAttribute("body", "body", "body");
        Document document0 = Document.createShell("body");
        Cleaner cleaner0 = new Cleaner(whitelist1);
        Document document1 = cleaner0.clean(document0);
        whitelist0.addEnforcedAttribute("body", "body", "open");
        boolean boolean0 = cleaner0.isValid(document1);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        Whitelist whitelist0 = Whitelist.basic();
        Cleaner cleaner0 = new Cleaner(whitelist0);
        Document document0 = Document.createShell("PbfK}e`)6OKd(YBn");
        document0.text("PbfK}e`)6OKd(YBn");
        boolean boolean0 = cleaner0.isValid(document0);
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        Whitelist whitelist0 = Whitelist.basic();
        Whitelist whitelist1 = whitelist0.addEnforcedAttribute("body", "body", "body");
        Document document0 = Document.createShell("body");
        Whitelist whitelist2 = Whitelist.basicWithImages();
        Cleaner cleaner0 = new Cleaner(whitelist2);
        Cleaner cleaner1 = new Cleaner(whitelist1);
        Document document1 = cleaner1.clean(document0);
        boolean boolean0 = cleaner0.isValid(document1);
    }
}
