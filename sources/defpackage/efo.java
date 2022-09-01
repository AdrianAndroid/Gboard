package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: efo  reason: default package */
/* loaded from: classes.dex */
public final class efo extends efp {
    private final cxc a;

    public efo(cxc cxcVar) {
        this.a = cxcVar;
    }

    @Override // defpackage.ehj
    public final int a() {
        return 1;
    }

    @Override // defpackage.efp, defpackage.ehj
    public final cxc d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ehj) {
            ehj ehjVar = (ehj) obj;
            if (ehjVar.a() == 1 && this.a.equals(ehjVar.d())) {
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
        return "HeaderItem{stickerPack=" + obj + "}";
    }
}
