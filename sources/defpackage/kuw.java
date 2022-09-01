package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* renamed from: kuw  reason: default package */
/* loaded from: classes.dex */
final class kuw implements kwr {
    final /* synthetic */ kux a;
    private final /* synthetic */ int b;

    public kuw(kux kuxVar, int i) {
        this.b = i;
        this.a = kuxVar;
    }

    @Override // defpackage.kwr
    public final void a(Typeface typeface) {
        if (this.b != 0) {
            kux kuxVar = this.a;
            bdz bdzVar = kuxVar.G;
            if (bdzVar != null) {
                bdzVar.h();
            }
            if (kuxVar.q == typeface) {
                return;
            }
            kuxVar.q = typeface;
            kuxVar.p = kxc.c(kuxVar.a.getContext().getResources().getConfiguration(), typeface);
            Typeface typeface2 = kuxVar.p;
            if (typeface2 == null) {
                typeface2 = kuxVar.q;
            }
            kuxVar.o = typeface2;
            kuxVar.f();
            return;
        }
        kux kuxVar2 = this.a;
        bdz bdzVar2 = kuxVar2.F;
        if (bdzVar2 != null) {
            bdzVar2.h();
        }
        if (kuxVar2.t == typeface) {
            return;
        }
        kuxVar2.t = typeface;
        kuxVar2.s = kxc.c(kuxVar2.a.getContext().getResources().getConfiguration(), typeface);
        Typeface typeface3 = kuxVar2.s;
        if (typeface3 == null) {
            typeface3 = kuxVar2.t;
        }
        kuxVar2.r = typeface3;
        kuxVar2.f();
    }
}
