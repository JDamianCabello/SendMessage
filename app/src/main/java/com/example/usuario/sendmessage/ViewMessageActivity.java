package com.example.usuario.sendmessage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Esta clase recibe un mensaje de otra actividad. La etiqueta de Javadoc @link
 * se utiliza en la definición de clase o metodo. No despues de las etiquetas @author
 * ni @Version. En ese caso se debe usar @see
 *
 * {@link SendMessage_MainActivity}
 *
 * @author Damián cabello
 * @version 1.0
 * @see SendMessage_MainActivity
 *
 * @see <a target="_blank" href="http://google.es">Ir a Google.es</a>
 */

public class ViewMessageActivity extends AppCompatActivity {

    private TextView msg;
    private TextView autor;
    private static final String TAG = "viewMessage";

    //TODO tener cuidado que esta clase recibe un mensaje importante
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        autor=findViewById(R.id.tvAutor);
        msg=findViewById(R.id.tvMensaje);



        //  1. Recoger el Intent que nos ha enviado la Activity SendMessageActivity
        Intent intent = getIntent();

        //  2. Recoger el objeto Bundle del Intent
        Bundle bundle = intent.getExtras();

        //  3. Asignar los strings a sus componentes
        autor.setText(bundle.getString("Author"));
        msg.setText(bundle.getString("Message"));
        Log.d(TAG,"Autor: "+autor.getText().toString() + " Mensaje: " + msg.getText().toString());

    }
}
