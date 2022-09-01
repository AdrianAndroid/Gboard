package defpackage;

/* compiled from: PG */
/* renamed from: dim  reason: default package */
/* loaded from: classes.dex */
public final class dim {
    public final String a;
    public String[] b;
    public int[] c;
    public final djj[] d;
    public boolean e;

    public dim(String str, String[] strArr, int[] iArr, djj[] djjVarArr, boolean z) {
        this.a = str;
        this.b = strArr;
        this.c = iArr;
        this.d = djjVarArr;
        this.e = z;
    }

    public final String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = this.a;
        StringBuilder sb = new StringBuilder("{");
        String[] strArr = this.b;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        }
        sb.append("}");
        objArr[1] = sb.toString();
        StringBuilder sb2 = new StringBuilder("{");
        int[] iArr = this.c;
        if (iArr != null) {
            for (int i : iArr) {
                sb2.append(i);
                sb2.append(", ");
            }
        }
        sb2.append("}");
        objArr[2] = sb2.toString();
        objArr[3] = Boolean.valueOf(this.e);
        return String.format("text:%s, tokens:%s, languageIds:%s, isFullMatch:%b", objArr);
    }
}
