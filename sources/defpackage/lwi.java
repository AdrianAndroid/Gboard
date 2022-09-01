package defpackage;

/* compiled from: PG */
/* renamed from: lwi  reason: default package */
/* loaded from: classes.dex */
public final class lwi extends lvl {
    private final lwg a;
    private final lwm b;
    private final lwh c;
    private final lvk d;

    public lwi() {
        lwg lwgVar = (lwg) p(lwg.class, "flogger.backend_factory");
        this.a = lwgVar == null ? lwj.a : lwgVar;
        lwm lwmVar = (lwm) p(lwm.class, "flogger.logging_context");
        this.b = lwmVar == null ? lwo.a : lwmVar;
        lwh lwhVar = (lwh) p(lwh.class, "flogger.clock");
        this.c = lwhVar == null ? lwl.a : lwhVar;
        this.d = lwk.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object p(java.lang.Class r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwi.p(java.lang.Class, java.lang.String):java.lang.Object");
    }

    @Override // defpackage.lvl
    protected final long c() {
        return this.c.a();
    }

    @Override // defpackage.lvl
    protected final lun e(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.lvl
    protected final lvk h() {
        return this.d;
    }

    @Override // defpackage.lvl
    protected final lwm j() {
        return this.b;
    }

    @Override // defpackage.lvl
    protected final String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a + "\nClock: " + this.c + "\nContextDataProvider: " + this.b + "\nLogCallerFinder: " + this.d + "\n";
    }
}
