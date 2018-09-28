package com.example.usuario.sendmessage;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Esta clase envía un mensaje de un usuario a otro
 *
 * <p>En esta <b>maravillosa unidad</b> vas a aprender los siguientes conceptos:</p>
 * <ul>
 *     <li>Concepto de Context</li>
 *     <li>Paso de los parámetros mediante un objeto llamado Bundle <a target="_blank" href="https://developer.android.com/reference/android/os/Bundle"></a></li>
 *     <li>Enviar un mensaje (Intent) entre dos Activity</li>
 * </ul>
 *
 * @author Damián Cabello
 * @version 1.0
 * @see android.os.Bundle
 */

public class SendMessage_MainActivity extends AppCompatActivity {

    /**
     * Método onCreate del ciclo de vida de la Activity
     * @param savedInstanceState
     */

    private EditText edAuthor;
    private EditText edMessage;
    private Button btEnviar;
    private static final String TAG = "sendmessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message__main);
        edMessage=findViewById(R.id.tvMessage);
        edAuthor=findViewById(R.id.tvAutor);
        btEnviar=findViewById(R.id.btnEnviar);

        //  1. Registrar el listener con el método onClickListener
        btEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "Se ha pulsado el botón");
                switch (view.getId()){
                    case R.id.btnEnviar:

                        //  1. Crear un objeto contenedor o Bundle para añadir el autor y el mensaje
                        Bundle bundle = new Bundle();
//                        bundle.putString("Author",edAuthor.getText().toString());
//                        bundle.putString("Message",edMessage.getText().toString());
                        Message message = new Message();
                        message.setA

                        //  2. Se crea el mensaje o Intent explícito. Se conoce la
                        //     Activity origen y la Activity destino.
                        Intent intent = new Intent(SendMessage_MainActivity.this,ViewMessageActivity.class);

                        //  3. Añadir el objeto Bundle al Intent
                        intent.putExtras(bundle);

                        //  4. Iniciar la Activity destino ViewMessage
                        startActivity(intent);

                        break;
                }
            }
        });
    }


    /**
     * Este método será el que se ejecute siempre que se lance el evento onClick en la interfaz gráfica
     */
    public void getOnClick(View view){

    }
}
