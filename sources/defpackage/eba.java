package defpackage;

/* compiled from: PG */
/* renamed from: eba  reason: default package */
/* loaded from: classes.dex */
public final class eba extends ebc {
    private final String a;

    public eba(String str) {
        this.a = str;
    }

    @Override // defpackage.ebc, defpackage.ebd
    public final String a() {
        return this.a;
    }

    @Override // defpackage.ebd
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ebd) {
            ebd ebdVar = (ebd) obj;
            if (ebdVar.b() == 2 && this.a.equals(ebdVar.a())) {
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
        return "EmoticonCategoryItem{category=" + str + "}";
    }
}
