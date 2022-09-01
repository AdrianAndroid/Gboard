package defpackage;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: hio  reason: default package */
/* loaded from: classes.dex */
public final class hio {
    public static final boolean a;
    public static final AtomicBoolean b;

    static {
        boolean z = true;
        if (!"robolectric".equals(Build.FINGERPRINT) && Build.FINGERPRINT != null) {
            z = false;
        }
        a = z;
        b = new AtomicBoolean(false);
    }
}
