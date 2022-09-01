package defpackage;

import android.content.Context;
import android.util.LruCache;
import com.google.android.apps.inputmethod.libs.latin5.LatinIme;
import com.google.android.apps.inputmethod.libs.mozc.ime.SimpleJapaneseIme;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: dur  reason: default package */
/* loaded from: classes.dex */
public final class dur {
    public static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/nga/impl/service/NgaContextHelper");
    public final Context b;
    public final Executor c;
    private final ino h;
    private final dxe i;
    public final AtomicReference f = new AtomicReference();
    public final idk g = ieh.j();
    public final LruCache d = new LruCache(5);
    public final LruCache e = new LruCache(5);

    public dur(Context context) {
        dxe dxeVar = new dxe(context);
        ino M = ino.M(context);
        mks a2 = gxo.a(6);
        this.b = context;
        this.i = dxeVar;
        this.h = M;
        this.c = a2;
    }

    public static bkt c(String str) {
        int i = 3;
        if (str.isEmpty()) {
            nfh t = bkt.d.t();
            if (t.c) {
                t.cD();
                t.c = false;
            }
            ((bkt) t.b).a = bvq.k(3);
            return (bkt) t.cz();
        }
        nfh t2 = bkt.d.t();
        String replaceAll = str.replaceAll("\\A\\h+", "");
        int length = str.length() - replaceAll.length();
        boolean z = length > 0;
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ((bkt) t2.b).c = z;
        if (replaceAll.length() > 0 && length < 10) {
            char charAt = replaceAll.charAt(0);
            i = 4;
            if (charAt != '\n' && charAt != '\r' && charAt != 133 && charAt != 8232 && charAt != 8233) {
                if (Character.isLetterOrDigit(charAt)) {
                    i = Character.isUpperCase(charAt) ? 7 : 6;
                } else {
                    i = Character.isSpaceChar(charAt) ? 2 : 5;
                }
            }
        }
        if (t2.c) {
            t2.cD();
            t2.c = false;
        }
        ((bkt) t2.b).a = bvq.k(i);
        if (i == 5) {
            String substring = replaceAll.substring(0, 1);
            if (t2.c) {
                t2.cD();
                t2.c = false;
            }
            substring.getClass();
            ((bkt) t2.b).b = substring;
        }
        return (bkt) t2.cz();
    }

    public static String d(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse().toString();
    }

    public static boolean e(iav iavVar) {
        if (iavVar == null) {
            return false;
        }
        if (((Boolean) dsu.q.c()).booleanValue() && Objects.equals(iavVar.c, LatinIme.class.getCanonicalName())) {
            return true;
        }
        return ((Boolean) dsu.r.c()).booleanValue() && Objects.equals(iavVar.c, SimpleJapaneseIme.class.getCanonicalName());
    }

    public final bkl a() {
        return b(dzg.d(this.b));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bkl b(defpackage.hqt r14) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dur.b(hqt):bkl");
    }
}
