package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.apps.inputmethod.libs.handwriting.ime.HandwritingIme;
import com.google.android.apps.inputmethod.libs.handwriting.ime.NlHandwritingIme;
import com.google.android.gms.common.api.Status;
import com.google.android.inputmethod.latin.R;

/* compiled from: PG */
/* renamed from: fhr  reason: default package */
/* loaded from: classes.dex */
public class fhr {
    private static volatile nuq a;
    private static volatile nuq b;
    private static volatile nuq c;
    private static volatile nuq d;
    private static volatile nuq e;
    private static volatile nuq f;
    private static volatile nuq g;
    public static volatile nvo h;
    private static volatile nuq i;
    private static volatile nuq j;
    private static volatile nuq k;

    public static ijk B(String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i2 = 0; i2 <= 0; i2++) {
            String str = strArr[i2];
            if (sb.length() > 1) {
                sb.append(",");
            }
            sb.append(str);
        }
        sb.append("] ");
        return new ijk(sb.toString());
    }

    public static nuq d() {
        nuq nuqVar = e;
        if (nuqVar == null) {
            synchronized (fhr.class) {
                nuqVar = e;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.UNARY;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "ChangeKeyboardVisibility");
                    a2.b();
                    a2.a = ohw.b(fhd.b);
                    a2.b = ohw.b(fhe.b);
                    nuqVar = a2.a();
                    e = nuqVar;
                }
            }
        }
        return nuqVar;
    }

    public static nuq e() {
        nuq nuqVar = i;
        if (nuqVar == null) {
            synchronized (fhr.class) {
                nuqVar = i;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.UNARY;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "GetConceptEmojis");
                    a2.b();
                    a2.a = ohw.b(fhg.b);
                    a2.b = ohw.b(fhh.b);
                    nuqVar = a2.a();
                    i = nuqVar;
                }
            }
        }
        return nuqVar;
    }

    public static nuq f() {
        nuq nuqVar = g;
        if (nuqVar == null) {
            synchronized (fhr.class) {
                nuqVar = g;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.UNARY;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "GetEmojiPredictions");
                    a2.b();
                    a2.a = ohw.b(fik.b);
                    a2.b = ohw.b(fil.b);
                    nuqVar = a2.a();
                    g = nuqVar;
                }
            }
        }
        return nuqVar;
    }

    public static nuq g() {
        nuq nuqVar = f;
        if (nuqVar == null) {
            synchronized (fhr.class) {
                nuqVar = f;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.UNARY;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "GetKeyboardConfiguration");
                    a2.b();
                    a2.a = ohw.b(nez.a);
                    a2.b = ohw.b(fhm.c);
                    nuqVar = a2.a();
                    f = nuqVar;
                }
            }
        }
        return nuqVar;
    }

    public static nuq h() {
        nuq nuqVar = b;
        if (nuqVar == null) {
            synchronized (fhr.class) {
                nuqVar = b;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.BIDI_STREAMING;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "PerformOration");
                    a2.b();
                    a2.a = ohw.b(fii.c);
                    a2.b = ohw.b(fij.c);
                    nuqVar = a2.a();
                    b = nuqVar;
                }
            }
        }
        return nuqVar;
    }

    public static nuq i() {
        nuq nuqVar = k;
        if (nuqVar == null) {
            synchronized (fhr.class) {
                nuqVar = k;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.UNARY;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "SearchEmoji");
                    a2.b();
                    a2.a = ohw.b(fio.b);
                    a2.b = ohw.b(fip.b);
                    nuqVar = a2.a();
                    k = nuqVar;
                }
            }
        }
        return nuqVar;
    }

    public static nuq j() {
        nuq nuqVar = c;
        if (nuqVar == null) {
            synchronized (fhr.class) {
                nuqVar = c;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.UNARY;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "SetAssistantDictationEligibility");
                    a2.b();
                    a2.a = ohw.b(fiq.b);
                    a2.b = ohw.b(nez.a);
                    nuqVar = a2.a();
                    c = nuqVar;
                }
            }
        }
        return nuqVar;
    }

    public static nuq k() {
        nuq nuqVar = j;
        if (nuqVar == null) {
            synchronized (fhr.class) {
                nuqVar = j;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.UNARY;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "SetEmojiPreferenceForConcept");
                    a2.b();
                    a2.a = ohw.b(fhf.c);
                    a2.b = ohw.b(nez.a);
                    nuqVar = a2.a();
                    j = nuqVar;
                }
            }
        }
        return nuqVar;
    }

    public static nuq l() {
        nuq nuqVar = a;
        if (nuqVar == null) {
            synchronized (fhr.class) {
                nuqVar = a;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.UNARY;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "UpdateDictatingState");
                    a2.b();
                    a2.a = ohw.b(fit.b);
                    a2.b = ohw.b(nez.a);
                    nuqVar = a2.a();
                    a = nuqVar;
                }
            }
        }
        return nuqVar;
    }

    public static nuq m() {
        nuq nuqVar = d;
        if (nuqVar == null) {
            synchronized (fhr.class) {
                nuqVar = d;
                if (nuqVar == null) {
                    nun a2 = nuq.a();
                    a2.c = nup.UNARY;
                    a2.d = nuq.c("java.com.google.android.apps.search.assistant.surfaces.dictation.proto.KeyboardDictationService", "UpdateKeyboardUi");
                    a2.b();
                    a2.a = ohw.b(fiu.b);
                    a2.b = ohw.b(fiv.a);
                    nuqVar = a2.a();
                    d = nuqVar;
                }
            }
        }
        return nuqVar;
    }

    public static fky n(Context context) {
        return new flf(context);
    }

    public static fpt o(Object obj, Looper looper, String str) {
        fyb.aH(obj, "Listener must not be null");
        fyb.aH(looper, "Looper must not be null");
        fyb.aH(str, "Listener type must not be null");
        return new fpt(looper, obj, str);
    }

    public static void p(Status status, fxa fxaVar) {
        q(status, null, fxaVar);
    }

    public static void q(Status status, Object obj, fxa fxaVar) {
        if (status.a()) {
            fxaVar.d(obj);
        } else {
            fxaVar.c(fyb.aM(status));
        }
    }

    public static int r(int i2, int i3) {
        if (i3 != 2) {
            ((ltd) ((ltd) NlHandwritingIme.n.c()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme$PredictionInContext", "getComposingLengthAfterCursor", 288, "NlHandwritingIme.java")).u("getComposingLengthAfterCursor: there was no successful decode call, current code: %s", i3 - 1);
            return 0;
        }
        return i2;
    }

    public static int s(int i2, int i3) {
        if (i3 != 2) {
            ((ltd) ((ltd) NlHandwritingIme.n.c()).k("com/google/android/apps/inputmethod/libs/handwriting/ime/NlHandwritingIme$PredictionInContext", "getComposingLengthBeforeCursor", 299, "NlHandwritingIme.java")).u("getComposingLengthBeforeCursor: there was no successful decode call, current code: %s", i3 - 1);
            return 0;
        }
        return i2;
    }

    public static boolean t(int i2, int i3, int i4) {
        return i4 == 2 && r(i3, 2) == 0 && s(i2, 2) == 0;
    }

    public static int u(int i2, int i3, HandwritingIme handwritingIme) {
        return (handwritingIme.m != 2 || i3 < 3 || i2 >= 2) ? i2 : 1 - i2;
    }

    public static boolean v(boolean z) {
        return !z;
    }

    public static boolean w(Context context) {
        return jbt.B(context, R.string.f175200_resource_name_obfuscated_res_0x7f140c56, true);
    }

    public static Iterable x(Iterable iterable, lfe lfeVar, leq leqVar) {
        return lre.ab(lre.Z(iterable, lfeVar), leqVar);
    }

    public static lmz y(Iterable iterable, leq leqVar) {
        return lmz.o(lre.ab(iterable, leqVar));
    }

    public static void z(cyv cyvVar) {
        lfb lfbVar;
        if (((Boolean) cyj.t.c()).booleanValue()) {
            lfbVar = jgg.b().a().y();
        } else {
            lfbVar = ldu.a;
        }
        cyvVar.d(lfbVar);
    }
}
