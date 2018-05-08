package com.example.rohangupta.bottom_navigation_sample;

import android.databinding.ObservableField;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.rohangupta.bottom_navigation_sample.base.view.MvvmView;
import com.example.rohangupta.bottom_navigation_sample.fragments.HomeFragment;

/**
 * Created by rohan on 16/04/18.
 */

public class HomeViewModel implements HomeMvvm.ViewModel {

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
                homeTabText.set(view.getContext().getString(R.string.home));
                showHomeFragment();
                break;
            case EXPLORE:
                exploreTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_explore_dark));
                exploreTabText.set(view.getContext().getString(R.string.explore));
                showExploreFragment();
                break;
            case SHARE:
                shareTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_share_dark));
                shareTabText.set(view.getContext().getString(R.string.share));
                showShareFragment();
                break;
            case NEWS:
                newsTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_news_dark));
                newsTabText.set(view.getContext().getString(R.string.news));
                showNewsFragment();
                break;
            case PROFILE:
                profileTabDrawable.set(view.getContext().getResources().getDrawable(R.drawable.ic_user_dark));
                profileTabText.set(view.getContext().getString(R.string.profile));
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
        replaceFragment(new HomeFragment());
    }

    private void showExploreFragment() {
        replaceFragment(new HomeFragment());
    }

    private void showShareFragment() {
        replaceFragment(new HomeFragment());
    }

    private void showNewsFragment() {
        replaceFragment(new HomeFragment());
    }

    private void showProfileFragment() {
        replaceFragment(new HomeFragment());
    }

    private void replaceFragment(Fragment fragment) {
        FragmentTransaction transaction = ((AppCompatActivity) view.getContext()).getSupportFragmentManager().beginTransaction();
        transaction.replace(view.getFragmentContainer(), fragment);
        transaction.commit();
    }
}
