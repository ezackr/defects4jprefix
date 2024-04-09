/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 02:31:21 GMT 2024
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Entities_ESTest extends Entities_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Character character0 = Entities.getCharacterByName(",'dA6g1J$GOZan");
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        String string0 = Entities.unescape("zy^?*=BxLN+>^&S\"@");
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        boolean boolean0 = Entities.isNamedEntity("?");
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        boolean boolean0 = Entities.isNamedEntity("amp");
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        String string0 = Entities.escape("Gzy^?*=BxLN0>^&S\".", document_OutputSettings0);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        String string0 = Entities.unescape("DoubleLongRightArrow");
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        String string0 = Entities.unescape("&(#(x|X)?([0-9a-fA-F]+)|[a-zA-Z]+d*);?", true);
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        String string0 = Entities.unescape("{Y?#&#d\"h_wZ7`,i");
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        String string0 = Entities.unescape("{Y?#&#xd\"h_wZ7`,i", false);
    }

    @Test(timeout = 4000)
    public void test99() throws Throwable {
        String string0 = Entities.unescape("zy*=\"xI+>^&ne\"@");
    }
}
