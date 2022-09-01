package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hjc  reason: default package */
/* loaded from: classes.dex */
public final class hjc implements hja {
    private final leq a;
    private mko b = null;

    public hjc(leq leqVar) {
        this.a = leqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        mko mkoVar = this.b;
        if (mkoVar == null) {
            return true;
        }
        if (hji.e(mkoVar)) {
            throw new IllegalStateException("hasNext cannot be determined since the previous page is still pending");
        }
        try {
            return ((hjd) kcu.S(this.b)).b;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        hjd hjdVar = (hjd) hji.b(this.b);
        mko mkoVar = (mko) this.a.a(hjdVar != null ? hjdVar.a : null);
        this.b = mkoVar;
        return hiz.k(mkoVar).u(hht.f, mjl.a);
    }
}
