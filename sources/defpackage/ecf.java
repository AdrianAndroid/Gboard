package defpackage;

/* compiled from: PG */
/* renamed from: ecf  reason: default package */
/* loaded from: classes.dex */
public final class ecf extends ecj {
    private final String a;

    public ecf(String str) {
        this.a = str;
    }

    @Override // defpackage.ecj, defpackage.ecz
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ecz
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ecz) {
            ecz eczVar = (ecz) obj;
            if (eczVar.b() == 1 && this.a.equals(eczVar.a())) {
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
        return "FastAccessItem{emoji=" + str + "}";
    }
}
