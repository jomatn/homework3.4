package com.example.homework34;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.homework34.databinding.FragmentContinentsBinding;
import java.util.ArrayList;

public class ContinentsFragment extends Fragment implements onClick{
    private FragmentContinentsBinding binding;
    private ArrayList<Continent> continentList = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentsBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContinentAdapter adapter = new ContinentAdapter(continentList, this);
        binding.rvContinents.setAdapter(adapter);
    }

    private void loadData() {
        continentList.add(new Continent("Eurasia","https://www.google.com/url?sa=i&url=https%3A%2F%2Fen.m.wikipedia.org%2Fwiki%2FFile%3ABlankMap-Eurasia.svg&psig=AOvVaw38eBlVRPxb3BH8sVb3y8Hg&ust=1711007688424000&source=im" +
                "ages&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCPiXxb2ugoUDFQAAAAAdAAAAABAa"));
        continentList.add(new Continent("North America","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.sharada." +
                "ru%2Fkatalog%2Fmaps%2Fworld%2Fpoliticheskaja-karta-mira-923&psig=AOvVaw2Pvh3sg_kXQhw-I5l49LIn&ust=1711044175387000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNjy-7S2g4UDFQAAAAAdAAAAABAJ"));
        continentList.add(new Continent("South America","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.sharada." +
                "ru%2Fkatalog%2Fmaps%2Fworld%2Fpoliticheskaja-karta-mira-923&psig=AOvVaw2Pvh3sg_kXQhw-I5l49LIn&ust=1711044175387000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNjy-7S2g4UDFQAAAAAdAAAAABAJ"));
        continentList.add(new Continent("Australia","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.sharada.ru%2Fkatalog%2Fmaps%2Fworld%2Fpoliticheskaja-k" +
                "arta-mira-923&psig=AOvVaw2Pvh3sg_kXQhw-I5l49LIn&ust=1711044175387000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNjy-7S2g4UDFQAAAAAdAAAAABAJ"));
        continentList.add(new Continent("Africa","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.sharada.ru%2Fkatalog%2Fmaps%2Fworld%2Fpoliticheskaja-karta-mira-923&psig=AOvVaw2Pvh3sg_kXQhw-I5l49LIn&ust=17" +
                "11044175387000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCNjy-7S2g4UDFQAAAAAdAAAAABAJ"));
    }

    @Override
    public void adapterClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("Continent", continentList);

        CountryFragment countryFragment = new CountryFragment();
        countryFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().add
                (R.id.container, countryFragment).addToBackStack(null).commit();

    }
}
