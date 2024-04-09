/*
 * This file was automatically generated by EvoSuite
 * Fri Apr 05 22:45:39 GMT 2024
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true)
public class PosixParser_ESTest extends PosixParser_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Options options0 = new Options();
        String[] stringArray0 = new String[6];
        stringArray0[0] = "-h";
        stringArray0[1] = "";
        options0.addOption("h", "", true, "G}2#Vcd");
        PosixParser posixParser0 = new PosixParser();
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        assertEquals(7, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[2];
        stringArray0[0] = "--=gQZH=Y6eO~=^hi(b";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, false);
        assertEquals(3, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        Options options0 = new Options();
        String[] stringArray0 = new String[6];
        stringArray0[0] = "-h";
        stringArray0[1] = "";
        stringArray0[2] = "--";
        options0.addOption("", true, "");
        PosixParser posixParser0 = new PosixParser();
        // Undeclared exception!
        try {
            posixParser0.flatten(options0, stringArray0, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        options0.addOption("", "--=gQZH=Y6eO~=^hi(b", true, "--=gQZH=Y6eO~=^hi(b");
        String[] stringArray0 = new String[2];
        stringArray0[0] = "--=gQZH=Y6eO~=^hi(b";
        // Undeclared exception!
        try {
            posixParser0.flatten(options0, stringArray0, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test44() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-";
        String[] stringArray1 = posixParser0.flatten((Options) null, stringArray0, true);
        assertEquals(1, stringArray1.length);
    }

    @Test(timeout = 4000)
    public void test55() throws Throwable {
        Options options0 = new Options();
        String[] stringArray0 = new String[6];
        stringArray0[0] = "-h";
        stringArray0[1] = "";
        stringArray0[2] = "- ]";
        PosixParser posixParser0 = new PosixParser();
        Options options1 = options0.addOption("", " ]", false, "---h");
        // Undeclared exception!
        try {
            posixParser0.flatten(options1, stringArray0, false);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test66() throws Throwable {
        Options options0 = new Options();
        String[] stringArray0 = new String[6];
        stringArray0[0] = "-h";
        Options options1 = options0.addOption("", true, "");
        PosixParser posixParser0 = new PosixParser();
        posixParser0.flatten(options1, stringArray0, true);
        posixParser0.burstToken("--", true);
    }

    @Test(timeout = 4000)
    public void test77() throws Throwable {
        Options options0 = new Options();
        options0.addOption("", false, "");
        PosixParser posixParser0 = new PosixParser();
        posixParser0.parse(options0, (String[]) null);
        posixParser0.burstToken("--s", false);
    }

    @Test(timeout = 4000)
    public void test88() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        Options options1 = options0.addOption("h", true, ",`&nI1`Xga.c");
        String[] stringArray0 = new String[1];
        stringArray0[0] = "h";
        posixParser0.flatten(options1, stringArray0, true);
        posixParser0.burstToken("rhAvr}Hm%r0rXZ8h", true);
    }

    @Test(timeout = 4000)
    public void test99() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[1];
        stringArray0[0] = "-+A";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
        assertEquals(2, stringArray1.length);
    }
}
