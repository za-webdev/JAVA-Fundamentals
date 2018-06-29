public class StringManipulator{
	public String trimAndConcat(String a, String b){
		String c = a.trim().concat(b.trim());
		return c;
	} 

	public Integer getIndexOrNull(String a,char b){
		
		for (int i=0; i < a.length();i++){

			if (a.charAt(i) == b){

				return a.indexOf(b);
			}
		}

		return null;
	}

	public Integer getIndexOrNull(String j , String k){
		for (int i=0; i < j.length();i++){

			if (j.contains(k)){

				return j.indexOf(k);
			}
		}

		return null;

	}

	public String concatSubstring(String a, int x, int y, String b){
		 String word = a.substring(x,y).concat(b);

		 return word;

	}
}


