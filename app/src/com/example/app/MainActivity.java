package com.example.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button button = (Button) findViewById(R.id.button1);
		final EditText num = (EditText) findViewById(R.id.editText1);
		final TextView fz = (TextView) findViewById(R.id.textView1);
		final TextView to = (TextView) findViewById(R.id.textView2);
		final TextView tt = (TextView) findViewById(R.id.textView3);
		final TextView ot = (TextView) findViewById(R.id.textView4);
		final TextView zf = (TextView) findViewById(R.id.textView5);
		
		num.setText("0");
		button.setOnClickListener(new OnClickListener(){
			
			public void onClick(View arg0) {
				Rounds r = new Rounds(Integer.parseInt(num.getText().toString()));
				int [] Break = r.roundfour((r.roundthree(r.roundtwo((r.roundone())))));
				fz.setText("4-0 Teams: " + String.valueOf(Break[0]));
				to.setText("3-1 Teams: " + String.valueOf(Break[1]));
				tt.setText("2-2 Teams: " + String.valueOf(Break[2]));
				ot.setText("1-3 Teams: " + String.valueOf(Break[3]));
				zf.setText("0-4 Teams: " + String.valueOf(Break[4]));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
