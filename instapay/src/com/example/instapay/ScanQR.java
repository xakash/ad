package com.example.instapay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ScanQR extends Activity {
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    
	    Intent intnet=getIntent();
	    
	    //setContentView(R.layout.main);
	    
	    HandleClick hc = new HandleClick();
	    //findViewById(R.id.butQR).setOnClickListener(hc);
	   
	  }
	  private class HandleClick implements OnClickListener{
	    @Override
		public void onClick(View arg0) {
	    	
	    	//Intent intent=new Intent(ScanQR.this,DemoHomeActivity.class);
	    	//startActivity(intent);
	     
	    }
	  }
	  
	  	}