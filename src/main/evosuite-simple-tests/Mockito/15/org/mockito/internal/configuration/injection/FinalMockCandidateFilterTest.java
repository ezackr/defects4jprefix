/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 05 01:37:58 GMT 2023
 */
package org.mockito.internal.configuration.injection;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.util.LinkedList;
import org.junit.runner.RunWith;
import org.mockito.internal.configuration.injection.FinalMockCandidateFilter;
import org.mockito.internal.configuration.injection.OngoingInjecter;

public class FinalMockCandidateFilterTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        FinalMockCandidateFilter finalMockCandidateFilter0 = new FinalMockCandidateFilter();
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        OngoingInjecter ongoingInjecter0 = finalMockCandidateFilter0.filterCandidate(linkedList0, (Field) null, (Object) null);
        assertNotNull(ongoingInjecter0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        FinalMockCandidateFilter finalMockCandidateFilter0 = new FinalMockCandidateFilter();
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) finalMockCandidateFilter0);
        OngoingInjecter ongoingInjecter0 = finalMockCandidateFilter0.filterCandidate(linkedList0, (Field) null, (Object) null);
        assertNotNull(ongoingInjecter0);
    }
}
