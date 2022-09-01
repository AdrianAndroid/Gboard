package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dza  reason: default package */
/* loaded from: classes.dex */
public final class dza extends dzf {
    private final dzp a;

    public dza(dzp dzpVar) {
        this.a = dzpVar;
    }

    @Override // defpackage.dzf, defpackage.dzq
    public final dzp a() {
        return this.a;
    }

    @Override // defpackage.dzq
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzq) {
            dzq dzqVar = (dzq) obj;
            if (dzqVar.b() == 3 && this.a.equals(dzqVar.a())) {
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
        return "ContentSuggestionItem{emojiKitchenMixResult=" + obj + "}";
    }
}
