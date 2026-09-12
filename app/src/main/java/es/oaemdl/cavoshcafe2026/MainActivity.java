package es.oaemdl.cavoshcafe2026;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_activity_main);

        if (navHostFragment != null) {
            NavController navController = navHostFragment.getNavController();
            BottomNavigationView navView = findViewById(R.id.nav_view);

            // Vincular el menú inferior con la navegación
            NavigationUI.setupWithNavController(navView, navController);

            // Escuchar cambios de pantalla para mostrar u ocultar el menú
            navController.addOnDestinationChangedListener((controller, destination, arguments) -> {
                int id = destination.getId();

                // Ocultar en Splash, Login y Registrar
                if (id == R.id.navigation_splash ||
                        id == R.id.navigation_login ||
                        id == R.id.navigation_registrar ||
                        id == R.id.navigation_verificar) {

                    navView.setVisibility(View.GONE);
                } else {
                    // Mostrar en Inicio, Menu, Favoritos, Carrito, Perfil, etc.
                    navView.setVisibility(View.VISIBLE);
                }
            });
        }
    }
}