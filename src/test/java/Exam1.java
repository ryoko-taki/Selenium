import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Exam1 {
    @Test
    public void test(){
        Selenide.open("https://www.google.com/");
        //Google検索欄
        SelenideElement element = Selenide.$(By.name("q"));
        //「Selenium」を入力
        element.val("selenium").pressEnter();
        // 検索結果を確認
//        <h3 class="LC20lb MBeuO DKV0Md">Seleniumブラウザー自動化プロジェクト</h3>
//        ElementsCollection results = Selenide.$$(By.cssSelector("#ires .g"));
//        results.shouldHaveSize(10);
//        results.get(0).shouldHave(Condition.text("Selenide: concise UI tests in Java"));

    }
}
