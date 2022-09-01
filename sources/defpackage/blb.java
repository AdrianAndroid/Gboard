package defpackage;

/* compiled from: PG */
/* renamed from: blb  reason: default package */
/* loaded from: classes.dex */
public final class blb extends bla {
    public final int a;

    public blb(int i) {
        super("Error code: " + i);
        this.a = i;
    }

    public blb(String str, int i) {
        super("Error code: " + i + " | " + str);
        this.a = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public blb(java.lang.String r4, java.lang.Throwable r5, int r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error code: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " | "
            r1.append(r2)
            r1.append(r4)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4, r5)
            r3.a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blb.<init>(java.lang.String, java.lang.Throwable, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public blb(java.lang.Throwable r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = r4.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error code: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " | "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0, r4)
            r3.a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blb.<init>(java.lang.Throwable, int):void");
    }
}
