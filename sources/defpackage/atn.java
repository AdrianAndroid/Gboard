package defpackage;

/* compiled from: PG */
/* renamed from: atn  reason: default package */
/* loaded from: classes.dex */
public final class atn extends atl {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public atn(java.lang.Class r3, java.lang.Class r4) {
        /*
            r2 = this;
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to find any ModelLoaders for model: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " and data: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atn.<init>(java.lang.Class, java.lang.Class):void");
    }

    public atn(Object obj) {
        super("Failed to find any ModelLoaders registered for model class: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public atn(java.lang.Object r3, java.util.List r4) {
        /*
            r2 = this;
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Found ModelLoaders for model class: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = ", but none that handle this specific model instance: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atn.<init>(java.lang.Object, java.util.List):void");
    }
}
