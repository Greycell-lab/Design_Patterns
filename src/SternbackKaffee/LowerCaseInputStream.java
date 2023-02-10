package SternbackKaffee;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in){
        super(in);
    }
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }
    public int read(byte[] b, int offset, int len) throws IOException{
        int ergebnis = super.read(b, offset, len);
        for(int i = offset; i < offset + ergebnis; i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return ergebnis;
    }
}
