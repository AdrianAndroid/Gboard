package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lge  reason: default package */
/* loaded from: classes.dex */
public final class lge implements Serializable, lgb {
    private static final long serialVersionUID = 0;
    public final Object a;

    public lge(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.lgb
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lge) {
            return jdg.W(this.a, ((lge) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }
}
