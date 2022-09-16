package br.unigran.listatelefonica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    EditText telefone;
    EditText nascimento;
    List<Contato>dados;
    ListView listagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    nome=findViewById(R.id.nomeid);
    telefone=findViewById(R.id.telefoneid);
    nascimento=findViewById(R.id.nascimento);
    dados=new ArrayList();
    listagem=findViewById(R.id.listaid);
    ArrayAdapter adapter = new ArrayAdapter(this,androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,dados);
    listagem.setAdapter(adapter);
    }

    public void salvar (View view){
    Contato lista = new Contato();
    lista.setContato(Contato.getText().toString());
    lista.setTelefone(telefone.getText().toString());
    lista.setNascimento(nascimento.getText().toString());
    dados.add(lista);
    Toast.makeText(this,"Item salvo",Toast.LENGTH_SHORT).show();
    }
}