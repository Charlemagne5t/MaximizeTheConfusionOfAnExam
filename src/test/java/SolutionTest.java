import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void maxConsecutiveAnswersTest1() {
        String answerKey = "TTFF";
        int k = 2;
        int expected = 4;
        int actual = new Solution().maxConsecutiveAnswers(answerKey, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxConsecutiveAnswersTest2() {
        String answerKey = "TFFT";
        int k = 1;
        int expected = 3;
        int actual = new Solution().maxConsecutiveAnswers(answerKey, k);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxConsecutiveAnswersTest3() {
        String answerKey = "TTFTTFTT";
        int k = 1;
        int expected = 5;
        int actual = new Solution().maxConsecutiveAnswers(answerKey, k);

        Assertions.assertEquals(expected, actual);
    }
}
