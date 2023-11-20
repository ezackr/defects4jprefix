/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 20 10:55:31 GMT 2023
 */
package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.util.LinkedList;
import org.junit.runner.RunWith;
import org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter;
import org.mockito.internal.configuration.injection.filter.MockCandidateFilter;
import org.mockito.internal.configuration.injection.filter.OngoingInjecter;
import org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter;

public class TypeBasedCandidateFilterTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        TypeBasedCandidateFilter typeBasedCandidateFilter0 = new TypeBasedCandidateFilter((MockCandidateFilter) null);
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        linkedList0.add((Object) typeBasedCandidateFilter0);
        typeBasedCandidateFilter0.filterCandidate(linkedList0, (Field) null, linkedList0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        FinalMockCandidateFilter finalMockCandidateFilter0 = new FinalMockCandidateFilter();
        TypeBasedCandidateFilter typeBasedCandidateFilter0 = new TypeBasedCandidateFilter(finalMockCandidateFilter0);
        LinkedList<Object> linkedList0 = new LinkedList<Object>();
        OngoingInjecter ongoingInjecter0 = typeBasedCandidateFilter0.filterCandidate(linkedList0, (Field) null, finalMockCandidateFilter0);
    }
}
