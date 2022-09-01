package defpackage;

/* compiled from: PG */
/* renamed from: lww  reason: default package */
/* loaded from: classes.dex */
public abstract class lww {
    public final int a;
    public final luj b;

    /* JADX INFO: Access modifiers changed from: protected */
    public lww(luj lujVar, int i) {
        if (lujVar != null) {
            if (i >= 0) {
                this.a = i;
                this.b = lujVar;
                return;
            }
            throw new IllegalArgumentException("invalid index: " + i);
        }
        throw new IllegalArgumentException("format options cannot be null");
    }

    public abstract void a(lwx lwxVar, Object obj);
}
