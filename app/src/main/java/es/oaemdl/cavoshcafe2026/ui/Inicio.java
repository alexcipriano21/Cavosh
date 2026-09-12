package es.oaemdl.cavoshcafe2026.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import es.oaemdl.cavoshcafe2026.databinding.FragmentInicioBinding;

public class Inicio extends Fragment {

    private FragmentInicioBinding binding;
    private Context context;
    private NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentInicioBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = getContext();
        navController = Navigation.findNavController(view);

        // Si tienes botones para navegar en esta pantalla, agrégalos aquí.
        // Las tarjetas del XML ahora se cargarán solas de forma estática.
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}