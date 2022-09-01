package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jmv  reason: default package */
/* loaded from: classes.dex */
public final class jmv implements kpx, kau, jmw {
    private final HashMap a = new HashMap();

    public jmv(Executor executor) {
        kcu.E(executor);
    }

    @Override // defpackage.kpx
    public final kpw a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.kpx
    public final kpw b(Uri uri) {
        synchronized (jmv.class) {
            if (this.a.get(uri) == null) {
                return null;
            }
            return (kpw) this.a.get(uri);
        }
    }

    @Override // defpackage.kau
    public final void c() {
    }

    @Override // defpackage.kau
    public final void d() {
    }

    @Override // defpackage.kau
    public final void e() {
        synchronized (jmv.class) {
            Iterator it = this.a.values().iterator();
            if (it.hasNext()) {
                jmu jmuVar = (jmu) it.next();
                throw null;
            }
        }
    }

    @Override // defpackage.kpx
    public final void f() {
    }
}
