package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: lcw  reason: default package */
/* loaded from: classes.dex */
final class lcw {
    public final int[] a;
    public final lcu b;
    public lcu c;
    public int d;
    public int e;
    public int f;

    public lcw(int[] iArr) {
        this.a = iArr;
        lcu lcuVar = new lcu(-1, -1);
        this.b = lcuVar;
        this.c = lcuVar;
    }

    private final void d(lcu lcuVar, StringBuilder sb) {
        for (lcu lcuVar2 : lcuVar.d.values()) {
            sb.append("  ");
            sb.append(lcuVar);
            sb.append(" -> ");
            sb.append(lcuVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, lcuVar2.a, Math.min(iArr.length, lcuVar2.b + 1))));
            sb.append("\"]\n");
            d(lcuVar2, sb);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        lcu lcuVar = this.c.c;
        if (lcuVar != null) {
            this.c = lcuVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.e == 0) {
            return;
        }
        lcu lcuVar = (lcu) this.c.d.get(Integer.valueOf(this.a[this.d]));
        while (true) {
            int i = (lcuVar.b - lcuVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = lcuVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                lcuVar = (lcu) lcuVar.d.get(Integer.valueOf(this.a[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int min = Math.min(this.a.length, i2);
            if (min - i == Math.min(this.a.length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    int[] iArr = this.a;
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
