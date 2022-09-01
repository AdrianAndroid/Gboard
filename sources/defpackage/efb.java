package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: efb  reason: default package */
/* loaded from: classes.dex */
public final class efb extends efe {
    private final cxc a;

    public efb(cxc cxcVar) {
        this.a = cxcVar;
    }

    @Override // defpackage.efx
    public final int b() {
        return 2;
    }

    @Override // defpackage.efe, defpackage.efx
    public final cxc c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof efx) {
            efx efxVar = (efx) obj;
            if (efxVar.b() == 2 && this.a.equals(efxVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        return "BitmojiCategoryItem{contextual=" + obj + "}";
    }
}
