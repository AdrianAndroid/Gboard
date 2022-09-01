package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: efa  reason: default package */
/* loaded from: classes.dex */
public final class efa extends efe {
    private final cxc a;

    public efa(cxc cxcVar) {
        this.a = cxcVar;
    }

    @Override // defpackage.efe, defpackage.efx
    public final cxc a() {
        return this.a;
    }

    @Override // defpackage.efx
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof efx) {
            efx efxVar = (efx) obj;
            if (efxVar.b() == 1 && this.a.equals(efxVar.a())) {
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
        return "BitmojiCategoryItem{bitmoji=" + obj + "}";
    }
}
