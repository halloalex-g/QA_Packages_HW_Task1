import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    //@CsvSource({
    //       "200,300,3"
    //})
    @CsvFileSource(files = "src/test/resources/autotestData.csv")
    public void sqrootTest(int lowLimit, int highLimit, int expected) {
        SQRService srts = new SQRService();
        int actual = srts.calcSqrt(lowLimit, highLimit);
        Assertions.assertEquals(expected, actual);


    }
}
