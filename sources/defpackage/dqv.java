package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dqv  reason: default package */
/* loaded from: classes.dex */
public final class dqv implements AccessibilityManager.AccessibilityStateChangeListener {
    public static final lug a = hin.a;
    private static dqv f;
    public SparseArray b;
    public final gqa c;
    public final AssetManager d;
    private final Context h;
    private final Executor i;
    private final Object g = new Object();
    public final String e = (String) dqq.i.c();
    private final String j = (String) dqq.j.c();
    private final int k = ((Long) dqq.k.c()).intValue();

    private dqv(Context context) {
        mks a2 = gxo.a(10);
        AssetManager assets = context.getAssets();
        gqa a3 = gqa.a(context);
        this.h = context;
        this.c = a3;
        this.i = a2;
        this.d = assets;
        if (a3.f) {
            c();
        } else {
            a3.p(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dqv a(Context context) {
        synchronized (dqv.class) {
            if (f == null) {
                f = new dqv(context.getApplicationContext());
            }
        }
        return f;
    }

    private final void c() {
        int i;
        if (!TextUtils.isEmpty(this.e)) {
            this.i.execute(new dgd(this, 18));
        } else if (TextUtils.isEmpty(this.j) || (i = this.k) <= 0) {
        } else {
            drp.d(this.h, this.j, i, "japanese_phonetic_reading", new drg(this, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb A[Catch: all -> 0x00c7, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000a, B:41:0x0092, B:44:0x00bb, B:45:0x00bd, B:56:0x00c3, B:57:0x00c6, B:52:0x00b6), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.io.InputStream r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.g
            monitor-enter(r0)
            android.util.SparseArray r1 = r10.b     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lc
            defpackage.gvt.a(r11)     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            return
        Lc:
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            java.nio.charset.Charset r4 = j$.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            r3.<init>(r11, r4)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L9e java.io.IOException -> La0
            android.util.SparseArray r11 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            r3 = 1024(0x400, float:1.435E-42)
            r11.<init>(r3)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
        L20:
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            if (r3 == 0) goto L92
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            if (r4 != 0) goto L20
            java.lang.String r4 = "#"
            boolean r4 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            if (r4 != 0) goto L20
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            r5 = 0
            int r4 = r3.codePointCount(r5, r4)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            r6 = 3
            if (r4 >= r6) goto L5c
            lug r4 = defpackage.dqv.a     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            ltv r4 = r4.c()     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            luc r4 = (defpackage.luc) r4     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            java.lang.String r5 = "com/google/android/apps/inputmethod/libs/mozc/ime/CandidateDescriptionGenerator"
            java.lang.String r6 = "loadCandidateDescriptionData"
            java.lang.String r7 = "CandidateDescriptionGenerator.java"
            r8 = 201(0xc9, float:2.82E-43)
            ltv r4 = r4.k(r5, r6, r8, r7)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            luc r4 = (defpackage.luc) r4     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            java.lang.String r5 = "Too short content description entry: %s"
            r4.w(r5, r3)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            goto L20
        L5c:
            int r4 = r3.codePointAt(r5)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            int r5 = java.lang.Character.charCount(r4)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            int r6 = r3.codePointAt(r5)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            r7 = 9
            if (r6 == r7) goto L88
            lug r4 = defpackage.dqv.a     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            ltv r4 = r4.c()     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            luc r4 = (defpackage.luc) r4     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            java.lang.String r5 = "com/google/android/apps/inputmethod/libs/mozc/ime/CandidateDescriptionGenerator"
            java.lang.String r6 = "loadCandidateDescriptionData"
            java.lang.String r7 = "CandidateDescriptionGenerator.java"
            r8 = 207(0xcf, float:2.9E-43)
            ltv r4 = r4.k(r5, r6, r8, r7)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            luc r4 = (defpackage.luc) r4     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            java.lang.String r5 = "Invalid content description entry: %s"
            r4.w(r5, r3)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            goto L20
        L88:
            int r5 = r5 + 1
            java.lang.String r3 = r3.substring(r5)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            r11.put(r4, r3)     // Catch: java.lang.Throwable -> L97 java.io.IOException -> L9a
            goto L20
        L92:
            defpackage.gvt.a(r2)     // Catch: java.lang.Throwable -> Lc7
            r1 = r11
            goto Lb9
        L97:
            r11 = move-exception
            r1 = r2
            goto Lc3
        L9a:
            r11 = move-exception
            r8 = r11
            r11 = r2
            goto La3
        L9e:
            r11 = move-exception
            goto Lc3
        La0:
            r11 = move-exception
            r8 = r11
            r11 = r1
        La3:
            lug r2 = defpackage.dqv.a     // Catch: java.lang.Throwable -> Lbf
            ltv r2 = r2.c()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r3 = "Failed to load content description input stream."
            java.lang.String r4 = "com/google/android/apps/inputmethod/libs/mozc/ime/CandidateDescriptionGenerator"
            java.lang.String r5 = "loadCandidateDescriptionData"
            r6 = 215(0xd7, float:3.01E-43)
            java.lang.String r7 = "CandidateDescriptionGenerator.java"
            defpackage.f.j(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lbf
            defpackage.gvt.a(r11)     // Catch: java.lang.Throwable -> Lc7
        Lb9:
            if (r1 == 0) goto Lbd
            r10.b = r1     // Catch: java.lang.Throwable -> Lc7
        Lbd:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            return
        Lbf:
            r1 = move-exception
            r9 = r1
            r1 = r11
            r11 = r9
        Lc3:
            defpackage.gvt.a(r1)     // Catch: java.lang.Throwable -> Lc7
            throw r11     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc7
            goto Lcb
        Lca:
            throw r11
        Lcb:
            goto Lca
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqv.b(java.io.InputStream):void");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        if (z) {
            gqa gqaVar = this.c;
            synchronized (gqaVar.l) {
                gqaVar.l.remove(this);
            }
            c();
        }
    }
}
