package defpackage;

/* compiled from: PG */
/* renamed from: gjy  reason: default package */
/* loaded from: classes.dex */
public final class gjy implements gjq {
    private final gjr a;
    private final niy b;
    private final gjd c;

    public gjy(gjr gjrVar, niy niyVar, gjd gjdVar) {
        this.a = gjrVar;
        this.b = niyVar;
        this.c = gjdVar;
    }

    private final boolean b(niw niwVar) {
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i < niwVar.a.size()) {
                int b = niv.b(niwVar.a.d(i));
                if (b != 0) {
                    i2 = b;
                }
                if (!this.a.a(i2, this.c).a()) {
                    return false;
                }
                i++;
            } else {
                for (nix nixVar : niwVar.b) {
                    if (!c(nixVar)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    private final boolean c(nix nixVar) {
        for (int i = 0; i < nixVar.a.size(); i++) {
            int b = niv.b(nixVar.a.d(i));
            if (b == 0) {
                b = 1;
            }
            if (this.a.a(b, this.c).a()) {
                return true;
            }
        }
        for (niw niwVar : nixVar.b) {
            if (b(niwVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gjq
    public final boolean a() {
        Boolean valueOf;
        int b;
        niy niyVar = this.b;
        int i = niyVar.a;
        if (i == 2) {
            valueOf = Boolean.valueOf(b((niw) niyVar.b));
        } else if (i != 3) {
            gjr gjrVar = this.a;
            int i2 = 1;
            if (i == 1 && (b = niv.b(((Integer) niyVar.b).intValue())) != 0) {
                i2 = b;
            }
            valueOf = Boolean.valueOf(gjrVar.a(i2, this.c).a());
        } else {
            valueOf = Boolean.valueOf(c((nix) niyVar.b));
        }
        return valueOf.booleanValue();
    }
}
