package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mhw  reason: default package */
/* loaded from: classes.dex */
public final class mhw {
    static final mhw a;
    static final mhw b;
    final boolean c;
    final Throwable d;

    static {
        if (mik.h) {
            b = null;
            a = null;
            return;
        }
        b = new mhw(false, null);
        a = new mhw(true, null);
    }

    public mhw(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
