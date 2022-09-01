package defpackage;

import android.content.Context;
import android.util.Printer;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* renamed from: isx  reason: default package */
/* loaded from: classes.dex */
public final class isx implements isv, hho, gzv {
    private final llp a;

    /* JADX WARN: Multi-variable type inference failed */
    public isx(Context context) {
        this.a = llp.x(itb.b, itb.c, itb.d, itb.e, itb.f, itb.g, itb.h.b, itb.a.b, itb.i, itb.j, itb.k, itb.l, itb.m.b, itb.n, itb.o, iho.a(context));
    }

    private final String b() {
        ArrayList arrayList = new ArrayList(((lrl) this.a).c + 1);
        llp llpVar = this.a;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            hhl hhlVar = (hhl) llpVar.get(i2);
            String d = hhlVar.d();
            String valueOf = String.valueOf(hhlVar.c());
            arrayList.add(d + "=" + valueOf);
        }
        boolean g = itb.g();
        arrayList.add("keyBorderEnabledForNewUser=" + g);
        return lex.d(", ").f(arrayList);
    }

    @Override // defpackage.isv
    public final void c() {
        hhq.q(this);
    }

    @Override // defpackage.isv
    public final void d() {
        hhq.o(this, this.a);
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        printer.println("Theme flags: ".concat(b()));
    }

    @Override // defpackage.hho
    public final void gW(Set set) {
        b();
        isz.b();
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "ThemeFlagObserver";
    }
}
