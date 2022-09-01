package defpackage;

/* compiled from: PG */
/* renamed from: xz  reason: default package */
/* loaded from: classes2.dex */
public final class xz extends xy {
    private final Object a = new Object();

    public xz(int i) {
        super(i);
    }

    @Override // defpackage.xy, defpackage.xx
    public final Object a() {
        Object a;
        synchronized (this.a) {
            a = super.a();
        }
        return a;
    }

    @Override // defpackage.xy, defpackage.xx
    public final boolean b(Object obj) {
        boolean b;
        synchronized (this.a) {
            b = super.b(obj);
        }
        return b;
    }
}
