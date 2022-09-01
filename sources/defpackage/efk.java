package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: efk  reason: default package */
/* loaded from: classes.dex */
public final class efk extends efp {
    private final cxc a;

    public efk(cxc cxcVar) {
        this.a = cxcVar;
    }

    @Override // defpackage.ehj
    public final int a() {
        return 7;
    }

    @Override // defpackage.efp, defpackage.ehj
    public final cxc b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ehj) {
            ehj ehjVar = (ehj) obj;
            if (ehjVar.a() == 7 && this.a.equals(ehjVar.b())) {
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
        return "HeaderItem{featuredStickerPack=" + obj + "}";
    }
}
