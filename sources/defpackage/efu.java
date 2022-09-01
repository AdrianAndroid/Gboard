package defpackage;

/* compiled from: PG */
/* renamed from: efu  reason: default package */
/* loaded from: classes.dex */
public final class efu extends efv {
    private final cxc a;

    public efu(cxc cxcVar) {
        this.a = cxcVar;
    }

    @Override // defpackage.eib
    public final int b() {
        return 2;
    }

    @Override // defpackage.efv, defpackage.eib
    public final cxc e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eib) {
            eib eibVar = (eib) obj;
            if (eibVar.b() == 2 && this.a.equals(eibVar.e())) {
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
        return "StickerPackBannerItem{removePackBanner=" + obj + "}";
    }
}
