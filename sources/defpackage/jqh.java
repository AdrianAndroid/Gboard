package defpackage;

/* compiled from: PG */
/* renamed from: jqh  reason: default package */
/* loaded from: classes.dex */
public final class jqh implements jtb {
    private static final jsp a = jsp.e(-1, -1);
    private final jux b;
    private final jqb c;
    private final jls e;

    public jqh(jux juxVar, jls jlsVar, jqb jqbVar, byte[] bArr, byte[] bArr2) {
        this.b = juxVar;
        this.e = jlsVar;
        this.c = jqbVar;
    }

    private static String a(long j) {
        return j >= 0 ? Long.toString(j) : "?";
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d3 A[Catch: IOException -> 0x0257, TRY_ENTER, TryCatch #1 {IOException -> 0x0257, blocks: (B:3:0x0006, B:7:0x0013, B:8:0x006a, B:10:0x0070, B:13:0x007b, B:14:0x007f, B:15:0x0099, B:17:0x009f, B:26:0x00d3, B:27:0x016c, B:29:0x0170, B:30:0x017c, B:32:0x0186, B:66:0x01f2, B:68:0x0230, B:70:0x0245, B:73:0x00d7, B:75:0x00e3, B:76:0x00ec, B:78:0x0104, B:79:0x015c, B:80:0x0109, B:82:0x0123, B:83:0x0129, B:85:0x0143, B:86:0x014a, B:88:0x0150, B:101:0x00ca, B:112:0x016a, B:114:0x024f, B:33:0x0187, B:35:0x018e, B:38:0x01d8, B:42:0x01e5, B:43:0x01ec, B:46:0x01a0, B:48:0x01c9, B:60:0x01c8, B:63:0x01d4, B:64:0x01ed), top: B:2:0x0006, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0170 A[Catch: IOException -> 0x0257, TryCatch #1 {IOException -> 0x0257, blocks: (B:3:0x0006, B:7:0x0013, B:8:0x006a, B:10:0x0070, B:13:0x007b, B:14:0x007f, B:15:0x0099, B:17:0x009f, B:26:0x00d3, B:27:0x016c, B:29:0x0170, B:30:0x017c, B:32:0x0186, B:66:0x01f2, B:68:0x0230, B:70:0x0245, B:73:0x00d7, B:75:0x00e3, B:76:0x00ec, B:78:0x0104, B:79:0x015c, B:80:0x0109, B:82:0x0123, B:83:0x0129, B:85:0x0143, B:86:0x014a, B:88:0x0150, B:101:0x00ca, B:112:0x016a, B:114:0x024f, B:33:0x0187, B:35:0x018e, B:38:0x01d8, B:42:0x01e5, B:43:0x01ec, B:46:0x01a0, B:48:0x01c9, B:60:0x01c8, B:63:0x01d4, B:64:0x01ed), top: B:2:0x0006, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0186 A[Catch: IOException -> 0x0257, TRY_LEAVE, TryCatch #1 {IOException -> 0x0257, blocks: (B:3:0x0006, B:7:0x0013, B:8:0x006a, B:10:0x0070, B:13:0x007b, B:14:0x007f, B:15:0x0099, B:17:0x009f, B:26:0x00d3, B:27:0x016c, B:29:0x0170, B:30:0x017c, B:32:0x0186, B:66:0x01f2, B:68:0x0230, B:70:0x0245, B:73:0x00d7, B:75:0x00e3, B:76:0x00ec, B:78:0x0104, B:79:0x015c, B:80:0x0109, B:82:0x0123, B:83:0x0129, B:85:0x0143, B:86:0x014a, B:88:0x0150, B:101:0x00ca, B:112:0x016a, B:114:0x024f, B:33:0x0187, B:35:0x018e, B:38:0x01d8, B:42:0x01e5, B:43:0x01ec, B:46:0x01a0, B:48:0x01c9, B:60:0x01c8, B:63:0x01d4, B:64:0x01ed), top: B:2:0x0006, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0230 A[Catch: IOException -> 0x0257, TryCatch #1 {IOException -> 0x0257, blocks: (B:3:0x0006, B:7:0x0013, B:8:0x006a, B:10:0x0070, B:13:0x007b, B:14:0x007f, B:15:0x0099, B:17:0x009f, B:26:0x00d3, B:27:0x016c, B:29:0x0170, B:30:0x017c, B:32:0x0186, B:66:0x01f2, B:68:0x0230, B:70:0x0245, B:73:0x00d7, B:75:0x00e3, B:76:0x00ec, B:78:0x0104, B:79:0x015c, B:80:0x0109, B:82:0x0123, B:83:0x0129, B:85:0x0143, B:86:0x014a, B:88:0x0150, B:101:0x00ca, B:112:0x016a, B:114:0x024f, B:33:0x0187, B:35:0x018e, B:38:0x01d8, B:42:0x01e5, B:43:0x01ec, B:46:0x01a0, B:48:0x01c9, B:60:0x01c8, B:63:0x01d4, B:64:0x01ed), top: B:2:0x0006, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7 A[Catch: IOException -> 0x0257, TryCatch #1 {IOException -> 0x0257, blocks: (B:3:0x0006, B:7:0x0013, B:8:0x006a, B:10:0x0070, B:13:0x007b, B:14:0x007f, B:15:0x0099, B:17:0x009f, B:26:0x00d3, B:27:0x016c, B:29:0x0170, B:30:0x017c, B:32:0x0186, B:66:0x01f2, B:68:0x0230, B:70:0x0245, B:73:0x00d7, B:75:0x00e3, B:76:0x00ec, B:78:0x0104, B:79:0x015c, B:80:0x0109, B:82:0x0123, B:83:0x0129, B:85:0x0143, B:86:0x014a, B:88:0x0150, B:101:0x00ca, B:112:0x016a, B:114:0x024f, B:33:0x0187, B:35:0x018e, B:38:0x01d8, B:42:0x01e5, B:43:0x01ec, B:46:0x01a0, B:48:0x01c9, B:60:0x01c8, B:63:0x01d4, B:64:0x01ed), top: B:2:0x0006, inners: #3 }] */
    @Override // defpackage.jtb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.io.PrintWriter r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqh.e(java.io.PrintWriter, boolean):void");
    }
}
