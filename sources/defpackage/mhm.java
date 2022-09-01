package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: mhm  reason: default package */
/* loaded from: classes.dex */
final class mhm implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ mhn b;

    public mhm(mhn mhnVar, CharSequence charSequence) {
        this.b = mhnVar;
        this.a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new mhl(new mhk(this.b, this.a));
    }
}
