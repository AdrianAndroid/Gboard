package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: igm  reason: default package */
/* loaded from: classes.dex */
public final class igm extends irm {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ igq c;

    public igm(igq igqVar, List list, List list2) {
        this.c = igqVar;
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.irm
    public final void d(String str) {
        if (!this.a.isEmpty()) {
            this.c.t = this.a.contains(str);
            boolean z = this.c.t;
        }
        if (!this.b.isEmpty()) {
            this.c.e(str);
            boolean z2 = this.c.u;
        }
        this.c.a();
    }
}
