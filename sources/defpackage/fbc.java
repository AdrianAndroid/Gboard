package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fbc  reason: default package */
/* loaded from: classes.dex */
public final class fbc extends hqi {
    final /* synthetic */ fbf a;

    public fbc(fbf fbfVar) {
        this.a = fbfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0055, code lost:
        if (r0 >= ((java.lang.Long) defpackage.fbh.v.c()).longValue()) goto L14;
     */
    @Override // defpackage.hqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.hpy r7) {
        /*
            r6 = this;
            fbf r0 = r6.a
            long r0 = r0.e
            long r2 = java.lang.System.currentTimeMillis()
            hhl r4 = defpackage.fbh.u
            java.lang.Object r4 = r4.c()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r2 = r2 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1f
            fbf r7 = r6.a
            r7.b()
            return
        L1f:
            java.lang.CharSequence r7 = r7.c
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L8c
            fbf r7 = r6.a
            boolean r0 = r7.g
            if (r0 != 0) goto L57
            android.content.Context r0 = r7.c
            ino r0 = defpackage.ino.M(r0)
            r1 = 0
            java.lang.String r3 = "voice_message_sent_times_before_promo_donation"
            long r0 = r0.c(r3, r1)
            r4 = 1
            long r0 = r0 + r4
            android.content.Context r7 = r7.c
            ino r7 = defpackage.ino.M(r7)
            r7.i(r3, r0)
            hhl r7 = defpackage.fbh.v
            java.lang.Object r7 = r7.c()
            java.lang.Long r7 = (java.lang.Long) r7
            long r2 = r7.longValue()
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L85
        L57:
            fbf r7 = r6.a
            ltg r0 = defpackage.fbf.a
            ltv r0 = r0.b()
            ltd r0 = (defpackage.ltd) r0
            r1 = 203(0xcb, float:2.84E-43)
            java.lang.String r2 = "VoiceDonationPromoManager.java"
            java.lang.String r3 = "com/google/android/apps/inputmethod/libs/voiceime/VoiceDonationPromoManager"
            java.lang.String r4 = "createShowBannerTask"
            ltv r0 = r0.k(r3, r4, r1, r2)
            ltd r0 = (defpackage.ltd) r0
            java.lang.String r1 = "voice donation banner is about to be shown"
            r0.t(r1)
            r0 = 1
            defpackage.fbf.b = r0
            fbb r0 = new fbb
            r0.<init>()
            r7.d = r0
            java.lang.Runnable r7 = r7.d
            r0 = 1300(0x514, double:6.423E-321)
            defpackage.kki.i(r7, r0)
        L85:
            fbf r7 = r6.a
            hqi r7 = r7.j
            r7.h()
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbc.a(hpy):void");
    }

    @Override // defpackage.hqi
    public final void c() {
        this.a.b();
    }
}
