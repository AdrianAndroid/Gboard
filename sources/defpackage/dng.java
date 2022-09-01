package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: dng  reason: default package */
/* loaded from: classes.dex */
public final class dng {
    public static final llw a = llw.m("fa", llp.r("farsi"), "en", llp.r("英文"));
    public final Map b = new HashMap();
    public final mko c;
    public final llp d;
    public jav e;
    private final Context f;
    private final hqo g;

    public dng(Context context, llp llpVar) {
        this.f = context;
        this.d = llpVar;
        dnf dnfVar = new dnf(this);
        this.g = dnfVar;
        dnfVar.e(mjl.a);
        for (jav javVar : jav.G()) {
            b(javVar);
        }
        this.c = gxo.a(1).hQ(new bof(this, 14));
    }

    public final llw a(jav javVar) {
        lls i = llw.i(this.d.size());
        llp llpVar = this.d;
        int size = llpVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            jav javVar2 = (jav) llpVar.get(i2);
            if (javVar == null) {
                i.a(javVar2, javVar2.n(this.f, javVar2).toLowerCase(javVar2.q()));
            } else {
                i.a(javVar2, javVar2.n(this.f, javVar).toLowerCase(javVar.q()));
            }
        }
        return i.l();
    }

    public final void b(jav javVar) {
        if (!this.b.containsKey(javVar)) {
            this.b.put(javVar, gxo.a(1).hQ(new brs(this, javVar, 12)));
        }
    }
}
