package defpackage;

/* compiled from: PG */
/* renamed from: hea  reason: default package */
/* loaded from: classes.dex */
public final class hea extends hed {
    public final String a;

    public hea(String str) {
        this.a = str;
    }

    @Override // defpackage.hed, defpackage.hel
    public final String a() {
        return this.a;
    }

    @Override // defpackage.hel
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hel) {
            hel helVar = (hel) obj;
            if (helVar.b() == 1 && this.a.equals(helVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return "Item{emoji=" + str + "}";
    }
}
