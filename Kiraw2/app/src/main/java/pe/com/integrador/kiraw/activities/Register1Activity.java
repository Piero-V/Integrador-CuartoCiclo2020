package pe.com.integrador.kiraw.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import pe.com.integrador.kiraw.R;

public class Register1Activity extends AppCompatActivity {

    private EditText edtR_name;
    private EditText edtR_surname;
    private EditText edtR_username;
    private EditText edtR_telef;

    private Button btnR_Siguiente;
    private Button btnR_Cancelar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        edtR_name = findViewById(R.id.edtR_name);
        edtR_surname = findViewById(R.id.edtR_surname);
        edtR_username = findViewById(R.id.edtR_username);
        edtR_telef = findViewById(R.id.edtR_telef);
        btnR_Siguiente= findViewById(R.id.btnSiguiente);
        btnR_Cancelar = findViewById(R.id.btnCancelar);


        btnR_Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = edtR_name.getText().toString();
                String surname = edtR_surname.getText().toString();
                String username = edtR_surname.getText().toString();
                String telef = edtR_surname.getText().toString();

                if ((name.equals("")) || (surname.equals("")) || (username.equals("")) || (telef.equals(""))) {
                    Toast.makeText(Register1Activity.this, "Falta llenar un campo", Toast.LENGTH_SHORT).show();

                }else{
                    Intent intent = new Intent(Register1Activity.this, Register2Activity.class);
                    startActivity(intent);
                }
            }
        });
        btnR_Cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Register1Activity.this, PrincipalActivity.class);
                startActivity(intent);

            }
        });

    }
}
