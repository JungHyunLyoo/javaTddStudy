package iloveyouboss;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 * @USER JungHyun
 * @DATE 2020-01-27
 * @DESCRIPTION
 */
import static org.hamcrest.CoreMatchers.*;
public class ScoreCollectionTest {

    @Test
    public void answersArithmeticMeanOfTwoNumbers(){
        //prepare
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);//왜 굳이 람다를 써서 하는 것일까

        //execute
        int actualResult = collection.arithmeticMean();

        //assert
        assertThat(actualResult, equalTo(6));
    }
}