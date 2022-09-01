package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: nzg  reason: default package */
/* loaded from: classes2.dex */
public final class nzg {
    private ArrayList b = new ArrayList();
    public volatile nsl a = nsl.IDLE;

    public final void a(nsl nslVar) {
        jdg.Q(nslVar, "newState");
        if (this.a == nslVar || this.a == nsl.SHUTDOWN) {
            return;
        }
        this.a = nslVar;
        if (this.b.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.b;
        this.b = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        nxo nxoVar = (nxo) arrayList.get(0);
        throw null;
    }
}
