package defpackage;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.TextInfo;
import java.util.List;

/* compiled from: PG */
/* renamed from: emz  reason: default package */
/* loaded from: classes.dex */
public final class emz implements emx {
    private final List a;

    public emz(List list) {
        this.a = list;
    }

    @Override // defpackage.emx
    public final boolean a(TextInfo[] textInfoArr, SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        for (emx emxVar : this.a) {
            if (!emxVar.a(textInfoArr, sentenceSuggestionsInfoArr)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.emx
    public final boolean b(TextInfo[] textInfoArr, String str) {
        for (emx emxVar : this.a) {
            if (!emxVar.b(textInfoArr, str)) {
                return false;
            }
        }
        return true;
    }
}
