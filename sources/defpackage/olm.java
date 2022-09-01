package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: olm  reason: default package */
/* loaded from: classes2.dex */
public class olm implements Serializable, olj {
    private final int a;

    public olm(int i) {
        this.a = i;
    }

    @Override // defpackage.olj
    public final int f() {
        return this.a;
    }

    public final String toString() {
        int i = olr.a;
        String j = oll.j(this);
        oll.d(j, "renderLambdaToString(this)");
        return j;
    }
}
