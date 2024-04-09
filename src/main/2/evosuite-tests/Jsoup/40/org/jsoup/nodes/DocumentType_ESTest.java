/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 07 04:03:46 GMT 2024
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DocumentType_ESTest extends DocumentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "!&{`(r6rwWwT]'I\"");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      DocumentType documentType0 = new DocumentType("Unexpected character '%s' in input state [%s]", "Unexpected character '%s' in input state [%s]", "Unexpected character '%s' in input state [%s]", "!&{`(r6rwWwT]'I\"");
      documentType0.outerHtmlTail(stringBuilder0, 1, document_OutputSettings0);
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("@na", "", "", "");
      String string0 = documentType0.nodeName();
      assertEquals("#doctype", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DocumentType documentType0 = new DocumentType(" ", "A:=", " ", "0");
      StringBuilder stringBuilder0 = new StringBuilder(0);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      documentType0.outerHtmlHead(stringBuilder0, 1025, document_OutputSettings0);
      assertEquals("<!DOCTYPE PUBLIC \"A:=\">", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("!&{`(r6rwWwT]V'I\"");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      DocumentType documentType0 = new DocumentType("!&{`(r6rwWwT]V'I\"", "", "<!DOCTYPE", "<!DOCTYPE");
      documentType0.outerHtmlHead(stringBuilder0, (-282), document_OutputSettings0);
      assertEquals("!&{`(r6rwWwT]V'I\"<!DOCTYPE !&{`(r6rwWwT]V'I\" \"<!DOCTYPE\">", stringBuilder0.toString());
  }
}
