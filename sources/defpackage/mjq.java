package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: mjq  reason: default package */
/* loaded from: classes.dex */
public final class mjq implements mix {
    final /* synthetic */ Callable a;

    public mjq(Callable callable) {
        this.a = callable;
    }

    @Override // defpackage.mix
    public final mko a() {
        return kcu.K(this.a.call());
    }

    public final String toString() {
        return this.a.toString();
    }
}
