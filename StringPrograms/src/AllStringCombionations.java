
public class AllStringCombionations {
	
	public void strCombination(String str){
		for(int i=0;i<str.length();i++){
			String s = str.substring(0,i)+str.substring(i+1);
			System.out.println(s);
		}
	}
	
	public void replaceChars(String str){
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

	public static void main(String[] args) {
		AllStringCombionations obj = new AllStringCombionations();
		obj.replaceChars("Niharika Maheshwari");
	}

}
