package com.github.sep.ui.manageRoom;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.sep.R;

public class ManageRoomAdminFragment extends Fragment {

    private ManageRoomAdminViewModel mViewModel;

    public static ManageRoomAdminFragment newInstance() {
        return new ManageRoomAdminFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {

        return inflater.inflate(R.layout.manage_room_admin_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ManageRoomAdminViewModel.class);
        // TODO: Use the ViewModel
    }

}
