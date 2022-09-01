package defpackage;

/* compiled from: PG */
/* renamed from: jvq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jvq implements jnf {
    public final /* synthetic */ jsr a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ jvq(jsr jsrVar, int i, int i2) {
        this.c = i2;
        this.a = jsrVar;
        this.b = i;
    }

    @Override // defpackage.jnf
    public final void a(Object obj) {
        if (this.c == 0) {
            ((jvo) obj).y(this.a, this.b);
            return;
        }
        ((jra) obj).y(this.a, this.b);
    }
}
