
public class LargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[] = {3,24,52,25,6};
int largest = array[0];
for(int i = 0; i <= array.length-1; i++) {
	if(array[i]>largest)
		largest = array[i];
}System.out.println(largest);
	}

}
