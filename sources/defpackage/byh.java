package defpackage;

import java.util.List;

/* compiled from: PG */
/* renamed from: byh  reason: default package */
/* loaded from: classes.dex */
public final class byh implements mix {
    private final bxh a;
    private final List b;

    public byh(bxh bxhVar, List list) {
        this.a = bxhVar;
        this.b = list;
    }

    public static mqg b() {
        nfh t = mqf.b.t();
        efq.w(t, bxn.u, bxn.v, bxn.w, bxn.t);
        nfh t2 = mqg.d.t();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mqg mqgVar = (mqg) t2.b;
        mqgVar.b = 1;
        mqgVar.a = 1 | mqgVar.a;
        mqf mqfVar = (mqf) t.cz();
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        mqg mqgVar2 = (mqg) t2.b;
        mqfVar.getClass();
        mqgVar2.c = mqfVar;
        mqgVar2.a |= 2;
        return (mqg) t2.cz();
    }

    @Override // defpackage.mix
    public final mko a() {
        if (byn.a(this.b, (String) bxn.p.c()) == null) {
            return mkk.a;
        }
        this.a.f(b());
        return mkk.a;
    }
}
