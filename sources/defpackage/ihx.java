package defpackage;

/* compiled from: PG */
/* renamed from: ihx  reason: default package */
/* loaded from: classes.dex */
final class ihx implements ihw {
    private final String a;
    private long b = 0;
    private long c = 0;
    private long d = 0;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;

    public ihx(String str) {
        this.a = str;
    }

    @Override // defpackage.ihw
    public final void a(long j) {
        synchronized (this) {
            this.b += j;
        }
    }

    @Override // defpackage.ihw
    public final void b(long j) {
        synchronized (this) {
            this.c += j;
        }
    }

    @Override // defpackage.ihw
    public final void c(nvu nvuVar) {
        synchronized (this) {
            if (!this.g && this.f && this.e) {
                this.g = true;
                ieh.j().e(iik.d, this.a, Integer.valueOf(nvuVar.o.r), nvuVar.q, Integer.valueOf((int) this.c), Integer.valueOf((int) this.d));
            }
        }
    }

    @Override // defpackage.ihw
    public final void d() {
        synchronized (this) {
            this.f = true;
        }
    }

    @Override // defpackage.ihw
    public final void e(long j) {
        synchronized (this) {
            this.d = j;
            this.e = true;
        }
    }
}
