package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cjw  reason: default package */
/* loaded from: classes.dex */
public final class cjw {
    public final View.OnClickListener a;
    public final View.OnClickListener b;
    public final View.OnClickListener c;
    public final View.OnClickListener d;
    public final View.OnClickListener e;
    public final View.OnClickListener f;

    public cjw() {
    }

    public cjw(View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, View.OnClickListener onClickListener5, View.OnClickListener onClickListener6) {
        this.a = onClickListener;
        this.b = onClickListener2;
        this.c = onClickListener3;
        this.d = onClickListener4;
        this.e = onClickListener5;
        this.f = onClickListener6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjw) {
            cjw cjwVar = (cjw) obj;
            if (this.a.equals(cjwVar.a) && this.b.equals(cjwVar.b) && this.c.equals(cjwVar.c) && this.d.equals(cjwVar.d) && this.e.equals(cjwVar.e) && this.f.equals(cjwVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        return "PopupListeners{onClickSendImage=" + valueOf + ", onClickOpenOptions=" + valueOf2 + ", onClickCreateCustomoji=" + valueOf3 + ", onClickViewStickers=" + valueOf4 + ", onClickViewSimilarItems=" + valueOf5 + ", onClickRemoveSuggestions=" + valueOf6 + "}";
    }
}
