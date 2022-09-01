package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: ojd  reason: default package */
/* loaded from: classes2.dex */
public final class ojd implements Serializable {
    public final Throwable a;

    public ojd(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ojd) && oll.g(this.a, ((ojd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.a + ')';
    }
}
