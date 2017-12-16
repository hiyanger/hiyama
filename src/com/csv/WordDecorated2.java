package com.csv;

public class WordDecorated2 {
	/**
	 * 文字の前後に*を追加する
	 * @param word
	 */
	public void decorated(String word) {
		System.out.println("+" + word + "+");
	}
	public String addWord(String word) {
		String str = null;
		str = word + word + word + word;
		return str;
	}

}
