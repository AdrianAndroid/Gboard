package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dze  reason: default package */
/* loaded from: classes.dex */
public final class dze extends dzf {
    private final dzp a;

    public dze(dzp dzpVar) {
        this.a = dzpVar;
    }

    @Override // defpackage.dzq
    public final int b() {
        return 1;
    }

    @Override // defpackage.dzf, defpackage.dzq
    public final dzp d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzq) {
            dzq dzqVar = (dzq) obj;
            if (dzqVar.b() == 1 && this.a.equals(dzqVar.d())) {
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
        return "ContentSuggestionItem{standardResult=" + obj + "}";
    }
}
