package com.coderstory.Purify.activity;

import android.support.v4.app.Fragment;

import com.coderstory.Purify.fragment.AboutFragment;

public class AboutActivity extends ToolbarActivity {


    @Override
    protected Fragment setFragment() {
        return new AboutFragment();
    }

    @Override
    protected String getToolbarTitle() {
        return "关于";
    }
}
