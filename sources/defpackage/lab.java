package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: lab  reason: default package */
/* loaded from: classes.dex */
public final class lab implements lao {
    public final Context a;
    public final lac b;
    private final kzr c;
    private final Executor d;

    public lab(Context context, Executor executor, lac lacVar, kzr kzrVar) {
        this.a = context;
        this.c = kzrVar;
        this.b = lacVar;
        this.d = executor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0155, code lost:
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x019d, code lost:
        r2 = r22.b;
        r3 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01a7, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01a9, code lost:
        r12 = r3.getLongVersionCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01b3, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b4, code lost:
        r7 = android.content.res.AssetManager.class.getDeclaredConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01be, code lost:
        if (r7.isAccessible() != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c0, code lost:
        r7.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01c9, code lost:
        r3 = (android.content.res.AssetManager) r7.newInstance(new java.lang.Object[0]);
        r7 = r9.length - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01ce, code lost:
        if (r7 < 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01d0, code lost:
        r2.b.a = r3.openXmlResourceParser(defpackage.laq.e(r3, r9[r7]), "AndroidManifest.xml");
        r10 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01e4, code lost:
        if (r10.a == null) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01e6, code lost:
        r14 = r10.a.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01ed, code lost:
        if (r14 == 2) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ef, code lost:
        if (r14 == r5) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0285, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("Couldn't find manifest entry at top-level.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0201, code lost:
        if (r10.a.getName().equals("manifest") == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0203, code lost:
        r14 = r10.a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r10 = r10.a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0213, code lost:
        if (r14 == null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0215, code lost:
        r14 = java.lang.Integer.parseInt(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0219, code lost:
        if (r10 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x021b, code lost:
        r18 = r12;
        r15 = r6;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0239, code lost:
        if (r18 != r5) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x023b, code lost:
        r7 = r7 - 1;
        r6 = r15;
        r12 = r18;
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0228, code lost:
        r15 = r6;
        r18 = r12;
        r5 = (java.lang.Integer.parseInt(r10) << 32) | (r14 & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0243, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x025b, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCodeMajor to int: %s", r0.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x025c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0274, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCode to int: %s", r0.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x027d, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x028e, code lost:
        throw new org.xmlpull.v1.XmlPullParserException("Manifest file needs to be loaded before parsing.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x028f, code lost:
        r15 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0290, code lost:
        r0 = r22.c.d().listFiles();
        java.util.Arrays.sort(r0);
        r2 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x029e, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02a0, code lost:
        if (r2 < 0) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02a2, code lost:
        defpackage.kzr.l(r0[r2]);
        r3 = r0[r2];
        r3.renameTo(defpackage.kzr.a(r22.c.e(), r3.getName()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02bb, code lost:
        android.util.Log.i("SplitCompat", "Splits verified.");
        r11 = 0;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02c3, code lost:
        android.util.Log.e("SplitCompat", "Cannot write verified split.", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x030c, code lost:
        r11 = -13;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x02c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x02e0, code lost:
        throw new defpackage.lak(java.lang.String.format("Failed to invoke default constructor on class %s", r3.getName()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x01ae, code lost:
        r12 = r3.versionCode;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0327 A[Catch: Exception -> 0x032b, TRY_LEAVE, TryCatch #5 {Exception -> 0x032b, blocks: (B:3:0x000a, B:11:0x0327, B:216:0x0323, B:215:0x031a), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x031a A[Catch: all -> 0x031e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x032b, blocks: (B:3:0x000a, B:11:0x0327, B:216:0x0323, B:215:0x031a), top: B:2:0x000a }] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r15v39, types: [java.security.cert.X509Certificate, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Integer a(java.util.List r23) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lab.a(java.util.List):java.lang.Integer");
    }

    @Override // defpackage.lao
    public final void b(List list, lam lamVar) {
        if (kzz.a.get() == null) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.d.execute(new kme(this, list, lamVar, 2));
    }
}
