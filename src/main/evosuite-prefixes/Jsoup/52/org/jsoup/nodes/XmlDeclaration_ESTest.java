/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:48:50 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class XmlDeclaration_ESTest extends XmlDeclaration_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("", "", true);
        String string0 = xmlDeclaration0.name();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("X>DIw+GL+x_X", "X>DIw+GL+x_X", false);
        String string0 = xmlDeclaration0.toString();
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("X>DIw+GL+x_X", "X>DIw+GL+x_X", false);
        String string0 = xmlDeclaration0.toString();
        xmlDeclaration0.nodeName();
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("xml", "xml", false);
        Node node0 = xmlDeclaration0.attr("xml", "xml");
        node0.attr("<?xml>", "xml");
        String string0 = xmlDeclaration0.toString();
        xmlDeclaration0.nodeName();
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("xml", "xml", false);
        Node node0 = xmlDeclaration0.attr("xml", "xml");
        node0.attr("<?xml>", "xml");
        String string0 = xmlDeclaration0.toString();
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("xml", "xml", true);
        String string0 = xmlDeclaration0.toString();
        xmlDeclaration0.nodeName();
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        XmlDeclaration xmlDeclaration0 = new XmlDeclaration("xml", "xml", true);
        String string0 = xmlDeclaration0.toString();
    }
}
