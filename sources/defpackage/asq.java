package defpackage;

import android.service.textservice.SpellCheckerService;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;

/* compiled from: PG */
/* renamed from: asq  reason: default package */
/* loaded from: classes.dex */
public final class asq extends SpellCheckerService.Session {
    @Override // android.service.textservice.SpellCheckerService.Session
    public final void onCreate() {
    }

    @Override // android.service.textservice.SpellCheckerService.Session
    public final SuggestionsInfo onGetSuggestions(TextInfo textInfo, int i) {
        return new SuggestionsInfo(1, gvw.g, textInfo.getCookie(), textInfo.getSequence());
    }
}
