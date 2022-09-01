package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: eai  reason: default package */
/* loaded from: classes.dex */
public final class eai extends chc {
    private final eqv u;

    public eai(eqv eqvVar, View view, leq leqVar, his hisVar, dxs dxsVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(view, leqVar, hisVar, dxsVar, dzr.k, null, null);
        this.u = eqvVar;
    }

    @Override // defpackage.chc, defpackage.cum
    public final /* bridge */ /* synthetic */ void F(Object obj, int i) {
        dzq dzqVar = (dzq) obj;
        eqv eqvVar = this.u;
        if (((AtomicInteger) eqvVar.d).incrementAndGet() == 0 && !((AtomicBoolean) eqvVar.c).get()) {
            eqvVar.d();
        }
        super.F(dzqVar, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.chc
    public final /* bridge */ /* synthetic */ boolean I(Object obj) {
        dzq dzqVar = (dzq) obj;
        eqv eqvVar = this.u;
        ((AtomicInteger) eqvVar.a).incrementAndGet();
        if (((AtomicInteger) eqvVar.d).decrementAndGet() == 0 && !((AtomicBoolean) eqvVar.c).get()) {
            eqvVar.d();
        }
        return super.I(dzqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.chc
    public final /* bridge */ /* synthetic */ void J(int i, Object obj) {
        dzq dzqVar = (dzq) obj;
        eqv eqvVar = this.u;
        ((AtomicInteger) eqvVar.b).incrementAndGet();
        if (((AtomicInteger) eqvVar.d).decrementAndGet() == 0 && !((AtomicBoolean) eqvVar.c).get()) {
            eqvVar.d();
        }
        super.J(i, dzqVar);
    }
}
