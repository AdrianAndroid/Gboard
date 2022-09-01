package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lnr  reason: default package */
/* loaded from: classes.dex */
public final class lnr extends lkv {
    final /* synthetic */ Iterable a;
    final /* synthetic */ lfe b;

    public lnr(Iterable iterable, lfe lfeVar) {
        this.a = iterable;
        this.b = lfeVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return lre.M(this.a.iterator(), this.b);
    }
}
