import java.util.ArrayList;

public class BasicJava{
	// Print 1-255
	public void print1To255(){
		for (int i=0;i<256;i++){

			System.out.println(i);
		}
	}

	//Print odd numbers between 1-255
	public void printOdd(){
		for (int i=0;i<256;i++){
			if(i%2 !=0){
				System.out.println(i);

			}
		}
	}

	//Print Sum
	public void printSum(){
		int sum=0;
		for (int i=0;i<256;i++){
			sum= sum+i;

			System.out.println(String.format("New number: %d , Sum: %d",i,sum));


		}
	}


	//Iterating through an array
	public void iteratingArray(ArrayList<Integer> arr){
		for (int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
	}

	//Find Max

	public void findMax(ArrayList<Integer> arr){
		int max= arr.get(0);
		for (int i=0;i<arr.size();i++){
			if(arr.get(i)> max){
				max=arr.get(i);
			}

		}
		
		System.out.println(max);
	}


	public static void main(String[] args){
		BasicJava bj= new BasicJava();
		// bj.print1To255();
		// bj.printOdd();
		// bj.printSum();



		ArrayList<Integer> numbers= new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);

		// bj.iteratingArray(numbers);
		 bj.findMax(numbers);
	}
}