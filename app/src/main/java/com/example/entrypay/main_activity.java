package com.example.entrypay;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class main_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main); // Asegúrate de que este coincide con tu archivo XML

        // Configurar botones
        ImageButton entryButton = findViewById(R.id.entryButton);
        ImageButton payButton = findViewById(R.id.payButton);
        ImageButton intercomButton = findViewById(R.id.intercomButton);

        // Acción para el botón Entry
        entryButton.setOnClickListener(v -> {
            // Lógica para el botón Entry
            Intent entryIntent = new Intent(main_activity.this, EntryActivity.class);
            startActivity(entryIntent);
        });

        // Acción para el botón Pay
        payButton.setOnClickListener(v -> {
            // Lógica para el botón Pay
            Intent payIntent = new Intent(main_activity.this, PayActivity.class);
            startActivity(payIntent);
        });

        // Acción para el botón Intercom
        intercomButton.setOnClickListener(v -> {
            // Lógica para el botón Intercom
            Intent intercomIntent = new Intent(main_activity.this, IntercomActivity.class);
            startActivity(intercomIntent);
        });
    }
}
