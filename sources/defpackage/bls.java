package defpackage;

/* compiled from: PG */
/* renamed from: bls  reason: default package */
/* loaded from: classes.dex */
public final class bls {
    public blt a;
    public long b;
    public byte c;
    public int d;

    public final blu a() {
        boolean z = true;
        if (this.c != 1 || this.d == 0 || this.a == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d == 0) {
                sb.append(" networkLevel");
            }
            if (this.a == null) {
                sb.append(" networkQuality");
            }
            if (this.c == 0) {
                sb.append(" connectivityProgressWaitingTimeoutMs");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        blu bluVar = new blu(this.d, this.a, this.b);
        if (bluVar.c <= 0) {
            z = false;
        }
        jdg.F(z);
        return bluVar;
    }
}
