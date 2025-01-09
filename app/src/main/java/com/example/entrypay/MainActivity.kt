package com.example.entrypay

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Configurar el Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Inicializar DrawerLayout
        drawerLayout = findViewById(R.id.drawer_layout)

        // Manejar los clics de los botones del menú
        findViewById<Button>(R.id.menu_entry).setOnClickListener {
            updateContentText("ENTRY seleccionado")
            drawerLayout.close()
        }

        findViewById<Button>(R.id.menu_pago).setOnClickListener {
            updateContentText("PAGO seleccionado")
            drawerLayout.close()
        }

        findViewById<Button>(R.id.menu_intercom).setOnClickListener {
            updateContentText("INTERCOM seleccionado")
            drawerLayout.close()
        }

        findViewById<Button>(R.id.menu_documentos).setOnClickListener {
            updateContentText("MIS DOCUMENTOS seleccionado")
            drawerLayout.close()
        }
    }

    private fun updateContentText(text: String) {
        val contentTextView: TextView = findViewById(R.id.content_text)
        contentTextView.text = text
    }
}
