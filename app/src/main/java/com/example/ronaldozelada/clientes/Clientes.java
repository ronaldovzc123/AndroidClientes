package com.example.ronaldozelada.clientes;



import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.CollectionReference;


import java.util.HashMap;
import java.util.Map;


public class Clientes extends AppCompatActivity {


    private FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes);

        // Agregar Datos En duro a la Nube firebase

      /*  db = FirebaseFirestore.getInstance();

        Map<String, Object> newClientes = new HashMap<>();
        newClientes.put("Name","AlbertoRojasTrujillo");
        newClientes.put("Age","38");
        newClientes.put("Location","Mexico");

        db.collection("AddressBook").document("1")
            .set(newClientes)
            .addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void aVoid) {
                    Toast.makeText(Clientes.this, "Added new Client", Toast.LENGTH_SHORT ).show();
                }

            })
             .addOnFailureListener(new OnFailureListener() {
                 @Override
                 public void onFailure(@NonNull Exception e) {
                     Log.d("Error",e.getMessage());

                 }
             }); */

      //Cargar Datos de la nube a la aplicacion







    }





}
