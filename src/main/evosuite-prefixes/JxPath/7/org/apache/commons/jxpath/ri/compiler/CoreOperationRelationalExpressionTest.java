/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 07:22:59 GMT 2023
 */
package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMultiply;
import org.junit.runner.RunWith;

public class CoreOperationRelationalExpressionTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Double double0 = new Double(1243.871);
        Constant constant0 = new Constant(double0);
        CoreOperationLessThan coreOperationLessThan0 = new CoreOperationLessThan(constant0, constant0);
        boolean boolean0 = coreOperationLessThan0.isSymmetric();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Constant constant0 = new Constant("$`~]w[SqKW5ra{K'p");
        CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual(constant0, constant0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationEqual0, constant0);
        CoreOperationMultiply coreOperationMultiply0 = new CoreOperationMultiply(coreOperationGreaterThan0, constant0);
        String string0 = coreOperationMultiply0.toString();
    }
}
