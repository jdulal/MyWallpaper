package np.com.jdulal.mywallpaper.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import np.com.jdulal.mywallpaper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecentsFragment extends Fragment {

    private static RecentsFragment INSTANCE=null;
    public RecentsFragment() {
        // Required empty public constructor
    }

    public static RecentsFragment getInstance()
    {
        if(INSTANCE==null)
            INSTANCE=new RecentsFragment();
        return INSTANCE;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recents, container, false);
    }

}
