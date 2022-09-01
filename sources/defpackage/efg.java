package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: efg  reason: default package */
/* loaded from: classes.dex */
public final class efg extends efi {
    private final cxc a;

    public efg(cxc cxcVar) {
        this.a = cxcVar;
    }

    @Override // defpackage.egu
    public final egt b() {
        return egt.REGULAR_STICKER_PACK;
    }

    @Override // defpackage.efi, defpackage.egu
    public final cxc c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof egu) {
            egu eguVar = (egu) obj;
            if (egt.REGULAR_STICKER_PACK == eguVar.b() && this.a.equals(eguVar.c())) {
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
        return "BrowseItem{regularStickerPack=" + obj + "}";
    }
}
