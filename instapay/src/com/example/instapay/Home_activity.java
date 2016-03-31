package com.example.instapay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Home_activity extends Activity implements OnClickListener  {
	
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.home_act);
		
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener((OnClickListener) this);
	}
		public void onClick(View v) {
			if(v.getId()==R.id.button1)
			{
				//EditText qrInput1 = (EditText) findViewById(R.id.editText1);
				//String acc_no=qrInput1.getText().toString();
				
				Intent intent=new Intent(Home_activity.this,GenerateQRcodeActivity.class);
				
				
			       
			              
			    startActivity(intent);
			}
	}

}
