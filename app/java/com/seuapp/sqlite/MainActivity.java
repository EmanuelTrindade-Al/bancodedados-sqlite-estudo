package com.seuapp.sqlite;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editNome, editEmail;
    Button btnSalvar;
    ListView listView;
    MeuBancoHelper banco;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.editTextNome);
        editEmail = findViewById(R.id.editTextEmail);
        btnSalvar = findViewById(R.id.btnSalvar);
        listView = findViewById(R.id.listViewUsuarios);
        banco = new MeuBancoHelper(this);

        carregarUsuarios();

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editNome.getText().toString();
                String email = editEmail.getText().toString();

                if (nome.isEmpty() || email.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                    return;
                }

                banco.inserirUsuario(nome, email);
                Toast.makeText(MainActivity.this, "Usuário salvo!", Toast.LENGTH_SHORT).show();
                editNome.setText("");
                editEmail.setText("");
                carregarUsuarios();
            }
        });
    }

    private void carregarUsuarios() {
        List<String> lista = banco.listarUsuarios();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        listView.setAdapter(adapter);
    }
}
