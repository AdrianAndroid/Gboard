package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: ffc  reason: default package */
/* loaded from: classes.dex */
public final class ffc {
    public jav a;
    public Collection b;
    public String c;
    public String d;
    public byte e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    public ffc() {
    }

    public ffc(ffd ffdVar) {
        this.a = ffdVar.a;
        this.b = ffdVar.b;
        this.c = ffdVar.c;
        this.d = ffdVar.d;
        this.f = ffdVar.e;
        this.g = ffdVar.f;
        this.h = ffdVar.g;
        this.i = ffdVar.h;
        this.e = (byte) 31;
    }

    public final ffd a() {
        if (this.e != 31) {
            StringBuilder sb = new StringBuilder();
            if ((this.e & 1) == 0) {
                sb.append(" blockOffensiveWords");
            }
            if ((this.e & 2) == 0) {
                sb.append(" autoStarted");
            }
            if ((this.e & 4) == 0) {
                sb.append(" fallbackAvailable");
            }
            if ((this.e & 8) == 0) {
                sb.append(" suppressBeepSoundAtRecognitionStart");
            }
            if ((this.e & 16) == 0) {
                sb.append(" connectOnly");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new ffd(this.a, this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }

    public final void b(boolean z) {
        this.g = z;
        this.e = (byte) (this.e | 2);
    }

    public final void c(boolean z) {
        this.f = z;
        this.e = (byte) (this.e | 1);
    }

    public final void d(boolean z) {
        this.i = z;
        this.e = (byte) (this.e | 16);
    }

    public final void e(boolean z) {
        this.h = z;
        this.e = (byte) (this.e | 4);
    }
}
