package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: nhl  reason: default package */
/* loaded from: classes2.dex */
final class nhl extends neg {
    final nhm a;
    nei b = b();
    final /* synthetic */ nhn c;

    public nhl(nhn nhnVar) {
        this.c = nhnVar;
        this.a = new nhm(nhnVar);
    }

    private final nei b() {
        nhm nhmVar = this.a;
        if (nhmVar.hasNext()) {
            return nhmVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.nei
    public final byte a() {
        nei neiVar = this.b;
        if (neiVar == null) {
            throw new NoSuchElementException();
        }
        byte a = neiVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return a;
    }

    @Override // j$.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
