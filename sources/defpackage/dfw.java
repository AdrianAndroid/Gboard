package defpackage;

/* compiled from: PG */
/* renamed from: dfw  reason: default package */
/* loaded from: classes.dex */
final class dfw implements mka {
    final /* synthetic */ long a;
    final /* synthetic */ dfy b;

    public dfw(dfy dfyVar, long j) {
        this.b = dfyVar;
        this.a = j;
    }

    @Override // defpackage.mka
    public final void a(Throwable th) {
        ((ltd) ((ltd) ((ltd) dfy.a.c()).i(th)).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingModelLoader$1", "onFailure", 'v', "HandwritingModelLoader.java")).t("setupRecognizer#onFailure()");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0222, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0227, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0228, code lost:
        ((defpackage.ltd) ((defpackage.ltd) ((defpackage.ltd) defpackage.dfy.a.c()).i(r0)).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingModelLoader", "setupRecognizer", 213, "HandwritingModelLoader.java")).t("setupRecognizer()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
        r9 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:
        if (r9.hasNext() == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
        r10 = (java.lang.String) r9.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0108, code lost:
        if (r6.contains(r10) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010a, code lost:
        r12 = ((defpackage.byy) r4).c(r10);
        r8.d(r12);
        r13 = defpackage.dfy.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
        if (r13 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011a, code lost:
        r11.put(r10, r13.getAbsolutePath());
        r7.b(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0125, code lost:
        r4 = r0.e;
        r6 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
        if (defpackage.dhd.b((defpackage.dhu) r5) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0141, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) r11.get(((defpackage.dhu) r5).b)) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0152, code lost:
        if (android.text.TextUtils.isEmpty((java.lang.CharSequence) r11.get(((defpackage.dhu) r5).c)) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0154, code lost:
        r13 = (java.lang.String) r11.get(((defpackage.dhu) r5).b);
        r14 = (java.lang.String) r11.get(((defpackage.dhu) r5).c);
        r15 = (java.lang.String) r11.get(((defpackage.dhu) r5).d);
        r5 = ((defpackage.dhu) r5).e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0182, code lost:
        if (r5 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
        r5 = defpackage.dht.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019a, code lost:
        if (r4.f(new com.google.android.libraries.handwriting.classifiers.LSTMRecognizerJNI(new defpackage.gpg(r13, r14, r15, new defpackage.kkc(r5.a), null), r6)) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019c, code lost:
        r4 = r7.a();
        r8.d(r4);
        r0 = r0.f;
        r5 = r0.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a7, code lost:
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a8, code lost:
        r6 = defpackage.byy.b();
        r6.c(r0.f);
        r6.c(r4);
        r4 = r6.a();
        r0.f.close();
        r0.f = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bf, code lost:
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c0, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c7, code lost:
        ((defpackage.ltd) ((defpackage.ltd) ((defpackage.ltd) defpackage.dfy.a.c()).i(r0)).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingModelLoader", "setupRecognizer", 213, "HandwritingModelLoader.java")).t("setupRecognizer()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e0, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e6, code lost:
        ((defpackage.ltd) ((defpackage.ltd) ((defpackage.ltd) defpackage.dfy.a.c()).i(r0)).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingModelLoader", "setupRecognizer", 213, "HandwritingModelLoader.java")).t("setupRecognizer()");
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0204, code lost:
        throw new java.io.IOException("Could not find file paths for Mapping entries.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x020c, code lost:
        throw new java.io.IOException("Missing fields in Mapping entry.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x020f, code lost:
        ((defpackage.ltd) ((defpackage.ltd) ((defpackage.ltd) defpackage.dfy.a.c()).i(r0)).k("com/google/android/apps/inputmethod/libs/handwriting/ime/HandwritingModelLoader", "setupRecognizer", 206, "HandwritingModelLoader.java")).t("setupRecognizer()");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0272  */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable, java.lang.Object] */
    @Override // defpackage.mka
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfw.b(java.lang.Object):void");
    }
}
