/*
 * This file was automatically generated by EvoSuite
 * Sat Nov 04 05:32:57 GMT 2023
 */
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.NameAnalyzer;
import com.google.javascript.rhino.Node;
import org.junit.runner.RunWith;

public class NameAnalyzerTest {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("REGULAR", "REGULAR");
        nameAnalyzer0.process(node0, node0);
        String string0 = nameAnalyzer0.getHtmlReport();
        assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 2</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 2</li>\n<li>Referenced Names: 2</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 2</li>\n</ul>ALL NAMES<ul>\n<li><a name=\"Function\">Function</a><ul></li></ul></li><li><a name=\"window\">window</a><ul></li></ul></li></ul></body></html>", string0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        String string0 = nameAnalyzer0.getHtmlReport();
        assertEquals("<html><body><style type=\"text/css\">body, td, p {font-family: Arial; font-size: 83%} ul {margin-top:2px; margin-left:0px; padding-left:1em;} li {margin-top:3px; margin-left:24px; padding-left:0px;padding-bottom: 4px}</style>OVERALL STATS<ul><li>Total Names: 0</li>\n<li>Total Classes: 0</li>\n<li>Total Static Functions: 0</li>\n<li>Referenced Names: 0</li>\n<li>Referenced Classes: 0</li>\n<li>Referenced Functions: 0</li>\n</ul>ALL NAMES<ul>\n</ul></body></html>", string0);
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("RcU=b", "RcU=b");
        nameAnalyzer0.process(node0, node0);
        assertEquals(1, node0.getChildCount());
    }

    @Test(timeout = 4000)
    public void test023() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("RcU=b", "RcU=b");
        nameAnalyzer0.process(node0, node0);
        assertTrue(node0.hasChildren());
    }

    @Test(timeout = 4000)
    public void test034() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
        Node node0 = compiler0.parseSyntheticCode("RG5ULAR", "RG5ULAR");
        Node node1 = new Node(37, node0, node0, node0, 15, 36);
        nameAnalyzer0.process(node1, node1);
        assertFalse(node1.isAdd());
    }

    @Test(timeout = 4000)
    public void test045() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("om", "om");
        Node node1 = new Node(4, node0, node0, node0, (-4096), 2);
        nameAnalyzer0.process(node1, node1);
        assertEquals(39, Node.EMPTY_BLOCK);
    }

    @Test(timeout = 4000)
    public void test056() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("REGULAR", "REGULAR");
        Node node1 = new Node(118, node0, node0, node0, 43, 54);
        // Undeclared exception!
        try {
            nameAnalyzer0.process(node0, node1);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
        }
    }

    @Test(timeout = 4000)
    public void test067() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
        Node node0 = Node.newString("BEFORE_OPTIMIZATION_LOOP");
        Node node1 = new Node(118, node0, node0, node0, 15, 36);
        nameAnalyzer0.process(node1, node1);
        assertFalse(node1.isDelProp());
    }

    @Test(timeout = 4000)
    public void test078() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
        Node node0 = Node.newString("RG5ULAR");
        Node node1 = new Node(108, node0, node0, node0, 15, 36);
        nameAnalyzer0.process(node1, node1);
        assertEquals(48, Node.DIRECTIVES);
    }

    @Test(timeout = 4000)
    public void test089() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("Em", "Em");
        Node node1 = new Node(113, node0, node0, node0, 47, (-1892));
        nameAnalyzer0.process(node0, node1);
        assertTrue(node0.hasOneChild());
    }

    @Test(timeout = 4000)
    public void test0910() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
        Node node0 = compiler0.parseSyntheticCode("RG5ULAR", "RG5ULAR");
        Node node1 = new Node(110, node0, node0, node0, 15, 36);
        nameAnalyzer0.process(node1, node1);
        assertEquals(0, Node.SIDE_EFFECTS_ALL);
    }

    @Test(timeout = 4000)
    public void test1011() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("com.google.javascript.jscomp.NameAnalyzer", "com.google.javascript.jscomp.NameAnalyzer");
        nameAnalyzer0.process(node0, node0);
        assertFalse(node0.isInstanceOf());
    }

    @Test(timeout = 4000)
    public void test1112() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, false);
        Node node0 = compiler0.parseSyntheticCode("window", "window");
        nameAnalyzer0.process(node0, node0);
        assertFalse(node0.isTry());
    }

    @Test(timeout = 4000)
    public void test1213() throws Throwable {
        Compiler compiler0 = new Compiler();
        NameAnalyzer nameAnalyzer0 = new NameAnalyzer(compiler0, true);
        Node node0 = compiler0.parseSyntheticCode("REGULAR", "REGULAR");
        nameAnalyzer0.process(node0, node0);
        nameAnalyzer0.process(node0, node0);
        assertEquals(36, Node.QUOTED_PROP);
    }
}
