package com.cs50.hotpotato;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HotPotatoActivity extends Activity 
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        
        TextView tv = new TextView(this);
        tv.setText("Hello, Android");
        setContentView(tv);

        Document doc = null;
		try 
		{
			doc = Jsoup.connect("http://www.google.com/").get();
	        String title = doc.title();
	        
	        tv.setText("blargl");
	        setContentView(tv);

		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
}