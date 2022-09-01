package j$.wrapper.java.io;

import j$.wrapper.java.nio.channels.b;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class FileInputStreamWrapper {
    public static FileChannel getChannel(FileInputStream fileInputStream) {
        return b.a(fileInputStream.getChannel());
    }
}
