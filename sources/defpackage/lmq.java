package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lmq  reason: default package */
/* loaded from: classes.dex */
final class lmq implements Serializable {
    final lmr a;

    public lmq(lmr lmrVar) {
        this.a = lmrVar;
    }

    Object readResolve() {
        return this.a.f();
    }
}
