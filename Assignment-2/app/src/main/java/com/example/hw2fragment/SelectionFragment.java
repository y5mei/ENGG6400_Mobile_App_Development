package com.example.hw2fragment;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SelectionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SelectionFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Bundle myBundlle;

    public SelectionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SelectionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SelectionFragment newInstance(String param1, String param2) {
        SelectionFragment fragment = new SelectionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myBundlle = savedInstanceState;
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selection, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((GlobalVariables) getActivity().getApplication()).setSubject("Please Select a Subject");
        // Clear the detailed Selection Page

        ImageButton b1 = (ImageButton) getActivity().findViewById(R.id.button1);
        ImageButton b2 = (ImageButton) getActivity().findViewById(R.id.button2);
        ImageButton b3 = (ImageButton) getActivity().findViewById(R.id.button3);
        ImageButton b4 = (ImageButton) getActivity().findViewById(R.id.button4);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getContext(), SecondActivity.class);
        // Play sound after clicked
        final MediaPlayer mp = MediaPlayer.create(getContext(), R.raw.coinsound);
        mp.start();
        // prepare for the action listener:
        if (v.getId() == R.id.button1) {
            ((GlobalVariables) getActivity().getApplication()).setSubject("physics");
            Toast.makeText(getActivity(), "Physics", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button2) {
            ((GlobalVariables) getActivity().getApplication()).setSubject("chemistry");
            Toast.makeText(getActivity(), "Chemistry", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button3) {
            ((GlobalVariables) getActivity().getApplication()).setSubject("peace");
            Toast.makeText(getActivity(), "Peace", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.button4) {
            ((GlobalVariables) getActivity().getApplication()).setSubject("literature");
            Toast.makeText(getActivity(), "Literature", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getActivity(), "No Button clicked", Toast.LENGTH_SHORT).show();
        }

        Activity act = getActivity();
        if (act.getResources().getConfiguration().orientation != Configuration.ORIENTATION_LANDSCAPE) {
            startActivity(intent);
        } else {
            // update other fragment within this same activity
            DetailedFragment frg = null;
            frg = (DetailedFragment) getFragmentManager().findFragmentById(R.id.fragment2);
            frg.onActivityCreated(myBundlle);
        }

    }
}