package Class22;

public class WebDriver {
    public void startBrowser(){
        System.out.println("Starting the Browser");
    }
    public void test(){
        System.out.println("Performing testing");
    }
    public void closeBrowser(){
        System.out.println("Closing browser");
    }
}
class Chrome extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Google Chrome");
    }
    public void test(){
        System.out.println("Performing testing on Google Chrome");
    }
    public void closeBrowser(){
        System.out.println("Closing Google Chrome");
    }
}
class FireFox extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the FireFox");
    }
    public void test(){
        System.out.println("Performing testing on FireFox");
    }
    public void closeBrowser(){
        System.out.println("Closing FireFox");
    }
}
class Safari extends WebDriver{
    public void startBrowser(){
        System.out.println("Starting the Safari");
    }
    public void test(){
        System.out.println("Performing testing on Safari");
    }
    public void closeBrowser(){
        System.out.println("Closing Safari");
    }
}