package com.kaiser.kpaftervisit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

public class Parser {
	private BufferedReader reader;
	private InputStream inputStream;
	
	public Parser( Context context, String filename ) throws IOException{
		AssetManager assets = context.getAssets();
		inputStream = assets.open("textFiles/"+ filename);
		this.reader = new BufferedReader(new InputStreamReader(inputStream));
	}
	public String[] stringParse() throws IOException{
		int counter = 0;
		String[] parsedData = new String[7];
		String line = reader.readLine();
		while (line != null && counter < 7) {
			int beginField = line.indexOf(":");
			parsedData[counter] = line.substring(beginField + 1);
			line = reader.readLine();
			counter++;
		}
		return parsedData;
		//returns array [Patient Name, Doctor name, Previous Visit Date, 
		//               Reason, Cause, Action, Next Appointment]
		
	}
}
