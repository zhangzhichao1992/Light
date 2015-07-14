package com.voyager.light;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {

	private boolean flag = false;
	private ImageView iv_switch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv_switch = (ImageView) findViewById(R.id.iv_switch);
		iv_switch.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iv_switch:
			flag = true;
			if (flag) {
				openFlash();
				flag = !flag;
				iv_switch.setImageResource(R.drawable.switch_on);
			} else {
				closeFlash();
				flag = !flag;
				iv_switch.setImageResource(R.drawable.switch_off);
			}
			break;

		default:
			break;
		}
	}

	private void closeFlash() {

	}

	private void openFlash() {
	}

}