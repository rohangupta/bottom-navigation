package com.example.rohangupta.bottom_navigation_sample;

import android.content.Context;
import android.databinding.ObservableField;
import android.graphics.drawable.Drawable;

import com.example.rohangupta.bottom_navigation_sample.base.view.MvvmView;

/**
 * Created by rohan on 16/04/18.
 */

public class HomeViewModel /*extends BaseViewModel<HomeMvvm.View>*/ implements HomeMvvm.ViewModel {

    private final HomeMvvm.View view;

    public final ObservableField<Drawable> homeTabDrawable = new ObservableField<>();
    public final ObservableField<Drawable> exploreTabDrawable = new ObservableField<>();
    public final ObservableField<Drawable> shareTabDrawable = new ObservableField<>();
    public final ObservableField<Drawable> newsTabDrawable = new ObservableField<>();
    public final ObservableField<Drawable> profileTabDrawable = new ObservableField<>();

    public final ObservableField<String> homeTabText = new ObservableField<>("");
    public final ObservableField<String> exploreTabText = new ObservableField<>("");
    public final ObservableField<String> shareTabText = new ObservableField<>("");
    public final ObservableField<String> newsTabText = new ObservableField<>("");
    public final ObservableField<String> profileTabText = new ObservableField<>("");

    public HomeViewModel(MvvmView mvvmView) {
        view = (HomeMvvm.View) mvvmView;
        onTabSelected(TAB.HOME);
    }

    @Override
    public void onTabSelected(TAB tab) {
        resetTabs();
        switch (tab) {
            case HOME:
                homeTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_home_dark));
                homeTabText.set("Home");
                showHomeFragment();
                break;
            case EXPLORE:
                exploreTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_explore_dark));
                exploreTabText.set("Explore");
                showExploreFragment();
                break;
            case SHARE:
                shareTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_share_dark));
                shareTabText.set("Share");
                showShareFragment();
                break;
            case NEWS:
                newsTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_news_dark));
                newsTabText.set("News");
                showNewsFragment();
                break;
            case PROFILE:
                profileTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_user_dark));
                profileTabText.set("Profile");
                showProfileFragment();
                break;
        }
    }

    private void resetTabs() {
        homeTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_home_light));
        exploreTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_explore_light));
        shareTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_share_light));
        newsTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_news_light));
        profileTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_user_light));

        homeTabText.set("");
        exploreTabText.set("");
        shareTabText.set("");
        newsTabText.set("");
        profileTabText.set("");
    }

    private void showHomeFragment() {

    }

    private void showExploreFragment() {

    }

    private void showShareFragment() {

    }

    private void showNewsFragment() {

    }

    private void showProfileFragment() {

    }
}
