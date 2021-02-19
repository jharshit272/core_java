package amaz;

public class guardent {

	public static void main(String[] args) {
		System.out.println(getCompressed("AAATTGGCCCCAAAAA"));
	}
	public static String getCompressed(String s){

		//	s = "AAATTGGCCCCAAAAA";
		StringBuffer out = new StringBuffer();

		int count =1;
		for(int i=0; i<s.length()-1; i++){

			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}else {
				out.append(s.charAt(i)).append(count);
				count =1;
			}
		}
		out.append(s.charAt(s.length()-1)).append(count);
		return out.toString();

	}

}
