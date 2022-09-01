package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lpp  reason: default package */
/* loaded from: classes.dex */
public final class lpp implements lph {
    private final /* synthetic */ int e;
    public static final lpp d = new lpp(3);
    public static final lpp c = new lpp(2);
    public static final lpp b = new lpp(1);
    public static final lpp a = new lpp(0);

    public lpp(int i) {
        this.e = i;
    }

    @Override // defpackage.lph
    public final lpn c() {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                return lpn.STRONG;
            }
            return i != 2 ? lpn.WEAK : lpn.WEAK;
        }
        return lpn.STRONG;
    }

    @Override // defpackage.lph
    public final lpn d() {
        int i = this.e;
        if (i != 0) {
            if (i == 1) {
                return lpn.STRONG;
            }
            return i != 2 ? lpn.WEAK : lpn.STRONG;
        }
        return lpn.WEAK;
    }

    @Override // defpackage.lph
    public final /* synthetic */ lpl f(lqc lqcVar, int i) {
        int i2 = this.e;
        if (i2 != 0) {
            if (i2 == 1) {
                return new lpl(lqcVar, i, null);
            }
            return i2 != 2 ? new lpx(lqcVar, i) : new lpv(lqcVar, i);
        }
        return new lpr(lqcVar, i);
    }

    @Override // defpackage.lph
    public final /* synthetic */ void e(lpl lplVar, lpg lpgVar, Object obj) {
        int i = this.e;
        if (i == 0) {
            lpq lpqVar = (lpq) lpgVar;
            ReferenceQueue referenceQueue = ((lpr) lplVar).h;
            lpz lpzVar = lpqVar.d;
            lpqVar.d = new lqa(referenceQueue, obj, lpqVar);
            lpzVar.clear();
        } else if (i == 1) {
            ((lpo) lpgVar).d = obj;
        } else if (i == 2) {
            lpv lpvVar = (lpv) lplVar;
            ((lpu) lpgVar).c = obj;
        } else {
            lpw lpwVar = (lpw) lpgVar;
            ReferenceQueue referenceQueue2 = ((lpx) lplVar).i;
            lpz lpzVar2 = lpwVar.c;
            lpwVar.c = new lqa(referenceQueue2, obj, lpwVar);
            lpzVar2.clear();
        }
    }

    @Override // defpackage.lph
    public final /* synthetic */ lpg b(lpl lplVar, Object obj, int i, lpg lpgVar) {
        int i2 = this.e;
        if (i2 == 0) {
            lpr lprVar = (lpr) lplVar;
            return new lpq(obj, i, (lpq) lpgVar);
        } else if (i2 == 1) {
            return new lpo(obj, i, (lpo) lpgVar);
        } else {
            if (i2 == 2) {
                return new lpu(((lpv) lplVar).h, obj, i, (lpu) lpgVar);
            }
            return new lpw(((lpx) lplVar).h, obj, i, (lpw) lpgVar);
        }
    }

    @Override // defpackage.lph
    public final /* synthetic */ lpg a(lpl lplVar, lpg lpgVar, lpg lpgVar2) {
        int i = this.e;
        if (i == 0) {
            lpr lprVar = (lpr) lplVar;
            lpq lpqVar = (lpq) lpgVar;
            lpq lpqVar2 = (lpq) lpgVar2;
            if (lpl.m(lpqVar)) {
                return null;
            }
            ReferenceQueue referenceQueue = lprVar.h;
            lpq lpqVar3 = new lpq(lpqVar.a, lpqVar.b, lpqVar2);
            lpqVar3.d = lpqVar.d.b(referenceQueue, lpqVar3);
            return lpqVar3;
        } else if (i == 1) {
            lpo lpoVar = (lpo) lpgVar;
            lpo lpoVar2 = new lpo(lpoVar.a, lpoVar.b, (lpo) lpgVar2);
            lpoVar2.d = lpoVar.d;
            return lpoVar2;
        } else if (i == 2) {
            lpv lpvVar = (lpv) lplVar;
            lpu lpuVar = (lpu) lpgVar;
            lpu lpuVar2 = (lpu) lpgVar2;
            if (lpuVar.get() == null) {
                return null;
            }
            lpu lpuVar3 = new lpu(lpvVar.h, lpuVar.get(), lpuVar.a, lpuVar2);
            lpuVar3.c = lpuVar.c;
            return lpuVar3;
        } else {
            lpx lpxVar = (lpx) lplVar;
            lpw lpwVar = (lpw) lpgVar;
            lpw lpwVar2 = (lpw) lpgVar2;
            if (lpwVar.get() == null || lpl.m(lpwVar)) {
                return null;
            }
            ReferenceQueue referenceQueue2 = lpxVar.h;
            ReferenceQueue referenceQueue3 = lpxVar.i;
            lpw lpwVar3 = new lpw(referenceQueue2, lpwVar.get(), lpwVar.a, lpwVar2);
            lpwVar3.c = lpwVar.c.b(referenceQueue3, lpwVar3);
            return lpwVar3;
        }
    }
}
