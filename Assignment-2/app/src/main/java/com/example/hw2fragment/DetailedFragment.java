package com.example.hw2fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailedFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DetailedFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DetailedFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailedFragment newInstance(String param1, String param2) {
        DetailedFragment fragment = new DetailedFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detailed, container, false);
    }


    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String myselection = ((GlobalVariables) getActivity().getApplication()).getSubject();

        // Get the image and text object, as well as their weight
        ImageView imgv = getActivity().findViewById(R.id.mypicture1);
        TextView textv = getActivity().findViewById(R.id.mytext1);
        LinearLayout.LayoutParams params1 = (LinearLayout.LayoutParams) imgv.getLayoutParams();
        LinearLayout.LayoutParams params2 = (LinearLayout.LayoutParams) textv.getLayoutParams();

        if(myselection=="physics"){
            imgv.setImageResource(R.drawable.rogerpenrose);
            textv.setText(R.string.rogerphysics);
            params1.weight = 0.3f;
            params2.weight = 0.5f;
            imgv.setLayoutParams(params1);
            textv.setLayoutParams(params2);
        }else if(myselection=="chemistry"){
            imgv.setImageResource(R.drawable.jennifer);
            textv.setText(R.string.Jenniferchem);
            params1.weight = 0.3f;
            params2.weight = 0.5f;
            imgv.setLayoutParams(params1);
            textv.setLayoutParams(params2);
        }else if(myselection=="peace"){
            imgv.setImageResource(R.drawable.wfp);
            textv.setText(R.string.wfp);
            params1.weight = 0.3f;
            params2.weight = 0.5f;
            imgv.setLayoutParams(params1);
            textv.setLayoutParams(params2);
        }else if(myselection=="literature"){
            imgv.setImageResource(R.drawable.louise);
            textv.setText(R.string.louise);
            params1.weight = 0.3f;
            params2.weight = 0.5f;
            imgv.setLayoutParams(params1);
            textv.setLayoutParams(params2);
        }else{
            imgv.setImageResource(R.drawable.nobel);
            textv.setText(R.string.please);
            params1.weight = 1.0f;
            params2.weight = 0.3f;
            imgv.setLayoutParams(params1);
            textv.setLayoutParams(params2);
        }

//        Activity act = getActivity();
//        Intent intent = new Intent(getContext(), MainActivity.class);
//        if (act.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            Toast.makeText(getActivity(), "landscape", Toast.LENGTH_SHORT).show();
////            startActivity(intent);
//        }
    }
}