package com.google.android.libraries.inputmethod.ime.processor;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ScrubMoveProcessor implements hnj, hnh, hng {
    private hlr a;
    private hlq b;
    private iav c;
    private int d = 0;
    private long e = 0;
    private gwv f;

    private final void c(hfd hfdVar) {
        int length;
        if (this.a == null || this.f == null || this.b == null) {
            return;
        }
        Integer num = (Integer) hfdVar.b[0].e;
        int intValue = num == null ? 0 : num.intValue();
        int i = hfdVar.h - this.e < 100 ? 2 : 1;
        int i2 = this.d;
        if (intValue != i2) {
            int i3 = (intValue - i2) * i;
            if (i3 < 0) {
                int i4 = -i3;
                CharSequence j = this.a.j(i4 + i4);
                if (j == null) {
                    return;
                }
                try {
                    length = Character.offsetByCodePoints(j, j.length(), i3) - j.length();
                } catch (IndexOutOfBoundsException unused) {
                    length = -j.length();
                }
            } else {
                CharSequence i5 = this.a.i(i3 + i3);
                if (i5 == null) {
                    return;
                }
                try {
                    length = Character.offsetByCodePoints(i5, 0, i3);
                } catch (IndexOutOfBoundsException unused2) {
                    length = i5.length();
                }
            }
            gwv gwvVar = this.f;
            hnl i6 = hnl.i(28, this);
            i6.y = length;
            i6.z = length;
            gwvVar.b(i6);
            if (length != 0 && jam.w()) {
                this.b.O(hfd.d(new iay(-10091, null, null)));
            }
        }
        this.d = intValue;
        this.e = hfdVar.h;
    }

    @Override // defpackage.hnj
    public final void ad(Context context, gwv gwvVar, iav iavVar) {
        this.f = gwvVar;
        this.c = iavVar;
    }

    @Override // defpackage.hnj
    public final boolean ar(hfd hfdVar) {
        int i = hfdVar.b[0].c;
        return i == -10061 || i == -10053 || i == -10054 || i == -10062;
    }

    @Override // defpackage.hng
    public final void b(hlq hlqVar) {
        this.b = hlqVar;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // defpackage.hnh
    public final void fl(hlr hlrVar) {
        this.a = hlrVar;
    }

    @Override // defpackage.hnj
    public final boolean fo(hnl hnlVar) {
        hfd hfdVar;
        gwv gwvVar;
        if (hnlVar.A == 4 && (hfdVar = hnlVar.j) != null) {
            int i = hfdVar.b[0].c;
            if (i != -10062) {
                if (i == -10061) {
                    this.d = 0;
                    iav iavVar = this.c;
                    if (iavVar != null && iavVar.h && (gwvVar = this.f) != null) {
                        gwvVar.b(hnl.f(null, this));
                    }
                    c(hfdVar);
                    return true;
                } else if (i != -10054 && i != -10053) {
                    return false;
                }
            }
            c(hfdVar);
            return true;
        }
        return false;
    }
}
