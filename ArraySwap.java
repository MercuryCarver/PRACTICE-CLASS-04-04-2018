
public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String array[] = {"Dog", "Cat", "Bird", "fish"};
String dog = array[0]; 
array[0] = array[2];
array[2] = dog;
//for(int i = 0; i<=array.length-1;i++) {
for(int i = 0; i <= array.length-1; i++) {
	System.out.println(array[i]);
}
}
}
	


