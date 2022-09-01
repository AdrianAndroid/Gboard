package defpackage;

/* compiled from: PG */
/* renamed from: efr  reason: default package */
/* loaded from: classes.dex */
final class efr extends efv {
    private final cxc a;

    public efr(cxc cxcVar) {
        this.a = cxcVar;
    }

    @Override // defpackage.efv, defpackage.eib
    public final cxc a() {
        return this.a;
    }

    @Override // defpackage.eib
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eib) {
            eib eibVar = (eib) obj;
            if (eibVar.b() == 1 && this.a.equals(eibVar.a())) {
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
        return "StickerPackBannerItem{addPackBanner=" + obj + "}";
    }
}
}
