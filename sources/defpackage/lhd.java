package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: lhd  reason: default package */
/* loaded from: classes.dex */
public class lhd extends Enum {
    public static final lhd a;
    public static final lhd b;
    public static final lhd c;
    public static final lhd d;
    public static final lhd e;
    public static final lhd f;
    public static final lhd g;
    public static final lhd h;
    static final lhd[] i;
    private static final /* synthetic */ lhd[] j;

    static {
        lhd lhdVar = new lhd("STRONG", 0);
        a = lhdVar;
        lhd lhdVar2 = new lhd() { // from class: lgx
            @Override // defpackage.lhd
            public final lih a(lhm lhmVar, lih lihVar, lih lihVar2) {
                lih a2 = super.a(lhmVar, lihVar, lihVar2);
                d(lihVar, a2);
                return a2;
            }
        };
        b = lhdVar2;
        lhd lhdVar3 = new lhd() { // from class: lgy
            @Override // defpackage.lhd
            public final lih a(lhm lhmVar, lih lihVar, lih lihVar2) {
                lih a2 = super.a(lhmVar, lihVar, lihVar2);
                e(lihVar, a2);
                return a2;
            }
        };
        c = lhdVar3;
        lhd lhdVar4 = new lhd() { // from class: lgz
            @Override // defpackage.lhd
            public final lih a(lhm lhmVar, lih lihVar, lih lihVar2) {
                lih a2 = super.a(lhmVar, lihVar, lihVar2);
                d(lihVar, a2);
                e(lihVar, a2);
                return a2;
            }
        };
        d = lhdVar4;
        lhd lhdVar5 = new lhd("WEAK", 4);
        e = lhdVar5;
        lhd lhdVar6 = new lhd() { // from class: lha
            @Override // defpackage.lhd
            public final lih a(lhm lhmVar, lih lihVar, lih lihVar2) {
                lih a2 = super.a(lhmVar, lihVar, lihVar2);
                d(lihVar, a2);
                return a2;
            }
        };
        f = lhdVar6;
        lhd lhdVar7 = new lhd() { // from class: lhb
            @Override // defpackage.lhd
            public final lih a(lhm lhmVar, lih lihVar, lih lihVar2) {
                lih a2 = super.a(lhmVar, lihVar, lihVar2);
                e(lihVar, a2);
                return a2;
            }
        };
        g = lhdVar7;
        lhd lhdVar8 = new lhd() { // from class: lhc
            @Override // defpackage.lhd
            public final lih a(lhm lhmVar, lih lihVar, lih lihVar2) {
                lih a2 = super.a(lhmVar, lihVar, lihVar2);
                d(lihVar, a2);
                e(lihVar, a2);
                return a2;
            }
        };
        h = lhdVar8;
        j = new lhd[]{lhdVar, lhdVar2, lhdVar3, lhdVar4, lhdVar5, lhdVar6, lhdVar7, lhdVar8};
        i = new lhd[]{lhdVar, lhdVar2, lhdVar3, lhdVar4, lhdVar5, lhdVar6, lhdVar7, lhdVar8};
    }

    public lhd(String str, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static lhd b(lho lhoVar, boolean z, boolean z2) {
        int i2 = 0;
        int i3 = (lhoVar == lho.WEAK ? 4 : 0) | (z ? 1 : 0);
        if (true == z2) {
            i2 = 2;
        }
        return i[i3 | i2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void d(lih lihVar, lih lihVar2) {
        lihVar2.k(lihVar.b());
        lig.e(lihVar.h(), lihVar2);
        lig.e(lihVar2, lihVar.f());
        lig.g(lihVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void e(lih lihVar, lih lihVar2) {
        lihVar2.q(lihVar.c());
        lig.f(lihVar.i(), lihVar2);
        lig.f(lihVar2, lihVar.g());
        lig.h(lihVar);
    }

    public static lhd[] values() {
        return (lhd[]) j.clone();
    }

    public lih a(lhm lhmVar, lih lihVar, lih lihVar2) {
        return c(lhmVar, lihVar.j(), lihVar.a(), lihVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lih c(lhm lhmVar, Object obj, int i2, lih lihVar) {
        switch (ordinal()) {
            case 0:
                return new lhr(obj, i2, lihVar);
            case 1:
                return new lhp(obj, i2, lihVar);
            case 2:
                return new lht(obj, i2, lihVar);
            case 3:
                return new lhq(obj, i2, lihVar);
            case 4:
                return new lhz(lhmVar.h, obj, i2, lihVar);
            case 5:
                return new lhx(lhmVar.h, obj, i2, lihVar);
            case 6:
                return new lib(lhmVar.h, obj, i2, lihVar);
            case 7:
                return new lhy(lhmVar.h, obj, i2, lihVar);
            default:
                throw null;
        }
    }
}
