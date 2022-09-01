package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lku  reason: default package */
/* loaded from: classes.dex */
public final class lku extends lkv {
    final /* synthetic */ Iterable[] a;

    public lku(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return lre.Q(new lkt(this, this.a.length));
    }
}
