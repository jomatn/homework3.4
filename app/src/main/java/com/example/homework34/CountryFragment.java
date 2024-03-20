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
    private RecyclerView.Adapter CountryAdapter;

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
        countryList.add(new Country("Russia"));
        countryList.add(new Country("China"));
        countryList.add(new Country("India"));
        binding.rvCountry.getAdapter().notifyDataSetChanged();
    }
    private void loadAfricaData() {
        countryList.clear();
        countryList.add(new Country("Russia"));
        countryList.add(new Country("China"));
        countryList.add(new Country("India"));
        binding.rvCountry.getAdapter().notifyDataSetChanged();
    }
    private void loadAustraliaData() {
        countryList.clear();
        countryList.add(new Country("Russia"));
        countryList.add(new Country("China"));
        countryList.add(new Country("India"));
        binding.rvCountry.getAdapter().notifyDataSetChanged();
    }
    private void loadNorthAmericaData() {
        countryList.clear();
        countryList.add(new Country("Russia"));
        countryList.add(new Country("China"));
        countryList.add(new Country("India"));
        binding.rvCountry.setAdapter(CountryAdapter);
        binding.rvCountry.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
    private void loadSouthAmericaData() {
        countryList.clear();
        countryList.add(new Country("Russia"));
        countryList.add(new Country("China"));
        countryList.add(new Country("India"));
        binding.rvCountry.getAdapter().notifyDataSetChanged();
    }
}
