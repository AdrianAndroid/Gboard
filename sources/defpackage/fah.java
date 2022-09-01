package defpackage;

import android.view.inputmethod.EditorInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fah  reason: default package */
/* loaded from: classes.dex */
public final class fah extends hst implements ty {
    final /* synthetic */ fai a;
    private final iay b;

    public fah(fai faiVar, iay iayVar) {
        this.a = faiVar;
        this.b = iayVar;
    }

    private final void i() {
        hsk b = hsx.b();
        if (b == null) {
            ((luc) ((luc) fai.a.d()).k("com/google/android/apps/inputmethod/libs/voiceime/RecordAudioPermissionsChecker$RequestPermissionResultHandler", "sendGrantedKey", 157, "RecordAudioPermissionsChecker.java")).t("Service is null and could not be acquired.");
            return;
        }
        iay iayVar = this.b;
        if (iayVar == null) {
            return;
        }
        b.at(hfd.d(iayVar));
    }

    @Override // defpackage.hst
    public final void b(EditorInfo editorInfo, EditorInfo editorInfo2, boolean z) {
        if (this.a.c()) {
            i();
        }
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", r6) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (defpackage.tw.c(r3, r6) == false) goto L21;
     */
    @Override // defpackage.ty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRequestPermissionsResult(int r9, java.lang.String[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fah.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
