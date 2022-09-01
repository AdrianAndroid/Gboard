package defpackage;

/* compiled from: PG */
/* renamed from: nfk  reason: default package */
/* loaded from: classes2.dex */
public abstract class nfk extends nfm implements nha {
    public nfd d = nfd.a;

    public final nfd c() {
        nfd nfdVar = this.d;
        if (nfdVar.c) {
            this.d = nfdVar.clone();
        }
        return this.d;
    }

    public final void e(ngt ngtVar) {
        if (ngtVar.d == ((nfm) N(6))) {
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
}
