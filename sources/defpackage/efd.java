package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: efd  reason: default package */
/* loaded from: classes.dex */
public final class efd extends efe {
    private final String a;

    public efd(String str) {
        this.a = str;
    }

    @Override // defpackage.efx
    public final int b() {
        return 3;
    }

    @Override // defpackage.efe, defpackage.efx
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof efx) {
            efx efxVar = (efx) obj;
            if (efxVar.b() == 3 && this.a.equals(efxVar.d())) {
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
        return "BitmojiCategoryItem{search=" + str + "}";
    }
}
