package defpackage;

import java.util.Set;

/* compiled from: PG */
/* renamed from: dag  reason: default package */
/* loaded from: classes.dex */
public final class dag implements ixn {
    static final hhl a = hhq.a("enable_expression_trainer", false);
    static final hhl b = hhq.h("expression_trainer_population", "bogusPopulation");

    @Override // defpackage.ixn
    public final fwm a() {
        fwl a2 = fwm.a();
        a2.e("EXPRESSION_TRAINER");
        a2.a = 736638446;
        a2.c((String) b.c());
        return a2.a();
    }

    @Override // defpackage.ixn
    public final iiy b() {
        return gwu.b;
    }

    @Override // defpackage.ixn
    public final String c() {
        return "EXPRESSION_TRAINER";
    }

    @Override // defpackage.ixn
    public final Set d() {
        return lmz.s(a, b);
    }

    @Override // defpackage.ixn
    public final boolean e() {
        return ((Boolean) a.c()).booleanValue();
    }

    @Override // defpackage.ixn
    public final /* synthetic */ void f() {
    }
}
