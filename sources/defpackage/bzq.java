package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: bzq  reason: default package */
/* loaded from: classes.dex */
public final class bzq implements miy {
    final /* synthetic */ bzu a;
    final /* synthetic */ String b;
    final /* synthetic */ jqk c;
    final /* synthetic */ int d;
    final /* synthetic */ List e;
    final /* synthetic */ bzr f;

    public bzq(bzr bzrVar, bzu bzuVar, String str, jqk jqkVar, int i, List list) {
        this.f = bzrVar;
        this.a = bzuVar;
        this.b = str;
        this.c = jqkVar;
        this.d = i;
        this.e = list;
    }

    @Override // defpackage.miy
    public final /* bridge */ /* synthetic */ mko a(Object obj) {
        Void r3 = (Void) obj;
        this.f.i(this.a);
        return mio.h(this.f.m(this.b), new bzi(this, 2), this.f.i);
    }
}
