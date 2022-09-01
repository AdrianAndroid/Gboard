package defpackage;

/* compiled from: PG */
/* renamed from: axb  reason: default package */
/* loaded from: classes.dex */
public final class axb implements axh {
    public final boolean a;
    private final axh b;
    private final auw c;
    private int d;
    private boolean e;
    private final kdr f;

    public axb(axh axhVar, boolean z, auw auwVar, kdr kdrVar, byte[] bArr, byte[] bArr2) {
        ce.m(axhVar);
        this.b = axhVar;
        this.a = z;
        this.c = auwVar;
        ce.m(kdrVar);
        this.f = kdrVar;
    }

    @Override // defpackage.axh
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.axh
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.axh
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.e) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.d++;
    }

    @Override // defpackage.axh
    public final synchronized void e() {
        if (this.d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (!this.e) {
            this.e = true;
            this.b.e();
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.d;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.d = i;
        }
        if (i == 0) {
            kdr kdrVar = this.f;
            auw auwVar = this.c;
            ((awf) kdrVar.e).d(auwVar);
            if (this.a) {
                ((ayh) kdrVar.g).d(auwVar, this);
            } else {
                ((hxf) kdrVar.c).e(this, false);
            }
        }
    }

    public final synchronized String toString() {
        boolean z;
        String obj;
        String valueOf;
        int i;
        boolean z2;
        String obj2;
        z = this.a;
        obj = this.f.toString();
        valueOf = String.valueOf(this.c);
        i = this.d;
        z2 = this.e;
        obj2 = this.b.toString();
        return "EngineResource{isMemoryCacheable=" + z + ", listener=" + obj + ", key=" + valueOf + ", acquired=" + i + ", isRecycled=" + z2 + ", resource=" + obj2 + "}";
    }
}
