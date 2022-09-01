package defpackage;

/* compiled from: PG */
/* renamed from: dzb  reason: default package */
/* loaded from: classes.dex */
final class dzb extends dzf {
    private final ead a;

    public dzb(ead eadVar) {
        this.a = eadVar;
    }

    @Override // defpackage.dzq
    public final int b() {
        return 2;
    }

    @Override // defpackage.dzf, defpackage.dzq
    public final ead c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzq) {
            dzq dzqVar = (dzq) obj;
            if (dzqVar.b() == 2 && this.a.equals(dzqVar.c())) {
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
        return "ContentSuggestionItem{emojiKitchenMixStatus=" + obj + "}";
    }
}
