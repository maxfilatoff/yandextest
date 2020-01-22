import org.testng.annotations.DataProvider;

/**
 * DataProvider for Yandex tests.
 */
public class YandexDataProvider {
    @DataProvider
    public Object[][] yandexDataProvider() {
        return new Object[][]{
                {"погода"},
                {"Липецк"},
                {"Лото"}
        };
    }
}
