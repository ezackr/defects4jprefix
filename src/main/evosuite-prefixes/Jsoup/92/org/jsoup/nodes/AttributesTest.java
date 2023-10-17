/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 15 23:47:22 GMT 2023
 */
package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.nio.BufferOverflowException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Iterator;
import java.util.Map;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

public class AttributesTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("U8YW.~\"^", "U8YW.~\"^");
        attributes1.hashCode();
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.clone();
        attributes1.equals((Object) attributes0);
    }

    @Test(timeout = 4000)
    public void test012() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.clone();
        String[] stringArray0 = new String[3];
        attributes1.vals = stringArray0;
        boolean boolean0 = attributes1.equals(attributes0);
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put(")ki7hMBRW]<V", (String) null);
        Attributes attributes1 = new Attributes();
        boolean boolean0 = attributes1.equals(attributes0);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test024() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put(")ki7hMBRW]<V", (String) null);
        Attributes attributes1 = new Attributes();
        boolean boolean0 = attributes1.equals(attributes0);
    }

    @Test(timeout = 4000)
    public void test035() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("multiple", "pS{q6zGQ?+REZy+?Js");
        attributes0.putIgnoreCase("", "");
        attributes0.remove("");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test046() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("`wLY158l %>t}Z", "`wLY158l %>t}Z");
        attributes1.normalize();
        attributes0.put("`wLY158l %>t}Z", true);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test057() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("org.jsoup.nodes.Attributes$Dataset$DatasetIterator", "org.jsoup.nodes.Attributes$Dataset$DatasetIterator");
        Attributes attributes1 = attributes0.put(attribute0);
        attributes0.putIgnoreCase("org.jsoup.nodes.Attributes$Dataset$EntrySet", "org.jsoup.nodes.Attributes$Dataset$EntrySet");
        attributes0.putIgnoreCase("rd@", "");
        attributes0.put("BogusComment", "BogusComment");
        attributes0.put("|", "org.jsoup.nodes.Attributes$Dataset$EntrySet");
        attributes0.addAll(attributes1);
        attributes1.size();
    }

    @Test(timeout = 4000)
    public void test058() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("org.jsoup.nodes.Attributes$Dataset$DatasetIterator", "org.jsoup.nodes.Attributes$Dataset$DatasetIterator");
        Attributes attributes1 = attributes0.put(attribute0);
        attributes0.putIgnoreCase("org.jsoup.nodes.Attributes$Dataset$EntrySet", "org.jsoup.nodes.Attributes$Dataset$EntrySet");
        attributes0.putIgnoreCase("rd@", "");
        attributes0.put("BogusComment", "BogusComment");
        attributes0.put("|", "org.jsoup.nodes.Attributes$Dataset$EntrySet");
        attributes0.addAll(attributes1);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test069() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("Hn$kWK\rx\"", "Hn$kWK\rx\"");
        Attributes attributes1 = attributes0.put(attribute0);
        Attributes attributes2 = attributes1.put("p=EYOsiWJ", "p=EYOsiWJ");
        attributes0.addAll(attributes2);
        attributes1.size();
    }

    @Test(timeout = 4000)
    public void test0610() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("Hn$kWK\rx\"", "Hn$kWK\rx\"");
        Attributes attributes1 = attributes0.put(attribute0);
        Attributes attributes2 = attributes1.put("p=EYOsiWJ", "p=EYOsiWJ");
        attributes0.addAll(attributes2);
        attribute0.getValue();
    }

    @Test(timeout = 4000)
    public void test0711() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("org.jsoup.nodes.Attributes$Dataset", "org.jsoup.nodes.Attributes$Dataset", attributes0);
        Attributes attributes1 = attributes0.put(attribute0);
        int int0 = attributes1.size();
    }

    @Test(timeout = 4000)
    public void test0812() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.clone();
        Attributes attributes2 = attributes1.put("=\"", false);
        attributes1.equals((Object) attributes0);
    }

    @Test(timeout = 4000)
    public void test0813() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.clone();
        Attributes attributes2 = attributes1.put("=\"", false);
        attributes2.put("=\"", "");
        String[] stringArray0 = new String[5];
        stringArray0[0] = "";
        attributes1.keys = stringArray0;
        int int0 = attributes2.indexOfKey("");
    }

    @Test(timeout = 4000)
    public void test0914() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.putIgnoreCase("`EEuNYv:nJ+J{L", (String) null);
        Attributes attributes1 = attributes0.put("b, s&(&qS", true);
        int int0 = attributes1.indexOfKey("b, s&(&qS");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test0915() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.putIgnoreCase("`EEuNYv:nJ+J{L", (String) null);
        Attributes attributes1 = attributes0.put("b, s&(&qS", true);
        int int0 = attributes1.indexOfKey("b, s&(&qS");
    }

    @Test(timeout = 4000)
    public void test1016() throws Throwable {
        Attributes attributes0 = new Attributes();
        int int0 = attributes0.indexOfKey("VMdmBBfd");
    }

    @Test(timeout = 4000)
    public void test1117() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("<!", "org.jsoup.nodes.Attributes$Dataset");
        attributes0.put(attribute0);
        attributes0.html();
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test1218() throws Throwable {
        String string0 = Attributes.checkNotNull("data-");
    }

    @Test(timeout = 4000)
    public void test1319() throws Throwable {
        String string0 = Attributes.checkNotNull("");
    }

    @Test(timeout = 4000)
    public void test1420() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("+ltT_J.-'tJKe6`8;", "8", attributes0);
        Attributes attributes1 = attributes0.put("", "_/Ifd5#$FS:");
        Attributes attributes2 = attributes1.put(attribute0);
        String[] stringArray0 = new String[1];
        attributes2.vals = stringArray0;
        attributes0.toString();
    }

    @Test(timeout = 4000)
    public void test1521() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.removeIgnoreCase((String) null);
    }

    @Test(timeout = 4000)
    public void test1622() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.remove((String) null);
    }

    @Test(timeout = 4000)
    public void test1723() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("gH}6'F/.I3H", true);
        String[] stringArray0 = new String[0];
        attributes1.keys = stringArray0;
        attributes1.remove("4Q");
    }

    @Test(timeout = 4000)
    public void test1824() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.putIgnoreCase((String) null, "org.jsoup.nodes.Attributes$1");
    }

    @Test(timeout = 4000)
    public void test1925() throws Throwable {
        Attributes attributes0 = new Attributes();
        String[] stringArray0 = new String[2];
        attributes0.keys = stringArray0;
        attributes0.putIgnoreCase("id", "");
    }

    @Test(timeout = 4000)
    public void test2026() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("org.jsoup.nodes.Attributes$Dataset$DatasetIterator", "org.jsoup.nodes.Attributes$Dataset$DatasetIterator");
        attributes1.keys = null;
        Attribute attribute0 = new Attribute("org.jsoup.nodes.Attributes$Dataset$DatasetIterator", "", attributes1);
        attributes0.put(attribute0);
    }

    @Test(timeout = 4000)
    public void test2127() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put((Attribute) null);
    }

    @Test(timeout = 4000)
    public void test2228() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = Attribute.createFromEncoded("org.jsoup.nodes.Entities", "t8}n(Ukq@WGX");
        Attributes attributes1 = attributes0.put(attribute0);
        String[] stringArray0 = new String[0];
        attributes1.keys = stringArray0;
        attributes1.put(attribute0);
    }

    @Test(timeout = 4000)
    public void test2329() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.keys = null;
        attributes0.put("data-", true);
    }

    @Test(timeout = 4000)
    public void test2430() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put((String) null, true);
    }

    @Test(timeout = 4000)
    public void test2531() throws Throwable {
        Attributes attributes0 = new Attributes();
        String[] stringArray0 = new String[6];
        attributes0.keys = stringArray0;
        attributes0.put("&ro", true);
    }

    @Test(timeout = 4000)
    public void test2632() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.keys = null;
        attributes0.put(")ki7hMBRW]<V", (String) null);
    }

    @Test(timeout = 4000)
    public void test2733() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put((String) null, (String) null);
    }

    @Test(timeout = 4000)
    public void test2834() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.clone();
        String[] stringArray0 = new String[6];
        attributes1.keys = stringArray0;
        attributes1.put("PBXi|eE-", "");
    }

    @Test(timeout = 4000)
    public void test2935() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("           ", true);
        attributes0.keys = null;
        attributes1.indexOfKey("           ");
    }

    @Test(timeout = 4000)
    public void test3036() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.indexOfKey((String) null);
    }

    @Test(timeout = 4000)
    public void test3137() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("P<;#mYLYgO", "P<;#mYLYgO");
        attributes0.put(attribute0);
        char[] charArray0 = new char[1];
        CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
        CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        attributes0.html((Appendable) charBuffer1, document_OutputSettings0);
    }

    @Test(timeout = 4000)
    public void test3238() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("", true);
        CharBuffer charBuffer0 = CharBuffer.allocate(0);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        attributes1.html((Appendable) charBuffer0, document_OutputSettings0);
    }

    @Test(timeout = 4000)
    public void test3339() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("NI:>qN7", "");
        MockFileWriter mockFileWriter0 = new MockFileWriter("org.jsoup.nodes.Attributes$Dataset$DatasetIterator");
        attributes1.html((Appendable) mockFileWriter0, (Document.OutputSettings) null);
    }

    @Test(timeout = 4000)
    public void test3440() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("t8}n(ukq@wgx", "t8}n(ukq@wgx");
        PipedWriter pipedWriter0 = new PipedWriter();
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        attributes0.html((Appendable) pipedWriter0, document_OutputSettings0);
    }

    @Test(timeout = 4000)
    public void test3541() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.hasKeyIgnoreCase((String) null);
    }

    @Test(timeout = 4000)
    public void test3642() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.hasKey((String) null);
    }

    @Test(timeout = 4000)
    public void test3743() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("c{>}MhF", "V{;JIf<qV8ex5MC#", attributes0);
        Attributes attributes1 = attributes0.put(attribute0);
        attributes1.vals = null;
        attributes1.getIgnoreCase("c{>}MhF");
    }

    @Test(timeout = 4000)
    public void test3844() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.getIgnoreCase((String) null);
    }

    @Test(timeout = 4000)
    public void test3945() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = Attribute.createFromEncoded("'CfB\"E", "u");
        Attributes attributes1 = attributes0.put(attribute0);
        attributes1.keys = null;
        attributes1.get("u");
    }

    @Test(timeout = 4000)
    public void test4046() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.get((String) null);
    }

    @Test(timeout = 4000)
    public void test4147() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("c{>}MhF", "V{;JIf<qV8ex5MC#", attributes0);
        Attributes attributes1 = attributes0.put(attribute0);
        attributes1.vals = null;
        attributes1.clone();
    }

    @Test(timeout = 4000)
    public void test4248() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("Pattern syntax error: ", "p=EYOsiWJ");
        String[] stringArray0 = new String[0];
        attributes1.keys = stringArray0;
        attributes1.asList();
    }

    @Test(timeout = 4000)
    public void test4349() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.addAll((Attributes) null);
    }

    @Test(timeout = 4000)
    public void test4450() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("Hn$kWK\rx\"", "Hn$kWK\rx\"");
        Attributes attributes1 = attributes0.put(attribute0);
        Attributes attributes2 = attributes1.put("org.jsoup.nodes.Attributes$Dataset", false);
        String[] stringArray0 = new String[0];
        attributes2.vals = stringArray0;
        attributes2.addAll(attributes0);
    }

    @Test(timeout = 4000)
    public void test4551() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("8pe,xIGuW1IAB", "8pe,xIGuW1IAB", attributes0);
        Attributes attributes1 = attributes0.put(attribute0);
        StringWriter stringWriter0 = new StringWriter();
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        attributes1.html((Appendable) stringWriter0, document_OutputSettings0);
        stringWriter0.toString();
    }

    @Test(timeout = 4000)
    public void test4552() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("8pe,xIGuW1IAB", "8pe,xIGuW1IAB", attributes0);
        Attributes attributes1 = attributes0.put(attribute0);
        StringWriter stringWriter0 = new StringWriter();
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        attributes1.html((Appendable) stringWriter0, document_OutputSettings0);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test4653() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("", true);
        CharArrayWriter charArrayWriter0 = new CharArrayWriter();
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        BufferedWriter bufferedWriter0 = new BufferedWriter(charArrayWriter0);
        attributes0.html((Appendable) bufferedWriter0, document_OutputSettings0);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test4754() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.remove("");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test4855() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = Attribute.createFromEncoded("D", "dnc4Tc?E");
        Attributes attributes1 = attributes0.put(attribute0);
        attributes1.put("D", "D");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test4956() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("`wLY158l %>t}Z", "`wLY158l %>t}Z");
        attributes0.get("`wLY158l %>t}Z");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test5057() throws Throwable {
        Attributes attributes0 = new Attributes();
        int int0 = attributes0.size();
    }

    @Test(timeout = 4000)
    public void test5158() throws Throwable {
        Attributes attributes0 = new Attributes();
        String string0 = attributes0.html();
    }

    @Test(timeout = 4000)
    public void test5259() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put(")ki7hMBRW]<V", (String) null);
        Attributes attributes2 = attributes1.clone();
        boolean boolean0 = attributes2.equals(attributes0);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test5260() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put(")ki7hMBRW]<V", (String) null);
        Attributes attributes2 = attributes1.clone();
        boolean boolean0 = attributes2.equals(attributes0);
    }

    @Test(timeout = 4000)
    public void test5361() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("Pattern syntax error: ", "p=EYOsiWJ");
        Attributes attributes1 = new Attributes();
        boolean boolean0 = attributes0.equals(attributes1);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test5362() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("Pattern syntax error: ", "p=EYOsiWJ");
        Attributes attributes1 = new Attributes();
        boolean boolean0 = attributes0.equals(attributes1);
    }

    @Test(timeout = 4000)
    public void test5463() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("c{>}MhF", "V{;JIf<qV8ex5MC#", attributes0);
        boolean boolean0 = attributes0.equals(attribute0);
    }

    @Test(timeout = 4000)
    public void test5564() throws Throwable {
        Attributes attributes0 = new Attributes();
        boolean boolean0 = attributes0.equals(attributes0);
    }

    @Test(timeout = 4000)
    public void test5665() throws Throwable {
        Attributes attributes0 = new Attributes();
        boolean boolean0 = attributes0.equals((Object) null);
    }

    @Test(timeout = 4000)
    public void test5766() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put(")ki7hMBRW]<V", (String) null);
        StringWriter stringWriter0 = new StringWriter(516);
        Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
        Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
        Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
        attributes0.html((Appendable) stringWriter0, document_OutputSettings1);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test5867() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("#pZ{>5`Y", true);
        String string0 = attributes1.toString();
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test5868() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("#pZ{>5`Y", true);
        String string0 = attributes1.toString();
    }

    @Test(timeout = 4000)
    public void test5969() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("", "]e(y^RI+KJ3*7S){");
        attributes0.asList();
    }

    @Test(timeout = 4000)
    public void test6070() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("data-", true);
        attributes0.asList();
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test6171() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.addAll(attributes0);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test6272() throws Throwable {
        Attributes attributes0 = new Attributes();
        boolean boolean0 = attributes0.hasKeyIgnoreCase("N=");
    }

    @Test(timeout = 4000)
    public void test6373() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("org.jsoup.nodes.Attributes$ataset", "org.jsoup.nodes.Attributes$ataset");
        boolean boolean0 = attributes0.hasKey("org.jsoup.nodes.Attributes$ataset");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test6374() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.put("org.jsoup.nodes.Attributes$ataset", "org.jsoup.nodes.Attributes$ataset");
        boolean boolean0 = attributes0.hasKey("org.jsoup.nodes.Attributes$ataset");
    }

    @Test(timeout = 4000)
    public void test6475() throws Throwable {
        Attributes attributes0 = new Attributes();
        boolean boolean0 = attributes0.hasKey("0x+@~;3_]jQAqSu.V~");
    }

    @Test(timeout = 4000)
    public void test6576() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("p=EYOsiWJ", true);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test6577() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("p=EYOsiWJ", true);
        attributes1.removeIgnoreCase("p=EYOsiWJ");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test6678() throws Throwable {
        Attributes attributes0 = new Attributes();
        attributes0.removeIgnoreCase("org.jsoup.nodes.Attributes");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test6779() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("", "");
        Attribute attribute0 = new Attribute("lih61#:f\"pf3?`UjC!", "Y\f#\"M)er1yxP", attributes0);
        attributes1.put(attribute0);
        attributes0.remove("");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test6880() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("", "");
        attributes1.put("", true);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test6981() throws Throwable {
        Attributes attributes0 = new Attributes();
        String string0 = attributes0.getIgnoreCase("x");
    }

    @Test(timeout = 4000)
    public void test7082() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("c{>}MhF", "V{;JIf<qV8ex5MC#", attributes0);
        Attributes attributes1 = attributes0.put(attribute0);
        String string0 = attributes1.getIgnoreCase("c{>}MhF");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test7083() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attribute attribute0 = new Attribute("c{>}MhF", "V{;JIf<qV8ex5MC#", attributes0);
        Attributes attributes1 = attributes0.put(attribute0);
        String string0 = attributes1.getIgnoreCase("c{>}MhF");
    }

    @Test(timeout = 4000)
    public void test7184() throws Throwable {
        Attributes attributes0 = new Attributes();
        String string0 = attributes0.get("=c|A'~ ");
    }

    @Test(timeout = 4000)
    public void test7285() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("t8}n(ukq@wgx", "t8}n(ukq@wgx");
        boolean boolean0 = attributes1.hasKeyIgnoreCase("t8}n(ukq@wgx");
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test7286() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("t8}n(ukq@wgx", "t8}n(ukq@wgx");
        boolean boolean0 = attributes1.hasKeyIgnoreCase("t8}n(ukq@wgx");
    }

    @Test(timeout = 4000)
    public void test7387() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("", true);
        Attributes attributes2 = attributes1.put("data-", "S^a,{?Qe+^b2$>");
        Attribute attribute0 = new Attribute("W wh~RG", "`wly158l %>t}z");
        attributes2.put(attribute0);
        Attributes attributes3 = attributes0.clone();
        attributes0.addAll(attributes3);
    }

    @Test(timeout = 4000)
    public void test7488() throws Throwable {
        Attributes attributes0 = new Attributes();
        Attributes attributes1 = attributes0.put("data-", true);
        Attributes attributes2 = attributes0.put("p=EYOsiWJ", true);
        attributes1.put("c95j|26*~ B)Z", "c95j|26*~ B)Z");
        attributes1.addAll(attributes2);
        attributes0.size();
    }

    @Test(timeout = 4000)
    public void test7689() throws Throwable {
        Attributes attributes0 = new Attributes();
        Map<String, String> map0 = attributes0.dataset();
        map0.isEmpty();
    }

    @Test(timeout = 4000)
    public void test7790() throws Throwable {
        Attributes attributes0 = new Attributes();
        Iterator<Attribute> iterator0 = attributes0.iterator();
    }

    @Test(timeout = 4000)
    public void test7891() throws Throwable {
        Attributes attributes0 = new Attributes();
        String string0 = attributes0.toString();
    }
}
