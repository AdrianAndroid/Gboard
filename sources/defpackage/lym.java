package defpackage;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: lym  reason: default package */
/* loaded from: classes.dex */
public abstract class lym {
    public abstract InputStream a();

    public lfb b() {
        return ldu.a;
    }

    public final InputStream c() {
        InputStream a = a();
        if (a instanceof BufferedInputStream) {
            return (BufferedInputStream) a;
        }
        return new BufferedInputStream(a);
    }

    public byte[] d() {
        byte[] e;
        lyu a = lyu.a();
        try {
            InputStream a2 = a();
            a.d(a2);
            lfb b = b();
            if (b.e()) {
                e = lyp.f(a2, ((Long) b.a()).longValue());
            } else {
                e = lyp.e(a2);
            }
            return e;
        } catch (Throwable th) {
            try {
                throw a.b(th);
            } finally {
                a.close();
            }
        }
    }

    public final void e(lyl lylVar) {
        lyu a = lyu.a();
        try {
            InputStream a2 = a();
            a.d(a2);
            FileOutputStream a3 = ((lyx) lylVar).a();
            a.d(a3);
            lyp.b(a2, a3);
        } finally {
        }
    }
}
