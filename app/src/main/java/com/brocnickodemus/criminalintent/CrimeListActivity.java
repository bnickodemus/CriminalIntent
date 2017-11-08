package com.brocnickodemus.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Broc on 10/15/17.
 */

public class CrimeListActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }
}
