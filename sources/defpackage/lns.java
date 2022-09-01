package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lns  reason: default package */
/* loaded from: classes.dex */
public final class lns extends lkv {
    final /* synthetic */ Iterable a;
    final /* synthetic */ leq b;

    public lns(Iterable iterable, leq leqVar) {
        this.a = iterable;
        this.b = leqVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return lre.S(this.a.iterator(), this.b);
    }
}
