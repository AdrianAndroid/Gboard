package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: enf  reason: default package */
/* loaded from: classes.dex */
public final class enf {
    public static final enf a = new enf(true, null);
    public static final enf b = new enf(false, null);
    public final boolean c;
    public final String[] d;

    private enf(boolean z, String[] strArr) {
        this.c = z;
        this.d = strArr;
    }

    public static enf a(enf enfVar, int i) {
        String[] strArr = enfVar.d;
        return (strArr == null || strArr.length <= i) ? enfVar : i == 0 ? new enf(enfVar.c, null) : new enf(enfVar.c, (String[]) Arrays.copyOf(strArr, i));
    }

    public static enf b(String[] strArr) {
        return new enf(false, strArr);
    }

    public final String toString() {
        String[] strArr;
        StringBuilder sb = new StringBuilder(true != this.c ? "OUT" : "IN");
        if (this.d == null) {
            return sb.toString();
        }
        sb.append(" : Suggestions = [");
        for (String str : this.d) {
            sb.append(" '");
            sb.append(str);
            sb.append("'");
        }
        sb.append(" ]");
        return sb.toString();
    }
}
