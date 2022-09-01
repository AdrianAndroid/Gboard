package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lra  reason: default package */
/* loaded from: classes.dex */
final class lra extends lqy implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final int b;

    public lra(Object obj, int i) {
        this.a = obj;
        this.b = i;
        jez.W(i, "count");
    }

    @Override // defpackage.lqw
    public final int a() {
        return this.b;
    }

    @Override // defpackage.lqw
    public final Object b() {
        return this.a;
    }
}
