/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 07:25:47 GMT 2023
 */

package org.apache.commons.jxpath.ri.model.jdom;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Locale;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.ri.model.jdom.JDOMAttributeIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jdom.Element;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JDOMAttributeIterator_ESTest extends JDOMAttributeIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QName qName0 = new QName("S@(", "S@(");
      Locale locale0 = Locale.ITALY;
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, qName0, locale0);
      JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
      int int0 = jDOMAttributeIterator0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      Element element0 = new Element("xml");
      QName qName0 = new QName("xml", "xml");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, element0, locale0);
      JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, jDOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      Element element0 = new Element("Gk", "Gk");
      QName qName0 = new QName("Gk", "Gk");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, element0, locale0);
      JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, jDOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      Element element0 = new Element("Ek", "Ek", "Ek");
      QName qName0 = new QName("Ek");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, element0, locale0);
      NodePointer nodePointer1 = nodePointer0.createAttribute((JXPathContext) null, qName0);
      assertNull(nodePointer1.getNamespaceURI());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Locale locale0 = Locale.UK;
      Element element0 = new Element("F", "F", "F");
      Element element1 = element0.setAttribute("F", "F");
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element1, locale0);
      QName qName0 = new QName("F", "*");
      JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, jDOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      Element element0 = new Element("Gk");
      QName qName0 = new QName("*");
      Element element1 = element0.setAttribute("Gk", "*");
      NodePointer nodePointer0 = NodePointer.newNodePointer(qName0, element1, locale0);
      JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, jDOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Locale locale0 = Locale.UK;
      Element element0 = new Element("F", "F");
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
      QName qName0 = new QName("F");
      JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
      assertEquals(0, jDOMAttributeIterator0.getPosition());
      
      jDOMAttributeIterator0.getNodePointer();
      assertEquals(1, jDOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Locale locale0 = Locale.UK;
      Element element0 = new Element("F", "F");
      Element element1 = element0.setAttribute("F", "F");
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element1, locale0);
      QName qName0 = new QName("F");
      JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
      NodePointer nodePointer1 = jDOMAttributeIterator0.getNodePointer();
      assertNotNull(nodePointer1);
      assertEquals(0, jDOMAttributeIterator0.getPosition());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, (Object) null, locale0);
      JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, (QName) null);
      NodePointer nodePointer1 = jDOMAttributeIterator0.getNodePointer();
      assertNull(nodePointer1);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      Element element0 = new Element("Ek", "Ek", "Ek");
      NodePointer nodePointer0 = NodePointer.newNodePointer((QName) null, element0, locale0);
      QName qName0 = new QName("Ek", "Ek");
      JDOMAttributeIterator jDOMAttributeIterator0 = new JDOMAttributeIterator(nodePointer0, qName0);
      boolean boolean0 = jDOMAttributeIterator0.setPosition(Integer.MIN_VALUE);
      assertEquals(Integer.MIN_VALUE, jDOMAttributeIterator0.getPosition());
      assertFalse(boolean0);
  }
}
