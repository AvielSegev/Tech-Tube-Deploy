package com.example.tech_titans_app.ui.Converters;

import android.net.Uri;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class UriTypeAdapter extends TypeAdapter<Uri> {
    @Override
    public void write(JsonWriter out, Uri value) throws IOException {
        if (value == null) {
            out.nullValue();
        } else {
            out.value(value.toString());
        }
    }

    @Override
    public Uri read(JsonReader in) throws IOException {
        String uriString = in.nextString();
        return Uri.parse(uriString);
    }
}
