package com.csv;

public class WordDecorated {
	/**
	 * 文字の前後に*を追加する
	 * 
	 * @param word
	 */
	public void decorated(String word) {
		System.out.println("*" + word + "*");
	}

	public String addWord(String word) {
		String str = null;
		str = word + word;
		return str;
	}
	
	public void userWord(String word,String word2) {
		System.out.println(word2 + word + word2);
	}
}