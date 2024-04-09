/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 08 02:44:55 GMT 2024
 */

package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter;
import org.mockito.internal.configuration.injection.filter.OngoingInjecter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FinalMockCandidateFilter_ESTest extends FinalMockCandidateFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FinalMockCandidateFilter finalMockCandidateFilter0 = new FinalMockCandidateFilter();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) finalMockCandidateFilter0);
      OngoingInjecter ongoingInjecter0 = finalMockCandidateFilter0.filterCandidate(linkedList0, (Field) null, (Object) null);
      assertNotNull(ongoingInjecter0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FinalMockCandidateFilter finalMockCandidateFilter0 = new FinalMockCandidateFilter();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      OngoingInjecter ongoingInjecter0 = finalMockCandidateFilter0.filterCandidate(linkedList0, (Field) null, (Object) null);
      assertNotNull(ongoingInjecter0);
  }
}
