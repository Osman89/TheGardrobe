package com.example.gardrobe;

import com.example.gardrobe.R;
import com.example.gardrobe.Register;
import com.example.gardrobe.Login;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{

	Button kayit,giris,profil;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		tanimlar();
		kayit.setOnClickListener(this);
		giris.setOnClickListener(this);
		profil.setOnClickListener(this);
	}

	private void tanimlar() {
		// TODO Auto-generated method stub
		kayit= (Button) findViewById(R.id.bKay);
		giris= (Button) findViewById(R.id.bGir);
		profil=(Button) findViewById(R.id.bProfile);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bGir:
			Intent a = new Intent(this, Login.class);
			startActivity(a);
			break;
		case R.id.bKay:
			Intent i = new Intent(this, Register.class);
			startActivity(i);
			break;
		case R.id.bProfile:
			Intent p = new Intent(this, Profile.class);
			startActivity(p);
			break;
		default:
			break;
		}
	}
}
