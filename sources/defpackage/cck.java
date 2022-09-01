package defpackage;

/* compiled from: PG */
/* renamed from: cck  reason: default package */
/* loaded from: classes.dex */
final class cck implements cce {
    private final int a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public cck(int i) {
        this.a = i >> 1;
        this.b = i - 1;
        d();
    }

    private final int g() {
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        if (this.g && i2 == this.b) {
            this.d = i2 + 1;
        }
        if (i >= this.b) {
            this.g = true;
        }
        return i;
    }

    @Override // defpackage.cce
    public final int a(mse mseVar, int i) {
        int b;
        if (i != 0 || (b = msc.b(mseVar.c)) == 0 || b != 2) {
            if (!this.f) {
                this.f = true;
                return this.a;
            }
            int i2 = this.c;
            if (i2 < this.e) {
                return g();
            }
            if (Math.abs(this.a - i2) > Math.abs(this.a - this.d)) {
                return g();
            }
            int i3 = this.c;
            this.c = i3 - 1;
            return i3;
        }
        this.e = 1;
        return 0;
    }

    @Override // defpackage.cce
    public final int b() {
        if (!this.g) {
            this.g = true;
            int i = this.d;
            int i2 = this.b;
            if (i == i2) {
                this.d = i + 1;
            }
            return i2;
        }
        throw new IllegalStateException("End position is not available");
    }

    @Override // defpackage.cce
    public final int c() {
        int i = this.e;
        int i2 = this.c;
        if (i < i2) {
            this.e = i + 1;
            return i;
        } else if (i == i2) {
            this.c = i2 - 1;
            this.e = i2;
            return i2;
        } else {
            int i3 = this.d;
            this.d = i3 + 1;
            this.e = i3;
            return i3;
        }
    }

    @Override // defpackage.cce
    public final void d() {
        int i = this.a;
        this.c = i - 1;
        this.d = i + 1;
        this.e = 0;
        this.f = false;
        this.g = false;
    }

    @Override // defpackage.cce
    public final boolean e() {
        return !this.g;
    }

    @Override // defpackage.cce
    public final boolean f(int i) {
        return i >= 0 && i <= this.b;
    }
}
