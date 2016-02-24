package com.javacreed.examples.gson.part2;

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
	
	public static void main(String[] args) {
		
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(Book.class, new BookDeserializer());
		Gson gson = gsonBuilder.create();
		
		try {
			Reader reader = new InputStreamReader(Main.class.getResourceAsStream("/part2/sample.json"),"UTF-8");
			
			Book book = gson.fromJson(reader, Book.class);
			System.out.println(book);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
