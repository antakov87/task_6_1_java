import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.task_6_1_java.services.SQRService;


public class SQRServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/test.csv")

    public void shouldCalcExact(int expected, int bottom_border,int top_border){
        SQRService service=new SQRService();
        int actual=service.calcSqr(bottom_border,top_border);
        Assertions.assertEquals(expected,actual);
    }
}
