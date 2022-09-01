package defpackage;

/* compiled from: PG */
/* renamed from: oiw  reason: default package */
/* loaded from: classes2.dex */
public final class oiw {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L9
            r2 = r0
            goto Lc
        L9:
            r1 = move-exception
            r2 = r1
            r1 = r0
        Lc:
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2f
            java.lang.Class<oiv> r5 = defpackage.oiv.class
            java.lang.Class r1 = r1.asSubclass(r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L2d
            java.lang.Class<oix> r6 = defpackage.oix.class
            r5[r3] = r6     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Constructor r1 = r1.getConstructor(r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L2d
            oix r6 = defpackage.oiv.a     // Catch: java.lang.Throwable -> L2d
            r5[r3] = r6     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.newInstance(r5)     // Catch: java.lang.Throwable -> L2d
            oiv r1 = (defpackage.oiv) r1     // Catch: java.lang.Throwable -> L2d
            goto L30
        L2d:
            r1 = move-exception
            r2 = r1
        L2f:
            r1 = r0
        L30:
            if (r1 != 0) goto L39
            oiv r1 = new oiv
            oix r5 = defpackage.oiv.a
            r1.<init>(r5)
        L39:
            if (r2 == 0) goto L94
            java.lang.String r1 = "io.perfmark.PerfMark.debug"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch: java.lang.Throwable -> L94
            if (r1 == 0) goto L94
            java.lang.String r1 = "java.util.logging.Logger"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L94
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L94
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r3] = r6     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = "getLogger"
            java.lang.reflect.Method r5 = r1.getMethod(r6, r5)     // Catch: java.lang.Throwable -> L94
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L94
            java.lang.Class<oiw> r7 = defpackage.oiw.class
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L94
            r6[r3] = r7     // Catch: java.lang.Throwable -> L94
            java.lang.Object r5 = r5.invoke(r0, r6)     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = "java.util.logging.Level"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L94
            java.lang.String r7 = "FINE"
            java.lang.reflect.Field r7 = r6.getField(r7)     // Catch: java.lang.Throwable -> L94
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Throwable -> L94
            r7 = 3
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L94
            r8[r3] = r6     // Catch: java.lang.Throwable -> L94
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r8[r4] = r6     // Catch: java.lang.Throwable -> L94
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r9 = 2
            r8[r9] = r6     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = "log"
            java.lang.reflect.Method r1 = r1.getMethod(r6, r8)     // Catch: java.lang.Throwable -> L94
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L94
            r6[r3] = r0     // Catch: java.lang.Throwable -> L94
            java.lang.String r0 = "Error during PerfMark.<clinit>"
            r6[r4] = r0     // Catch: java.lang.Throwable -> L94
            r6[r9] = r2     // Catch: java.lang.Throwable -> L94
            r1.invoke(r5, r6)     // Catch: java.lang.Throwable -> L94
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oiw.<clinit>():void");
    }

    private oiw() {
    }

    public static oix a() {
        return oiv.a;
    }
}
