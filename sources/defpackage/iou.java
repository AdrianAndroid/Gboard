package defpackage;

/* compiled from: PG */
/* renamed from: iou  reason: default package */
/* loaded from: classes.dex */
public final class iou {
    public final iot a;
    public final llp b;
    public final Runnable c;
    public final Runnable d;
    public final Runnable e;
    public final lgb f;
    public final lgb g;
    public final boolean h;
    private final String i;

    static {
        hhq.f("proactive_suggestions_delay_deletion_time_in_ms", 100L);
    }

    public iou() {
    }

    public iou(String str, iot iotVar, llp llpVar, Runnable runnable, Runnable runnable2, Runnable runnable3, lgb lgbVar, lgb lgbVar2, boolean z) {
        this.i = str;
        this.a = iotVar;
        this.b = llpVar;
        this.c = runnable;
        this.d = runnable2;
        this.e = runnable3;
        this.f = lgbVar;
        this.g = lgbVar2;
        this.h = z;
    }

    public static ios a() {
        ios iosVar = new ios();
        iosVar.c(false);
        return iosVar;
    }

    public final boolean equals(Object obj) {
        llp llpVar;
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        lgb lgbVar;
        lgb lgbVar2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof iou) {
            iou iouVar = (iou) obj;
            if (this.i.equals(iouVar.i) && this.a.equals(iouVar.a) && ((llpVar = this.b) != null ? lre.I(llpVar, iouVar.b) : iouVar.b == null) && ((runnable = this.c) != null ? runnable.equals(iouVar.c) : iouVar.c == null) && ((runnable2 = this.d) != null ? runnable2.equals(iouVar.d) : iouVar.d == null) && ((runnable3 = this.e) != null ? runnable3.equals(iouVar.e) : iouVar.e == null) && ((lgbVar = this.f) != null ? lgbVar.equals(iouVar.f) : iouVar.f == null) && ((lgbVar2 = this.g) != null ? lgbVar2.equals(iouVar.g) : iouVar.g == null) && this.h == iouVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.i.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003;
        llp llpVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (llpVar == null ? 0 : llpVar.hashCode())) * 1000003;
        Runnable runnable = this.c;
        int hashCode3 = (hashCode2 ^ (runnable == null ? 0 : runnable.hashCode())) * 1000003;
        Runnable runnable2 = this.d;
        int hashCode4 = (hashCode3 ^ (runnable2 == null ? 0 : runnable2.hashCode())) * (-721379959);
        Runnable runnable3 = this.e;
        int hashCode5 = (hashCode4 ^ (runnable3 == null ? 0 : runnable3.hashCode())) * 1000003;
        lgb lgbVar = this.f;
        int hashCode6 = (hashCode5 ^ (lgbVar == null ? 0 : lgbVar.hashCode())) * 1000003;
        lgb lgbVar2 = this.g;
        if (lgbVar2 != null) {
            i = lgbVar2.hashCode();
        }
        return ((hashCode6 ^ i) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.i;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        boolean z = this.h;
        return "ProactiveSuggestions{source=" + str + ", category=" + valueOf + ", suggestionViews=" + valueOf2 + ", onSuggestionsShowing=" + valueOf3 + ", onSuggestionsShown=" + valueOf4 + ", onRequestToShowFailed=null, onSuggestionsHidden=" + valueOf5 + ", onPendingSuggestionsShowing=" + valueOf6 + ", onPassiveHiddenSuggestionsReshow=" + valueOf7 + ", persistWhileSwitchingKeyboard=" + z + "}";
    }
}
