package defpackage;

/* compiled from: PG */
/* renamed from: cbt  reason: default package */
/* loaded from: classes.dex */
public final class cbt {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/InputContextUtils");
    private static final lmz b;

    static {
        lmx h = lmz.h(6);
        h.d(mrs.TFLITE_NWP);
        h.d(mrs.TFLITE_MWP);
        h.d(mrs.TFLITE_LSTM_EMOJI);
        h.d(mrs.EXPRESSION_TWO_TOWER_MODEL);
        h.d(mrs.EXPRESSION_TRANSFORMER_CONCEPT_MODEL);
        h.d(mrs.EXPRESSION_RULE_BASED);
        b = h.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
        r2.delete(0, r6);
        r4.delete(0, r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.mrw b(defpackage.mrw r10, defpackage.mrw r11) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbt.b(mrw, mrw):mrw");
    }

    static String c(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        if (!str.substring(0, min).equals(str2.substring(0, min))) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextUtils", "deletePrefixOfString", 580, "InputContextUtils.java")).G("%s is not prefix of %s", str2, str);
        }
        return str.length() <= str2.length() ? "" : str.substring(str2.length());
    }

    static String d(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        if (!str.substring(str.length() - min).equals(str2.substring(str2.length() - min))) {
            ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputContextUtils", "deleteSuffixOfString", 602, "InputContextUtils.java")).G("\"%s\" is not suffix of \"%s\". ", str2, str);
        }
        return str.length() <= str2.length() ? "" : str.substring(0, str.length() - str2.length());
    }

    public static String e(mrw mrwVar) {
        String str;
        if (mrwVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[ ClientDiff id: " + mrwVar.b + " ]\n");
        if ((mrwVar.a & 2) != 0) {
            mub mubVar = mrwVar.c;
            if (mubVar == null) {
                mubVar = mub.l;
            }
            if (mubVar.e.isEmpty()) {
                str = "";
            } else {
                mub mubVar2 = mrwVar.c;
                if (mubVar2 == null) {
                    mubVar2 = mub.l;
                }
                str = " autocorrect: '" + mubVar2.e + "'";
            }
            sb.append("[ TextFieldDiff ]\n");
            mub mubVar3 = mrwVar.c;
            String str2 = (mubVar3 == null ? mub.l : mubVar3).b;
            if (mubVar3 == null) {
                mubVar3 = mub.l;
            }
            sb.append("  [ Before del: '" + str2 + "' commit: '" + mubVar3.d + "'" + str + " ]\n");
            mub mubVar4 = mrwVar.c;
            String str3 = (mubVar4 == null ? mub.l : mubVar4).c;
            if (mubVar4 == null) {
                mubVar4 = mub.l;
            }
            sb.append("  [ After del: '" + str3 + "' commit: '" + mubVar4.f + "' ]\n");
            mub mubVar5 = mrwVar.c;
            String str4 = (mubVar5 == null ? mub.l : mubVar5).g;
            if (mubVar5 == null) {
                mubVar5 = mub.l;
            }
            sb.append("  [ Composing: '" + str4 + "|" + mubVar5.h + "' ]\n");
        }
        sb.append("[ Current: {'" + mrwVar.f + "', '" + mrwVar.g + "'} ]\n");
        if ((mrwVar.a & 4) != 0) {
            sb.append("[ SuggestionDiff candidates: ");
            mty mtyVar = mrwVar.d;
            if (mtyVar == null) {
                mtyVar = mty.e;
            }
            for (mse mseVar : mtyVar.c) {
                sb.append("'" + mseVar.d + "' ");
            }
            sb.append("]\n");
        }
        if ((mrwVar.a & 8) != 0) {
            mtd mtdVar = mrwVar.e;
            if (mtdVar == null) {
                mtdVar = mtd.d;
            }
            mtv b2 = mtv.b(mtdVar.a);
            if (b2 == null) {
                b2 = mtv.SHIFT_NONE;
            }
            sb.append("[KeyboardDiff shiftMode: " + b2.d + " ]\n");
        }
        return sb.toString();
    }

    public static boolean f(msv msvVar) {
        return (msvVar == null || msvVar.b.size() == 0) ? false : true;
    }

    public static lmz a(boolean z, boolean z2, boolean z3) {
        if (!z || !z2 || !z3) {
            lmx g = lmz.g();
            if (z) {
                g.d(mrs.TFLITE_NWP);
            }
            if (z2) {
                g.d(mrs.TFLITE_MWP);
            }
            if (z3) {
                g.d(mrs.TFLITE_LSTM_EMOJI);
                g.d(mrs.EXPRESSION_TWO_TOWER_MODEL);
                g.d(mrs.EXPRESSION_TRANSFORMER_CONCEPT_MODEL);
                g.d(mrs.EXPRESSION_RULE_BASED);
            }
            return g.g();
        }
        return b;
    }
}
