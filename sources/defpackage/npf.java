package defpackage;

/* compiled from: PG */
/* renamed from: npf  reason: default package */
/* loaded from: classes2.dex */
public final class npf implements npe, nox {
    public static final npf a = new npf(null);
    public final Object b;

    private npf(Object obj) {
        this.b = obj;
    }

    public static npe b(Object obj) {
        if (obj != null) {
            return new npf(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // defpackage.oiy
    public final Object a() {
        return this.b;
    }
}
