package com.example.baseandroid.di

import com.example.baseandroid.ui.detail.fragments.DetailImageFragment
import com.example.baseandroid.ui.detail.fragments.DetailWebFragment
import com.example.baseandroid.ui.login.fragments.LoginFragment
import com.example.baseandroid.ui.login.fragments.LoginSuccessFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeLoginFragment(): LoginFragment

    @ContributesAndroidInjector
    abstract fun contributeLoginSuccessFragment(): LoginSuccessFragment

    @ContributesAndroidInjector
    abstract fun contributeDetailFragment(): DetailWebFragment

    @ContributesAndroidInjector
    abstract fun contributeDetailImageFragment(): DetailImageFragment
}
