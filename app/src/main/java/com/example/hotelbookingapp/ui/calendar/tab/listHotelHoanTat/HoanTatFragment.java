package com.example.hotelbookingapp.ui.calendar.tab.listHotelHoanTat;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.hotelbookingapp.R;
import com.example.hotelbookingapp.asynctask.GetCalendar;
import com.example.hotelbookingapp.listHotel.Hotel;
import com.example.hotelbookingapp.ui.calendar.tab.listHotelSapToi.ListHotelSapToiAdapter;

import java.util.ArrayList;

public class HoanTatFragment extends Fragment {
    View root;
    ListView listViewHotel;
    ArrayList<Hotel> arrayHotel;
    ListHotelHoanTatAdapter adapter;
    public HoanTatFragment(){
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_calendar_hoan_tat,container,false);
        listViewHotel = root.findViewById(R.id.listViewHotelHoanTat);
        new GetCalendar(getContext(),adapter,listViewHotel).execute("done");
        return root;
    }
}
