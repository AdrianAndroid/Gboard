package defpackage;

/* compiled from: PG */
/* renamed from: ios  reason: default package */
/* loaded from: classes.dex */
public final class ios {
    public String a;
    public llp b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public lgb f;
    public lgb g;
    private iot h;
    private boolean i;
    private byte j;

    public final iou a() {
        if (this.j != 1 || this.a == null || this.h == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" source");
            }
            if (this.h == null) {
                sb.append(" category");
            }
            if (this.j == 0) {
                sb.append(" persistWhileSwitchingKeyboard");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new iou(this.a, this.h, this.b, this.c, this.d, this.e, this.f, this.g, this.i);
    }

    public final void b(iot iotVar) {
        if (iotVar != null) {
            this.h = iotVar;
            return;
        }
        throw new NullPointerException("Null category");
    }

    public final void c(boolean z) {
        this.i = z;
        this.j = (byte) 1;
    }
}
