package defpackage;

/* compiled from: PG */
/* renamed from: bfx  reason: default package */
/* loaded from: classes.dex */
public final class bfx extends qo {
    private int e;

    @Override // defpackage.qv, java.util.Map, j$.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.qv
    public final Object d(int i) {
        this.e = 0;
        return super.d(i);
    }

    @Override // defpackage.qv
    public final Object e(int i, Object obj) {
        this.e = 0;
        return super.e(i, obj);
    }

    @Override // defpackage.qv
    public final void h(qv qvVar) {
        this.e = 0;
        super.h(qvVar);
    }

    @Override // defpackage.qv, java.util.Map, j$.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = super.hashCode();
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.qv, java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        this.e = 0;
        return super.put(obj, obj2);
    }
}
