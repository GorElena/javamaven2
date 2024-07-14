import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.javamav1.services.SqrtService;

public class SqrtServiceTest {

    @Test
    public void shouldCalcExact() {

        SqrtService service = new SqrtService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;


        Assertions.assertEquals(income, expenses, threshold);
    }


    @Test
    public void shouldCalcPact() {
        SqrtService service = new SqrtService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;


        Assertions.assertEquals(income, expenses, threshold);
    }
}
