package com.androindian.tabview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tabs);
        toolbar=findViewById(R.id.tollbar);
        viewPager=findViewById(R.id.viewpager);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // toolbar.getPaddingStart();

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFrag(), "ONE");
        adapter.addFragment(new TwoFrag(), "Two");
        adapter.addFragment(new ThreeFrag(), "Three");
        //adapter.addFragment(new FourFragment(), "Four");
        viewPager.setAdapter(adapter);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return mFragmentList.get(i);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}


        /*toolbar=findViewById(R.id.tollbar);
        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tabs);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);





    }
*/



       /* ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new OneFrag(), "ONE");
        adapter.addFragment(new TwoFrag(),"Two");
        adapter.addFragment(new ThreeFrag(),"Three");

        viewPager.setAdapter(adapter);

    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();
        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            return  mFragmentList.get(i);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(OneFrag fragment, String title) {

            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }
    }
}
*/