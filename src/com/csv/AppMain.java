package com.csv;

public class AppMain {
	public static void main(String[] args) {
		String word = "hello java";

		WordDecorated deco = new WordDecorated();
		deco.decorated(word);
		String addword = deco.addWord(word);
		System.out.println(addword);

		WordDecorated2 deco2 = new WordDecorated2();
		deco2.decorated(word);
		String addword2 = deco2.addWord(word);
		System.out.println(addword2);

		// WordDecorated deco3 = new WordDecorated();
		// deco.decorated(word);
		String userword = "ABC";
		System.out.println(addword);

		deco.userWord(word, userword);
		WordDecorated3 word3 = new WordDecorated3(userword);
		word3.decorated3(word);

	}
}
