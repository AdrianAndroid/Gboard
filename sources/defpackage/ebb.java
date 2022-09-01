package defpackage;

/* compiled from: PG */
/* renamed from: ebb  reason: default package */
/* loaded from: classes.dex */
public final class ebb extends ebc {
    private final String a;

    public ebb(String str) {
        this.a = str;
    }

    @Override // defpackage.ebd
    public final int b() {
        return 1;
    }

    @Override // defpackage.ebc, defpackage.ebd
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ebd) {
            ebd ebdVar = (ebd) obj;
            if (ebdVar.b() == 1 && this.a.equals(ebdVar.c())) {
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
        return "EmoticonCategoryItem{recents=" + str + "}";
    }
}
