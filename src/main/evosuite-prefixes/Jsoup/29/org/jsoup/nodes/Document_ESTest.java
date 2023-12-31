/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 21:16:49 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class Document_ESTest extends Document_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document_OutputSettings0.indentAmount(2);
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Document document0 = new Document("oHk");
        document0.appendText("bgsound");
        document0.append("t)d");
        Document document1 = document0.normalise();
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset("UTF-8");
        document_OutputSettings1.indentAmount();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset("UTF-8");
        document_OutputSettings1.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        boolean boolean0 = document_OutputSettings0.prettyPrint();
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        boolean boolean0 = document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        int int0 = document_OutputSettings0.indentAmount();
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        int int0 = document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        Document document0 = new Document("");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.escapeMode();
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        Document document0 = new Document("");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.escapeMode();
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document_OutputSettings0.encoder();
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test0611() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document_OutputSettings0.encoder();
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test0712() throws Throwable {
        Document document0 = Document.createShell("CS+w+<gieb%dHh`");
        Document document1 = document0.ownerDocument();
        document1.siblingIndex = (-797);
        Element element0 = document1.text("CS+w+<gieb%dHh`");
        element0.nodeName();
    }

    @Test(timeout = 4000)
    public void test0813() throws Throwable {
        Document document0 = new Document("body");
        document0.setSiblingIndex(3560);
        Document.QuirksMode document_QuirksMode0 = Document.QuirksMode.limitedQuirks;
        Document document1 = document0.quirksMode(document_QuirksMode0);
        document1.siblingIndex();
    }

    @Test(timeout = 4000)
    public void test0914() throws Throwable {
        Document document0 = Document.createShell("I5@@B;[A7Q?O 5Lv5");
        document0.setSiblingIndex((-1));
        Document.QuirksMode document_QuirksMode0 = Document.QuirksMode.limitedQuirks;
        Document document1 = document0.quirksMode(document_QuirksMode0);
        document1.siblingIndex();
    }

    @Test(timeout = 4000)
    public void test1015() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document document0 = new Document("&:A!+.>c8Cst/sz?");
        document0.normalise();
        document0.appendChild(document0);
        Document document1 = document0.outputSettings(document_OutputSettings0);
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test1016() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document document0 = new Document("&:A!+.>c8Cst/sz?");
        document0.normalise();
        document0.appendChild(document0);
        Document document1 = document0.outputSettings(document_OutputSettings0);
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test1017() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document document0 = new Document("&:A!+.>c8Cst/sz?");
        document0.normalise();
        document0.appendChild(document0);
        Document document1 = document0.outputSettings(document_OutputSettings0);
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test1118() throws Throwable {
        Document document0 = Document.createShell("/VKt");
        Element element0 = document0.text("/VKt");
        element0.siblingIndex = (-4170);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document document1 = document0.outputSettings(document_OutputSettings0);
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test1119() throws Throwable {
        Document document0 = Document.createShell("/VKt");
        Element element0 = document0.text("/VKt");
        element0.siblingIndex = (-4170);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document document1 = document0.outputSettings(document_OutputSettings0);
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test1120() throws Throwable {
        Document document0 = Document.createShell("/VKt");
        Element element0 = document0.text("/VKt");
        element0.siblingIndex = (-4170);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document document1 = document0.outputSettings(document_OutputSettings0);
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test1221() throws Throwable {
        Document document0 = new Document("");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document0.tagName("title");
        document0.outputSettings(document_OutputSettings0);
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test1222() throws Throwable {
        Document document0 = new Document("");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document0.tagName("title");
        document0.outputSettings(document_OutputSettings0);
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test1323() throws Throwable {
        Document document0 = new Document("Ud_plg[2%b;p>");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document0.outputSettings(document_OutputSettings0);
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test1324() throws Throwable {
        Document document0 = new Document("Ud_plg[2%b;p>");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document0.outputSettings(document_OutputSettings0);
        document_OutputSettings0.prettyPrint(false);
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test1325() throws Throwable {
        Document document0 = new Document("Ud_plg[2%b;p>");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document0.outputSettings(document_OutputSettings0);
        document_OutputSettings0.prettyPrint(false);
        Document.OutputSettings document_OutputSettings1 = document0.outputSettings();
        document_OutputSettings1.indentAmount();
    }

    @Test(timeout = 4000)
    public void test1426() throws Throwable {
        Document document0 = new Document("oHk");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test1427() throws Throwable {
        Document document0 = new Document("oHk");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.indentAmount(0);
        document0.outputSettings(document_OutputSettings1);
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test1428() throws Throwable {
        Document document0 = new Document("oHk");
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.indentAmount(0);
        document0.outputSettings(document_OutputSettings1);
        Document.OutputSettings document_OutputSettings2 = document0.outputSettings();
        document_OutputSettings2.indentAmount();
    }

    @Test(timeout = 4000)
    public void test1529() throws Throwable {
        Document document0 = new Document("title");
        String string0 = document0.outerHtml();
    }

    @Test(timeout = 4000)
    public void test1630() throws Throwable {
        Document document0 = new Document("&:A!+.>c8Cst/sz?");
        Document document1 = document0.normalise();
        Document.QuirksMode document_QuirksMode0 = Document.QuirksMode.noQuirks;
        Document document2 = document1.quirksMode(document_QuirksMode0);
        Document document3 = (Document) document2.appendChild(document0);
        LinkedList<Node> linkedList0 = new LinkedList<Node>();
        document2.childNodes = (List<Node>) linkedList0;
        document3.normalise();
        Document document4 = (Document) document3.text("&:A!+.>c8Cst/sz?");
        document4.nodeName();
    }

    @Test(timeout = 4000)
    public void test1731() throws Throwable {
        Document document0 = Document.createShell("I5@@B;[A7Q?O 5Lv5");
        document0.setSiblingIndex((-1));
        Document document1 = document0.normalise();
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test1832() throws Throwable {
        Document document0 = Document.createShell("colgroup");
        document0.tagName("colgroup");
        Document document1 = document0.normalise();
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test1933() throws Throwable {
        Document document0 = new Document("");
        document0.head();
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test2034() throws Throwable {
        Document document0 = Document.createShell("base");
        Element element0 = document0.createElement("9C|)EX9==:<8p");
        element0.nodeName();
    }

    @Test(timeout = 4000)
    public void test2135() throws Throwable {
        Document document0 = new Document("jYZ9g5LV Ny");
        document0.body();
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test2336() throws Throwable {
        Document document0 = new Document("$VALUES");
        document0.title("$VALUES");
    }

    @Test(timeout = 4000)
    public void test2437() throws Throwable {
        Document document0 = Document.createShell("");
        document0.title((String) null);
    }

    @Test(timeout = 4000)
    public void test2638() throws Throwable {
        Document document0 = new Document(".(<bf7E_[['");
        document0.text("eiU");
    }

    @Test(timeout = 4000)
    public void test2739() throws Throwable {
        Document document0 = Document.createShell("4cylgroup");
        document0.text((String) null);
    }

    @Test(timeout = 4000)
    public void test2840() throws Throwable {
        Document document0 = new Document("extended");
        document0.outputSettings((Document.OutputSettings) null);
    }

    @Test(timeout = 4000)
    public void test2941() throws Throwable {
        Document document0 = Document.createShell("body");
        document0.childNodes = null;
        document0.outerHtml();
    }

    @Test(timeout = 4000)
    public void test3142() throws Throwable {
        Document document0 = Document.createShell("n8B$F");
        document0.childNodes = null;
        document0.head();
    }

    @Test(timeout = 4000)
    public void test3243() throws Throwable {
        Document.createShell((String) null);
    }

    @Test(timeout = 4000)
    public void test3344() throws Throwable {
        Document document0 = new Document("");
        document0.createElement("");
    }

    @Test(timeout = 4000)
    public void test3545() throws Throwable {
        Document document0 = null;
        document0 = new Document((String) null);
    }

    @Test(timeout = 4000)
    public void test3646() throws Throwable {
        Document document0 = Document.createShell("");
        document0.title("");
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test3747() throws Throwable {
        Document document0 = Document.createShell("");
        Element element0 = document0.body();
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test3748() throws Throwable {
        Document document0 = Document.createShell("");
        Element element0 = document0.body();
    }

    @Test(timeout = 4000)
    public void test3849() throws Throwable {
        Document document0 = Document.createShell("73aa");
        String string0 = document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test3950() throws Throwable {
        Document document0 = Document.createShell("E68g,JVlDRY$bK\"z");
        document0.head();
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test4051() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Charset charset0 = Charset.defaultCharset();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset(charset0);
        document_OutputSettings1.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test4052() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Charset charset0 = Charset.defaultCharset();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset(charset0);
        document_OutputSettings1.indentAmount();
    }

    @Test(timeout = 4000)
    public void test4153() throws Throwable {
        Document document0 = new Document("UTF-8");
        Document.QuirksMode document_QuirksMode0 = document0.quirksMode();
    }

    @Test(timeout = 4000)
    public void test4254() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document_OutputSettings0.indentAmount((-4146));
    }

    @Test(timeout = 4000)
    public void test4355() throws Throwable {
        Document document0 = new Document("");
        document0.prependText("");
        Document document1 = document0.normalise();
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test4456() throws Throwable {
        Document document0 = Document.createShell("/VKt");
        document0.title("/VKt");
        document0.title("/VKt");
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test4557() throws Throwable {
        Document document0 = Document.createShell("/VKt");
        document0.title("/VKt");
        document0.title();
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test4658() throws Throwable {
        Document document0 = new Document("oHk");
        String string0 = document0.title();
    }

    @Test(timeout = 4000)
    public void test4759() throws Throwable {
        Document document0 = new Document("oHk");
        Element element0 = document0.append("t)d");
        List<Node> list0 = document0.siblingNodes();
        element0.childNodes = list0;
        document0.normalise();
    }

    @Test(timeout = 4000)
    public void test4860() throws Throwable {
        Document document0 = Document.createShell("/VKt");
        Document document1 = (Document) document0.text("/VKt");
        document1.childNodes = null;
        document1.title();
    }

    @Test(timeout = 4000)
    public void test4961() throws Throwable {
        Document document0 = Document.createShell("colgroup");
        Document document1 = document0.clone();
        document1.appendChild(document0);
        document1.normalise();
        document0.siblingIndex();
    }

    @Test(timeout = 4000)
    public void test5062() throws Throwable {
        Document document0 = new Document("body");
        Element element0 = document0.createElement("body");
        element0.tagName();
    }

    @Test(timeout = 4000)
    public void test5163() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.escapeMode(entities_EscapeMode0);
        document_OutputSettings1.indentAmount();
    }

    @Test(timeout = 4000)
    public void test5164() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.escapeMode(entities_EscapeMode0);
        document_OutputSettings1.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test5265() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document_OutputSettings0.charset();
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test5266() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        document_OutputSettings0.charset();
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test5367() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.clone();
        document_OutputSettings1.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test5368() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.clone();
        document_OutputSettings1.indentAmount();
    }

    @Test(timeout = 4000)
    public void test5369() throws Throwable {
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.clone();
    }

    @Test(timeout = 4000)
    public void test5470() throws Throwable {
        Document document0 = Document.createShell("/VKt");
        document0.title("/VKt");
        String string0 = document0.outerHtml();
    }

    @Test(timeout = 4000)
    public void test5471() throws Throwable {
        Document document0 = Document.createShell("/VKt");
        document0.title("/VKt");
        String string0 = document0.outerHtml();
        document0.nodeName();
    }
}
