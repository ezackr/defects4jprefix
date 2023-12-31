/*
 * This file was automatically generated by EvoSuite
 * Mon Oct 16 00:34:44 GMT 2023
 */
package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Locale;
import org.apache.commons.jxpath.BasicNodeSet;
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
import org.apache.commons.jxpath.ri.axes.RootContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;
import org.apache.commons.jxpath.ri.axes.UnionContext;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.beans.BeanPointer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
public class UnionContext_ESTest extends UnionContext_ESTest_scaffolding {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Object object0 = new Object();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext(object0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        EvalContext[] evalContextArray0 = new EvalContext[8];
        UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
        unionContext0.getPosition();
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BasicNodeSet basicNodeSet0 = new BasicNodeSet();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) basicNodeSet0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        EvalContext[] evalContextArray0 = new EvalContext[3];
        evalContextArray0[0] = (EvalContext) initialContext0;
        evalContextArray0[1] = (EvalContext) initialContext0;
        evalContextArray0[2] = (EvalContext) initialContext0;
        UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
        boolean boolean0 = unionContext0.setPosition(1);
        initialContext0.getPosition();
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BasicNodeSet basicNodeSet0 = new BasicNodeSet();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) basicNodeSet0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        EvalContext[] evalContextArray0 = new EvalContext[3];
        evalContextArray0[0] = (EvalContext) initialContext0;
        evalContextArray0[1] = (EvalContext) initialContext0;
        evalContextArray0[2] = (EvalContext) initialContext0;
        UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
        boolean boolean0 = unionContext0.setPosition(1);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) "org.apache.commons.jxpath.ri.axes.UnionContext");
        QName qName0 = new QName("");
        Locale locale0 = Locale.JAPAN;
        BeanPointer beanPointer0 = (BeanPointer) NodePointer.newNodePointer(qName0, jXPathContextReferenceImpl0, locale0);
        RootContext rootContext0 = new RootContext(jXPathContextReferenceImpl0, beanPointer0);
        EvalContext[] evalContextArray0 = new EvalContext[3];
        evalContextArray0[0] = (EvalContext) rootContext0;
        UnionContext unionContext0 = new UnionContext(rootContext0, evalContextArray0);
        unionContext0.setPosition(Integer.MIN_VALUE);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        BasicNodeSet basicNodeSet0 = new BasicNodeSet();
        NodeSetContext nodeSetContext0 = new NodeSetContext((EvalContext) null, basicNodeSet0);
        QName qName0 = new QName(",,]8t%B");
        NodeNameTest nodeNameTest0 = new NodeNameTest(qName0, "nZBT@;_AfX|");
        DescendantContext descendantContext0 = new DescendantContext(nodeSetContext0, true, nodeNameTest0);
        PrecedingOrFollowingContext precedingOrFollowingContext0 = new PrecedingOrFollowingContext(descendantContext0, nodeNameTest0, true);
        EvalContext[] evalContextArray0 = new EvalContext[2];
        evalContextArray0[0] = (EvalContext) precedingOrFollowingContext0;
        evalContextArray0[1] = (EvalContext) precedingOrFollowingContext0;
        UnionContext unionContext0 = new UnionContext(precedingOrFollowingContext0, evalContextArray0);
        unionContext0.setPosition((-1482));
    }

    @Test(timeout = 4000)
    public void test45() throws Throwable {
        NodeTypeTest nodeTypeTest0 = new NodeTypeTest((-874));
        AttributeContext attributeContext0 = new AttributeContext((EvalContext) null, nodeTypeTest0);
        SelfContext selfContext0 = new SelfContext(attributeContext0, nodeTypeTest0);
        AncestorContext ancestorContext0 = new AncestorContext(selfContext0, true, nodeTypeTest0);
        UnionContext unionContext0 = new UnionContext(ancestorContext0, (EvalContext[]) null);
        unionContext0.getDocumentOrder();
    }

    @Test(timeout = 4000)
    public void test56() throws Throwable {
        Object object0 = new Object();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext(object0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        InitialContext initialContext1 = new InitialContext(initialContext0);
        EvalContext[] evalContextArray0 = new EvalContext[8];
        evalContextArray0[0] = (EvalContext) initialContext1;
        evalContextArray0[1] = (EvalContext) initialContext0;
        UnionContext unionContext0 = new UnionContext(initialContext1, evalContextArray0);
        unionContext0.setPosition(58);
    }

    @Test(timeout = 4000)
    public void test67() throws Throwable {
        Object object0 = new Object();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext(object0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        EvalContext[] evalContextArray0 = new EvalContext[8];
        evalContextArray0[0] = (EvalContext) initialContext0;
        evalContextArray0[1] = (EvalContext) initialContext0;
        evalContextArray0[2] = (EvalContext) initialContext0;
        evalContextArray0[3] = (EvalContext) initialContext0;
        evalContextArray0[4] = (EvalContext) initialContext0;
        evalContextArray0[5] = (EvalContext) initialContext0;
        evalContextArray0[6] = (EvalContext) initialContext0;
        evalContextArray0[7] = (EvalContext) initialContext0;
        UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
        unionContext0.setPosition(58);
        unionContext0.setPosition((-3304));
        unionContext0.getPosition();
    }

    @Test(timeout = 4000)
    public void test78() throws Throwable {
        Object object0 = new Object();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext(object0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        InitialContext initialContext1 = new InitialContext(initialContext0);
        EvalContext[] evalContextArray0 = new EvalContext[2];
        evalContextArray0[0] = (EvalContext) initialContext0;
        evalContextArray0[1] = (EvalContext) initialContext1;
        UnionContext unionContext0 = new UnionContext(initialContext1, evalContextArray0);
        boolean boolean0 = unionContext0.hasNext();
        initialContext1.getPosition();
    }

    @Test(timeout = 4000)
    public void test79() throws Throwable {
        Object object0 = new Object();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext(object0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        InitialContext initialContext1 = new InitialContext(initialContext0);
        EvalContext[] evalContextArray0 = new EvalContext[2];
        evalContextArray0[0] = (EvalContext) initialContext0;
        evalContextArray0[1] = (EvalContext) initialContext1;
        UnionContext unionContext0 = new UnionContext(initialContext1, evalContextArray0);
        boolean boolean0 = unionContext0.hasNext();
    }

    @Test(timeout = 4000)
    public void test810() throws Throwable {
        EvalContext[] evalContextArray0 = new EvalContext[0];
        UnionContext unionContext0 = new UnionContext((EvalContext) null, evalContextArray0);
        int int0 = unionContext0.getDocumentOrder();
    }

    @Test(timeout = 4000)
    public void test911() throws Throwable {
        BasicNodeSet basicNodeSet0 = new BasicNodeSet();
        JXPathContextReferenceImpl jXPathContextReferenceImpl0 = (JXPathContextReferenceImpl) JXPathContext.newContext((Object) basicNodeSet0);
        InitialContext initialContext0 = (InitialContext) jXPathContextReferenceImpl0.getAbsoluteRootContext();
        EvalContext[] evalContextArray0 = new EvalContext[2];
        UnionContext unionContext0 = new UnionContext(initialContext0, evalContextArray0);
        int int0 = unionContext0.getDocumentOrder();
    }
}
