/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 19 22:50:42 GMT 2023
 */
package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.ErrorCollector;
import com.google.javascript.jscomp.mozilla.rhino.tools.ToolErrorReporter;
import com.google.javascript.jscomp.parsing.Config;
import com.google.javascript.jscomp.parsing.JsDocInfoParser;
import com.google.javascript.jscomp.parsing.JsDocTokenStream;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.junit.runner.RunWith;

public class JsDocInfoParserTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("!,&*/4y1j*'>T()");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "!,&*/4y1j*'>T()", config0, (ErrorReporter) null);
        boolean boolean0 = jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("=V8yK\"&0RFN%]z");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "=V8yK\"&0RFN%]z", config0, (ErrorReporter) null);
        boolean boolean0 = jsDocInfoParser0.hasParsedJSDocInfo();
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("function (");
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("=V8yK\"0RFN%F]z");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "=V8yK\"0RFN%F]z", config0, (ErrorReporter) null);
        JSDocInfo jSDocInfo0 = jsDocInfoParser0.getFileOverviewJSDocInfo();
    }

    @Test(timeout = 4000)
    public void test064() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@*}p=$BV$i6eF");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "@*}p=$BV$i6eF", config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test075() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(e8%bz_,9lPF");
    }

    @Test(timeout = 4000)
    public void test086() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("!,&*/4y1j*'>T()");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "!,&*/4y1j*'>T()", config0, (ErrorReporter) null);
        JSDocInfo jSDocInfo0 = jsDocInfoParser0.retrieveAndResetParsedJSDocInfo();
    }

    @Test(timeout = 4000)
    public void test097() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("@[d-TK1\n");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, false);
        ToolErrorReporter toolErrorReporter0 = new ToolErrorReporter(false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "@[d-TK1\n", config0, toolErrorReporter0);
        boolean boolean0 = jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test108() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(".<");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, ".<", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test119() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(",^XhGZ0g~*");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, ",^XhGZ0g~*", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test1210() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(":!gKmi7n]RSo0u</");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, ":!gKmi7n]RSo0u</", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test1311() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(">!!K)os@ XD$?$l\"#)");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, ">!!K)os@ XD$?$l\"#)", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test1412() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("[JVqvaConstructfrc ");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "[JVqvaConstructfrc ", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test1513() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("{jtb<maUx_3>%");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "{jtb<maUx_3>%", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test1614() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, false);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("(L,VC!F");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "(L,VC!F", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test1715() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("?o+6m\"KHvS");
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "?o+6m\"KHvS", config0, (ErrorReporter) null);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test1816() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("|c+F#6epY-0''knu78");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "|c+F#6epY-0''knu78", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test1917() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("];ejT0&zo~}");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "];ejT0&zo~}", config0, (ErrorReporter) null);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test2018() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, false);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("}i_s-.{*+lkNC^");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "}i_s-.{*+lkNC^", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test2119() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream(")c)TF#69pYJ-D''kn78");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, ")c)TF#69pYJ-D''kn78", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test2220() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("...");
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, false);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "...", config0, (ErrorReporter) null);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test2321() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, false);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("=V8yK\"0RF[?F]z");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "=V8yK\"0RF[?F]z", config0, (ErrorReporter) null);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test2422() throws Throwable {
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("*Y@pv4<=M2C");
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        ErrorCollector errorCollector0 = new ErrorCollector();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "*Y@pv4<=M2C", config0, errorCollector0);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test2523() throws Throwable {
        LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
        Config config0 = new Config((JSTypeRegistry) null, linkedHashSet0, true);
        JsDocTokenStream jsDocTokenStream0 = new JsDocTokenStream("Node cannot be refined. \n");
        JsDocInfoParser jsDocInfoParser0 = new JsDocInfoParser(jsDocTokenStream0, "Node cannot be refined. \n", config0, (ErrorReporter) null);
        jsDocInfoParser0.parse();
    }

    @Test(timeout = 4000)
    public void test2624() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("$&.<NE>");
    }

    @Test(timeout = 4000)
    public void test2625() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("$&.<NE>");
        node0.hasChildren();
    }

    @Test(timeout = 4000)
    public void test2726() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("0&|A|#TTyq2");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test2727() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("0&|A|#TTyq2");
    }

    @Test(timeout = 4000)
    public void test2728() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("0&|A|#TTyq2");
        node0.getChildCount();
    }

    @Test(timeout = 4000)
    public void test2829() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("s%T.<");
    }

    @Test(timeout = 4000)
    public void test2830() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("s%T.<");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test2931() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?VFt;*Hp>:Ng{");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test2932() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?VFt;*Hp>:Ng{");
        node0.getCharno();
    }

    @Test(timeout = 4000)
    public void test2933() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("?VFt;*Hp>:Ng{");
    }

    @Test(timeout = 4000)
    public void test3034() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("!");
    }

    @Test(timeout = 4000)
    public void test3135() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("x?5,mc@y@C");
    }

    @Test(timeout = 4000)
    public void test3136() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("x?5,mc@y@C");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test3237() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("NL6e~7sR!");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test3238() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("NL6e~7sR!");
    }

    @Test(timeout = 4000)
    public void test3339() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("*Y@pv4<=2C");
    }

    @Test(timeout = 4000)
    public void test3340() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("*Y@pv4<=2C");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test3441() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[s,+\n");
    }

    @Test(timeout = 4000)
    public void test3542() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{Eg:n9;5q3 ");
    }

    @Test(timeout = 4000)
    public void test3643() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("null");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test3644() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("null");
    }

    @Test(timeout = 4000)
    public void test3745() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("undefined");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test3746() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("undefined");
    }

    @Test(timeout = 4000)
    public void test3847() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("s%T.<n[w");
    }

    @Test(timeout = 4000)
    public void test3948() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("function");
    }

    @Test(timeout = 4000)
    public void test4049() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("ed`;\"5ha4Hp13I|");
    }

    @Test(timeout = 4000)
    public void test4150() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test4151() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;");
    }

    @Test(timeout = 4000)
    public void test4152() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("(Lorg/mozilla/javascript/Context;)Lorg/mozilla/javascript/RegExpProxy;");
        node0.hasChildren();
    }

    @Test(timeout = 4000)
    public void test4253() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[\n");
    }

    @Test(timeout = 4000)
    public void test4354() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[EJavaConsNr]cttfrc ");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test4355() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[EJavaConsNr]cttfrc ");
    }

    @Test(timeout = 4000)
    public void test4356() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("[EJavaConsNr]cttfrc ");
        node0.getChildCount();
    }

    @Test(timeout = 4000)
    public void test4457() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{'q^eM2rJVlr:@,y9AE");
    }

    @Test(timeout = 4000)
    public void test4558() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{wKbM&}p{$]G>05T2e");
        node0.getType();
    }

    @Test(timeout = 4000)
    public void test4559() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{wKbM&}p{$]G>05T2e");
        node0.hasOneChild();
    }

    @Test(timeout = 4000)
    public void test4560() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{wKbM&}p{$]G>05T2e");
    }

    @Test(timeout = 4000)
    public void test4661() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{QP,dNQ3V>VP*Hf");
    }

    @Test(timeout = 4000)
    public void test4762() throws Throwable {
        Node node0 = JsDocInfoParser.parseTypeString("{");
    }
}
