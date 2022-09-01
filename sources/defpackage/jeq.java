package defpackage;

/* compiled from: PG */
/* renamed from: jeq  reason: default package */
/* loaded from: classes.dex */
public final class jeq {
    public static final jeq a = new jeq();
    private jco b;

    private jeq() {
    }

    public final void a() {
        if (this.b == null) {
            synchronized (jeq.class) {
                if (this.b == null) {
                    this.b = new jco();
                }
            }
        }
    }
}
