package org.vakarcs.tamas.Interface;

import java.io.IOException;
import java.io.InputStream;

public interface HttpAdapter {
    InputStream get(String p_url) throws IOException;
}
