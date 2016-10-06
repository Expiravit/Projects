import org.junit.Assert;
import org.junit.Test;

public class TestingCode {
    private TextAnalyzer textAnalyzer;

    @Test
    public void getWordsTest(){
        textAnalyzer = new TextAnalyzer("Test test text test");
        String[] actual = {"test", "test", "text", "test"};
        String [] result = new String[textAnalyzer.getWords().size()];
        result = textAnalyzer.getWords().toArray(result);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void getWordsTest2(){
        textAnalyzer = new TextAnalyzer("Test test text test");
        String[] actual = {"test", "test", "text", "test"};
        String [] result = new String[textAnalyzer.getWords().size()];
        result = textAnalyzer.getWords().toArray(result);
        Assert.assertArrayEquals(result, actual);
    }

    @Test
    public void getMostFrequentWordTest(){
        textAnalyzer = new TextAnalyzer("Test test text test");
        String result = textAnalyzer.getMostFrequentWord();
        String actual = "test";
        Assert.assertEquals(result , actual);
    }

    @Test
    public void getMostFrequentWordTest2(){
        textAnalyzer = new TextAnalyzer("Test text test");
        String result = textAnalyzer.getMostFrequentWord();
        String actual = "test";
        Assert.assertEquals(result , actual);
    }

    @Test
    public void getMostFrequentWordTest3(){
        textAnalyzer = new TextAnalyzer("text test");
        String result = textAnalyzer.getMostFrequentWord();
        String actual = "test";
        Assert.assertEquals(result , actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getMostFrequentWordTest4(){
        textAnalyzer = new TextAnalyzer("");
        String result = textAnalyzer.getMostFrequentWord();
        Assert.assertNull(result );
    }

    @Test
    public void getMostFrequentWordTest5(){
        textAnalyzer = new TextAnalyzer("тест текст на русском тест");
        String result = textAnalyzer.getMostFrequentWord();
        String actual = "тест";
        Assert.assertEquals(result, actual);
    }
}
