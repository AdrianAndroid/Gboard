package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: khg  reason: default package */
/* loaded from: classes.dex */
public final class khg extends kfl implements kdt, khc {
    public final nox a;
    public final AtomicReference b;
    public final jlt c;
    private final mks d;

    public khg(kdr kdrVar, mks mksVar, nox noxVar, oiy oiyVar, jlt jltVar, byte[] bArr, byte[] bArr2) {
        super((byte[]) null);
        AtomicReference atomicReference = new AtomicReference();
        this.b = atomicReference;
        this.d = mksVar;
        this.a = noxVar;
        this.c = jltVar;
        kdrVar.a(mksVar, khf.a, oiyVar);
        atomicReference.set(jltVar.d(1.0f));
    }

    @Override // defpackage.kdt
    public final void ad() {
        kcu.N(new joq(this, 4), this.d);
    }
}
