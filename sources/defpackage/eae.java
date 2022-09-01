package defpackage;

/* compiled from: PG */
/* renamed from: eae  reason: default package */
/* loaded from: classes.dex */
public final class eae {
    public boolean a = false;
    public Runnable b = mkz.a;
    private final hhl c;
    private final hiw d;

    public eae(hhl hhlVar, mks mksVar) {
        this.c = hhlVar;
        this.d = new hiw(new dvd(this, 20), mksVar);
    }

    public final void a() {
        this.d.a();
        this.a = false;
        this.b = mkz.a;
    }

    public final void b(Runnable runnable) {
        if (this.a) {
            this.b = runnable;
        } else {
            runnable.run();
        }
    }

    public final void c() {
        long longValue = ((Long) this.c.c()).longValue();
        if (longValue <= 0) {
            return;
        }
        this.a = true;
        this.d.b(longValue);
    }
}
