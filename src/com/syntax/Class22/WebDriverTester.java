package Class22;

public class WebDriverTester {
    public static void main(String[] args) {
        Safari safari=new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();
        System.out.println("*************************************");

        Chrome chrome=new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();
        System.out.println("*************************************");

        FireFox firefox= new FireFox();
        firefox.startBrowser();
        firefox.test();
        firefox.closeBrowser();


        WebDriver[] browsers={new Chrome(),new FireFox(), new Safari()};
       /* for (WebDriver browser:browsers ) {
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();*/
        for( int i=0;i<browsers.length;i++){
            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();

        }


    }
}
