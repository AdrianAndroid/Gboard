package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: mjg  reason: default package */
/* loaded from: classes.dex */
public final class mjg extends mis {
    private List c;

    public mjg(llg llgVar, boolean z) {
        super(llgVar, z, true);
        List E;
        if (llgVar.isEmpty()) {
            E = Collections.emptyList();
        } else {
            E = lre.E(llgVar.size());
        }
        for (int i = 0; i < llgVar.size(); i++) {
            E.add(null);
        }
        this.c = E;
        r();
    }

    @Override // defpackage.mis
    public final void f(int i, Object obj) {
        List list = this.c;
        if (list != null) {
            list.set(i, new kdg(obj));
        }
    }

    @Override // defpackage.mis
    public final void q() {
        List<kdg> list = this.c;
        if (list != null) {
            ArrayList E = lre.E(list.size());
            for (kdg kdgVar : list) {
                E.add(kdgVar != null ? kdgVar.a : null);
            }
            c(Collections.unmodifiableList(E));
        }
    }

    @Override // defpackage.mis
    public final void s(mir mirVar) {
        super.s(mirVar);
        this.c = null;
    }
}
