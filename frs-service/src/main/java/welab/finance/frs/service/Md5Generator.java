package welab.finance.frs.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Generator
{

	/**
	 * MD5 32位加密算法。
	 * @param plainText
	 * @return
	 */
	public static String encrip(String plainText)
	{
		byte[] secretBytes = null;
		try
		{
			secretBytes = MessageDigest.getInstance("md5").digest(plainText.getBytes());
		}
		catch (NoSuchAlgorithmException e)
		{
			throw new RuntimeException(e.getMessage());
		}
		String md5code = new BigInteger(1, secretBytes).toString(16);// 16进制数字
		// 如果生成数字未满32位，需要前面补0
		for (int i = 0; i < 32 - md5code.length(); i++)
		{
			md5code = "0" + md5code;
		}

		return md5code;
	}

}
