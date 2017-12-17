
class TextBuilder{
	
	private String text = "";
	
	public TextBuilder() {
		
	}
	
	public TextBuilder append(String text) {
		// This is Just for Example Do not do like that as its not a good Practice
		// It will result in Extra Unnecessary String object creatino
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
