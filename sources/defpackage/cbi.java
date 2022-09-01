package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: cbi  reason: default package */
/* loaded from: classes.dex */
public final class cbi {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/delight5/InputConnectionParser");
    private final caj b;

    public cbi(caj cajVar) {
        this.b = cajVar;
    }

    public static int a(CharSequence charSequence) {
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (z) {
                if (!Character.isLowSurrogate(charAt)) {
                    return Math.max(0, i - 1);
                }
                z = false;
            } else if (Character.isHighSurrogate(charAt)) {
                z = true;
            } else if (Character.isLowSurrogate(charAt)) {
                return i;
            }
        }
        if (z) {
            return charSequence.length() - 1;
        }
        return -1;
    }

    private static mtn c(int i) {
        int i2 = i - 1;
        ((ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputConnectionParser", "responseWithError", 105, "InputConnectionParser.java")).u("responseWithError(): parse_code: %d", i2);
        nfh t = mtn.g.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mtn mtnVar = (mtn) t.b;
        mtnVar.e = i2;
        mtnVar.a |= 8;
        return (mtn) t.cz();
    }

    public final mtn b(long j, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, int i) {
        CharSequence charSequence4;
        cbi cbiVar;
        mtn mtnVar;
        CharSequence charSequence5 = charSequence;
        if (charSequence2.length() > 40) {
            return c(3);
        }
        int i2 = 1;
        boolean z2 = charSequence.length() == i;
        boolean z3 = charSequence3.length() == i;
        if (a(charSequence2) < 0) {
            int length = charSequence.length() - 1;
            boolean z4 = false;
            while (true) {
                if (length >= 0) {
                    char charAt = charSequence5.charAt(length);
                    if (z4) {
                        if (!Character.isHighSurrogate(charAt)) {
                            length = Math.min(charSequence.length() - 1, length + 1);
                            break;
                        }
                        z4 = false;
                        length--;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            z4 = true;
                        } else if (Character.isHighSurrogate(charAt)) {
                            break;
                        }
                        length--;
                    }
                } else {
                    length = z4 ? 0 : -1;
                }
            }
            int length2 = charSequence.length();
            if (length >= 0) {
                charSequence5 = charSequence5.subSequence(length + 1, length2);
                z2 = true;
            }
            int a2 = a(charSequence3);
            if (a2 >= 0) {
                CharSequence subSequence = charSequence3.subSequence(0, a2);
                cbiVar = this;
                charSequence4 = subSequence;
                z3 = true;
            } else {
                charSequence4 = charSequence3;
                cbiVar = this;
            }
            caj cajVar = cbiVar.b;
            String obj = charSequence5.toString();
            String obj2 = charSequence2.toString();
            String obj3 = charSequence4.toString();
            cbg cbgVar = cajVar.i;
            if (cbgVar == null) {
                mtnVar = mtn.g;
            } else {
                nfh t = mtm.j.t();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mtm mtmVar = (mtm) t.b;
                obj.getClass();
                int i3 = mtmVar.a | 1;
                mtmVar.a = i3;
                mtmVar.b = obj;
                obj2.getClass();
                int i4 = i3 | 2;
                mtmVar.a = i4;
                mtmVar.c = obj2;
                obj3.getClass();
                int i5 = i4 | 4;
                mtmVar.a = i5;
                mtmVar.d = obj3;
                int i6 = i5 | 8;
                mtmVar.a = i6;
                mtmVar.e = z2;
                int i7 = i6 | 16;
                mtmVar.a = i7;
                mtmVar.f = z3;
                mtmVar.a = i7 | 32;
                mtmVar.g = z;
                msg f = caj.f(j, cbgVar, cajVar.f.b());
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mtm mtmVar2 = (mtm) t.b;
                f.getClass();
                mtmVar2.h = f;
                mtmVar2.a |= 64;
                cbz cbzVar = cajVar.e;
                long o = cbzVar.d.o();
                if (t.c) {
                    t.cD();
                    t.c = false;
                }
                mtm mtmVar3 = (mtm) t.b;
                mtmVar3.a |= 256;
                mtmVar3.i = o;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                cbzVar.d(mti.PARSE_INPUT_CONTEXT);
                mtn parseInputContext = cbzVar.a.parseInputContext((mtm) t.cz());
                cbzVar.e(mti.PARSE_INPUT_CONTEXT);
                cbzVar.b.g(caq.DELIGHT_PARSE_INPUT_CONTEXT, SystemClock.elapsedRealtime() - elapsedRealtime);
                cbzVar.b.e(cap.LOG_NATIVE_METRICS, Long.valueOf(((mtm) t.b).i));
                mtnVar = parseInputContext;
            }
            int D = jco.D(mtnVar.e);
            if (D != 0 && D != 1) {
                ltd ltdVar = (ltd) ((ltd) a.c()).k("com/google/android/apps/inputmethod/libs/delight5/InputConnectionParser", "parseInputConnection", 98, "InputConnectionParser.java");
                int D2 = jco.D(mtnVar.e);
                if (D2 != 0) {
                    i2 = D2;
                }
                ltdVar.u("parseInputConnection(): parse_code: %d", i2 - 1);
            }
            return mtnVar;
        }
        return c(2);
    }
}
