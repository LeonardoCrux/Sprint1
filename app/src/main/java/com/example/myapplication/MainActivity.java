package com.example.myapplication;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    //declarando todos os componentes que serão usados
    private Button botaoCadastro;
    private TextInputLayout inputSenha;
    private TextInputLayout inputEmail;
    private TextView botaoLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        botaoCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirCadastro();
            }
        });

        botaoLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    //método p/ comunicação com a activity cadastro
    public void abrirCadastro() {
            Intent intent = new Intent(this, Cadastro.class);
            startActivity(intent);
    }

    //inicializando os componentes
    private void initViews(){
        botaoCadastro = findViewById(R.id.botaoCadastro);
        inputEmail = findViewById(R.id.inputEmail);
        inputSenha = findViewById(R.id.inputSenha);
        botaoLogin = findViewById(R.id.botaoLogin);
    }


    //método p/ validar se os campos estão preenchidos. Caso preenchidos faz a comunicação entre as activity
    private void validar(){
        String email = inputEmail.getEditText().getText().toString();
        String senha = inputSenha.getEditText().getText().toString();
        if(!email.isEmpty() && !senha.isEmpty()){
            abrirCadastro();
        } else {
            Toast.makeText(getApplicationContext(), "Preencha os campos", Toast.LENGTH_LONG).show();
        }
    }


}
