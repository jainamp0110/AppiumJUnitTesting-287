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



public class IdentifyFeatureTest {
    public AndroidDriver<MobileElement> androidDriver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Pixel_4_API_30");
        capabilities.setCapability("platformVersion","11.0");
        capabilities.setCapability("platformName","Android");
        androidDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    // Identify describe image landscape
    // flower vase
    @Test
    public void test1() throws Exception{
        // output is audio
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el1.click();
        Thread.sleep(5000);

        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el2.click();
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("Identify");
        el3.click();
        Thread.sleep(4000);

        MobileElement el4 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_describe_scene_bg");
        el4.click();
        MobileElement el5 = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");
        el5.click();
        Thread.sleep(5000);

        assert true;
    }

    // Identify describe image portrait
    // flower vase
    @Test()
    public void test2() throws Exception{
        // output is audio
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el1.click();
        Thread.sleep(5000);

        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el2.click();
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("Identify");
        el3.click();
        Thread.sleep(4000);

        MobileElement el4 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_describe_scene_bg");
        el4.click();
        MobileElement el5 = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");
        el5.click();
        Thread.sleep(5000);

        assert true;
    }

    // Identify describe image blurred of house portrait
    @Test
    public void test3() throws Exception{
        // emulator recording
        androidDriver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(200)));
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el1.click();
        Thread.sleep(5000);

        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el2.click();
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("Identify");
        el3.click();
        Thread.sleep(4000);

        MobileElement el4 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_describe_scene_bg");
        el4.click();
        MobileElement el5 = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");
        el5.click();
        Thread.sleep(5000);

        assert true;
    }

    // Identify describe image blurred of house landscape
    @Test
    public void test4() throws Exception{
        // emulator recording
        androidDriver.startRecordingScreen(new AndroidStartScreenRecordingOptions().withVideoSize("1280x720").withTimeLimit(Duration.ofSeconds(200)));
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el1.click();
        Thread.sleep(5000);

        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el2.click();
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("Identify");
        el3.click();
        Thread.sleep(4000);

        MobileElement el4 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_describe_scene_bg");
        el4.click();
        MobileElement el5 = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");
        el5.click();
        Thread.sleep(5000);

        assert false;
    }

    // scan barcode BrightBG landscape
    @Test
    public void test5() throws Exception{
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el1.click();
        Thread.sleep(5000);

        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el2.click();
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("Identify");
        el3.click();
        Thread.sleep(4000);

        MobileElement el4 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_scan_barcode_bg");
        el4.click();
        MobileElement el5 = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");
        el5.click();
        Thread.sleep(5000);

        assert true;
    }

    // scan barcode BrightBG portrait
    @Test
    public void test6() throws Exception{
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el1.click();
        Thread.sleep(5000);

        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el2.click();
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("Identify");
        el3.click();
        Thread.sleep(4000);

        MobileElement el4 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_scan_barcode_bg");
        el4.click();
        MobileElement el5 = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");
        el5.click();
        Thread.sleep(5000);

        assert true;
    }

    // detect colors from a flower
    @Test
    public void test7() throws Exception{
        MobileElement el1 = (MobileElement) androidDriver.findElementByAccessibilityId("Envision AI");
        el1.click();
        Thread.sleep(5000);
        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/view_edge_detection_debug");
        el2.click();
        MobileElement el3 = (MobileElement) androidDriver.findElementByAccessibilityId("Identify");
        el3.click();
        Thread.sleep(5000);

        MobileElement el4 = (MobileElement) androidDriver.findElementById("com.letsenvision.envisionai:id/iv_detect_color_bg");
        el4.click();
        Thread.sleep(10000);

        assert true;
    }


    public String readOutputFromEmulator(int lines){
        String ans = "";
        for(int i=0;i<lines;i++){
            MobileElement e = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView["+(i+1)+"]");
            ans+=e.getText();
            ans+="\n";
        }
        return ans;
    }

    public static int matchText(String actualText, String expectedText) {
        String txt1 = actualText.trim();
        String txt2 = expectedText.trim();
        int len = Math.min(txt1.length() , txt2.length());
        int count = 0;
        for(int i=0; i<len; i++) {
            if(txt1.charAt(i) == txt2.charAt(i)) {
                count++;
            }
        }
        System.out.println("Accuracy is:"+(count*100)/txt2.length());
        return (count * 100)/txt2.length() ;
    }

    @AfterClass
    public void teardown() throws IOException {
        String video = androidDriver.stopRecordingScreen();
        byte[] decode = Base64.getDecoder().decode(video);
        FileUtils.writeByteArrayToFile(new File("replay_rec.mp4"), decode);
        androidDriver.quit();
    }
}


