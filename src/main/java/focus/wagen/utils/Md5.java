package focus.wagen.utils;

import java.security.MessageDigest;

public class Md5 {
	
	public static String encode(String string) {
		String strEncode = "";
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(string.getBytes());
			byte[] digest = md.digest();
			StringBuffer sb = new StringBuffer();
			for (byte b : digest) {
				sb.append(String.format("%02x", b & 0xff));
			}
			strEncode = sb.toString();
		} catch(Exception ex){
			ex.printStackTrace();
		}
		return strEncode;
	}

}