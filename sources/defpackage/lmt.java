package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* renamed from: lmt  reason: default package */
/* loaded from: classes.dex */
final class lmt implements Serializable {
    private static final long serialVersionUID = 0;
    private final llw a;

    public lmt(llw llwVar) {
        this.a = llwVar;
    }

    Object readResolve() {
        if (!this.a.isEmpty()) {
            ArrayList A = lre.A();
            lsz it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jez.F((lrh) entry.getKey(), entry.getValue(), A);
            }
            return jez.E(A);
        }
        return lmu.a;
    }
}
