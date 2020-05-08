package com.github.sep.ui.register;


import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


import com.github.sep.R;



public class RegisterRoomFragment extends Fragment {
    private RegisterRoomFragmentViewModel mViewModel;
    private EditText editText;
    private EditText editText2;
    private Button button1;

    public static RegisterRoomFragment newInstance() {
        return new RegisterRoomFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.register_room, container, false);
        editText = root.findViewById(R.id.username);
        editText2 = root.findViewById(R.id.password);
        button1 = root.findViewById(R.id.register);


        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });
        return root;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(RegisterRoomFragmentViewModel.class);
        // TODO: Use the ViewModel
    }
}