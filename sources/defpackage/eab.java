package defpackage;

/* compiled from: PG */
/* renamed from: eab  reason: default package */
/* loaded from: classes.dex */
public final class eab {
    public final dat a;
    public final llp b;
    public final lfb c;

    public eab(dat datVar, llp llpVar, lfb lfbVar) {
        this.a = datVar;
        if (llpVar != null) {
            this.b = llpVar;
            this.c = lfbVar;
            return;
        }
        throw new NullPointerException("Null primaryResults");
    }

    public static eab a(dat datVar, llp llpVar, lfb lfbVar) {
        return new eab(datVar, llpVar, lfbVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eab) {
            eab eabVar = (eab) obj;
            if (this.a.equals(eabVar.a) && lre.I(this.b, eabVar.b) && this.c.equals(eabVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        String obj2 = this.b.toString();
        String obj3 = this.c.toString();
        return "ContentSuggestionResults{queries=" + obj + ", primaryResults=" + obj2 + ", emojiKitchenMixResultFuture=" + obj3 + "}";
    }

    public eab() {
    }
}
