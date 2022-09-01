package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: agi  reason: default package */
/* loaded from: classes.dex */
public final class agi implements afv {
    public static final agi a = new agi();
    public Handler e;
    public int b = 0;
    public int c = 0;
    public boolean d = true;
    private boolean i = true;
    public final afq g = new afq(this);
    public final Runnable f = new od(this, 13);
    final opu h = new opu(this);

    private agi() {
    }

    @Override // defpackage.afv
    public final afq I() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == 1) {
            if (!this.d) {
                this.e.removeCallbacks(this.f);
                return;
            }
            this.g.c(afo.ON_RESUME);
            this.d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        int i = this.b + 1;
        this.b = i;
        if (i != 1 || !this.i) {
            return;
        }
        this.g.c(afo.ON_START);
        this.i = false;
    }

    public final void c() {
        if (this.b != 0 || !this.d) {
            return;
        }
        this.g.c(afo.ON_STOP);
        this.i = true;
    }
}
