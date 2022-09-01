package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: efm  reason: default package */
/* loaded from: classes.dex */
public final class efm extends efp {
    private final String a;

    public efm(String str) {
        this.a = str;
    }

    @Override // defpackage.ehj
    public final int a() {
        return 5;
    }

    @Override // defpackage.efp, defpackage.ehj
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ehj) {
            ehj ehjVar = (ehj) obj;
            if (ehjVar.a() == 5 && this.a.equals(ehjVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return "HeaderItem{search=" + str + "}";
    }
}
