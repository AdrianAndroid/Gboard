package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: jnc  reason: default package */
/* loaded from: classes.dex */
public final class jnc implements kpx {
    public final jjd a;
    public final Context b;
    public final Object c = new Object();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();

    public jnc(Context context) {
        jmx jmxVar = new jmx(2);
        this.b = context;
        this.a = jmxVar;
    }

    @Override // defpackage.kpx
    public final kpw a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.kpx
    public final kpw b(Uri uri) {
        kpw kpwVar;
        synchronized (this.c) {
            kpwVar = (kpw) this.e.get(uri);
        }
        return kpwVar;
    }

    @Override // defpackage.kpx
    public final void f() {
    }
}
