package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: iud  reason: default package */
/* loaded from: classes.dex */
public final class iud implements ixn {
    private static final lfy a = lfy.c(',');
    private final int b;

    public iud(int i) {
        this.b = i;
    }

    private final String g() {
        List k = a.k((CharSequence) iue.a.c());
        return (this.b < k.size() && !((String) k.get(this.b)).isEmpty()) ? (String) k.get(this.b) : "bogusPopulation";
    }

    @Override // defpackage.ixn
    public final fwm a() {
        fwl a2 = fwm.a();
        a2.e(c());
        a2.c(g());
        a2.a = this.b + 352821669;
        return a2.a();
    }

    @Override // defpackage.ixn
    public final iiy b() {
        return gwu.b;
    }

    @Override // defpackage.ixn
    public final String c() {
        int i = this.b;
        return "MENES_TRAINER_" + i;
    }

    @Override // defpackage.ixn
    public final Set d() {
        return lmz.r(iue.a);
    }

    @Override // defpackage.ixn
    public final boolean e() {
        return !g().equals("bogusPopulation");
    }

    @Override // defpackage.ixn
    public final /* synthetic */ void f() {
    }
}
