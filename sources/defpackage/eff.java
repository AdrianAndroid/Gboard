package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eff  reason: default package */
/* loaded from: classes.dex */
public final class eff extends efi {
    private final cxc a;

    public eff(cxc cxcVar) {
        this.a = cxcVar;
    }

    @Override // defpackage.efi, defpackage.egu
    public final cxc a() {
        return this.a;
    }

    @Override // defpackage.egu
    public final egt b() {
        return egt.FEATURED_STICKER_PACK;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof egu) {
            egu eguVar = (egu) obj;
            if (egt.FEATURED_STICKER_PACK == eguVar.b() && this.a.equals(eguVar.a())) {
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
        return "BrowseItem{featuredStickerPack=" + obj + "}";
    }
}
