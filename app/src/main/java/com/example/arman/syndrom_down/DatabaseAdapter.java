package com.example.arman.syndrom_down;


import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by Szamani on 12/22/2015.
 */

// prefer to use file instead of sql database :) lazy :D

public class DatabaseAdapter {
    private static DatabaseAdapter databaseAdapter;
    private Database database;

    private DatabaseAdapter() {

    }

    public Database loadDatabase(Context context) {
        ObjectInputStream objectInputStream;

        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(new File(new File(context.getFilesDir(),"")+File.separator+Utils.FILENAME)));
        } catch (IOException e) {
            e.printStackTrace();
            return createNewDatabase(context);
        }

        try {
            database = (Database) objectInputStream.readObject();
            objectInputStream.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.d("Database ", "initialized");

        return database;
    }

    public void saveDatabase(Context context, Database database) {
        ObjectOutput output;

        try {
            output = new ObjectOutputStream(new FileOutputStream(new File(context.getFilesDir(),"")+File.separator+Utils.FILENAME));
            output.writeObject(database);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("Database ", "Saved");
    }

    private Database createNewDatabase(Context context) {
        ObjectOutput output;
        database = new Database();

        try {
            output = new ObjectOutputStream(new FileOutputStream(new File(context.getFilesDir(),"")+File.separator+Utils.FILENAME));
            output.writeObject(database);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("Database " , "created");

        return database;
    }

    public static DatabaseAdapter getInstance() {
        if (databaseAdapter == null)
            databaseAdapter = new DatabaseAdapter();

        return databaseAdapter;
    }
}
