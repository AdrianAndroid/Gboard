package defpackage;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: has  reason: default package */
/* loaded from: classes.dex */
public final class has implements hbf {
    public final hau a;
    private final llp b;

    private has(Context context, hba hbaVar) {
        this.a = hau.c(context);
        llk e = llp.e();
        if (hbaVar.a) {
            e.h(hbj.g(context, null));
        }
        this.b = e.g();
    }

    public static has a(Context context, hba hbaVar) {
        return new has(context, hbaVar);
    }

    @Override // defpackage.hbg
    public final hiz b() {
        ArrayList arrayList = new ArrayList();
        llp llpVar = this.b;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(((hbg) llpVar.get(i2)).b());
        }
        return hiz.K(arrayList).f();
    }

    @Override // defpackage.hbg
    public final String c(String str) {
        llp llpVar = this.b;
        int i = ((lrl) llpVar).c;
        int i2 = 0;
        while (i2 < i) {
            String c = ((hbg) llpVar.get(i2)).c(str);
            i2++;
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    @Override // defpackage.hbg
    public final void d() {
        llp llpVar = this.b;
        int i = ((lrl) llpVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((hbg) llpVar.get(i2)).d();
        }
    }

    @Override // defpackage.hbg
    public final boolean e(String str) {
        llp llpVar = this.b;
        int i = ((lrl) llpVar).c;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            z = ((hbg) llpVar.get(i2)).e(str) || z;
        }
        return z;
    }

    @Override // defpackage.hbg
    public final void f() {
        if (this.b.isEmpty()) {
            return;
        }
        ((hbg) this.b.get(0)).f();
    }
}
