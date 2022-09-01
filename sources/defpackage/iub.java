package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iub  reason: default package */
/* loaded from: classes.dex */
public final class iub implements ity, hho, inm {
    public static final ltg a = ltg.j("com/google/android/libraries/inputmethod/trainingcache/guarder/TrainingCacheGuarder");
    private static final lfy c = lfy.c(',').h().b();
    public final Executor b;
    private final itx f;
    private Boolean h;
    private iro i;
    private lmz g = lrr.a;
    private final iye j = new itz(this);
    private final ino d = ino.L();
    private final boolean e = true;

    public iub(Executor executor) {
        this.b = executor;
        this.f = new itx(executor, new gwc(), ieh.j());
    }

    private final void d() {
        this.g = lmz.o(c.i((CharSequence) itm.d.c()));
    }

    private final void e() {
        irp b = irp.b();
        String str = null;
        String str2 = b == null ? null : b.a;
        if (b != null) {
            str = b.b;
        }
        c(str2, str);
    }

    private final boolean f(String str) {
        return str != null && this.g.contains(str.toUpperCase(Locale.US));
    }

    public final void c(String str, String str2) {
        boolean f = f(str);
        boolean f2 = f(str2);
        boolean ak = this.d.ak("user_enable_federated_training");
        boolean z = jam.b;
        boolean booleanValue = ((Boolean) itm.e.c()).booleanValue();
        boolean z2 = false;
        if (ak && ((this.e && z) || booleanValue || (f && f2))) {
            z2 = true;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        Boolean bool = this.h;
        if (bool == null || bool.booleanValue() != z2) {
            if (z2) {
                ijf.j(itl.a);
            } else {
                ijf.k(itl.a);
            }
        }
        this.h = valueOf;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        Boolean bool = this.h;
        new StringBuilder("current training eligibility: ").append(bool);
        printer.println("current training eligibility: ".concat(String.valueOf(bool)));
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        if (set.contains(itm.d)) {
            d();
        }
        e();
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "TrainingCacheGuarder";
    }

    @Override // defpackage.ifw
    public final void gm(Context context, igg iggVar) {
        itx itxVar = this.f;
        itx.b.e(itxVar);
        itxVar.b();
        this.j.d(this.b);
        d();
        hhq.p(this, itm.d, itm.e);
        this.d.aa(this, "user_enable_federated_training");
        if (this.i == null) {
            this.i = new iua(this);
        }
        ijl.b().h(this.i, irp.class, gyc.b);
        e();
    }

    @Override // defpackage.ifw
    public final void gn() {
        itx.b.g(this.f);
        this.j.e();
        iro iroVar = this.i;
        if (iroVar != null) {
            ijl.b().d(iroVar, irp.class);
        }
        hhq.q(this);
        this.d.ad(this);
    }

    @Override // defpackage.inm
    public final void go(ino inoVar, String str) {
        e();
    }
}
