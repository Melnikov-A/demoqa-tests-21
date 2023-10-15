package guru.qa.config;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class WebDriverProvider {
    private final WebConfig config;

    public WebDriverProvider(WebConfig config){
        this.config = config;
    }

    public void setUp() {
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowser().toString();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.pageLoadStrategy = "eager";

        if (config.isRemote()) {
            Configuration.remote = config.getRemoteUrl();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            Map<String, Object> value = new HashMap<>();
            value.put("enableVNC", true);
            value.put("enableVideo", true);
            capabilities.setCapability("selenoid:options", value);
            Configuration.browserCapabilities = capabilities;
        }
    }
}