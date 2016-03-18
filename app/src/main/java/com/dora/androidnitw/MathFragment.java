package com.dora.androidnitw;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MathFragment extends Fragment  {
    Button addbtn;
    EditText num1,num2;
    TextView res;

    public MathFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      // Inflate the layout for this fragment

         View rootview= inflater.inflate(R.layout.fragment_math, container, false);
         num1 =(EditText) rootview.findViewById(R.id.num1);
         num2 =(EditText)rootview.findViewById(R.id.num2);
         res= (TextView)rootview.findViewById(R.id.resultTv);
        addbtn = (Button)rootview.findViewById(R.id.addbtn);

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText("sum is "+(Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString())));

           }
        });
        return rootview;
    }

}
