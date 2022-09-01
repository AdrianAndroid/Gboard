package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jmz  reason: default package */
/* loaded from: classes.dex */
public final class jmz implements kpx, kau, jmw {
    public final jjd a;
    public final Executor b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    private final jmv e;

    public jmz(gjz gjzVar, Executor executor, byte[] bArr) {
        Objects.requireNonNull(gjzVar);
        jmx jmxVar = new jmx(0);
        this.a = jmxVar;
        this.b = kcu.E(executor);
        this.e = new jmv(executor);
    }

    @Override // defpackage.kpx
    public final kpw a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.kpx
    public final kpw b(Uri uri) {
        synchronized (jmz.class) {
            String str = (String) this.c.get(uri);
            if (str == null) {
                return this.e.b(uri);
            } else if (this.d.get(str) == null) {
                jmk.c("%s: Can't find file group for uri: %s", "DownloadProgressMonitor", uri);
                return null;
            } else {
                return (kpw) this.d.get(str);
            }
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
        synchronized (jmz.class) {
            for (kpk kpkVar : this.d.values()) {
                opu opuVar = ((jmy) kpkVar.a).c;
                int i = jmk.a;
            }
            this.e.e();
        }
    }

    @Override // defpackage.kpx
    public final void f() {
    }

    public final void g(String str, long j) {
        synchronized (jmz.class) {
            if (this.d.containsKey(str)) {
                ((kpk) this.d.get(str)).a.a((int) j);
            }
        }
    }

    public final void h(String str) {
        synchronized (jmz.class) {
            this.d.remove(str);
        }
    }
}
