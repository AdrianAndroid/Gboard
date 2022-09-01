package defpackage;

/* compiled from: PG */
/* renamed from: aww  reason: default package */
/* loaded from: classes.dex */
public final class aww implements Runnable {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;
    private final Object c;

    public aww(awz awzVar, bev bevVar, int i) {
        this.b = i;
        this.a = awzVar;
        this.c = bevVar;
    }

    public aww(jjp jjpVar, Runnable runnable, int i) {
        this.b = i;
        this.a = jjpVar;
        this.c = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [bev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [bev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [bev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [bev, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [bev, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            synchronized (this.c.a()) {
                synchronized (this.a) {
                    if (((awz) this.a).a.d(this.c)) {
                        ((awz) this.a).i.d();
                        Object obj = this.a;
                        this.c.e(((awz) obj).i, ((awz) obj).k);
                        ((awz) this.a).g(this.c);
                    }
                    ((awz) this.a).c();
                }
            }
        } else if (i != 1) {
            try {
                this.c.run();
            } finally {
                ((jjp) this.a).a();
            }
        } else {
            synchronized (this.c.a()) {
                synchronized (this.a) {
                    if (((awz) this.a).a.d(this.c)) {
                        Object obj2 = this.a;
                        this.c.d(((awz) obj2).g);
                    }
                    ((awz) this.a).c();
                }
            }
        }
    }
}
