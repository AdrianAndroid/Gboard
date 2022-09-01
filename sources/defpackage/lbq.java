package defpackage;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lbq  reason: default package */
/* loaded from: classes.dex */
public final class lbq implements lam {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ List e;
    final /* synthetic */ lbs f;

    public lbq(lbs lbsVar, List list, List list2, long j, boolean z, List list3) {
        this.f = lbsVar;
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = z;
        this.e = list3;
    }

    @Override // defpackage.lam
    public final void a() {
        this.f.k(this.a, this.b, this.c);
    }

    @Override // defpackage.lam
    public final void b(int i) {
        this.f.l(i);
    }

    @Override // defpackage.lam
    public final void c() {
        if (!this.d) {
            this.f.j(this.e, this.a, this.b, this.c, true);
        }
    }
}
