package com.example.usuario.sendmessage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

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

    private EditText msg;
    private EditText autor;

    //TODO tener cuidado que esta clase recibe un mensaje importante
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);

        autor=findViewById(R.id.tvAutor);
        msg=findViewById(R.id.tvMessage);

        //  1. Leemos los extras del Intent


    }
}
