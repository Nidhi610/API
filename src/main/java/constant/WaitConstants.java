package constant;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitConstants {

	public static final Duration WAIT_FOR_ELEMENT = Duration.ofSeconds(60);
	public static final Duration WAIT_FOR_ELEMENT_TO_DISAPPEAR = Duration.ofSeconds(10);
	public static int WAIT_FOR_UPLOAD_TO_FINISH = 4000;
}
