package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: kgh  reason: default package */
/* loaded from: classes.dex */
public final class kgh extends kcu implements kch, kdt {
    public final kdq a;
    public final nox c;
    private final mks f;
    public final Object b = new Object();
    public final ArrayList d = new ArrayList(0);
    public final AtomicInteger e = new AtomicInteger();

    public kgh(kdr kdrVar, kcl kclVar, mks mksVar, nox noxVar, nox noxVar2, oiy oiyVar, Executor executor) {
        super(null);
        this.a = kdrVar.a(executor, noxVar, oiyVar);
        this.f = mksVar;
        this.c = noxVar2;
        kclVar.a(this);
    }

    public final mko a() {
        kgf[] kgfVarArr;
        if (this.e.get() > 0) {
            return kcu.M(new clc(this, 9), 1L, TimeUnit.SECONDS, this.f);
        }
        synchronized (this.b) {
            if (!this.d.isEmpty()) {
                ArrayList arrayList = this.d;
                kgfVarArr = (kgf[]) arrayList.toArray(new kgf[arrayList.size()]);
                this.d.clear();
            } else {
                kgfVarArr = null;
            }
        }
        if (kgfVarArr == null) {
            return mkk.a;
        }
        return kcu.P(new dus(this, kgfVarArr, 13), this.f);
    }

    @Override // defpackage.kdt
    public final /* synthetic */ void ad() {
    }

    @Override // defpackage.kch
    public final void c(Activity activity) {
        a();
    }
}
