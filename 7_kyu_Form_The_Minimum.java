import java.util.HashSet;

public class Minimum{

    public static int minValue(int[] values){
	HashSet<Integer> digits = new HashSet<Integer>();
    	StringBuilder sb = new StringBuilder();
    	for (int value : values) {
      		digits.add(value);
    	}
    	for (int digit : digits) {
      		sb.append(String.valueOf(digit));
    	}
    	return Integer.parseInt(sb.toString());
    }

}