package com.example.rohangupta.bottom_navigation_sample;

import android.content.Context;
import android.support.annotation.IdRes;

import com.example.rohangupta.bottom_navigation_sample.base.view.MvvmView;

/**
 * Created by rohan on 16/04/18.
 */

public class HomeMvvm {

    public interface View extends MvvmView {

        Context getContext();

        @IdRes int getFragmentContainer();
    }

    public interface ViewModel {
        enum TAB {
            HOME,
            EXPLORE,
            SHARE,
            NEWS,
            PROFILE
        }

        void onTabSelected(TAB tab);
    }
}
