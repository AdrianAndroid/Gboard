package defpackage;

/* compiled from: PG */
/* renamed from: ibx  reason: default package */
/* loaded from: classes.dex */
final class ibx {
    final iam a;
    final int b;
    final long c;
    int d;

    public ibx(int i, int i2) {
        this.c = ((1 << i) - 1) << i2;
        this.a = new iam(i, i >> 1);
        this.b = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a() {
        iam iamVar = this.a;
        int i = this.d;
        this.d = i + 1;
        long j = iamVar.a[i] << this.b;
        if ((this.c & j) == j) {
            return j;
        }
        throw new lgj("Generated state exceeds its predefined range!");
    }
}
