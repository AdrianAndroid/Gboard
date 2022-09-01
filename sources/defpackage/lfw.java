package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lfw  reason: default package */
/* loaded from: classes.dex */
public final class lfw implements Iterable {
    final /* synthetic */ CharSequence a;
    final /* synthetic */ lfy b;

    public lfw(lfy lfyVar, CharSequence charSequence) {
        this.b = lfyVar;
        this.a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.j(this.a);
    }

    public final String toString() {
        lex d = lex.d(", ");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        d.j(sb, this);
        sb.append(']');
        return sb.toString();
    }
}
