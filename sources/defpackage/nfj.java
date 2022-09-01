package defpackage;

import java.util.Map;

/* compiled from: PG */
/* renamed from: nfj  reason: default package */
/* loaded from: classes2.dex */
public final class nfj extends nfh implements nha {
    public nfj() {
        kig kigVar = kig.c;
        throw null;
    }

    @Override // defpackage.nfh
    /* renamed from: a */
    public final nfk cy() {
        if (this.c) {
            return (nfk) this.b;
        }
        ((nfk) this.b).d.e();
        return (nfk) super.cA();
    }

    public final Object b(ngt ngtVar) {
        nfk nfkVar = (nfk) this.b;
        nfkVar.e(ngtVar);
        Object k = nfkVar.d.k((nfl) ngtVar.c);
        if (k == null) {
            return ngtVar.b;
        }
        ngtVar.c(k);
        return k;
    }

    public final boolean c(ngt ngtVar) {
        nfk nfkVar = (nfk) this.b;
        nfkVar.e(ngtVar);
        return nfkVar.d.m((nfl) ngtVar.c);
    }

    @Override // defpackage.nfh
    public final void cD() {
        super.cD();
        nfk nfkVar = (nfk) this.b;
        nfkVar.d = nfkVar.d.clone();
    }

    public final void d(ngt ngtVar, Object obj) {
        Map map = nfm.cP;
        if (ngtVar.d == this.a) {
            if (this.c) {
                cD();
                this.c = false;
            }
            nfd nfdVar = ((nfk) this.b).d;
            if (nfdVar.c) {
                nfdVar = nfdVar.clone();
                ((nfk) this.b).d = nfdVar;
            }
            nfl nflVar = (nfl) ngtVar.c;
            if (nflVar.a() == nil.ENUM) {
                obj = Integer.valueOf(((nfp) obj).a());
            }
            nfdVar.l(nflVar, obj);
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public nfj(nfk nfkVar) {
        super(nfkVar);
    }
}
