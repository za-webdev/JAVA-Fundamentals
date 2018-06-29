public class StringManipulatorTest{
	public static void main(String[] args){
		StringManipulator manipulator = new StringManipulator();

		String str = manipulator.trimAndConcat("    Hello     ","     World    ");
		// System.out.println(str);

		Integer z = manipulator.getIndexOrNull("Coding Dojo", 'a');
		// System.out.println(z);

		Integer y = manipulator.getIndexOrNull("Coding", "ing");
		// System.out.println(y);

		String word = manipulator.concatSubstring("Hello", 1, 2, "world");
		System.out.println(word); 
		

		
	}


}




