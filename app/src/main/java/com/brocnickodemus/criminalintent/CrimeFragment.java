package com.brocnickodemus.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by Broc on 10/15/17.
 */

public class CrimeFragment extends Fragment {
    public Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
