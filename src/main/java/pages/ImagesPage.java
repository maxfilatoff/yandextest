package pages;

import static com.codeborne.selenide.Selenide.open;

/**
 * Images page.
 */
public class ImagesPage implements Page {

    public void openPage() {
        open("https://yandex.ru/images/");
    }

    /**
     * Page title.
     *
     * @return - page title.
     */
    public String getTitle() {
        return "Яндекс.Картинки";
    }
}