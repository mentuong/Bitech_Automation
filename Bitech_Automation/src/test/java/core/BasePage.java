package core;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BasePage {
    private static long TIMEOUT = 600;
    private static WebDriverWait explicitWait;

    public static int extractInt(String value) {
        String intValue = value.replaceAll("[^0-9]", "");
        int a = Integer.parseInt(intValue);
        return a;
    }

    public static void waitForElementVisible(WebDriver driver, String locator) {
        explicitWait = new WebDriverWait(driver, TIMEOUT);
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(getByxpath(locator)));
    }
    public static void waitForElementInvisible(WebDriver driver, String locator) {
        explicitWait = new WebDriverWait(driver, TIMEOUT);
        explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(getByxpath(locator)));
    }

    public static By getByxpath(String locator) {
        return By.xpath(locator);
    }

    public static By getBycss(String locator) {
        return By.cssSelector(locator);
    }

    public static WebElement getElementXpath(WebDriver driver, String locator) {
        return driver.findElement(getByxpath(locator));
    }

    public static WebElement getElementCss(WebDriver driver, String locator) {
        return driver.findElement(getBycss(locator));
    }

    public static String getTitle(WebDriver driver) {
        return driver.getTitle();
    }

    public static void clickToElementXpath(WebDriver driver, String locator) {
        waitForElementVisible(driver, locator);
        getElementXpath(driver, locator).click();
    }

    public static void clickToElementCss(WebDriver driver, String locator) {
        getElementCss(driver, locator).click();
    }

    public static String getNgaysinhRandom() {
        LocalDate startDate = LocalDate.of(1960, 01, 01);
        LocalDate endDate = LocalDate.now();
        long start = startDate.toEpochDay();
        long end = endDate.toEpochDay();
        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        String date = LocalDate.ofEpochDay(randomEpochDay).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return date;
    }

    public static String getNgayTuongLaiRandom() {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2050, 12, 31);
        long start = startDate.toEpochDay();
        long end = endDate.toEpochDay();
        long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
        String date = LocalDate.ofEpochDay(randomEpochDay).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        return date;
    }

    public static void sendKeyNgaySinh(WebDriver driver, String locator, String value) {
        String value1 = value.split(" ")[0];
        if (value1.equals("random")) {
            value = getNgaysinhRandom();
        }
        getElementXpath(driver, locator).sendKeys(value);
    }

    public static void sendKeyNgayTuongLai(WebDriver driver, String locator, String value) {
        String value1 = value.split(" ")[0];
        if (value1.equals("random")) {
            value = getNgayTuongLaiRandom();
        }
        getElementXpath(driver, locator).sendKeys(value);
    }

    public static String randomizeNumeric(int size) {
        // chose a Character random from this String
        String AlphaNumericString = "0123456789";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(size);
        //System.out.println(AlphaNumericString);

        for (int i = 0; i < size; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static String randomizeAlpha(int size) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(size);
        //System.out.println(AlphaNumericString);

        for (int i = 0; i < size; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static String randomizeSpecChar(int size) {
        // chose a Character random from this String
        String AlphaNumericString = "`~!@#$%^&(){}';:,./?><";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(size);
        //System.out.println(AlphaNumericString);

        for (int i = 0; i < size; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static String randomizeAlphaNumeric(int size) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "01234567890123456789"
                + "abcdefghijklmnopqrstuvxyz" +
                "01234567890123456789";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(size);
        //System.out.println(AlphaNumericString);

        for (int i = 0; i < size; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static String randomizeNumericSpecChar(int size) {
        // chose a Character random from this String
        String AlphaNumericString = "0123456789"
                + "`~!@#$%^&(){}';:,./?><";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(size);
        //System.out.println(AlphaNumericString);

        for (int i = 0; i < size; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static String randomizeAlphaSpecChar(int size) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "`~!@#$%^&(){}';:,./?><`~!@#$% ^&(){}';:,./?><"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(size);
        //System.out.println(AlphaNumericString);

        for (int i = 0; i < size; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static String randomizeAlphaNumericSpecChar(int size) {
        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789012345678901234567890123456789"
                + "`~!@#$%^&(){}';:,./?><`~!@#$%^&(){}';:,./?><"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(size);
        //System.out.println(AlphaNumericString);

        for (int i = 0; i < size; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public static void sendKeyWithSpaceToElement(WebDriver driver, String locator, String value) {
        String value1 = value.split(" ")[0];
        if (value1.equals("randomAlpha")) {
            value = randomizeAlpha(extractInt(value));
        } else if (value1.equals("randomAlphaNumeric")) {
            value = randomizeAlpha(extractInt(value)) + randomizeNumeric(extractInt(value));
        } else if (value1.equals("randomNumeric")) {
            value = randomizeNumeric(extractInt(value));
        } else if (value1.equals("randomSpecChar")) {
            value = randomizeSpecChar(extractInt(value));
        } else if (value1.equals("randomAlphaNumericSpecChar")) {
            value = randomizeAlpha(extractInt(value)) + randomizeNumeric(extractInt(value)) + randomizeSpecChar(extractInt(value));
        } else if (value1.equals("randomNumericSpecChar")) {
            value = randomizeNumeric(extractInt(value)) + randomizeSpecChar(extractInt(value));
        } else if (value1.equals("randomAlphaSpecChar")) {
            value = randomizeAlpha(extractInt(value)) + randomizeSpecChar(extractInt(value));
        }
        getElementXpath(driver, locator).clear();
        getElementXpath(driver, locator).sendKeys(value + " " + value);
    }

    public static void sendKeyWithNoSpaceToElement(WebDriver driver, String locator, String value) {
        String value1 = value.split(" ")[0];
        if (value1.equals("randomAlpha")) {
            value = randomizeAlpha(extractInt(value));
        } else if (value1.equals("randomAlphaNumeric")) {
            value = randomizeAlpha(extractInt(value)) + randomizeNumeric(extractInt(value));
        } else if (value1.equals("randomNumeric")) {
            value = randomizeNumeric(extractInt(value));
        } else if (value1.equals("randomSpecChar")) {
            value = randomizeSpecChar(extractInt(value));
        } else if (value1.equals("randomAlphaNumericSpecChar")) {
            value = randomizeAlpha(extractInt(value)) + randomizeNumeric(extractInt(value)) + randomizeSpecChar(extractInt(value));
        } else if (value1.equals("randomNumericSpecChar")) {
            value = randomizeNumeric(extractInt(value)) + randomizeSpecChar(extractInt(value));
        } else if (value1.equals("randomAlphaSpecChar")) {
            value = randomizeAlpha(extractInt(value)) + randomizeSpecChar(extractInt(value));
        }
        getElementXpath(driver, locator).clear();
        getElementXpath(driver, locator).sendKeys(value);
    }

    public static void sendKeyToElement(WebDriver driver, String locator, String value) {
        WebElement element = getElementXpath(driver, locator);
        waitForElementVisible(driver, locator);
        element.sendKeys(value);
    }

    public static void selectOptionList(WebDriver driver, String locator, String value) {
        String value1 = value.split(" ")[0];
        List<WebElement> list = driver.findElements(By.xpath(locator));
        int i;
        if (value1.equals("random")) {
            int index = list.size() - 1;
            i = (int) Math.floor(Math.random() * index + 1);
            list.get(i).click();
        } else if (value.equals("")) {
        } else {
            for (i = 0; i < list.size(); i++) {
                if (list.get(i).getText().contains(value)) break;
            }
            list.get(i).click();
        }
    }

    public static boolean isSelectedElement(WebDriver driver, String locator) {
        return getElementXpath(driver, locator).isSelected();
    }

    public static boolean isDisplayedElement(WebDriver driver, String locator) {
        return getElementXpath(driver, locator).isDisplayed();
    }

    public static boolean isEnableElement(WebDriver driver, String locator) {
        return getElementXpath(driver, locator).isEnabled();
    }

    public static void sendFile(WebDriver driver, String element, String fileNameResouces) {
        String path = System.getProperty("user.dir");
        String file = path + "\\src\\test\\resources\\" + fileNameResouces;
        getElementXpath(driver, element).sendKeys(file);
    }

    public static void sendKeyPhoneNo(WebDriver driver, String locator, String value) {
        String value1 = value.split(" ")[0];
        if (value1.equals("random")) {
            String value2 = value.split(" ")[1];
            int sdt = (int) Math.floor(Math.random() * 89999999 + 10000000);
            value = new String(value2 + sdt);
        } else if (value1.equals("randomAlpha")) {
            value = randomizeAlpha(extractInt(value));
        } else if (value1.equals("randomAlphaNumeric")) {
            value = randomizeAlpha(extractInt(value)) + randomizeNumeric(extractInt(value));
        } else if (value1.equals("randomNumeric")) {
            value = randomizeNumeric(extractInt(value));
        } else if (value1.equals("randomSpecChar")) {
            value = randomizeSpecChar(extractInt(value));
        } else if (value1.equals("randomAlphaNumericSpecChar")) {
            value = randomizeAlpha(extractInt(value)) + randomizeNumeric(extractInt(value)) + randomizeSpecChar(extractInt(value));
        } else if (value1.equals("randomNumericSpecChar")) {
            value = randomizeNumeric(extractInt(value)) + randomizeSpecChar(extractInt(value));
        } else if (value1.equals("randomAlphaSpecChar")) {
            value = randomizeAlpha(extractInt(value)) + randomizeSpecChar(extractInt(value));
        }
        value = value.replaceAll("[^0-9]", "");
        getElementXpath(driver, locator).clear();
        getElementXpath(driver, locator).sendKeys(value);
    }

    public static void sendKeyEnter(WebDriver driver, String locator) {
        getElementXpath(driver, locator).sendKeys(Keys.ENTER);
    }

    public String presentDay() {
        LocalDate startDate = LocalDate.now();
        long start = startDate.toEpochDay();
        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String presentDayTitle() {
        LocalDate startDate = LocalDate.now();
        long start = startDate.toEpochDay();
        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String passDay() {
        LocalDate startDate = LocalDate.now();
        long start = startDate.toEpochDay() - 1;
        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String futureDay() {
        LocalDate startDate = LocalDate.now();
        long start = startDate.toEpochDay() + 1;
        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String passDayTitle() {
        LocalDate startDate = LocalDate.now();
        long start = startDate.toEpochDay() - 1;
        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String futureDayTitle() {
        LocalDate startDate = LocalDate.now();
        long start = startDate.toEpochDay() + 1;
        return LocalDate.ofEpochDay(start).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public String value(WebDriver driver, WebElement element) {
        return (String) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].value", element);
    }
}
