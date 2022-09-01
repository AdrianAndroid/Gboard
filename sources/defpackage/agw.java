package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agw  reason: default package */
/* loaded from: classes.dex */
public final class agw implements age {
    public final ahc a;
    public final agt b;
    public boolean c = false;

    public agw(ahc ahcVar, agt agtVar) {
        this.a = ahcVar;
        this.b = agtVar;
    }

    @Override // defpackage.age
    public final void a(Object obj) {
        if (agu.b(2)) {
            new StringBuilder("  onLoadFinished in ").append(this.a);
            ahc.e(obj);
        }
        this.c = true;
        knb knbVar = (knb) this.b;
        knbVar.a.clear();
        knbVar.a.addAll((List) obj);
        knbVar.a.notifyDataSetChanged();
    }

    public final String toString() {
        return this.b.toString();
    }
}
