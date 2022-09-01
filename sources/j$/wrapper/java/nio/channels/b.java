package j$.wrapper.java.nio.channels;

import android.os.Build;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public abstract class b {
    public static FileChannel a(FileChannel fileChannel) {
        if (fileChannel == null) {
            return null;
        }
        return Build.VERSION.SDK_INT < 24 ? fileChannel : new a(fileChannel);
    }
}
