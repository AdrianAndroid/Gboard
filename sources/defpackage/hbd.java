package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* renamed from: hbd  reason: default package */
/* loaded from: classes.dex */
public final class hbd implements AutoCloseable, hbf, ijj, hhk {
    private static volatile hbd a;
    private final Context b;
    private final hdz c = hdz.a();
    private has d;

    private hbd(Context context) {
        this.b = context.getApplicationContext();
        this.d = has.a(context, hba.a().a());
    }

    public static hbd h(Context context) {
        hbd hbdVar = a;
        if (hbdVar == null) {
            synchronized (hbd.class) {
                hbdVar = a;
                if (hbdVar == null) {
                    mks a2 = gxo.a(9);
                    hbd hbdVar2 = new hbd(context);
                    ijl.b().h(hbdVar2, gvo.class, a2);
                    a = hbdVar2;
                    hbdVar = hbdVar2;
                }
            }
        }
        return hbdVar;
    }

    static final boolean j() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @Override // defpackage.hbg
    public final hiz b() {
        return !j() ? this.d.a.f : this.d.b();
    }

    @Override // defpackage.hbg
    public final String c(String str) {
        if (!j()) {
            return null;
        }
        return this.d.c(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ijl.b().d(this, gvo.class);
        a = null;
    }

    @Override // defpackage.hbg
    public final void d() {
        if (!j()) {
            return;
        }
        this.d.d();
    }

    @Override // defpackage.hbg
    public final boolean e(String str) {
        if (!j()) {
            return false;
        }
        return this.d.e(str);
    }

    @Override // defpackage.hbg
    public final void f() {
        this.d.f();
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fd(ijg ijgVar) {
        gvo gvoVar = (gvo) ijgVar;
        d();
    }

    @Override // defpackage.ijj
    public final /* synthetic */ void fe(Class cls) {
    }

    public final hau g() {
        return this.d.a;
    }

    public final String i(String str) {
        String c = c(str);
        if (c != null && this.c.g(c, hdn.instance.h)) {
            return c;
        }
        return null;
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        this.d = has.a(this.b, hba.a().a());
    }
}
