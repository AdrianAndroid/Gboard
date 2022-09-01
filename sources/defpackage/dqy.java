package defpackage;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.TtsSpan;
import android.text.style.UnderlineSpan;

/* compiled from: PG */
/* renamed from: dqy  reason: default package */
/* loaded from: classes.dex */
public final class dqy {
    public static final lug a = hin.a;
    public static final hhl b = hhq.a("phonetic_output_enabled", false);
    static final CharacterStyle c = new BackgroundColorSpan(1726952806);
    static final CharacterStyle d = new BackgroundColorSpan(1716369068);
    static final CharacterStyle e = new BackgroundColorSpan(424523436);
    static final CharacterStyle f = new BackgroundColorSpan(860731052);
    static final CharacterStyle g = new UnderlineSpan();
    public final hls h;
    public String i = "";
    private final idk j;

    public dqy(hls hlsVar, idk idkVar) {
        jdg.u(hlsVar);
        this.h = hlsVar;
        jdg.u(idkVar);
        this.j = idkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(ggn ggnVar, boolean z) {
        String str;
        if ((ggnVar.a & 8) != 0) {
            ggs ggsVar = ggnVar.d;
            if (ggsVar == null) {
                ggsVar = ggs.e;
            }
            String str2 = ggsVar.b;
            if (!TextUtils.isEmpty(str2)) {
                ggs ggsVar2 = ggnVar.d;
                int i = 1;
                if (((ggsVar2 == null ? ggs.e : ggsVar2).a & 8) != 0) {
                    if (ggsVar2 == null) {
                        ggsVar2 = ggs.e;
                    }
                    if (ggsVar2.d == (-str2.codePointCount(0, str2.length()))) {
                        i = 0;
                    } else {
                        luc lucVar = (luc) ((luc) a.c()).k("com/google/android/apps/inputmethod/libs/mozc/ime/CommandMessageRenderer", "maybeCommitText", 169, "CommandMessageRenderer.java");
                        ggs ggsVar3 = ggnVar.d;
                        if (ggsVar3 == null) {
                            ggsVar3 = ggs.e;
                        }
                        lucVar.w("Unsupported position: %s", ggsVar3);
                    }
                }
                this.i = "";
                if (((Boolean) b.c()).booleanValue() && z) {
                    ggs ggsVar4 = ggnVar.d;
                    if (ggsVar4 == null) {
                        ggsVar4 = ggs.e;
                    }
                    if ((ggsVar4.a & 4) != 0 && str2.length() > 0) {
                        SpannableString spannableString = new SpannableString(str2);
                        int length = spannableString.length();
                        ggs ggsVar5 = ggnVar.d;
                        if (ggsVar5 == null) {
                            ggsVar5 = ggs.e;
                        }
                        spannableString.setSpan(new TtsSpan.TextBuilder(ggsVar5.c).build(), 0, length, 289);
                        this.j.e(dry.PHONETIC_OUTPUT_GENERATED, new Object[0]);
                        str = spannableString;
                        this.h.hV(str, false, i);
                        return str2;
                    }
                }
                str = str2;
                this.h.hV(str, false, i);
                return str2;
            }
        }
        return null;
    }

    public final void b(CharSequence charSequence, int i) {
        this.i = charSequence.toString();
        this.h.g(charSequence, i);
    }
}
