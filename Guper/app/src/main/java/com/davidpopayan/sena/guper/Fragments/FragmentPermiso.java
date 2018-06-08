package com.davidpopayan.sena.guper.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.Toast;

import com.davidpopayan.sena.guper.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPermiso extends Fragment {
    NumberPicker numb1, numb2, numb3, num4;


    public FragmentPermiso() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_permiso, container, false);

        numb1 = view.findViewById(R.id.number1);
        numb2 = view.findViewById(R.id.number2);
        numb3 = view.findViewById(R.id.number3);
        num4 = view.findViewById(R.id.number);



       NumberPicker numb1 = new NumberPicker(getActivity());
       numb1.setMinValue(0);
       numb1.setMinValue(24);



        return view;
    }

}
