package com.example.instapay;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;

public class GenerateQRcodeActivity extends Activity implements OnClickListener {
	
	private String LOG_TAG = "GenerateQRCode";
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	
	
	
	
	setContentView(R.layout.activity_main);
	Button button1 = (Button) findViewById(R.id.button1);
	button1.setOnClickListener(this);
	
	}
	
	@Override
	@SuppressLint("NewApi")
	public void onClick(View v) {
		if(v.getId()==R.id.button1)
		{
			//EditText qrInput1 = (EditText) findViewById(R.id.editText1);
			EditText qrInput2 = (EditText) findViewById(R.id.editText2);
			
			//String acc_no=qrInput1.getText().toString();
			String amt=qrInput2.getText().toString();
			
			String qrInputText=amt;
			
			
			Log.v(LOG_TAG, qrInputText);
			
			
		//Find screen size
		WindowManager manager = (WindowManager) getSystemService(WINDOW_SERVICE);
		Display display = manager.getDefaultDisplay();
		Point point = new Point();
		display.getSize(point);
		int width = point.x;
		int height = point.y;
		int smallerDimension = width < height ? width : height;
		smallerDimension = smallerDimension * 3/4;
		
		//Encode with a QR Code image
		QRCodeEncoder qrCodeEncoder = new QRCodeEncoder(qrInputText,
				null,
				Contents.Type.TEXT,
				BarcodeFormat.QR_CODE.toString(),
				smallerDimension);
		try {
		Bitmap bitmap = qrCodeEncoder.encodeAsBitmap();
		ImageView myImage = (ImageView) findViewById(R.id.imageView1);
		myImage.setImageBitmap(bitmap);
		
		} catch (WriterException e) {
			e.printStackTrace();
			}
			
			// More buttons go here (if any) ...
			}
		
			}
	
	
}
