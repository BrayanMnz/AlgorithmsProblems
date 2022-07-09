package algorithms.brayanmnz.leetcode.problems;

import org.junit.Assert;
import org.junit.Test;

public class FirstNotRepeatingCharacterTest {
    @Test
    public void testCase1() {
        
        Assert.assertEquals('c', FirstNotRepeatingCharacter.solution("abacabad"));
        
    }

    @Test
    public void testCase2() {
        
        Assert.assertEquals('_', FirstNotRepeatingCharacter.solution("abacabaabacaba"));
        
    }

    @Test
    public void testCase3() {
        
        Assert.assertEquals('d', FirstNotRepeatingCharacter.solution("xdnxxlvupzuwgigeqjggosgljuhliybkjpibyatofcjbfxwtalc"));
    
    }

    @Test
    public void testCase4() {
        
        Assert.assertEquals('g', FirstNotRepeatingCharacter.solution("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"));
    
    }

    
}
