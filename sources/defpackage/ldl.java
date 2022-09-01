package defpackage;

/* compiled from: PG */
/* renamed from: ldl  reason: default package */
/* loaded from: classes.dex */
public final class ldl {
    public final ldm a;
    public int b = 0;
    public long c = 0;

    public ldl(ldm ldmVar) {
        this.a = ldmVar;
    }

    public final int a() {
        ldm ldmVar = this.a;
        return (int) Math.min(ldmVar.c, ldmVar.a() - this.c);
    }

    public final void b(int i) {
        this.b = (this.b + i) % this.a.c;
    }
}
