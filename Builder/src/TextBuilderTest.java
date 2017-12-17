
class TextBuilder{
	
	private String text = "";
	
	public TextBuilder() {
		
	}
	
	public TextBuilder append(String text) {
		this.text = this.text + text ;
		return this;
	}

	@Override
	public String toString() {
		return this.text;
	}
	
	

}

public class TextBuilderTest {
	
	public static void main(String[] args) {
		TextBuilder text = new TextBuilder();
		text.append("A ").append("B ");
		System.out.println(text.toString());
		text.append("C ");
		System.out.println(text.toString());
	}
}
