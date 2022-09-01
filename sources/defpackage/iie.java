package defpackage;

/* compiled from: PG */
/* renamed from: iie  reason: default package */
/* loaded from: classes.dex */
public final class iie {
    public opq a;
    private long b;
    private byte c;

    public iie() {
    }

    public iie(iif iifVar) {
        this.a = iifVar.a;
        this.b = iifVar.b;
        this.c = (byte) 1;
    }

    public final iif a() {
        if (this.c == 1) {
            return new iif(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: cacheExpirationTimeInSeconds");
    }

    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
