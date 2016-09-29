package com.example.sendmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by usuario on 23/09/16.
 */
public class ViewMessage extends AppCompatActivity {

    private TextView message;

    /**
     * Method to create the second Activity and show the message
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        message = (TextView) findViewById(R.id.message);

        //the message is extracted and assigned to the Textview
        Bundle bundle = this.getIntent().getExtras();
        message.setText(bundle.getString("txt_message"));


    }
}
