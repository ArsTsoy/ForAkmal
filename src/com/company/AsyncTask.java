package com.company;

abstract class AsyncTask<IN, PROGRESS, OUT> {

    abstract OUT doInBackground(IN in, PROGRESS progress);
}
