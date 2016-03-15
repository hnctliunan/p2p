package com.hl.utils.encrypt;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;

public class PasswordEncoder {

	public static String getSalt(String username) {
		SecureRandomNumberGenerator secureRandomNumberGenerator = new SecureRandomNumberGenerator();
		return secureRandomNumberGenerator.nextBytes().toHex();
	}

	public static String encoder(String salt,String password) {
		String password_cipherText = new Md5Hash(password, salt, 2).toHex();
		return password_cipherText;
	}

	public static void main(String[] args){
		String salt = getSalt("15942680116");
		String password = encoder(salt,"a123456");
		System.out.println(salt);
		System.out.println(password);
	}

}