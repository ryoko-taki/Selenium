import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class SeleniumTest {
    @Test
    public void test(){
        Selenide.open("https://google.co.jp");
    }
}
