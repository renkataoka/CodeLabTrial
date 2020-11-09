package com.example.renkataoka.simpleasynctask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Void, String> {
    private WeakReference<TextView> mTextView;

    SimpleAsyncTask(TextView textView) {
        mTextView = new WeakReference<>(textView);
    }

    @Override
    protected String doInBackground(Void... aVoid) {

        //Generate a random number between 0 and 10.
        Random rand = new Random();
        int n = rand.nextInt(11);

        // Make the task take long enough that we have time to rotate the phone while it is running.
        int s = n * 200;

        // Sleep for the random amount of time.
        try {
            Thread.sleep(s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Return a String result.
        return "Awake at last after sleeping for " + s + " milliseconds!";
    }

    @Override
    protected void onPostExecute(String result) {
        mTextView.get().setText(result);
    }
}
