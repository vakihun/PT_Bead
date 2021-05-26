package org.vakarcs.tamas.Adapter;

import org.vakarcs.tamas.Interface.HttpAdapter;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpAdapterImpl implements HttpAdapter {
    @Override
    public InputStream get(String p_url) throws IOException {
        URL url = new URL(p_url);

        HttpURLConnection connection = (HttpURLConnection)url.openConnection();

        connection.setRequestProperty("accept", "application/json");

        return connection.getInputStream();
    }
}
