package com.csv;

public class WordDecorated3 {
	// クラス変数
	private String addnumber = null;

	/**
	 * コンストラクタ
	 * @param word
	 */
	public WordDecorated3(String word) {
		addnumber = word;
		System.out.println(word);
	}

	public void decorated3(String word) {
		System.out.println(addnumber + word + addnumber);
	}

}
