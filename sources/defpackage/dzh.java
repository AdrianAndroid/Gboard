package defpackage;

/* compiled from: PG */
/* renamed from: dzh  reason: default package */
/* loaded from: classes.dex */
public final class dzh extends dzu {
    private final dat a;
    private final int b;

    public dzh(int i, dat datVar) {
        this.b = i;
        this.a = datVar;
    }

    @Override // defpackage.dzu
    public final dat b() {
        return this.a;
    }

    @Override // defpackage.dzu
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzu) {
            dzu dzuVar = (dzu) obj;
            if (this.b == dzuVar.c() && this.a.equals(dzuVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        String str = i != 1 ? i != 2 ? i != 3 ? "SHOW_INTERSTITIAL" : "SHOW_ERROR_SCREEN" : "SHOW_NO_SUGGESTIONS_SCREEN" : "FETCH_CONTENT";
        String obj = this.a.toString();
        return "ContentSuggestionNotification{event=" + str + ", queries=" + obj + "}";
    }
}
