package com.github.sep.ui.editInfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.github.sep.R;


public class EditInfoRoomFragment extends Fragment {

    private EditInfoRoomFragmentViewModel mViewModel;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private Button button1;

    public static EditInfoRoomFragment newInstance() {
        return new EditInfoRoomFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.editinfo_room, container, false);
        textView1 = root.findViewById(R.id.userDetails);
        textView2 = root.findViewById(R.id.name);
        textView3 = root.findViewById(R.id.password);
        textView4 = root.findViewById(R.id.contactInformation);
        button1 = root.findViewById(R.id.save);
        editText1 = root.findViewById(R.id.editUsername);
        editText2 = root.findViewById(R.id.editPassword);
        editText1 = root.findViewById(R.id.contact1Information);
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
        mViewModel = ViewModelProviders.of(this).get(EditInfoRoomFragmentViewModel.class);
        // TODO: Use the ViewModel
    }
}
