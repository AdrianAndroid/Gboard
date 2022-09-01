package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: PG */
/* renamed from: mn  reason: default package */
/* loaded from: classes2.dex */
public final class mn implements Runnable {
    public OverScroller a;
    final /* synthetic */ RecyclerView c;
    private int d;
    private int e;
    Interpolator b = RecyclerView.c;
    private boolean f = false;
    private boolean g = false;

    public mn(RecyclerView recyclerView) {
        this.c = recyclerView;
        this.a = new OverScroller(recyclerView.getContext(), RecyclerView.c);
    }

    private final void e() {
        this.c.removeCallbacks(this);
        aad.H(this.c, this);
    }

    public final void a(int i, int i2) {
        this.c.ac(2);
        this.e = 0;
        this.d = 0;
        Interpolator interpolator = this.b;
        Interpolator interpolator2 = RecyclerView.c;
        if (interpolator != interpolator2) {
            this.b = interpolator2;
            this.a = new OverScroller(this.c.getContext(), RecyclerView.c);
        }
        this.a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.f) {
            this.g = true;
        } else {
            e();
        }
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            int width = abs > abs2 ? this.c.getWidth() : this.c.getHeight();
            if (abs <= abs2) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.c;
        }
        if (this.b != interpolator) {
            this.b = interpolator;
            this.a = new OverScroller(this.c.getContext(), interpolator);
        }
        this.e = 0;
        this.d = 0;
        this.c.ac(2);
        this.a.startScroll(0, 0, i, i2, i4);
        b();
    }

    public final void d() {
        this.c.removeCallbacks(this);
        this.a.abortAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ac  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.run():void");
    }
}
