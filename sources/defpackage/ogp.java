package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: ogp  reason: default package */
/* loaded from: classes2.dex */
public final class ogp {
    public int b;
    public int c;
    final /* synthetic */ ogr e;
    private final int f;
    private final ogo g;
    public final our a = new our();
    public boolean d = false;

    public ogp(ogr ogrVar, int i, int i2, ogo ogoVar) {
        this.e = ogrVar;
        this.f = i;
        this.b = i2;
        this.g = ogoVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return Math.max(0, Math.min(this.b, (int) this.a.b)) - this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return Math.min(this.b, this.e.d.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(our ourVar, int i, boolean z) {
        do {
            int min = Math.min(i, ((ohn) ((ofv) ((ofu) this.e.b).b).a).a);
            int i2 = -min;
            this.e.d.e(i2);
            e(i2);
            try {
                boolean z2 = true;
                boolean z3 = ourVar.b == ((long) min) && z;
                ohg ohgVar = this.e.b;
                int i3 = this.f;
                ((ofu) ohgVar).c.d(2, i3, ourVar, min, z3);
                try {
                    ((ofv) ((ofu) ohgVar).b).a.c(z3, i3, ourVar, min);
                } catch (IOException e) {
                    ((ofu) ohgVar).a.a(e);
                }
                ogo ogoVar = this.g;
                nxu nxuVar = (nxu) ogoVar;
                synchronized (nxuVar.b) {
                    jdg.G(((nxu) ogoVar).f, "onStreamAllocated was not called, but it seems the stream is active");
                    int i4 = ((nxu) ogoVar).e;
                    int i5 = i4 - min;
                    ((nxu) ogoVar).e = i5;
                    if (i4 < 32768 || i5 >= 32768) {
                        z2 = false;
                    }
                }
                if (z2) {
                    nxuVar.b();
                }
                i -= min;
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } while (i > 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.a.b > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.b) {
            this.b += i;
            return;
        }
        throw new IllegalArgumentException("Window size overflow for stream: " + this.f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, ozd ozdVar) {
        int min = Math.min(i, b());
        int i2 = 0;
        while (d() && min > 0) {
            our ourVar = this.a;
            long j = ourVar.b;
            if (min >= j) {
                int i3 = (int) j;
                i2 += i3;
                c(ourVar, i3, this.d);
            } else {
                i2 += min;
                c(ourVar, min, false);
            }
            ozdVar.a++;
            min = Math.min(i - i2, b());
        }
    }
}
