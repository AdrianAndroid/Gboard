package defpackage;

import android.content.Context;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: cdk  reason: default package */
/* loaded from: classes.dex */
public final class cdk extends cdo implements hhk {
    final ino a;
    public final cdx b;
    public int c = 0;

    public cdk(Context context, cdx cdxVar) {
        this.a = ino.K(context, "_assignment");
        this.b = cdxVar;
    }

    @Override // defpackage.cdo, defpackage.ijj
    public final /* bridge */ /* synthetic */ void fd(ijg ijgVar) {
        ghe gheVar = ((cdp) ijgVar).a;
        int i = gheVar.b;
        if (i > 0 && this.c < i) {
            d(gheVar);
        }
    }

    @Override // defpackage.hhk
    public final void ib(hhl hhlVar) {
        if (this.c <= 0) {
            return;
        }
        ghd ghdVar = (ghd) ccu.i.j();
        if (ghdVar != null) {
            ghe gheVar = ghdVar.b;
            if (gheVar == null) {
                gheVar = ghe.e;
            }
            if (gheVar.b > 0) {
                ghe gheVar2 = ghdVar.b;
                if (gheVar2 == null) {
                    gheVar2 = ghe.e;
                }
                if (gheVar2.b <= this.c) {
                    return;
                }
            }
        }
        d(null);
    }

    private final void d(ghe gheVar) {
        int i;
        this.c = gheVar == null ? 0 : gheVar.b;
        if (gheVar == null || (i = gheVar.b) == 0) {
            this.a.w("assignment_version");
        } else {
            this.a.h("assignment_version", i);
        }
        HashSet hashSet = new HashSet();
        lmx g = lmz.g();
        if (this.c != 0 && gheVar != null && gheVar.c.size() > 0) {
            for (String str : gheVar.c) {
                g.d(jav.f(str));
                hashSet.add(str);
            }
        }
        if (!hashSet.isEmpty()) {
            this.a.k("assigned_noredirect", hashSet);
        } else {
            this.a.w("assigned_noredirect");
        }
        llw llwVar = lrq.b;
        if (gheVar == null || (gheVar.a & 2) == 0) {
            this.a.w("assigned_redirect");
        } else {
            llwVar = llw.k(ffb.o(gheVar.d));
            this.a.j("assigned_redirect", gheVar.d);
        }
        this.b.e(llwVar, g.g(), false);
    }
}
