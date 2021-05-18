package org.vakarcs.tamas.Adapter;

import java.io.IOException;
import java.io.InputStream;

public interface HttpAdapter {
    InputStream get(String p_url) throws IOException;
}
