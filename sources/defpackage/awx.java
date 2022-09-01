package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: awx  reason: default package */
/* loaded from: classes.dex */
final class awx {
    final bev a;
    final Executor b;

    public awx(bev bevVar, Executor executor) {
        this.a = bevVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof awx) {
            return this.a.equals(((awx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
