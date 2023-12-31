/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:37:41 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.TreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Parser_ESTest extends Parser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Parser parser0 = Parser.xmlParser();
        parser0.getErrors();
        parser0.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Document document0 = Parser.parseBodyFragmentRelaxed("AfterAttributeName", "");
        document0.baseUri();
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        Parser parser1 = parser0.setTreeBuilder((TreeBuilder) null);
        parser1.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        parser0.getTreeBuilder();
        parser0.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        Document document0 = parser0.parseInput("122B", "p");
        parser0.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        Document document0 = parser0.parseInput("122B", "p");
        document0.baseUri();
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        parser0.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test57() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        parser0.setTrackErrors(1);
        parser0.parseInput("", "");
        parser0.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test68() throws Throwable {
        Document document0 = Parser.parseBodyFragment("h}6Jpv", "h}6Jpv");
        document0.tagName();
    }
}
