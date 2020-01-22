package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Main page.
 */
public class MainPage implements Page {

    public void openPage() {
        open("http://yandex.ru");
    }

    /**
     * Page title.
     * @return - page title.
     */
    public String getTitle() {
        return "Яндекс";
    }

    /**
     * Input field.
     */
    public SelenideElement input = $(By.xpath("//input[@class = 'input__control input__input']"));

    /**
     * Images link.
     */
    public SelenideElement imagesLink = $(By.linkText("Картинки"));

    /**
     * Dropdown container.
     */
    public ElementsCollection elementsDropdownList = $$(By.xpath("//li[@class = 'suggest2-item i-bem suggest2-item_js_inited']"));
}