/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:09:30 GMT 2023
 */
package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.jxpath.BasicNodeSet;
import org.apache.commons.jxpath.BasicVariables;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.JXPathContextReferenceImpl;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.axes.AncestorContext;
import org.apache.commons.jxpath.ri.axes.AttributeContext;
import org.apache.commons.jxpath.ri.axes.DescendantContext;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.NodeSetContext;
import org.apache.commons.jxpath.ri.axes.PrecedingOrFollowingContext;
import org.apache.commons.jxpath.ri.axes.PredicateContext;
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.Constant;
import org.apache.commons.jxpath.ri.compiler.CoreFunction;
import org.apache.commons.jxpath.ri.compiler.CoreOperationAdd;
import org.apache.commons.jxpath.ri.compiler.CoreOperationEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan;
import org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual;
import org.apache.commons.jxpath.ri.compiler.CoreOperationMod;
import org.apache.commons.jxpath.ri.compiler.CoreOperationOr;
import org.apache.commons.jxpath.ri.compiler.CoreOperationSubtract;
import org.apache.commons.jxpath.ri.compiler.Expression;
import org.apache.commons.jxpath.ri.compiler.ExpressionPath;
import org.apache.commons.jxpath.ri.compiler.ExtensionFunction;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.ProcessingInstructionTest;
import org.apache.commons.jxpath.ri.compiler.Step;
import org.apache.commons.jxpath.ri.compiler.VariableReference;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.VariablePointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class CoreOperationGreaterThan_ESTest extends CoreOperationGreaterThan_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test000() throws Throwable {
        CoreFunction coreFunction0 = new CoreFunction((-1297), (Expression[]) null);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreFunction0, coreFunction0);
        Object object0 = coreOperationGreaterThan0.computeValue((EvalContext) null);
        assertEquals(false, object0);
    }

    @Test(timeout = 4000)
    public void test011() throws Throwable {
        QName qName0 = new QName("x<`wEYN#a%oLQu'78");
        VariableReference variableReference0 = new VariableReference(qName0);
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) qName0);
        RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, (NodePointer) null);
        InitialContext initialContext0 = (InitialContext) rootContext0.getConstantContext("<<unknown namespace>>");
        ProcessingInstructionTest processingInstructionTest0 = new ProcessingInstructionTest(">");
        DescendantContext descendantContext0 = new DescendantContext(initialContext0, false, processingInstructionTest0);
        CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(variableReference0, variableReference0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationSubtract0, coreOperationSubtract0);
        // Undeclared exception!
        try {
            coreOperationGreaterThan0.computeValue(descendantContext0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // Undefined variable: x<`wEYN#a%oLQu'78
            //
            verifyException("org.apache.commons.jxpath.ri.model.VariablePointer$1", e);
        }
    }

    @Test(timeout = 4000)
    public void test022() throws Throwable {
        Expression[] expressionArray0 = new Expression[3];
        CoreFunction coreFunction0 = new CoreFunction(0, expressionArray0);
        expressionArray0[0] = (Expression) coreFunction0;
        expressionArray0[1] = (Expression) coreFunction0;
        CoreOperationAdd coreOperationAdd0 = new CoreOperationAdd(expressionArray0);
        expressionArray0[2] = (Expression) coreOperationAdd0;
        CoreOperationOr coreOperationOr0 = new CoreOperationOr(expressionArray0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationOr0, expressionArray0[0]);
        PredicateContext predicateContext0 = new PredicateContext((EvalContext) null, coreOperationOr0);
        AttributeContext attributeContext0 = new AttributeContext(predicateContext0, (NodeTest) null);
        PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(attributeContext0, (NodeTest) null, false);
        AncestorContext ancestorContext0 = new AncestorContext(precedingOrFollowingContext0, false, (NodeTest) null);
        // Undeclared exception!
        coreOperationGreaterThan0.computeValue(ancestorContext0);
    }

    @Test(timeout = 4000)
    public void test033() throws Throwable {
        QName qName0 = new QName("ODS Qf$?;i9{MW` qI", ":SQ#JHu?");
        Expression[] expressionArray0 = new Expression[0];
        ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(extensionFunction0, extensionFunction0);
        Integer integer0 = new Integer((-3255));
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) integer0);
        BasicVariables basicVariables0 = new BasicVariables();
        VariablePointer variablePointer0 = new VariablePointer(basicVariables0, qName0);
        RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, variablePointer0);
        InitialContext initialContext0 = (InitialContext) rootContext0.getVariableContext(qName0);
        // Undeclared exception!
        try {
            coreOperationGreaterThan0.computeValue(initialContext0);
            fail("Expecting exception: RuntimeException");
        } catch (RuntimeException e) {
            //
            // Undefined function: ODS Qf$?;i9{MW` qI::SQ#JHu?
            //
            verifyException("org.apache.commons.jxpath.ri.JXPathContextReferenceImpl", e);
        }
    }

    @Test(timeout = 4000)
    public void test044() throws Throwable {
        CoreOperationEqual coreOperationEqual0 = new CoreOperationEqual((Expression) null, (Expression) null);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreOperationEqual0, (Expression) null);
        CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(coreOperationLessThanOrEqual0, coreOperationEqual0);
        Expression[] expressionArray0 = new Expression[7];
        expressionArray0[0] = (Expression) coreOperationSubtract0;
        coreOperationEqual0.args = expressionArray0;
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationSubtract0, coreOperationSubtract0);
        // Undeclared exception!
        try {
            coreOperationGreaterThan0.computeValue((EvalContext) null);
            fail("Expecting exception: StackOverflowError");
        } catch (StackOverflowError e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test055() throws Throwable {
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
        AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, (NodeTest) null);
        SelfContext selfContext0 = new SelfContext(attributeContext0, (NodeTest) null);
        PredicateContext predicateContext0 = new PredicateContext(selfContext0, coreOperationGreaterThan0);
        BasicNodeSet basicNodeSet0 = new BasicNodeSet();
        NodeSetContext nodeSetContext0 = new NodeSetContext(predicateContext0, basicNodeSet0);
        DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, true, (NodeTest) null);
        // Undeclared exception!
        try {
            coreOperationGreaterThan0.computeValue(descendantContext0);
            fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", e);
        }
    }

    @Test(timeout = 4000)
    public void test066() throws Throwable {
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan((Expression) null, (Expression) null);
        Expression[] expressionArray0 = new Expression[0];
        coreOperationGreaterThan0.args = expressionArray0;
        // Undeclared exception!
        try {
            coreOperationGreaterThan0.computeValue((EvalContext) null);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", e);
        }
    }

    @Test(timeout = 4000)
    public void test077() throws Throwable {
        QName qName0 = new QName("");
        Expression[] expressionArray0 = new Expression[3];
        CoreFunction coreFunction0 = new CoreFunction((-1342), expressionArray0);
        CoreOperationLessThanOrEqual coreOperationLessThanOrEqual0 = new CoreOperationLessThanOrEqual(coreFunction0, coreFunction0);
        expressionArray0[0] = (Expression) coreOperationLessThanOrEqual0;
        CoreOperationMod coreOperationMod0 = new CoreOperationMod(coreFunction0, coreFunction0);
        expressionArray0[1] = (Expression) coreOperationMod0;
        Step[] stepArray0 = new Step[1];
        ExtensionFunction extensionFunction0 = new ExtensionFunction(qName0, expressionArray0);
        Expression[] expressionArray1 = new Expression[5];
        ExpressionPath expressionPath0 = new ExpressionPath(extensionFunction0, expressionArray1, stepArray0);
        CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(expressionPath0, expressionArray1[3]);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationSubtract0, expressionArray1[2]);
        // Undeclared exception!
        try {
            coreOperationGreaterThan0.computeValue((EvalContext) null);
            fail("Expecting exception: ArithmeticException");
        } catch (ArithmeticException e) {
            //
            // / by zero
            //
            verifyException("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", e);
        }
    }

    @Test(timeout = 4000)
    public void test088() throws Throwable {
        CoreFunction coreFunction0 = new CoreFunction((-1342), (Expression[]) null);
        Long long0 = new Long((-1342));
        Constant constant0 = new Constant(long0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreFunction0, constant0);
        Object object0 = coreOperationGreaterThan0.computeValue((EvalContext) null);
        assertEquals(true, object0);
    }

    @Test(timeout = 4000)
    public void test099() throws Throwable {
        Constant constant0 = new Constant("L@`Y");
        CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationSubtract0, constant0);
        DescendantContext descendantContext0 = new DescendantContext((EvalContext) null, false, (NodeTest) null);
        EvalContext[] evalContextArray0 = new EvalContext[4];
        UnionContext unionContext0 = new UnionContext(descendantContext0, evalContextArray0);
        Object object0 = coreOperationGreaterThan0.computeValue(unionContext0);
        assertEquals(false, object0);
    }

    @Test(timeout = 4000)
    public void test1010() throws Throwable {
        Constant constant0 = new Constant("L@`Y");
        CoreOperationSubtract coreOperationSubtract0 = new CoreOperationSubtract(constant0, constant0);
        CoreOperationGreaterThan coreOperationGreaterThan0 = new CoreOperationGreaterThan(coreOperationSubtract0, constant0);
        String string0 = coreOperationGreaterThan0.getSymbol();
        assertEquals(">", string0);
    }
}
