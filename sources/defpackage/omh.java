package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: omh  reason: default package */
/* loaded from: classes2.dex */
public final class omh implements omi {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public omh(CharSequence charSequence, oku okuVar, int i) {
        this.c = i;
        this.a = charSequence;
        this.b = okuVar;
    }

    public omh(okf okfVar, okq okqVar, int i) {
        this.c = i;
        this.a = okfVar;
        this.b = okqVar;
    }

    public omh(omi omiVar, okq okqVar, int i) {
        this.c = i;
        this.b = omiVar;
        this.a = okqVar;
    }

    @Override // defpackage.omi
    public final Iterator a() {
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                return new omf(this, null);
            }
            return i != 2 ? new omp(this, null) : new omn(this, null);
        }
        return new omg(this);
    }
}
