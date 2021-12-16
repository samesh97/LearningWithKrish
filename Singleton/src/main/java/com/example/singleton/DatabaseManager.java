package com.example.singleton;

public class DatabaseManager
{
    private static volatile DatabaseManager databaseManager;
    private DatabaseManager() {}

    public static DatabaseManager getInstance()
    {
        if(databaseManager == null)
        {
            synchronized(DatabaseManager.class)
            {
                if(databaseManager == null)
                {
                    databaseManager = new DatabaseManager();
                }
            }

        }
        return databaseManager;
    }
    public void insertItem(String input)
    {
        //code to insert an item
    }
    public void removeItem(String id)
    {
        //code to remove an item
    }

}
