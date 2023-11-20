/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:59:49 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.Document;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

public class ParserTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Parser parser0 = Parser.xmlParser();
        HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
        Parser parser1 = parser0.setTreeBuilder(htmlTreeBuilder0);
        parser1.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        String string0 = Parser.unescapeEntities("meta[name=charset]", true);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        Parser parser1 = parser0.settings((ParseSettings) null);
        parser1.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test043() throws Throwable {
        Document document0 = Parser.parseBodyFragment("2f-J<xgD(UpF-F*>KB", "2f-J<xgD(UpF-F*>KB");
        document0.tagName();
    }

    @Test(timeout = 4000)
    public void test054() throws Throwable {
        Document document0 = Parser.parseBodyFragmentRelaxed("", "");
        document0.location();
    }

    @Test(timeout = 4000)
    public void test065() throws Throwable {
        Parser parser0 = Parser.xmlParser();
        parser0.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Parser parser0 = Parser.xmlParser();
        Parser parser1 = parser0.setTrackErrors(1156);
        Document document0 = parser1.parseInput("", "abs:");
        parser0.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Parser parser0 = Parser.xmlParser();
        Parser parser1 = parser0.setTrackErrors(1156);
        Document document0 = parser1.parseInput("", "abs:");
        document0.baseUri();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        parser0.getErrors();
        parser0.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        parser0.getTreeBuilder();
        parser0.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        parser0.settings();
        parser0.isTrackErrors();
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        Parser parser0 = Parser.htmlParser();
        parser0.parseInput("", "");
        parser0.isTrackErrors();
    }
}
