package defpackage;

import com.google.android.inputmethod.latin.R;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: ehc  reason: default package */
/* loaded from: classes.dex */
final class ehc extends dg {
    public final cuj a;
    public final llp b;
    public boolean c = true;
    private final Class d;
    private final Runnable e;

    private ehc(cuj cujVar, Class cls, llp llpVar, Runnable runnable) {
        this.a = cujVar;
        this.d = cls;
        this.b = llpVar;
        this.e = runnable;
    }

    public static ehc j(cuj cujVar, Class cls) {
        return new ehc(cujVar, cls, cujVar.x(), null);
    }

    public static ehc k(cuj cujVar, Class cls, Runnable runnable) {
        return new ehc(cujVar, cls, cujVar.x(), runnable);
    }

    @Override // defpackage.dg
    public final void f(int i, int i2) {
        if (this.c) {
            cuj cujVar = this.a;
            Class cls = this.d;
            Objects.requireNonNull(cls);
            cjm cjmVar = new cjm(cls, 7);
            int i3 = 0;
            for (cuq cuqVar : cujVar.d) {
                if (cjmVar.a(cuqVar.a)) {
                    i3++;
                }
            }
            if (i3 != 0) {
                return;
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
            this.c = false;
            cuj cujVar2 = this.a;
            cnf a = cng.a();
            a.c(false);
            a.e(1);
            a.h(R.layout.f134250_resource_name_obfuscated_res_0x7f0e008a);
            a.g(R.drawable.f49160_resource_name_obfuscated_res_0x7f08029c);
            a.d(R.string.f152920_resource_name_obfuscated_res_0x7f1402af);
            a.f(R.string.f166930_resource_name_obfuscated_res_0x7f14090e);
            a.a = new ega(this, 10);
            cujVar2.N(a.a());
        }
    }
}
