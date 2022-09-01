package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: klv  reason: default package */
/* loaded from: classes.dex */
public final class klv extends ker {
    public final Object a;

    public klv(Object obj) {
        super((char[]) null);
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof klv) && oll.g(this.a, ((klv) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        return "Initialized(value=" + obj + ")";
    }
}
