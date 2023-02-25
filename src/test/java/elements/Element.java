package elements;

import org.openqa.selenium.By;
import util.BaseUtil;

public class Element extends BaseUtil {
    public By category = By.cssSelector("#contentMain > div > nav > ul > li:nth-child(1) > a");
    public By search = By.cssSelector("#searchData");
}
