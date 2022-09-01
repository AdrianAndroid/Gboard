package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: efh  reason: default package */
/* loaded from: classes.dex */
public final class efh extends efi {
    private final cxf a;

    public efh(cxf cxfVar) {
        this.a = cxfVar;
    }

    @Override // defpackage.egu
    public final egt b() {
        return egt.STICKER_PROMO;
    }

    @Override // defpackage.efi, defpackage.egu
    public final cxf d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof egu) {
            egu eguVar = (egu) obj;
            if (egt.STICKER_PROMO == eguVar.b() && this.a.equals(eguVar.d())) {
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
        return "BrowseItem{stickerPromo=" + obj + "}";
    }
}
