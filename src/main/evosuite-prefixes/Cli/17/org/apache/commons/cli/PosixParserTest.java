/*
 * This file was automatically generated by EvoSuite
 * Tue Oct 10 20:10:46 GMT 2023
 */
package org.apache.commons.cli;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.junit.runner.RunWith;

public class PosixParserTest {

    @Test(timeout = 4000)
    public void test010() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        String[] stringArray0 = new String[0];
        String[] stringArray1 = posixParser0.flatten((Options) null, stringArray0, true);
        stringArray1.equals((Object) stringArray0);
    }

    @Test(timeout = 4000)
    public void test021() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        posixParser0.burstToken("_?pID9k@[EV-SwopsG", true);
    }

    @Test(timeout = 4000)
    public void test042() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[9];
        stringArray0[0] = "-,";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
    }

    @Test(timeout = 4000)
    public void test073() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[10];
        stringArray0[0] = ",";
        String[] stringArray1 = posixParser0.flatten(options0, stringArray0, true);
    }

    @Test(timeout = 4000)
    public void test084() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        options0.addOption("", "' was specified but an option from this group ", false, "Rv'U[G");
        String[] stringArray0 = new String[6];
        stringArray0[0] = "Rv'U[G";
        stringArray0[1] = "--";
        stringArray0[2] = "-' was specified but an option from this group ";
        posixParser0.flatten(options0, stringArray0, false);
    }

    @Test(timeout = 4000)
    public void test095() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[6];
        stringArray0[0] = "Rv'U[G";
        stringArray0[1] = "--";
        stringArray0[2] = "-' was specified but an option from this group ";
        stringArray0[3] = "-N";
        posixParser0.flatten(options0, stringArray0, false);
    }

    @Test(timeout = 4000)
    public void test106() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[8];
        stringArray0[0] = "--=z6Z;9c|}D_2";
        posixParser0.flatten(options0, stringArray0, true);
    }

    @Test(timeout = 4000)
    public void test117() throws Throwable {
        PosixParser posixParser0 = new PosixParser();
        Options options0 = new Options();
        String[] stringArray0 = new String[7];
        stringArray0[0] = "-";
        posixParser0.flatten(options0, stringArray0, false);
    }
}
