import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ImagesPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.title;

public class YandexTest {

    @Test(dataProvider = "yandexDataProvider", dataProviderClass = YandexDataProvider.class)
    public void yandexTest(String searchText) {
        MainPage page = new MainPage();
        page.openPage();
        Assert.assertEquals(title(), page.getTitle());
        page.input.setValue(searchText);
        ElementsCollection collection = page.elementsDropdownList;
        System.out.println("First element contains text: " + collection.first().text());
    }

    @Test
    public void yandexImagesTest() {
        MainPage page = new MainPage();
        page.openPage();
        page.imagesLink.click();
        ImagesPage imagesPage = new ImagesPage();
        Assert.assertTrue(title().contains(imagesPage.getTitle()));
    }
}