package defpackage;

/* compiled from: PG */
/* renamed from: oqu  reason: default package */
/* loaded from: classes2.dex */
public final class oqu implements oqa {
    final opu a;

    public oqu(opu opuVar, byte[] bArr) {
        this.a = opuVar;
    }

    static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    static boolean c(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    private static oql d(oql oqlVar) {
        if (oqlVar == null || oqlVar.g == null) {
            return oqlVar;
        }
        oqk c = oqlVar.c();
        c.f = null;
        return c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0300 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x030b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x033a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v38, types: [oqi, oql] */
    /* JADX WARN: Type inference failed for: r0v56 */
    @Override // defpackage.oqa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.oql a(defpackage.orr r27) {
        /*
            Method dump skipped, instructions count: 1266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqu.a(orr):oql");
    }
}
