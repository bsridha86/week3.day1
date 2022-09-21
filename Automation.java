package abstraction;

public class Automation extends MultipleLangauge{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation a = new Automation();
		a.ruby();
		a.Selenium();
		a.Java();
		a.python();

	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby method from MultipleLangauge abstract class");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java method from Interface Language");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium method from Interface TestTool");
	}

}
