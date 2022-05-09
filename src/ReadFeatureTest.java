import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;
import java.util.concurrent.TimeUnit;



public class ReadFeatureTest {
    private AndroidDriver<MobileElement> androidDriver;
    private CompareStringsAndFindAccuracy accuracyObject;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Pixel_4_API_30");
        capabilities.setCapability("platformVersion","11.0");
        capabilities.setCapability("platformName","Android");
        androidDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    // Read-Instant
    // Handwritten - Dark BG
    @Test
    public void test1() throws Exception{
        // output is audio
        MobileElement el5 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el5.click();
        Thread.sleep(5000);

        MobileElement el6 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el6.click();

        MobileElement el7 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_instant_text_bg");
        el7.click();
        Thread.sleep(10000);

        assert false;
    }

    // Read-Instant
    // Handwritten - Bright BG
    @Test()
    public void test2() throws Exception{
        // output is audio
        MobileElement el5 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el5.click();
        Thread.sleep(5000);

        MobileElement el6 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el6.click();

        MobileElement el7 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_instant_text_bg");
        el7.click();
        Thread.sleep(10000);

        assert false;
    }

    // scan
    // printed bright light
    @Test
    public void test3() throws Exception{
        // emulator recording
        androidDriver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(200)));

        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el1.click();
        Thread.sleep(5000);
        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el2.click();
        Thread.sleep(4000);
        MobileElement el3 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_document_scanner_bg");
        el3.click();
        MobileElement el4 = (MobileElement) androidDriver.findElementByAccessibilityId("Take Photo. Single Scan selected");
        el4.click();
        Thread.sleep(4000);
        MobileElement el5 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/capture_result_recycler_view");
        el5.click();
        Thread.sleep(3000);

        //Actual text captured by the app
        MobileElement e = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[0]");
        String actualText = e.getText();

        //Actual Text in the image
        String expectedText = "Would you like a different font ? or just a different material ?";

        //Similarity score between actual text and expected text
        double score = accuracyHelper(actualText,expectedText);
        assert score >= 60;
    }

    // scan hindi print Bright Background
    @Test
    public void test4() throws Exception{
        // emulator recording
        androidDriver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(200)));

        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el1.click();
        Thread.sleep(5000);
        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el2.click();
        Thread.sleep(4000);
        MobileElement el3 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_document_scanner_bg");
        el3.click();
        MobileElement el4 = (MobileElement) androidDriver.findElementByAccessibilityId("Take Photo. Single Scan selected");
        el4.click();
        Thread.sleep(4000);
        MobileElement el5 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/capture_result_recycler_view");
        el5.click();
        Thread.sleep(3000);

        assert false;
    }

    // library printedText Bright BG
    @Test
    public void test5() throws Exception{
        // emulator recording
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el1.click();
        Thread.sleep(5000);
        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el2.click();
        MobileElement el3 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_library_bg");
        el3.click();
        Thread.sleep(2000);
        MobileElement el4 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/btn_import_file");
        el4.click();
        Thread.sleep(1500);
        MobileElement el5 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/ll_import_image");
        el5.click();
        Thread.sleep(1500);
        MobileElement el6 = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView");
        el6.click();
        Thread.sleep(1500);
        MobileElement el7 = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout");
        el7.click();
        Thread.sleep(1500);
        MobileElement el8 = (MobileElement) androidDriver.findElementByAccessibilityId("Photo taken on May 3, 2022 7:50:04 PM");
        el8.click();
        Thread.sleep(1500);
        MobileElement el9 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/capture_result_recycler_view");
        el9.click();
        Thread.sleep(6000);

        assert true;

    }

    public static double accuracyHelper(String actualText, String expectedText) {
        //Similarity score between actual text and expected text
        CompareStringsAndFindAccuracy.Pair<String> differences = CompareStringsAndFindAccuracy.getDifference(actualText,expectedText);
        double score = CompareStringsAndFindAccuracy.findAccuracy(actualText,expectedText,differences.getDiffValue());

        System.out.println("Accuracy is: "+score);
        return score;
    }

    @AfterClass
    public void teardown() throws IOException {
        String video = androidDriver.stopRecordingScreen();
        byte[] decode = Base64.getDecoder().decode(video);
        FileUtils.writeByteArrayToFile(new File("replay_rec.mp4"), decode);
        androidDriver.quit();
    }
}



