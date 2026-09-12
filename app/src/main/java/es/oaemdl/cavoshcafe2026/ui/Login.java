package es.oaemdl.cavoshcafe2026.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.oaemdl.cavoshcafe2026.R;
import es.oaemdl.cavoshcafe2026.databinding.FragmentLoginBinding;

public class Login extends Fragment {
    FragmentLoginBinding binding;
    Context context;
    NavController navController;
    View view;

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater, container, false );
        return view = binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        context = getContext();
        navController = Navigation.findNavController( view );

        // Ir a Inicio al hacer clic en "Iniciar Sesión"
        binding.btnIniciarSesion.setOnClickListener(v ->
                navController.navigate(R.id.action_navigation_login_to_navigation_inicio)
        );

        // Ir a Registro al hacer clic en la pestaña superior "Registrar"
        binding.tvRegistrar.setOnClickListener(v ->
                navController.navigate(R.id.action_navigation_login_to_navigation_registrar)
        );

        // Ir a Registro al hacer clic en el texto inferior "Registrarse ahora"
        binding.tvRegistrarAhora.setOnClickListener(v ->
                navController.navigate(R.id.action_navigation_login_to_navigation_registrar)
        );
    }
}