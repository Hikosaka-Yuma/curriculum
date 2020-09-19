package study;
import java.util.ResourceBundle;

public class ResourceMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ResourceBundle bundle = ResourceBundle.getBundle("test");
		String value = bundle.getString("name");
		System.out.print(value);

	}

}
