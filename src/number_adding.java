
public class number_adding {
	public static void main(String[] args) {
		int nums = 123456789;
		int nums_now = nums;
		String str = Integer.toString(nums_now);
		if(nums_now  < 10){System.out.println("Answer is "+nums);}
		
		while(nums_now  >= 10) {
			int result = 0;
			str = Integer.toString(nums_now );		
			for (int i = 0; i < str.length(); i++) {
				result = result + (nums_now % 10); //get the first digit
				nums_now = nums_now  / 10;			//get the rest of digits
			}
			nums_now = result;
			//System.out.println("-----------------------------------------------");
			//System.out.println(nums_now);			
		}
		System.out.println(nums_now);
	}
}

//input is a integer, but i need string to know how many time to do it.