package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lnv  reason: default package */
/* loaded from: classes.dex */
public final class lnv extends lkv {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    public lnv(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        int i = this.b;
        jdg.u(it);
        jdg.w(i >= 0, "limit is negative");
        return new loa(i, it);
    }
}
