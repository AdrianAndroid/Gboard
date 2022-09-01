package defpackage;

import android.content.Context;
import java.io.File;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ut  reason: default package */
/* loaded from: classes2.dex */
public final class ut {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context a(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File b(Context context) {
        return context.getDataDir();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static final long d(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() & 4294967295L;
    }

    public static final void e(int i, ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + i);
    }
}
