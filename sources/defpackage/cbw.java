package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* renamed from: cbw  reason: default package */
/* loaded from: classes.dex */
public final class cbw {
    private static final ltg b = ltg.j("com/google/android/apps/inputmethod/libs/delight5/LanguageModelUtils");
    public static final mvl[] a = {mvl.BLOCKLIST, mvl.CONTACTS, mvl.EMAIL, mvl.ICING_SENT, mvl.ICING_RECEIVED, mvl.PERSONAL_DICTIONARY, mvl.USER_HISTORY, mvl.EMOJI_ANNOTATION};

    public static long a(mvm mvmVar) {
        if (!mvmVar.d.isEmpty()) {
            int i = mvmVar.f;
            if (i > 0 && mvmVar.e > 0) {
                return i;
            }
            File file = new File(mvmVar.d);
            if (file.exists() && file.isFile()) {
                return file.length();
            }
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ec A[Catch: RuntimeException -> 0x013a, TryCatch #4 {RuntimeException -> 0x013a, blocks: (B:3:0x0013, B:5:0x0015, B:6:0x003d, B:8:0x0047, B:11:0x004f, B:19:0x00ec, B:21:0x00ff, B:22:0x0105, B:32:0x0093, B:41:0x00d4, B:48:0x0138, B:54:0x0123, B:60:0x001c, B:37:0x00ce, B:50:0x011d, B:28:0x008d), top: B:2:0x0013, inners: #3, #6, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0118 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.mvm b(android.content.Context r17, java.util.Locale r18) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbw.b(android.content.Context, java.util.Locale):mvm");
    }

    public static mvm c(mvl mvlVar, File file, Locale locale) {
        return h(mvlVar, file.getPath(), 0, (int) file.length(), locale);
    }

    public static mvm d(mvl mvlVar, String str, Locale locale) {
        return c(mvlVar, new File(str), locale);
    }

    public static mvm e(Context context, Locale locale) {
        File file;
        String i = cbd.c.i(context);
        String concat = String.valueOf(locale.toString().toLowerCase(Locale.US)).concat("_d3_\\d{8}.dict");
        File file2 = new File(i);
        if (!file2.exists()) {
            file2.getAbsolutePath();
        } else {
            String[] list = file2.list();
            if (list == null) {
                ((ltd) ((ltd) cbd.a.d()).k("com/google/android/apps/inputmethod/libs/delight5/FileLocationUtils", "getSystemLmFile", 334, "FileLocationUtils.java")).w("Cannot access OEM system directory: %s", file2.getAbsolutePath());
            } else {
                for (String str : list) {
                    if (str.matches(concat)) {
                        file = new File(i, str);
                        break;
                    }
                }
            }
        }
        file = null;
        if (file == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        if (!file.exists() || !file.canRead()) {
            ((ltd) ((ltd) b.d()).k("com/google/android/apps/inputmethod/libs/delight5/LanguageModelUtils", "getLmFromOemSystemDirectory", 234, "LanguageModelUtils.java")).w("Could not access OEM system LM or not available: %s", absolutePath);
            return null;
        }
        ((ltd) ((ltd) b.b()).k("com/google/android/apps/inputmethod/libs/delight5/LanguageModelUtils", "getLmFromOemSystemDirectory", 237, "LanguageModelUtils.java")).w("getLmFromOemSystemDirectory(): %s", absolutePath);
        mvm h = h(mvl.MAIN, absolutePath, 0, (int) file.length(), locale);
        nfh nfhVar = (nfh) h.N(5);
        nfhVar.cG(h);
        long parseLong = Long.parseLong(absolutePath.substring(absolutePath.length() - 13, absolutePath.length() - 5));
        if (nfhVar.c) {
            nfhVar.cD();
            nfhVar.c = false;
        }
        mvm mvmVar = (mvm) nfhVar.b;
        mvm mvmVar2 = mvm.l;
        mvmVar.a |= 256;
        mvmVar.j = parseLong;
        return (mvm) nfhVar.cz();
    }

    public static mvm f(mvl mvlVar, File file, List list) {
        String path = file.getPath();
        int length = (int) file.length();
        nfh t = mvm.l.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mvm mvmVar = (mvm) t.b;
        mvmVar.b = mvlVar.A;
        int i = mvmVar.a | 1;
        mvmVar.a = i;
        path.getClass();
        int i2 = i | 4;
        mvmVar.a = i2;
        mvmVar.d = path;
        int i3 = i2 | 8;
        mvmVar.a = i3;
        mvmVar.e = 0;
        mvmVar.a = i3 | 16;
        mvmVar.f = length;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String language = ((Locale) it.next()).getLanguage();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mvm mvmVar2 = (mvm) t.b;
            language.getClass();
            nga ngaVar = mvmVar2.i;
            if (!ngaVar.c()) {
                mvmVar2.i = nfm.H(ngaVar);
            }
            mvmVar2.i.add(language);
        }
        return (mvm) t.cz();
    }

    public static boolean g(mvm mvmVar) {
        return mvmVar != null && mvmVar.j >= 20160915;
    }

    private static mvm h(mvl mvlVar, String str, int i, int i2, Locale locale) {
        nfh t = mvm.l.t();
        if (t.c) {
            t.cD();
            t.c = false;
        }
        mvm mvmVar = (mvm) t.b;
        mvmVar.b = mvlVar.A;
        int i3 = mvmVar.a | 1;
        mvmVar.a = i3;
        str.getClass();
        int i4 = i3 | 4;
        mvmVar.a = i4;
        mvmVar.d = str;
        int i5 = i4 | 8;
        mvmVar.a = i5;
        mvmVar.e = i;
        mvmVar.a = i5 | 16;
        mvmVar.f = i2;
        if (locale != null) {
            String country = locale.getCountry();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mvm mvmVar2 = (mvm) t.b;
            country.getClass();
            mvmVar2.a |= 128;
            mvmVar2.h = country;
            String language = locale.getLanguage();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            mvm mvmVar3 = (mvm) t.b;
            language.getClass();
            mvmVar3.a |= 64;
            mvmVar3.g = language;
        }
        return (mvm) t.cz();
    }
}
