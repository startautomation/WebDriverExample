package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverbrowser {
	private static WebDriver driver;
	
	public static void main(String[] args) {
		// 设置系统变量指向driver文件所在路径
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lsh11614\\Desktop\\codes\\sources\\webdriver\\chromedriver.exe");
		// 创建Chrome驱动对象
		driver = new ChromeDriver();
		// 最大化窗口
		driver.manage().window().maximize();
		// 打开百度首页
		driver.get("https://www.baidu.com");
		// 退出浏览器
		driver.quit();;
	}
}
