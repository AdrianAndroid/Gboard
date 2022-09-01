package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lml  reason: default package */
/* loaded from: classes.dex */
final class lml implements Serializable {
    final lmn a;

    public lml(lmn lmnVar) {
        this.a = lmnVar;
    }

    Object readResolve() {
        return this.a.t();
    }
}
