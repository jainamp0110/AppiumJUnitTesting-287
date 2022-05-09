import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ReadScanFeatureTest {
    public static void main(String[] args){
        try{

            AndroidDriver<MobileElement> androidDriver;
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName","Pixel_4_API_30");
            capabilities.setCapability("platformVersion","11.0");
            capabilities.setCapability("platformName","Android");
            androidDriver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

            /// whole code of the test
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
            MobileElement e = (MobileElement) androidDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
            String readText = e.getText();

            //Actual Text in the image
            String actualText = "Would you like a different font? or just a different material?";

            System.out.println("Read text:"+readText);
            System.out.println("Actual text:"+actualText);
            //Similarity score between actual text and expected text
            double score = accuracyHelper(actualText,readText);
            System.out.println("Accuracy is: "+score);
            if(score >= 80){
                System.out.println("TestCase Passed.");
            }else{
                System.out.println("TestCase Failed.");
            }

            androidDriver.quit();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
        }
    }

    public static double accuracyHelper(String actualText, String expectedText) {
        //Similarity score between actual text and expected text
        CompareStringsAndFindAccuracy.Pair<String> differences = CompareStringsAndFindAccuracy.getDifference(actualText,expectedText);
        double score = CompareStringsAndFindAccuracy.findAccuracy(actualText,expectedText,differences.getDiffValue());

        System.out.println("Accuracy is: "+score);
        return score;
    }

}
