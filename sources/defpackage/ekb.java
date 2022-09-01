package defpackage;

import com.google.android.apps.inputmethod.libs.search.keyboard.AbstractSearchResultKeyboard;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardM2;
import com.google.android.apps.inputmethod.libs.search.universalmedia.UniversalMediaKeyboardTablet;

/* compiled from: PG */
/* renamed from: ekb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ekb implements ekq {
    public final /* synthetic */ AbstractSearchResultKeyboard a;
    private final /* synthetic */ int b;

    public /* synthetic */ ekb(UniversalMediaKeyboardM2 universalMediaKeyboardM2, int i) {
        this.b = i;
        this.a = universalMediaKeyboardM2;
    }

    public /* synthetic */ ekb(UniversalMediaKeyboardTablet universalMediaKeyboardTablet, int i) {
        this.b = i;
        this.a = universalMediaKeyboardTablet;
    }

    @Override // defpackage.ekq
    public final void a() {
        if (this.b == 0) {
            UniversalMediaKeyboardTablet universalMediaKeyboardTablet = (UniversalMediaKeyboardTablet) this.a;
            ekx ekxVar = universalMediaKeyboardTablet.g;
            if (ekxVar == null || ekxVar.aJ()) {
                return;
            }
            universalMediaKeyboardTablet.S(ekg.STICKER_ERROR);
            return;
        }
        UniversalMediaKeyboardM2 universalMediaKeyboardM2 = (UniversalMediaKeyboardM2) this.a;
        ekx ekxVar2 = universalMediaKeyboardM2.g;
        if (ekxVar2 == null || ekxVar2.aJ()) {
            return;
        }
        universalMediaKeyboardM2.R(eka.STICKER_ERROR);
    }
}
