package aula18;

import java.io.IOException;

public interface Database {

    void open();

    void close() throws IOException;

}
