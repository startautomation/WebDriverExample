package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverbrowser {
	private static WebDriver driver;
	
	public static void main(String[] args) {
		// ����ϵͳ����ָ��driver�ļ�����·��
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lsh11614\\Desktop\\codes\\sources\\webdriver\\chromedriver.exe");
		// ����Chrome��������
		driver = new ChromeDriver();
		// ��󻯴���
		driver.manage().window().maximize();
		// �򿪰ٶ���ҳ
		driver.get("https://www.baidu.com");
		// �˳������
		driver.quit();;
	}
}
