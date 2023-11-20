/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 05:22:11 GMT 2023
 */
package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;

public class ParserTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Document document0 = Parser.parseBodyFragment("ws<o/</o^ .RR.5H.3vU", "ws<o/</o^ .RR.5H.3vU");
        document0.baseUri();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Document document0 = Parser.parse("<!", "<!");
        document0.baseUri();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Document document0 = Parser.parseBodyFragment("<![CDATA[", "<![CDATA[");
        document0.baseUri();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Document document0 = Parser.parse("<!--", "<!--");
        document0.isBlock();
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Document document0 = Parser.parse("<?", "<?");
        document0.isBlock();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Document document0 = Parser.parse("#E<!---", "#E<!---");
        document0.baseUri();
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        Document document0 = Parser.parse("</", "</");
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        Document document0 = Parser.parse("q<)--", "q<)--");
        document0.isBlock();
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        Document document0 = Parser.parseBodyFragment("Os<e///>N .RRk5H*3t", "Os<e///>N .RRk5H*3t");
        document0.tagName();
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Document document0 = Parser.parse(" w<b-2$=26~B>", " w<b-2$=26~B>");
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Document document0 = Parser.parse("W<aQ?1Gd='*}xUE;39", "W<aQ?1Gd='*}xUE;39");
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test1111() throws Throwable {
        Document document0 = Parser.parse("/w<4-2y=\"6>zp2B>", "/w<4-2y=\"6>zp2B>");
        document0.isBlock();
    }

    @Test(timeout = 4000)
    public void test1212() throws Throwable {
        Document document0 = Parser.parseBodyFragment("0<b2.=2 ~{L", "0<b2.=2 ~{L");
        document0.baseUri();
    }

    @Test(timeout = 4000)
    public void test1313() throws Throwable {
        Document document0 = Parser.parse("W<y*?1Gd=My}x6H23K", "W<y*?1Gd=My}x6H23K");
        document0.tagName();
    }

    @Test(timeout = 4000)
    public void test1414() throws Throwable {
        Document document0 = Parser.parse("a]Y)<BaSe</Kkt,T~K!Q", "a]Y)<BaSe</Kkt,T~K!Q");
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test1515() throws Throwable {
        Document document0 = Parser.parse("4l]<dXr<B#V5<p@`yF", "4l]<dXr<B#V5<p@`yF");
        document0.isBlock();
    }

    @Test(timeout = 4000)
    public void test1616() throws Throwable {
        Document document0 = Parser.parse("hO/</o/ .yTRk5H3(P", "hO/</o/ .yTRk5H3(P");
        document0.tagName();
    }

    @Test(timeout = 4000)
    public void test1717() throws Throwable {
        Document document0 = Parser.parse("Os<e/</oN .RRk5HP3t", "Os<e/</oN .RRk5HP3t");
        document0.nodeName();
    }
}
