package com.cs50.hotpotato;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


public class Login extends Activity
{

    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        // The activity is being created.
        // setContentView(R.layout.login);
        
        TextView tv = new TextView(this);
        tv.setText("Hello, Casey");
        setContentView(tv);
        
        /*try 
        {
        	HttpClient client = new DefaultHttpClient();  
        	String getURL = "http://www.speedspud.com/android/userInfo.php";
        	HttpGet get = new HttpGet(getURL);
        	HttpResponse responseGet = client.execute(get);  
        	HttpEntity resEntityGet = responseGet.getEntity();  
        	if (resEntityGet != null) 
        	{  
        		//do something with the response
        		Log.i("GET RESPONSE",EntityUtils.toString(resEntityGet));
        		System.out.println(resEntityGet);
        	}
        } 
        catch (Exception e) 
        {
        	e.printStackTrace();
        }*/
    }
    @Override
    protected void onStart() 
    {
        super.onStart();
        // The activity is about to become visible.
    }
    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
    }
    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
    }
}