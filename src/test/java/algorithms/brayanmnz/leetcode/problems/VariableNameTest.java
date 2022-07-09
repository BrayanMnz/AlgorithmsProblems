package algorithms.brayanmnz.leetcode.problems;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VariableNameTest {

    @Test
    public void test1() {

        assertTrue(VariableName.solution("var_1__Int"));
    }

    @Test
    public void test2() {

        assertFalse(VariableName.solution("va[riable0"));
    }

    @Test
    public void test3() {

        assertTrue(VariableName.solution("_Aas_23"));
    }



}
