package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: lfc  reason: default package */
/* loaded from: classes.dex */
public final class lfc implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;

    protected lfc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static lfc a(Object obj, Object obj2) {
        return new lfc(obj, obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lfc) {
            lfc lfcVar = (lfc) obj;
            if (jdg.W(this.a, lfcVar.a) && jdg.W(this.b, lfcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return (hashCode * 31) + i;
    }
}
