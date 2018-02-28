package np.com.jdulal.mywallpaper.Adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import np.com.jdulal.mywallpaper.Fragment.CategoryFragment;
import np.com.jdulal.mywallpaper.Fragment.DailyPopularFragment;
import np.com.jdulal.mywallpaper.Fragment.RecentsFragment;
import np.com.jdulal.mywallpaper.HomeActivity;

/**
 * Created by jdulal on 2/27/2018.
 */

public class MyFragmentAdapter  extends FragmentPagerAdapter{
    private Context context;

    public MyFragmentAdapter(FragmentManager fm, HomeActivity homeActivity) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return CategoryFragment.getInstance();
        else if(position==1)
            return DailyPopularFragment.getInstance();
        else if(position==2)
            return RecentsFragment.getInstance();
        else
            return null;


    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "Category";

            case 1:
                return "Daily Popular";
            case 2:
                return "Recents";

        }
        return "";
    }
}
