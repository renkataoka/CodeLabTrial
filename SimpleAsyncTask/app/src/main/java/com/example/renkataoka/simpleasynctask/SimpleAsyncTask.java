package com.example.renkataoka.simpleasynctask;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class SimpleAsyncTask extends AsyncTask<Void, Void, String> {
    private WeakReference<TextView> mTextView;

    SimpleAsyncTask(TextView textView) {
        mTextView = new WeakReference<>(textView);
    }

    @Override
    protected String doInBackground(Void... aVoid) {
        return null;
    }
}
