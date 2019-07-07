package structures.array;

import java.util.HashMap;
import java.util.Map;

public class RomainToInteger {
	
	public static char symbol[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
	public static int   value[] = { 1,   5,   10, 50,  100, 500, 1000};
	
	private static final Map<String, Integer> bigMap = new HashMap<>();
	
	static {
		bigMap.put("I", 1);
		bigMap.put("V", 5);
		bigMap.put("X", 10);
		bigMap.put("L", 50);
		bigMap.put("C", 100);
		bigMap.put("D", 500);
		bigMap.put("M", 1000);
		
		
	}
	
	
	public int romanToInt(String s) {
		
		Map<String, Integer> map = new HashMap<>();
		
		Integer result = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			
			Integer val = bigMap.getOrDefault(Character.toString( s.charAt(i)), 0);
			
			if ( val == 0 )
				break;
			
			Integer count = 1;
			Integer valj  = val;
			
			for (int j = i + 1; j < s.length(); j++) {
				
				
				Integer tmpVal = bigMap.getOrDefault(Character.toString( s.charAt(j)), 0);
				
				if ( val == tmpVal) {
					count ++;
					valj += val;
				} else if ( tmpVal > val) {
					valj = (tmpVal - val);					
					count ++;
					break;
				} else {
				
					break;
				}
			}	
			
			if (count > 3)
				throw new IllegalArgumentException("Bad number");
			
			result = result + valj;
			i += (count - 1);
			
		}
		
		return result;
        
    }
	
	public static void main(String[] args) {
		RomainToInteger r = new RomainToInteger();
		System.out.println( r.romanToInt("MDCCXXXIV"));
		
	}

}
