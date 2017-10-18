package com.brocnickodemus.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Broc on 10/15/17.
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    private HashMap<UUID, Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new HashMap<UUID, Crime>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setTitle("Crime #" + i);
            crime.setSolved(i % 2 == 0); // Every other one

            mCrimes.add(crime.getId(), crime);
        }
    }

    public List<Crime> getCrimes() {
        Collection<Crime> list = mCrimes.values();
        return new ArrayList(list);
    }

    public Crime getCrime(UUID id) {
        return mCrimes.get(id);
    }
}
