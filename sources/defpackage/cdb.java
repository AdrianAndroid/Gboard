package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: cdb  reason: default package */
/* loaded from: classes.dex */
public final class cdb implements AutoCloseable, hhk {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/dlam/DlamWrapper");
    private static volatile cdb f;
    public final ccx b;
    public final Executor c;
    public final Set d = Collections.synchronizedSet(new HashSet());
    public mko e = kcu.K(false);
    private final idk g;
    private final isf h;

    private cdb(Context context) {
        ccu.a(context);
        mks a2 = gxo.a(11);
        ccx a3 = ccx.a(context);
        hrx.y(context);
        ieh j = ieh.j();
        isf a4 = ism.a(context);
        this.c = a2;
        this.b = a3;
        this.g = j;
        this.h = a4;
        ieh.j().u(new dxn(a3, 1));
    }

    public static cdb b(Context context) {
        if (f == null) {
            synchronized (cdb.class) {
                if (f == null) {
                    f = new cdb(context.getApplicationContext());
                }
            }
        }
        return f;
    }

    private final boolean e() {
        return this.h.b(cdg.c());
    }

    public final boolean c() {
        if (ccu.c()) {
            if (((Boolean) ccu.b.c()).booleanValue()) {
                llp b = hqr.b();
                int size = b.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((hqt) b.get(i)).k().isEmpty()) {
                        i = i2;
                    }
                }
            }
            ccz cczVar = this.b.c;
            if ((cczVar.i.get() && cczVar.g.get() > ((Long) ccu.f.c()).longValue()) || ((Boolean) ccu.d.c()).booleanValue()) {
                if (this.b.c.j.get()) {
                    return true;
                }
                this.b.b(true);
                this.g.e(cap.DLAM_ACTIVATED, new Object[0]);
                return d();
            }
        }
        return e();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ccu.a.g(this);
    }

    public final boolean d() {
        return this.h.c(cdg.c());
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        if (ccu.c()) {
            c();
            return;
        }
        e();
        this.b.b(false);
    }
}
