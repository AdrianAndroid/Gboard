package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: ina  reason: default package */
/* loaded from: classes.dex */
public final class ina implements inj, inh {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.inj
    public final void a(Context context, ini iniVar) {
        iniVar.q(this);
    }

    @Override // defpackage.inh
    public final void b(ini iniVar, Object obj, Object obj2, boolean z) {
        if (z) {
            while (obj != null && this.a.remove(obj)) {
                iniVar.p(obj, true);
                obj = iniVar.k(obj);
            }
        }
    }

    @Override // defpackage.inh
    public final void c(ini iniVar, Object obj, Object obj2, boolean z) {
        if (z) {
            while (obj2 != null && iniVar.c(obj2) <= 0) {
                if (((iniVar instanceof imz) && !((imz) iniVar).aH(obj2)) || !this.a.add(obj2)) {
                    return;
                }
                iniVar.p(obj2, false);
                if (obj != null) {
                    obj2 = obj;
                    obj = iniVar.k(obj);
                } else {
                    obj2 = obj;
                }
            }
        }
    }
}
