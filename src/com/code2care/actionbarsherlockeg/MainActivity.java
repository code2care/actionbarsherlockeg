package com.code2care.actionbarsherlockeg;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		SubMenu sub1 = menu.addSubMenu(R.string.share);
		sub1.getItem().setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		sub1.getItem().setIcon(R.drawable.ic_action_share);

		getSupportMenuInflater().inflate(R.menu.actionbar_share_menu, sub1);

		SubMenu sub = menu.addSubMenu("More");
		sub.getItem().setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
		sub.getItem().setIcon(R.drawable.ic_action_overflow);

		getSupportMenuInflater().inflate(R.menu.actionbar_context_menu, sub);

		return true;
	}
	
	
	
	/*************** Options Menu Case *******************/
	public boolean onOptionsItemSelected(MenuItem item) {
		
		//Implementing action on menu item being selected!
		
		switch (item.getItemId()) {

		case 0:
			if ("share".equals((String) item.getTitleCondensed())) {

			}
			break;

		case R.id.others:
			Toast.makeText(getApplicationContext(),
					"Others!", Toast.LENGTH_SHORT)
					.show();
			break;

	
			
		case R.id.rate:
			Toast.makeText(getApplicationContext(),
					"Rate!", Toast.LENGTH_SHORT)
					.show();
			break;	


		case R.id.message:
			Toast.makeText(getApplicationContext(),
					"Message!", Toast.LENGTH_SHORT)
					.show();
			break;

		case R.id.email:
			Toast.makeText(getApplicationContext(),
					"Email!", Toast.LENGTH_SHORT)
					.show();
			break;
			
		case R.id.feedback:
			Toast.makeText(getApplicationContext(),
					"Feedback!", Toast.LENGTH_SHORT)
					.show();
			break;

		}
		return super.onOptionsItemSelected(item);
	}

	

}
