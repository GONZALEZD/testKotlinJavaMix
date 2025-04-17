package fr.test.solera.testmixjavakotlin.java;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dagger.hilt.android.AndroidEntryPoint;
import fr.test.solera.testmixjavakotlin.R;
import fr.test.solera.testmixjavakotlin.databinding.FragmentJavaBlankBinding;
import fr.test.solera.testmixjavakotlin.kotlin.KotlinBlankFragment;

@AndroidEntryPoint
public class JavaBlankFragment extends Fragment {

    private JavaBlankViewModel viewModel;

    private FragmentJavaBlankBinding binding;

    public static JavaBlankFragment newInstance() {
        return new JavaBlankFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = FragmentJavaBlankBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(JavaBlankViewModel.class);
        viewModel.getNumberLiveData().observe(getViewLifecycleOwner(), nb -> {
            binding.numberTextview.setText("" + nb);
        });
        binding.button.setOnClickListener(v -> {
            navigateToKotlinFragment();
        });
    }

    public void navigateToKotlinFragment() {
        Log.e("COUCOU", "navigateToKotlinFragment");
        requireActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, new KotlinBlankFragment())
                .commitNow();
    }
}