package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: dkc  reason: default package */
/* loaded from: classes.dex */
public final class dkc extends dkh {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/hmm/superpacks/DictionarySuperpacksManager");
    private static final llp j = llp.s(jav.f("zh"), jav.f("ko"));
    private static volatile dkc k;
    public final ArrayList b = lre.A();
    private final hqq l;

    private dkc() {
        super(diz.a, diz.b);
        dka dkaVar = new dka(this);
        this.l = dkaVar;
        dkaVar.d(gyc.b);
    }

    public static dkc b() {
        dkc dkcVar = k;
        if (dkcVar == null) {
            synchronized (dkc.class) {
                dkcVar = k;
                if (dkcVar == null) {
                    dkcVar = new dkc();
                    hhq.p(dkcVar, dkcVar.f, dkcVar.g);
                    dkcVar.i.e(gyc.b);
                    bze bzeVar = dkcVar.d;
                    jps jpsVar = jps.a;
                    bzt a2 = bzu.a("hmmdictionary");
                    jyu b = jpu.b();
                    b.g(jpsVar);
                    b.h(juc.o);
                    a2.b = b.f();
                    a2.e = 500;
                    a2.f = 300;
                    bzeVar.i(a2.a());
                    k = dkcVar;
                }
            }
        }
        return dkcVar;
    }

    @Override // defpackage.dkh
    public final jqk c(bys bysVar) {
        hrx.y(guw.a());
        return new djz(bysVar);
    }

    @Override // defpackage.dkh
    public final void d(byy byyVar) {
        int i;
        dkb[] dkbVarArr;
        synchronized (this.b) {
            if (!this.b.isEmpty()) {
                int size = this.b.size();
                dkbVarArr = new dkb[size];
                for (int i2 = 0; i2 < size; i2++) {
                    dkbVarArr[i2] = (dkb) this.b.get(i2);
                }
            } else {
                dkbVarArr = null;
            }
        }
        if (dkbVarArr != null) {
            for (dkb dkbVar : dkbVarArr) {
                dkbVar.h(byyVar);
            }
        }
    }

    @Override // defpackage.dkh
    protected final boolean e() {
        if (!((Boolean) div.a.c()).booleanValue() && irv.b()) {
            for (hqt hqtVar : hqr.b()) {
                if (hqtVar.i().j(j) != null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
