/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 11 02:00:57 GMT 2023
 */
package org.jfree.chart.imagemap;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator;
import org.junit.runner.RunWith;

public class StandardToolTipTagFragmentGeneratorTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        StandardToolTipTagFragmentGenerator standardToolTipTagFragmentGenerator0 = new StandardToolTipTagFragmentGenerator();
        String string0 = standardToolTipTagFragmentGenerator0.generateToolTipFragment("");
        assertEquals(" title=\"\" alt=\"\"", string0);
    }
}
