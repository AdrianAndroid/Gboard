package defpackage;

import android.service.textservice.SpellCheckerService;
import android.view.textservice.SentenceSuggestionsInfo;
import java.text.BreakIterator;

/* compiled from: PG */
/* renamed from: enc  reason: default package */
/* loaded from: classes.dex */
public final class enc {
    public static final SentenceSuggestionsInfo[] a = new SentenceSuggestionsInfo[0];
    public final SpellCheckerService.Session b;
    public final BreakIterator d = BreakIterator.getWordInstance();
    public final BreakIterator c = new enb();

    public enc(SpellCheckerService.Session session) {
        this.b = session;
    }
}
