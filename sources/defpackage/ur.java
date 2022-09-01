package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* compiled from: PG */
/* renamed from: ur  reason: default package */
/* loaded from: classes2.dex */
public final class ur {
    public ur() {
    }

    public ur(byte[] bArr) {
    }

    public ur(char[] cArr) {
    }

    public ur(float[] fArr) {
    }

    public ur(int[] iArr) {
    }

    public ur(short[] sArr) {
    }

    public ur(boolean[] zArr) {
    }

    public static Drawable a(Context context, int i) {
        return context.getDrawable(i);
    }

    static File b(Context context) {
        return context.getCodeCacheDir();
    }

    static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
