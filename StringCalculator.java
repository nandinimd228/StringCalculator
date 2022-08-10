package StringCalculator;

public class StringCalculator {
	public int calculate(String str) throws Exception {
		//checks empty string
		if (str == null)
			return 0;
		
		String delimiter = ",";
		int sum = 0;
		int flag = 0;
		int i = 0;
		
		if (str.charAt(0) == '/' && str.charAt(1) == '/') {	
			flag = 1;
			delimiter = Character.toString(str.charAt(2));
		}
		
		if (str.contains("\n")) {
			str = str.replace("\n", "");
		}
		
		String[] numbers = str.split(delimiter);
		
		if (flag == 1)
			i = 1;
		
		for (; i < numbers.length; i++) {
			int temp = Integer.parseInt(numbers[i]);
			if (temp < 0)
				throw new Exception("Negative input " + numbers[i]);
			if (temp < 1000)
				sum += temp;
		}
		
		return sum;
	}
	
}
