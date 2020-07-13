package com.example.hotelbookingapp.ui.calendar.tab.listHotelSapToi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.hotelbookingapp.R;
import com.example.hotelbookingapp.listHotel.Hotel;
import com.example.hotelbookingapp.listHotel.ListHotelAdapter;
import com.example.hotelbookingapp.ui.calendar.tab.listHotelSapToi.ListHotelSapToiAdapter;

import java.util.ArrayList;

public class SapToiFragment extends Fragment {
    View root;
    ListView listViewHotel;
    ArrayList<Hotel> arrayHotel;
    ListHotelSapToiAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_calendar_sap_toi,container,false);
        listViewHotel = root.findViewById(R.id.listViewHotelSapToi);
        AnhXa();
        adapter = new ListHotelSapToiAdapter(getContext(), R.layout.row_list_hotel_sap_toi, arrayHotel);
        listViewHotel.setAdapter(adapter);
        return root;
    }
    private void AnhXa() {
        arrayHotel = new ArrayList<>();
        arrayHotel.add(new Hotel("Khách sạn A", "13/07/2020 - 16/07/2020", "1,200,000đ", R.drawable.ks_thuyduong));
        arrayHotel.add(new Hotel("Khách sạn B", "13/07/2020 - 16/07/2020", "1,500,000đ", R.drawable.ks_summer));
        arrayHotel.add(new Hotel("Khách sạn C", "13/07/2020 - 16/07/2020", "1,800,000đ", R.drawable.ks_phungha));
        arrayHotel.add(new Hotel("Khách sạn D", "13/07/2020 - 16/07/2020", "1,200,000đ", R.drawable.ks_thuyduong));
        arrayHotel.add(new Hotel("Khách sạn E", "13/07/2020 - 16/07/2020", "1,500,000đ", R.drawable.ks_summer));
        arrayHotel.add(new Hotel("Khách sạn E", "13/07/2020 - 16/07/2020", "1,800,000đ", R.drawable.ks_phungha));
    }
}