package defpackage;

/* compiled from: PG */
/* renamed from: ibo  reason: default package */
/* loaded from: classes.dex */
public final class ibo {
    public final boolean a;
    public final long b;
    public final int[] c;

    public static ibn a() {
        return new ibn(true, 0L, gvw.b);
    }

    public ibo(ibn ibnVar) {
        this.a = ibnVar.a;
        this.b = ibnVar.b;
        gvy gvyVar = ibnVar.c;
        int[] e = gvyVar.a == 0 ? null : gvyVar.e();
        this.c = e;
        if (e != null) {
            return;
        }
        throw new lgj("The resource ids are not specified.");
    }
}
