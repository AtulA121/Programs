import java.util.*;

class EncryptAString {
	static Map<Character,Character> map=new HashMap<>();
	public static void main(String args[]){
		fillCode();
		String str="9970774553";
		String encodedString=getEncodedString(str);
		String decodedString=getDecodedString(encodedString);
		System.out.println("Encoded String : "+encodedString);
		System.out.println("decoded String : "+decodedString);
	}
	public static String getEncodedString(String str){
		String st="";
		for(int i=0;i<str.length();i++){
			st+=getEncodedReverseString(str.charAt(i));
		}
		return st;
	}
	
	public static String getDecodedString(String str){
		String st="";
		for(int i=0;i<str.length();i++){
			st+=getDecodedReverseString(str.charAt(i));
		}
		return st;
	}
	
	public static String getEncodedReverseString(char str){
		char strr='-';
		for(Map.Entry<Character, Character> entry : map.entrySet()) {
			char key = entry.getKey();
			char value = entry.getValue();
			if(key == str){
				strr=value;
			}
		}
		
		return ""+strr;
	}
	
	public static String getDecodedReverseString(char str){
		char strr='-';
		for(Map.Entry<Character, Character> entry : map.entrySet()) {
			char key = entry.getKey();
			char value = entry.getValue();
			if(value == str){
				strr=key;
			}
		}
		
		return ""+strr;
	}
	
	public static void fillCode(){
		map.put('0','z');
		map.put('1','x');
		map.put('2','v');
		map.put('3','t');
		map.put('4','r');
		map.put('5','p');
		map.put('6','n');
		map.put('7','l');
		map.put('8','j');
		map.put('9','h');
		map.put('A','g');
		map.put('B','f');
		map.put('9','e');
		map.put('9','d');
		map.put('9','c');
		map.put('9','b');
		map.put('9','a');
	}
}