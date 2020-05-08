package com.github.sep.ui.alerts;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.github.sep.R;


public class AlertsRoomFragment extends Fragment {

    private AlertsRoomFragmentViewModel mViewModel;
    private TextView textView;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    public static AlertsRoomFragment newInstance() {
        return new AlertsRoomFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.alerts_room, container, false);
        textView = root.findViewById(R.id.emergencyAlert);
        button1 = root.findViewById(R.id.room1);
        button2 = root.findViewById(R.id.room2);
        button3 = root.findViewById(R.id.room3);
        button4 = root.findViewById(R.id.alertManagement);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return root;
    }
public void goToRoom1(View view)
{

}
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AlertsRoomFragmentViewModel.class);
        // TODO: Use the ViewModel
    }

}