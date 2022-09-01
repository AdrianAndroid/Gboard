package defpackage;

import android.content.Context;
import j$.util.function.Supplier;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: dhj  reason: default package */
/* loaded from: classes.dex */
public final class dhj extends dhn implements hho {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/handwriting/superpacks/HandwritingOnlineSuperpacks");
    public final hhl c;
    public final hhl d;
    public final Supplier e;
    public final dhd h;
    public final Object b = new Object();
    public final irt f = new dhf(this);
    public final Set g = new HashSet();

    public dhj(bze bzeVar, Context context, ExecutorService executorService, dhd dhdVar, hhl hhlVar, hhl hhlVar2, Supplier supplier) {
        super(bzeVar, context, executorService, "handwriting_recognition");
        this.h = dhdVar;
        this.c = hhlVar;
        this.d = hhlVar2;
        this.e = supplier;
    }

    @Override // defpackage.dhn
    public final int a() {
        return ((Long) this.d.c()).intValue();
    }

    @Override // defpackage.dhn
    public final bzu b(Context context) {
        bzt a2 = bzu.a(this.l);
        a2.e = 500;
        a2.f = 500;
        return a2.a();
    }

    @Override // defpackage.dhn
    public final dhm c() {
        return dhm.ONLINE;
    }

    @Override // defpackage.dhn
    public final String d() {
        return (String) this.c.c();
    }

    @Override // defpackage.dhn
    public final void e() {
        if (!irv.b()) {
            return;
        }
        llp b = hqr.b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dhr.a((hqt) b.get(i))) {
                f();
                return;
            }
            i = i2;
        }
    }

    public final void f() {
        kcu.U(mio.h(mio.h(i(), new bzi(this, 5), this.j), new coa(this, 8), this.j), new dhg(this, this.l), this.j);
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        this.j.execute(new dhh(this));
    }
}
