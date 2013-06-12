package com.example.menudrawercheck;

import net.simonvt.menudrawer.MenuDrawer;

import com.actionbarsherlock.app.SherlockFragmentActivity;

import android.os.Bundle;

public class MainActivity extends SherlockFragmentActivity {

	private MenuDrawer mMenuDrawer;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMenuDrawer = MenuDrawer.attach(this);
        mMenuDrawer.setContentView(R.layout.activity_main);
        mMenuDrawer.setMenuView(R.layout.my_menu);
    }
}
