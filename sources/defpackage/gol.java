package defpackage;

import android.content.Context;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: gol  reason: default package */
/* loaded from: classes.dex */
public final class gol {
    public static final ltg a = ltg.j("com/google/android/libraries/gsa/s3/lib/S3LibAudioSource");
    protected final int b;
    protected final int c;
    public final bno d;
    public boolean e;
    public gok f;
    protected goj g;
    protected final opu h;
    private final int i;
    private gor j;

    public gol(int i, int i2, int i3, goj gojVar, bnc bncVar, opu opuVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        lty ltyVar = luh.a;
        this.i = i;
        this.b = i3;
        this.c = i2;
        this.g = gojVar;
        this.d = bncVar == null ? null : new bno(bncVar);
        this.h = opuVar;
        new HashSet(1);
    }

    public final synchronized void a() {
        b();
        this.g = null;
        this.j = null;
    }

    public final synchronized void b() {
        if (this.f != null) {
            lyq.a(this.j.e);
            this.f.interrupt();
            this.f = null;
        }
        if (this.j == null) {
            this.g = null;
        }
    }

    public final synchronized fxa c(int i) {
        lty ltyVar = luh.a;
        goj gojVar = this.g;
        if (gojVar != null) {
            int i2 = this.i;
            if (i == i2) {
                int i3 = ((i + i) / 1000) * this.b * this.c;
                if (this.j == null) {
                    Context context = gojVar.a;
                    int i4 = gojVar.b;
                    this.j = new gor(new goi(context, i4, (i4 + i4) * 8, gojVar.c), i3);
                    gok gokVar = new gok(this.j.e, i3, this.d, this.h, this.e, null, null, null, null, null);
                    this.f = gokVar;
                    gokVar.start();
                }
            } else {
                throw new blb("Unsupported sample rate: " + i + ", must be " + i2, 393243);
            }
        } else {
            throw new blb("This audio source has already been shutdown", 393234);
        }
        return this.j.c();
    }
}
