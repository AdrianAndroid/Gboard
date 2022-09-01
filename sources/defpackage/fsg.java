package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
@Deprecated
/* renamed from: fsg  reason: default package */
/* loaded from: classes.dex */
public final class fsg {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
