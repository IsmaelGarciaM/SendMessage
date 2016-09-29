package com.example.sendmessage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Class that send a message to other Activity
 * @see android.app.Activity
 * @autor Ismael García
 * @version 1.0
 */

//TODO Mi primera activity

public class SendMessage extends AppCompatActivity{

    private static final String TAG = "com.example.sendmessage";
    private EditText edtMessage;
    private Button btnEnviar;

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"Activity has started.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"Activity is again visible.");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"Activity has finished.");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"Activity is not visible.");
    }

    /**
     * Method that creates the Activity
     * @param savedInstanceState
     * @see android.os.Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Escribir en el log
        setContentView(R.layout.activity_send_message);
        Log.e("com.example.sendmessage","Actividad se ha creado.");
        edtMessage = (EditText) findViewById(R.id.edtMessage);
        btnEnviar = (Button) findViewById(R.id.btnSend);

    }

    /**
     * Method to capture the message, pass the message and create the second activity
     * @param v
     */
    public void getOnClick(View v) {
        switch (v.getId()){
            case R.id.btnSend:{
                //With bundle message is captured and stored
                Bundle bundle = new Bundle();
                bundle.putString("mensaje", edtMessage.getText().toString());

                //Creating a new Intent to start view_message Activity
                Intent intent = new Intent(SendMessage.this,ViewMessage.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        }

    }
}
