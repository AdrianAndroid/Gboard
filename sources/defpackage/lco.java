package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lco  reason: default package */
/* loaded from: classes.dex */
public final class lco extends lch implements lck {
    private final Exception a;
    private final boolean b;

    public lco(String str, lck lckVar, lcs lcsVar, boolean z) {
        super(str, lckVar);
        jdg.v(lcsVar.d);
        this.a = lckVar.e();
        this.b = z;
    }

    @Override // defpackage.lck
    public final lcx d(String str, lcs lcsVar, boolean z) {
        if (z && !this.b) {
            WeakHashMap weakHashMap = ldh.a;
        }
        boolean z2 = true;
        if ((!z || this.b) && !this.b) {
            z2 = false;
        }
        return new lco(str, this, lcsVar, z2);
    }

    @Override // defpackage.lck
    public final Exception e() {
        return this.a;
    }

    @Override // defpackage.lcx
    public final lcx f(String str, lcs lcsVar) {
        return d(str, lcsVar, true);
    }

    public lco(String str, lcs lcsVar, boolean z) {
        super(str, lcm.a.b());
        jdg.v(lcsVar.d);
        this.a = lcn.a;
        this.b = z;
    }
}
