package defpackage;

import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;

/* compiled from: PG */
/* renamed from: ekc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ekc implements ejo {
    public final /* synthetic */ AbstractSearchResultKeyboard a;
    private final /* synthetic */ int b;

    public /* synthetic */ ekc(UniversalMediaKeyboardM2 universalMediaKeyboardM2, int i) {
        this.b = i;
        this.a = universalMediaKeyboardM2;
    }

    public /* synthetic */ ekc(UniversalMediaKeyboardTablet universalMediaKeyboardTablet, int i) {
        this.b = i;
        this.a = universalMediaKeyboardTablet;
    }

    @Override // defpackage.ejo
    public final void a(String[] strArr) {
        if (this.b == 0) {
            ((UniversalMediaKeyboardTablet) this.a).K(strArr);
        } else {
            ((UniversalMediaKeyboardM2) this.a).K(strArr);
        }
    }
}
