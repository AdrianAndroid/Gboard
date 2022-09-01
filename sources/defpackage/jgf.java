package defpackage;

/* compiled from: PG */
/* renamed from: jgf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jgf implements lgb {
    private final /* synthetic */ int l;
    public static final /* synthetic */ jgf k = new jgf(10);
    public static final /* synthetic */ jgf j = new jgf(9);
    public static final /* synthetic */ jgf i = new jgf(8);
    public static final /* synthetic */ jgf h = new jgf(7);
    public static final /* synthetic */ jgf g = new jgf(6);
    public static final /* synthetic */ jgf f = new jgf(5);
    public static final /* synthetic */ jgf e = new jgf(4);
    public static final /* synthetic */ jgf d = new jgf(3);
    public static final /* synthetic */ jgf c = new jgf(2);
    public static final /* synthetic */ jgf b = new jgf(1);
    public static final /* synthetic */ jgf a = new jgf(0);

    private /* synthetic */ jgf(int i2) {
        this.l = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        if (r1.importance >= 400) goto L12;
     */
    @Override // defpackage.lgb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a() {
        /*
            r11 = this;
            java.lang.String r0 = "PhenotypeProcessReaper"
            int r1 = r11.l
            r2 = 1
            r3 = 0
            switch(r1) {
                case 0: goto L8e;
                case 1: goto L88;
                case 2: goto L82;
                case 3: goto L7c;
                case 4: goto L73;
                case 5: goto L6e;
                case 6: goto L62;
                case 7: goto L47;
                case 8: goto L3c;
                case 9: goto Le;
                default: goto L9;
            }
        L9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        Le:
            android.app.ActivityManager$RunningAppProcessInfo r1 = new android.app.ActivityManager$RunningAppProcessInfo
            r1.<init>()
            android.app.ActivityManager.getMyMemoryState(r1)     // Catch: java.lang.RuntimeException -> L30
            int r4 = r1.importance
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Memory state is: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.i(r0, r4)
            int r0 = r1.importance
            r1 = 400(0x190, float:5.6E-43)
            if (r0 < r1) goto L36
            goto L37
        L30:
            r1 = move-exception
            java.lang.String r2 = "Failed to retrieve memory state, not killing process."
            android.util.Log.w(r0, r2, r1)
        L36:
            r2 = 0
        L37:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L3c:
            kjh r0 = defpackage.kjh.a
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            mks r0 = defpackage.kcu.D(r0)
            return r0
        L47:
            boolean r0 = android.app.ActivityManager.isUserAMonkey()
            if (r0 == 0) goto L4e
            goto L5d
        L4e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L59
            boolean r2 = android.app.ActivityManager.isRunningInTestHarness()
            goto L5d
        L59:
            boolean r2 = android.app.ActivityManager.isRunningInUserTestHarness()
        L5d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L62:
            gjb r0 = new gjb
            r1 = 2065731759(0x7b2090af, float:8.33702E35)
            r2 = 2131951710(0x7f13005e, float:1.9539842E38)
            r0.<init>(r1, r2)
            return r0
        L6e:
            lfb r0 = defpackage.kgc.a()
            return r0
        L73:
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L7c:
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            return r0
        L82:
            java.util.zip.Adler32 r0 = new java.util.zip.Adler32
            r0.<init>()
            return r0
        L88:
            jbp r0 = new jbp
            r0.<init>()
            return r0
        L8e:
            jgg r0 = new jgg
            boolean r1 = defpackage.hjk.a()
            if (r1 != 0) goto Lb4
            ltg r1 = defpackage.jgg.a
            ltv r1 = r1.c()
            ltd r1 = (defpackage.ltd) r1
            r2 = 85
            java.lang.String r3 = "ZwiebackFetcher.java"
            java.lang.String r4 = "com/google/android/libraries/inputmethod/zwieback/ZwiebackFetcher"
            java.lang.String r5 = "getPseudonymousIdClient"
            ltv r1 = r1.k(r4, r5, r2, r3)
            ltd r1 = (defpackage.ltd) r1
            java.lang.String r2 = "getPseudonymousIdClient: isGMSCoreSafeToConnect=false"
            r1.t(r2)
            ldu r1 = defpackage.ldu.a
            goto Lcc
        Lb4:
            android.content.Context r3 = defpackage.guw.a()
            fnz r1 = new fnz
            ijk r4 = defpackage.gdm.b
            fnu r5 = defpackage.fnv.a
            fny r6 = defpackage.fny.a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            lfb r1 = defpackage.lfb.g(r1)
        Lcc:
            r2 = 9
            mks r2 = defpackage.gxo.c(r2)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgf.a():java.lang.Object");
    }
}
