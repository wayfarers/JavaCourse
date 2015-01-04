package utils;

import java.util.List;


public class Utils {
	public static String join(List messages) {
		String res = "";
        for (Object object : messages) {
			res += object + ", ";
		}
        
        return res.substring(0, res.length() - 2);
    }
}
