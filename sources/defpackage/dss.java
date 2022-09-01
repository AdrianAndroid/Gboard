package defpackage;

import android.util.Pair;
import android.view.textservice.TextInfo;
import j$.util.Collection$EL;
import java.lang.Character;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: dss  reason: default package */
/* loaded from: classes.dex */
public final class dss {
    public static final LinkedHashMap a;
    public static final AtomicInteger b;
    private static final int c;
    private static final LinkedHashMap d;
    private static final AtomicInteger e;
    private static final AtomicInteger f;
    private static final ieh g;
    private static final Character.UnicodeBlock[] h;

    static {
        c = true != li.e() ? 2 : 8;
        d = new dsq();
        a = new dsr();
        b = new AtomicInteger(0);
        e = new AtomicInteger(0);
        f = new AtomicInteger(0);
        g = ieh.j();
        h = new Character.UnicodeBlock[]{Character.UnicodeBlock.HIRAGANA, Character.UnicodeBlock.KATAKANA, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A, Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B};
    }

    private dss() {
    }

    static final int a() {
        return f.get();
    }

    static final int b() {
        return e.get();
    }

    static final int c() {
        return b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(String str, String str2, int i, int i2) {
        if (str.isEmpty() || str2.isEmpty() || i2 < 0 || i > str.length() || i2 > str.length() || i2 <= i) {
            return null;
        }
        int max = Math.max(i - 4, 0);
        int min = Math.min(i2 + 4, str.length());
        if (max == i && min == i2) {
            return null;
        }
        while (max > 0 && Character.isSurrogate(str.charAt(max))) {
            max--;
        }
        while (min < str.length() && Character.isSurrogate(str.charAt(min - 1))) {
            min++;
        }
        return str.substring(max, i) + str2 + str.substring(i2, min);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0222, code lost:
        if (r8 != r15) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0226, code lost:
        r3 = r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(android.content.Context r20, android.view.textservice.TextInfo[] r21, android.view.textservice.SentenceSuggestionsInfo[] r22) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dss.e(android.content.Context, android.view.textservice.TextInfo[], android.view.textservice.SentenceSuggestionsInfo[]):void");
    }

    static synchronized boolean f(String str) {
        synchronized (dss.class) {
            if (str != null) {
                if (a.containsKey(str)) {
                    return true;
                }
            }
            return false;
        }
    }

    static synchronized boolean g(int i, int i2, String str) {
        synchronized (dss.class) {
            String str2 = (String) d.put(Pair.create(Integer.valueOf(i), Integer.valueOf(i2)), str);
            if (str2 != null) {
                if (str2.equals(str)) {
                    return false;
                }
            }
            return true;
        }
    }

    static synchronized void h(TextInfo textInfo) {
        synchronized (dss.class) {
            String text = textInfo.getText();
            LinkedHashMap linkedHashMap = d;
            int size = linkedHashMap.size();
            Collection$EL.removeIf(linkedHashMap.entrySet(), new dsp(textInfo, text, 0));
            f.addAndGet(size - linkedHashMap.size());
            linkedHashMap.size();
        }
    }
}
