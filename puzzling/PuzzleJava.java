import java.util.*;


public class PuzzleJava{

	public ArrayList<Integer> sumAll(ArrayList<Integer> arr){

		ArrayList<Integer> mango= new ArrayList<Integer>();
		int sum =0;
		for (int i=0;i<arr.size();i++){
			sum =sum+i;
			if(arr.get(i) > 10){
				mango.add(arr.get(i));
			}
		}

		System.out.println(String.format("New Array: %s , Sum: %d" ,mango,sum));
		return mango;
		

	}

	public ArrayList<String> printNames(ArrayList<String> arr){

		ArrayList<String> names = new ArrayList<String>();

		Random rand = new Random ();


		for (int i=0;i<arr.size(); i++){

			int index =rand.nextInt(arr.size());

			String temp = arr.get(i);
			arr.set(i,arr.get(index));
			
			System.out.println(arr.get(i));

			if(arr.get(i).length() > 8){
				names.add(arr.get(i));
			}
		}
		System.out.println(names);
		return names;
	}

	public ArrayList<Character> printAlpha(){

		ArrayList<Character> alpha = new ArrayList<Character>();

		for(char c ='a';c<='z';c++){
			alpha.add(c);

			Collections.shuffle(alpha);
			
		}
		System.out.println(alpha);
		System.out.println(alpha.get(0));
		if(alpha.get(0)=='a'||alpha.get(0)=='e'||alpha.get(0)=='i'||alpha.get(0)=='o'||alpha.get(0)=='u'){
				System.out.println("Its a vowel");
			}
		System.out.println(alpha.get(alpha.size()-1));
		return alpha;

	}

	public ArrayList<Integer> printNumbers(){

		ArrayList<Integer> num = new ArrayList<Integer>();

		Random rand = new Random ();

		 for (int i=0;i<10;i++){

		 	int val=rand.nextInt((100-55)+1)+55;
		 	num.add(val);

		 	if (num.get(i)>num.get(0)){
		 		num.set(0,num.get(i));
		 	}
		 }

		 System.out.println(num);
		 System.out.println(num.get(0));
		 return num;
	}

	public void randString(){
		Random rand = new Random();
		String characters="abcdefghijklmnopqrstuvwxyz";
		String randomstring ="";
		int len = 5;

		for(ing i=0;i<len;i++){
			
		}


	} 

	public static void main(String[] args){

		PuzzleJava pj= new PuzzleJava();

		ArrayList<Integer> item = new ArrayList<Integer>();

		item.add(3);
		item.add(5);
		item.add(1);
		item.add(2);
		item.add(7);
		item.add(9);
		item.add(8);
		item.add(13);
		item.add(25);
		item.add(32);

		// pj.sumAll(item);


		ArrayList<String> word = new ArrayList<String>();

		word.add("Nancy");
		word.add("Jinichi");
		word.add("Fujibayashi");
		word.add("Momochi");
		word.add("Ishikawa");

		// pj.printNames(word);

		// pj.printAlpha();

		pj.printNumbers();



		


	}



}

