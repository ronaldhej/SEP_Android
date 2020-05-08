package com.github.sep.ui.userList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.github.sep.R;
public class UserListRoomFragment extends Fragment
{
    private UserListRoomFragmentViewModel  mViewModel;
    private TextView textView;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    public static UserListRoomFragment newInstance() {
        return new UserListRoomFragment();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.userlist_room, container, false);
        textView = root.findViewById(R.id.userList);
        button1 = root.findViewById(R.id.userNo1);
        button2 = root.findViewById(R.id.userNo2);
        button3 = root.findViewById(R.id.userNo3);
        button4 = root.findViewById(R.id.manage);
        button5 = root.findViewById(R.id.deleteUser);

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
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return root;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(UserListRoomFragmentViewModel.class);
        // TODO: Use the ViewModel
    }


}
