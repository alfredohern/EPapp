package com.example.entrypay;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class activity_login extends AppCompatActivity { // Nombre de clase ajustado a convenciones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Inicializar vistas del layout
        EditText etUsername = findViewById(R.id.et_username);
        EditText etPassword = findViewById(R.id.et_password);
        Button btnLogin = findViewById(R.id.btn_login);
        TextView btnActivateAccount = findViewById(R.id.btn_activate_account);
        TextView btnForgotPassword = findViewById(R.id.btn_forgot_password);

        // Manejo del botón "Iniciar Sesión"
        btnLogin.setOnClickListener(v -> {
            String username = etUsername.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            // Verificar si los campos están vacíos
            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
                return;
            }

            // Verificar credenciales válidas
            if (isValidCredentials(username, password)) {
                navigateToMain(); // Redirigir a MainActivity
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            }
        });

        // Acciones para "Activar Cuenta" y "Recuperar Contraseña"
        btnActivateAccount.setOnClickListener(v ->
                Toast.makeText(this, "Funcionalidad de activar cuenta en desarrollo", Toast.LENGTH_SHORT).show()
        );

        btnForgotPassword.setOnClickListener(v ->
                Toast.makeText(this, "Funcionalidad de recuperar contraseña en desarrollo", Toast.LENGTH_SHORT).show()
        );
    }

    /**
     * Simulación de validación de credenciales.
     */
    private boolean isValidCredentials(String username, String password) {
        // Puedes reemplazar esta lógica con validaciones reales desde una API o base de datos
        return username.equals("admin") && password.equals("1234");
    }

    /**
     * Redirige a la pantalla principal (MainActivity).
     */
    private void navigateToMain() {
        Intent intent = new Intent(activity_login.this, MainActivity.class);
        startActivity(intent);
        finish(); // Opcional: evita regresar a esta pantalla con el botón "Atrás"
    }
}
