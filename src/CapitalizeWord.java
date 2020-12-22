
public class CapitalizeWord {

	public static String capitalizeEachWord(String s) {
		String[] array = s.split(" ");
		String result = "";
		for (String string : array) {
			 result+= string.substring(0,1).toUpperCase()+string.substring(1);
			 result+=" ";
		}
		return result.trim();
		
	}
	public static void main(String[] args) {
		System.out.println(capitalizeEachWord("i am pratik sayanekar"));
	}

}
