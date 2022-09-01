package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: ekh  reason: default package */
/* loaded from: classes.dex */
public final class ekh implements cwx {
    private final cvx a;
    private final cwo b;
    private final cwu c;

    public ekh(Context context) {
        cvx cvxVar = new cvx(context);
        this.a = cvxVar;
        cwo a = cwo.a(context);
        this.b = a;
        this.c = new cwu(cvxVar, a);
    }

    @Override // defpackage.cwx
    public final hja e(String str) {
        hiz b = hjg.b(this.a.e(str));
        hiz b2 = hjg.b(this.b.e(str));
        return hjg.c(hiz.L(b, b2).d(new brs(b, b2, 17), mjl.a));
    }

    @Override // defpackage.cwx
    public final mko k(int i) {
        return this.c.k(2);
    }

    @Override // defpackage.cwx
    public final mko n(String str) {
        return this.c.n(str);
    }
}
