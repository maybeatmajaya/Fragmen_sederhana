package com.example.fragmenfrompakely;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

/**
 * Created by tutlane on 09-01-2018.
 */

public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        return inflater.inflate(R.layout.homelayout, viewGroup, false);
    }
}


