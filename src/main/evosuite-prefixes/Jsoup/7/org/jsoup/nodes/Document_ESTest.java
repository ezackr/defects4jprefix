/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 20:30:30 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
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
        Document document0 = new Document("S2#%*>BG");
        document0.appendText("M[#[[");
        document0.appendText("M[#[[");
        Document document1 = document0.normalise();
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Document document0 = Document.createShell("9B'o{xh");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        boolean boolean0 = document_OutputSettings0.prettyPrint();
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Document document0 = Document.createShell("9B'o{xh");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        boolean boolean0 = document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Document document0 = Document.createShell("l;694tx2:4Q3.eB");
        Document.OutputSettings document_OutputSettings0 = document0.new OutputSettings();
        int int0 = document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Document document0 = Document.createShell("l;694tx2:4Q3.eB");
        Document.OutputSettings document_OutputSettings0 = document0.new OutputSettings();
        int int0 = document_OutputSettings0.indentAmount();
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Document document0 = new Document("~JIwDGvF)zKmbB");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.escapeMode();
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test036() throws Throwable {
        Document document0 = new Document("~JIwDGvF)zKmbB");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.escapeMode();
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test047() throws Throwable {
        Document document0 = new Document("7;~eiyx`f");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.encoder();
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test048() throws Throwable {
        Document document0 = new Document("7;~eiyx`f");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.encoder();
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test059() throws Throwable {
        Document document0 = Document.createShell("bHJ~bQ$h$`6]");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset("UTF-8");
        document_OutputSettings1.indentAmount();
    }

    @Test(timeout = 4000)
    public void test0510() throws Throwable {
        Document document0 = Document.createShell("bHJ~bQ$h$`6]");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset("UTF-8");
        document_OutputSettings1.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test0611() throws Throwable {
        Document document0 = new Document("7;~eiyx`f");
        document0.normalise();
        Element element0 = document0.text("");
        element0.nodeName();
    }

    @Test(timeout = 4000)
    public void test0712() throws Throwable {
        Document document0 = Document.createShell("9B'o{xh");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test0713() throws Throwable {
        Document document0 = Document.createShell("9B'o{xh");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.prettyPrint(false);
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test0714() throws Throwable {
        Document document0 = Document.createShell("9B'o{xh");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.prettyPrint(false);
        Document.OutputSettings document_OutputSettings1 = document0.outputSettings();
        document_OutputSettings1.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test0815() throws Throwable {
        Document document0 = new Document("~{21OC{d_>4wmxR)\"");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test0816() throws Throwable {
        Document document0 = new Document("~{21OC{d_>4wmxR)\"");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.indentAmount(0);
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test0817() throws Throwable {
        Document document0 = new Document("~{21OC{d_>4wmxR)\"");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.indentAmount(0);
        Document.OutputSettings document_OutputSettings1 = document0.outputSettings();
        document_OutputSettings1.indentAmount();
    }

    @Test(timeout = 4000)
    public void test0918() throws Throwable {
        Document document0 = new Document("");
        String string0 = document0.outerHtml();
    }

    @Test(timeout = 4000)
    public void test1019() throws Throwable {
        Document document0 = new Document("Kopf");
        Document document1 = document0.normalise();
        document1.head();
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test1120() throws Throwable {
        Document document0 = Document.createShell("CFrcn=wm`]6U?7!oF~J");
        Element element0 = document0.createElement("head");
        element0.nodeName();
    }

    @Test(timeout = 4000)
    public void test1221() throws Throwable {
        Document document0 = new Document("Kopf");
        Document document1 = document0.normalise();
        Element element0 = document1.body();
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test1222() throws Throwable {
        Document document0 = new Document("Kopf");
        Document document1 = document0.normalise();
        Element element0 = document1.body();
    }

    @Test(timeout = 4000)
    public void test1423() throws Throwable {
        Document document0 = new Document("");
        document0.title("");
    }

    @Test(timeout = 4000)
    public void test1524() throws Throwable {
        Document document0 = Document.createShell("tBz6;U");
        document0.title((String) null);
    }

    @Test(timeout = 4000)
    public void test1725() throws Throwable {
        Document document0 = new Document("harr");
        document0.text("harr");
    }

    @Test(timeout = 4000)
    public void test1926() throws Throwable {
        Document document0 = new Document("");
        document0.childNodes = null;
        document0.normalise();
    }

    @Test(timeout = 4000)
    public void test2027() throws Throwable {
        Document.createShell((String) null);
    }

    @Test(timeout = 4000)
    public void test2128() throws Throwable {
        Document document0 = Document.createShell("html");
        document0.createElement("");
    }

    @Test(timeout = 4000)
    public void test2229() throws Throwable {
        Document document0 = null;
        document0 = new Document((String) null);
    }

    @Test(timeout = 4000)
    public void test2330() throws Throwable {
        Document document0 = new Document("Kopf");
        Element element0 = document0.createElement(",V^6EmI&E");
        document0.prependChild(element0);
        element0.tagName();
    }

    @Test(timeout = 4000)
    public void test2331() throws Throwable {
        Document document0 = new Document("Kopf");
        Element element0 = document0.createElement(",V^6EmI&E");
        document0.prependChild(element0);
        Element element1 = document0.head();
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test2332() throws Throwable {
        Document document0 = new Document("Kopf");
        Element element0 = document0.createElement(",V^6EmI&E");
        document0.prependChild(element0);
        Element element1 = document0.head();
    }

    @Test(timeout = 4000)
    public void test2433() throws Throwable {
        Document document0 = Document.createShell("Eta");
        document0.prependText("ziL8N5Xye})SGoac");
        Document document1 = document0.normalise();
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test2534() throws Throwable {
        Document document0 = new Document("Kopf");
        Element element0 = document0.body();
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test2535() throws Throwable {
        Document document0 = new Document("Kopf");
        Element element0 = document0.body();
    }

    @Test(timeout = 4000)
    public void test2636() throws Throwable {
        Document document0 = new Document("Kopf");
        String string0 = document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test2737() throws Throwable {
        Document document0 = Document.createShell("l;694tx2:4Q3.eB");
        Document.OutputSettings document_OutputSettings0 = document0.new OutputSettings();
        document_OutputSettings0.indentAmount(1363);
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test2838() throws Throwable {
        Document document0 = Document.createShell("8K{Eu?>*GR?7");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.indentAmount((-1));
    }

    @Test(timeout = 4000)
    public void test2939() throws Throwable {
        Document document0 = Document.createShell("C");
        document0.appendText((String) null);
        Document document1 = document0.normalise();
        document1.nodeName();
    }

    @Test(timeout = 4000)
    public void test3040() throws Throwable {
        Document document0 = Document.createShell("pWRv[&yJyv!x");
        document0.title("pWRv[&yJyv!x");
        document0.title("pWRv[&yJyv!x");
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test3141() throws Throwable {
        Document document0 = Document.createShell("pWRv[&yJyv!x");
        document0.title("pWRv[&yJyv!x");
        document0.title();
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test3242() throws Throwable {
        Document document0 = Document.createShell("8K{Eu?>*GR?7");
        String string0 = document0.title();
    }

    @Test(timeout = 4000)
    public void test3343() throws Throwable {
        Document document0 = Document.createShell("@qM3");
        document0.text((String) null);
    }

    @Test(timeout = 4000)
    public void test3444() throws Throwable {
        Document document0 = Document.createShell("l;694tx2:4Q3.eB");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        Charset charset0 = Charset.defaultCharset();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset(charset0);
        document_OutputSettings1.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test3445() throws Throwable {
        Document document0 = Document.createShell("l;694tx2:4Q3.eB");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        Charset charset0 = Charset.defaultCharset();
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset(charset0);
        document_OutputSettings1.indentAmount();
    }

    @Test(timeout = 4000)
    public void test3546() throws Throwable {
        Document document0 = Document.createShell("l;694tx2:4Q3.eB");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.escapeMode((Entities.EscapeMode) null);
        document0.title(":68pG[y9?Q{4;Q/PR^");
        document0.outerHtml();
    }

    @Test(timeout = 4000)
    public void test3647() throws Throwable {
        Document document0 = new Document("");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.charset();
        document_OutputSettings0.prettyPrint();
    }

    @Test(timeout = 4000)
    public void test3648() throws Throwable {
        Document document0 = new Document("");
        Document.OutputSettings document_OutputSettings0 = document0.outputSettings();
        document_OutputSettings0.charset();
        document_OutputSettings0.indentAmount();
    }

    @Test(timeout = 4000)
    public void test3749() throws Throwable {
        Document document0 = Document.createShell("l;694tx2:4Q3.eB");
        document0.title("l;694tx2:4Q3.eB");
        String string0 = document0.outerHtml();
        document0.nodeName();
    }

    @Test(timeout = 4000)
    public void test3750() throws Throwable {
        Document document0 = Document.createShell("l;694tx2:4Q3.eB");
        document0.title("l;694tx2:4Q3.eB");
        String string0 = document0.outerHtml();
    }
}
