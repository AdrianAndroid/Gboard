package defpackage;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: bxi  reason: default package */
/* loaded from: classes.dex */
public final class bxi implements bxh {
    private static final ltg d = ltg.j("com/google/android/apps/inputmethod/libs/crank/CrankDelegateWrapper");
    public final AtomicReference a = new AtomicReference(null);
    public final Object b = new Object();
    public final Map c = new EnumMap(mqc.class);

    @Override // defpackage.bxh
    public final mko a(mqa mqaVar) {
        bxh bxhVar = (bxh) this.a.get();
        if (bxhVar == null) {
            int i = mqaVar.b;
            mqc mqcVar = mqc.UNKNOWN_ENGINE;
            return mkk.a;
        }
        synchronized (this.b) {
            Map map = this.c;
            mqc b = mqc.b(mqaVar.b);
            if (b == null) {
                b = mqc.UNKNOWN_ENGINE;
            }
            map.put(b, mqaVar);
        }
        return bxhVar.a(mqaVar);
    }

    @Override // defpackage.byd
    public final /* synthetic */ void b() {
        cog.l(this);
    }

    @Override // defpackage.bxh
    public final mko c(mqa mqaVar) {
        bxh bxhVar = (bxh) this.a.get();
        if (bxhVar == null) {
            int i = mqaVar.b;
            mqc mqcVar = mqc.UNKNOWN_ENGINE;
            return mkk.a;
        }
        synchronized (this.b) {
            Map map = this.c;
            mqc b = mqc.b(mqaVar.b);
            if (b == null) {
                b = mqc.UNKNOWN_ENGINE;
            }
            if (map.remove(b) == null) {
                int i2 = mqaVar.b;
                return mkk.a;
            }
            return bxhVar.c(mqaVar);
        }
    }

    @Override // defpackage.bxh
    public final void d() {
        bxh bxhVar = (bxh) this.a.get();
        if (bxhVar == null) {
            return;
        }
        bxhVar.d();
    }

    @Override // defpackage.bxh
    public final void e() {
        bxh bxhVar = (bxh) this.a.get();
        if (bxhVar == null) {
            ((ltd) ((ltd) d.d()).k("com/google/android/apps/inputmethod/libs/crank/CrankDelegateWrapper", "requestCrankResetAfterP13nModelAvailable", 51, "CrankDelegateWrapper.java")).t("requestCrankReset(): delegate not set");
        } else {
            bxhVar.e();
        }
    }

    @Override // defpackage.bxh
    public final void f(mqg mqgVar) {
        bxh bxhVar = (bxh) this.a.get();
        if (bxhVar == null) {
            int i = mqgVar.b;
        } else {
            bxhVar.f(mqgVar);
        }
    }

    public final void g(mqc mqcVar) {
        nfh t = mqa.f.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mqa mqaVar = (mqa) t.b;
        mqaVar.b = mqcVar.t;
        mqaVar.a |= 1;
        c((mqa) t.cz());
    }
}
