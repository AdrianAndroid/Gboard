package defpackage;

/* compiled from: PG */
/* renamed from: eft  reason: default package */
/* loaded from: classes.dex */
public final class eft extends efv {
    private final cxc a;

    public eft(cxc cxcVar) {
        this.a = cxcVar;
    }

    @Override // defpackage.eib
    public final int b() {
        return 3;
    }

    @Override // defpackage.efv, defpackage.eib
    public final cxc d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eib) {
            eib eibVar = (eib) obj;
            if (eibVar.b() == 3 && this.a.equals(eibVar.d())) {
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
        return "StickerPackBannerItem{featuredPackBanner=" + obj + "}";
    }
}
