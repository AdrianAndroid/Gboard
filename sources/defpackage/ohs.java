package defpackage;

/* compiled from: PG */
/* renamed from: ohs  reason: default package */
/* loaded from: classes2.dex */
public final class ohs {
    public String a;
    public String b;
    public int c = -1;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c1, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress b(java.lang.String r16, int r17) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohs.b(java.lang.String, int):java.net.InetAddress");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int i = this.c;
        return i != -1 ? i : oht.b(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("://");
        if (this.b.indexOf(58) != -1) {
            sb.append('[');
            sb.append(this.b);
            sb.append(']');
        } else {
            sb.append(this.b);
        }
        int a = a();
        if (a != oht.b(this.a)) {
            sb.append(':');
            sb.append(a);
        }
        return sb.toString();
    }
}
