package defpackage;

import android.os.SystemClock;
import android.util.LruCache;
import android.util.Printer;
import com.google.android.libraries.inputmethod.nativelib.NativeLibHelper;
import com.google.android.libraries.sentenceexplorer.GrammarChecker;
import j$.util.Objects;

/* compiled from: PG */
/* renamed from: enp  reason: default package */
/* loaded from: classes.dex */
public final class enp implements eno, gzv {
    private static final ltg a = ltg.j("com/google/android/apps/inputmethod/libs/spellchecker/grammar/SentenceExplorerChecker");
    private final idk b;
    private GrammarChecker c;
    private final jav d;
    private final LruCache e = new LruCache(30);

    static {
        NativeLibHelper.a("sentence_explorer_jni", false);
    }

    public enp(idk idkVar, jav javVar, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        GrammarChecker grammarChecker = new GrammarChecker(str);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        kmq a2 = grammarChecker.a();
        if (((Boolean) enl.i.c()).booleanValue()) {
            idkVar.e(iqu.SC_STARTUP_PERFORMANCE, javVar, a2.b, Integer.valueOf(a2.a), Long.valueOf(elapsedRealtime2 - elapsedRealtime));
        }
        this.b = idkVar;
        this.d = javVar;
        this.c = grammarChecker;
        gzt.a.a(this);
    }

    @Override // defpackage.eno
    public final boolean a(jav javVar) {
        if (this.c == null) {
            throw new IllegalStateException("Model is closed.");
        }
        return Objects.equals(this.d.g, javVar.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x03c9, code lost:
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03c7, code lost:
        if (r11 != r8) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
        if (r10 >= (r11 * r13)) goto L37;
     */
    @Override // defpackage.eno
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.llp b(java.lang.CharSequence r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enp.b(java.lang.CharSequence, boolean):llp");
    }

    @Override // defpackage.eno, java.lang.AutoCloseable
    public final void close() {
        GrammarChecker grammarChecker = this.c;
        if (grammarChecker != null) {
            grammarChecker.close();
        }
        this.c = null;
    }

    @Override // defpackage.gzv
    public final void dump(Printer printer, boolean z) {
        GrammarChecker grammarChecker = this.c;
        if (grammarChecker == null) {
            return;
        }
        kmq a2 = grammarChecker.a();
        printer.println("model_name: ".concat(String.valueOf(a2.b)));
        int i = a2.a;
        printer.println("model_version: " + i);
    }

    @Override // defpackage.gzv
    public final String getDumpableTag() {
        return "SentenceExplorerChecker";
    }
}
