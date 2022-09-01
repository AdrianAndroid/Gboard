package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: kpn  reason: default package */
/* loaded from: classes.dex */
public final class kpn implements koo {
    private final nhf a;
    private final nfb b = nfb.a();

    public kpn(nhf nhfVar) {
        this.a = nhfVar;
    }

    @Override // defpackage.koo
    public final /* bridge */ /* synthetic */ Object a(kon konVar) {
        InputStream a = kpo.b().a(konVar);
        try {
            Object g = this.a.g(a, this.b);
            if (a != null) {
                a.close();
            }
            return g;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
            }
            throw th;
        }
    }
}
