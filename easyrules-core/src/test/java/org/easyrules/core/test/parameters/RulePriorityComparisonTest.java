/*
 * The MIT License
 *
 *  Copyright (c) 2014, Mahmoud Ben Hassine (md.benhassine@gmail.com)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package org.easyrules.core.test.parameters;

import org.easyrules.core.BasicRule;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class of rules priority comparison.
 *
 * @author Mahmoud Ben Hassine (md.benhassine@gmail.com)
 */
public class RulePriorityComparisonTest {

    private BasicRule rule1, rule2;

    @Before
    public void setup(){
        rule1 = new BasicRule("r1","d1",1);
        rule2 = new BasicRule("r2","d2",2);
    }

    @Test
    public void testLessThanRulePriorityComparison() {
        assertEquals(-1, rule1.compareTo(rule2));
    }

    @Test
    public void testGreaterThanRulePriorityComparison() {
        assertEquals(1, rule2.compareTo(rule1));
    }

    @Test
    public void testSameRulePriorityComparison() {
        rule1.setPriority(2);
        assertEquals(0, rule1.compareTo(rule2));
    }

}
