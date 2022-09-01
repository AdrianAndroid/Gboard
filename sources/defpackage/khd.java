package defpackage;

/* compiled from: PG */
/* renamed from: khd  reason: default package */
/* loaded from: classes.dex */
public final class khd {
    public float a;
    public byte b;
    public int c;

    public final khe a() {
        int i;
        boolean z = true;
        if (this.b != 1 || (i = this.c) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.c == 0) {
                sb.append(" enablement");
            }
            if (this.b == 0) {
                sb.append(" samplingProbability");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        khe kheVar = new khe(i, this.a);
        float f = kheVar.a;
        if (f < 0.0f || f > 1.0f) {
            z = false;
        }
        jdg.G(z, "Probability shall be between 0 and 1.");
        return kheVar;
    }

    public final void b(boolean z) {
        this.c = true != z ? 2 : 3;
    }

    public final ked c() {
        int i;
        boolean z = true;
        if (this.b != 1 || (i = this.c) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.c == 0) {
                sb.append(" enablement");
            }
            if (this.b == 0) {
                sb.append(" startupSamplePercentage");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        ked kedVar = new ked(i, this.a);
        float f = kedVar.a;
        if (f <= 0.0f || f > 100.0f) {
            z = false;
        }
        jdg.w(z, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        return kedVar;
    }

    public final void d(boolean z) {
        this.c = true != z ? 2 : 3;
    }
}
