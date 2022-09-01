package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* renamed from: ogr  reason: default package */
/* loaded from: classes2.dex */
public final class ogr {
    public final ogq a;
    public final ohg b;
    public int c = 65535;
    public final ogp d = new ogp(this, 0, 65535, null);

    public ogr(ogq ogqVar, ohg ohgVar) {
        this.a = ogqVar;
        jdg.Q(ohgVar, "frameWriter");
        this.b = ohgVar;
    }

    public final void a(boolean z, ogp ogpVar, our ourVar, boolean z2) {
        jdg.Q(ourVar, "source");
        int b = ogpVar.b();
        boolean d = ogpVar.d();
        int i = (int) ourVar.b;
        if (d || b < i) {
            if (!d && b > 0) {
                ogpVar.c(ourVar, b, false);
            }
            ogpVar.a.ik(ourVar, (int) ourVar.b);
            ogpVar.d = z | ogpVar.d;
        } else {
            ogpVar.c(ourVar, i, z);
        }
        if (z2) {
            b();
        }
    }

    public final void c() {
        ogp[] r;
        ogp[] r2 = this.a.r();
        int i = this.d.b;
        int length = r2.length;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i / length);
            for (int i3 = 0; i3 < length && i > 0; i3++) {
                ogp ogpVar = r2[i3];
                int min = Math.min(i, Math.min(ogpVar.a(), ceil));
                if (min > 0) {
                    ogpVar.c += min;
                    i -= min;
                }
                if (ogpVar.a() > 0) {
                    r2[i2] = ogpVar;
                    i2++;
                }
            }
            length = i2;
        }
        ozd ozdVar = new ozd();
        for (ogp ogpVar2 : this.a.r()) {
            ogpVar2.f(ogpVar2.c, ozdVar);
            ogpVar2.c = 0;
        }
        if (ozdVar.a()) {
            b();
        }
    }

    public final void d(ogp ogpVar, int i) {
        if (ogpVar == null) {
            this.d.e(i);
            c();
            return;
        }
        ogpVar.e(i);
        ozd ozdVar = new ozd();
        ogpVar.f(ogpVar.b(), ozdVar);
        if (!ozdVar.a()) {
            return;
        }
        b();
    }

    public final void b() {
        try {
            this.b.d();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
