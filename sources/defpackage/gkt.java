package defpackage;

/* compiled from: PG */
/* renamed from: gkt  reason: default package */
/* loaded from: classes.dex */
public final class gkt extends mik {
    Object a;

    public gkt(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.mik
    protected final void a() {
        this.a = null;
    }

    @Override // defpackage.mik
    public final String b() {
        Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }

    @Override // defpackage.mik
    public final boolean c(Object obj) {
        return super.c(obj);
    }
}
