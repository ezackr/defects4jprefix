/*
 * This file was automatically generated by EvoSuite
 * Sat Apr 06 07:02:00 GMT 2024
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NameAnalyzer;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class NameAnalyzer_ESTest extends NameAnalyzer_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("window", "window");
        nameAnalyzer0.process(node0, node0);
        nameAnalyzer0.process(node0, node0);
        assertFalse(node0.isLocalResultCall());
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("REGULAR", "REGULAR");
        nameAnalyzer0.process(node0, node0);
        String string0 = nameAnalyzer0.getHtmlReport();
        assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>", string0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.graph.GraphColoring", "Z_f6uy4eX=j");
        nameAnalyzer0.process(node0, node0);
        assertTrue(node0.hasChildren());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.graph.GraphColoring", "Z_f6uy4eX=j");
        nameAnalyzer0.process(node0, node0);
        assertTrue(node0.hasOneChild());
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.JsMessageVisitor$MalformedException", "com.google.javascript.jscomp.JsMessageVisitor$MalformedException");
        Node node1 = new Node(37, node0, node0, node0, node0, 2, 57);
        nameAnalyzer0.process(node1, node1);
        assertEquals(57, node1.getCharno());
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
        Node node0 = new Node(118);
        Node node1 = new Node(118, node0, node0, node0, 1, 51);
        nameAnalyzer0.process(node1, node1);
        assertFalse(node1.isDebugger());
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
        Node node0 = Node.newString("com.google.protobuf.GeneratedMessage");
        Node node1 = new Node(4, node0, node0, node0, 53, 46);
        nameAnalyzer0.process(node0, node1);
        assertEquals(1, Node.FLAG_GLOBAL_STATE_UNMODIFIED);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
        Node node0 = new Node(118);
        Node node1 = new Node(49, node0, node0, node0, 30, (-1435));
        nameAnalyzer0.process(node0, node1);
        assertFalse(node0.isDelProp());
    }
}
