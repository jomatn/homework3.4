package com.example.homework34;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.bumptech.glide.Glide;
import com.example.homework34.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<Country> countryList;
    public CountryAdapter(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        FragmentCountryBinding itemBinding = FragmentCountryBinding.inflate(layoutInflater, parent, false);
        return new CountryViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        Country country = countryList.get(position);
        holder.bind(country);
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private FragmentCountryBinding binding;


    public CountryViewHolder(@NonNull FragmentCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(Country country) {
        binding.е.set(country.getCountryName());//здесь не видно текста
        Glide.with(binding.)//здесь не видна карта
    }
}
