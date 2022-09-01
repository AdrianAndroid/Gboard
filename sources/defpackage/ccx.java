package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: ccx  reason: default package */
/* loaded from: classes.dex */
public final class ccx {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/dlam/DlamPropertiesCache");
    public static volatile ccx b;
    public final ccz c;
    public final AtomicBoolean d;
    public final AtomicLong e;
    public final AtomicLong f;
    public final Map g;

    private ccx(Context context) {
        ccz cczVar = ccz.b;
        if (cczVar == null) {
            synchronized (ccz.class) {
                cczVar = ccz.b;
                if (cczVar == null) {
                    cczVar = new ccz(context);
                    ccz.b = cczVar;
                }
            }
        }
        this.d = new AtomicBoolean(false);
        this.e = new AtomicLong(0L);
        this.f = new AtomicLong(0L);
        this.g = new HashMap();
        this.c = cczVar;
    }

    public static ccx a(Context context) {
        ccx ccxVar = b;
        if (ccxVar == null) {
            synchronized (ccx.class) {
                ccxVar = b;
                if (ccxVar == null) {
                    ccxVar = new ccx(context);
                    b = ccxVar;
                }
            }
        }
        return ccxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        this.c.j.set(z);
    }
}
