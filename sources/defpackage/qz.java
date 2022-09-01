package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qz  reason: default package */
/* loaded from: classes2.dex */
public final class qz {
    static final qz a;
    static final qz b;
    final boolean c;
    final Throwable d;

    static {
        if (ri.a) {
            b = null;
            a = null;
            return;
        }
        b = new qz(false, null);
        a = new qz(true, null);
    }

    public qz(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
