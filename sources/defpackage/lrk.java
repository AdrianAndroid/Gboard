package defpackage;

/* compiled from: PG */
/* renamed from: lrk  reason: default package */
/* loaded from: classes.dex */
public final class lrk extends lle {
    public static final lrk b = new lrk();
    final transient Object[] c;
    public final transient int d;
    public final transient lrk e;
    private final transient Object f;
    private final transient int g;

    private lrk() {
        this.f = null;
        this.c = new Object[0];
        this.g = 0;
        this.d = 0;
        this.e = this;
    }

    private lrk(Object obj, Object[] objArr, int i, lrk lrkVar) {
        this.f = obj;
        this.c = objArr;
        this.g = 1;
        this.d = i;
        this.e = lrkVar;
    }

    public lrk(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
        this.g = 0;
        int e = i >= 2 ? lmz.e(i) : 0;
        this.f = lrq.s(objArr, i, e, 0);
        this.e = new lrk(lrq.s(objArr, i, e, 1), objArr, i, this);
    }

    @Override // defpackage.lle
    public final lle b() {
        return this.e;
    }

    @Override // defpackage.llw
    public final lmz f() {
        return new lrn(this, this.c, this.g, this.d);
    }

    @Override // defpackage.llw
    public final lmz g() {
        return new lro(this, new lrp(this.c, this.g, this.d));
    }

    @Override // defpackage.llw, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object t = lrq.t(this.f, this.c, this.d, this.g, obj);
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // defpackage.llw
    public final boolean ig() {
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.d;
    }
}
