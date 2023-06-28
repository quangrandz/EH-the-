import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {

    @Test
    public void testFindAllAnagramsInText() {
        String text = "cbaebabacd";
        String pattern = "abc";
        List<Integer> expected = Arrays.asList(0, 6);
        
        List<Integer> result = AnagramFinder.findAllAnagramsInText(text, pattern);
        
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void testFindAllAnagramsInText_NoAnagramFound() {
        String text = "abcd";
        String pattern = "xyz";
        List<Integer> expected = Collections.emptyList();
        
        List<Integer> result = AnagramFinder.findAllAnagramsInText(text, pattern);
        
        Assert.assertEquals(expected, result);
    }
    
    // Các ca kiểm thử khác...

}
