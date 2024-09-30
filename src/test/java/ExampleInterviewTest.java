import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleInterviewTest {

    private ExampleInterview example = new ExampleInterview();
    @Test
    void shouldReturnStringWithoutVowels (){
        //given
        String s = "mateusz";
        String expected = "mtusz";
        //when
        String result = example.noVowels(s);
        //then
        assertEquals(expected,result);
    }
    

}