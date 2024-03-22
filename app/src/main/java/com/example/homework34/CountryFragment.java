package com.example.homework34;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework34.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private FragmentCountryBinding binding;
    private ArrayList<Country> countryList = new ArrayList<>();
    private int position;
    private CountryAdapter countryAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCountryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        position = getArguments().getInt("Country", 0);
        checkPosition(position);

        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        binding.rvCountry.setAdapter(countryAdapter);
    }

    private void checkPosition(int position) {
        switch (position) {
            case 0:
                loadEurasiaData();
                break;
                case 1:
                loadNorthAmericaData();
                break;
                case 2:
                loadSouthAmericaData();
                break;
                case 3:
                loadAustraliaData();
                break;
                case 5:
                loadAfricaData();
                break;
            default:
                break;
        }
    }

    private void loadEurasiaData() {
        countryList.clear();
        countryList.add(new Country("Russia", ""));
        countryList.add(new Country("China", ""));
        countryList.add(new Country("India", ""));
    }
    private void loadAfricaData() {
        countryList.clear();
        countryList.add(new Country("Russia", ""));
        countryList.add(new Country("China", ""));
        countryList.add(new Country("India", ""));
        countryList.add(new Country("Korea", ""));
        countryList.add(new Country("Kyrgystan", ""));
    }
    private void loadAustraliaData() {
        countryList.clear();
        countryList.add(new Country("Australia", ""));
        countryList.add(new Country("New Zeland", ""));
    }
    private void loadNorthAmericaData() {
        countryList.clear();
        countryList.add(new Country("USA", ""));
        countryList.add(new Country("Canada", ""));
        countryList.add(new Country("Mexico", ""));
        countryList.add(new Country("Cuba", ""));
        countryList.add(new Country("Beliz", ""));
    }
    private void loadSouthAmericaData() {
        countryList.clear();
        countryList.add(new Country("Brazil", ""));
        countryList.add(new Country("Chilli", ""));
        countryList.add(new Country("Peru", ""));
        countryList.add(new Country("Columbia", ""));
        countryList.add(new Country("Argentina", ""));
    }
}
