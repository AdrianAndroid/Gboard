package defpackage;

/* compiled from: PG */
/* renamed from: loc  reason: default package */
/* loaded from: classes.dex */
final class loc extends lta {
    static final lta a = new loc(new Object[0]);
    private final Object[] b;

    public loc(Object[] objArr) {
        super(0, 0);
        this.b = objArr;
    }

    @Override // defpackage.lta
    protected final Object a(int i) {
        return this.b[i];
    }
}
