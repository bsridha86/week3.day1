package abstraction;

public abstract class MultipleLangauge implements Language, TestTool{

	public void python() {
		System.out.println("Python method from MultipleLangauge abstract class");
	}

	
	public abstract void ruby();
	
}
