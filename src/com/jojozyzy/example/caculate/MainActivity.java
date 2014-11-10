package com.jojozyzy.example.caculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void discount10Percent(View v){
		EditText etNewItem = (EditText) findViewById(R.id.number);
		TextView calculate = (TextView) findViewById(R.id.calculate);
		calculate.setText("Tip is : $" + (Integer.parseInt(etNewItem.getText().toString()) * 0.1));
	}
	
	public void discount15Percent(View v){
		EditText etNewItem = (EditText) findViewById(R.id.number);
		TextView calculate = (TextView) findViewById(R.id.calculate);
		calculate.setText("Tip is : $" + (Integer.parseInt(etNewItem.getText().toString()) * 0.15));
	}
	
	public void discount20Percent(View v){
		EditText etNewItem = (EditText) findViewById(R.id.number);
		TextView calculate = (TextView) findViewById(R.id.calculate);
		calculate.setText("Tip is : $" + (Integer.parseInt(etNewItem.getText().toString()) * 0.2));
	}
}
