package defpackage;

import android.os.StatFs;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: jtf  reason: default package */
/* loaded from: classes.dex */
public final class jtf {
    public static final jtf a = new jtf();

    private jtf() {
    }

    public static final long a(File file) {
        try {
            return new StatFs(file.getPath()).getAvailableBytes();
        } catch (IllegalArgumentException unused) {
            return 0L;
        }
    }

    public static final void b(File file) {
        file.mkdirs();
        if (!file.exists() || !file.isDirectory()) {
            throw new IOException("Failed to make directories for path: ".concat(String.valueOf(String.valueOf(file))));
        }
    }
}
