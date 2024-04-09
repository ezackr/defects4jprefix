/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 01:20:09 GMT 2024
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class Node_ESTest extends Node_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Comment comment0 = new Comment("org.jVou8.no&es.Now$OuteeHtmHV(sito", "org.jVou8.no&es.Now$OuteeHtmHV(sito");
        comment0.setBaseUri("org.jVou8.no&es.Now$OuteeHtmHV(sito");
        comment0.nodeName();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Document document0 = new Document("org.jsou8.nodes.Nowe$OuterHtmlV(sito+");
        document0.attr("org.jsou8.nodes.Nowe$OuterHtmlV(sito+", "org.jsou8.nodes.Nowe$OuterHtmlV(sito+");
        String string0 = document0.absUrl("org.jsou8.nodes.Nowe$OuterHtmlV(sito+");
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("org.jsoup.nodes.Node$OuterHtmlVisitor", "org.jsoup.nodes.Node$OuterHtmlVisitor");
        Node node0 = textNode0.removeAttr("org.jsoup.nodes.Node$OuterHtmlVisitor");
        node0.baseUri();
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        Document document0 = Document.createShell("abs:b\"}az1njrix%s?s");
        document0.replaceWith(document0);
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        Document document0 = new Document("|$+kkY&NC1%.#p*F?U");
        document0.siblingNodes();
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        Document document0 = new Document("+?");
        document0.siblingIndex();
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        Document document0 = new Document("+?");
        Element element0 = document0.prepend("+?");
        String string0 = element0.toString();
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Document document0 = new Document("|$+kkY&NC1%.#p*F?U");
        document0.remove();
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("org.jsoup.nodes.Node$OuterHtmlVisitor", "org.jsoup.nodes.Node$OuterHtmlVisitor");
        textNode0.toString();
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("org.jsoup.nodes.Node$OuterHtmlVisitor", "org.jsoup.nodes.Node$OuterHtmlVisitor");
        Attributes attributes0 = textNode0.attributes();
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        Document document0 = Document.createShell("abs:b\"}az1njrix%s?s");
        String string0 = document0.absUrl("abs:b\"}az1njrix%s?s");
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("q.\"b", "q.\"b");
        Document document0 = Document.createShell("q.\"b");
        Element element0 = document0.body();
    }

    @Test(timeout = 4000)
    public void test1012() throws Throwable {
        TextNode textNode0 = TextNode.createFromEncoded("q.\"b", "q.\"b");
        Document document0 = Document.createShell("q.\"b");
        Element element0 = document0.body();
        element0.setParentNode(textNode0);
        element0.siblingIndex();
    }

    @Test(timeout = 4000)
    public void test1113() throws Throwable {
        Document document0 = new Document("org.jsou8.nodes.Nowe$OuterHtmlV(sito+");
        document0.replaceChild(document0, document0);
    }

    @Test(timeout = 4000)
    public void test1214() throws Throwable {
        Document document0 = Document.createShell("qv*b");
        TextNode textNode0 = TextNode.createFromEncoded("qv*b", "qv*b");
        Document document1 = (Document) document0.appendChild(textNode0);
        document1.replaceChild(textNode0, document0);
        textNode0.siblingIndex();
    }

    @Test(timeout = 4000)
    public void test1215() throws Throwable {
        Document document0 = Document.createShell("qv*b");
        TextNode textNode0 = TextNode.createFromEncoded("qv*b", "qv*b");
        Document document1 = (Document) document0.appendChild(textNode0);
        document1.replaceChild(textNode0, document0);
        document0.siblingIndex();
    }

    @Test(timeout = 4000)
    public void test1316() throws Throwable {
        Document document0 = Document.createShell("abs:b\"}az1njrix%s?s");
        Element element0 = document0.prependElement("abs:b\"}az1njrix%s?s");
        document0.replaceChild(element0, element0);
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test1417() throws Throwable {
        Document document0 = Document.createShell("|$+ky&NC1%.#p*F?U");
        TextNode textNode0 = TextNode.createFromEncoded("|$+ky&NC1%.#p*F?U", "|$+ky&NC1%.#p*F?U");
        textNode0.removeChild(document0);
    }

    @Test(timeout = 4000)
    public void test1518() throws Throwable {
        Document document0 = new Document("org.jsoup.nodes.Node$OuterHtmlVisitor");
        DataNode dataNode0 = new DataNode("org.jsoup.nodes.Node$OuterHtmlVisitor", "org.jsoup.nodes.Node$OuterHtmlVisitor");
        document0.appendChild(dataNode0);
        Node node0 = dataNode0.previousSibling();
    }

    @Test(timeout = 4000)
    public void test1619() throws Throwable {
        Document document0 = Document.createShell("q.\"b");
        Element element0 = document0.body();
        Node node0 = element0.previousSibling();
        node0.siblingIndex();
    }

    @Test(timeout = 4000)
    public void test1620() throws Throwable {
        Document document0 = Document.createShell("q.\"b");
        Element element0 = document0.body();
        Node node0 = element0.previousSibling();
    }

    @Test(timeout = 4000)
    public void test1721() throws Throwable {
        Document document0 = Document.createShell("|$+ky&NC1%.#p*F?U");
        Elements elements0 = document0.getElementsByIndexLessThan((-3811));
        elements0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test1822() throws Throwable {
        TextNode textNode0 = new TextNode("a-bs:\n", "a-bs:\n");
        boolean boolean0 = textNode0.equals(textNode0);
    }

    @Test(timeout = 4000)
    public void test1923() throws Throwable {
        Document document0 = Document.createShell("|$+ky&NC1%.#*F?U");
        Elements elements0 = document0.select("head");
        elements0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test2024() throws Throwable {
        TextNode textNode0 = new TextNode("q.\"b", "q.\"b");
        textNode0.hashCode();
    }

    @Test(timeout = 4000)
    public void test2125() throws Throwable {
        Document document0 = Document.createShell("|$+ky&NC1%.#p*F?U");
        String string0 = document0.toString();
    }
}
