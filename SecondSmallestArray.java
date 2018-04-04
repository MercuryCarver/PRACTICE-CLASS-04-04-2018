
public class SecondSmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[] = {7,29,18,72,20,12};
int smallest = array[0];
int second = array[1];
for(int i = 0; i<=array.length-1;i++) {
	if((array[i]>smallest)&&(array[i]<second))
		second = array[i];
}System.out.println(second);
	}

}
