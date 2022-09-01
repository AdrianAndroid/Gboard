package defpackage;

import com.google.android.apps.inputmethod.libs.delight5.Delight5Facilitator;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* renamed from: cba  reason: default package */
/* loaded from: classes.dex */
public final class cba implements mix {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/EmojiShortcutsLoader");
    private final Delight5Facilitator b;
    private final ino c;
    private final jan d;
    private final cly e;

    public cba(Delight5Facilitator delight5Facilitator, ino inoVar, jan janVar, cly clyVar) {
        this.b = delight5Facilitator;
        this.c = inoVar;
        this.d = janVar;
        this.e = clyVar;
    }

    public static llr b(jan janVar, cly clyVar, Locale locale, long j) {
        llb G = llb.G();
        File d = clyVar.d(false, locale, 2);
        if (d == null || !janVar.g(d)) {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/EmojiShortcutsLoader", "getEmojiShortcuts", 113, "EmojiShortcutsLoader.java")).t("Emoji shortcut file does not exist.");
            return null;
        }
        ltg ltgVar = a;
        ((ltd) ((ltd) ltgVar.b()).k("com/google/android/apps/inputmethod/libs/delight5/EmojiShortcutsLoader", "getEmojiShortcuts", 116, "EmojiShortcutsLoader.java")).w("Reading %s emoji shortcuts", locale);
        msj msjVar = (msj) janVar.a(d, (nhf) msj.b.N(7));
        if (msjVar == null) {
            ((ltd) ((ltd) ltgVar.d()).k("com/google/android/apps/inputmethod/libs/delight5/EmojiShortcutsLoader", "getEmojiShortcuts", 120, "EmojiShortcutsLoader.java")).t("Emoji shortcuts I/O failed.");
            return null;
        }
        for (msi msiVar : msjVar.a) {
            for (String str : msiVar.b) {
                String lowerCase = str.toLowerCase(locale);
                if (j == -1 || G.b(lowerCase).size() < j) {
                    G.v(lowerCase, msiVar.a);
                }
            }
        }
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/EmojiShortcutsLoader", "getEmojiShortcuts", 133, "EmojiShortcutsLoader.java")).w("Read %s emoji shortcuts successfully.", locale);
        return llr.g(G);
    }

    @Override // defpackage.mix
    public final mko a() {
        HashMap hashMap = new HashMap();
        if (this.c.ak("pref_key_enable_emoji_suggestion")) {
            for (Locale locale : this.b.n()) {
                llr b = b(this.d, this.e, locale, ((Long) cas.F.c()).longValue());
                if (b != null) {
                    hashMap.put(locale, b);
                }
            }
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/EmojiShortcutsLoader", "call", 62, "EmojiShortcutsLoader.java")).u("%d emoji shortcut maps loaded.", hashMap.size());
        } else {
            ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/EmojiShortcutsLoader", "call", 64, "EmojiShortcutsLoader.java")).t("Emoji suggestion is disabled. Use empty map to reload.");
        }
        caj cajVar = this.b.h;
        nfh t = mwg.c.t();
        for (Map.Entry entry : hashMap.entrySet()) {
            nfh t2 = mwf.d.t();
            lsz it = ((llr) entry.getValue()).p().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                t2.dU((String) entry2.getKey());
                t2.dV((String) entry2.getValue());
                if (t2.c) {
                    t2.cD();
                    t2.c = false;
                }
                mwf mwfVar = (mwf) t2.b;
                nfo nfoVar = mwfVar.c;
                if (!nfoVar.c()) {
                    int size = nfoVar.size();
                    mwfVar.c = nfoVar.d(size == 0 ? 10 : size + size);
                }
                mwfVar.c.f(true);
            }
            String language = ((Locale) entry.getKey()).getLanguage();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mwg mwgVar = (mwg) t.b;
            language.getClass();
            nga ngaVar = mwgVar.b;
            if (!ngaVar.c()) {
                mwgVar.b = nfm.H(ngaVar);
            }
            mwgVar.b.add(language);
            mwf mwfVar2 = (mwf) t2.cz();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mwg mwgVar2 = (mwg) t.b;
            mwfVar2.getClass();
            nga ngaVar2 = mwgVar2.a;
            if (!ngaVar2.c()) {
                mwgVar2.a = nfm.H(ngaVar2);
            }
            mwgVar2.a.add(mwfVar2);
        }
        mko hR = cajVar.h.hR(new bue(cajVar, (mwg) t.cz(), cajVar.f.b(), 5), null);
        ((ltd) ((ltd) a.b()).k("com/google/android/apps/inputmethod/libs/delight5/EmojiShortcutsLoader", "call", 71, "EmojiShortcutsLoader.java")).t("Finished loading emoji shortcuts");
        return hR;
    }
}
