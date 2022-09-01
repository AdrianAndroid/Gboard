package defpackage;

/* compiled from: PG */
/* renamed from: gqk  reason: default package */
/* loaded from: classes.dex */
public final class gqk {
    private final int a;
    private final String b;
    private final gqh c;
    private final gqh d;
    private int e = -1;

    public gqk(int i, String str, gqh gqhVar, gqh gqhVar2) {
        this.a = i;
        this.b = str;
        this.c = gqhVar;
        this.d = gqhVar2;
    }

    public final void a(int i) {
        gqh gqhVar;
        if (this.e == i) {
            return;
        }
        this.e = i;
        if (i != 0) {
            gqhVar = i != 1 ? null : this.d;
        } else {
            gqhVar = this.c;
        }
        if (gqhVar != null) {
            gqq.b(this.a, gqhVar);
        } else {
            grd.b(this.a, this.b);
        }
    }
}
